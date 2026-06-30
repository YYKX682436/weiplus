package oa;

/* loaded from: classes15.dex */
public class j implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f425319d;

    /* renamed from: e, reason: collision with root package name */
    public int f425320e;

    /* renamed from: f, reason: collision with root package name */
    public int f425321f;

    public j(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff) {
        this.f425319d = new java.lang.ref.WeakReference(c2718xca2902ff);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
        this.f425320e = this.f425321f;
        this.f425321f = i17;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) this.f425319d.get();
        if (c2718xca2902ff != null) {
            int i19 = this.f425321f;
            c2718xca2902ff.s(i17, f17, i19 != 2 || this.f425320e == 1, (i19 == 2 && this.f425320e == 0) ? false : true);
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) this.f425319d.get();
        if (c2718xca2902ff == null || c2718xca2902ff.m20352xe06bcb0d() == i17 || i17 >= c2718xca2902ff.m20353x443e53f0()) {
            return;
        }
        int i18 = this.f425321f;
        c2718xca2902ff.q(c2718xca2902ff.k(i17), i18 == 0 || (i18 == 2 && this.f425320e == 0));
    }
}
