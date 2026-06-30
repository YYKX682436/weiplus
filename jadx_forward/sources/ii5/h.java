package ii5;

/* loaded from: classes15.dex */
public class h extends n3.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d f373195e;

    public h(com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d c22458x34f98a1d) {
        this.f373195e = c22458x34f98a1d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (r1.mo8338x7444f759() > 1) goto L8;
     */
    @Override // n3.c
    /* renamed from: onInitializeAccessibilityEvent */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo7239x9d5dd31b(android.view.View r4, android.view.accessibility.AccessibilityEvent r5) {
        /*
            r3 = this;
            super.mo7239x9d5dd31b(r4, r5)
            java.lang.Class<com.tencent.mm.ui.mogic.WxViewPager> r4 = com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d.class
            java.lang.String r4 = r4.getName()
            r5.setClassName(r4)
            android.view.accessibility.AccessibilityRecord r4 = android.view.accessibility.AccessibilityRecord.obtain()
            com.tencent.mm.ui.mogic.WxViewPager r0 = r3.f373195e
            androidx.viewpager.widget.a r1 = com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d.m80814xbbd78272(r0)
            if (r1 == 0) goto L24
            androidx.viewpager.widget.a r1 = com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d.m80814xbbd78272(r0)
            int r1 = r1.mo8338x7444f759()
            r2 = 1
            if (r1 <= r2) goto L24
            goto L25
        L24:
            r2 = 0
        L25:
            r4.setScrollable(r2)
            int r5 = r5.getEventType()
            r1 = 4096(0x1000, float:5.74E-42)
            if (r5 != r1) goto L4f
            androidx.viewpager.widget.a r5 = com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d.m80814xbbd78272(r0)
            if (r5 == 0) goto L4f
            androidx.viewpager.widget.a r5 = com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d.m80814xbbd78272(r0)
            int r5 = r5.mo8338x7444f759()
            r4.setItemCount(r5)
            int r5 = com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d.m80815xbbd78633(r0)
            r4.setFromIndex(r5)
            int r5 = com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d.m80815xbbd78633(r0)
            r4.setToIndex(r5)
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ii5.h.mo7239x9d5dd31b(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // n3.c
    /* renamed from: onInitializeAccessibilityNodeInfo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo7102x1bd2f9af(android.view.View r3, o3.l r4) {
        /*
            r2 = this;
            super.mo7102x1bd2f9af(r3, r4)
            java.lang.Class<com.tencent.mm.ui.mogic.WxViewPager> r3 = com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d.class
            java.lang.String r3 = r3.getName()
            r4.n(r3)
            com.tencent.mm.ui.mogic.WxViewPager r3 = r2.f373195e
            androidx.viewpager.widget.a r0 = com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d.m80814xbbd78272(r3)
            r1 = 1
            if (r0 == 0) goto L21
            androidx.viewpager.widget.a r0 = com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d.m80814xbbd78272(r3)
            int r0 = r0.mo8338x7444f759()
            if (r0 <= r1) goto L21
            r0 = r1
            goto L22
        L21:
            r0 = 0
        L22:
            r4.t(r0)
            boolean r0 = r3.canScrollHorizontally(r1)
            if (r0 == 0) goto L30
            r0 = 4096(0x1000, float:5.74E-42)
            r4.a(r0)
        L30:
            r0 = -1
            boolean r3 = r3.canScrollHorizontally(r0)
            if (r3 == 0) goto L3c
            r3 = 8192(0x2000, float:1.148E-41)
            r4.a(r3)
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ii5.h.mo7102x1bd2f9af(android.view.View, o3.l):void");
    }

    @Override // n3.c
    /* renamed from: performAccessibilityAction */
    public boolean mo7240xcdbe3403(android.view.View view, int i17, android.os.Bundle bundle) {
        int i18;
        int i19;
        if (super.mo7240xcdbe3403(view, i17, bundle)) {
            return true;
        }
        com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d c22458x34f98a1d = this.f373195e;
        if (i17 == 4096) {
            if (!c22458x34f98a1d.canScrollHorizontally(1)) {
                return false;
            }
            i18 = c22458x34f98a1d.f39636xe1320446;
            c22458x34f98a1d.m80844x940d026a(i18 + 1);
            return true;
        }
        if (i17 != 8192 || !c22458x34f98a1d.canScrollHorizontally(-1)) {
            return false;
        }
        i19 = c22458x34f98a1d.f39636xe1320446;
        c22458x34f98a1d.m80844x940d026a(i19 - 1);
        return true;
    }
}
