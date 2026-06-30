package com.tencent.mm.plugin.appbrand.jsapi.wccoin;

/* loaded from: classes7.dex */
public final class z implements android.os.Parcelable.Creator {
    public z(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel source) {
        kotlin.jvm.internal.o.g(source, "source");
        return new com.tencent.mm.plugin.appbrand.jsapi.wccoin.ShowWCCoinFirstBuyCoinTipsRequest(source);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.wccoin.ShowWCCoinFirstBuyCoinTipsRequest[i17];
    }
}
