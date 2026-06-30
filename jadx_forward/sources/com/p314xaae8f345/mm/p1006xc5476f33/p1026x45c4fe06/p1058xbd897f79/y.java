package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79;

/* loaded from: classes7.dex */
public final class y implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 f159851d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 f159852e;

    /* renamed from: f, reason: collision with root package name */
    public final int f159853f;

    /* renamed from: g, reason: collision with root package name */
    public final l81.v0 f159854g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.q f159855h;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.C11879x7c757cfc data, l81.v0 v0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.z0 z0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.z0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 config = data.f159810d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 stat = data.f159811e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stat, "stat");
        this.f159851d = config;
        this.f159852e = stat;
        this.f159853f = data.f159812f;
        this.f159854g = v0Var;
        this.f159855h = z0Var;
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.y yVar, yz5.a aVar) {
        java.lang.String str = yVar.f159851d.f128814y;
        o6Var.R.a(str == null || str.length() == 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33446xd388c2f8 : yVar.f159851d.f128814y, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.s(yVar, o6Var, aVar), null, true);
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "AppBrandHeadlessStartService.RemoteLoader-" + this.f159853f;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandHeadlessStartService.RemoteLoader", "run()-start, id:" + this.f159853f + ", appId:" + this.f159851d.f158811d + ", instanceId:" + this.f159851d.f128810w + ", sessionId:" + this.f159851d.f128809v);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = this.f159851d;
        c11809xbc286be4.f128802b2 = this.f159852e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.b(c11809xbc286be4.f158811d);
        if (b17 != null && !b17.S && !b17.L0()) {
            a(b17, this, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.r.f159838d);
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6(new yi1.a());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be42 = this.f159851d;
        android.util.SparseIntArray sparseIntArray = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb.C;
        o6Var.I0(c11809xbc286be42);
        o6Var.X0();
        o6Var.I1(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.v(o6Var, c0Var, this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.x xVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.x(c0Var, this);
        java.lang.String str = o6Var.f156336n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getAppId(...)");
        cf.m mVar = new cf.m(str);
        xVar.mo146xb9724478(mVar);
        o6Var.N.a(mVar);
    }
}
