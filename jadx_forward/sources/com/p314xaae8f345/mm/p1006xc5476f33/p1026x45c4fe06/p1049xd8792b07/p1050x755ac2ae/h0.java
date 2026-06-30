package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae;

/* loaded from: classes7.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f159419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f159420e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59 f159421f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.z f159422g;

    public h0(l81.b1 b1Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59 c11858x835ced59, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.z zVar) {
        this.f159419d = b1Var;
        this.f159420e = str;
        this.f159421f = c11858x835ced59;
        this.f159422g = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.j jVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.j.f159837a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.g0 g0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.g0(this.f159420e, this.f159421f, this.f159422g);
        l81.b1 bundle = this.f159419d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bundle, "bundle");
        try {
            java.lang.String str = "HeadlessStart[" + bundle.f398547b + "][" + bundle.f398549c + "][" + bundle.f398559h + ']';
            jVar.c(bundle, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.f(jVar.b(str), g0Var, str));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandHeadlessStartService", th6, "headless start failed ", new java.lang.Object[0]);
            g0Var.a(-11, th6.getMessage());
        }
    }
}
