package com.tencent.mm.plugin.appbrand.jsapi.wccoin;

/* loaded from: classes7.dex */
public final class k implements android.os.Parcelable.Creator {
    public k(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel source) {
        kotlin.jvm.internal.o.g(source, "source");
        return new com.tencent.mm.plugin.appbrand.jsapi.wccoin.EnterWCCoinHomePageRequest(source);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.wccoin.EnterWCCoinHomePageRequest[i17];
    }
}
