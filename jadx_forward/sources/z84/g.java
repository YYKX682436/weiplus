package z84;

/* loaded from: classes4.dex */
public class g extends z84.d {

    /* renamed from: e, reason: collision with root package name */
    public final int f552307e;

    /* renamed from: f, reason: collision with root package name */
    public final int f552308f;

    /* renamed from: g, reason: collision with root package name */
    public z84.f f552309g;

    public g(int i17, int i18) {
        this.f552307e = i17;
        this.f552308f = i18;
    }

    @Override // z84.d
    public void a(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doChildLayoutParam", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 e17 = e();
        z84.f fVar = this.f552309g;
        if (e17 == null || view == null || view.getTag(com.p314xaae8f345.mm.R.id.f568516n32) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doChildLayoutParam", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || fVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doChildLayoutParam", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
            return;
        }
        layoutParams.width = fVar.f552305a;
        layoutParams.height = fVar.f552306b;
        view.setLayoutParams(layoutParams);
        view.setTag(com.p314xaae8f345.mm.R.id.f568516n32, java.lang.Boolean.TRUE);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doChildLayoutParam", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (r10 >= 0.5f) goto L16;
     */
    @Override // z84.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(int r9, float r10, android.view.View r11, int r12, int r13, int r14) {
        /*
            r8 = this;
            java.lang.String r14 = "doLayoutAndAnimation"
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r14, r0)
            com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager r1 = r8.e()
            if (r1 == 0) goto L9f
            int r2 = r8.f552299b
            if (r2 <= 0) goto L9f
            int r2 = r8.f552298a
            if (r2 > 0) goto L17
            goto L9f
        L17:
            r2 = 0
            if (r12 != 0) goto L2d
            int r3 = r8.f(r9)
            int r9 = r8.f552298a
            int r5 = r3 + r9
            int r9 = r8.f552299b
            int r6 = r9 + 0
            r4 = 0
            r2 = r11
            r1.m8049xe4474aed(r2, r3, r4, r5, r6)
            goto L9b
        L2d:
            java.lang.String r9 = "canRelayoutNotFirstView"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r9, r0)
            if (r13 == 0) goto L3d
            r8.d()
            r3 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r3 < 0) goto L3e
        L3d:
            r2 = 1
        L3e:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r9, r0)
            if (r2 == 0) goto L9b
            java.lang.String r9 = "getAfterVisibleViewStartOffset"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r9, r0)
            int r2 = r8.f552307e
            float r2 = (float) r2
            java.lang.String r3 = "computeOffsetFactor"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r3, r0)
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 1073741824(0x40000000, float:2.0)
            if (r13 != 0) goto L5c
            float r6 = (float) r12
            float r6 = r6 - r10
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r3, r0)
            goto L64
        L5c:
            float r6 = (float) r12
            float r7 = r10 * r5
            float r6 = r6 - r7
            float r6 = r6 + r4
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r3, r0)
        L64:
            float r2 = r2 * r6
            int r6 = java.lang.Math.round(r2)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r9, r0)
            java.lang.String r9 = "getAfterVisibleViewTopOffset"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r9, r0)
            int r2 = r8.f552308f
            float r2 = (float) r2
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r3, r0)
            if (r13 != 0) goto L7f
            float r12 = (float) r12
            float r12 = r12 - r10
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r3, r0)
            goto L86
        L7f:
            float r12 = (float) r12
            float r10 = r10 * r5
            float r12 = r12 - r10
            float r12 = r12 + r4
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r3, r0)
        L86:
            float r2 = r2 * r12
            int r4 = java.lang.Math.round(r2)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r9, r0)
            int r9 = r8.f552298a
            int r5 = r6 + r9
            int r9 = r8.f552299b
            int r9 = r9 + r4
            r2 = r11
            r3 = r6
            r6 = r9
            r1.m8049xe4474aed(r2, r3, r4, r5, r6)
        L9b:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r14, r0)
            return
        L9f:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r14, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z84.g.b(int, float, android.view.View, int, int, int):void");
    }

    @Override // z84.d
    public boolean c(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doMeasure", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 e17 = e();
        if (e17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doMeasure", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
            return false;
        }
        int size = android.view.View.MeasureSpec.getSize(i17);
        if (this.f552309g == null) {
            this.f552309g = new z84.f();
        }
        z84.f fVar = this.f552309g;
        int i19 = size - (this.f552307e * 2);
        fVar.f552305a = i19;
        int i27 = (int) ((i19 * 0.75f) + 0.5f);
        fVar.f552306b = i27;
        e17.mo8093xd88558fe(size, i27);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doMeasure", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
        return true;
    }

    @Override // z84.d
    public float d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFixedScrollPercentExtent", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFixedScrollPercentExtent", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
        return 0.5f;
    }

    public int f(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFirstVisibleViewStartOffset", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
        int i18 = this.f552298a;
        if (i18 == 0 || this.f552299b == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFirstVisibleViewStartOffset", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
            return 0;
        }
        if (i17 >= 0) {
            int i19 = (-i17) % i18;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFirstVisibleViewStartOffset", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
            return i19;
        }
        if (i17 % i18 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFirstVisibleViewStartOffset", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
            return 0;
        }
        int i27 = ((-i17) % i18) - i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFirstVisibleViewStartOffset", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
        return i27;
    }
}
