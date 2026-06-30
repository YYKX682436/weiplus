package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetTransformActionArg */
/* loaded from: classes13.dex */
public class C11789xd2f25216 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11789xd2f25216> f33559x681a0c0c = new b91.l0();

    /* renamed from: e, reason: collision with root package name */
    public float f158665e;

    /* renamed from: f, reason: collision with root package name */
    public float f158666f;

    /* renamed from: g, reason: collision with root package name */
    public float f158667g;

    /* renamed from: h, reason: collision with root package name */
    public float f158668h;

    /* renamed from: i, reason: collision with root package name */
    public float f158669i;

    /* renamed from: m, reason: collision with root package name */
    public float f158670m;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    public void b(android.os.Parcel parcel) {
        this.f158574d = parcel.readString();
        this.f158665e = parcel.readFloat();
        this.f158666f = parcel.readFloat();
        this.f158667g = parcel.readFloat();
        this.f158668h = parcel.readFloat();
        this.f158669i = parcel.readFloat();
        this.f158670m = parcel.readFloat();
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
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11789xd2f25216) || !super.mo50000xb2c87fbf(obj)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11789xd2f25216 c11789xd2f25216 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11789xd2f25216) obj;
        return java.lang.Float.compare(c11789xd2f25216.f158665e, this.f158665e) == 0 && java.lang.Float.compare(c11789xd2f25216.f158666f, this.f158666f) == 0 && java.lang.Float.compare(c11789xd2f25216.f158667g, this.f158667g) == 0 && java.lang.Float.compare(c11789xd2f25216.f158668h, this.f158668h) == 0 && java.lang.Float.compare(c11789xd2f25216.f158669i, this.f158669i) == 0 && java.lang.Float.compare(c11789xd2f25216.f158670m, this.f158670m) == 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    /* renamed from: hashCode */
    public int mo50001x8cdac1b() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(super.mo50001x8cdac1b()), java.lang.Float.valueOf(this.f158665e), java.lang.Float.valueOf(this.f158666f), java.lang.Float.valueOf(this.f158667g), java.lang.Float.valueOf(this.f158668h), java.lang.Float.valueOf(this.f158669i), java.lang.Float.valueOf(this.f158670m));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158574d);
        parcel.writeFloat(this.f158668h);
        parcel.writeFloat(this.f158666f);
        parcel.writeFloat(this.f158667g);
        parcel.writeFloat(this.f158668h);
        parcel.writeFloat(this.f158669i);
        parcel.writeFloat(this.f158670m);
    }
}
