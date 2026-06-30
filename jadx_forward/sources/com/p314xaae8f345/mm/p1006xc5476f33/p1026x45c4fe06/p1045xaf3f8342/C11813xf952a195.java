package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342;

/* renamed from: com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC */
/* loaded from: classes7.dex */
public class C11813xf952a195 extends com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195> f33588x681a0c0c = new k91.a1();
    public int A1;
    public int B1;
    public int C1;
    public int D1;
    public int E1;
    public java.lang.String F1;
    public java.lang.String G1;
    public boolean H1;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f158871l1;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f158872p1;

    /* renamed from: x1, reason: collision with root package name */
    public int f158873x1;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f158874y0;

    /* renamed from: y1, reason: collision with root package name */
    public byte[] f158875y1;

    /* renamed from: z1, reason: collision with root package name */
    public int f158876z1;

    public C11813xf952a195() {
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeByte(this.f158874y0 ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f158871l1 ? 1 : 0);
        parcel.writeInt(this.f158873x1);
        parcel.writeInt(this.f158872p1 ? 1 : 0);
        parcel.writeByteArray(this.f158875y1);
        parcel.writeInt(this.f158876z1);
        parcel.writeInt(this.A1);
        parcel.writeInt(this.B1);
        parcel.writeInt(this.C1);
        parcel.writeInt(this.D1);
        parcel.writeInt(this.E1);
        parcel.writeString(this.F1);
        parcel.writeString(this.G1);
        parcel.writeInt(this.H1 ? 1 : 0);
    }

    public C11813xf952a195(android.os.Parcel parcel) {
        super(parcel);
        this.f158874y0 = parcel.readByte() != 0;
        this.f158871l1 = parcel.readInt() == 1;
        this.f158873x1 = parcel.readInt();
        this.f158872p1 = parcel.readInt() == 1;
        this.f158875y1 = parcel.createByteArray();
        this.f158876z1 = parcel.readInt();
        this.A1 = parcel.readInt();
        this.B1 = parcel.readInt();
        this.C1 = parcel.readInt();
        this.D1 = parcel.readInt();
        this.E1 = parcel.readInt();
        this.F1 = parcel.readString();
        this.G1 = parcel.readString();
        this.H1 = parcel.readInt() == 1;
    }
}
