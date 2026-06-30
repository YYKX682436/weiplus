package com.tencent.mm.plugin.appbrand.jsapi.contact;

/* loaded from: classes8.dex */
class JsApiGetContactMessageCountTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiGetContactMessageCountTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.contact.d0();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f80494f;

    /* renamed from: g, reason: collision with root package name */
    public int f80495g;

    public JsApiGetContactMessageCountTask() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f80494f = parcel.readString();
        this.f80495g = parcel.readInt();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f80494f);
        parcel.writeInt(this.f80495g);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(this.f80494f);
        if (p17 == null) {
            this.f80495g = -1;
            c();
        } else {
            this.f80495g = p17.d1();
            c();
        }
    }

    public JsApiGetContactMessageCountTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
