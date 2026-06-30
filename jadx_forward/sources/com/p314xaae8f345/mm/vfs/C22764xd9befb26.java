package com.p314xaae8f345.mm.vfs;

/* renamed from: com.tencent.mm.vfs.RefCountedFileSystem */
/* loaded from: classes12.dex */
public class C22764xd9befb26 extends com.p314xaae8f345.mm.vfs.AbstractC22734x1e3d8cad {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.vfs.C22764xd9befb26> f39826x681a0c0c = new com.p314xaae8f345.mm.vfs.b5();

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb f294283e;

    /* renamed from: f, reason: collision with root package name */
    public final long f294284f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f294285g;

    public C22764xd9befb26(com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb, long j17, boolean z17) {
        this.f294283e = interfaceC22750xe27c22eb;
        this.f294284f = j17;
        this.f294285g = z17;
    }

    public static java.lang.String c(java.lang.String str) {
        return ".ref/d/" + str;
    }

    public static boolean d(java.lang.String str) {
        if (!str.startsWith(".ref")) {
            return false;
        }
        if (str.length() != 4 && str.charAt(4) != '/') {
            return false;
        }
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.w("VFS.RefCountedFileSystem", "Internal path referenced, something shall be wrong: ".concat(str));
        return true;
    }

    public static java.lang.String e(java.lang.String str) {
        return ".ref/c/" + str;
    }

    @Override // com.p314xaae8f345.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        com.p314xaae8f345.mm.vfs.q2 q2Var = (com.p314xaae8f345.mm.vfs.q2) this.f294283e.b(map);
        return q2Var == com.p314xaae8f345.mm.vfs.C22759xc55eb7d2.f() ? q2Var : new com.p314xaae8f345.mm.vfs.g5(this, q2Var, map);
    }

    /* renamed from: equals */
    public boolean m82343xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof com.p314xaae8f345.mm.vfs.C22764xd9befb26) {
            if (this.f294283e.equals(((com.p314xaae8f345.mm.vfs.C22764xd9befb26) obj).f294283e)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m82344x8cdac1b() {
        return com.p314xaae8f345.mm.vfs.C22764xd9befb26.class.hashCode() ^ this.f294283e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m82345x9616526c() {
        return "refCount <- " + this.f294283e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.p314xaae8f345.mm.vfs.e8.u(parcel, com.p314xaae8f345.mm.vfs.C22764xd9befb26.class, 2);
        parcel.writeParcelable(this.f294283e, i17);
        parcel.writeLong(this.f294284f);
        parcel.writeByte(this.f294285g ? (byte) 1 : (byte) 0);
    }

    public C22764xd9befb26(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.vfs.e8.b(parcel, com.p314xaae8f345.mm.vfs.C22764xd9befb26.class, 2);
        com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb = (com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) parcel.readParcelable(getClass().getClassLoader());
        this.f294283e = interfaceC22750xe27c22eb;
        if (interfaceC22750xe27c22eb != null) {
            this.f294284f = parcel.readLong();
            this.f294285g = parcel.readByte() != 0;
            return;
        }
        throw new java.lang.IllegalArgumentException("Wrong wrapped filesystem.");
    }
}
