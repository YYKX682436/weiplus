package com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29;

/* renamed from: com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem */
/* loaded from: classes10.dex */
public class C15635xf0ea441b extends com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078> f36413x681a0c0c = new t23.e1();
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f219977v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f219978w;

    /* renamed from: x, reason: collision with root package name */
    public int f219979x;

    /* renamed from: y, reason: collision with root package name */
    public int f219980y;

    /* renamed from: z, reason: collision with root package name */
    public int f219981z;

    public C15635xf0ea441b() {
        this.f219979x = -1;
        this.f219980y = -1;
        this.f219981z = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = -1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078
    /* renamed from: getType */
    public int mo63659xfb85f7b0() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078
    public java.lang.String o() {
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f219966h) ? this.f219966h : this.f219963e;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078
    public boolean r() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078
    /* renamed from: toString */
    public java.lang.String mo63661x9616526c() {
        return "VideoMediaItem{base=" + super.mo63661x9616526c() + ", videoTrackMime='" + this.f219977v + "', audioTrackMime='" + this.f219978w + "', durationMs=" + this.f219979x + ", videoHeight=" + this.f219980y + ", videoWidth=" + this.f219981z + ", videoBitRate=" + this.A + ", videoIFrameInterval=" + this.B + ", videoFrameRate=" + this.C + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f219963e);
        parcel.writeString(this.f219966h);
        parcel.writeLong(this.f219967i);
        parcel.writeString(this.f219971p);
        parcel.writeInt(this.f219981z);
        parcel.writeInt(this.f219980y);
        parcel.writeInt(this.f219979x);
        parcel.writeString(this.f219977v);
        parcel.writeString(this.f219978w);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.A);
        parcel.writeInt(this.D);
        parcel.writeLong(this.f219968m);
        parcel.writeString(this.f219969n);
        parcel.writeSerializable(this.f219976u);
    }

    public C15635xf0ea441b(long j17) {
        super(j17);
        this.f219979x = -1;
        this.f219980y = -1;
        this.f219981z = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = -1;
    }

    public C15635xf0ea441b(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(j17, str, str2, str3);
        this.f219979x = -1;
        this.f219980y = -1;
        this.f219981z = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = -1;
    }
}
