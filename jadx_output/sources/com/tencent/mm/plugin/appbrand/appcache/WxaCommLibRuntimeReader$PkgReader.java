package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class WxaCommLibRuntimeReader$PkgReader extends com.tencent.mm.plugin.appbrand.appcache.AbsReader {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader$PkgReader> CREATOR = new com.tencent.mm.plugin.appbrand.appcache.d8();

    /* renamed from: i, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.appcache.y8 f75375i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo f75376m;

    public WxaCommLibRuntimeReader$PkgReader(com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo) {
        this.f75376m = wxaPkgWrappingInfo;
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.t3
    public android.content.res.AssetFileDescriptor G0(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.appcache.y8 P1 = P1();
        P1.a();
        com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info openReadPartialInfo = P1.openReadPartialInfo(str);
        if (openReadPartialInfo == null) {
            return null;
        }
        try {
            return new android.content.res.AssetFileDescriptor(com.tencent.mm.vfs.w6.z(com.tencent.mm.vfs.z7.a(openReadPartialInfo.f75388d), null, "r"), openReadPartialInfo.f75390f, openReadPartialInfo.f75391g);
        } catch (java.io.FileNotFoundException unused) {
            return null;
        }
    }

    public final com.tencent.mm.plugin.appbrand.appcache.y8 P1() {
        if (this.f75375i != null) {
            return this.f75375i;
        }
        synchronized (this) {
            if (this.f75375i == null) {
                this.f75375i = new com.tencent.mm.plugin.appbrand.appcache.y8(this.f75376m.pkgPath());
            }
        }
        return this.f75375i;
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.t3
    public java.io.InputStream a(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.appcache.y8 P1 = P1();
        P1.a();
        return P1.c(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            com.tencent.mm.plugin.appbrand.appcache.y8 y8Var = this.f75375i;
            if (y8Var != null) {
                try {
                    y8Var.close();
                } finally {
                }
            }
            this.f75375i = null;
            if (y8Var != null) {
                y8Var.close();
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void finalize() {
        super.finalize();
        close();
    }

    public java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "PkgReader[%d] [%s]", java.lang.Integer.valueOf(i()), W0());
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.t3
    /* renamed from: v0 */
    public com.tencent.mm.plugin.appbrand.appcache.IPkgInfo getF90658d() {
        return this.f75376m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(this.f75376m, i17);
    }
}
