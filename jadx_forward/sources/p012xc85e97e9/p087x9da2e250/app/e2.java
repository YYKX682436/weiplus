package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes2.dex */
public abstract class e2 extends p012xc85e97e9.p114xa324943e.p115xd1075a44.a {

    /* renamed from: BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT */
    public static final int f3522x925996e4 = 1;

    /* renamed from: BEHAVIOR_SET_USER_VISIBLE_HINT */
    @java.lang.Deprecated
    public static final int f3523xcaad155e = 0;

    /* renamed from: DEBUG */
    private static final boolean f3524x3de9e33 = false;
    private static final java.lang.String TAG = "FragmentStatePagerAdapt";

    /* renamed from: mBehavior */
    private final int f3525x7f0c59df;

    /* renamed from: mExecutingFinishUpdate */
    private boolean f3528xe7d00e1;

    /* renamed from: mFragmentManager */
    private final p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d f3529xccc8bb10;

    /* renamed from: mCurTransaction */
    private p012xc85e97e9.p087x9da2e250.app.i2 f3526xb1801a4b = null;

    /* renamed from: mSavedState */
    private java.util.ArrayList<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670.SavedState> f3531x372a5a97 = new java.util.ArrayList<>();

    /* renamed from: mFragments */
    private java.util.ArrayList<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> f3530x9170b236 = new java.util.ArrayList<>();

    /* renamed from: mCurrentPrimaryItem */
    private p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f3527x9d017c49 = null;

