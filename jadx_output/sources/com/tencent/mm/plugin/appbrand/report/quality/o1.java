package com.tencent.mm.plugin.appbrand.report.quality;

/* loaded from: classes7.dex */
public class o1 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.appbrand.report.quality.QualitySession(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.report.quality.QualitySession[i17];
    }
}
