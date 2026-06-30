package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathActionArg */
/* loaded from: classes13.dex */
public abstract class AbstractC11792xabfc157b extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11791x6a1daa2a {

    /* renamed from: e, reason: collision with root package name */
    public float f158673e;

    /* renamed from: f, reason: collision with root package name */
    public float f158674f;

    /* renamed from: g, reason: collision with root package name */
    public float f158675g;

    /* renamed from: h, reason: collision with root package name */
    public float f158676h;

    /* renamed from: i, reason: collision with root package name */
    public float f158677i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f158678m;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    public void b(android.os.Parcel parcel) {
        this.f158574d = parcel.readString();
        this.f158673e = parcel.readFloat();
        this.f158674f = parcel.readFloat();
        this.f158675g = parcel.readFloat();
        this.f158676h = parcel.readFloat();
        this.f158677i = parcel.readFloat();
        this.f158678m = parcel.readInt() == 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11791x6a1daa2a, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    /* renamed from: equals */
    public boolean mo50000xb2c87fbf(java.lang.Object obj) {
        if (!super.mo50000xb2c87fbf(obj) || !(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.AbstractC11792xabfc157b)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.AbstractC11792xabfc157b abstractC11792xabfc157b = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.AbstractC11792xabfc157b) obj;
        return abstractC11792xabfc157b.f158673e == this.f158673e && abstractC11792xabfc157b.f158674f == this.f158674f && abstractC11792xabfc157b.f158675g == this.f158675g && abstractC11792xabfc157b.f158676h == this.f158676h && abstractC11792xabfc157b.f158678m == this.f158678m;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11791x6a1daa2a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158574d);
        parcel.writeFloat(this.f158673e);
        parcel.writeFloat(this.f158674f);
        parcel.writeFloat(this.f158675g);
        parcel.writeFloat(this.f158676h);
        parcel.writeFloat(this.f158677i);
        parcel.writeInt(this.f158678m ? 1 : 0);
    }
}
