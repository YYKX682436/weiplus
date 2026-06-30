package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* renamed from: com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData */
/* loaded from: classes10.dex */
public class C20989xcfc00935 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.sdk.p2603x2137b148.C20989xcfc00935> f39178x681a0c0c = new com.p314xaae8f345.mm.sdk.p2603x2137b148.k();

    /* renamed from: d, reason: collision with root package name */
    public float f273942d;

    /* renamed from: e, reason: collision with root package name */
    public float f273943e;

    public C20989xcfc00935() {
        this.f273942d = 0.0f;
        this.f273943e = 0.0f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m77683xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.mm.sdk.p2603x2137b148.C20989xcfc00935)) {
            return false;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.C20989xcfc00935 c20989xcfc00935 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.C20989xcfc00935) obj;
        return java.lang.Math.abs(this.f273942d - c20989xcfc00935.f273942d) < 1.0E-6f && java.lang.Math.abs(this.f273943e - c20989xcfc00935.f273943e) < 1.0E-6f;
    }

    /* renamed from: hashCode */
    public int m77684x8cdac1b() {
        return ((int) (this.f273942d * 10000.0f)) + ((int) (this.f273943e * 10000.0f));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeFloat(this.f273942d);
        parcel.writeFloat(this.f273943e);
    }

    public C20989xcfc00935(float f17, float f18) {
        this.f273942d = f17;
        this.f273943e = f18;
    }
}
