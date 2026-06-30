package com.tencent.mm.advertise.impl.jsapi;

/* loaded from: classes.dex */
public final class e implements android.os.Parcelable.Creator {
    public e(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.advertise.impl.jsapi.MBJsApiAdDataReport$ADDataReportEvent(parcel.readString(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.advertise.impl.jsapi.MBJsApiAdDataReport$ADDataReportEvent[i17];
    }
}
