package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* renamed from: com.tencent.mm.plugin.appbrand.if, reason: invalid class name */
/* loaded from: classes7.dex */
public class Cif implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f159876d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f159877e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f159878f;

    public Cif(java.lang.String str, int i17, java.lang.String str2) {
        this.f159876d = str;
        this.f159877e = i17;
        this.f159878f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SinglePageModeLogic", "cleanData");
        v81.e eVar = (v81.e) i95.n0.c(v81.e.class);
        java.lang.String str = this.f159876d;
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2.l(kk.v.a(eVar.Z3(str)), str).mo49676x192e2029();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SinglePageModeLogic", "clean SinglePageNotFlattern appId=%s e=%s", str, e17);
        }
        int i17 = this.f159877e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SinglePageModeLogic", "cleanStorage scheme:%d", java.lang.Integer.valueOf(i17));
        boolean a17 = k91.z0.a(i17);
        java.lang.String str2 = this.f159878f;
        if (a17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43.b) ((oe.a) nd.f.a(oe.a.class))).b(str, i17, str2).k(2, str);
        } else if (i17 == 3) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43.b) ((oe.a) nd.f.a(oe.a.class))).b(str, i17, str2).k(2, str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12243x1ec17c24 c12243x1ec17c24 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12243x1ec17c24();
            c12243x1ec17c24.f164876f = str;
            c12243x1ec17c24.f164877g = 2;
            c12243x1ec17c24.s();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12243x1ec17c24 c12243x1ec17c242 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12243x1ec17c24();
            c12243x1ec17c242.f164876f = str;
            c12243x1ec17c242.f164877g = 2;
            c12243x1ec17c242.s();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SinglePageModeLogic", "cleanData done");
    }
}
