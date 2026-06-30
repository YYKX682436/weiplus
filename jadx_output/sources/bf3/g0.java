package bf3;

/* loaded from: classes7.dex */
public final class g0 {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f19630d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f19631e;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f19628b = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(bf3.g0.class, "disableShowAlert", "getDisableShowAlert()Z", 0))};

    /* renamed from: a, reason: collision with root package name */
    public static final bf3.g0 f19627a = new bf3.g0();

    /* renamed from: c, reason: collision with root package name */
    public static final nf.r f19629c = new nf.r(java.lang.Boolean.FALSE);

    public final void a() {
        com.tencent.mars.xlog.Log.i("MBServerUtil", "start load so");
        bf3.c0 c0Var = new bf3.c0();
        ah.d.f4713b = c0Var;
        g8.c.f269408a = new ah.b(c0Var);
        ah.d.a();
        ah.d.b("wxa-runtime-binding");
        com.tencent.mars.xlog.Log.i("MBServerUtil", "load so done");
    }

    public final void b(java.lang.String serialTag, yz5.a theThing) {
        kotlin.jvm.internal.o.g(serialTag, "serialTag");
        kotlin.jvm.internal.o.g(theThing, "theThing");
        ((ku5.t0) ku5.t0.f312615d).b(new bf3.d0(theThing), serialTag);
    }

    public final java.nio.ByteBuffer c(jc3.x pkgManagement, java.lang.String path) {
        kotlin.jvm.internal.o.g(pkgManagement, "pkgManagement");
        kotlin.jvm.internal.o.g(path, "path");
        ik1.b0 b0Var = new ik1.b0();
        com.tencent.mm.plugin.appbrand.appstorage.j1 readFile = pkgManagement.b().readFile(path, b0Var);
        kotlin.jvm.internal.o.f(readFile, "readFile(...)");
        if (readFile == com.tencent.mm.plugin.appbrand.appstorage.j1.OK) {
            return (java.nio.ByteBuffer) b0Var.f291824a;
        }
        return null;
    }
}
