package k84;

/* loaded from: classes4.dex */
public final class e6 {

    /* renamed from: a, reason: collision with root package name */
    public k84.c6 f386556a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f386557b;

    public e6(int i17) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        if (r1.m70412xa290b704() == true) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.app.Activity r14, android.view.View r15, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 r16, i64.b1 r17, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i r18, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder r19) {
        /*
            r13 = this;
            r0 = r13
            r1 = r14
            r2 = r16
            java.lang.String r3 = "bindAdSocialPatComponent"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatLogic"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r3, r4)
            if (r2 != 0) goto L11
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r3, r4)
            return
        L11:
            k84.c6 r5 = r0.f386556a
            java.lang.String r6 = "AdSocialPatLogic"
            if (r5 != 0) goto L3c
            boolean r5 = r16.m70404x7b40c91c()
            if (r5 == 0) goto L3c
            kotlin.jvm.internal.h0 r8 = new kotlin.jvm.internal.h0
            r8.<init>()
            boolean r5 = r1 instanceof p012xc85e97e9.p093xedfae76a.y
            if (r5 == 0) goto L28
            r8.f391656d = r1
        L28:
            k84.d6 r1 = new k84.d6
            r7 = r1
            r9 = r15
            r10 = r17
            r11 = r18
            r12 = r19
            r7.<init>(r8, r9, r10, r11, r12)
            r0.f386556a = r1
            java.lang.String r1 = "create ad social pat component"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r1)
        L3c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "refresh ad social pat component, oldSnsId is "
            r1.<init>(r5)
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r0.f386557b
            if (r5 == 0) goto L4b
            long r7 = r5.f68891x29d1292e
            goto L4d
        L4b:
            r7 = 0
        L4d:
            java.lang.String r5 = ca4.z0.t0(r7)
            r1.append(r5)
            java.lang.String r5 = ", newSnsId is "
            r1.append(r5)
            long r7 = r2.f68891x29d1292e
            java.lang.String r5 = ca4.z0.t0(r7)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r1)
            r0.f386557b = r2
            k84.c6 r1 = r0.f386556a
            if (r1 == 0) goto L72
            r1.f(r2)
        L72:
            com.tencent.mm.plugin.sns.storage.SnsInfo r1 = r0.f386557b
            r2 = 0
            if (r1 == 0) goto L7f
            boolean r1 = r1.m70412xa290b704()
            r5 = 1
            if (r1 != r5) goto L7f
            goto L80
        L7f:
            r5 = r2
        L80:
            if (r5 == 0) goto L8c
            k84.c6 r1 = r0.f386556a
            if (r1 == 0) goto L93
            r2 = 8
            r1.G(r2)
            goto L93
        L8c:
            k84.c6 r1 = r0.f386556a
            if (r1 == 0) goto L93
            r1.G(r2)
        L93:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k84.e6.a(android.app.Activity, android.view.View, com.tencent.mm.plugin.sns.storage.SnsInfo, i64.b1, com.tencent.mm.plugin.sns.ui.listener.i, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder):void");
    }

    public final void b() {
        k84.c6 c6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatLogic");
        k84.c6 c6Var2 = this.f386556a;
        boolean z17 = false;
        if (c6Var2 != null && c6Var2.n(this.f386557b)) {
            z17 = true;
        }
        if (z17 && (c6Var = this.f386556a) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c6Var.j(), "onPause");
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) c6Var.f386510J).k(java.lang.Boolean.FALSE);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatLogic");
    }

    public final void c() {
        k84.c6 c6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatLogic");
        k84.c6 c6Var2 = this.f386556a;
        boolean z17 = false;
        if (c6Var2 != null && c6Var2.n(this.f386557b)) {
            z17 = true;
        }
        if (z17 && (c6Var = this.f386556a) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c6Var.j(), "onPlay");
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) c6Var.f386510J).k(java.lang.Boolean.TRUE);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatLogic");
    }
}
