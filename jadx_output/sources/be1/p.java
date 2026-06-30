package be1;

/* loaded from: classes4.dex */
public final class p extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 851;
    private static final java.lang.String NAME = "checkIsOpenAccessibility";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        android.content.Context context = lVar.getContext();
        java.lang.Boolean bool = null;
        if (context == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.Accessibility.ViewAccessibilityHelper", "isTalkBackAccessibilityEnabled, context is null");
        } else {
            android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) context.getSystemService("accessibility");
            if (accessibilityManager == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.Accessibility.ViewAccessibilityHelper", "isTalkBackAccessibilityEnabled, accessibilityManager is null");
            } else if (accessibilityManager.isTouchExplorationEnabled()) {
                bool = java.lang.Boolean.TRUE;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Accessibility.ViewAccessibilityHelper", "isTalkBackAccessibilityEnabled, isTalkBackAccessibilityEnabled: false");
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
