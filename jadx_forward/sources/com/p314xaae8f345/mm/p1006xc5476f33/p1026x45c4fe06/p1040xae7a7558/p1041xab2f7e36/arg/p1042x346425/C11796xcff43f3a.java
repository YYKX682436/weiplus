package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathBezierCurveToActionArg */
/* loaded from: classes13.dex */
public class C11796xcff43f3a extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11791x6a1daa2a {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11796xcff43f3a> f33565x681a0c0c = new c91.e();

    /* renamed from: e, reason: collision with root package name */
    public float f158680e;

    /* renamed from: f, reason: collision with root package name */
    public float f158681f;

    /* renamed from: g, reason: collision with root package name */
    public float f158682g;

    /* renamed from: h, reason: collision with root package name */
    public float f158683h;

    /* renamed from: i, reason: collision with root package name */
    public float f158684i;

    /* renamed from: m, reason: collision with root package name */
    public float f158685m;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    public void b(android.os.Parcel parcel) {
        this.f158574d = parcel.readString();
        this.f158680e = parcel.readFloat();
        this.f158681f = parcel.readFloat();
        this.f158682g = parcel.readFloat();
        this.f158683h = parcel.readFloat();
        this.f158684i = parcel.readFloat();
        this.f158685m = parcel.readFloat();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11791x6a1daa2a, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    /* renamed from: equals */
    public boolean mo50000xb2c87fbf(java.lang.Object obj) {
        if (!super.mo50000xb2c87fbf(obj) || !(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11796xcff43f3a)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11796xcff43f3a c11796xcff43f3a = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11796xcff43f3a) obj;
        return c11796xcff43f3a.f158680e == this.f158680e && c11796xcff43f3a.f158681f == this.f158681f && c11796xcff43f3a.f158682g == this.f158682g && c11796xcff43f3a.f158683h == this.f158683h && c11796xcff43f3a.f158684i == this.f158684i && c11796xcff43f3a.f158685m == this.f158685m;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11791x6a1daa2a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158574d);
        parcel.writeFloat(this.f158680e);
        parcel.writeFloat(this.f158681f);
        parcel.writeFloat(this.f158682g);
        parcel.writeFloat(this.f158683h);
        parcel.writeFloat(this.f158682g);
        parcel.writeFloat(this.f158683h);
    }
}
