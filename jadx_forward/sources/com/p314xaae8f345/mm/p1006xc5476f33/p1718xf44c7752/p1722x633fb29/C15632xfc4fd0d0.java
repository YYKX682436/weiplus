package com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29;

/* renamed from: com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem */
/* loaded from: classes10.dex */
public class C15632xfc4fd0d0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15631xba892b3b {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078> f36411x681a0c0c = new t23.b1();
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public long F;
    public int G;
    public int H;
    public int I;

    /* renamed from: z, reason: collision with root package name */
    public int f219961z;

    public C15632xfc4fd0d0() {
        this.f219961z = 6;
        this.G = 0;
        this.H = 1;
        this.I = 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15631xba892b3b, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15631xba892b3b, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078
    /* renamed from: getType */
    public int mo63659xfb85f7b0() {
        return this.f219961z;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078
    /* renamed from: toString */
    public java.lang.String mo63661x9616526c() {
        return "LivePhotoMediaItem{base=" + super.mo63661x9616526c() + ", type=" + this.f219961z + ", state=" + this.A + ", videoDuration=" + this.B + ", videoHeight=" + this.D + ", videoWidth=" + this.C + ", videoSize=" + this.E + ", coverTimeStampMs=" + this.F + ", isParsedVideo=" + this.G + ", isValid=" + this.H + '}';
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15631xba892b3b, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f219963e);
        parcel.writeString(this.f219966h);
        parcel.writeLong(this.f219967i);
        parcel.writeLong(this.f219968m);
        parcel.writeString(this.f219969n);
        parcel.writeString(this.f219971p);
        parcel.writeSerializable(this.f219976u);
        parcel.writeInt(this.f219961z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
        parcel.writeInt(this.E);
        parcel.writeLong(this.F);
        parcel.writeInt(this.G);
        parcel.writeInt(this.H);
        parcel.writeInt(this.I);
    }

    public C15632xfc4fd0d0(long j17) {
        super(j17);
        this.f219961z = 6;
        this.G = 0;
        this.H = 1;
        this.I = 1;
    }

    public C15632xfc4fd0d0(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(j17, str, str2, str3);
        this.f219961z = 6;
        this.G = 0;
        this.H = 1;
        this.I = 1;
    }
}
