package com.tencent.mm.plugin.appbrand.jsapi.auth.entity;

/* loaded from: classes7.dex */
public final class t implements android.os.Parcelable.Creator {
    public t(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserAvatarInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserAvatarInfo[i17];
    }
}
