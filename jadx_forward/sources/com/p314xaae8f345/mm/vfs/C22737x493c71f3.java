package com.p314xaae8f345.mm.vfs;

/* renamed from: com.tencent.mm.vfs.ApkCleanupFileSystem */
/* loaded from: classes12.dex */
public class C22737x493c71f3 extends com.p314xaae8f345.mm.vfs.AbstractC22734x1e3d8cad {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.vfs.C22737x493c71f3> f39784x681a0c0c = new com.p314xaae8f345.mm.vfs.h();

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb f294224e;

    public C22737x493c71f3(com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb) {
        this.f294224e = interfaceC22750xe27c22eb;
    }

    @Override // com.p314xaae8f345.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        return new com.p314xaae8f345.mm.vfs.i(this, (com.p314xaae8f345.mm.vfs.q2) this.f294224e.b(map));
    }

    /* renamed from: toString */
    public java.lang.String m82284x9616526c() {
        return "apkClean <- " + this.f294224e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.p314xaae8f345.mm.vfs.e8.u(parcel, com.p314xaae8f345.mm.vfs.C22737x493c71f3.class, 1);
        parcel.writeParcelable(this.f294224e, i17);
    }

    public C22737x493c71f3(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.vfs.e8.b(parcel, com.p314xaae8f345.mm.vfs.C22737x493c71f3.class, 1);
        this.f294224e = (com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) parcel.readParcelable(com.p314xaae8f345.mm.vfs.C22737x493c71f3.class.getClassLoader());
    }
}
