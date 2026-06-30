package com.p314xaae8f345.mm.vfs;

/* renamed from: com.tencent.mm.vfs.AttachmentGCFileSystem */
/* loaded from: classes12.dex */
public class C22739x2588318a extends com.p314xaae8f345.mm.vfs.AbstractC22734x1e3d8cad {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.vfs.C22739x2588318a> f39787x681a0c0c = new com.p314xaae8f345.mm.vfs.m();

    /* renamed from: f, reason: collision with root package name */
    public static boolean f294227f;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb f294228e;

    public C22739x2588318a(com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb) {
        this.f294228e = interfaceC22750xe27c22eb;
    }

    @Override // com.p314xaae8f345.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        return new com.p314xaae8f345.mm.vfs.o(this, (com.p314xaae8f345.mm.vfs.q2) this.f294228e.b(map));
    }

    /* renamed from: toString */
    public java.lang.String m82289x9616526c() {
        return "attachmentGC <- " + this.f294228e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.p314xaae8f345.mm.vfs.e8.u(parcel, com.p314xaae8f345.mm.vfs.C22739x2588318a.class, 1);
        parcel.writeParcelable(this.f294228e, i17);
    }

    public C22739x2588318a(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.vfs.e8.b(parcel, com.p314xaae8f345.mm.vfs.C22739x2588318a.class, 1);
        this.f294228e = (com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) parcel.readParcelable(com.p314xaae8f345.mm.vfs.C22739x2588318a.class.getClassLoader());
    }
}
