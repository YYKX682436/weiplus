package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public abstract class y1 extends p012xc85e97e9.p114xa324943e.p115xd1075a44.a {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d f93048d;

    /* renamed from: e, reason: collision with root package name */
    public final int f93049e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p087x9da2e250.app.i2 f93050f = null;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f93051g = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f93052h;

    public y1(p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d, int i17) {
        this.f93048d = abstractC1104xc1ad431d;
        this.f93049e = i17;
    }

    public long a(int i17) {
        return i17;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: destroyItem */
    public void mo7741x89d2022d(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) obj;
        if (this.f93050f == null) {
            this.f93050f = this.f93048d.m7630xb2c12e75();
        }
        p012xc85e97e9.p087x9da2e250.app.a aVar = (p012xc85e97e9.p087x9da2e250.app.a) this.f93050f;
        aVar.getClass();
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d = componentCallbacksC1101xa17d4670.f3427xccc8bb10;
        if (abstractC1104xc1ad431d != null && abstractC1104xc1ad431d != aVar.f92782r) {
            throw new java.lang.IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + componentCallbacksC1101xa17d4670.mo7591x9616526c() + " is already attached to a FragmentManager.");
        }
        aVar.b(new p012xc85e97e9.p087x9da2e250.app.h2(6, componentCallbacksC1101xa17d4670));
        if (componentCallbacksC1101xa17d4670.m7427xb2c87fbf(this.f93051g)) {
            this.f93051g = null;
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: finishUpdate */
    public void mo7742xa949b73c(android.view.ViewGroup viewGroup) {
        p012xc85e97e9.p087x9da2e250.app.i2 i2Var = this.f93050f;
        if (i2Var != null) {
            if (!this.f93052h) {
                try {
                    this.f93052h = true;
                    i2Var.g();
                } finally {
                    this.f93052h = false;
                }
            }
            this.f93050f = null;
        }
    }

    /* renamed from: getItem */
    public abstract p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 mo7764xfb80e389(int i17);

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: instantiateItem */
    public java.lang.Object mo7744x8d1aed1d(android.view.ViewGroup viewGroup, int i17) {
        p012xc85e97e9.p087x9da2e250.app.i2 i2Var = this.f93050f;
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d = this.f93048d;
        if (i2Var == null) {
            this.f93050f = abstractC1104xc1ad431d.m7630xb2c12e75();
        }
        long a17 = a(i17);
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7665x7a44761a = abstractC1104xc1ad431d.m7665x7a44761a("android:switcher:" + viewGroup.getId() + ":" + a17);
        if (m7665x7a44761a != null) {
            p012xc85e97e9.p087x9da2e250.app.i2 i2Var2 = this.f93050f;
            i2Var2.getClass();
            i2Var2.b(new p012xc85e97e9.p087x9da2e250.app.h2(7, m7665x7a44761a));
        } else {
            m7665x7a44761a = mo7764xfb80e389(i17);
            this.f93050f.h(viewGroup.getId(), m7665x7a44761a, "android:switcher:" + viewGroup.getId() + ":" + a17, 1);
        }
        if (m7665x7a44761a != this.f93051g) {
            m7665x7a44761a.m7571x41119ed3(false);
            if (this.f93049e == 1) {
                this.f93050f.m(m7665x7a44761a, p012xc85e97e9.p093xedfae76a.n.STARTED);
            } else {
                m7665x7a44761a.mo7583x951b248c(false);
            }
        }
        return m7665x7a44761a;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: isViewFromObject */
    public boolean mo7745xc5a713d8(android.view.View view, java.lang.Object obj) {
        return ((p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) obj).m7474xfb86a31b() == view;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: restoreState */
    public void mo7746x61a06aa3(android.os.Parcelable parcelable, java.lang.ClassLoader classLoader) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: saveState */
    public android.os.Parcelable mo7747xa507914() {
        return null;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: setPrimaryItem */
    public void mo7748x3c80e673(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) obj;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702 = this.f93051g;
        if (componentCallbacksC1101xa17d4670 != componentCallbacksC1101xa17d46702) {
            p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d = this.f93048d;
            int i18 = this.f93049e;
            if (componentCallbacksC1101xa17d46702 != null) {
                componentCallbacksC1101xa17d46702.m7571x41119ed3(false);
                if (i18 == 1) {
                    if (this.f93050f == null) {
                        this.f93050f = abstractC1104xc1ad431d.m7630xb2c12e75();
                    }
                    this.f93050f.m(this.f93051g, p012xc85e97e9.p093xedfae76a.n.STARTED);
                } else {
                    this.f93051g.mo7583x951b248c(false);
                }
            }
            componentCallbacksC1101xa17d4670.m7571x41119ed3(true);
            if (i18 == 1) {
                if (this.f93050f == null) {
                    this.f93050f = abstractC1104xc1ad431d.m7630xb2c12e75();
                }
                this.f93050f.m(componentCallbacksC1101xa17d4670, p012xc85e97e9.p093xedfae76a.n.RESUMED);
            } else {
                componentCallbacksC1101xa17d4670.mo7583x951b248c(true);
            }
            this.f93051g = componentCallbacksC1101xa17d4670;
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
