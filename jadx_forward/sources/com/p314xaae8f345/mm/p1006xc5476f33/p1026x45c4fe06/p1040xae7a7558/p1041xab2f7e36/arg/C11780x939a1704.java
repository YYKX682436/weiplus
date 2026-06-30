package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetLineCapActionArg */
/* loaded from: classes13.dex */
public class C11780x939a1704 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11780x939a1704> f33550x681a0c0c = new b91.c0();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f158648e;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    public void b(android.os.Parcel parcel) {
        this.f158574d = parcel.readString();
        this.f158648e = parcel.readString();
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
        if ((obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11780x939a1704) && super.mo50000xb2c87fbf(obj)) {
            return java.util.Objects.equals(this.f158648e, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11780x939a1704) obj).f158648e);
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    /* renamed from: hashCode */
    public int mo50001x8cdac1b() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(super.mo50001x8cdac1b()), this.f158648e);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158574d);
        parcel.writeString(this.f158648e);
    }
}
