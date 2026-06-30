package com.p314xaae8f345.mm.p849xbf8d97c1.p855xc84c5534;

/* renamed from: com.tencent.mm.matrix.report.DynamicMatrixReportBroadcast */
/* loaded from: classes12.dex */
public class C10886x75fec50d extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p849xbf8d97c1.p855xc84c5534.C10886x75fec50d f150375a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            oj.j.b("Matrix.DynamicMatrixReportBroadcast", "MatrixReportBroadcast intent == null", new java.lang.Object[0]);
            return;
        }
        java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "tag");
        java.lang.String l18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "key");
        int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(intent, "type", 0);
        java.lang.String l19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "value");
        java.lang.String l27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1);
        ri.d0 d0Var = new ri.d0();
        d0Var.f477393b = l17;
        d0Var.f477394c = l18;
        d0Var.f477392a = g17;
        try {
            d0Var.f477395d = new org.json.JSONObject(l19);
            jr0.l lVar = com.p314xaae8f345.mm.p849xbf8d97c1.o.INSTANCE.f150365d;
            if (lVar != null) {
                lVar.e(d0Var, l27);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Matrix.DynamicMatrixReportBroadcast", "parse json error : " + th6.getMessage());
        }
    }
}
