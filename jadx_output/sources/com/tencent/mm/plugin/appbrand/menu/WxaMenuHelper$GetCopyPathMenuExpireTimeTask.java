package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes4.dex */
class WxaMenuHelper$GetCopyPathMenuExpireTimeTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.menu.WxaMenuHelper$GetCopyPathMenuExpireTimeTask> CREATOR = new com.tencent.mm.plugin.appbrand.menu.j1();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f85862f;

    /* renamed from: g, reason: collision with root package name */
    public long f85863g = 0;

    public WxaMenuHelper$GetCopyPathMenuExpireTimeTask(java.lang.String str) {
        this.f85862f = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f85863g = parcel.readLong();
        this.f85862f = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f85863g);
        parcel.writeString(this.f85862f);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        java.lang.Long f17 = oh1.r2.INSTANCE.f(this.f85862f, "copypath");
        if (f17 == null) {
            this.f85863g = 0L;
        } else {
            this.f85863g = f17.longValue();
        }
    }

    public WxaMenuHelper$GetCopyPathMenuExpireTimeTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
