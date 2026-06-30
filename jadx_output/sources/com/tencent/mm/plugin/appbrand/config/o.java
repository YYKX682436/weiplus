package com.tencent.mm.plugin.appbrand.config;

/* loaded from: classes15.dex */
public final class o implements android.os.Parcelable.Creator {
    public o(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        android.os.IBinder readStrongBinder = parcel.readStrongBinder();
        return new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.HalfScreenHeaderTipsListenerProxy(readStrongBinder instanceof k91.w2 ? (k91.w2) readStrongBinder : null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.HalfScreenHeaderTipsListenerProxy[i17];
    }
}
