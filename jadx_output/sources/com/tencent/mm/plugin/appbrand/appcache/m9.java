package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class m9 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress[i17];
    }
}
