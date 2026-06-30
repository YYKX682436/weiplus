package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class WxaPluginPkgInfo implements android.os.Parcelable, com.tencent.mm.plugin.appbrand.appcache.IPkgInfo {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo> CREATOR = new com.tencent.mm.plugin.appbrand.appcache.fb();
    public static final java.lang.String PREFIX_EXTENDED = "__extended__/";
    public static final java.lang.String PREFIX_NORMAL = "__plugin__/";
    public java.util.List<java.lang.Integer> contexts;

    /* renamed from: md5, reason: collision with root package name */
    public java.lang.String f75405md5;
    public volatile java.lang.String pkgPath;
    public java.lang.String prefixPath;
    public java.lang.String provider;
    public java.lang.String stringVersion;
    public int version;

    public /* synthetic */ WxaPluginPkgInfo(android.os.Parcel parcel, com.tencent.mm.plugin.appbrand.appcache.fb fbVar) {
        this(parcel);
    }

    public void assignFrom(com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo wxaPluginPkgInfo) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.setDataPosition(0);
        wxaPluginPkgInfo.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        readFromParcel(obtain);
        obtain.recycle();
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.IPkgInfo
    public java.lang.String checksumMd5() {
        return this.f75405md5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isAssignable(com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo wxaPluginPkgInfo) {
        return this.provider.equals(wxaPluginPkgInfo.provider);
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
        return this.version;
    }

    public void readFromParcel(android.os.Parcel parcel) {
        this.pkgPath = parcel.readString();
        this.provider = parcel.readString();
        this.version = parcel.readInt();
        this.f75405md5 = parcel.readString();
        this.prefixPath = parcel.readString();
        this.stringVersion = parcel.readString();
        if (this.contexts == null) {
            this.contexts = new java.util.LinkedList();
        }
        parcel.readList(this.contexts, java.lang.Integer.class.getClassLoader());
    }

    public java.lang.String toString() {
        return "WxaPluginPkgInfo{pkgPath='" + this.pkgPath + "', provider='" + this.provider + "', version=" + this.version + ", md5='" + this.f75405md5 + "', prefixPath='" + this.prefixPath + "', stringVersion='" + this.stringVersion + "', contexts=" + this.contexts + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.pkgPath);
        parcel.writeString(this.provider);
        parcel.writeInt(this.version);
        parcel.writeString(this.f75405md5);
        parcel.writeString(this.prefixPath);
        parcel.writeString(this.stringVersion);
        parcel.writeList(this.contexts);
    }

    public WxaPluginPkgInfo() {
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo m103clone() {
        com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo wxaPluginPkgInfo = new com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo();
        wxaPluginPkgInfo.assignFrom(this);
        return wxaPluginPkgInfo;
    }

    private WxaPluginPkgInfo(android.os.Parcel parcel) {
        readFromParcel(parcel);
    }
}
