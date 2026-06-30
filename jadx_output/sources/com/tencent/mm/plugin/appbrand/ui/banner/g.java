package com.tencent.mm.plugin.appbrand.ui.banner;

/* loaded from: classes15.dex */
public class g implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.appbrand.ipc.MainProcessTask mainProcessTask = new com.tencent.mm.plugin.appbrand.ipc.MainProcessTask() { // from class: com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic$Watcher

            /* renamed from: f, reason: collision with root package name */
            public java.lang.String f89587f;

            /* renamed from: g, reason: collision with root package name */
            public java.lang.String f89588g;

            /* renamed from: h, reason: collision with root package name */
            public int f89589h;

            /* renamed from: i, reason: collision with root package name */
            public static final transient java.util.Map f89586i = new java.util.HashMap();
            public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic$Watcher> CREATOR = new com.tencent.mm.plugin.appbrand.ui.banner.g();

            @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
            public void v(android.os.Parcel parcel2) {
                this.f89587f = parcel2.readString();
                this.f89588g = parcel2.readString();
                this.f89589h = parcel2.readInt();
            }

            @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
            public void writeToParcel(android.os.Parcel parcel2, int i17) {
                parcel2.writeString(this.f89587f);
                parcel2.writeString(this.f89588g);
                parcel2.writeInt(this.f89589h);
            }

            @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
            public void y() {
            }

            @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
            public void z() {
                if (com.tencent.mm.sdk.platformtools.t8.K0(this.f89587f)) {
                    return;
                }
                java.util.Map map = f89586i;
                synchronized (map) {
                    if (((java.util.HashMap) map).containsKey(this.f89587f)) {
                    }
                    java.util.HashMap hashMap = (java.util.HashMap) map;
                    hashMap.put(this.f89587f, new com.tencent.mm.plugin.appbrand.ui.banner.f(this));
                }
            }
        };
        mainProcessTask.v(parcel);
        return mainProcessTask;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic$Watcher[i17];
    }
}
