package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/luggage/export/functionalpage/WechatNativeExtraDataInvokeFunctionalPage;", "Landroid/os/Parcelable;", "Ll81/p0;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class WechatNativeExtraDataInvokeFunctionalPage implements android.os.Parcelable, l81.p0 {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage> CREATOR = new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.n0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f85558d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f85559e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f85560f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f85561g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f85562h;

    /* renamed from: i, reason: collision with root package name */
    public int f85563i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f85564m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f85565n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f85566o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f85567p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f85568q;

    /* renamed from: r, reason: collision with root package name */
    public int f85569r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f85570s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f85571t;

    public WechatNativeExtraDataInvokeFunctionalPage(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, int i17, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, int i18, java.lang.String str10, java.lang.String str11) {
        this.f85558d = str;
        this.f85559e = str2;
        this.f85560f = str3;
        this.f85561g = str4;
        this.f85562h = z17;
        this.f85563i = i17;
        this.f85564m = str5;
        this.f85565n = str6;
        this.f85566o = str7;
        this.f85567p = str8;
        this.f85568q = str9;
        this.f85569r = i18;
        this.f85570s = str10;
        this.f85571t = str11;
    }

    @Override // l81.p0
    public java.lang.String a() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("invokeTicket", this.f85558d);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, this.f85559e);
            jSONObject.put("args", this.f85560f);
            jSONObject.put("jsapiType", this.f85561g);
            jSONObject.put("isGame", this.f85562h);
            jSONObject.put("wxa_scene", this.f85563i);
            jSONObject.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME, this.f85564m);
            jSONObject.put("callbackActivity", this.f85565n);
            jSONObject.put("transitiveData", this.f85566o);
            jSONObject.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, this.f85567p);
            jSONObject.put("instanceId", this.f85568q);
            jSONObject.put("debugMode", this.f85569r);
            jSONObject.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f85570s);
            jSONObject.put("currentH5Url", this.f85571t);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.d(jSONObject2);
            return jSONObject2;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.WechatNativeExtraDataInvokeFunctionalPage", e17, "", new java.lang.Object[0]);
            return "{}";
        }
    }

    public final void b(org.json.JSONObject obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        this.f85558d = obj.getString("invokeTicket");
        this.f85559e = obj.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
        this.f85564m = obj.getString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME);
        this.f85560f = obj.getString("args");
        this.f85561g = obj.getString("jsapiType");
        this.f85562h = obj.optBoolean("isGame");
        this.f85563i = obj.getInt("wxa_scene");
        this.f85565n = obj.getString("callbackActivity");
        this.f85566o = obj.optString("transitiveData");
        this.f85567p = obj.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
        this.f85568q = obj.optString("instanceId");
        this.f85569r = obj.optInt("debugMode");
        this.f85570s = obj.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        this.f85571t = obj.optString("currentH5Url");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f85558d);
        out.writeString(this.f85559e);
        out.writeString(this.f85560f);
        out.writeString(this.f85561g);
        out.writeInt(this.f85562h ? 1 : 0);
        out.writeInt(this.f85563i);
        out.writeString(this.f85564m);
        out.writeString(this.f85565n);
        out.writeString(this.f85566o);
        out.writeString(this.f85567p);
        out.writeString(this.f85568q);
        out.writeInt(this.f85569r);
        out.writeString(this.f85570s);
        out.writeString(this.f85571t);
    }

    public /* synthetic */ WechatNativeExtraDataInvokeFunctionalPage(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, int i17, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, int i18, java.lang.String str10, java.lang.String str11, int i19, kotlin.jvm.internal.i iVar) {
        this((i19 & 1) != 0 ? null : str, (i19 & 2) != 0 ? null : str2, (i19 & 4) != 0 ? null : str3, (i19 & 8) != 0 ? null : str4, (i19 & 16) != 0 ? false : z17, (i19 & 32) != 0 ? 0 : i17, (i19 & 64) != 0 ? null : str5, (i19 & 128) != 0 ? null : str6, (i19 & 256) != 0 ? null : str7, (i19 & 512) != 0 ? null : str8, (i19 & 1024) != 0 ? null : str9, (i19 & 2048) == 0 ? i18 : 0, (i19 & 4096) != 0 ? null : str10, (i19 & 8192) == 0 ? str11 : null);
    }
}
