package oa1;

/* loaded from: classes7.dex */
public class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f73026x366c91de = 1347;

    /* renamed from: NAME */
    public static final java.lang.String f73027x24728b = "getLiteGameCapsuleWidgetRect";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        android.view.View findViewById = c0Var.t3().r0().findViewById(com.p314xaae8f345.mm.R.id.hqb);
        if (findViewById == null) {
            java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            c0Var.a(i17, u(str, jSONObject2));
            return;
        }
        int width = findViewById.getWidth();
        int height = findViewById.getHeight();
        int[] iArr = new int[2];
        findViewById.getLocationInWindow(iArr);
        int i18 = iArr[1];
        int i19 = iArr[0];
        android.graphics.Rect rect = new android.graphics.Rect(i19, i18, width + i19, height + i18);
        rect.left = ik1.w.e(rect.left);
        rect.top = ik1.w.e(rect.top);
        rect.right = ik1.w.e(rect.right);
        rect.bottom = ik1.w.e(rect.bottom);
        java.util.HashMap hashMap = new java.util.HashMap(6);
        hashMap.put("left", java.lang.Integer.valueOf(rect.left));
        hashMap.put("top", java.lang.Integer.valueOf(rect.top));
        hashMap.put("right", java.lang.Integer.valueOf(rect.right));
        hashMap.put("bottom", java.lang.Integer.valueOf(rect.bottom));
        hashMap.put("width", java.lang.Integer.valueOf(rect.width()));
        hashMap.put("height", java.lang.Integer.valueOf(rect.height()));
        java.lang.Object[] objArr = {c0Var.mo48798x74292566(), hashMap};
        int i27 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetLiteGameCapsuleWidgetRect", "get with appid:[%s], return %s", objArr);
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        hashMap.put("errno", 0);
        c0Var.a(i17, t("ok", hashMap));
    }
}
