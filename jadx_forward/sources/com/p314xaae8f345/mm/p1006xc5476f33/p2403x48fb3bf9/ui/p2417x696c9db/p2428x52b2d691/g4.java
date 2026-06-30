package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes11.dex */
public final class g4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f267638d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267639e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f267640f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f267641g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f267642h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f267643i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f267644m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267645n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267646o;

    public g4(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, java.lang.String str, int i17, int i18, int i19, boolean z17, boolean z18, nw4.k kVar, nw4.y2 y2Var) {
        this.f267638d = u3Var;
        this.f267639e = str;
        this.f267640f = i17;
        this.f267641g = i18;
        this.f267642h = i19;
        this.f267643i = z17;
        this.f267644m = z18;
        this.f267645n = kVar;
        this.f267646o = y2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f267638d.dismiss();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5299x1312af17 c5299x1312af17 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5299x1312af17();
        java.lang.String str = this.f267639e;
        am.a4 a4Var = c5299x1312af17.f135621g;
        a4Var.f87654a = str;
        a4Var.f87655b = this.f267640f;
        a4Var.f87656c = this.f267641g;
        a4Var.f87657d = this.f267642h;
        a4Var.f87658e = this.f267643i;
        boolean z17 = this.f267644m;
        a4Var.f87659f = z17;
        c5299x1312af17.e();
        nw4.k kVar = this.f267645n;
        nw4.y2 y2Var = this.f267646o;
        if (z17) {
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", null);
            return;
        }
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
    }
}
