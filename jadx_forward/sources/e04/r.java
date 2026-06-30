package e04;

/* loaded from: classes9.dex */
public class r implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f327609a;

    public r(e04.p pVar, android.content.Context context) {
        this.f327609a = context;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r
    /* renamed from: onDispatch */
    public boolean mo9541xb6136779(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        if (str.equals("finishAndBack")) {
            boolean optBoolean = ((org.json.JSONObject) obj).optBoolean("toScan", false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarStringHandler", "finish send hongbao, toScan = %s.", java.lang.Boolean.valueOf(optBoolean));
            if (optBoolean) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("BaseScanUI_qrcode_right_btn_direct_album", true);
                intent.putExtra("key_scan_report_enter_scene", 32);
                intent.putExtra("key_config_black_interval", true);
                intent.putExtra("key_enable_multi_code", true);
                intent.putExtra("key_scan_goods_enable_dynamic_wording", true);
                intent.putExtra("key_enable_scan_code_product_merge", true);
                j45.l.j(this.f327609a, "scanner", ".ui.BaseScanUI", intent, null);
            }
        }
        return false;
    }
}
