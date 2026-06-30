package k84;

/* loaded from: classes4.dex */
public final class w implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k84.q1 f386834a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f386835b;

    public w(k84.q1 q1Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        this.f386834a = q1Var;
        this.f386835b = c17933xe8d1b226;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            r12 = this;
            java.lang.String r13 = "onPreDraw"
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindComponentModel$2$1$2"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r13, r0)
            com.tencent.mm.plugin.sns.storage.SnsInfo r14 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) r14
            com.tencent.mm.plugin.sns.storage.SnsInfo r15 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) r15
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r13, r0)
            k84.q1 r14 = r12.f386834a
            com.tencent.mm.plugin.sns.storage.SnsInfo r15 = r12.f386835b
            k84.l r1 = k84.q1.Y
            java.lang.String r1 = "access$startAnim"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r1, r2)
            r14.getClass()
            java.lang.String r3 = "startAnim"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r3, r2)
            java.lang.String r4 = r14.j()
            java.lang.String r5 = "startBackgroundAnim"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r5)
            com.tencent.mm.plugin.sns.storage.ADXml r15 = r15.m70354x74235b3e()
            mb4.c r15 = r15.f38211x1b3eca3e
            r4 = 0
            if (r15 == 0) goto L3b
            mb4.p r15 = r15.f406920l
            goto L3c
        L3b:
            r15 = r4
        L3c:
            if (r15 != 0) goto L42
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r3, r2)
            goto L9f
        L42:
            android.content.res.Resources r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e
            r6 = 2131099658(0x7f06000a, float:1.7811675E38)
            int r5 = r5.getColor(r6)
            boolean r6 = com.p314xaae8f345.mm.ui.bk.C()
            java.lang.String r7 = "com.tencent.mm.plugin.sns.storage.adsocial.ButtonInfo"
            if (r6 != 0) goto L64
            mb4.k r15 = r15.b()
            if (r15 == 0) goto L75
            java.lang.String r6 = "getBgColorLight"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r6, r7)
            java.lang.String r15 = r15.f406971f
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r6, r7)
            goto L76
        L64:
            mb4.k r15 = r15.b()
            if (r15 == 0) goto L75
            java.lang.String r6 = "getBgColorDark"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r6, r7)
            java.lang.String r15 = r15.f406972g
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r6, r7)
            goto L76
        L75:
            r15 = r4
        L76:
            r6 = -40634(0xffffffffffff6146, float:NaN)
            int r15 = a84.c0.a(r15, r6)
            kotlinx.coroutines.y0 r6 = r14.h()
            if (r6 == 0) goto L9c
            kotlinx.coroutines.r0 r7 = r14.f386732t
            kotlinx.coroutines.p0 r8 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r8 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            t26.a r8 = (t26.a) r8
            t26.a r8 = r8.f496880h
            oz5.l r7 = r7.mo7096x348d9a(r8)
            r8 = 0
            k84.r0 r9 = new k84.r0
            r9.<init>(r14, r5, r15, r4)
            r10 = 2
            r11 = 0
            p3325xe03a0797.p3326xc267989b.l.d(r6, r7, r8, r9, r10, r11)
        L9c:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r3, r2)
        L9f:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r1, r2)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r13, r0)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r13, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k84.w.a(boolean, java.lang.Object, java.lang.Object):void");
    }
}
