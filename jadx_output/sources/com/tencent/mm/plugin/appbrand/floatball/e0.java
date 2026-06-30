package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public final class e0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.floatball.AppBrandFloatBallTingController$OperateAppBrandTingParam(parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.floatball.AppBrandFloatBallTingController$OperateAppBrandTingParam[i17];
    }
}
