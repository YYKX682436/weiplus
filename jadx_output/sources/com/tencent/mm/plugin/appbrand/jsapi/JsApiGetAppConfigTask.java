package com.tencent.mm.plugin.appbrand.jsapi;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class JsApiGetAppConfigTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.JsApiGetAppConfigTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.z5();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f78517f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f78518g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f78519h;

    /* renamed from: i, reason: collision with root package name */
    public int f78520i;

    /* renamed from: m, reason: collision with root package name */
    public int f78521m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Runnable f78522n;

    public JsApiGetAppConfigTask() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f78517f = parcel.readString();
        this.f78518g = parcel.readString();
        this.f78519h = parcel.readString();
        this.f78520i = parcel.readInt();
        this.f78521m = parcel.readInt();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f78517f);
        parcel.writeString(this.f78518g);
        parcel.writeString(this.f78519h);
        parcel.writeInt(this.f78520i);
        parcel.writeInt(this.f78521m);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        java.lang.Runnable runnable = this.f78522n;
        if (runnable != null) {
            ((com.tencent.mm.plugin.appbrand.jsapi.w5) runnable).run();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        if (gm0.j1.b().f273254q) {
            android.util.Pair y07 = ((t81.b) com.tencent.mm.plugin.appbrand.app.r9.fj(t81.b.class)).y0("appId", this.f78517f, 4, this.f78521m);
            if (((java.lang.Boolean) y07.first).booleanValue()) {
                r81.f.INSTANCE.b(((java.lang.Integer) y07.second).intValue(), 166);
            }
            k91.r1.a(this.f78517f, this.f78520i, 0, new com.tencent.mm.plugin.appbrand.jsapi.y5(this), !((java.lang.Boolean) y07.first).booleanValue());
        }
    }

    public JsApiGetAppConfigTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
