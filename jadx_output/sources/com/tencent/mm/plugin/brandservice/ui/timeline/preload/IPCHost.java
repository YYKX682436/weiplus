package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/IPCHost;", "Landroid/os/Parcelable;", "Lnk0/a;", "CREATOR", "com/tencent/mm/plugin/brandservice/ui/timeline/preload/z", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class IPCHost implements android.os.Parcelable, nk0.a {
    public static final com.tencent.mm.plugin.brandservice.ui.timeline.preload.z CREATOR = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.z(null);

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String[] f94181d;

    public IPCHost(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.String[] hosts = parcel.createStringArray();
        kotlin.jvm.internal.o.g(hosts, "hosts");
        this.f94181d = hosts;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeStringArray(this.f94181d);
    }
}
