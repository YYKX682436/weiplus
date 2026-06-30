package com.tencent.mm.plugin.appbrand.config;

/* loaded from: classes3.dex */
public final class n implements android.os.Parcelable.Creator {
    public n(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        kotlin.jvm.internal.o.d(readString);
        java.lang.String readString2 = parcel.readString();
        kotlin.jvm.internal.o.d(readString2);
        return new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo(readString, readString2);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo[i17];
    }
}
