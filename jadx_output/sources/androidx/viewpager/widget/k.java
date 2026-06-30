package androidx.viewpager.widget;

/* loaded from: classes15.dex */
public class k extends n3.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.viewpager.widget.ViewPager f12440e;

    public k(androidx.viewpager.widget.ViewPager viewPager) {
        this.f12440e = viewPager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r0.getCount() > 1) goto L8;
     */
    @Override // n3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onInitializeAccessibilityEvent(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
        /*
            r2 = this;
            super.onInitializeAccessibilityEvent(r3, r4)
            java.lang.Class<androidx.viewpager.widget.ViewPager> r3 = androidx.viewpager.widget.ViewPager.class
            java.lang.String r3 = r3.getName()
            r4.setClassName(r3)
            androidx.viewpager.widget.ViewPager r3 = r2.f12440e
            androidx.viewpager.widget.a r0 = r3.mAdapter
            if (r0 == 0) goto L1a
            int r0 = r0.getCount()
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
            androidx.viewpager.widget.a r0 = r3.mAdapter
            if (r0 == 0) goto L3b
            int r0 = r0.getCount()
            r4.setItemCount(r0)
            int r0 = r3.mCurItem
            r4.setFromIndex(r0)
            int r3 = r3.mCurItem
            r4.setToIndex(r3)
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.k.onInitializeAccessibilityEvent(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override // n3.c
    public void onInitializeAccessibilityNodeInfo(android.view.View view, o3.l lVar) {
        super.onInitializeAccessibilityNodeInfo(view, lVar);
        lVar.n(androidx.viewpager.widget.ViewPager.class.getName());
        androidx.viewpager.widget.ViewPager viewPager = this.f12440e;
        androidx.viewpager.widget.a aVar = viewPager.mAdapter;
        lVar.t(aVar != null && aVar.getCount() > 1);
        if (viewPager.canScrollHorizontally(1)) {
            lVar.a(4096);
        }
        if (viewPager.canScrollHorizontally(-1)) {
            lVar.a(8192);
        }
    }

    @Override // n3.c
    public boolean performAccessibilityAction(android.view.View view, int i17, android.os.Bundle bundle) {
        if (super.performAccessibilityAction(view, i17, bundle)) {
            return true;
        }
        androidx.viewpager.widget.ViewPager viewPager = this.f12440e;
        if (i17 == 4096) {
            if (!viewPager.canScrollHorizontally(1)) {
                return false;
            }
            viewPager.setCurrentItem(viewPager.mCurItem + 1);
            return true;
        }
        if (i17 != 8192 || !viewPager.canScrollHorizontally(-1)) {
            return false;
        }
        viewPager.setCurrentItem(viewPager.mCurItem - 1);
        return true;
    }
}
