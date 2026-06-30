package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes4.dex */
public final class o extends qj1.e {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f157225f = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.m.f157195s;

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f157226e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(l75.k0 db6) {
        super(db6, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.m.f157196t, "AppBrandTestCodeVersionMarkTable", dm.j0.f319253h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        this.f157226e = db6;
    }

    public final void D0(java.lang.String appId, int i17, java.lang.String versionMd5) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(versionMd5, "versionMd5");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTestCodeVersionMarkStorage", "setVersion appId:" + appId + " versionType:" + i17 + " versionMd5:" + versionMd5);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.m mVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.m();
        mVar.f67071x28d45f97 = appId;
        mVar.f67073x94d24c6d = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n nVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n(mVar, versionMd5);
        java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
        l75.k0 k0Var = this.f157226e;
        long F = k0Var.F(valueOf);
        if (get(mVar, new java.lang.String[0])) {
            nVar.mo146xb9724478(mVar);
            super.mo9952xce0038c9(mVar, new java.lang.String[0]);
        } else {
            nVar.mo146xb9724478(mVar);
            super.mo880xb970c2b9(mVar);
        }
        k0Var.w(java.lang.Long.valueOf(F));
    }

    public final void y0(java.lang.String appId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTestCodeVersionMarkStorage", "clearVersion appId:" + appId + " versionType:" + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.m mVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.m();
        mVar.f67071x28d45f97 = appId;
        mVar.f67073x94d24c6d = i17;
        super.mo9951xb06685ab(mVar, new java.lang.String[0]);
    }

    public final java.lang.String z0(java.lang.String appId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.m mVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.m();
        mVar.f67071x28d45f97 = appId;
        mVar.f67073x94d24c6d = i17;
        java.lang.String str = get(mVar, new java.lang.String[0]) ? mVar.f67072x912ff5eb : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTestCodeVersionMarkStorage", "getVersion for appId:" + appId + ", versionType:" + i17 + ", return " + str);
        return str;
    }
}