    public e2(p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d, int i17) {
        this.f3529xccc8bb10 = abstractC1104xc1ad431d;
        this.f3525x7f0c59df = i17;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: destroyItem */
    public void mo7741x89d2022d(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) obj;
        if (this.f3526xb1801a4b == null) {
            this.f3526xb1801a4b = this.f3529xccc8bb10.m7630xb2c12e75();
        }
        while (this.f3531x372a5a97.size() <= i17) {
            this.f3531x372a5a97.add(null);
        }
        this.f3531x372a5a97.set(i17, componentCallbacksC1101xa17d4670.m7481x7a6e8df6() ? this.f3529xccc8bb10.m7720xe844b30f(componentCallbacksC1101xa17d4670) : null);
        this.f3530x9170b236.set(i17, null);
        this.f3526xb1801a4b.j(componentCallbacksC1101xa17d4670);
        if (componentCallbacksC1101xa17d4670.m7427xb2c87fbf(this.f3527x9d017c49)) {
            this.f3527x9d017c49 = null;
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: finishUpdate */
    public void mo7742xa949b73c(android.view.ViewGroup viewGroup) {
        p012xc85e97e9.p087x9da2e250.app.i2 i2Var = this.f3526xb1801a4b;
        if (i2Var != null) {
            if (!this.f3528xe7d00e1) {
                try {
                    this.f3528xe7d00e1 = true;
                    i2Var.g();
                } finally {
                    this.f3528xe7d00e1 = false;
                }
            }
            this.f3526xb1801a4b = null;
        }
    }

    /* renamed from: getItem */
    public abstract p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 mo7743xfb80e389(int i17);

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: instantiateItem */
    public java.lang.Object mo7744x8d1aed1d(android.view.ViewGroup viewGroup, int i17) {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670.SavedState savedState;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670;
        if (this.f3530x9170b236.size() > i17 && (componentCallbacksC1101xa17d4670 = this.f3530x9170b236.get(i17)) != null) {
            return componentCallbacksC1101xa17d4670;
        }
        if (this.f3526xb1801a4b == null) {
            this.f3526xb1801a4b = this.f3529xccc8bb10.m7630xb2c12e75();
        }
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 mo7743xfb80e389 = mo7743xfb80e389(i17);
        if (this.f3531x372a5a97.size() > i17 && (savedState = this.f3531x372a5a97.get(i17)) != null) {
            mo7743xfb80e389.m7570xc4f4e46c(savedState);
        }
        while (this.f3530x9170b236.size() <= i17) {
            this.f3530x9170b236.add(null);
        }
        mo7743xfb80e389.m7571x41119ed3(false);
        if (this.f3525x7f0c59df == 0) {
            mo7743xfb80e389.mo7583x951b248c(false);
        }
        this.f3530x9170b236.set(i17, mo7743xfb80e389);
        this.f3526xb1801a4b.h(viewGroup.getId(), mo7743xfb80e389, null, 1);
        if (this.f3525x7f0c59df == 1) {
            this.f3526xb1801a4b.m(mo7743xfb80e389, p012xc85e97e9.p093xedfae76a.n.STARTED);
        }
        return mo7743xfb80e389;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: isViewFromObject */
    public boolean mo7745xc5a713d8(android.view.View view, java.lang.Object obj) {
        return ((p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) obj).m7474xfb86a31b() == view;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: restoreState */
    public void mo7746x61a06aa3(android.os.Parcelable parcelable, java.lang.ClassLoader classLoader) {
        if (parcelable != null) {
            android.os.Bundle bundle = (android.os.Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            android.os.Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f3531x372a5a97.clear();
            this.f3530x9170b236.clear();
            if (parcelableArray != null) {
                for (android.os.Parcelable parcelable2 : parcelableArray) {
                    this.f3531x372a5a97.add((p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670.SavedState) parcelable2);
                }
            }
            for (java.lang.String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = java.lang.Integer.parseInt(str.substring(1));
                    p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7672x197d1fc6 = this.f3529xccc8bb10.m7672x197d1fc6(bundle, str);
                    if (m7672x197d1fc6 != null) {
                        while (this.f3530x9170b236.size() <= parseInt) {
                            this.f3530x9170b236.add(null);
                        }
                        m7672x197d1fc6.m7571x41119ed3(false);
                        this.f3530x9170b236.set(parseInt, m7672x197d1fc6);
                    }
                }
            }
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: saveState */
    public android.os.Parcelable mo7747xa507914() {
        android.os.Bundle bundle;
        if (this.f3531x372a5a97.size() > 0) {
            bundle = new android.os.Bundle();
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670.SavedState[] savedStateArr = new p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670.SavedState[this.f3531x372a5a97.size()];
            this.f3531x372a5a97.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i17 = 0; i17 < this.f3530x9170b236.size(); i17++) {
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f3530x9170b236.get(i17);
            if (componentCallbacksC1101xa17d4670 != null && componentCallbacksC1101xa17d4670.m7481x7a6e8df6()) {
                if (bundle == null) {
                    bundle = new android.os.Bundle();
                }
                this.f3529xccc8bb10.m7709x9a1e7a7f(bundle, "f" + i17, componentCallbacksC1101xa17d4670);
            }
        }
        return bundle;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: setPrimaryItem */
    public void mo7748x3c80e673(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) obj;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702 = this.f3527x9d017c49;
        if (componentCallbacksC1101xa17d4670 != componentCallbacksC1101xa17d46702) {
            if (componentCallbacksC1101xa17d46702 != null) {
                componentCallbacksC1101xa17d46702.m7571x41119ed3(false);
                if (this.f3525x7f0c59df == 1) {
                    if (this.f3526xb1801a4b == null) {
                        this.f3526xb1801a4b = this.f3529xccc8bb10.m7630xb2c12e75();
                    }
                    this.f3526xb1801a4b.m(this.f3527x9d017c49, p012xc85e97e9.p093xedfae76a.n.STARTED);
                } else {
                    this.f3527x9d017c49.mo7583x951b248c(false);
                }
            }
            componentCallbacksC1101xa17d4670.m7571x41119ed3(true);
            if (this.f3525x7f0c59df == 1) {
                if (this.f3526xb1801a4b == null) {
                    this.f3526xb1801a4b = this.f3529xccc8bb10.m7630xb2c12e75();
                }
                this.f3526xb1801a4b.m(componentCallbacksC1101xa17d4670, p012xc85e97e9.p093xedfae76a.n.RESUMED);
            } else {
                componentCallbacksC1101xa17d4670.mo7583x951b248c(true);
            }
            this.f3527x9d017c49 = componentCallbacksC1101xa17d4670;
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: startUpdate */
    public void mo7749x93ef97cb(android.view.ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new java.lang.IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }
}
