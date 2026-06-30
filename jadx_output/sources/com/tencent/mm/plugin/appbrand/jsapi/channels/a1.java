package com.tencent.mm.plugin.appbrand.jsapi.channels;

/* loaded from: classes7.dex */
public final class a1 implements android.os.Parcelable.Creator {
    public a1(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        r45.j33 j33Var;
        kotlin.jvm.internal.o.g(parcel, "parcel");
        int readInt = parcel.readInt();
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray != null) {
            com.tencent.mm.protobuf.f parseFrom = new r45.j33().parseFrom(createByteArray);
            if (parseFrom instanceof r45.j33) {
                j33Var = (r45.j33) parseFrom;
                return new com.tencent.mm.plugin.appbrand.jsapi.channels.OpenChannelsRewardedVideoAdResult(readInt, j33Var);
            }
        }
        j33Var = null;
        return new com.tencent.mm.plugin.appbrand.jsapi.channels.OpenChannelsRewardedVideoAdResult(readInt, j33Var);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.channels.OpenChannelsRewardedVideoAdResult[i17];
    }
}
