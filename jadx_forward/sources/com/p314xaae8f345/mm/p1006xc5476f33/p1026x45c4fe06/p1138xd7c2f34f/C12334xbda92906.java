package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult */
/* loaded from: classes7.dex */
final class C12334xbda92906 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12334xbda92906> f35052x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q1();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o1 f165918d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.AbstractC12323x626e3745 f165919e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 f165920f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12340xb447464a f165921g;

    /* renamed from: h, reason: collision with root package name */
    public int f165922h;

    /* renamed from: i, reason: collision with root package name */
    public long f165923i;

    /* renamed from: m, reason: collision with root package name */
    public int f165924m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f165925n;

    public C12334xbda92906() {
        this.f165924m = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPrepareTask", "writeToParcel event[%s]", this.f165918d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o1 o1Var = this.f165918d;
        parcel.writeInt(o1Var != null ? o1Var.ordinal() + 1 : -1);
        parcel.writeParcelable(this.f165919e, i17);
        parcel.writeParcelable(this.f165920f, i17);
        parcel.writeInt(this.f165922h);
        parcel.writeLong(this.f165923i);
        parcel.writeParcelable(this.f165921g, i17);
        parcel.writeInt(this.f165924m);
        parcel.writeString(this.f165925n);
    }

    public C12334xbda92906(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o1 o1Var;
        int i17 = 0;
        this.f165924m = 0;
        int readInt = parcel.readInt();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o1[] m51763xcee59d22 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o1.m51763xcee59d22();
        int length = m51763xcee59d22.length;
        while (true) {
            if (i17 >= length) {
                o1Var = null;
                break;
            }
            o1Var = m51763xcee59d22[i17];
            if (readInt == o1Var.ordinal() + 1) {
                break;
            } else {
                i17++;
            }
        }
        this.f165918d = o1Var;
        this.f165919e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.AbstractC12323x626e3745) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.AbstractC12323x626e3745.class.getClassLoader());
        this.f165920f = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195.class.getClassLoader());
        this.f165922h = parcel.readInt();
        this.f165923i = parcel.readLong();
        this.f165921g = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12340xb447464a) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12340xb447464a.class.getClassLoader());
        this.f165924m = parcel.readInt();
        this.f165925n = parcel.readString();
    }
}
