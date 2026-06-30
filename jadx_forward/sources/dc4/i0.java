package dc4;

/* loaded from: classes4.dex */
public class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dc4.l0 f310296d;

    public i0(dc4.l0 l0Var) {
        this.f310296d = l0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006c A[Catch: Exception -> 0x0077, TryCatch #0 {Exception -> 0x0077, blocks: (B:3:0x002d, B:7:0x0049, B:10:0x006c, B:11:0x006f, B:20:0x0056, B:22:0x005c, B:23:0x0061), top: B:2:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009b  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r13) {
        /*
            r12 = this;
            dc4.l0 r0 = r12.f310296d
            java.lang.String r1 = "onClick"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$5"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r1, r2)
            java.lang.String r3 = "com/tencent/mm/plugin/sns/ui/detail/item/FullCardAdDetailItemNew$5"
            java.lang.String r4 = "android/view/View$OnClickListener"
            java.lang.String r5 = "onClick"
            java.lang.String r6 = "(Landroid/view/View;)V"
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r7.add(r13)
            java.lang.Object[] r8 = r7.toArray()
            r7.clear()
            r7 = r12
            yj0.a.b(r3, r4, r5, r6, r7, r8)
            java.lang.String r3 = "MicroMsg.FullCardAdDetailItemNew"
            java.lang.String r4 = "ProxyCardClickListener onClick"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r4)
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r0.f310365e     // Catch: java.lang.Exception -> L77
            u74.d r5 = dc4.l0.l(r0)     // Catch: java.lang.Exception -> L77
            com.tencent.mm.plugin.sns.ui.listener.i r6 = r0.f310371n     // Catch: java.lang.Exception -> L77
            java.lang.String r7 = "createFullCardAdLandingPageJumpAnimInfo"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r7, r8)     // Catch: java.lang.Exception -> L77
            e42.c0 r9 = e42.c0.clicfg_sns_full_card_ad_disable_jump_anim_info     // Catch: java.lang.Exception -> L77
            r10 = 0
            int r9 = ca4.m0.u0(r9, r10)     // Catch: java.lang.Exception -> L77
            r11 = 1
            if (r9 != r11) goto L47
            r10 = r11
        L47:
            if (r10 == 0) goto L54
            java.lang.String r4 = "ClickActionHelper"
            java.lang.String r5 = "disableJumpAnimInfo, do origin logic"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r5)     // Catch: java.lang.Exception -> L77
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r8)     // Catch: java.lang.Exception -> L77
            goto L5f
        L54:
            if (r4 != 0) goto L5a
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r8)     // Catch: java.lang.Exception -> L77
            goto L5f
        L5a:
            if (r5 != 0) goto L61
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r8)     // Catch: java.lang.Exception -> L77
        L5f:
            r4 = 0
            goto L6a
        L61:
            l44.j4 r9 = new l44.j4     // Catch: java.lang.Exception -> L77
            r9.<init>(r4, r5, r6)     // Catch: java.lang.Exception -> L77
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r8)     // Catch: java.lang.Exception -> L77
            r4 = r9
        L6a:
            if (r4 == 0) goto L6f
            w64.x.k(r13, r4)     // Catch: java.lang.Exception -> L77
        L6f:
            com.tencent.mm.plugin.sns.ui.listener.i r4 = r0.f310371n     // Catch: java.lang.Exception -> L77
            android.view.View$OnClickListener r4 = r4.T     // Catch: java.lang.Exception -> L77
            r4.onClick(r13)     // Catch: java.lang.Exception -> L77
            goto L8d
        L77:
            r13 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "ProxyCardClickListener onClick, exp="
            r4.<init>(r5)
            java.lang.String r13 = r13.toString()
            r4.append(r13)
            java.lang.String r13 = r4.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r13)
        L8d:
            java.lang.String r13 = "access$200"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r13, r3)
            boolean r4 = r0.f310305s
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r13, r3)
            if (r4 == 0) goto La1
            com.tencent.mm.plugin.sns.storage.SnsInfo r13 = r0.f310365e
            r0 = 2
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18402xe28da210.e(r13, r0)
        La1:
            java.lang.String r13 = "(Landroid/view/View;)V"
            java.lang.String r0 = "com/tencent/mm/plugin/sns/ui/detail/item/FullCardAdDetailItemNew$5"
            java.lang.String r3 = "android/view/View$OnClickListener"
            yj0.a.h(r12, r0, r3, r1, r13)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dc4.i0.onClick(android.view.View):void");
    }
}
