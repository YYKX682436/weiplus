package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class t1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f170493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l81.v0 f170494e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(int i17, l81.v0 v0Var) {
        super(3);
        this.f170493d = i17;
        this.f170494e = v0Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 config = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 stat = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stat, "stat");
        int i17 = this.f170493d;
        if (kVar == null || (str = kVar.i()) == null) {
            str = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274591f;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        l81.v0 v0Var = this.f170494e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPreRenderColdStartService", "bindRemoteService id:" + i17 + ", appId:" + config.f158811d + ", remoteProcessName:" + str);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.r1 r1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.r1(str, i17, atomicBoolean, v0Var);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.a(str, r1Var);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11540x7c757cfc(config, stat, i17), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1.f167841d.getClass(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.q1(i17, v0Var, atomicBoolean, str, r1Var));
        return jz5.f0.f384359a;
    }
}
