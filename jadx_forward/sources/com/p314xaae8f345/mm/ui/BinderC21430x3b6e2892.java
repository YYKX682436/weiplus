package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.PhotoEditProxy */
/* loaded from: classes10.dex */
public class BinderC21430x3b6e2892 extends k55.b {
    public BinderC21430x3b6e2892(k55.k kVar) {
        super(kVar);
    }

    /* renamed from: doFav */
    public int m78797x5b4b690(java.lang.String str) {
        return ((java.lang.Integer) m142014x6c2fab7("doFavInMM", str)).intValue();
    }

    @k55.m
    /* renamed from: doFavInMM */
    public int m78798x1879c435(java.lang.String str) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b2) ((o72.c5) i95.n0.c(o72.c5.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.g(c5303xc75d2f73, 2, str);
        c5303xc75d2f73.f135623g.f87860m = 44;
        c5303xc75d2f73.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhotoEditProxy", "[doFavInMM] path:%s", str);
        return c5303xc75d2f73.f135624h.f87966a;
    }

    /* renamed from: getFullPath */
    public java.lang.String m78799xcb2e58ca(java.lang.String str) {
        return (java.lang.String) m142014x6c2fab7("getFullPathInMM", str);
    }

    @k55.m
    /* renamed from: getFullPathInMM */
    public java.lang.String m78800x6783b96f(java.lang.String str) {
        return ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).Zi(null, bm5.f0.f104094f, str);
    }

    /* renamed from: getSelfUsername */
    public java.lang.String m78801xaa3e42b8() {
        return (java.lang.String) m142014x6c2fab7("getSelfUsernameInMM", new java.lang.Object[0]);
    }

    @k55.m
    /* renamed from: getSelfUsernameInMM */
    public java.lang.String m78802x790fc5d() {
        return c01.z1.r();
    }

    /* renamed from: isAutoSave */
    public boolean m78803x26784b16() {
        return ((java.lang.Boolean) m142014x6c2fab7("isAutoSavePhotoInMM", new java.lang.Object[0])).booleanValue();
    }

    @k55.m
    /* renamed from: isAutoSavePhotoInMM */
    public boolean m78804x67dd9861() {
        return gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN, true);
    }

    /* renamed from: recordImage */
    public void m78805x4d4d578a(java.lang.String str, java.lang.String str2, long j17, java.lang.String str3, java.lang.String str4) {
        m142014x6c2fab7("recordImageInMM", str, str2, java.lang.Long.valueOf(j17), str3, str4);
    }

    @k55.m
    /* renamed from: recordImageInMM */
    public void m78806xb085582f(java.lang.String str, java.lang.String str2, long j17, java.lang.String str3, java.lang.String str4) {
    }

    /* renamed from: recordVideo */
    public void m78807x4e02c2aa(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        m142014x6c2fab7("recordVideoInMM", str, str2, str3, str4);
    }

    @k55.m
    /* renamed from: recordVideoInMM */
    public void m78808x3450334f(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
    }

    /* renamed from: sendImage */
    public void m78809x5e5eb3(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        m142014x6c2fab7("sendImageInMM", str, str2, str3, str4);
    }

    @k55.m
    /* renamed from: sendImageInMM */
    public void m78810xd7fca2d8(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        k70.i0 i0Var = new k70.i0();
        i0Var.f386175a = 4;
        java.lang.String r17 = c01.z1.r();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        r70.g gVar = new r70.g(str2, 0, r17 == null ? "" : r17, str4 == null ? "" : str4, i0Var);
        gVar.f474641j = "photo_edit_send_img";
        ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).nj(gVar);
        ((dk5.s5) tg3.t1.a()).Ui(str, str4);
    }
}
