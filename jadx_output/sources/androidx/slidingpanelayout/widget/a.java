package androidx.slidingpanelayout.widget;

/* loaded from: classes14.dex */
public class a extends n3.c {

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f12348e = new android.graphics.Rect();

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.slidingpanelayout.widget.SlidingPaneLayout f12349f;

    public a(androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPaneLayout) {
        this.f12349f = slidingPaneLayout;
    }

    @Override // n3.c
    public void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(androidx.slidingpanelayout.widget.SlidingPaneLayout.class.getName());
    }

    @Override // n3.c
    public void onInitializeAccessibilityNodeInfo(android.view.View view, o3.l lVar) {
        android.view.accessibility.AccessibilityNodeInfo obtain = android.view.accessibility.AccessibilityNodeInfo.obtain(lVar.f342642a);
        o3.l lVar2 = new o3.l(obtain);
        super.onInitializeAccessibilityNodeInfo(view, lVar2);
        android.graphics.Rect rect = this.f12348e;
        lVar2.f(rect);
        lVar.k(rect);
        obtain.getBoundsInScreen(rect);
        lVar.l(rect);
        boolean isVisibleToUser = obtain.isVisibleToUser();
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = lVar.f342642a;
        accessibilityNodeInfo.setVisibleToUser(isVisibleToUser);
        accessibilityNodeInfo.setPackageName(obtain.getPackageName());
        lVar.n(obtain.getClassName());
        lVar.p(obtain.getContentDescription());
        lVar.q(obtain.isEnabled());
        accessibilityNodeInfo.setClickable(obtain.isClickable());
        lVar.r(obtain.isFocusable());
        accessibilityNodeInfo.setFocused(obtain.isFocused());
        lVar.i(obtain.isAccessibilityFocused());
        accessibilityNodeInfo.setSelected(obtain.isSelected());
        accessibilityNodeInfo.setLongClickable(obtain.isLongClickable());
        lVar.a(obtain.getActions());
        accessibilityNodeInfo.setMovementGranularities(obtain.getMovementGranularities());
        lVar.n(androidx.slidingpanelayout.widget.SlidingPaneLayout.class.getName());
        lVar.f342644c = -1;
        accessibilityNodeInfo.setSource(view);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        java.lang.Object f17 = n3.u0.f(view);
        if (f17 instanceof android.view.View) {
            lVar.f342643b = -1;
            accessibilityNodeInfo.setParent((android.view.View) f17);
        }
        androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPaneLayout = this.f12349f;
        int childCount = slidingPaneLayout.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = slidingPaneLayout.getChildAt(i17);
            if (!slidingPaneLayout.b(childAt) && childAt.getVisibility() == 0) {
                n3.u0.s(childAt, 1);
                accessibilityNodeInfo.addChild(childAt);
            }
        }
    }

    @Override // n3.c
    public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (this.f12349f.b(view)) {
            return false;
        }
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}
