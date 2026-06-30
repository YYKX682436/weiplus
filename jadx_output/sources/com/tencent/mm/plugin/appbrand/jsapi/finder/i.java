package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes7.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiFetchSendingAndFailProfileFeed$FetchSendingAndFailProfileFeedTask f81208d;

    public i(com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiFetchSendingAndFailProfileFeed$FetchSendingAndFailProfileFeedTask jsApiFetchSendingAndFailProfileFeed$FetchSendingAndFailProfileFeedTask) {
        this.f81208d = jsApiFetchSendingAndFailProfileFeed$FetchSendingAndFailProfileFeedTask;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.List D0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Pj().D0();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = ((java.util.ArrayList) D0).iterator();
        while (it.hasNext()) {
            dm.i4 i4Var = (dm.i4) it.next();
            try {
                org.json.JSONObject b17 = pm0.b0.b(i4Var.field_finderObject);
                b17.put("status", i4Var.field_localFlag);
                b17.put("feedLocalId", java.lang.String.valueOf(i4Var.systemRowid));
                jSONArray.put(b17);
            } catch (java.lang.Exception unused) {
            }
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errMsg", "");
            jSONObject.put("errCode", 0);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONArray);
        } catch (java.lang.Exception unused2) {
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiFetchSendingAndFailProfileFeed$FetchSendingAndFailProfileFeedTask jsApiFetchSendingAndFailProfileFeed$FetchSendingAndFailProfileFeedTask = this.f81208d;
        jsApiFetchSendingAndFailProfileFeed$FetchSendingAndFailProfileFeedTask.f81156h = jSONObject2;
        jsApiFetchSendingAndFailProfileFeed$FetchSendingAndFailProfileFeedTask.c();
    }
}
