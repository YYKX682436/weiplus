package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public final class n4 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.widget.input.n4 f91556a = new com.tencent.mm.plugin.appbrand.widget.input.n4();

    static {
        com.tenpay.ndk.FitScLibraryLoader.setLoader(com.tencent.mm.plugin.appbrand.widget.input.m4.f91548a);
    }

    public final java.lang.String a(com.tencent.mm.plugin.appbrand.jsapi.l env, java.lang.String certPath) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(certPath, "certPath");
        ik1.b0 b0Var = new ik1.b0();
        com.tencent.mm.plugin.appbrand.appstorage.u1 fileSystem = env.getFileSystem();
        com.tencent.mm.plugin.appbrand.appstorage.j1 readFile = fileSystem != null ? fileSystem.readFile(certPath, b0Var) : null;
        if (readFile == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.FitRelativeLogic", "readCertPem, opResult is null");
            throw new com.tencent.mm.plugin.appbrand.widget.input.o4("env error");
        }
        if (com.tencent.mm.plugin.appbrand.appstorage.j1.OK != readFile) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.FitRelativeLogic", "getEncryptedData, opResult: " + readFile);
            throw new com.tencent.mm.plugin.appbrand.widget.input.o4("certPath is illegal");
        }
        java.lang.Object value = b0Var.f291824a;
        kotlin.jvm.internal.o.f(value, "value");
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) value;
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return new java.lang.String(bArr, r26.c.f368865a);
    }
}
