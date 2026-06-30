package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class q2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.s2 f164384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f164385e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164386f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f164387g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f164388h;

    public q2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.s2 s2Var, android.app.Activity activity, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f164384d = s2Var;
        this.f164385e = activity;
        this.f164386f = str;
        this.f164387g = lVar;
        this.f164388h = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.s2 s2Var = this.f164384d;
        s2Var.getClass();
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2 c10754x630c9a2 = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2) uk0.a.d(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(this.f164386f), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l2.f162895a);
        java.lang.Integer valueOf = c10754x630c9a2 != null ? java.lang.Integer.valueOf(c10754x630c9a2.f149937d) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiAddImageToFavorites", "doFavoriteAnyProcess, result: " + valueOf);
        int intValue = valueOf != null ? valueOf.intValue() : Integer.MIN_VALUE;
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p2(intValue, this.f164385e));
        boolean z17 = intValue == 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiAddImageToFavorites", "invoke, success: " + z17);
        this.f164387g.a(this.f164388h, s2Var.o(z17 ? "ok" : "fail"));
    }
}
