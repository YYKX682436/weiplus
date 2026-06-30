package com.tencent.mm.matrix.report;

/* loaded from: classes12.dex */
public class DynamicMatrixReportBroadcast extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.matrix.report.DynamicMatrixReportBroadcast f68842a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            oj.j.b("Matrix.DynamicMatrixReportBroadcast", "MatrixReportBroadcast intent == null", new java.lang.Object[0]);
            return;
        }
        java.lang.String l17 = com.tencent.mm.sdk.platformtools.c2.l(intent, "tag");
        java.lang.String l18 = com.tencent.mm.sdk.platformtools.c2.l(intent, "key");
        int g17 = com.tencent.mm.sdk.platformtools.c2.g(intent, "type", 0);
        java.lang.String l19 = com.tencent.mm.sdk.platformtools.c2.l(intent, "value");
        java.lang.String l27 = com.tencent.mm.sdk.platformtools.c2.l(intent, com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        ri.d0 d0Var = new ri.d0();
        d0Var.f395860b = l17;
        d0Var.f395861c = l18;
        d0Var.f395859a = g17;
        try {
            d0Var.f395862d = new org.json.JSONObject(l19);
            jr0.l lVar = com.tencent.mm.matrix.o.INSTANCE.f68832d;
            if (lVar != null) {
                lVar.e(d0Var, l27);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("Matrix.DynamicMatrixReportBroadcast", "parse json error : " + th6.getMessage());
        }
    }
}
