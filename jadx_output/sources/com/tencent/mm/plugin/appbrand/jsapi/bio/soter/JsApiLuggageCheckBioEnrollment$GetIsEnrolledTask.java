package com.tencent.mm.plugin.appbrand.jsapi.bio.soter;

/* loaded from: classes.dex */
class JsApiLuggageCheckBioEnrollment$GetIsEnrolledTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiLuggageCheckBioEnrollment$GetIsEnrolledTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.bio.soter.f();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.l f79889f;

    /* renamed from: g, reason: collision with root package name */
    public final int f79890g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.bio.soter.g f79891h;

    /* renamed from: i, reason: collision with root package name */
    public int f79892i;

    /* renamed from: m, reason: collision with root package name */
    public int f79893m;

    public JsApiLuggageCheckBioEnrollment$GetIsEnrolledTask(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, int i18, com.tencent.mm.plugin.appbrand.jsapi.bio.soter.g gVar) {
        this.f79889f = null;
        this.f79890g = -1;
        this.f79893m = -1;
        this.f79889f = lVar;
        this.f79890g = i17;
        this.f79891h = gVar;
        this.f79892i = i18;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        super.v(parcel);
        this.f79893m = parcel.readInt();
        this.f79892i = parcel.readInt();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeInt(this.f79893m);
        parcel.writeInt(this.f79892i);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        super.y();
        java.util.HashMap hashMap = new java.util.HashMap(2);
        hashMap.put("isEnrolled", java.lang.Boolean.valueOf(this.f79893m == 1));
        int i17 = this.f79893m;
        com.tencent.mm.plugin.appbrand.jsapi.bio.soter.g gVar = this.f79891h;
        int i18 = this.f79890g;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f79889f;
        if (i17 == 0) {
            lVar.a(i18, gVar.p("ok", hashMap));
        } else if (i17 == -1) {
            lVar.a(i18, gVar.p("fail not support", hashMap));
        } else if (i17 == 1) {
            lVar.a(i18, gVar.p("ok", hashMap));
        } else {
            lVar.a(i18, gVar.p("fail unknown error", hashMap));
        }
        x();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        android.content.Context context = com.tencent.mm.plugin.appbrand.jsapi.bio.soter.g.f79900h;
        int i17 = 1;
        if (this.f79892i != 1) {
            i17 = -1;
        } else if (!wt5.a.p(context)) {
            i17 = 0;
        }
        this.f79893m = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.GetIsEnrolledTask", "hy: enrollResult: %d", java.lang.Integer.valueOf(i17));
        c();
    }

    public JsApiLuggageCheckBioEnrollment$GetIsEnrolledTask(android.os.Parcel parcel) {
        this.f79889f = null;
        this.f79890g = -1;
        this.f79892i = -1;
        this.f79893m = -1;
        v(parcel);
    }
}
