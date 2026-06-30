package com.p314xaae8f345.mm.vfs;

/* renamed from: com.tencent.mm.vfs.MigrationFileSystem */
/* loaded from: classes12.dex */
public class C22753xce8a3519 extends com.p314xaae8f345.mm.vfs.AbstractC22734x1e3d8cad {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.vfs.C22753xce8a3519> f39818x681a0c0c = new com.p314xaae8f345.mm.vfs.s3();

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb f294249e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.i1 f294250f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.f1 f294251g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.f1 f294252h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.f1 f294253i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.f1 f294254m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.f1 f294255n;

    public C22753xce8a3519(boolean z17, boolean z18, com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb, com.p314xaae8f345.mm.vfs.a0... a0VarArr) {
        this(z17 ? "" : null, z18 ? "" : null, interfaceC22750xe27c22eb, a0VarArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (r0.exists() != false) goto L29;
     */
    @Override // com.p314xaae8f345.mm.vfs.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.util.Map r18) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.vfs.C22753xce8a3519.b(java.util.Map):java.lang.Object");
    }

    @Override // com.p314xaae8f345.mm.vfs.AbstractC22734x1e3d8cad, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m82322xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.mm.vfs.C22753xce8a3519)) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.C22753xce8a3519 c22753xce8a3519 = (com.p314xaae8f345.mm.vfs.C22753xce8a3519) obj;
        return this.f294249e.equals(c22753xce8a3519.f294249e) && this.f294250f.m82408xb2c87fbf(c22753xce8a3519.f294250f) && this.f294251g.m82387xb2c87fbf(c22753xce8a3519.f294251g) && this.f294252h.m82387xb2c87fbf(c22753xce8a3519.f294252h) && this.f294253i.m82387xb2c87fbf(c22753xce8a3519.f294253i) && this.f294254m.m82387xb2c87fbf(c22753xce8a3519.f294254m);
    }

    /* renamed from: hashCode */
    public int m82323x8cdac1b() {
        int hashCode = com.p314xaae8f345.mm.vfs.C22753xce8a3519.class.hashCode();
        java.lang.Object[] objArr = {this.f294249e, this.f294250f, this.f294251g, this.f294252h, this.f294253i, this.f294254m};
        java.util.regex.Pattern pattern = com.p314xaae8f345.mm.vfs.e8.f294450a;
        return hashCode ^ java.util.Arrays.deepHashCode(objArr);
    }

    /* renamed from: toString */
    public java.lang.String m82324x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(512);
        sb6.append("migrate(...) ");
        sb6.append(this.f294249e);
        com.p314xaae8f345.mm.vfs.i1 i1Var = this.f294250f;
        i1Var.getClass();
        for (com.p314xaae8f345.mm.vfs.a0 a0Var : i1Var.f294523a) {
            sb6.append('\n');
            sb6.append("  <- ");
            sb6.append(a0Var);
        }
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.p314xaae8f345.mm.vfs.e8.u(parcel, com.p314xaae8f345.mm.vfs.C22753xce8a3519.class, 8);
        parcel.writeParcelable(this.f294249e, i17);
        this.f294250f.b(parcel);
        parcel.writeString(this.f294251g.f294454a);
        parcel.writeString(this.f294252h.f294454a);
        parcel.writeString(this.f294253i.f294454a);
        parcel.writeString(this.f294254m.f294454a);
        parcel.writeString(this.f294255n.f294454a);
    }

    public C22753xce8a3519(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb, com.p314xaae8f345.mm.vfs.a0... a0VarArr) {
        this(str, str2, null, null, null, interfaceC22750xe27c22eb, a0VarArr);
    }

    public C22753xce8a3519(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb, com.p314xaae8f345.mm.vfs.a0... a0VarArr) {
        if (interfaceC22750xe27c22eb != null) {
            this.f294251g = new com.p314xaae8f345.mm.vfs.f1(str);
            this.f294252h = new com.p314xaae8f345.mm.vfs.f1(str2);
            this.f294253i = new com.p314xaae8f345.mm.vfs.f1(str3);
            this.f294254m = new com.p314xaae8f345.mm.vfs.f1(str4);
            this.f294255n = new com.p314xaae8f345.mm.vfs.f1(str5);
            this.f294249e = interfaceC22750xe27c22eb;
            this.f294250f = new com.p314xaae8f345.mm.vfs.i1(a0VarArr);
            return;
        }
        throw new java.lang.IllegalArgumentException("destination == null");
    }

    public C22753xce8a3519(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.vfs.e8.b(parcel, com.p314xaae8f345.mm.vfs.C22753xce8a3519.class, 8);
        this.f294249e = (com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) parcel.readParcelable(getClass().getClassLoader());
        this.f294250f = new com.p314xaae8f345.mm.vfs.i1(parcel);
        this.f294251g = new com.p314xaae8f345.mm.vfs.f1(parcel.readString());
        this.f294252h = new com.p314xaae8f345.mm.vfs.f1(parcel.readString());
        this.f294253i = new com.p314xaae8f345.mm.vfs.f1(parcel.readString());
        this.f294254m = new com.p314xaae8f345.mm.vfs.f1(parcel.readString());
        this.f294255n = new com.p314xaae8f345.mm.vfs.f1(parcel.readString());
    }
}
