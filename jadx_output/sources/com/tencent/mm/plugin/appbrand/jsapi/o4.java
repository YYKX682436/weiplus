package com.tencent.mm.plugin.appbrand.jsapi;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/o4;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class o4 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r callback) {
        org.json.JSONObject jSONObject;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        kotlin.jvm.internal.o.g(callback, "callback");
        android.os.Bundle bundle2 = new android.os.Bundle();
        if (bundle == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCCheckStrangerRequest", "data is null");
            bundle2.putString("resJo", "fail:IPCCheckStrangerRequest data is null");
            callback.a(bundle2);
        } else {
            if (!gm0.j1.b().n()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.IPCCheckStrangerRequest", "handleRequest, MMKernel.account().hasLogin() is false");
                return;
            }
            try {
                jSONObject = new org.json.JSONObject(bundle.getString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_DATE));
            } catch (java.lang.Throwable unused) {
                jSONObject = null;
            }
            pm0.v.L("MicroMsg.IPCCheckStrangerRequest", true, new com.tencent.mm.plugin.appbrand.jsapi.n4(jSONObject, bundle2, callback));
        }
    }
}
