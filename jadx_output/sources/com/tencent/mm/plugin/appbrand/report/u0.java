package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes8.dex */
public class u0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.appbrand.report.AppBrandRecommendStatObj(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.report.AppBrandRecommendStatObj[i17];
    }
}
