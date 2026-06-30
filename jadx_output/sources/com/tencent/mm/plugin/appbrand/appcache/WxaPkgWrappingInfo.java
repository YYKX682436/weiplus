package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class WxaPkgWrappingInfo extends com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo implements java.lang.Iterable<com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo> {

    /* renamed from: m, reason: collision with root package name */
    public static boolean f75397m;

    /* renamed from: d, reason: collision with root package name */
    public int f75399d;

    /* renamed from: e, reason: collision with root package name */
    public long f75400e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f75401f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f75402g;

    /* renamed from: h, reason: collision with root package name */
    public volatile transient java.util.Map f75403h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap f75404i;

    /* renamed from: n, reason: collision with root package name */
    public static final bm5.x0 f75398n = new bm5.x0(new com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo$$a());
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo> CREATOR = new com.tencent.mm.plugin.appbrand.appcache.bb();

    public WxaPkgWrappingInfo() {
        this.f75402g = new java.util.LinkedList();
        this.f75404i = null;
        this.name = com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME;
        this.independent = true;
    }

    public static java.lang.String d(com.tencent.mm.vfs.r6 r6Var) {
        java.lang.String str = null;
        if (f75397m && r6Var.m()) {
            try {
                com.tencent.mm.weapp_core.FileDigestUtil fileDigestUtil = (com.tencent.mm.weapp_core.FileDigestUtil) f75398n.b();
                java.lang.String i17 = com.tencent.mm.vfs.w6.i(r6Var.o(), false);
                if (!android.text.TextUtils.isEmpty(i17)) {
                    str = fileDigestUtil.getFileMD5(i17);
                }
            } catch (java.lang.UnsatisfiedLinkError e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.WXA.WxaPkgWrappingInfo", e17, "getFileMD5 by weapp_core", new java.lang.Object[0]);
            }
        } else {
            try {
                com.tencent.mm.plugin.appbrand.appcache.MD5JNILoadGuard.ensureNativeLibrariesLoaded();
                java.lang.String[] strArr = new java.lang.String[1];
                if (-101 == com.tencent.mm.plugin.appbrand.appstorage.MD5JNI.getMD5String(com.tencent.mm.vfs.w6.i(r6Var.o(), false), strArr)) {
                    throw new java.io.IOException("MD5_ERR_FILE_OPEN");
                }
                str = strArr[0];
            } catch (java.lang.UnsatisfiedLinkError e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.WXA.WxaPkgWrappingInfo", e18, "getFileMD5 by jni", new java.lang.Object[0]);
            }
        }
        if (android.text.TextUtils.isEmpty(str)) {
            try {
                java.io.InputStream C = com.tencent.mm.vfs.w6.C(r6Var);
                try {
                    str = kk.k.c(C, 16384);
                    if (C != null) {
                        C.close();
                    }
                } finally {
                }
            } catch (java.io.IOException e19) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.WXA.WxaPkgWrappingInfo", e19, "getFileMD5 by java io", new java.lang.Object[0]);
            }
        }
        return str;
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String e(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        if (com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME.equals(str2)) {
            return str2;
        }
        synchronized (this.f75402g) {
            if (this.f75403h == null) {
                g(str);
            }
            str3 = (java.lang.String) ((android.util.ArrayMap) this.f75403h).get(str2);
            if (android.text.TextUtils.isEmpty(str3)) {
                str3 = str2;
            }
        }
        com.tencent.mars.xlog.Log.i("Luggage.WXA.WxaPkgWrappingInfo", "getModuleNameForURLFetch appId:%s, retrace module %s -> %s", str, str2, str3);
        return str3;
    }

    public void g(java.lang.String str) {
        synchronized (this.f75402g) {
            if (!this.f75402g.isEmpty() && this.f75403h == null) {
                this.f75403h = new android.util.ArrayMap();
                java.util.Iterator it = this.f75402g.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo modulePkgInfo = (com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo) it.next();
                    modulePkgInfo.pkgVersion = this.pkgVersion;
                    java.lang.String str2 = modulePkgInfo.name;
                    if (!com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME.equals(str2)) {
                        str2 = com.tencent.mm.plugin.appbrand.appstorage.l1.b(str2, false);
                    }
                    if (!str2.equals(modulePkgInfo.name)) {
                        com.tencent.mars.xlog.Log.i("Luggage.WXA.WxaPkgWrappingInfo", "setupModuleEnv, appId:%s, module mapped %s -> %s", str, modulePkgInfo.name, str2);
                        ((android.util.ArrayMap) this.f75403h).put(str2, modulePkgInfo.name);
                        modulePkgInfo.name = str2;
                    }
                }
                com.tencent.mars.xlog.Log.i("Luggage.WXA.WxaPkgWrappingInfo", "setupModuleEnv, appId:%s, NameMap.size:%d", str, java.lang.Integer.valueOf(((android.util.ArrayMap) this.f75403h).size()));
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo
    public boolean isAssignable(com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo modulePkgInfo) {
        return modulePkgInfo instanceof com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo ? super.isAssignable(modulePkgInfo) && this.pkgVersion == modulePkgInfo.pkgVersion : super.isAssignable(modulePkgInfo);
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo> iterator() {
        return new com.tencent.mm.plugin.appbrand.appcache.ab(this);
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo
    public void readFromParcel(android.os.Parcel parcel) {
        super.readFromParcel(parcel);
        this.f75399d = parcel.readInt();
        this.pkgVersion = parcel.readInt();
        this.f75400e = parcel.readLong();
        this.f75401f = parcel.readByte() != 0;
        parcel.readTypedList(this.f75402g, com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.CREATOR);
        this.f75404i = (com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap) parcel.readParcelable(com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap.class.getClassLoader());
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo
    public java.lang.String toString() {
        return "WxaPkgWrappingInfo{pkgDebugType=" + this.f75399d + ", pkgVersion=" + this.pkgVersion + ", pkgCreateTime=" + this.f75400e + ", localPkg=" + this.f75401f + ", md5='" + this.f75372md5 + "', pkgPath='" + this.pkgPath + "'}";
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeInt(this.f75399d);
        parcel.writeInt(this.pkgVersion);
        parcel.writeLong(this.f75400e);
        parcel.writeByte(this.f75401f ? (byte) 1 : (byte) 0);
        parcel.writeTypedList(this.f75402g);
        parcel.writeParcelable(this.f75404i, 0);
    }

    public WxaPkgWrappingInfo(android.os.Parcel parcel) {
        this();
        readFromParcel(parcel);
    }
}
