package com.p314xaae8f345.mm.vfs;

/* renamed from: com.tencent.mm.vfs.VideoGCFileSystem */
/* loaded from: classes12.dex */
public class C22771x3b863ca2 extends com.p314xaae8f345.mm.vfs.AbstractC22734x1e3d8cad {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.vfs.C22771x3b863ca2> f39832x681a0c0c = new com.p314xaae8f345.mm.vfs.f8();

    /* renamed from: f, reason: collision with root package name */
    public static boolean f294291f;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb f294292e;

    public C22771x3b863ca2(com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb) {
        this.f294292e = interfaceC22750xe27c22eb;
    }

    @Override // com.p314xaae8f345.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        return new com.p314xaae8f345.mm.vfs.h8(this, (com.p314xaae8f345.mm.vfs.q2) this.f294292e.b(map));
    }

    /* renamed from: toString */
    public java.lang.String m82357x9616526c() {
        return "videoGC <- " + this.f294292e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.p314xaae8f345.mm.vfs.e8.u(parcel, com.p314xaae8f345.mm.vfs.C22771x3b863ca2.class, 1);
        parcel.writeParcelable(this.f294292e, i17);
    }

    public C22771x3b863ca2(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.vfs.e8.b(parcel, com.p314xaae8f345.mm.vfs.C22771x3b863ca2.class, 1);
        this.f294292e = (com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) parcel.readParcelable(com.p314xaae8f345.mm.vfs.C22771x3b863ca2.class.getClassLoader());
    }
}
