package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class q4 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 983;
    private static final java.lang.String NAME = "checkStrangerContactListIsFriend";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject data, int i17) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCheckStrangerIsFriend", "invoke JsApiCheckStrangerIsFriend! " + data);
        if ((lVar != null ? lVar.getContext() : null) == null) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        org.json.JSONObject optJSONObject = data.optJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        bundle.putString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_DATE, optJSONObject != null ? optJSONObject.toString() : null);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.appbrand.jsapi.o4.class, new com.tencent.mm.plugin.appbrand.jsapi.p4(lVar, i17, this));
    }
}
