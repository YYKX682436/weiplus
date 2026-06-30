package com.tencent.mm.plugin.appbrand.jsapi;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class JsApiUploadWeRunData$UploadMiniAppStepTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.JsApiUploadWeRunData$UploadMiniAppStepTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.we();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.k0 f78651f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.l f78652g;

    /* renamed from: h, reason: collision with root package name */
    public final int f78653h;

    /* renamed from: i, reason: collision with root package name */
    public int f78654i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f78655m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f78656n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f78657o;

    public JsApiUploadWeRunData$UploadMiniAppStepTask(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, int i18, boolean z17) {
        this.f78651f = k0Var;
        this.f78652g = lVar;
        this.f78653h = i17;
        this.f78654i = i18;
        this.f78655m = z17;
        this.f78657o = lVar.getAppId();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f78654i = parcel.readInt();
        this.f78655m = parcel.readByte() != 0;
        this.f78656n = parcel.readByte() != 0;
        this.f78657o = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f78654i);
        parcel.writeByte(this.f78655m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f78656n ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f78657o);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        boolean z17 = this.f78656n;
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f78651f;
        int i17 = this.f78653h;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f78652g;
        if (z17) {
            lVar.a(i17, k0Var.o("ok"));
        } else {
            lVar.a(i17, k0Var.o("fail"));
        }
        x();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        long a17 = c01.id.a();
        long j17 = a17 / 1000;
        if (a17 == 0) {
            a17 = java.lang.System.currentTimeMillis();
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.ju6 ju6Var = new r45.ju6();
        lVar.f70664a = ju6Var;
        lVar.f70665b = new r45.ku6();
        lVar.f70666c = "/cgi-bin/mmoc-bin/hardware/uploadminiappstep";
        lVar.f70667d = 1949;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        ju6Var.f378118d = this.f78657o;
        ju6Var.f378119e = this.f78654i;
        ju6Var.f378120f = this.f78655m;
        ju6Var.f378121g = (int) (a17 / 1000);
        com.tencent.mm.modelbase.z2.d(lVar.a(), new com.tencent.mm.plugin.appbrand.jsapi.ve(this), true);
    }

    public JsApiUploadWeRunData$UploadMiniAppStepTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
