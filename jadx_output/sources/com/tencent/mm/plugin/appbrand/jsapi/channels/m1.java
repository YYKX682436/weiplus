package com.tencent.mm.plugin.appbrand.jsapi.channels;

/* loaded from: classes7.dex */
public final class m1 implements android.os.Parcelable.Creator {
    public m1(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.jsapi.channels.ReserveChannelsLiveRequest(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.channels.ReserveChannelsLiveRequest[i17];
    }
}
