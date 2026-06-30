package androidx.fragment.app;

/* loaded from: classes2.dex */
public abstract class e2 extends androidx.viewpager.widget.a {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;

    @java.lang.Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "FragmentStatePagerAdapt";
    private final int mBehavior;
    private boolean mExecutingFinishUpdate;
    private final androidx.fragment.app.FragmentManager mFragmentManager;
    private androidx.fragment.app.i2 mCurTransaction = null;
    private java.util.ArrayList<androidx.fragment.app.Fragment.SavedState> mSavedState = new java.util.ArrayList<>();
    private java.util.ArrayList<androidx.fragment.app.Fragment> mFragments = new java.util.ArrayList<>();
    private androidx.fragment.app.Fragment mCurrentPrimaryItem = null;

    public e2(androidx.fragment.app.FragmentManager fragmentManager, int i17) {
        this.mFragmentManager = fragmentManager;
        this.mBehavior = i17;
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) obj;
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.beginTransaction();
        }
        while (this.mSavedState.size() <= i17) {
            this.mSavedState.add(null);
        }
        this.mSavedState.set(i17, fragment.isAdded() ? this.mFragmentManager.saveFragmentInstanceState(fragment) : null);
        this.mFragments.set(i17, null);
        this.mCurTransaction.j(fragment);
        if (fragment.equals(this.mCurrentPrimaryItem)) {
            this.mCurrentPrimaryItem = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void finishUpdate(android.view.ViewGroup viewGroup) {
        androidx.fragment.app.i2 i2Var = this.mCurTransaction;
        if (i2Var != null) {
            if (!this.mExecutingFinishUpdate) {
                try {
                    this.mExecutingFinishUpdate = true;
                    i2Var.g();
                } finally {
                    this.mExecutingFinishUpdate = false;
                }
            }
            this.mCurTransaction = null;
        }
    }

    public abstract androidx.fragment.app.Fragment getItem(int i17);

    @Override // androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup viewGroup, int i17) {
        androidx.fragment.app.Fragment.SavedState savedState;
        androidx.fragment.app.Fragment fragment;
        if (this.mFragments.size() > i17 && (fragment = this.mFragments.get(i17)) != null) {
            return fragment;
        }
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.beginTransaction();
        }
        androidx.fragment.app.Fragment item = getItem(i17);
        if (this.mSavedState.size() > i17 && (savedState = this.mSavedState.get(i17)) != null) {
            item.setInitialSavedState(savedState);
        }
        while (this.mFragments.size() <= i17) {
            this.mFragments.add(null);
        }
        item.setMenuVisibility(false);
        if (this.mBehavior == 0) {
            item.setUserVisibleHint(false);
        }
        this.mFragments.set(i17, item);
        this.mCurTransaction.h(viewGroup.getId(), item, null, 1);
        if (this.mBehavior == 1) {
            this.mCurTransaction.m(item, androidx.lifecycle.n.STARTED);
        }
        return item;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(android.view.View view, java.lang.Object obj) {
        return ((androidx.fragment.app.Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.a
    public void restoreState(android.os.Parcelable parcelable, java.lang.ClassLoader classLoader) {
        if (parcelable != null) {
            android.os.Bundle bundle = (android.os.Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            android.os.Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.mSavedState.clear();
            this.mFragments.clear();
            if (parcelableArray != null) {
                for (android.os.Parcelable parcelable2 : parcelableArray) {
                    this.mSavedState.add((androidx.fragment.app.Fragment.SavedState) parcelable2);
                }
            }
            for (java.lang.String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = java.lang.Integer.parseInt(str.substring(1));
                    androidx.fragment.app.Fragment fragment = this.mFragmentManager.getFragment(bundle, str);
                    if (fragment != null) {
                        while (this.mFragments.size() <= parseInt) {
                            this.mFragments.add(null);
                        }
                        fragment.setMenuVisibility(false);
                        this.mFragments.set(parseInt, fragment);
                    }
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.a
    public android.os.Parcelable saveState() {
        android.os.Bundle bundle;
        if (this.mSavedState.size() > 0) {
            bundle = new android.os.Bundle();
            androidx.fragment.app.Fragment.SavedState[] savedStateArr = new androidx.fragment.app.Fragment.SavedState[this.mSavedState.size()];
            this.mSavedState.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i17 = 0; i17 < this.mFragments.size(); i17++) {
            androidx.fragment.app.Fragment fragment = this.mFragments.get(i17);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new android.os.Bundle();
                }
                this.mFragmentManager.putFragment(bundle, "f" + i17, fragment);
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager.widget.a
    public void setPrimaryItem(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) obj;
        androidx.fragment.app.Fragment fragment2 = this.mCurrentPrimaryItem;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.mBehavior == 1) {
                    if (this.mCurTransaction == null) {
                        this.mCurTransaction = this.mFragmentManager.beginTransaction();
                    }
                    this.mCurTransaction.m(this.mCurrentPrimaryItem, androidx.lifecycle.n.STARTED);
                } else {
                    this.mCurrentPrimaryItem.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.mBehavior == 1) {
                if (this.mCurTransaction == null) {
                    this.mCurTransaction = this.mFragmentManager.beginTransaction();
                }
                this.mCurTransaction.m(fragment, androidx.lifecycle.n.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.mCurrentPrimaryItem = fragment;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void startUpdate(android.view.ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new java.lang.IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }
}
