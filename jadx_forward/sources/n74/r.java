package n74;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final n74.r f416954a = new n74.r();

    public final java.lang.Object a(java.lang.String str, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("downloadImg", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadImg", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper");
            return null;
        }
        if (j17 > 0) {
            java.lang.Object c17 = p3325xe03a0797.p3326xc267989b.a4.c(j17, new n74.h(str, null), interfaceC29045xdcb5ca57);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadImg", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper");
            return c17;
        }
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        n74.j jVar = new n74.j(rVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("downloadImgForAdLandingPages$default", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("downloadImgForAdLandingPages", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper");
        a84.m.d(str, jVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadImgForAdLandingPages", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadImgForAdLandingPages$default", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper");
        java.lang.Object j18 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadImg", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper");
        return j18;
    }

    public final void b(java.lang.String str, boolean z17, yz5.p pVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("downloadVideoForAdResource", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper");
        if (str == null || r26.n0.N(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesDownloadResourceHelper2", "downloadVideoForAdResource error!, url=" + str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadVideoForAdResource", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesDownloadResourceHelper2", "downloadVideoForAdResource, url=" + str);
        java.lang.String c17 = c();
        java.lang.String d17 = d("advideo", str);
        java.lang.String str2 = c17 + d17;
        if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesDownloadResourceHelper2", "cdn file %s is already exists", str2);
            ((ku5.t0) ku5.t0.f394148d).B(new n74.l(pVar, str2));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadVideoForAdResource", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper");
            return;
        }
        com.p314xaae8f345.mm.vfs.w6.u(c17);
        r45.jj4 h17 = m21.y.h(d17, 6, str, str, 1, 1, "");
        h17.N = true;
        if (z17) {
            ((ku5.t0) ku5.t0.f394148d).B(new n74.m(new n74.p(new java.lang.ref.WeakReference(pVar), str2), h17, c17, d17));
        } else {
            ((ku5.t0) ku5.t0.f394148d).B(new n74.o(h17, c17, d17, pVar, str2));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadVideoForAdResource", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper");
    }

    public final java.lang.String c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdDownloadResDir", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper");
        java.lang.String Bi = ((n34.q2) ((p94.e0) i95.n0.c(p94.e0.class))).Bi();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Bi, "getSnsAdLandingPagesPath(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdDownloadResDir", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper");
        return Bi;
    }

    public final java.lang.String d(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFileName", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper");
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        java.lang.String str3 = "adId_" + str + '_' + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str2.getBytes());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFileName", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper");
        return str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r18, android.widget.ImageView r19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r20) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n74.r.e(java.lang.String, android.widget.ImageView, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
