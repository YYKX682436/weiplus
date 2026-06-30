package com.tencent.mm.plugin.appbrand.jsapi.contact;

/* loaded from: classes7.dex */
public class JsApiChattingTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChattingTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.contact.m();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f80484f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f80485g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f80486h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f80487i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Runnable f80488m;

    public JsApiChattingTask() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f80484f = parcel.readString();
        this.f80486h = parcel.readString();
        this.f80487i = parcel.readString();
        this.f80485g = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f80484f);
        parcel.writeString(this.f80486h);
        parcel.writeString(this.f80487i);
        parcel.writeString(this.f80485g);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        java.lang.Runnable runnable = this.f80488m;
        if (runnable != null) {
            runnable.run();
        }
        x();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        if (!gm0.j1.b().f273254q) {
            c();
            return;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f80486h, true);
        if (n17 == null || ((int) n17.E2) == 0) {
            com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3(this.f80486h);
            z3Var.setType(0);
            z3Var.M1(this.f80487i);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h0(z3Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChattingTask", "%s save to contact_table", this.f80486h);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f80485g)) {
            ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Ri(this.f80485g, new com.tencent.mm.plugin.appbrand.jsapi.contact.k(this));
        }
        ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Ri(this.f80486h, new com.tencent.mm.plugin.appbrand.jsapi.contact.l(this));
    }

    public JsApiChattingTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
