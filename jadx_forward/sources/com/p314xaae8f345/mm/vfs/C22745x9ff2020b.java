package com.p314xaae8f345.mm.vfs;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/vfs/DeleteBlockingFileSystem;", "Lcom/tencent/mm/vfs/AbstractFileSystem;", "com/tencent/mm/vfs/q0", "mmkernel_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.vfs.DeleteBlockingFileSystem */
/* loaded from: classes12.dex */
public final class C22745x9ff2020b extends com.p314xaae8f345.mm.vfs.AbstractC22734x1e3d8cad {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.vfs.C22745x9ff2020b> f39794x681a0c0c = new com.p314xaae8f345.mm.vfs.p0();

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb f294238e;

    public C22745x9ff2020b(com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb fs6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fs6, "fs");
        this.f294238e = fs6;
    }

    @Override // com.p314xaae8f345.mm.vfs.a0
    public java.lang.Object b(java.util.Map env) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        java.lang.Object b17 = this.f294238e.b(env);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "configure(...)");
        return new com.p314xaae8f345.mm.vfs.q0(this, (com.p314xaae8f345.mm.vfs.q2) b17);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        com.p314xaae8f345.mm.vfs.e8.u(dest, com.p314xaae8f345.mm.vfs.C22745x9ff2020b.class, 1);
        dest.writeParcelable(this.f294238e, i17);
    }

    public C22745x9ff2020b(android.os.Parcel parcel, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        com.p314xaae8f345.mm.vfs.e8.b(parcel, com.p314xaae8f345.mm.vfs.C22745x9ff2020b.class, 1);
        android.os.Parcelable readParcelable = parcel.readParcelable(com.p314xaae8f345.mm.vfs.C22745x9ff2020b.class.getClassLoader());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(readParcelable);
        this.f294238e = (com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) readParcelable;
    }
}
