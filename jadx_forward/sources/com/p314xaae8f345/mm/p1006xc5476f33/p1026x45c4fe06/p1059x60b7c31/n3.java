package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes4.dex */
public final class n3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o3 f163897d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f163898e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f163899f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f163900g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f163901h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f163902i;

    public n3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o3 o3Var, android.app.Activity activity, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f163897d = o3Var;
        this.f163898e = activity;
        this.f163899f = str;
        this.f163900g = str2;
        this.f163901h = lVar;
        this.f163902i = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o3 o3Var = this.f163897d;
        o3Var.getClass();
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2 c10754x630c9a2 = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2) uk0.a.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11916x53edea60(this.f163899f, this.f163900g), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i3.f162837a);
        java.lang.Integer valueOf = c10754x630c9a2 != null ? java.lang.Integer.valueOf(c10754x630c9a2.f149937d) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "doFavoriteAnyProcess, result: " + valueOf);
        int intValue = valueOf != null ? valueOf.intValue() : Integer.MIN_VALUE;
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m3(intValue, this.f163898e));
        boolean z17 = intValue == 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "invoke, success: " + z17);
        this.f163901h.a(this.f163902i, o3Var.o(z17 ? "ok" : "fail"));
    }
}
