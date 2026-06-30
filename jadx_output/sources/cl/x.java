package cl;

/* loaded from: classes7.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f42817a;

    static {
        com.eclipsesource.mmv8.V8.setLoadLibraryDelegate(new cl.w());
        f42817a = false;
    }

    public static void a() {
        synchronized (cl.x.class) {
            if (f42817a) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JSRuntimeCreator", "loadJSRuntimeSo already");
                return;
            }
            try {
                cl.r3.c(6, cl.o3.f42712a, -1, null, -1, -1, -1);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JSRuntimeCreator", e17, "", new java.lang.Object[0]);
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JSRuntimeCreator", "loadJSRuntimeSo done");
            synchronized (cl.x.class) {
                f42817a = true;
            }
        }
    }

    public static java.lang.String b() {
        return com.eclipsesource.mmv8.V8.isLoaded() ? com.eclipsesource.mmv8.V8.getV8Version() : "";
    }
}
