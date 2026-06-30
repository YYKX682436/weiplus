package com.tencent.mm.plugin.appbrand.report;

@com.tencent.mm.plugin.appbrand.ipc.v0
/* loaded from: classes7.dex */
final class AppBrandIDKeyBatchReport$IDKeyBatchReportTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.report.AppBrandIDKeyBatchReport$IDKeyBatchReportTask> CREATOR = new com.tencent.mm.plugin.appbrand.report.o();

    /* renamed from: f, reason: collision with root package name */
    public int f87768f;

    /* renamed from: g, reason: collision with root package name */
    public int f87769g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f87770h;

    /* renamed from: i, reason: collision with root package name */
    public int f87771i;

    /* renamed from: m, reason: collision with root package name */
    public r45.uc7 f87772m;

    public AppBrandIDKeyBatchReport$IDKeyBatchReportTask() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f87768f = parcel.readInt();
        this.f87769g = parcel.readInt();
        this.f87770h = parcel.readString();
        this.f87771i = parcel.readInt();
        if (3 == this.f87768f) {
            try {
                r45.uc7 uc7Var = new r45.uc7();
                this.f87772m = uc7Var;
                uc7Var.parseFrom(parcel.createByteArray());
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandIDKeyBatchReport", "parse WxaAppRecord from parcel, e = %s", e17);
                this.f87772m = null;
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f87768f);
        parcel.writeInt(this.f87769g);
        parcel.writeString(this.f87770h);
        parcel.writeInt(this.f87771i);
        if (3 == this.f87768f) {
            try {
                parcel.writeByteArray(this.f87772m.toByteArray());
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandIDKeyBatchReport", "write WxaAppRecord to parcel, e = %s", e17);
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        int i17 = this.f87768f;
        if (1 == i17) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f87770h) && gm0.j1.b().f273254q) {
                android.util.Pair y07 = ((t81.b) com.tencent.mm.plugin.appbrand.app.r9.fj(t81.b.class)).y0("appId", this.f87770h, 5, this.f87771i);
                if (((java.lang.Boolean) y07.first).booleanValue()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandIDKeyBatchReport", "report blocked by appid(%s) scene(%d) ", this.f87770h, java.lang.Integer.valueOf(this.f87771i));
                    r81.f.INSTANCE.b(((java.lang.Integer) y07.second).intValue(), com.tencent.thumbplayer.core.common.TPPixelFormat.TP_PIX_FMT_MEDIACODEC);
                    return;
                }
            }
            com.tencent.mm.plugin.appbrand.report.t.a(0);
            com.tencent.mm.plugin.appbrand.report.t.b();
            return;
        }
        if (2 == i17) {
            com.tencent.mm.plugin.appbrand.report.t.e();
            return;
        }
        if (3 == i17) {
            r45.uc7 uc7Var = this.f87772m;
            java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = com.tencent.mm.plugin.appbrand.report.t.f88401a;
            if (uc7Var == null) {
                return;
            }
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.appbrand.report.s(uc7Var), "MicroMsg.AppBrandIDKeyBatchReport");
        }
    }

    public AppBrandIDKeyBatchReport$IDKeyBatchReportTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
