package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class ed implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel source) {
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.luggage.sdk.launching.h a17 = com.tencent.luggage.sdk.launching.k.a(source);
        kotlin.jvm.internal.o.d(a17);
        com.tencent.luggage.sdk.launching.h a18 = com.tencent.luggage.sdk.launching.k.a(source);
        kotlin.jvm.internal.o.d(a18);
        com.tencent.luggage.sdk.launching.h a19 = com.tencent.luggage.sdk.launching.k.a(source);
        kotlin.jvm.internal.o.d(a19);
        return new com.tencent.mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy(a17, a18, a19, com.tencent.luggage.sdk.launching.k.a(source));
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy[i17];
    }
}
