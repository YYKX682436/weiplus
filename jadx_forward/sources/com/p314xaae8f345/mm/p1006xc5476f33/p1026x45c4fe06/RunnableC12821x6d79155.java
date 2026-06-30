package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* renamed from: com.tencent.mm.plugin.appbrand.ye$$a */
/* loaded from: classes7.dex */
public final /* synthetic */ class RunnableC12821x6d79155 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f173958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wg1.b f173959e;

    public /* synthetic */ RunnableC12821x6d79155(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, wg1.b bVar) {
        this.f173958d = o6Var;
        this.f173959e = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f173958d;
        final wg1.b bVar = this.f173959e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc a17 = k91.h0.a(o6Var.u0());
        a17.d();
        a17.M = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1141xc84c5534.C12376xdd2459a1(o6Var.u0().f158831k2.f169667d, wg1.b.f527244d.h());
        if (wg1.b.f527250m == bVar) {
            o6Var.S1();
            o6Var.N.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.cf(o6Var));
        }
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12330xa378a092(o6Var.f156328d, a17, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o0() { // from class: com.tencent.mm.plugin.appbrand.ye$$b
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o0
            public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6.this;
                wg1.b bVar2 = bVar;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.RuntimeRestartHelper", "showRestartPromptForAttrAsyncUpdated AppBrandPreInitTask callback %s", c11809xbc286be4);
                if (c11809xbc286be4 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.RuntimeRestartHelper", "showRestartPromptForAttrAsyncUpdated preInitTask callback with null config, appId:%s", o6Var2.f156336n);
                    o6Var2.l0();
                } else {
                    if (o6Var2.S || o6Var2.L0()) {
                        return;
                    }
                    c11809xbc286be4.f128802b2 = c12559xbdae8559;
                    if (wg1.b.f527250m == bVar2) {
                        c11809xbc286be4.f158824t = true;
                    }
                    o6Var2.m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ze(o6Var2, bVar2, c11809xbc286be4));
                }
            }
        }).G(true).I();
    }
}
