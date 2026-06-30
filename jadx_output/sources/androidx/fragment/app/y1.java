package androidx.fragment.app;

/* loaded from: classes14.dex */
public abstract class y1 extends androidx.viewpager.widget.a {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.fragment.app.FragmentManager f11515d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11516e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.fragment.app.i2 f11517f = null;

    /* renamed from: g, reason: collision with root package name */
    public androidx.fragment.app.Fragment f11518g = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11519h;

    public y1(androidx.fragment.app.FragmentManager fragmentManager, int i17) {
        this.f11515d = fragmentManager;
        this.f11516e = i17;
    }

    public long a(int i17) {
        return i17;
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) obj;
        if (this.f11517f == null) {
            this.f11517f = this.f11515d.beginTransaction();
        }
        androidx.fragment.app.a aVar = (androidx.fragment.app.a) this.f11517f;
        aVar.getClass();
        androidx.fragment.app.FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != aVar.f11249r) {
            throw new java.lang.IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        aVar.b(new androidx.fragment.app.h2(6, fragment));
        if (fragment.equals(this.f11518g)) {
            this.f11518g = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void finishUpdate(android.view.ViewGroup viewGroup) {
        androidx.fragment.app.i2 i2Var = this.f11517f;
        if (i2Var != null) {
            if (!this.f11519h) {
                try {
                    this.f11519h = true;
                    i2Var.g();
                } finally {
                    this.f11519h = false;
                }
            }
            this.f11517f = null;
        }
    }

    public abstract androidx.fragment.app.Fragment getItem(int i17);

    @Override // androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup viewGroup, int i17) {
        androidx.fragment.app.i2 i2Var = this.f11517f;
        androidx.fragment.app.FragmentManager fragmentManager = this.f11515d;
        if (i2Var == null) {
            this.f11517f = fragmentManager.beginTransaction();
        }
        long a17 = a(i17);
        androidx.fragment.app.Fragment findFragmentByTag = fragmentManager.findFragmentByTag("android:switcher:" + viewGroup.getId() + ":" + a17);
        if (findFragmentByTag != null) {
            androidx.fragment.app.i2 i2Var2 = this.f11517f;
            i2Var2.getClass();
            i2Var2.b(new androidx.fragment.app.h2(7, findFragmentByTag));
        } else {
            findFragmentByTag = getItem(i17);
            this.f11517f.h(viewGroup.getId(), findFragmentByTag, "android:switcher:" + viewGroup.getId() + ":" + a17, 1);
        }
        if (findFragmentByTag != this.f11518g) {
            findFragmentByTag.setMenuVisibility(false);
            if (this.f11516e == 1) {
                this.f11517f.m(findFragmentByTag, androidx.lifecycle.n.STARTED);
            } else {
                findFragmentByTag.setUserVisibleHint(false);
            }
        }
        return findFragmentByTag;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(android.view.View view, java.lang.Object obj) {
        return ((androidx.fragment.app.Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.a
    public void restoreState(android.os.Parcelable parcelable, java.lang.ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.a
    public android.os.Parcelable saveState() {
        return null;
    }

    @Override // androidx.viewpager.widget.a
    public void setPrimaryItem(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) obj;
        androidx.fragment.app.Fragment fragment2 = this.f11518g;
        if (fragment != fragment2) {
            androidx.fragment.app.FragmentManager fragmentManager = this.f11515d;
            int i18 = this.f11516e;
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (i18 == 1) {
                    if (this.f11517f == null) {
                        this.f11517f = fragmentManager.beginTransaction();
                    }
                    this.f11517f.m(this.f11518g, androidx.lifecycle.n.STARTED);
                } else {
                    this.f11518g.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (i18 == 1) {
                if (this.f11517f == null) {
                    this.f11517f = fragmentManager.beginTransaction();
                }
                this.f11517f.m(fragment, androidx.lifecycle.n.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f11518g = fragment;
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
