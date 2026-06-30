package com.tencent.mm.plugin.appbrand.networking;

/* loaded from: classes7.dex */
public final class j implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.networking.AppBrandWeakNetReceiver$WeakNetNotifyMessage(parcel.readString(), parcel.readInt() != 0, parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.networking.AppBrandWeakNetReceiver$WeakNetNotifyMessage[i17];
    }
}
