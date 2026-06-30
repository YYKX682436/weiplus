package com.tencent.luggage.sdk.processes;

/* loaded from: classes7.dex */
public final class v implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return com.tencent.luggage.sdk.processes.LuggageServiceType.valueOf(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.luggage.sdk.processes.LuggageServiceType[i17];
    }
}
