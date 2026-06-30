package com.p3263xee53b379.p3264xfd290127.mi.p3265x332457.p3266xc84dc81d;

/* renamed from: com.unionpay.tsmservice.mi.mini.result.QueryVendorPayStatusResult */
/* loaded from: classes13.dex */
public class C28076x286b0947 extends com.p3263xee53b379.p3264xfd290127.mi.p3265x332457.p3266xc84dc81d.AbstractC28075x438c766e {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator f65803x681a0c0c = new com.p3263xee53b379.p3264xfd290127.mi.p3265x332457.p3266xc84dc81d.a();

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Bundle f302260d;

    public C28076x286b0947(android.os.Parcel parcel) {
        this.f302260d = parcel.readBundle();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeBundle(this.f302260d);
    }
}
