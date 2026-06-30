package com.tencent.mm.magicbrush.plugin.scl.jsapi.touch;

/* loaded from: classes.dex */
public final class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.magicbrush.plugin.scl.jsapi.touch.MBJsApiSetGestureRects$IPCCallback(parcel.readLong(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.magicbrush.plugin.scl.jsapi.touch.MBJsApiSetGestureRects$IPCCallback[i17];
    }
}
