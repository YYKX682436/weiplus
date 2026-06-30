package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes.dex */
public class y0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.appbrand.ipc.SampleTask1(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.ipc.SampleTask1[i17];
    }
}
