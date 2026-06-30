package androidx.appcompat.widget;

/* loaded from: classes14.dex */
public class y extends android.view.View.AccessibilityDelegate {
    public y(androidx.appcompat.widget.ActivityChooserView activityChooserView) {
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setCanOpenPopup(true);
    }
}
