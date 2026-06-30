package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes7.dex */
class JsApiFinderEndorsementFinished$FinderUserPageTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiFinderEndorsementFinished$FinderUserPageTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.finder.l();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f81157f;

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f81157f = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f81157f);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
    }

    private JsApiFinderEndorsementFinished$FinderUserPageTask(android.os.Parcel parcel) {
        v(parcel);
    }

    public JsApiFinderEndorsementFinished$FinderUserPageTask(java.lang.String str) {
        this.f81157f = str;
    }
}
