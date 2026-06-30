package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes.dex */
public final class y6 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.service.RestoreRuntimeParams(parcel.createStringArrayList());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.service.RestoreRuntimeParams[i17];
    }
}
