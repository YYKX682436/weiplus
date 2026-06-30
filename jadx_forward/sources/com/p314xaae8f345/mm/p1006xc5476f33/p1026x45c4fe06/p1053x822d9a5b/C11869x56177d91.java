package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b;

/* renamed from: com.tencent.mm.plugin.appbrand.floatball.AppBrandFloatBallHelper$AppBrandContentFloatBallEvent */
/* loaded from: classes7.dex */
public class C11869x56177d91 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.C11869x56177d91> f33623x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.k();

    /* renamed from: d, reason: collision with root package name */
    public int f159591d;

    public C11869x56177d91() {
        this.f159591d = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f159591d);
    }

    public C11869x56177d91(android.os.Parcel parcel) {
        this.f159591d = 0;
        this.f159591d = parcel.readInt();
    }
}
