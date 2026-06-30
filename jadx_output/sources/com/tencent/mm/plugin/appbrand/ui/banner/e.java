package com.tencent.mm.plugin.appbrand.ui.banner;

/* loaded from: classes.dex */
public class e implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.appbrand.ipc.MainProcessTask mainProcessTask = new com.tencent.mm.plugin.appbrand.ipc.MainProcessTask() { // from class: com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic$OperateTask
            public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic$OperateTask> CREATOR = new com.tencent.mm.plugin.appbrand.ui.banner.e();

            /* renamed from: f, reason: collision with root package name */
            public int f89581f = 0;

            /* renamed from: g, reason: collision with root package name */
            public boolean f89582g;

            /* renamed from: h, reason: collision with root package name */
            public java.lang.String f89583h;

            /* renamed from: i, reason: collision with root package name */
            public int f89584i;

            /* renamed from: m, reason: collision with root package name */
            public java.lang.String f89585m;

            @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
            public void v(android.os.Parcel parcel2) {
                this.f89581f = parcel2.readInt();
                this.f89582g = parcel2.readByte() != 0;
                this.f89583h = parcel2.readString();
                this.f89584i = parcel2.readInt();
                this.f89585m = parcel2.readString();
            }

            @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
            public void writeToParcel(android.os.Parcel parcel2, int i17) {
                super.writeToParcel(parcel2, i17);
                parcel2.writeInt(this.f89581f);
                parcel2.writeByte(this.f89582g ? (byte) 1 : (byte) 0);
                parcel2.writeString(this.f89583h);
                parcel2.writeInt(this.f89584i);
                parcel2.writeString(this.f89585m);
            }

            @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
            public void z() {
                if (this.f89581f != 1) {
                    return;
                }
                this.f89582g = false;
                c();
            }
        };
        mainProcessTask.v(parcel);
        return mainProcessTask;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic$OperateTask[i17];
    }
}
