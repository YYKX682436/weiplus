package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f;

/* loaded from: classes7.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.z f165537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f165538e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f165539f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f165540g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f165541h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n f165542i;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.z zVar, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        this.f165542i = nVar;
        this.f165537d = zVar;
        this.f165538e = str;
        this.f165539f = str2;
        this.f165540g = i17;
        this.f165541h = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.z zVar = this.f165537d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.a0 a0Var = zVar != null ? new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.a0() : null;
        if (a0Var != null) {
            a0Var.f165497a = java.lang.System.currentTimeMillis();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n nVar = this.f165542i;
        if (nVar.f165553e == null) {
            nVar.f165553e = new com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5130x9c70410d();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJ2V8Context", "nativeCreateRuntime triggered by subscribeHandler");
            nVar.f165553e.mo43186xe258f33c(nVar.L(), nVar.G());
        }
        com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5130x9c70410d c5130x9c70410d = nVar.f165553e;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str = this.f165538e;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = this.f165539f;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = this.f165541h;
        c5130x9c70410d.mo43193xc5c86aa0(str, str2, this.f165540g, str3 != null ? str3 : "");
        if (a0Var != null) {
            a0Var.f165498b = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.f9 f9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.f9) zVar;
            f9Var.getClass();
            java.lang.Long valueOf = java.lang.Long.valueOf(a0Var.f165498b - a0Var.f165497a);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = f9Var.f159582b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandService", "injectConfig end by AddonDirectEvaluation, cost=%dms, hash=%d", valueOf, java.lang.Integer.valueOf(e9Var.mo50260x9f1221c2()));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.k9 k9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.k9(null);
            e9Var.f159531J = k9Var;
            k9Var.f165603a = f9Var.f159581a;
            k9Var.f165604b = a0Var.f165497a;
            k9Var.f165605c = a0Var.f165498b;
            k9Var.f165606d = a0Var;
        }
    }
}
