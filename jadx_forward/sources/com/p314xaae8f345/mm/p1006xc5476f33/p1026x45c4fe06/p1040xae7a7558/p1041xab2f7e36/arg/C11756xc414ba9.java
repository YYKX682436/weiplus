package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawImageActionArg */
/* loaded from: classes13.dex */
public class C11756xc414ba9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11756xc414ba9> f33526x681a0c0c = new b91.e();

    /* renamed from: e, reason: collision with root package name */
    public int f158587e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f158588f;

    /* renamed from: g, reason: collision with root package name */
    public float f158589g;

    /* renamed from: h, reason: collision with root package name */
    public float f158590h;

    /* renamed from: i, reason: collision with root package name */
    public float f158591i;

    /* renamed from: m, reason: collision with root package name */
    public float f158592m;

    /* renamed from: n, reason: collision with root package name */
    public int f158593n;

    /* renamed from: o, reason: collision with root package name */
    public int f158594o;

    /* renamed from: p, reason: collision with root package name */
    public int f158595p;

    /* renamed from: q, reason: collision with root package name */
    public int f158596q;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    public void b(android.os.Parcel parcel) {
        this.f158574d = parcel.readString();
        this.f158587e = parcel.readInt();
        this.f158588f = parcel.readString();
        this.f158589g = parcel.readFloat();
        this.f158590h = parcel.readFloat();
        this.f158591i = parcel.readFloat();
        this.f158592m = parcel.readFloat();
        this.f158593n = parcel.readInt();
        this.f158594o = parcel.readInt();
        this.f158595p = parcel.readInt();
        this.f158596q = parcel.readInt();
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
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11756xc414ba9) || !super.mo50000xb2c87fbf(obj)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11756xc414ba9 c11756xc414ba9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11756xc414ba9) obj;
        return this.f158587e == c11756xc414ba9.f158587e && java.lang.Float.compare(c11756xc414ba9.f158589g, this.f158589g) == 0 && java.lang.Float.compare(c11756xc414ba9.f158590h, this.f158590h) == 0 && java.lang.Float.compare(c11756xc414ba9.f158591i, this.f158591i) == 0 && java.lang.Float.compare(c11756xc414ba9.f158592m, this.f158592m) == 0 && this.f158593n == c11756xc414ba9.f158593n && this.f158594o == c11756xc414ba9.f158594o && this.f158595p == c11756xc414ba9.f158595p && this.f158596q == c11756xc414ba9.f158596q && java.util.Objects.equals(this.f158588f, c11756xc414ba9.f158588f);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    /* renamed from: hashCode */
    public int mo50001x8cdac1b() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(super.mo50001x8cdac1b()), java.lang.Integer.valueOf(this.f158587e), this.f158588f, java.lang.Float.valueOf(this.f158589g), java.lang.Float.valueOf(this.f158590h), java.lang.Float.valueOf(this.f158591i), java.lang.Float.valueOf(this.f158592m), java.lang.Integer.valueOf(this.f158593n), java.lang.Integer.valueOf(this.f158594o), java.lang.Integer.valueOf(this.f158595p), java.lang.Integer.valueOf(this.f158596q));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158574d);
        parcel.writeInt(this.f158587e);
        parcel.writeString(this.f158588f);
        parcel.writeFloat(this.f158589g);
        parcel.writeFloat(this.f158590h);
        parcel.writeFloat(this.f158591i);
        parcel.writeFloat(this.f158592m);
        parcel.writeInt(this.f158593n);
        parcel.writeInt(this.f158594o);
        parcel.writeInt(this.f158595p);
        parcel.writeInt(this.f158596q);
    }
}
