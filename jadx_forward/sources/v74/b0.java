package v74;

/* loaded from: classes4.dex */
public final class b0 implements v74.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v74.k0 f515301a;

    public b0(v74.k0 k0Var) {
        this.f515301a = k0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
    
        if (r10 < 0.0f) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(float r10) {
        /*
            r9 = this;
            java.lang.String r0 = "onOverScroll"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$mOnOverScrollActionListener$1"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            v74.k0 r2 = r9.f515301a
            v74.k0.c(r2)
            java.lang.String r3 = "access$getMIsOverMinDistance$p"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r3, r4)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r3, r4)
            com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView r5 = v74.k0.d(r2)
            r6 = 0
            if (r5 == 0) goto L23
            androidx.recyclerview.widget.f2 r5 = r5.mo7946xf939df19()
            goto L24
        L23:
            r5 = r6
        L24:
            boolean r7 = r5 instanceof v74.g
            if (r7 == 0) goto L2b
            r6 = r5
            v74.g r6 = (v74.g) r6
        L2b:
            int r5 = v74.k0.c(r2)
            float r5 = (float) r5
            int r5 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            java.lang.String r7 = "access$setMIsOverMinDistance$p"
            r8 = 1
            if (r5 < 0) goto L58
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r3, r4)
            boolean r5 = r2.f515391x
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r3, r4)
            if (r5 != 0) goto L70
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r7, r4)
            r2.f515391x = r8
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r4)
            if (r6 == 0) goto L4e
            r6.z(r8)
        L4e:
            r3 = 2
            long[] r3 = new long[r3]
            r3 = {x00d6: FILL_ARRAY_DATA , data: [0, 80} // fill-array
            ca4.z0.I0(r3)
            goto L70
        L58:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r3, r4)
            boolean r5 = r2.f515391x
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r3, r4)
            if (r5 == 0) goto L70
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r7, r4)
            r3 = 0
            r2.f515391x = r3
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r4)
            if (r6 == 0) goto L70
            r6.z(r3)
        L70:
            java.lang.String r3 = "access$getMAdLookbookPagAnimLogic$p"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r3, r4)
            v74.s0 r2 = r2.f515382o
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r3, r4)
            if (r2 == 0) goto Ld2
            java.lang.String r3 = "onOverSlideScroll"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r3, r4)
            com.tencent.mm.view.MMPAGView r5 = r2.f515430g
            if (r5 == 0) goto Lcf
            int r6 = r2.f515431h
            if (r6 == 0) goto Lcb
            int r2 = r2.f515432i
            if (r2 != 0) goto L91
            goto Lcb
        L91:
            float r2 = (float) r6
            r6 = 1045220556(0x3e4ccccc, float:0.19999999)
            float r2 = r2 * r6
            float r10 = r10 / r2
            r6 = 1065353216(0x3f800000, float:1.0)
            int r7 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r7 <= 0) goto L9f
        L9d:
            r10 = r6
            goto La5
        L9f:
            r6 = 0
            int r7 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r7 >= 0) goto La5
            goto L9d
        La5:
            float r6 = (float) r8
            float r7 = r6 - r10
            float r2 = r2 * r7
            r5.setTranslationX(r2)
            r2 = 1045220557(0x3e4ccccd, float:0.2)
            float r10 = r10 * r2
            float r6 = r6 + r10
            int r10 = r5.getWidth()
            float r10 = (float) r10
            r5.setPivotX(r10)
            int r10 = r5.getHeight()
            float r10 = (float) r10
            r2 = 1073741824(0x40000000, float:2.0)
            float r10 = r10 / r2
            r5.setPivotY(r10)
            r5.setScaleX(r6)
            r5.setScaleY(r6)
            goto Lcf
        Lcb:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r3, r4)
            goto Ld2
        Lcf:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r3, r4)
        Ld2:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v74.b0.a(float):void");
    }
}
