package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public interface IPkgInfo extends android.os.Parcelable {
    java.lang.String checksumMd5();

    long lastModified();

    java.lang.String pkgPath();

    int pkgVersion();
}
