package androidx.customview.widget;

/* loaded from: classes14.dex */
public class c extends o3.p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.customview.widget.d f11113b;

    public c(androidx.customview.widget.d dVar) {
        this.f11113b = dVar;
    }

    @Override // o3.p
    public o3.l a(int i17) {
        return new o3.l(android.view.accessibility.AccessibilityNodeInfo.obtain(this.f11113b.obtainAccessibilityNodeInfo(i17).f342642a));
    }

    @Override // o3.p
    public o3.l b(int i17) {
        androidx.customview.widget.d dVar = this.f11113b;
        int i18 = i17 == 2 ? dVar.mAccessibilityFocusedVirtualViewId : dVar.mKeyboardFocusedVirtualViewId;
        if (i18 == Integer.MIN_VALUE) {
            return null;
        }
        return a(i18);
    }

    @Override // o3.p
    public boolean c(int i17, int i18, android.os.Bundle bundle) {
        return this.f11113b.performAction(i17, i18, bundle);
    }
}
