package i12;

/* loaded from: classes14.dex */
public class i extends android.view.View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i12.j f368748a;

    public i(i12.j jVar, i12.k kVar) {
        this.f368748a = jVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setContentDescription(this.f368748a.f368752d.f368754e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nf9));
        accessibilityNodeInfo.setClassName(android.widget.Button.class.getName());
    }
}
