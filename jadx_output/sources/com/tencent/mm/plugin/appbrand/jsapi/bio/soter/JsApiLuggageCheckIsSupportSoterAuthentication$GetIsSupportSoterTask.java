package com.tencent.mm.plugin.appbrand.jsapi.bio.soter;

/* loaded from: classes15.dex */
class JsApiLuggageCheckIsSupportSoterAuthentication$GetIsSupportSoterTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiLuggageCheckIsSupportSoterAuthentication$GetIsSupportSoterTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.bio.soter.h();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.l f79894f;

    /* renamed from: g, reason: collision with root package name */
    public final int f79895g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.bio.soter.i f79896h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f79897i;

    public JsApiLuggageCheckIsSupportSoterAuthentication$GetIsSupportSoterTask(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.bio.soter.i iVar) {
        this.f79894f = null;
        this.f79895g = -1;
        this.f79897i = "";
        this.f79894f = lVar;
        this.f79895g = i17;
        this.f79896h = iVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        super.v(parcel);
        this.f79897i = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeString(this.f79897i);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        super.y();
        java.util.HashMap hashMap = new java.util.HashMap(2);
        hashMap.put("verifyRemote", this.f79897i);
        hashMap.put("nativeSupport", java.lang.Boolean.valueOf(wt5.a.l()));
        com.tencent.mars.xlog.Log.i("MicroMsg.GetIsSupportSoterTask", "hy: nativeSupport:" + wt5.a.l());
        this.f79894f.a(this.f79895g, this.f79896h.p("ok", hashMap));
        x();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        java.lang.String b17 = wt5.a.b();
        this.f79897i = b17;
        com.tencent.mars.xlog.Log.i("MicroMsg.GetIsSupportSoterTask", "hy: verifyRemoteStr: %s", b17);
        c();
    }

    public JsApiLuggageCheckIsSupportSoterAuthentication$GetIsSupportSoterTask(android.os.Parcel parcel) {
        this.f79894f = null;
        this.f79895g = -1;
        this.f79897i = "";
        v(parcel);
    }
}
