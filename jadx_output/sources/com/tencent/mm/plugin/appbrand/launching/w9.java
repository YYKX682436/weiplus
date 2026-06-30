package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class w9 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel source) {
        kotlin.jvm.internal.o.g(source, "source");
        java.lang.String readString = source.readString();
        kotlin.jvm.internal.o.d(readString);
        return new com.tencent.mm.plugin.appbrand.launching.ModularizingPkgBatchLoadTransaction$IPCCallModuleItem(readString, com.tencent.luggage.sdk.launching.k.a(source));
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.launching.ModularizingPkgBatchLoadTransaction$IPCCallModuleItem[i17];
    }
}
