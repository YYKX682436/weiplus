package com.p314xaae8f345.mm.vfs;

/* renamed from: com.tencent.mm.vfs.QQMusicCacheCleanupFileSystem */
/* loaded from: classes12.dex */
public class C22760xc8958b72 extends com.p314xaae8f345.mm.vfs.AbstractC22734x1e3d8cad {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.vfs.C22760xc8958b72> f39822x681a0c0c = new com.p314xaae8f345.mm.vfs.o4();

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb f294272e;

    public C22760xc8958b72(com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb) {
        this.f294272e = interfaceC22750xe27c22eb;
    }

    @Override // com.p314xaae8f345.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        return new com.p314xaae8f345.mm.vfs.q4(this, (com.p314xaae8f345.mm.vfs.q2) this.f294272e.b(map));
    }

    /* renamed from: toString */
    public java.lang.String m82333x9616526c() {
        return "qqMusicCacheGC <- " + this.f294272e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.p314xaae8f345.mm.vfs.e8.u(parcel, com.p314xaae8f345.mm.vfs.C22760xc8958b72.class, 1);
        parcel.writeParcelable(this.f294272e, i17);
    }

    public C22760xc8958b72(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.vfs.e8.b(parcel, com.p314xaae8f345.mm.vfs.C22760xc8958b72.class, 1);
        this.f294272e = (com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) parcel.readParcelable(com.p314xaae8f345.mm.vfs.C22760xc8958b72.class.getClassLoader());
    }
}
