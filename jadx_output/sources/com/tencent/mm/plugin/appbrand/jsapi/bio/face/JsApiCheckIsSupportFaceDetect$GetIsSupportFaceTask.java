package com.tencent.mm.plugin.appbrand.jsapi.bio.face;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class JsApiCheckIsSupportFaceDetect$GetIsSupportFaceTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect$GetIsSupportFaceTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.bio.face.a();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.l f79857f;

    /* renamed from: g, reason: collision with root package name */
    public final int f79858g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.bio.face.b f79859h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f79860i;

    /* renamed from: m, reason: collision with root package name */
    public int f79861m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f79862n;

    /* renamed from: o, reason: collision with root package name */
    public int f79863o;

    public JsApiCheckIsSupportFaceDetect$GetIsSupportFaceTask(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.bio.face.b bVar) {
        this.f79857f = null;
        this.f79858g = -1;
        this.f79860i = false;
        this.f79861m = -1;
        this.f79862n = "not returned";
        this.f79863o = -1;
        this.f79857f = lVar;
        this.f79858g = i17;
        this.f79859h = bVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        super.v(parcel);
        this.f79860i = parcel.readByte() != 0;
        this.f79861m = parcel.readInt();
        this.f79862n = parcel.readString();
        this.f79863o = parcel.readInt();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeByte(this.f79860i ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f79861m);
        parcel.writeString(this.f79862n);
        parcel.writeInt(this.f79863o);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        super.y();
        java.util.HashMap hashMap = new java.util.HashMap(3);
        hashMap.put("errCode", java.lang.Integer.valueOf(this.f79861m));
        hashMap.put("libVersionCode", java.lang.Integer.valueOf(this.f79863o));
        int i17 = this.f79861m;
        com.tencent.mm.plugin.appbrand.jsapi.bio.face.b bVar = this.f79859h;
        int i18 = this.f79858g;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f79857f;
        if (i17 == 0) {
            lVar.a(i18, bVar.p("ok", hashMap));
        } else {
            lVar.a(i18, bVar.p("fail " + this.f79862n, hashMap));
        }
        x();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mm.autogen.events.GetIsSupportFaceEvent getIsSupportFaceEvent = new com.tencent.mm.autogen.events.GetIsSupportFaceEvent();
        getIsSupportFaceEvent.e();
        am.bg bgVar = getIsSupportFaceEvent.f54400g;
        boolean z17 = bgVar.f6251a;
        this.f79860i = z17;
        this.f79861m = bgVar.f6252b;
        this.f79862n = bgVar.f6253c;
        this.f79863o = bgVar.f6254d;
        com.tencent.mars.xlog.Log.i("MicroMsg.GetIsSupportFaceTask", "hy: is support: %b, errCode: %d, errMsg: %s, ilbVersion: %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f79861m), this.f79862n, java.lang.Integer.valueOf(this.f79863o));
        c();
    }

    public JsApiCheckIsSupportFaceDetect$GetIsSupportFaceTask(android.os.Parcel parcel) {
        this.f79857f = null;
        this.f79858g = -1;
        this.f79860i = false;
        this.f79861m = -1;
        this.f79862n = "not returned";
        this.f79863o = -1;
        v(parcel);
    }
}
