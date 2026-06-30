package com.tencent.mm.plugin.appbrand.jsapi.bio.soter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class JsApiCheckIsSupportSoterAuthentication$GetIsSupportSoterTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiCheckIsSupportSoterAuthentication$GetIsSupportSoterTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.bio.soter.d();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.l f79885f;

    /* renamed from: g, reason: collision with root package name */
    public final int f79886g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.bio.soter.e f79887h;

    /* renamed from: i, reason: collision with root package name */
    public int f79888i;

    public JsApiCheckIsSupportSoterAuthentication$GetIsSupportSoterTask(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.bio.soter.e eVar) {
        this.f79885f = null;
        this.f79886g = -1;
        this.f79888i = 0;
        this.f79885f = lVar;
        this.f79886g = i17;
        this.f79887h = eVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        super.v(parcel);
        this.f79888i = parcel.readInt();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeInt(this.f79888i);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        super.y();
        java.util.HashMap hashMap = new java.util.HashMap(2);
        hashMap.put("supportMode", com.tencent.mm.plugin.appbrand.jsapi.bio.soter.a.b(this.f79888i));
        this.f79885f.a(this.f79886g, this.f79887h.p("ok", hashMap));
        x();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mm.autogen.events.GetIsSupportSoterEvent getIsSupportSoterEvent = new com.tencent.mm.autogen.events.GetIsSupportSoterEvent();
        getIsSupportSoterEvent.e();
        int i17 = getIsSupportSoterEvent.f54401g.f6352a;
        this.f79888i = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.GetIsSupportSoterTask", "hy: supportMode: %d", java.lang.Integer.valueOf(i17));
        c();
    }

    public JsApiCheckIsSupportSoterAuthentication$GetIsSupportSoterTask(android.os.Parcel parcel) {
        this.f79885f = null;
        this.f79886g = -1;
        this.f79888i = 0;
        v(parcel);
    }
}
