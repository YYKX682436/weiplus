package p012xc85e97e9.p107xd3118140.p108xd1075a44;

/* loaded from: classes14.dex */
public class a extends n3.c {

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f93881e = new android.graphics.Rect();

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960 f93882f;

    public a(p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960 c1168xfe0c8960) {
        this.f93882f = c1168xfe0c8960;
    }

    @Override // n3.c
    /* renamed from: onInitializeAccessibilityEvent */
    public void mo7239x9d5dd31b(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.mo7239x9d5dd31b(view, accessibilityEvent);
        accessibilityEvent.setClassName(p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960.class.getName());
    }

    @Override // n3.c
    /* renamed from: onInitializeAccessibilityNodeInfo */
    public void mo7102x1bd2f9af(android.view.View view, o3.l lVar) {
        android.view.accessibility.AccessibilityNodeInfo obtain = android.view.accessibility.AccessibilityNodeInfo.obtain(lVar.f424175a);
        o3.l lVar2 = new o3.l(obtain);
        super.mo7102x1bd2f9af(view, lVar2);
        android.graphics.Rect rect = this.f93881e;
        lVar2.f(rect);
        lVar.k(rect);
        obtain.getBoundsInScreen(rect);
        lVar.l(rect);
        boolean isVisibleToUser = obtain.isVisibleToUser();
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = lVar.f424175a;
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
        lVar.n(p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960.class.getName());
        lVar.f424177c = -1;
        accessibilityNodeInfo.setSource(view);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        java.lang.Object f17 = n3.u0.f(view);
        if (f17 instanceof android.view.View) {
            lVar.f424176b = -1;
            accessibilityNodeInfo.setParent((android.view.View) f17);
        }
        p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960 c1168xfe0c8960 = this.f93882f;
        int childCount = c1168xfe0c8960.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = c1168xfe0c8960.getChildAt(i17);
            if (!c1168xfe0c8960.b(childAt) && childAt.getVisibility() == 0) {
                n3.u0.s(childAt, 1);
                accessibilityNodeInfo.addChild(childAt);
            }
        }
    }

    @Override // n3.c
    /* renamed from: onRequestSendAccessibilityEvent */
    public boolean mo8238xde18d764(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (this.f93882f.b(view)) {
            return false;
        }
        return super.mo8238xde18d764(viewGroup, view, accessibilityEvent);
    }
}
