package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585;

/* loaded from: classes7.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cf.d f170737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.y f170738e;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.y yVar, cf.d dVar) {
        this.f170738e = yVar;
        this.f170737d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.y yVar = this.f170738e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.i(yVar.f170749d, yVar.f170750e, yVar.f170751f);
        } catch (java.lang.Exception e17) {
            boolean equals = "1".equals(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_android_appbrand_preload_service_catch, "1", true));
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.e4.g() && !equals) {
                throw e17;
            }
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (z65.c.a()) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.v(this, e17));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "preLoadServices error:" + e17);
            }
        }
        this.f170737d.a();
    }
}
