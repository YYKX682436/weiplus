package com.p314xaae8f345.mm.vfs;

/* renamed from: com.tencent.mm.vfs.WhiteListFileSystem */
/* loaded from: classes12.dex */
class C22774x30008a72 extends com.p314xaae8f345.mm.vfs.AbstractC22734x1e3d8cad {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.vfs.C22774x30008a72> f39835x681a0c0c;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb f294295e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String[] f294296f;

    static {
        java.util.regex.Pattern.compile("^[0-9a-f]{32}");
        f39835x681a0c0c = new com.p314xaae8f345.mm.vfs.n8();
    }

    public C22774x30008a72(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.vfs.e8.b(parcel, com.p314xaae8f345.mm.vfs.C22774x30008a72.class, 1);
        this.f294295e = (com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) parcel.readParcelable(getClass().getClassLoader());
        this.f294296f = parcel.createStringArray();
    }

    @Override // com.p314xaae8f345.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return (com.p314xaae8f345.mm.vfs.q2) this.f294295e.b(map);
    }

    /* renamed from: toString */
    public java.lang.String m82362x9616526c() {
        return "whiteList <- " + this.f294295e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.p314xaae8f345.mm.vfs.e8.u(parcel, com.p314xaae8f345.mm.vfs.C22774x30008a72.class, 1);
        parcel.writeParcelable(this.f294295e, i17);
        parcel.writeStringArray(this.f294296f);
    }
}
