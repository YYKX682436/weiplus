package androidx.core.widget;

/* loaded from: classes14.dex */
public class m extends n3.c {
    @Override // n3.c
    public void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) view;
        accessibilityEvent.setClassName(android.widget.ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        o3.q.c(accessibilityEvent, nestedScrollView.getScrollX());
        o3.q.d(accessibilityEvent, nestedScrollView.getScrollRange());
    }

    @Override // n3.c
    public void onInitializeAccessibilityNodeInfo(android.view.View view, o3.l lVar) {
        int scrollRange;
        super.onInitializeAccessibilityNodeInfo(view, lVar);
        androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) view;
        lVar.n(android.widget.ScrollView.class.getName());
        if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
            return;
        }
        lVar.t(true);
        if (nestedScrollView.getScrollY() > 0) {
            lVar.b(o3.f.f342631m);
            lVar.b(o3.f.f342632n);
        }
        if (nestedScrollView.getScrollY() < scrollRange) {
            lVar.b(o3.f.f342630l);
            lVar.b(o3.f.f342634p);
        }
    }

    @Override // n3.c
    public boolean performAccessibilityAction(android.view.View view, int i17, android.os.Bundle bundle) {
        if (super.performAccessibilityAction(view, i17, bundle)) {
            return true;
        }
        androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        int height = nestedScrollView.getHeight();
        android.graphics.Rect rect = new android.graphics.Rect();
        if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
            height = rect.height();
        }
        if (i17 != 4096) {
            if (i17 == 8192 || i17 == 16908344) {
                int max = java.lang.Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.s(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), 250, true);
                return true;
            }
            if (i17 != 16908346) {
                return false;
            }
        }
        int min = java.lang.Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
        if (min == nestedScrollView.getScrollY()) {
            return false;
        }
        nestedScrollView.s(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), 250, true);
        return true;
    }
}
