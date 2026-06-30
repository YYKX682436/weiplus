package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class rc implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.appbrand.MiniProgramNavigationBackResult(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.MiniProgramNavigationBackResult[i17];
    }
}
