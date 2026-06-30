package o3;

/* loaded from: classes14.dex */
public abstract class m extends android.view.accessibility.AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final o3.p f424178a;

    public m(o3.p pVar) {
        this.f424178a = pVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int i17) {
        o3.l a17 = this.f424178a.a(i17);
        if (a17 == null) {
            return null;
        }
        return a17.f424175a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public java.util.List findAccessibilityNodeInfosByText(java.lang.String str, int i17) {
        this.f424178a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i17, int i18, android.os.Bundle bundle) {
        return this.f424178a.c(i17, i18, bundle);
    }
}
