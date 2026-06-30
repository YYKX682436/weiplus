package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes15.dex */
class JsApiSetClipboardDataWC$ReportClipBoardTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.JsApiSetClipboardDataWC$ReportClipBoardTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.ad();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f78617f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f78618g;

    /* renamed from: h, reason: collision with root package name */
    public int f78619h;

    public JsApiSetClipboardDataWC$ReportClipBoardTask(java.lang.String str, java.lang.String str2, int i17) {
        this.f78617f = str;
        this.f78618g = str2;
        this.f78619h = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f78617f = parcel.readString();
        this.f78618g = parcel.readString();
        this.f78619h = parcel.readInt();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f78617f);
        parcel.writeString(this.f78618g);
        parcel.writeInt(this.f78619h);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        w04.a.INSTANCE.xd(5, this.f78619h, this.f78617f, this.f78618g);
    }

    public JsApiSetClipboardDataWC$ReportClipBoardTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
