package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf;

/* renamed from: com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle */
/* loaded from: classes7.dex */
public final class C12540xf7cdfd54 implements android.os.Parcelable, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g0 {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f168926d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f168927e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f168928f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.C12540xf7cdfd54 f168925g = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.C12540xf7cdfd54();

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.C12540xf7cdfd54> f35146x681a0c0c = new si1.f();

    public C12540xf7cdfd54(r45.b10 b10Var) {
        this.f168926d = b10Var.f451958d.f273689a;
        java.util.LinkedList linkedList = b10Var.f451959e;
        this.f168927e = ((com.p314xaae8f345.mm.p2495xc50a8b8b.g) linkedList.get(0)).f273689a;
        this.f168928f = ((com.p314xaae8f345.mm.p2495xc50a8b8b.g) linkedList.get(1)).f273689a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m52273x9616526c() {
        return java.lang.String.format(java.util.Locale.US, "PermissionBundle[%d][%d][%d]", java.lang.Integer.valueOf(this.f168926d.length), java.lang.Integer.valueOf(this.f168927e.length), java.lang.Integer.valueOf(this.f168928f.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeByteArray(this.f168926d);
        parcel.writeByteArray(this.f168927e);
        parcel.writeByteArray(this.f168928f);
    }

    private C12540xf7cdfd54() {
        this.f168926d = new byte[0];
        this.f168927e = new byte[0];
        this.f168928f = new byte[0];
    }

    public C12540xf7cdfd54(android.os.Parcel parcel, si1.f fVar) {
        this.f168926d = parcel.createByteArray();
        this.f168927e = parcel.createByteArray();
        this.f168928f = parcel.createByteArray();
    }
}
