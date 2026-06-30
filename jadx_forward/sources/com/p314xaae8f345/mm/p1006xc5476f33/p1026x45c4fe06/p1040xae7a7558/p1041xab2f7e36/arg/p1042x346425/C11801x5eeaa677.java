package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathRectActionArg */
/* loaded from: classes13.dex */
public class C11801x5eeaa677 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11791x6a1daa2a {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11801x5eeaa677> f33570x681a0c0c = new c91.j();

    /* renamed from: e, reason: collision with root package name */
    public float f158694e;

    /* renamed from: f, reason: collision with root package name */
    public float f158695f;

    /* renamed from: g, reason: collision with root package name */
    public float f158696g;

    /* renamed from: h, reason: collision with root package name */
    public float f158697h;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    public void b(android.os.Parcel parcel) {
        this.f158574d = parcel.readString();
        this.f158694e = parcel.readFloat();
        this.f158695f = parcel.readFloat();
        this.f158696g = parcel.readFloat();
        this.f158697h = parcel.readFloat();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11791x6a1daa2a, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    /* renamed from: equals */
    public boolean mo50000xb2c87fbf(java.lang.Object obj) {
        if (!super.mo50000xb2c87fbf(obj) || !(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11801x5eeaa677)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11801x5eeaa677 c11801x5eeaa677 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11801x5eeaa677) obj;
        return c11801x5eeaa677.f158694e == this.f158694e && c11801x5eeaa677.f158695f == this.f158695f && c11801x5eeaa677.f158696g == this.f158696g && c11801x5eeaa677.f158697h == this.f158697h;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11791x6a1daa2a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158574d);
        parcel.writeFloat(this.f158694e);
        parcel.writeFloat(this.f158695f);
        parcel.writeFloat(this.f158696g);
        parcel.writeFloat(this.f158697h);
    }
}
