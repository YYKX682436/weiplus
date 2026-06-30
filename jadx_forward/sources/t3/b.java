package t3;

/* loaded from: classes14.dex */
public class b extends n3.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b f496888e;

    public b(p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b c1097xe647fb9b) {
        this.f496888e = c1097xe647fb9b;
        new android.graphics.Rect();
    }

    @Override // n3.c
    /* renamed from: dispatchPopulateAccessibilityEvent */
    public boolean mo83645x94b6bc90(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return super.mo83645x94b6bc90(view, accessibilityEvent);
        }
        accessibilityEvent.getText();
        p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b c1097xe647fb9b = this.f496888e;
        android.view.View f17 = c1097xe647fb9b.f();
        if (f17 == null) {
            return true;
        }
        int h17 = c1097xe647fb9b.h(f17);
        c1097xe647fb9b.getClass();
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        android.view.Gravity.getAbsoluteGravity(h17, n3.v0.d(c1097xe647fb9b));
        return true;
    }

    @Override // n3.c
    /* renamed from: onInitializeAccessibilityEvent */
    public void mo7239x9d5dd31b(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.mo7239x9d5dd31b(view, accessibilityEvent);
        accessibilityEvent.setClassName(p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.class.getName());
    }

    @Override // n3.c
    /* renamed from: onInitializeAccessibilityNodeInfo */
    public void mo7102x1bd2f9af(android.view.View view, o3.l lVar) {
        int[] iArr = p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.G;
        super.mo7102x1bd2f9af(view, lVar);
        lVar.n(p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.class.getName());
        lVar.r(false);
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = lVar.f424175a;
        accessibilityNodeInfo.setFocused(false);
        accessibilityNodeInfo.removeAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) o3.f.f424156e.f424169a);
        accessibilityNodeInfo.removeAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) o3.f.f424157f.f424169a);
    }

    @Override // n3.c
    /* renamed from: onRequestSendAccessibilityEvent */
    public boolean mo8238xde18d764(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        int[] iArr = p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.G;
        return super.mo8238xde18d764(viewGroup, view, accessibilityEvent);
    }
}
