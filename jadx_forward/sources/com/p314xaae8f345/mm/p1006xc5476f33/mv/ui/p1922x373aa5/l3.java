package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes15.dex */
public final class l3 implements com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.j3 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.m3 f233424a;

    /* renamed from: b, reason: collision with root package name */
    public final float f233425b;

    /* renamed from: c, reason: collision with root package name */
    public final long f233426c;

    /* renamed from: d, reason: collision with root package name */
    public int f233427d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f233428e;

    public l3(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.m3 viewProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewProvider, "viewProvider");
        this.f233424a = viewProvider;
        this.f233425b = 200.0f;
        this.f233426c = 5000L;
        this.f233428e = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.k3(this);
    }

    public void a() {
        this.f233427d = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.m3 m3Var = this.f233424a;
        ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.n3) m3Var).f233443a.removeCallbacks(this.f233428e);
        ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.n3) m3Var).f233443a.f233239i.forceFinished(true);
        ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.n3) m3Var).f233443a.scrollTo(0, 0);
    }
}
