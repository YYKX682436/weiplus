package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f81145a;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f81145a = hashMap;
        hashMap.put("ascii", new com.tencent.mm.plugin.appbrand.jsapi.file.s());
        hashMap.put("base64", new com.tencent.mm.plugin.appbrand.jsapi.file.t());
        hashMap.put("hex", new com.tencent.mm.plugin.appbrand.jsapi.file.u());
        com.tencent.mm.plugin.appbrand.jsapi.file.v vVar = new com.tencent.mm.plugin.appbrand.jsapi.file.v(java.nio.charset.Charset.forName("ISO-10646-UCS-2"));
        hashMap.put("ucs2", vVar);
        hashMap.put("ucs-2", vVar);
        com.tencent.mm.plugin.appbrand.jsapi.file.w wVar = new com.tencent.mm.plugin.appbrand.jsapi.file.w(java.nio.charset.Charset.forName("UTF-16LE"));
        hashMap.put("utf16le", wVar);
        hashMap.put("utf-16le", wVar);
        com.tencent.mm.plugin.appbrand.jsapi.file.x xVar = new com.tencent.mm.plugin.appbrand.jsapi.file.x();
        hashMap.put("utf8", xVar);
        hashMap.put(com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding, xVar);
        com.tencent.mm.plugin.appbrand.jsapi.file.y yVar = new com.tencent.mm.plugin.appbrand.jsapi.file.y();
        hashMap.put("latin1", yVar);
        hashMap.put("binary", yVar);
    }
}
