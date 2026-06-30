package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo */
/* loaded from: classes7.dex */
public class C11669x3195c847 implements android.os.Parcelable, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.InterfaceC11654xe38d2811 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847> f33467x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.fb();

    /* renamed from: PREFIX_EXTENDED */
    public static final java.lang.String f33468x7782c46 = "__extended__/";

    /* renamed from: PREFIX_NORMAL */
    public static final java.lang.String f33469x1586df34 = "__plugin__/";

    /* renamed from: contexts */
    public java.util.List<java.lang.Integer> f33470xde2f80a4;

    /* renamed from: md5, reason: collision with root package name */
    public java.lang.String f156938md5;

    /* renamed from: pkgPath */
    public volatile java.lang.String f33471xe121c411;

    /* renamed from: prefixPath */
    public java.lang.String f33472xb01af1d7;

    /* renamed from: provider */
    public java.lang.String f33473xc52405f1;

    /* renamed from: stringVersion */
    public java.lang.String f33474x1a804f87;

    /* renamed from: version */
    public int f33475x14f51cd8;

    public /* synthetic */ C11669x3195c847(android.os.Parcel parcel, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.fb fbVar) {
        this(parcel);
    }

    /* renamed from: assignFrom */
    public void m49229x3d19fd39(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847 c11669x3195c847) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.setDataPosition(0);
        c11669x3195c847.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        m49233xb362ce89(obtain);
        obtain.recycle();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.InterfaceC11654xe38d2811
    /* renamed from: checksumMd5 */
    public java.lang.String mo49188x6476c63b() {
        return this.f156938md5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: isAssignable */
    public boolean m49232xbe910393(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847 c11669x3195c847) {
        return this.f33473xc52405f1.equals(c11669x3195c847.f33473xc52405f1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.InterfaceC11654xe38d2811
    /* renamed from: lastModified */
    public long mo49189x74c4037f() {
        if (com.p314xaae8f345.mm.vfs.w6.j(this.f33471xe121c411)) {
            return com.p314xaae8f345.mm.vfs.w6.l(this.f33471xe121c411);
        }
        return 0L;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.InterfaceC11654xe38d2811
    /* renamed from: pkgPath */
    public java.lang.String mo49190xe121c411() {
        return this.f33471xe121c411;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.InterfaceC11654xe38d2811
    /* renamed from: pkgVersion */
    public int mo49191x1c82a56c() {
        return this.f33475x14f51cd8;
    }

    /* renamed from: readFromParcel */
    public void m49233xb362ce89(android.os.Parcel parcel) {
        this.f33471xe121c411 = parcel.readString();
        this.f33473xc52405f1 = parcel.readString();
        this.f33475x14f51cd8 = parcel.readInt();
        this.f156938md5 = parcel.readString();
        this.f33472xb01af1d7 = parcel.readString();
        this.f33474x1a804f87 = parcel.readString();
        if (this.f33470xde2f80a4 == null) {
            this.f33470xde2f80a4 = new java.util.LinkedList();
        }
        parcel.readList(this.f33470xde2f80a4, java.lang.Integer.class.getClassLoader());
    }

    /* renamed from: toString */
    public java.lang.String m49234x9616526c() {
        return "WxaPluginPkgInfo{pkgPath='" + this.f33471xe121c411 + "', provider='" + this.f33473xc52405f1 + "', version=" + this.f33475x14f51cd8 + ", md5='" + this.f156938md5 + "', prefixPath='" + this.f33472xb01af1d7 + "', stringVersion='" + this.f33474x1a804f87 + "', contexts=" + this.f33470xde2f80a4 + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f33471xe121c411);
        parcel.writeString(this.f33473xc52405f1);
        parcel.writeInt(this.f33475x14f51cd8);
        parcel.writeString(this.f156938md5);
        parcel.writeString(this.f33472xb01af1d7);
        parcel.writeString(this.f33474x1a804f87);
        parcel.writeList(this.f33470xde2f80a4);
    }

    public C11669x3195c847() {
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847 m49231x5a5dd5d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847 c11669x3195c847 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847();
        c11669x3195c847.m49229x3d19fd39(this);
        return c11669x3195c847;
    }

    private C11669x3195c847(android.os.Parcel parcel) {
        m49233xb362ce89(parcel);
    }
}
