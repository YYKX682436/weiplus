package cl;

/* loaded from: classes7.dex */
public class q0 {

    /* renamed from: k, reason: collision with root package name */
    public static boolean f124254k;

    /* renamed from: l, reason: collision with root package name */
    public static volatile com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 f124255l;

    /* renamed from: b, reason: collision with root package name */
    public final cl.p f124257b;

    /* renamed from: c, reason: collision with root package name */
    public final cl.u f124258c;

    /* renamed from: d, reason: collision with root package name */
    public final cl.t f124259d;

    /* renamed from: e, reason: collision with root package name */
    public final cl.s f124260e;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.FutureTask f124263h;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f124256a = "MicroMsg.J2V8.V8ContextEngine#" + hashCode();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f124261f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2809x52b77bcb.C22921x2bd339e4 f124262g = null;

    /* renamed from: i, reason: collision with root package name */
    public com.p159x477cd522.p160x333422.C1477x4679881 f124264i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f124265j = true;

    public q0(cl.p pVar, cl.u uVar, cl.i1 i1Var) {
        new java.util.HashMap();
        this.f124257b = pVar;
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new cl.b1(this, i1Var));
        this.f124263h = futureTask;
        ((cl.a) pVar).h(futureTask, false);
        this.f124258c = uVar == null ? new cl.x2() : uVar;
        this.f124259d = new cl.n0(this);
        this.f124260e = new cl.j0();
        ((cl.a) pVar).h(new cl.c1(this), false);
    }

    public static java.lang.String a(cl.q0 q0Var, java.lang.String str) {
        q0Var.getClass();
        if (!f124254k) {
            return str;
        }
        if (str == null) {
            return null;
        }
        return str.startsWith("https://") ? str.substring(8) : str;
    }

    public final void b(java.util.ArrayList arrayList, java.lang.String str, cl.j1 j1Var) {
        java.util.Objects.requireNonNull(arrayList);
        ((cl.a) this.f124257b).h(new cl.h1(this, j1Var, arrayList, str), false);
    }

    public void c() {
        ((cl.a) this.f124257b).f124120t.add(new cl.u0(this));
    }

    public void d(java.lang.String str, cl.j1 j1Var) {
        ((cl.a) this.f124257b).h(new cl.e1(this, j1Var, str), false);
    }

    public long e() {
        com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad f17 = f();
        if (f17 != null) {
            return f17.mo16390xb58863b8();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.J2V8.V8ContextEngine", "getContextPtr: V8Context is null, likely interrupted or looper ended");
        return 0L;
    }

    public com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad f() {
        try {
            return (com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad) this.f124263h.get(10L, java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.J2V8.V8ContextEngine", e17, "getV8Context failed", new java.lang.Object[0]);
            return null;
        }
    }

    public void g(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.s sVar) {
        cl.a aVar = (cl.a) this.f124257b;
        if (aVar.f124115o < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AbstractJSRuntime", "setJsExceptionHandler after destroyed, JsRuntime[%d] stack=%s", java.lang.Integer.valueOf(aVar.hashCode()), android.util.Log.getStackTraceString(new java.lang.Throwable()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbstractJSRuntime", "setJsExceptionHandler contextId[%d] JsRuntime[%d] JSThread.id[%d], currentThread.id[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(aVar.hashCode()), java.lang.Integer.valueOf(aVar.f124115o), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        synchronized (aVar.f124119s) {
            aVar.f124119s.put(i17, sVar);
        }
    }
}
