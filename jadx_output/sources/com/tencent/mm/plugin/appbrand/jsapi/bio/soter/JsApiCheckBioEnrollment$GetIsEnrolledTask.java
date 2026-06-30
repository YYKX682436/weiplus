package com.tencent.mm.plugin.appbrand.jsapi.bio.soter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class JsApiCheckBioEnrollment$GetIsEnrolledTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiCheckBioEnrollment$GetIsEnrolledTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.bio.soter.b();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.l f79880f;

    /* renamed from: g, reason: collision with root package name */
    public final int f79881g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.bio.soter.c f79882h;

    /* renamed from: i, reason: collision with root package name */
    public int f79883i;

    /* renamed from: m, reason: collision with root package name */
    public int f79884m;

    public JsApiCheckBioEnrollment$GetIsEnrolledTask(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, int i18, com.tencent.mm.plugin.appbrand.jsapi.bio.soter.c cVar) {
        this.f79880f = null;
        this.f79881g = -1;
        this.f79884m = -1;
        this.f79880f = lVar;
        this.f79881g = i17;
        this.f79882h = cVar;
        this.f79883i = i18;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        super.v(parcel);
        this.f79884m = parcel.readInt();
        this.f79883i = parcel.readInt();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeInt(this.f79884m);
        parcel.writeInt(this.f79883i);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        super.y();
        java.util.HashMap hashMap = new java.util.HashMap(2);
        hashMap.put("isEnrolled", java.lang.Boolean.valueOf(this.f79884m == 1));
        int i17 = this.f79884m;
        com.tencent.mm.plugin.appbrand.jsapi.bio.soter.c cVar = this.f79882h;
        int i18 = this.f79881g;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f79880f;
        if (i17 == 0) {
            lVar.a(i18, cVar.p("ok", hashMap));
        } else if (i17 == -1) {
            lVar.a(i18, cVar.p("fail not support", hashMap));
        } else if (i17 == 1) {
            lVar.a(i18, cVar.p("ok", hashMap));
        } else {
            lVar.a(i18, cVar.p("fail unknown error", hashMap));
        }
        x();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mm.autogen.events.GetIsEnrolledEvent getIsEnrolledEvent = new com.tencent.mm.autogen.events.GetIsEnrolledEvent();
        getIsEnrolledEvent.f54398g.f8560a = this.f79883i;
        getIsEnrolledEvent.e();
        int i17 = getIsEnrolledEvent.f54399h.f6153a;
        this.f79884m = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.GetIsEnrolledTask", "hy: enrollResult: %d", java.lang.Integer.valueOf(i17));
        c();
    }

    public JsApiCheckBioEnrollment$GetIsEnrolledTask(android.os.Parcel parcel) {
        this.f79880f = null;
        this.f79881g = -1;
        this.f79883i = -1;
        this.f79884m = -1;
        v(parcel);
    }
}
