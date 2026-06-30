package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class z implements android.os.Parcelable.Creator {
    public z(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.brandservice.ui.timeline.preload.IPCHost(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.brandservice.ui.timeline.preload.IPCHost[i17];
    }
}
