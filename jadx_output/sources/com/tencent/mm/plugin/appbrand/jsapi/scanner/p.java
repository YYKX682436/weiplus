package com.tencent.mm.plugin.appbrand.jsapi.scanner;

/* loaded from: classes.dex */
public class p extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 148;
    public static final java.lang.String NAME = "scanCode";

    /* renamed from: g, reason: collision with root package name */
    public static volatile boolean f82971g;

    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0085. Please report as an issue. */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        int[] iArr;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        if (f82971g) {
            c0Var.a(i17, o("cancel"));
            return;
        }
        f82971g = true;
        android.app.Activity Z0 = c0Var.Z0();
        if (Z0 == null) {
            c0Var.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        nf.g.a(Z0).f(new com.tencent.mm.plugin.appbrand.jsapi.scanner.m(this, c0Var, i17));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("BaseScanUI_select_scan_mode", 1);
        intent.putExtra("key_show_scan_tips", false);
        intent.putExtra("BaseScanUI_only_scan_qrcode_with_zbar", true);
        intent.putExtra("key_set_result_after_scan", true);
        intent.putExtra("key_is_hide_right_btn", jSONObject.optBoolean("onlyFromCamera", false));
        intent.putExtra("key_for_jsapi_use", true);
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("scanType");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            iArr = new int[]{2, 1, 3};
        } else {
            iArr = new int[optJSONArray.length()];
            for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
                java.lang.String optString = optJSONArray.optString(i18);
                optString.getClass();
                char c17 = 65535;
                switch (optString.hashCode()) {
                    case -993060056:
                        if (optString.equals("pdf417")) {
                            c17 = 0;
                            break;
                        }
                        break;
                    case -952485970:
                        if (optString.equals("qrCode")) {
                            c17 = 1;
                            break;
                        }
                        break;
                    case -775169938:
                        if (optString.equals("wxCode")) {
                            c17 = 2;
                            break;
                        }
                        break;
                    case -334537568:
                        if (optString.equals("barCode")) {
                            c17 = 3;
                            break;
                        }
                        break;
                    case 2003869675:
                        if (optString.equals("datamatrix")) {
                            c17 = 4;
                            break;
                        }
                        break;
                }
                switch (c17) {
                    case 0:
                        iArr[i18] = 4;
                        break;
                    case 1:
                        iArr[i18] = 2;
                        break;
                    case 2:
                        iArr[i18] = 3;
                        break;
                    case 3:
                        iArr[i18] = 1;
                        break;
                    case 4:
                        iArr[i18] = 5;
                        break;
                }
            }
        }
        intent.putExtra("key_support_scan_code_type", iArr);
        intent.putExtra("key_enable_multi_code", true);
        intent.putExtra("key_scan_report_enter_scene", 9);
        j45.l.o(Z0, "scanner", ".ui.BaseScanUI", intent, hashCode() & 65535, false);
    }
}
