package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class JsApiFetchSendingAndFailProfileFeed$FetchSendingAndFailProfileFeedTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiFetchSendingAndFailProfileFeed$FetchSendingAndFailProfileFeedTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.finder.h();

    /* renamed from: f, reason: collision with root package name */
    public final int f81154f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.e9 f81155g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f81156h;

    public JsApiFetchSendingAndFailProfileFeed$FetchSendingAndFailProfileFeedTask(int i17, com.tencent.mm.plugin.appbrand.e9 e9Var) {
        this.f81154f = i17;
        this.f81155g = e9Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f81156h = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f81156h);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        org.json.JSONObject optJSONObject;
        org.json.JSONArray optJSONArray;
        org.json.JSONArray jSONArray;
        org.json.JSONArray jSONArray2;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(this.f81156h);
            org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            if (optJSONArray2 != null) {
                int i17 = 0;
                while (i17 < optJSONArray2.length()) {
                    org.json.JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i17);
                    if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("objectDesc")) != null && (optJSONArray = optJSONObject.optJSONArray("media")) != null) {
                        int i18 = 0;
                        for (optJSONArray = optJSONObject.optJSONArray("media"); i18 < optJSONArray.length(); optJSONArray = jSONArray2) {
                            org.json.JSONObject optJSONObject3 = optJSONArray.optJSONObject(i18);
                            if (optJSONObject3 != null) {
                                java.lang.String optString = optJSONObject3.optString("url");
                                java.lang.String optString2 = optJSONObject3.optString("thumbUrl");
                                boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(optString);
                                com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
                                if (K0 || optString.startsWith("http")) {
                                    jSONArray = optJSONArray2;
                                    jSONArray2 = optJSONArray;
                                } else {
                                    ik1.b0 b0Var = new ik1.b0();
                                    jSONArray = optJSONArray2;
                                    jSONArray2 = optJSONArray;
                                    if (this.f81155g.getFileSystem().createTempFileFrom(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(optString)), null, false, b0Var) == j1Var) {
                                        optJSONObject3.put("url", b0Var.f291824a);
                                    }
                                }
                                if (!com.tencent.mm.sdk.platformtools.t8.K0(optString2) && !optString2.startsWith("http")) {
                                    ik1.b0 b0Var2 = new ik1.b0();
                                    if (this.f81155g.getFileSystem().createTempFileFrom(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(optString2)), null, false, b0Var2) == j1Var) {
                                        optJSONObject3.put("thumbUrl", b0Var2.f291824a);
                                    }
                                    i18++;
                                    optJSONArray2 = jSONArray;
                                }
                            } else {
                                jSONArray = optJSONArray2;
                                jSONArray2 = optJSONArray;
                            }
                            i18++;
                            optJSONArray2 = jSONArray;
                        }
                    }
                    i17++;
                    optJSONArray2 = optJSONArray2;
                }
            }
            this.f81156h = jSONObject.toString();
        } catch (java.lang.Exception e17) {
            java.lang.String message = e17.getMessage();
            org.json.JSONArray jSONArray3 = new org.json.JSONArray();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errMsg", message);
                jSONObject2.put("errCode", -1);
                jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONArray3);
            } catch (java.lang.Exception unused) {
            }
            this.f81156h = jSONObject2.toString();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Finder.JsApiFetchSendingAndFailProfileFeed", "runInClientProcess callback, appId[%s], msg[%s], callbackId[%d], isRunning[%b]", this.f81155g.getAppId(), this.f81156h, java.lang.Integer.valueOf(this.f81154f), java.lang.Boolean.valueOf(this.f81155g.isRunning()));
        this.f81155g.a(this.f81154f, this.f81156h);
        x();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.appbrand.jsapi.finder.i(this), "JsApiFetchSendingAndFailProfileFeed");
    }

    public JsApiFetchSendingAndFailProfileFeed$FetchSendingAndFailProfileFeedTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
