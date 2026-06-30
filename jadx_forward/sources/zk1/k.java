package zk1;

/* loaded from: classes14.dex */
public final class k extends android.view.accessibility.AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zk1.m f554945a;

    public k(zk1.m mVar) {
        this.f554945a = mVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int i17) {
        zk1.m mVar = this.f554945a;
        android.view.accessibility.AccessibilityNodeInfo obtain = android.view.accessibility.AccessibilityNodeInfo.obtain(mVar.f554949a);
        mVar.f554949a.onInitializeAccessibilityNodeInfo(obtain);
        if (obtain != null) {
            obtain.getBoundsInScreen(mVar.f554958j);
        }
        android.graphics.Rect rect = mVar.f554958j;
        int i18 = rect.left;
        android.graphics.Rect rect2 = mVar.f554957i;
        rect.left = i18 - rect2.left;
        rect.top -= rect2.top;
        rect.right += rect2.right;
        rect.bottom += rect2.bottom;
        if (obtain != null) {
            obtain.setBoundsInScreen(rect);
        }
        return obtain;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i17, int i18, android.os.Bundle bundle) {
        return this.f554945a.f554949a.performAccessibilityAction(i18, bundle);
    }
}
