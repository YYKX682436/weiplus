package com.p314xaae8f345.mm.vfs;

/* renamed from: com.tencent.mm.vfs.DeleteAllFileSystem */
/* loaded from: classes12.dex */
public class C22744x8a210741 extends com.p314xaae8f345.mm.vfs.AbstractC22734x1e3d8cad {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.vfs.C22744x8a210741> f39793x681a0c0c = new com.p314xaae8f345.mm.vfs.n0();

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb f294237e;

    public C22744x8a210741(com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb) {
        this.f294237e = interfaceC22750xe27c22eb;
    }

    @Override // com.p314xaae8f345.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        return new com.p314xaae8f345.mm.vfs.o0(this, (com.p314xaae8f345.mm.vfs.q2) this.f294237e.b(map));
    }

    /* renamed from: equals */
    public boolean m82297xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof com.p314xaae8f345.mm.vfs.C22744x8a210741) {
            if (this.f294237e.equals(((com.p314xaae8f345.mm.vfs.C22744x8a210741) obj).f294237e)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m82298x8cdac1b() {
        return com.p314xaae8f345.mm.vfs.C22744x8a210741.class.hashCode() ^ this.f294237e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m82299x9616526c() {
        return "delete <- " + this.f294237e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.p314xaae8f345.mm.vfs.e8.u(parcel, com.p314xaae8f345.mm.vfs.C22767x2079386e.class, 1);
        parcel.writeParcelable(this.f294237e, i17);
    }

    public C22744x8a210741(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.vfs.e8.b(parcel, com.p314xaae8f345.mm.vfs.C22767x2079386e.class, 1);
        com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb = (com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) parcel.readParcelable(getClass().getClassLoader());
        this.f294237e = interfaceC22750xe27c22eb;
        if (interfaceC22750xe27c22eb == null) {
            throw new java.lang.IllegalArgumentException("Wrong wrapped filesystem.");
        }
    }
}
