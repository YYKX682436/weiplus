package com.tencent.mm.magicbrush.plugin.scl.jsapi.cover;

/* loaded from: classes7.dex */
public final class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.magicbrush.plugin.scl.jsapi.cover.MBJsApiOperateCanvasFirstSnapshot$IPCData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.magicbrush.plugin.scl.jsapi.cover.MBJsApiOperateCanvasFirstSnapshot$IPCData[i17];
    }
}
