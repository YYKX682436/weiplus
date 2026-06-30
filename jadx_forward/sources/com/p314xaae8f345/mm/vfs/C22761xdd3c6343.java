package com.p314xaae8f345.mm.vfs;

/* renamed from: com.tencent.mm.vfs.QuotaFileSystem */
/* loaded from: classes12.dex */
public class C22761xdd3c6343 extends com.p314xaae8f345.mm.vfs.AbstractC22734x1e3d8cad {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.vfs.C22761xdd3c6343> f39823x681a0c0c = new com.p314xaae8f345.mm.vfs.r4();

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb f294273e;

    /* renamed from: f, reason: collision with root package name */
    public final long f294274f;

    /* renamed from: g, reason: collision with root package name */
    public final long f294275g;

    /* renamed from: h, reason: collision with root package name */
    public final long f294276h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f294277i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.f1 f294278m;

    public C22761xdd3c6343(com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb, long j17, long j18, long j19, boolean z17, java.lang.String str) {
        this.f294273e = interfaceC22750xe27c22eb;
        this.f294274f = j17;
        this.f294275g = j18;
        this.f294276h = j19;
        this.f294277i = z17;
        this.f294278m = str == null ? null : new com.p314xaae8f345.mm.vfs.f1(str);
        if (j18 < j17) {
            throw new java.lang.IllegalArgumentException("Cleaning threshold must not less than target size.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v9, types: [int] */
    @Override // com.p314xaae8f345.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        java.lang.String[] split;
        long j17 = this.f294274f;
        long j18 = this.f294275g;
        long j19 = this.f294276h;
        ?? r66 = this.f294277i;
        com.p314xaae8f345.mm.vfs.f1 f1Var = this.f294278m;
        boolean z17 = r66;
        if (f1Var != null) {
            java.lang.String a17 = f1Var.a(map);
            if (a17 == null) {
                java.util.regex.Pattern pattern = com.p314xaae8f345.mm.vfs.e8.f294450a;
                split = new java.lang.String[0];
            } else {
                split = com.p314xaae8f345.mm.vfs.e8.f294451b.split(a17);
            }
            int length = split.length;
            z17 = r66;
            if (length != 0) {
                boolean z18 = r66;
                if (length != 1) {
                    boolean z19 = r66;
                    if (length != 2) {
                        boolean z27 = r66;
                        if (length != 3) {
                            java.lang.String str = split[3];
                            if (str != null) {
                                try {
                                    r66 = java.lang.Integer.parseInt(str);
                                } catch (java.lang.NumberFormatException unused) {
                                }
                            }
                            z27 = r66 != 0;
                        }
                        j19 = com.p314xaae8f345.mm.vfs.e8.n(split[2], j19);
                        z19 = z27;
                    }
                    j18 = com.p314xaae8f345.mm.vfs.e8.m(split[1], j18);
                    z18 = z19;
                }
                j17 = com.p314xaae8f345.mm.vfs.e8.m(split[0], j17);
                z17 = z18;
            }
        }
        return new com.p314xaae8f345.mm.vfs.u4(this, (com.p314xaae8f345.mm.vfs.q2) this.f294273e.b(map), j17, j18, j19, z17, map);
    }

    /* renamed from: equals */
    public boolean m82335xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.mm.vfs.C22761xdd3c6343)) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.C22761xdd3c6343 c22761xdd3c6343 = (com.p314xaae8f345.mm.vfs.C22761xdd3c6343) obj;
        return this.f294273e.equals(c22761xdd3c6343.f294273e) && this.f294274f == c22761xdd3c6343.f294274f && this.f294275g == c22761xdd3c6343.f294275g && this.f294276h == c22761xdd3c6343.f294276h && this.f294277i == c22761xdd3c6343.f294277i;
    }

    /* renamed from: hashCode */
    public int m82336x8cdac1b() {
        int hashCode = com.p314xaae8f345.mm.vfs.C22761xdd3c6343.class.hashCode();
        java.lang.Object[] objArr = {this.f294273e, java.lang.Long.valueOf(this.f294274f), java.lang.Long.valueOf(this.f294275g), java.lang.Long.valueOf(this.f294276h), java.lang.Boolean.valueOf(this.f294277i)};
        java.util.regex.Pattern pattern = com.p314xaae8f345.mm.vfs.e8.f294450a;
        return hashCode ^ java.util.Arrays.deepHashCode(objArr);
    }

    /* renamed from: toString */
    public java.lang.String m82337x9616526c() {
        java.lang.String m82389x9616526c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("quota(");
        com.p314xaae8f345.mm.vfs.f1 f1Var = this.f294278m;
        if (f1Var == null) {
            m82389x9616526c = com.p314xaae8f345.mm.vfs.e8.g(this.f294274f) + " / " + com.p314xaae8f345.mm.vfs.e8.g(this.f294275g);
        } else {
            m82389x9616526c = f1Var.m82389x9616526c();
        }
        sb6.append(m82389x9616526c);
        sb6.append(") <- ");
        sb6.append(this.f294273e);
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.p314xaae8f345.mm.vfs.e8.u(parcel, com.p314xaae8f345.mm.vfs.C22761xdd3c6343.class, 3);
        parcel.writeParcelable(this.f294273e, i17);
        parcel.writeLong(this.f294274f);
        parcel.writeLong(this.f294275g);
        parcel.writeLong(this.f294276h);
        parcel.writeByte(this.f294277i ? (byte) 1 : (byte) 0);
    }

    public C22761xdd3c6343(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.vfs.e8.b(parcel, com.p314xaae8f345.mm.vfs.C22761xdd3c6343.class, 3);
        com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb = (com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) parcel.readParcelable(getClass().getClassLoader());
        this.f294273e = interfaceC22750xe27c22eb;
        if (interfaceC22750xe27c22eb != null) {
            long readLong = parcel.readLong();
            this.f294274f = readLong;
            long readLong2 = parcel.readLong();
            this.f294275g = readLong2;
            this.f294276h = parcel.readLong();
            this.f294277i = parcel.readByte() != 0;
            java.lang.String readString = parcel.readString();
            this.f294278m = readString == null ? null : new com.p314xaae8f345.mm.vfs.f1(readString);
            if (readLong2 < readLong) {
                throw new java.lang.IllegalArgumentException("Cleaning threshold must not less than target size.");
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("Wrong wrapped filesystem.");
    }
}
