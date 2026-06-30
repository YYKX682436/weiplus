package fw4;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final fw4.k f348636a = new fw4.k();

    public static final void a(fw4.k kVar, int i17, int i18, android.content.Intent intent, gw4.e eVar) {
        kVar.getClass();
        if (i17 != 1000 || intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("key_result_err_code", -1);
        java.lang.String stringExtra = intent.getStringExtra("key_result_err_msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NativeDownloadAppManager", "processActivityResult resultCode: " + i18 + ", errCode: " + intExtra + ", errMsg: " + stringExtra);
        if (intExtra == 0) {
            if (eVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanNewUI", "onDownloadSuccess");
            }
        } else if (intExtra != 2) {
            if (eVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanNewUI", "onDownloadFailed errCode: %d, errMsg: %s", java.lang.Integer.valueOf(intExtra), stringExtra);
            }
        } else if (eVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanNewUI", "onDownloadCancel");
        }
    }
}
