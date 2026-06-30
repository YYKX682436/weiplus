package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetLineDashActionArg */
/* loaded from: classes13.dex */
public class C11781x68c8b918 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11781x68c8b918> f33551x681a0c0c = new b91.d0();

    /* renamed from: e, reason: collision with root package name */
    public float[] f158649e;

    /* renamed from: f, reason: collision with root package name */
    public float f158650f;

    public C11781x68c8b918(android.os.Parcel parcel) {
        super(parcel);
        this.f158649e = null;
        this.f158650f = Float.MIN_VALUE;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    public void b(android.os.Parcel parcel) {
        this.f158574d = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            float[] fArr = new float[readInt];
            this.f158649e = fArr;
            parcel.readFloatArray(fArr);
        }
        this.f158650f = parcel.readFloat();
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
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11781x68c8b918) || !super.mo50000xb2c87fbf(obj)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11781x68c8b918 c11781x68c8b918 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11781x68c8b918) obj;
        return java.lang.Float.compare(c11781x68c8b918.f158650f, this.f158650f) == 0 && java.util.Arrays.equals(this.f158649e, c11781x68c8b918.f158649e);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    /* renamed from: hashCode */
    public int mo50001x8cdac1b() {
        return (java.util.Objects.hash(java.lang.Integer.valueOf(super.mo50001x8cdac1b()), java.lang.Float.valueOf(this.f158650f)) * 31) + java.util.Arrays.hashCode(this.f158649e);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158574d);
        float[] fArr = this.f158649e;
        if (fArr != null) {
            parcel.writeInt(fArr.length);
            parcel.writeFloatArray(this.f158649e);
        }
        parcel.writeFloat(this.f158650f);
    }
}
