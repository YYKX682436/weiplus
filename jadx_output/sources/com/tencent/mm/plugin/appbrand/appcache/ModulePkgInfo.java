package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class ModulePkgInfo implements android.os.Parcelable, java.lang.Cloneable, com.tencent.mm.plugin.appbrand.appcache.IPkgInfo {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo> CREATOR = new com.tencent.mm.plugin.appbrand.appcache.s4();
    public static final java.lang.String GAME_PLUGIN_SCRIPT = "/plugin.js";
    public static final java.lang.String MAIN_MODULE_NAME = "__APP__";
    public static final java.lang.String MODULE_WITHOUT_MULTI_PLUGIN_CODE = "__WITHOUT_MULTI_PLUGINCODE__";
    public static final java.lang.String MODULE_WITHOUT_PLUGIN_CODE = "__WITHOUT_PLUGINCODE__";
    public static final java.lang.String PLUGINCODE_ORIGIN_PREFIX = "__plugin__/";
    public static final java.lang.String PLUGINCODE_PREFIX = "/__plugin__/";
    public static final java.lang.String PLUGIN_CODE = "__PLUGINCODE__";
    public java.lang.String[] aliases;
    public boolean independent;

    /* renamed from: md5, reason: collision with root package name */
    public java.lang.String f75372md5;
    public java.lang.String name;
    public volatile java.lang.String pkgPath;
    public int pkgVersion;

    public /* synthetic */ ModulePkgInfo(android.os.Parcel parcel, com.tencent.mm.plugin.appbrand.appcache.s4 s4Var) {
        this(parcel);
    }

    public void assignFrom(com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo modulePkgInfo) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.setDataPosition(0);
        modulePkgInfo.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        readFromParcel(obtain);
        obtain.recycle();
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.IPkgInfo
    public java.lang.String checksumMd5() {
        return this.f75372md5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getPkgSize() {
        if (!com.tencent.mm.vfs.w6.j(this.pkgPath)) {
            throw new java.io.FileNotFoundException();
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(this.pkgPath);
        if (r6Var.A() && r6Var.h()) {
            return r6Var.C();
        }
        return 0L;
    }

    public boolean isAssignable(com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo modulePkgInfo) {
        return this.name.equals(modulePkgInfo.name);
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.IPkgInfo
    public long lastModified() {
        if (com.tencent.mm.vfs.w6.j(this.pkgPath)) {
            return com.tencent.mm.vfs.w6.l(this.pkgPath);
        }
        return 0L;
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.IPkgInfo
    public java.lang.String pkgPath() {
        return this.pkgPath;
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.IPkgInfo
    public int pkgVersion() {
        return this.pkgVersion;
    }

    public void readFromParcel(android.os.Parcel parcel) {
        this.pkgPath = parcel.readString();
        this.name = parcel.readString();
        this.f75372md5 = parcel.readString();
        this.independent = parcel.readByte() != 0;
        this.aliases = parcel.createStringArray();
    }

    public java.lang.String toString() {
        return "ModulePkgInfo{name='" + this.name + "', md5='" + this.f75372md5 + "', independent=" + this.independent + ", aliases=" + java.util.Arrays.toString(this.aliases) + ", pkgVersion=" + this.pkgVersion + ", pkgPath='" + this.pkgPath + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.pkgPath);
        parcel.writeString(this.name);
        parcel.writeString(this.f75372md5);
        parcel.writeByte(this.independent ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.aliases);
    }

    public ModulePkgInfo() {
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo m102clone() {
        com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo modulePkgInfo = new com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo();
        modulePkgInfo.assignFrom(this);
        return modulePkgInfo;
    }

    private ModulePkgInfo(android.os.Parcel parcel) {
        readFromParcel(parcel);
    }
}
