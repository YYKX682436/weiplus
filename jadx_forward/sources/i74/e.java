package i74;

/* loaded from: classes4.dex */
public abstract class e {
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        if (r26.n0.B(r4, r5, false) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 r10) {
        /*
            java.lang.String r0 = "getOpenPersonalizedUrl"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackHelper"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            r2 = 0
            if (r10 != 0) goto Le
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r2
        Le:
            gm0.m r3 = gm0.j1.b()
            gm0.j r3 = r3.d()
            gm0.j r4 = gm0.j.WeiXin
            java.lang.Class<e42.e0> r5 = e42.e0.class
            r6 = 0
            r7 = 1
            if (r3 != r4) goto L30
            i95.m r3 = i95.n0.c(r5)
            e42.e0 r3 = (e42.e0) r3
            e42.d0 r4 = e42.d0.clicfg_cn_admanage_url_android
            h62.d r3 = (h62.d) r3
            java.lang.String r5 = "https://ads.privacy.qq.com/ads/wxoptout.html?media_source=101001"
            java.lang.String r3 = r3.Zi(r4, r5, r7)
            goto L81
        L30:
            i95.m r3 = i95.n0.c(r5)
            e42.e0 r3 = (e42.e0) r3
            e42.d0 r4 = e42.d0.clicfg_oversea_admanage_url_android
            h62.d r3 = (h62.d) r3
            java.lang.String r8 = ""
            java.lang.String r3 = r3.Zi(r4, r8, r7)
            i95.m r4 = i95.n0.c(r5)
            e42.e0 r4 = (e42.e0) r4
            e42.d0 r5 = e42.d0.clicfg_oversea_admanage_close_country_android
            h62.d r4 = (h62.d) r4
            java.lang.String r4 = r4.Zi(r5, r8, r7)
            gm0.b0 r5 = gm0.j1.u()
            com.tencent.mm.storage.n3 r5 = r5.c()
            r9 = 274436(0x43004, float:3.84567E-40)
            java.lang.String r5 = r5.u(r9, r8)
            boolean r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r3)
            if (r8 != 0) goto L80
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r4)
            java.lang.String r4 = r4.toLowerCase()
            java.lang.String r8 = "toLowerCase(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r8)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r5)
            java.lang.String r5 = r5.toLowerCase()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r8)
            boolean r4 = r26.n0.B(r4, r5, r6)
            if (r4 == 0) goto L81
        L80:
            r3 = r2
        L81:
            if (r3 == 0) goto L8c
            int r4 = r3.length()
            if (r4 != 0) goto L8a
            goto L8c
        L8a:
            r4 = r6
            goto L8d
        L8c:
            r4 = r7
        L8d:
            if (r4 != 0) goto L9b
            java.lang.String r4 = "http"
            r5 = 2
            boolean r4 = r26.i0.A(r3, r4, r6, r5, r2)
            if (r4 != 0) goto L9a
            goto L9b
        L9a:
            r2 = r3
        L9b:
            if (r2 == 0) goto La9
            int r3 = r2.length()
            if (r3 <= 0) goto La5
            r3 = r7
            goto La6
        La5:
            r3 = r6
        La6:
            if (r3 != r7) goto La9
            r6 = r7
        La9:
            if (r6 == 0) goto Lc3
            java.lang.String r10 = r10.f38104xce64ddf1
            java.lang.String r3 = "UTF-8"
            java.lang.String r10 = java.net.URLEncoder.encode(r10, r3)
            java.lang.String r3 = "from"
            java.lang.String r4 = "sns"
            java.lang.String r2 = ca4.z0.d(r2, r3, r4)
            java.lang.String r3 = "uxinfo"
            java.lang.String r2 = ca4.z0.d(r2, r3, r10)
        Lc3:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i74.e.a(com.tencent.mm.plugin.sns.storage.ADInfo):java.lang.String");
    }
}
