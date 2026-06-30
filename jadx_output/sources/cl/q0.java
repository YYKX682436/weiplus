package cl;

/* loaded from: classes7.dex */
public class q0 {

    /* renamed from: k, reason: collision with root package name */
    public static boolean f42721k;

    /* renamed from: l, reason: collision with root package name */
    public static volatile com.tencent.mars.xlog.Log.LogImp f42722l;

    /* renamed from: b, reason: collision with root package name */
    public final cl.p f42724b;

    /* renamed from: c, reason: collision with root package name */
    public final cl.u f42725c;

    /* renamed from: d, reason: collision with root package name */
    public final cl.t f42726d;

    /* renamed from: e, reason: collision with root package name */
    public final cl.s f42727e;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.FutureTask f42730h;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f42723a = "MicroMsg.J2V8.V8ContextEngine#" + hashCode();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f42728f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.weapp_core.PerformanceNowUs f42729g = null;

    /* renamed from: i, reason: collision with root package name */
    public com.eclipsesource.mmv8.V8Object f42731i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f42732j = true;

    public q0(cl.p pVar, cl.u uVar, cl.i1 i1Var) {
        new java.util.HashMap();
        this.f42724b = pVar;
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new cl.b1(this, i1Var));
        this.f42730h = futureTask;
        ((cl.a) pVar).h(futureTask, false);
        this.f42725c = uVar == null ? new cl.x2() : uVar;
        this.f42726d = new cl.n0(this);
        this.f42727e = new cl.j0();
        ((cl.a) pVar).h(new cl.c1(this), false);
    }

    public static java.lang.String a(cl.q0 q0Var, java.lang.String str) {
        q0Var.getClass();
        if (!f42721k) {
            return str;
        }
        if (str == null) {
            return null;
        }
        return str.startsWith("https://") ? str.substring(8) : str;
    }

    public final void b(java.util.ArrayList arrayList, java.lang.String str, cl.j1 j1Var) {
        java.util.Objects.requireNonNull(arrayList);
        ((cl.a) this.f42724b).h(new cl.h1(this, j1Var, arrayList, str), false);
    }

    public void c() {
        ((cl.a) this.f42724b).f42587t.add(new cl.u0(this));
    }

    public void d(java.lang.String str, cl.j1 j1Var) {
        ((cl.a) this.f42724b).h(new cl.e1(this, j1Var, str), false);
    }

    public long e() {
        com.eclipsesource.mmv8.V8Context f17 = f();
        if (f17 != null) {
            return f17.getPtr();
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.J2V8.V8ContextEngine", "getContextPtr: V8Context is null, likely interrupted or looper ended");
        return 0L;
    }

    public com.eclipsesource.mmv8.V8Context f() {
        try {
            return (com.eclipsesource.mmv8.V8Context) this.f42730h.get(10L, java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.J2V8.V8ContextEngine", e17, "getV8Context failed", new java.lang.Object[0]);
            return null;
        }
    }

    public void g(int i17, com.tencent.mm.plugin.appbrand.jsruntime.s sVar) {
        cl.a aVar = (cl.a) this.f42724b;
        if (aVar.f42582o < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AbstractJSRuntime", "setJsExceptionHandler after destroyed, JsRuntime[%d] stack=%s", java.lang.Integer.valueOf(aVar.hashCode()), android.util.Log.getStackTraceString(new java.lang.Throwable()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AbstractJSRuntime", "setJsExceptionHandler contextId[%d] JsRuntime[%d] JSThread.id[%d], currentThread.id[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(aVar.hashCode()), java.lang.Integer.valueOf(aVar.f42582o), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        synchronized (aVar.f42586s) {
            aVar.f42586s.put(i17, sVar);
        }
    }
}
