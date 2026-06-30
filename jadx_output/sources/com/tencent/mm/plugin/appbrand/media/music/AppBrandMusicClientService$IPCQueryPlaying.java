package com.tencent.mm.plugin.appbrand.media.music;

/* loaded from: classes7.dex */
class AppBrandMusicClientService$IPCQueryPlaying extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.media.music.AppBrandMusicClientService$IPCQueryPlaying> CREATOR = new com.tencent.mm.plugin.appbrand.media.music.a();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f85754f = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f85755g = false;

    public AppBrandMusicClientService$IPCQueryPlaying() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f85754f = parcel.readString();
        this.f85755g = parcel.readByte() != 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f85754f);
        parcel.writeByte(this.f85755g ? (byte) 1 : (byte) 0);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        this.f85755g = com.tencent.mm.plugin.appbrand.media.music.f.f85760a.c(this.f85754f);
    }

    public AppBrandMusicClientService$IPCQueryPlaying(android.os.Parcel parcel) {
        v(parcel);
    }
}
