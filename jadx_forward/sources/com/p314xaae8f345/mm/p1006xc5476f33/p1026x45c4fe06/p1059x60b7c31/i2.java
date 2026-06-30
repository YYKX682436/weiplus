package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j2 f162830d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f162831e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162832f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162833g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162834h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f162835i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f162836m;

    public i2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j2 j2Var, android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f162830d = j2Var;
        this.f162831e = activity;
        this.f162832f = str;
        this.f162833g = str2;
        this.f162834h = str3;
        this.f162835i = lVar;
        this.f162836m = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j2 j2Var = this.f162830d;
        j2Var.getClass();
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2 c10754x630c9a2 = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2) uk0.a.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11912xd50a0c01(this.f162832f, this.f162833g, this.f162834h), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d2.f162267a);
        java.lang.Integer valueOf = c10754x630c9a2 != null ? java.lang.Integer.valueOf(c10754x630c9a2.f149937d) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiAddFileToFavorites", "doFavoriteAnyProcess, result: " + valueOf);
        int intValue = valueOf != null ? valueOf.intValue() : Integer.MIN_VALUE;
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.h2(intValue, this.f162831e));
        boolean z17 = intValue == 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiAddFileToFavorites", "invoke, success: " + z17);
        this.f162835i.a(this.f162836m, j2Var.o(z17 ? "ok" : "fail"));
    }
}
