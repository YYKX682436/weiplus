package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class m7 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        ne1.j jVar;
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        int readInt = parcel.readInt();
        java.lang.String readString2 = parcel.readString();
        int readInt2 = parcel.readInt();
        java.util.Iterator it = ((kz5.h) com.tencent.mm.plugin.appbrand.launching.n7.f84809a).iterator();
        while (true) {
            if (!it.hasNext()) {
                jVar = null;
                break;
            }
            ne1.j jVar2 = (ne1.j) it.next();
            if (readInt2 == jVar2.ordinal()) {
                jVar = jVar2;
                break;
            }
        }
        return new com.tencent.mm.plugin.appbrand.launching.IPCUpdateStateNotifier$UpdateStateArgsParcelized(readString, readInt, readString2, jVar, parcel.readString(), parcel.readString(), (com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo) parcel.readParcelable(com.tencent.mm.plugin.appbrand.launching.IPCUpdateStateNotifier$UpdateStateArgsParcelized.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.launching.IPCUpdateStateNotifier$UpdateStateArgsParcelized[i17];
    }
}
