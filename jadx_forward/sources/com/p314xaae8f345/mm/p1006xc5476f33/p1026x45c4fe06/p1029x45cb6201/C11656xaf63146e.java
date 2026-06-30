package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo */
/* loaded from: classes7.dex */
public class C11656xaf63146e implements android.os.Parcelable, java.lang.Cloneable, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.InterfaceC11654xe38d2811 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e> f33444x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.s4();

    /* renamed from: GAME_PLUGIN_SCRIPT */
    public static final java.lang.String f33445x4ed35ca = "/plugin.js";

    /* renamed from: MAIN_MODULE_NAME */
    public static final java.lang.String f33446xd388c2f8 = "__APP__";

    /* renamed from: MODULE_WITHOUT_MULTI_PLUGIN_CODE */
    public static final java.lang.String f33447xa94b0169 = "__WITHOUT_MULTI_PLUGINCODE__";

    /* renamed from: MODULE_WITHOUT_PLUGIN_CODE */
    public static final java.lang.String f33448xa038ec0f = "__WITHOUT_PLUGINCODE__";

    /* renamed from: PLUGINCODE_ORIGIN_PREFIX */
    public static final java.lang.String f33449x55857b6c = "__plugin__/";

    /* renamed from: PLUGINCODE_PREFIX */
    public static final java.lang.String f33450xed389811 = "/__plugin__/";

    /* renamed from: PLUGIN_CODE */
    public static final java.lang.String f33451xb78d0379 = "__PLUGINCODE__";

    /* renamed from: aliases */
    public java.lang.String[] f33452xc97d4efe;

    /* renamed from: independent */
    public boolean f33453xc73e777a;

    /* renamed from: md5, reason: collision with root package name */
    public java.lang.String f156905md5;

    /* renamed from: name */
    public java.lang.String f33454x337a8b;

    /* renamed from: pkgPath */
    public volatile java.lang.String f33455xe121c411;

    /* renamed from: pkgVersion */
    public int f33456x1c82a56c;

    public /* synthetic */ C11656xaf63146e(android.os.Parcel parcel, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.s4 s4Var) {
        this(parcel);
    }

    /* renamed from: assignFrom */
    public void m49195x3d19fd39(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e c11656xaf63146e) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.setDataPosition(0);
        c11656xaf63146e.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        mo49200xb362ce89(obtain);
        obtain.recycle();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.InterfaceC11654xe38d2811
    /* renamed from: checksumMd5 */
    public java.lang.String mo49188x6476c63b() {
        return this.f156905md5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: getPkgSize */
    public long m49198x1ef07bb7() {
        if (!com.p314xaae8f345.mm.vfs.w6.j(this.f33455xe121c411)) {
            throw new java.io.FileNotFoundException();
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(this.f33455xe121c411);
        if (r6Var.A() && r6Var.h()) {
            return r6Var.C();
        }
        return 0L;
    }

    /* renamed from: isAssignable */
    public boolean mo49199xbe910393(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e c11656xaf63146e) {
        return this.f33454x337a8b.equals(c11656xaf63146e.f33454x337a8b);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.InterfaceC11654xe38d2811
    /* renamed from: lastModified */
    public long mo49189x74c4037f() {
        if (com.p314xaae8f345.mm.vfs.w6.j(this.f33455xe121c411)) {
            return com.p314xaae8f345.mm.vfs.w6.l(this.f33455xe121c411);
        }
        return 0L;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.InterfaceC11654xe38d2811
    /* renamed from: pkgPath */
    public java.lang.String mo49190xe121c411() {
        return this.f33455xe121c411;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.InterfaceC11654xe38d2811
    /* renamed from: pkgVersion */
    public int mo49191x1c82a56c() {
        return this.f33456x1c82a56c;
    }

    /* renamed from: readFromParcel */
    public void mo49200xb362ce89(android.os.Parcel parcel) {
        this.f33455xe121c411 = parcel.readString();
        this.f33454x337a8b = parcel.readString();
        this.f156905md5 = parcel.readString();
        this.f33453xc73e777a = parcel.readByte() != 0;
        this.f33452xc97d4efe = parcel.createStringArray();
    }

    /* renamed from: toString */
    public java.lang.String mo49201x9616526c() {
        return "ModulePkgInfo{name='" + this.f33454x337a8b + "', md5='" + this.f156905md5 + "', independent=" + this.f33453xc73e777a + ", aliases=" + java.util.Arrays.toString(this.f33452xc97d4efe) + ", pkgVersion=" + this.f33456x1c82a56c + ", pkgPath='" + this.f33455xe121c411 + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f33455xe121c411);
        parcel.writeString(this.f33454x337a8b);
        parcel.writeString(this.f156905md5);
        parcel.writeByte(this.f33453xc73e777a ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f33452xc97d4efe);
    }

    public C11656xaf63146e() {
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e m49197x5a5dd5d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e c11656xaf63146e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e();
        c11656xaf63146e.m49195x3d19fd39(this);
        return c11656xaf63146e;
    }

    private C11656xaf63146e(android.os.Parcel parcel) {
        mo49200xb362ce89(parcel);
    }
}
