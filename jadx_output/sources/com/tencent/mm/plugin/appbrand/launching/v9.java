package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class v9 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel source) {
        kotlin.jvm.internal.o.g(source, "source");
        return new com.tencent.mm.plugin.appbrand.launching.ModularizingPkgBatchLoadTransaction$IPCCallArgs(source);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.launching.ModularizingPkgBatchLoadTransaction$IPCCallArgs[i17];
    }
}
