package com.p314xaae8f345.mm.vfs;

/* renamed from: com.tencent.mm.vfs.RecordAndExtraGCFileSystem */
/* loaded from: classes12.dex */
public class C22763x4cf77dd1 extends com.p314xaae8f345.mm.vfs.AbstractC22734x1e3d8cad {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.vfs.C22763x4cf77dd1> f39825x681a0c0c = new com.p314xaae8f345.mm.vfs.x4();

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb f294282e;

    public C22763x4cf77dd1(com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb) {
        this.f294282e = interfaceC22750xe27c22eb;
    }

    @Override // com.p314xaae8f345.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        return new com.p314xaae8f345.mm.vfs.z4(this, (com.p314xaae8f345.mm.vfs.q2) this.f294282e.b(map));
    }

    /* renamed from: toString */
    public java.lang.String m82341x9616526c() {
        return "recordGC <- " + this.f294282e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.p314xaae8f345.mm.vfs.e8.u(parcel, com.p314xaae8f345.mm.vfs.C22763x4cf77dd1.class, 1);
        parcel.writeParcelable(this.f294282e, i17);
    }

    public C22763x4cf77dd1(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.vfs.e8.b(parcel, com.p314xaae8f345.mm.vfs.C22763x4cf77dd1.class, 1);
        this.f294282e = (com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) parcel.readParcelable(com.p314xaae8f345.mm.vfs.C22763x4cf77dd1.class.getClassLoader());
    }
}
