package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class i0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        java.lang.String readString2 = parcel.readString();
        ne1.j jVar = (ne1.j) kz5.z.U(ne1.j.values(), parcel.readInt());
        if (jVar == null) {
            jVar = ne1.j.NO_UPDATE;
        }
        return new com.tencent.mm.plugin.appbrand.launching.AppBrandPluginUpdateStatusChangeIPCMessage(readString, readString2, jVar, parcel.readString(), parcel.readInt(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.launching.AppBrandPluginUpdateStatusChangeIPCMessage[i17];
    }
}
