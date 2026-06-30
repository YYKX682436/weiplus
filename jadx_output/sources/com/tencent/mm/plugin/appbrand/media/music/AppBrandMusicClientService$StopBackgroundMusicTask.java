package com.tencent.mm.plugin.appbrand.media.music;

/* loaded from: classes11.dex */
class AppBrandMusicClientService$StopBackgroundMusicTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.media.music.AppBrandMusicClientService$StopBackgroundMusicTask> CREATOR = new com.tencent.mm.plugin.appbrand.media.music.c();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f85756f;

    public AppBrandMusicClientService$StopBackgroundMusicTask() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f85756f = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f85756f);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        boolean d17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMusicClientService", "runInMainProcess");
        com.tencent.mm.plugin.appbrand.media.music.h hVar = com.tencent.mm.plugin.appbrand.media.music.f.f85760a;
        java.lang.String str = hVar.f85761a;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !str.equals(this.f85756f)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMusicClientService", "appid not match cannot operate, preAppId:%s, appId:%s", str, this.f85756f);
            c();
            return;
        }
        if (!hVar.c(this.f85756f)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMusicClientService", "appid not match cannot operate, can't not stop, preAppId:%s, appId:%s", str, this.f85756f);
            c();
            return;
        }
        if ((hVar.f85764d == null || hVar.f85765e == null) ? false : true) {
            ((com.tencent.mm.plugin.appbrand.jsapi.audio.p3) hVar.f85765e).getClass();
            d17 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).zj();
        } else {
            d17 = b21.n.d();
        }
        if (d17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMusicClientService", "stop music ok");
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandMusicClientService", "stop music fail");
        }
        c();
    }

    public AppBrandMusicClientService$StopBackgroundMusicTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
