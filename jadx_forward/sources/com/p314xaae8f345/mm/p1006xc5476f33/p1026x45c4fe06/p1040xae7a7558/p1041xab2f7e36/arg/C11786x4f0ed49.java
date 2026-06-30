package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetStrokeStyleActionArg */
/* loaded from: classes13.dex */
public class C11786x4f0ed49 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11786x4f0ed49> f33556x681a0c0c = new b91.i0();

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11765x829b89cb f158662e;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    public boolean a(z81.i iVar, android.graphics.Canvas canvas) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11765x829b89cb c11765x829b89cb = this.f158662e;
        if (c11765x829b89cb == null) {
            return false;
        }
        return c11765x829b89cb.a(iVar, canvas);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    public void b(android.os.Parcel parcel) {
        this.f158574d = parcel.readString();
        this.f158662e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11765x829b89cb) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11786x4f0ed49.class.getClassLoader());
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
        if ((obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11786x4f0ed49) && super.mo50000xb2c87fbf(obj)) {
            return java.util.Objects.equals(this.f158662e, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11786x4f0ed49) obj).f158662e);
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    /* renamed from: hashCode */
    public int mo50001x8cdac1b() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(super.mo50001x8cdac1b()), this.f158662e);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158574d);
        parcel.writeParcelable(this.f158662e, i17);
    }
}
