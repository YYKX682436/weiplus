package lx2;

/* loaded from: classes2.dex */
public final class f extends lx2.d {

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f403596k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f403597l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f403598m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15298x95ee76f1 tipsLayout) {
        super(tipsLayout);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsLayout, "tipsLayout");
        this.f403596k = "friendtab_tl_bubble";
        this.f403597l = "TLRecommendTab";
        this.f403598m = "FriendsTipsBubbleViewHelper";
    }

    @Override // lx2.d
    public r45.qt2 c() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((jz5.n) this.f403587e).mo141623x754a37bb()).W6(1);
    }

    @Override // lx2.d
    public java.lang.String d() {
        return this.f403597l;
    }

    @Override // lx2.d
    public java.lang.String e() {
        return this.f403596k;
    }

    @Override // lx2.d
    public java.lang.String f() {
        return this.f403598m;
    }

    @Override // lx2.d
    public void h() {
        super.h();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gb gbVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15298x95ee76f1.f212670h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15298x95ee76f1.f212672m = true;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5538x56837f90 c5538x56837f90 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5538x56837f90();
        c5538x56837f90.f135862g.f88471a = 1;
        c5538x56837f90.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x006b  */
    @Override // lx2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(android.view.View r8, android.widget.LinearLayout.LayoutParams r9, android.widget.FrameLayout.LayoutParams r10) {
        /*
            r7 = this;
            java.lang.String r0 = "arrow"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
            java.lang.String r0 = "arrowParams"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r0)
            java.lang.String r0 = "tipsParams"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            r0 = 0
            r9.leftMargin = r0
            r1 = 49
            r9.gravity = r1
            java.lang.String r2 = "context"
            android.content.Context r3 = r7.f403584b
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r2)
            pf5.z r2 = pf5.z.f435481a
            boolean r4 = r3 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112
            if (r4 == 0) goto L74
            r4 = r3
            androidx.appcompat.app.AppCompatActivity r4 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) r4
            pf5.v r2 = r2.a(r4)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.bl> r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl.class
            androidx.lifecycle.c1 r2 = r2.a(r4)
            java.lang.String r4 = "get(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r4)
            com.tencent.mm.plugin.finder.viewmodel.component.bl r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl) r2
            r4 = 35
            com.tencent.mm.plugin.finder.viewmodel.component.gi r4 = r2.X6(r4)
            if (r4 != 0) goto L41
        L3f:
            r4 = r0
            goto L69
        L41:
            r4 = 1
            com.tencent.mm.plugin.finder.viewmodel.component.gi r5 = r2.X6(r4)
            if (r5 != 0) goto L49
            goto L3f
        L49:
            int r2 = r2.r7()
            if (r2 > r4) goto L50
            goto L3f
        L50:
            int r5 = r5.f216060d
            if (r5 < r2) goto L55
            goto L3f
        L55:
            int r6 = r2 % 2
            if (r6 == 0) goto L60
            int r2 = r2 - r4
            int r2 = r2 / 2
            if (r5 != r2) goto L60
            r2 = r4
            goto L61
        L60:
            r2 = r0
        L61:
            r2 = r2 ^ r4
            if (r2 == 0) goto L3f
            com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView r2 = r7.f403583a
            r7.a(r3, r2, r10, r4)
        L69:
            if (r4 != 0) goto L70
            r10.gravity = r1
            r10.setMarginStart(r0)
        L70:
            super.i(r8, r9, r10)
            return
        L74:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Check failed."
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: lx2.f.i(android.view.View, android.widget.LinearLayout$LayoutParams, android.widget.FrameLayout$LayoutParams):void");
    }
}
