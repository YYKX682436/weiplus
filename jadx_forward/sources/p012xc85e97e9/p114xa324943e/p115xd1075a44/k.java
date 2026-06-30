package p012xc85e97e9.p114xa324943e.p115xd1075a44;

/* loaded from: classes15.dex */
public class k extends n3.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe f93973e;

    public k(p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe) {
        this.f93973e = c1190x18d3c3fe;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r0.mo8338x7444f759() > 1) goto L8;
     */
    @Override // n3.c
    /* renamed from: onInitializeAccessibilityEvent */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo7239x9d5dd31b(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
        /*
            r2 = this;
            super.mo7239x9d5dd31b(r3, r4)
            java.lang.Class<androidx.viewpager.widget.ViewPager> r3 = p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.class
            java.lang.String r3 = r3.getName()
            r4.setClassName(r3)
            androidx.viewpager.widget.ViewPager r3 = r2.f93973e
            androidx.viewpager.widget.a r0 = r3.f3679x59855622
            if (r0 == 0) goto L1a
            int r0 = r0.mo8338x7444f759()
            r1 = 1
            if (r0 <= r1) goto L1a
            goto L1b
        L1a:
            r1 = 0
        L1b:
            r4.setScrollable(r1)
            int r0 = r4.getEventType()
            r1 = 4096(0x1000, float:5.74E-42)
            if (r0 != r1) goto L3b
            androidx.viewpager.widget.a r0 = r3.f3679x59855622
            if (r0 == 0) goto L3b
            int r0 = r0.mo8338x7444f759()
            r4.setItemCount(r0)
            int r0 = r3.f3686xe1320446
            r4.setFromIndex(r0)
            int r3 = r3.f3686xe1320446
            r4.setToIndex(r3)
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p114xa324943e.p115xd1075a44.k.mo7239x9d5dd31b(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override // n3.c
    /* renamed from: onInitializeAccessibilityNodeInfo */
    public void mo7102x1bd2f9af(android.view.View view, o3.l lVar) {
        super.mo7102x1bd2f9af(view, lVar);
        lVar.n(p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.class.getName());
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = this.f93973e;
        p012xc85e97e9.p114xa324943e.p115xd1075a44.a aVar = c1190x18d3c3fe.f3679x59855622;
        lVar.t(aVar != null && aVar.mo8338x7444f759() > 1);
        if (c1190x18d3c3fe.canScrollHorizontally(1)) {
            lVar.a(4096);
        }
        if (c1190x18d3c3fe.canScrollHorizontally(-1)) {
            lVar.a(8192);
        }
    }

    @Override // n3.c
    /* renamed from: performAccessibilityAction */
    public boolean mo7240xcdbe3403(android.view.View view, int i17, android.os.Bundle bundle) {
        if (super.mo7240xcdbe3403(view, i17, bundle)) {
            return true;
        }
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = this.f93973e;
        if (i17 == 4096) {
            if (!c1190x18d3c3fe.canScrollHorizontally(1)) {
                return false;
            }
            c1190x18d3c3fe.m8316x940d026a(c1190x18d3c3fe.f3686xe1320446 + 1);
            return true;
        }
        if (i17 != 8192 || !c1190x18d3c3fe.canScrollHorizontally(-1)) {
            return false;
        }
        c1190x18d3c3fe.m8316x940d026a(c1190x18d3c3fe.f3686xe1320446 - 1);
        return true;
    }
}
