package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandTaskUsageRecorder$LaunchCheckParams */
/* loaded from: classes7.dex */
final class C12335xaf2ac8cb implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12335xaf2ac8cb> f35053x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.l2();

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 f165926d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 f165927e;

    /* renamed from: f, reason: collision with root package name */
    public final int f165928f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f165929g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 f165930h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 f165931i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f165932m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f165933n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f165934o;

    public C12335xaf2ac8cb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559, int i17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 c12566x87f2d8b7, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33, java.lang.String str2, boolean z17, boolean z18) {
        this.f165926d = c11809xbc286be4;
        this.f165927e = c12559xbdae8559;
        this.f165928f = i17;
        this.f165929g = str;
        this.f165930h = c12566x87f2d8b7;
        this.f165931i = interfaceC11702x4ae7c33;
        this.f165932m = str2;
        this.f165933n = z17;
        this.f165934o = z18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(this.f165926d, i17);
        parcel.writeParcelable(this.f165927e, i17);
        parcel.writeInt(this.f165928f);
        parcel.writeString(this.f165929g);
        parcel.writeParcelable(this.f165930h, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.s1.b(this.f165931i, parcel, i17);
        parcel.writeString(this.f165932m);
        parcel.writeByte(this.f165933n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f165934o ? (byte) 1 : (byte) 0);
    }

    public C12335xaf2ac8cb(android.os.Parcel parcel) {
        this.f165926d = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4.class.getClassLoader());
        this.f165927e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559.class.getClassLoader());
        this.f165928f = parcel.readInt();
        this.f165929g = parcel.readString();
        this.f165930h = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7.class.getClassLoader());
        this.f165931i = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.s1.a(parcel);
        this.f165932m = parcel.readString();
        this.f165933n = parcel.readByte() > 0;
        this.f165934o = parcel.readByte() > 0;
    }
}
