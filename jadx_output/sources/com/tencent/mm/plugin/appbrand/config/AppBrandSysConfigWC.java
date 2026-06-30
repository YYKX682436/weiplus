package com.tencent.mm.plugin.appbrand.config;

/* loaded from: classes7.dex */
public class AppBrandSysConfigWC extends com.tencent.luggage.sdk.config.AppBrandSysConfigLU {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC> CREATOR = new k91.a1();
    public int A1;
    public int B1;
    public int C1;
    public int D1;
    public int E1;
    public java.lang.String F1;
    public java.lang.String G1;
    public boolean H1;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f77338l1;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f77339p1;

    /* renamed from: x1, reason: collision with root package name */
    public int f77340x1;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f77341y0;

    /* renamed from: y1, reason: collision with root package name */
    public byte[] f77342y1;

    /* renamed from: z1, reason: collision with root package name */
    public int f77343z1;

    public AppBrandSysConfigWC() {
    }

    @Override // com.tencent.luggage.sdk.config.AppBrandSysConfigLU, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeByte(this.f77341y0 ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f77338l1 ? 1 : 0);
        parcel.writeInt(this.f77340x1);
        parcel.writeInt(this.f77339p1 ? 1 : 0);
        parcel.writeByteArray(this.f77342y1);
        parcel.writeInt(this.f77343z1);
        parcel.writeInt(this.A1);
        parcel.writeInt(this.B1);
        parcel.writeInt(this.C1);
        parcel.writeInt(this.D1);
        parcel.writeInt(this.E1);
        parcel.writeString(this.F1);
        parcel.writeString(this.G1);
        parcel.writeInt(this.H1 ? 1 : 0);
    }

    public AppBrandSysConfigWC(android.os.Parcel parcel) {
        super(parcel);
        this.f77341y0 = parcel.readByte() != 0;
        this.f77338l1 = parcel.readInt() == 1;
        this.f77340x1 = parcel.readInt();
        this.f77339p1 = parcel.readInt() == 1;
        this.f77342y1 = parcel.createByteArray();
        this.f77343z1 = parcel.readInt();
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
