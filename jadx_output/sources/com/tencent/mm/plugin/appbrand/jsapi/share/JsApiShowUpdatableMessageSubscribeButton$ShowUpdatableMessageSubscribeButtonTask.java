package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes4.dex */
class JsApiShowUpdatableMessageSubscribeButton$ShowUpdatableMessageSubscribeButtonTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.share.JsApiShowUpdatableMessageSubscribeButton$ShowUpdatableMessageSubscribeButtonTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.share.m1();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f83060f;

    public JsApiShowUpdatableMessageSubscribeButton$ShowUpdatableMessageSubscribeButtonTask() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f83060f = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f83060f);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        int i17;
        int i18;
        if (i95.n0.c(k01.x0.class) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShowUpdatableMessageSubscribeButtonTask", "IWxaUpdateableMsgService is null, err, return");
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            return;
        }
        tt0.e Ai = ((oh1.k2) ((k01.x0) i95.n0.c(k01.x0.class))).Ai(this.f83060f);
        if (Ai != null && (i18 = Ai.field_msgType) != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShowUpdatableMessageSubscribeButtonTask", "shareKey:%s msgType:%d", this.f83060f, java.lang.Integer.valueOf(i18));
        } else if (Ai == null || ((i17 = Ai.field_btnState) != 2 && Ai.field_msgState == 0)) {
            ((oh1.k2) ((k01.x0) i95.n0.c(k01.x0.class))).Bi(this.f83060f, 1, 0);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShowUpdatableMessageSubscribeButtonTask", "shareKey:%s btnState:%d msgState:%d ingore already process", this.f83060f, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(Ai.field_msgState));
        }
    }

    public JsApiShowUpdatableMessageSubscribeButton$ShowUpdatableMessageSubscribeButtonTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
