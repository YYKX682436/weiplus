package com.tencent.mm.plugin.appbrand.jsapi.scanner;

/* loaded from: classes7.dex */
public class JsApiScanCode$GetA8KeyTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiScanCode$GetA8KeyTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.scanner.o();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f82936f;

    /* renamed from: g, reason: collision with root package name */
    public int f82937g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f82938h;

    /* renamed from: i, reason: collision with root package name */
    public int f82939i;

    /* renamed from: m, reason: collision with root package name */
    public int f82940m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Runnable f82941n;

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f82936f = parcel.readString();
        this.f82937g = parcel.readInt();
        this.f82938h = parcel.readString();
        this.f82939i = parcel.readInt();
        this.f82940m = parcel.readInt();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f82936f);
        parcel.writeInt(this.f82937g);
        parcel.writeString(this.f82938h);
        parcel.writeInt(this.f82939i);
        parcel.writeInt(this.f82940m);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        java.lang.Runnable runnable = this.f82941n;
        if (runnable != null) {
            ((com.tencent.mm.plugin.appbrand.jsapi.scanner.l) runnable).run();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        w60.k wi6 = ((v60.u) ((w60.j) i95.n0.c(w60.j.class))).wi(this.f82936f, null, 36, 0, this.f82939i, this.f82940m, null, o45.cg.a(), new byte[0]);
        com.tencent.mm.modelbase.z2.d(((com.tencent.mm.modelsimple.k0) wi6).f71356e, new com.tencent.mm.plugin.appbrand.jsapi.scanner.n(this, wi6), true);
    }
}
