package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes7.dex */
public class l0 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 f156698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f156699e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f156700f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.C12596x96aa9e2c f156701g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6 f156702h;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 x0Var, boolean z17, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.C12596x96aa9e2c c12596x96aa9e2c, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6 x6Var) {
        this.f156698d = x0Var;
        this.f156699e = z17;
        this.f156700f = i17;
        this.f156701g = c12596x96aa9e2c;
        this.f156702h = x6Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.o0.f156738c = true;
        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.o0.f156737b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessProfileInit[applaunch][PreloadProfile][preload]", "start misc preload type[%s], aggressive[%b], reason[%s], skip[%b], level[%d]", this.f156698d, java.lang.Boolean.valueOf(this.f156699e), (java.lang.String) obj, java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f156700f));
        if (!z17) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.f.a();
                if (this.f156699e) {
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.b(this.f156698d)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.j(this.f156698d, null, true, this.f156701g, this.f156702h, this.f156700f);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.o0.a("preload aggressive before keepalive");
                    if (bm5.f1.a().equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.z0.f170755n)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1131x97eed868.j.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.RunnableC11641x608481d());
                    }
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.j(this.f156698d, null, false, this.f156701g, this.f156702h, this.f156700f);
                }
            } catch (java.lang.Exception e17) {
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6.f167695n3) {
                    throw e17;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandProcessProfileInit[applaunch][PreloadProfile][preload]", e17, "Preload [%s] in IdleHandler encountered Exception", this.f156698d.name());
            }
        }
        return 0;
    }
}
