package com.tencent.mm.plugin.appbrand.jsapi.channels;

/* loaded from: classes7.dex */
public final class e1 implements android.os.Parcelable.Creator {
    public e1(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.jsapi.channels.OpenChannelsTopicRequest(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.channels.OpenChannelsTopicRequest[i17];
    }
}
