package p012xc85e97e9.p100xa8fcbcdb;

/* renamed from: androidx.preference.PreferenceCategory */
/* loaded from: classes13.dex */
public class C1147x79ac8f19 extends p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244 {
    public C1147x79ac8f19(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public boolean J() {
        return !super.m();
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public boolean m() {
        return false;
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public void s(p012xc85e97e9.p100xa8fcbcdb.f0 f0Var) {
        super.s(f0Var);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            f0Var.f3639x46306858.setAccessibilityHeading(true);
        }
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public void y(o3.l lVar) {
        if (android.os.Build.VERSION.SDK_INT < 28) {
            android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = lVar.f424175a.getCollectionItemInfo();
            o3.k kVar = collectionItemInfo != null ? new o3.k(collectionItemInfo) : null;
            if (kVar == null) {
                return;
            }
            java.lang.Object obj = kVar.f424173a;
            lVar.o(o3.k.a(((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), true, ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) obj).isSelected()));
        }
    }

    public C1147x79ac8f19(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, d3.r.a(context, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559895ht, android.R.attr.preferenceCategoryStyle));
    }
}
