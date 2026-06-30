package m44;

/* loaded from: classes4.dex */
public abstract class d {
    public static final void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportDecodeFailInfo", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifReporter");
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportDecodeFailInfo", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifReporter");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(2001L, 16L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdAvifReporter", "reportDecodeFailDeviceInfo, isSuccess=false, imgUrl=".concat(str));
        ca4.e0.b("ad_avif_decode_fail", str, 0, 0, "");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportDecodeFailInfo", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifReporter");
    }

    public static final void b(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportDecodeResult", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(2001L, z17 ? 12 : 13);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportDecodeResult", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifReporter");
    }

    public static final void c(boolean z17, java.lang.String str, java.lang.String scene) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportDecodeResultByKV", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifReporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportDecodeResultByKV", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifReporter");
            return;
        }
        if (str == null) {
            str = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdAvifReporter", "reportDecodeResultByKV, isSuc=false, scene=" + scene + ", url=" + str);
        ca4.e0.b("ad_avif_decode_fail", str, 0, 0, scene);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportDecodeResultByKV", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifReporter");
    }

    public static final void d(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportFileAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifReporter");
        if (str3 == null || str3.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportFileAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifReporter");
        } else {
            ((ku5.t0) ku5.t0.f394148d).q(new m44.c(str3, str, str2));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportFileAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifReporter");
        }
    }
}
