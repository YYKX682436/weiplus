package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes4.dex */
public final class p5 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.jsapi.JsApiGamelifeManager$GetGameLifeRedCountData(parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.JsApiGamelifeManager$GetGameLifeRedCountData[i17];
    }
}
