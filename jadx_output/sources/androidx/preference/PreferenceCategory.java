package androidx.preference;

/* loaded from: classes13.dex */
public class PreferenceCategory extends androidx.preference.PreferenceGroup {
    public PreferenceCategory(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
    }

    @Override // androidx.preference.Preference
    public boolean J() {
        return !super.m();
    }

    @Override // androidx.preference.Preference
    public boolean m() {
        return false;
    }

    @Override // androidx.preference.Preference
    public void s(androidx.preference.f0 f0Var) {
        super.s(f0Var);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            f0Var.itemView.setAccessibilityHeading(true);
        }
    }

    @Override // androidx.preference.Preference
    public void y(o3.l lVar) {
        if (android.os.Build.VERSION.SDK_INT < 28) {
            android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = lVar.f342642a.getCollectionItemInfo();
            o3.k kVar = collectionItemInfo != null ? new o3.k(collectionItemInfo) : null;
            if (kVar == null) {
                return;
            }
            java.lang.Object obj = kVar.f342640a;
            lVar.o(o3.k.a(((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), true, ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) obj).isSelected()));
        }
    }

    public PreferenceCategory(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, d3.r.a(context, com.tencent.mm.R.attr.f478362ht, android.R.attr.preferenceCategoryStyle));
    }
}
