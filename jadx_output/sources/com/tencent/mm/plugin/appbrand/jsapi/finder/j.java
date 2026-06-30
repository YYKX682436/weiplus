package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes7.dex */
public class j extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "fetchSendingAndFailProfileFeed";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Finder.JsApiFetchSendingAndFailProfileFeed", "JsApiFetchSendingAndFailProfileFeed");
        new com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiFetchSendingAndFailProfileFeed$FetchSendingAndFailProfileFeedTask(i17, (com.tencent.mm.plugin.appbrand.e9) lVar).d();
    }
}
