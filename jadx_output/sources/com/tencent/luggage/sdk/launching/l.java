package com.tencent.luggage.sdk.launching;

/* loaded from: classes7.dex */
public final class l implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.luggage.sdk.launching.OnWXAppResultXPCMessage(parcel.readInt(), parcel.readInt(), parcel.readParcelable(com.tencent.luggage.sdk.launching.OnWXAppResultXPCMessage.class.getClassLoader()), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.luggage.sdk.launching.OnWXAppResultXPCMessage[i17];
    }
}
