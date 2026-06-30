package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes7.dex */
public abstract class j2 {
    public static final java.lang.String a(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader) {
        kotlin.jvm.internal.o.g(iCommLibReader, "<this>");
        java.lang.String checksumMd5 = iCommLibReader.getF90658d().checksumMd5();
        return checksumMd5 == null ? "" : checksumMd5;
    }

    public static final java.lang.String b(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader) {
        kotlin.jvm.internal.o.g(iCommLibReader, "<this>");
        java.lang.String pkgPath = iCommLibReader.getF90658d().pkgPath();
        return ((pkgPath == null || pkgPath.length() == 0) && (iCommLibReader instanceof com.tencent.mm.plugin.appbrand.appcache.AssetReader)) ? "/assets/wxa_library" : pkgPath;
    }
}
