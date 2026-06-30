package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1103x5d6d1928;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.openvoice.AppBrandVoIP1v1FloatBallEvent */
/* loaded from: classes7.dex */
public class C12198xffa35265 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1103x5d6d1928.C12198xffa35265> f34580x681a0c0c = new md1.a();

    /* renamed from: d, reason: collision with root package name */
    public int f164007d;

    public C12198xffa35265() {
        this.f164007d = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f164007d);
    }

    public C12198xffa35265(android.os.Parcel parcel) {
        this.f164007d = 0;
        this.f164007d = parcel.readInt();
    }
}
