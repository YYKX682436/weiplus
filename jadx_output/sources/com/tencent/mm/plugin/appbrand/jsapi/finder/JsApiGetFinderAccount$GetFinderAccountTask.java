package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class JsApiGetFinderAccount$GetFinderAccountTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiGetFinderAccount$GetFinderAccountTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.finder.o();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.e9 f81158f;

    /* renamed from: g, reason: collision with root package name */
    public final int f81159g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f81160h;

    public JsApiGetFinderAccount$GetFinderAccountTask(com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f81158f = e9Var;
        this.f81159g = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f81160h = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f81160h);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f81158f;
        java.lang.String appId = e9Var.getAppId();
        java.lang.String str = this.f81160h;
        int i17 = this.f81159g;
        com.tencent.mars.xlog.Log.i("MicroMsg.Finder.JsApiGetFinderAccount", "runInClientProcess callback, appId[%s], msg[%s], callbackId[%d], isRunning[%b]", appId, str, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(e9Var.isRunning()));
        e9Var.a(i17, this.f81160h);
        x();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).getClass();
        g92.b.f269769e.u2("JsApiGetFinderAccount").l().K(new com.tencent.mm.plugin.appbrand.jsapi.finder.n(this));
    }

    public JsApiGetFinderAccount$GetFinderAccountTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
