package p012xc85e97e9.p075x2eaf9f.p079xd1075a44;

/* loaded from: classes14.dex */
public class m extends n3.c {
    @Override // n3.c
    /* renamed from: onInitializeAccessibilityEvent */
    public void mo7239x9d5dd31b(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.mo7239x9d5dd31b(view, accessibilityEvent);
        p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89 c1095x65355f89 = (p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89) view;
        accessibilityEvent.setClassName(android.widget.ScrollView.class.getName());
        accessibilityEvent.setScrollable(c1095x65355f89.m7231x5432e13a() > 0);
        accessibilityEvent.setScrollX(c1095x65355f89.getScrollX());
        accessibilityEvent.setScrollY(c1095x65355f89.getScrollY());
        o3.q.c(accessibilityEvent, c1095x65355f89.getScrollX());
        o3.q.d(accessibilityEvent, c1095x65355f89.m7231x5432e13a());
    }

    @Override // n3.c
    /* renamed from: onInitializeAccessibilityNodeInfo */
    public void mo7102x1bd2f9af(android.view.View view, o3.l lVar) {
        int m7231x5432e13a;
        super.mo7102x1bd2f9af(view, lVar);
        p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89 c1095x65355f89 = (p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89) view;
        lVar.n(android.widget.ScrollView.class.getName());
        if (!c1095x65355f89.isEnabled() || (m7231x5432e13a = c1095x65355f89.m7231x5432e13a()) <= 0) {
            return;
        }
        lVar.t(true);
        if (c1095x65355f89.getScrollY() > 0) {
            lVar.b(o3.f.f424164m);
            lVar.b(o3.f.f424165n);
        }
        if (c1095x65355f89.getScrollY() < m7231x5432e13a) {
            lVar.b(o3.f.f424163l);
            lVar.b(o3.f.f424167p);
        }
    }

    @Override // n3.c
    /* renamed from: performAccessibilityAction */
    public boolean mo7240xcdbe3403(android.view.View view, int i17, android.os.Bundle bundle) {
        if (super.mo7240xcdbe3403(view, i17, bundle)) {
            return true;
        }
        p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89 c1095x65355f89 = (p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89) view;
        if (!c1095x65355f89.isEnabled()) {
            return false;
        }
        int height = c1095x65355f89.getHeight();
        android.graphics.Rect rect = new android.graphics.Rect();
        if (c1095x65355f89.getMatrix().isIdentity() && c1095x65355f89.getGlobalVisibleRect(rect)) {
            height = rect.height();
        }
        if (i17 != 4096) {
            if (i17 == 8192 || i17 == 16908344) {
                int max = java.lang.Math.max(c1095x65355f89.getScrollY() - ((height - c1095x65355f89.getPaddingBottom()) - c1095x65355f89.getPaddingTop()), 0);
                if (max == c1095x65355f89.getScrollY()) {
                    return false;
                }
                c1095x65355f89.s(0 - c1095x65355f89.getScrollX(), max - c1095x65355f89.getScrollY(), 250, true);
                return true;
            }
            if (i17 != 16908346) {
                return false;
            }
        }
        int min = java.lang.Math.min(c1095x65355f89.getScrollY() + ((height - c1095x65355f89.getPaddingBottom()) - c1095x65355f89.getPaddingTop()), c1095x65355f89.m7231x5432e13a());
        if (min == c1095x65355f89.getScrollY()) {
            return false;
        }
        c1095x65355f89.s(0 - c1095x65355f89.getScrollX(), min - c1095x65355f89.getScrollY(), 250, true);
        return true;
    }
}
