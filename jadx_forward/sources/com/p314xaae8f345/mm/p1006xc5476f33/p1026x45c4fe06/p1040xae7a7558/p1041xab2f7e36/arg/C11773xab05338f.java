package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFontActionArg */
/* loaded from: classes13.dex */
public class C11773xab05338f extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11773xab05338f> f33543x681a0c0c = new b91.v();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f158640e;

    /* renamed from: f, reason: collision with root package name */
    public float f158641f;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    public void b(android.os.Parcel parcel) {
        this.f158574d = parcel.readString();
        this.f158640e = parcel.readString();
        this.f158641f = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    /* renamed from: equals */
    public boolean mo50000xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11773xab05338f) || !super.mo50000xb2c87fbf(obj)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11773xab05338f c11773xab05338f = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11773xab05338f) obj;
        return java.lang.Float.compare(c11773xab05338f.f158641f, this.f158641f) == 0 && java.util.Objects.equals(this.f158640e, c11773xab05338f.f158640e);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    /* renamed from: hashCode */
    public int mo50001x8cdac1b() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(super.mo50001x8cdac1b()), this.f158640e, java.lang.Float.valueOf(this.f158641f));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158574d);
        parcel.writeString(this.f158640e);
        parcel.writeFloat(this.f158641f);
    }
}
