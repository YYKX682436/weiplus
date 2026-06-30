package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathQuadraticCurveToActionArg */
/* loaded from: classes13.dex */
public class C11800xe03b6e09 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11791x6a1daa2a {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11800xe03b6e09> f33569x681a0c0c = new c91.i();

    /* renamed from: e, reason: collision with root package name */
    public float f158690e;

    /* renamed from: f, reason: collision with root package name */
    public float f158691f;

    /* renamed from: g, reason: collision with root package name */
    public float f158692g;

    /* renamed from: h, reason: collision with root package name */
    public float f158693h;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    public void b(android.os.Parcel parcel) {
        this.f158574d = parcel.readString();
        this.f158690e = parcel.readFloat();
        this.f158691f = parcel.readFloat();
        this.f158692g = parcel.readFloat();
        this.f158693h = parcel.readFloat();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11791x6a1daa2a, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    /* renamed from: equals */
    public boolean mo50000xb2c87fbf(java.lang.Object obj) {
        if (!super.mo50000xb2c87fbf(obj) || !(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11800xe03b6e09)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11800xe03b6e09 c11800xe03b6e09 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11800xe03b6e09) obj;
        return c11800xe03b6e09.f158690e == this.f158690e && c11800xe03b6e09.f158691f == this.f158691f && c11800xe03b6e09.f158692g == this.f158692g && c11800xe03b6e09.f158693h == this.f158693h;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11791x6a1daa2a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158574d);
        parcel.writeFloat(this.f158690e);
        parcel.writeFloat(this.f158691f);
        parcel.writeFloat(this.f158692g);
        parcel.writeFloat(this.f158693h);
    }
}
