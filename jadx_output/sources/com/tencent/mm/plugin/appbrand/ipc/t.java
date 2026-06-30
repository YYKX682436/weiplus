package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes11.dex */
public class t implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$DefaultProcessResult();
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$DefaultProcessResult[i17];
    }
}
