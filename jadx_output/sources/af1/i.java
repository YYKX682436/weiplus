package af1;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final af1.i f4478a = new af1.i();

    public final int a(oe1.q1 q1Var, android.net.Uri uri) {
        boolean m17;
        com.tencent.mars.xlog.Log.i("MicroMsg.ExoContentTypeInferer", "inferer#get, useContentInferer: true");
        com.tencent.mars.xlog.Log.i("MicroMsg.ExoContentTypeInferer", "infer#ContentContentTypeInferer3, uri: " + uri);
        if (uri != null) {
            af1.d dVar = new af1.d(q1Var, uri);
            java.lang.String uri2 = uri.toString();
            kotlin.jvm.internal.o.f(uri2, "toString(...)");
            java.io.InputStream inputStream = (java.io.InputStream) dVar.invoke(uri2);
            if (inputStream != null) {
                try {
                    try {
                        m17 = ye1.b.f461179a.a(inputStream);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.ContainerFormatInferer", e17, "judge isHls fail", new java.lang.Object[0]);
                        m17 = ve1.g.m(uri2);
                    }
                    vz5.b.a(inputStream, null);
                } catch (java.lang.Throwable th6) {
                    try {
                        throw th6;
                    } catch (java.lang.Throwable th7) {
                        vz5.b.a(inputStream, th6);
                        throw th7;
                    }
                }
            } else {
                m17 = ve1.g.m(uri2);
            }
            r0 = m17 ? 2 : 3;
            com.tencent.mars.xlog.Log.i("MicroMsg.ExoContentTypeInferer", "infer#ContentContentTypeInferer3, type: " + r0);
        }
        return r0;
    }
}
