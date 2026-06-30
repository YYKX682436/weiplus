package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class JsApiStartPlayVoice$StartPlayVoice extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartPlayVoice$StartPlayVoice> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.audio.u2();

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.k0 f79113f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.e9 f79114g;

    /* renamed from: h, reason: collision with root package name */
    public int f79115h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f79116i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f79117m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f79118n = false;

    public JsApiStartPlayVoice$StartPlayVoice(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f79113f = k0Var;
        this.f79114g = e9Var;
        this.f79115h = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f79116i = parcel.readString();
        this.f79117m = parcel.readString();
        this.f79118n = parcel.readByte() != 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f79116i);
        parcel.writeString(this.f79117m);
        parcel.writeByte(this.f79118n ? (byte) 1 : (byte) 0);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(dm.i4.COL_LOCALID, this.f79116i);
        this.f79114g.a(this.f79115h, this.f79113f.p(this.f79118n ? "fail" : "ok", hashMap));
        com.tencent.mm.plugin.appbrand.jsapi.audio.v2.f79291h = null;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.audio.t2(this));
    }

    public JsApiStartPlayVoice$StartPlayVoice(android.os.Parcel parcel) {
        v(parcel);
    }
}
