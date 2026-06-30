package com.p314xaae8f345.mm.vfs;

/* JADX INFO: Access modifiers changed from: package-private */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/vfs/DBFileMultiplexFileSystem;", "Lcom/tencent/mm/vfs/AbstractFileSystem;", "com/tencent/mm/vfs/g0", "mmkernel_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.vfs.DBFileMultiplexFileSystem */
/* loaded from: classes12.dex */
public final class C22743x31c787d9 extends com.p314xaae8f345.mm.vfs.AbstractC22734x1e3d8cad {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.vfs.C22743x31c787d9> f39792x681a0c0c = new com.p314xaae8f345.mm.vfs.f0();

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb f294235e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb f294236f;

    public C22743x31c787d9(com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb dbFs, com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb fbFs) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dbFs, "dbFs");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fbFs, "fbFs");
        this.f294235e = dbFs;
        this.f294236f = fbFs;
    }

    @Override // com.p314xaae8f345.mm.vfs.a0
    public java.lang.Object b(java.util.Map env) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        java.lang.Object b17 = this.f294235e.b(env);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "configure(...)");
        java.lang.Object b18 = this.f294236f.b(env);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b18, "configure(...)");
        return new com.p314xaae8f345.mm.vfs.g0(this, (com.p314xaae8f345.mm.vfs.q2) b17, (com.p314xaae8f345.mm.vfs.q2) b18);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        com.p314xaae8f345.mm.vfs.e8.u(dest, com.p314xaae8f345.mm.vfs.C22743x31c787d9.class, 1);
        dest.writeParcelable(this.f294235e, i17);
        dest.writeParcelable(this.f294236f, i17);
    }

    public C22743x31c787d9(android.os.Parcel parcel, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        com.p314xaae8f345.mm.vfs.e8.b(parcel, com.p314xaae8f345.mm.vfs.C22743x31c787d9.class, 1);
        android.os.Parcelable readParcelable = parcel.readParcelable(com.p314xaae8f345.mm.vfs.C22743x31c787d9.class.getClassLoader());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(readParcelable);
        this.f294235e = (com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) readParcelable;
        android.os.Parcelable readParcelable2 = parcel.readParcelable(com.p314xaae8f345.mm.vfs.C22743x31c787d9.class.getClassLoader());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(readParcelable2);
        this.f294236f = (com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) readParcelable2;
    }
}
