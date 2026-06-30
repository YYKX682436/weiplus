package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.ClearRectActionArg */
/* loaded from: classes13.dex */
public class C11751x5155918f extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11751x5155918f> f33522x681a0c0c = new b91.a();

    /* renamed from: e, reason: collision with root package name */
    public float f158575e;

    /* renamed from: f, reason: collision with root package name */
    public float f158576f;

    /* renamed from: g, reason: collision with root package name */
    public float f158577g;

    /* renamed from: h, reason: collision with root package name */
    public float f158578h;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    public void b(android.os.Parcel parcel) {
        this.f158574d = parcel.readString();
        this.f158575e = parcel.readFloat();
        this.f158576f = parcel.readFloat();
        this.f158577g = parcel.readFloat();
        this.f158578h = parcel.readFloat();
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
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11751x5155918f) || !super.mo50000xb2c87fbf(obj)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11751x5155918f c11751x5155918f = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11751x5155918f) obj;
        return java.lang.Float.compare(c11751x5155918f.f158575e, this.f158575e) == 0 && java.lang.Float.compare(c11751x5155918f.f158576f, this.f158576f) == 0 && java.lang.Float.compare(c11751x5155918f.f158577g, this.f158577g) == 0 && java.lang.Float.compare(c11751x5155918f.f158578h, this.f158578h) == 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    /* renamed from: hashCode */
    public int mo50001x8cdac1b() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(super.mo50001x8cdac1b()), java.lang.Float.valueOf(this.f158575e), java.lang.Float.valueOf(this.f158576f), java.lang.Float.valueOf(this.f158577g), java.lang.Float.valueOf(this.f158578h));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158574d);
        parcel.writeFloat(this.f158575e);
        parcel.writeFloat(this.f158576f);
        parcel.writeFloat(this.f158577g);
        parcel.writeFloat(this.f158578h);
    }
}
