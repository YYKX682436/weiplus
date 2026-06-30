package be1;

/* loaded from: classes4.dex */
public final class p extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f4224x366c91de = 851;

    /* renamed from: NAME */
    private static final java.lang.String f4225x24728b = "checkIsOpenAccessibility";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        android.content.Context mo50352x76847179 = lVar.mo50352x76847179();
        java.lang.Boolean bool = null;
        if (mo50352x76847179 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.Accessibility.ViewAccessibilityHelper", "isTalkBackAccessibilityEnabled, context is null");
        } else {
            android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) mo50352x76847179.getSystemService("accessibility");
            if (accessibilityManager == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.Accessibility.ViewAccessibilityHelper", "isTalkBackAccessibilityEnabled, accessibilityManager is null");
            } else if (accessibilityManager.isTouchExplorationEnabled()) {
                bool = java.lang.Boolean.TRUE;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Accessibility.ViewAccessibilityHelper", "isTalkBackAccessibilityEnabled, isTalkBackAccessibilityEnabled: false");
                bool = java.lang.Boolean.FALSE;
            }
        }
        if (bool == null) {
            lVar.a(i17, o("fail"));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("open", bool);
        lVar.a(i17, p("ok", hashMap));
    }
}
