package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class AssetReader extends com.tencent.mm.plugin.appbrand.appcache.AbsReader {

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo[] f75371i;

    /* renamed from: m, reason: collision with root package name */
    public static final boolean f75369m = !com.tencent.mm.plugin.appbrand.appcache.w8.f76028c;

    /* renamed from: n, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appcache.AssetReader f75370n = new com.tencent.mm.plugin.appbrand.appcache.AssetReader();
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.appcache.AssetReader> CREATOR = new com.tencent.mm.plugin.appbrand.appcache.q();

    public /* synthetic */ AssetReader(android.os.Parcel parcel, com.tencent.mm.plugin.appbrand.appcache.q qVar) {
        this(parcel);
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.t3
    public android.content.res.AssetFileDescriptor G0(java.lang.String str) {
        android.content.res.AssetFileDescriptor assetFileDescriptor = null;
        if (f75369m) {
            return null;
        }
        java.lang.String b17 = com.tencent.mm.plugin.appbrand.appstorage.l1.b(str, true);
        if (b17.endsWith(".js")) {
            b17 = b17.concat(".nocompress");
        }
        android.content.res.AssetManager assets = com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets();
        try {
            if (com.tencent.mm.plugin.appbrand.appcache.w8.f76027b.ordinal() != 0) {
                assetFileDescriptor = assets.openFd("wxa_library" + b17);
            } else {
                assetFileDescriptor = assets.openFd("wxa_library/develop" + b17);
            }
        } catch (java.lang.Exception unused) {
        }
        return assetFileDescriptor;
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.t3
    public java.io.InputStream a(java.lang.String str) {
        if (f75369m) {
            return null;
        }
        java.lang.String b17 = com.tencent.mm.plugin.appbrand.appstorage.l1.b(str, true);
        if (com.tencent.mm.plugin.appbrand.appcache.w8.f76027b.ordinal() != 0) {
            return com.tencent.mm.plugin.appbrand.appcache.w8.b("wxa_library" + b17);
        }
        return com.tencent.mm.plugin.appbrand.appcache.w8.b("wxa_library/develop" + b17);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.ENGLISH, "AssetReader[%d][%s]", java.lang.Integer.valueOf(i()), W0());
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.t3
    public com.tencent.mm.plugin.appbrand.appcache.IPkgInfo v0() {
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo[] wxaPkgWrappingInfoArr = this.f75371i;
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo = wxaPkgWrappingInfoArr[0];
        if (wxaPkgWrappingInfo == null) {
            synchronized (wxaPkgWrappingInfoArr) {
                com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo[] wxaPkgWrappingInfoArr2 = this.f75371i;
                com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo2 = new com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo();
                wxaPkgWrappingInfo2.f75401f = true;
                wxaPkgWrappingInfo2.f75399d = 0;
                if (f75369m) {
                    wxaPkgWrappingInfo2.pkgVersion = 0;
                } else {
                    wxaPkgWrappingInfo2.pkgVersion = com.tencent.mm.plugin.appbrand.appcache.w8.f76026a;
                }
                wxaPkgWrappingInfo2.f75372md5 = "";
                wxaPkgWrappingInfoArr2[0] = wxaPkgWrappingInfo2;
                wxaPkgWrappingInfo = this.f75371i[0];
            }
        }
        return wxaPkgWrappingInfo;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
    }

    public AssetReader() {
        this.f75371i = new com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo[]{null};
    }

    private AssetReader(android.os.Parcel parcel) {
        this();
    }
}
