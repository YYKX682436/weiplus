package b64;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb64/b;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class b extends com.tencent.mm.plugin.lite.api.p {
    public final void A(com.tencent.mm.plugin.lite.api.o oVar, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fail", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppJsApiAdBase");
        try {
            oVar.a(str);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.ApiBase", "callback has something wrong " + th6.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fail", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppJsApiAdBase");
    }

    public abstract java.lang.String B();

    /* JADX WARN: Removed duplicated region for block: B:32:0x0139 A[Catch: all -> 0x015b, TryCatch #0 {all -> 0x015b, blocks: (B:14:0x0041, B:16:0x004d, B:18:0x005e, B:20:0x006e, B:22:0x00b0, B:23:0x00bc, B:25:0x00c7, B:26:0x00f6, B:28:0x0104, B:30:0x0122, B:32:0x0139, B:34:0x0142, B:38:0x010e, B:40:0x0112, B:41:0x0118, B:42:0x00d8, B:44:0x00e0, B:45:0x00f1, B:47:0x0052), top: B:13:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0142 A[Catch: all -> 0x015b, TRY_LEAVE, TryCatch #0 {all -> 0x015b, blocks: (B:14:0x0041, B:16:0x004d, B:18:0x005e, B:20:0x006e, B:22:0x00b0, B:23:0x00bc, B:25:0x00c7, B:26:0x00f6, B:28:0x0104, B:30:0x0122, B:32:0x0139, B:34:0x0142, B:38:0x010e, B:40:0x0112, B:41:0x0118, B:42:0x00d8, B:44:0x00e0, B:45:0x00f1, B:47:0x0052), top: B:13:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013f  */
    @Override // jd.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r20, org.json.JSONObject r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b64.b.a(java.lang.String, org.json.JSONObject, boolean):void");
    }
}
