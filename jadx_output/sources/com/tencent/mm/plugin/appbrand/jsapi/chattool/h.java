package com.tencent.mm.plugin.appbrand.jsapi.chattool;

/* loaded from: classes4.dex */
public final class h implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolRoomsBundle(parcel.createStringArrayList(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolRoomsBundle[i17];
    }
}
