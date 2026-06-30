package cl;

/* loaded from: classes7.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f124350a;

    static {
        com.p159x477cd522.p160x333422.V8.m16098xdbb2e1d8(new cl.w());
        f124350a = false;
    }

    public static void a() {
        synchronized (cl.x.class) {
            if (f124350a) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JSRuntimeCreator", "loadJSRuntimeSo already");
                return;
            }
            try {
                cl.r3.c(6, cl.o3.f124245a, -1, null, -1, -1, -1);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JSRuntimeCreator", e17, "", new java.lang.Object[0]);
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JSRuntimeCreator", "loadJSRuntimeSo done");
            synchronized (cl.x.class) {
                f124350a = true;
            }
        }
    }

    public static java.lang.String b() {
        return com.p159x477cd522.p160x333422.V8.m16076xe6c221cf() ? com.p159x477cd522.p160x333422.V8.m16074x88682140() : "";
    }
}
