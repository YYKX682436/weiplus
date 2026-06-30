package com.p314xaae8f345.mm.vfs;

/* renamed from: com.tencent.mm.vfs.ExpireFileSystem */
/* loaded from: classes12.dex */
public class C22747x9dc2c96a extends com.p314xaae8f345.mm.vfs.AbstractC22734x1e3d8cad {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.vfs.C22747x9dc2c96a> f39796x681a0c0c = new com.p314xaae8f345.mm.vfs.o1();

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb f294242e;

    /* renamed from: f, reason: collision with root package name */
    public final long f294243f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.f1 f294244g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f294245h;

    public C22747x9dc2c96a(com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb, long j17) {
        this.f294242e = interfaceC22750xe27c22eb;
        this.f294243f = j17;
        this.f294244g = null;
        this.f294245h = false;
    }

    @Override // com.p314xaae8f345.mm.vfs.a0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.vfs.q2 b(java.util.Map map) {
        com.p314xaae8f345.mm.vfs.q2 q2Var = (com.p314xaae8f345.mm.vfs.q2) this.f294242e.b(map);
        long j17 = this.f294243f;
        com.p314xaae8f345.mm.vfs.f1 f1Var = this.f294244g;
        if (f1Var != null) {
            j17 = com.p314xaae8f345.mm.vfs.e8.n(f1Var.a(map), j17);
        }
        return new com.p314xaae8f345.mm.vfs.p1(this, q2Var, j17, map);
    }

    @Override // com.p314xaae8f345.mm.vfs.AbstractC22734x1e3d8cad, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m82306xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.mm.vfs.C22747x9dc2c96a)) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.C22747x9dc2c96a c22747x9dc2c96a = (com.p314xaae8f345.mm.vfs.C22747x9dc2c96a) obj;
        return this.f294243f == c22747x9dc2c96a.f294243f && this.f294245h == c22747x9dc2c96a.f294245h && this.f294242e.equals(c22747x9dc2c96a.f294242e) && com.p314xaae8f345.mm.vfs.e8.f(this.f294244g, c22747x9dc2c96a.f294244g);
    }

    /* renamed from: hashCode */
    public int m82307x8cdac1b() {
        int hashCode = com.p314xaae8f345.mm.vfs.C22747x9dc2c96a.class.hashCode();
        java.lang.Object[] objArr = {this.f294242e, java.lang.Long.valueOf(this.f294243f), this.f294244g, java.lang.Boolean.valueOf(this.f294245h)};
        java.util.regex.Pattern pattern = com.p314xaae8f345.mm.vfs.e8.f294450a;
        return hashCode ^ java.util.Arrays.deepHashCode(objArr);
    }

    /* renamed from: toString */
    public java.lang.String mo82291x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("expire(");
        com.p314xaae8f345.mm.vfs.f1 f1Var = this.f294244g;
        sb6.append(f1Var == null ? com.p314xaae8f345.mm.vfs.e8.h(this.f294243f) : f1Var.m82389x9616526c());
        sb6.append(this.f294245h ? ", D" : "");
        sb6.append(") <- ");
        sb6.append(this.f294242e);
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.p314xaae8f345.mm.vfs.e8.u(parcel, com.p314xaae8f345.mm.vfs.C22747x9dc2c96a.class, 3);
        parcel.writeParcelable(this.f294242e, i17);
        parcel.writeLong(this.f294243f);
        com.p314xaae8f345.mm.vfs.f1 f1Var = this.f294244g;
        parcel.writeString(f1Var == null ? null : f1Var.f294454a);
        parcel.writeByte(this.f294245h ? (byte) 1 : (byte) 0);
    }

    public C22747x9dc2c96a(com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb, long j17, java.lang.String str) {
        this.f294242e = interfaceC22750xe27c22eb;
        this.f294243f = j17;
        this.f294244g = str == null ? null : new com.p314xaae8f345.mm.vfs.f1(str);
        this.f294245h = false;
    }

    public C22747x9dc2c96a(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.vfs.e8.b(parcel, com.p314xaae8f345.mm.vfs.C22747x9dc2c96a.class, 3);
        com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb = (com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) parcel.readParcelable(getClass().getClassLoader());
        this.f294242e = interfaceC22750xe27c22eb;
        if (interfaceC22750xe27c22eb != null) {
            this.f294243f = parcel.readLong();
            java.lang.String readString = parcel.readString();
            this.f294244g = readString == null ? null : new com.p314xaae8f345.mm.vfs.f1(readString);
            this.f294245h = parcel.readByte() != 0;
            return;
        }
        throw new java.lang.IllegalArgumentException("Wrong wrapped filesystem.");
    }
}
