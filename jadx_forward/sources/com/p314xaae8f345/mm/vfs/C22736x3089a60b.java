package com.p314xaae8f345.mm.vfs;

/* renamed from: com.tencent.mm.vfs.AccessLogFileSystem */
/* loaded from: classes12.dex */
public class C22736x3089a60b extends com.p314xaae8f345.mm.vfs.AbstractC22734x1e3d8cad {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.vfs.C22736x3089a60b> f39783x681a0c0c = new com.p314xaae8f345.mm.vfs.f();

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb f294221e;

    /* renamed from: f, reason: collision with root package name */
    public final int f294222f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.f1 f294223g;

    public C22736x3089a60b(com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb, int i17, java.lang.String str) {
        this.f294221e = interfaceC22750xe27c22eb;
        this.f294222f = i17;
        this.f294223g = str == null ? null : new com.p314xaae8f345.mm.vfs.f1(str);
    }

    @Override // com.p314xaae8f345.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        int i17 = this.f294222f;
        com.p314xaae8f345.mm.vfs.f1 f1Var = this.f294223g;
        if (f1Var != null) {
            java.lang.String a17 = f1Var.a(map);
            java.util.regex.Pattern pattern = com.p314xaae8f345.mm.vfs.e8.f294450a;
            if (a17 != null) {
                try {
                    i17 = java.lang.Integer.parseInt(a17);
                } catch (java.lang.NumberFormatException unused) {
                }
            }
        }
        com.p314xaae8f345.mm.vfs.q2 q2Var = (com.p314xaae8f345.mm.vfs.q2) this.f294221e.b(map);
        return i17 == 0 ? q2Var : new com.p314xaae8f345.mm.vfs.g(this, q2Var, i17, map);
    }

    /* renamed from: equals */
    public boolean m82280xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.mm.vfs.C22736x3089a60b)) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.C22736x3089a60b c22736x3089a60b = (com.p314xaae8f345.mm.vfs.C22736x3089a60b) obj;
        return this.f294221e.equals(c22736x3089a60b.f294221e) && this.f294222f == c22736x3089a60b.f294222f && com.p314xaae8f345.mm.vfs.e8.f(this.f294223g, c22736x3089a60b.f294223g);
    }

    /* renamed from: hashCode */
    public int m82281x8cdac1b() {
        int hashCode = com.p314xaae8f345.mm.vfs.C22736x3089a60b.class.hashCode();
        java.lang.Object[] objArr = {this.f294221e, java.lang.Integer.valueOf(this.f294222f), this.f294223g};
        java.util.regex.Pattern pattern = com.p314xaae8f345.mm.vfs.e8.f294450a;
        return hashCode ^ java.util.Arrays.deepHashCode(objArr);
    }

    /* renamed from: toString */
    public java.lang.String m82282x9616526c() {
        return java.lang.String.format("log(%04x) <- %s", java.lang.Integer.valueOf(this.f294222f), this.f294221e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.p314xaae8f345.mm.vfs.e8.u(parcel, com.p314xaae8f345.mm.vfs.C22736x3089a60b.class, 2);
        parcel.writeParcelable(this.f294221e, i17);
        parcel.writeInt(this.f294222f);
        com.p314xaae8f345.mm.vfs.f1 f1Var = this.f294223g;
        parcel.writeString(f1Var == null ? null : f1Var.f294454a);
    }

    public C22736x3089a60b(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.vfs.e8.b(parcel, com.p314xaae8f345.mm.vfs.C22736x3089a60b.class, 2);
        com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb = (com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) parcel.readParcelable(getClass().getClassLoader());
        this.f294221e = interfaceC22750xe27c22eb;
        if (interfaceC22750xe27c22eb != null) {
            this.f294222f = parcel.readInt();
            java.lang.String readString = parcel.readString();
            this.f294223g = readString == null ? null : new com.p314xaae8f345.mm.vfs.f1(readString);
            return;
        }
        throw new java.lang.IllegalArgumentException("Wrong wrapped filesystem.");
    }
}
