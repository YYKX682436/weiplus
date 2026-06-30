package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

@java.lang.Deprecated
/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject */
/* loaded from: classes7.dex */
public class C11696x173f8d55 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11693xc4fcf5fe {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11696x173f8d55> f33484x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.z();

    /* renamed from: n, reason: collision with root package name */
    public int f157645n;

    /* renamed from: o, reason: collision with root package name */
    public long f157646o;

    /* renamed from: p, reason: collision with root package name */
    public int f157647p;

    /* renamed from: q, reason: collision with root package name */
    public int f157648q;

    public /* synthetic */ C11696x173f8d55(android.os.Parcel parcel, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.z zVar) {
        this(parcel);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11693xc4fcf5fe, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11693xc4fcf5fe
    /* renamed from: toString */
    public java.lang.String mo49595x9616526c() {
        return "AppBrandLocalVideoObject{duration=" + this.f157645n + ", size=" + this.f157646o + ", width=" + this.f157647p + ", height=" + this.f157648q + '}';
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11693xc4fcf5fe, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeInt(this.f157645n);
        parcel.writeLong(this.f157646o);
        parcel.writeInt(this.f157647p);
        parcel.writeInt(this.f157648q);
    }

    public C11696x173f8d55() {
    }

    private C11696x173f8d55(android.os.Parcel parcel) {
        super(parcel);
        this.f157645n = parcel.readInt();
        this.f157646o = parcel.readLong();
        this.f157647p = parcel.readInt();
        this.f157648q = parcel.readInt();
    }
}
