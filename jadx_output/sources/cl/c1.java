package cl;

/* loaded from: classes7.dex */
public class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f42606d;

    public c1(cl.q0 q0Var) {
        this.f42606d = q0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = false;
        boolean z18 = true;
        if (this.f42606d.f() != null) {
            try {
                com.eclipsesource.mmv8.V8Object globalObject = this.f42606d.f().getGlobalObject();
                com.eclipsesource.mmv8.V8Object object = globalObject.getObject("v8Console");
                if (object == null || object.isUndefined()) {
                    object = globalObject.getObject("console");
                }
                java.lang.String str = this.f42606d.f42723a;
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = (object == null || object.isUndefined()) ? "fail" : "ok";
                com.tencent.mars.xlog.Log.i(str, "initApi, save Inspector console %s", objArr);
                this.f42606d.f42731i = object;
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.J2V8.V8ContextEngine", "get OriginConsole ex: %s", th6.getMessage());
            }
        }
        if (((cl.a) this.f42606d.f42724b).f42589v.f53958p || cl.q0.f42722l != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.J2V8.V8ContextEngine", "initApi, inject V8DirectApiConsole");
            java.util.LinkedList linkedList = this.f42606d.f42728f;
            cl.c2 c2Var = new cl.c2();
            c2Var.b(this.f42606d);
            linkedList.add(c2Var);
        }
        cl.q0 q0Var = this.f42606d;
        cl.p pVar = q0Var.f42724b;
        if ((pVar instanceof cl.e0) && ((cl.a) pVar).f42589v.f53960r) {
            q0Var.f().executeVoidScript("var global = (function() { return this; })();", new cl.k1());
            com.tencent.mars.xlog.Log.i("MicroMsg.J2V8.V8ContextEngine", "[no-node] injected global polyfill");
        }
        cl.q0 q0Var2 = this.f42606d;
        cl.p pVar2 = q0Var2.f42724b;
        if ((pVar2 instanceof cl.e0) && ((cl.a) pVar2).f42589v.f53960r) {
            cl.e0 e0Var = (cl.e0) pVar2;
            long e17 = q0Var2.e();
            if (e17 == 0) {
                e0Var.getClass();
            } else if (e17 == e0Var.E) {
                z17 = true;
            }
            z18 = true ^ z17;
        }
        if (z18) {
            sk1.b.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
            com.tencent.mm.weapp_core.PerformanceNowUs performanceNowUs = new com.tencent.mm.weapp_core.PerformanceNowUs();
            performanceNowUs.bindTo(((cl.a) this.f42606d.f42724b).f42568a.getIsolatePtr(), this.f42606d.e());
            cl.q0 q0Var3 = this.f42606d;
            q0Var3.f42729g = performanceNowUs;
            java.util.LinkedList linkedList2 = q0Var3.f42728f;
            cl.w2 w2Var = new cl.w2();
            w2Var.b(this.f42606d);
            linkedList2.add(w2Var);
        }
        cl.q0 q0Var4 = this.f42606d;
        java.util.LinkedList linkedList3 = q0Var4.f42728f;
        cl.n2 n2Var = new cl.n2();
        n2Var.b(q0Var4);
        linkedList3.add(n2Var);
        cl.q0 q0Var5 = this.f42606d;
        com.tencent.mm.appbrand.v8.IJSRuntime$Config iJSRuntime$Config = ((cl.a) q0Var5.f42724b).f42589v;
        if (q0Var5.f42725c.supportBufferStoreBindTo()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.J2V8.V8ContextEngine", "[v8] [dl: ] [nativebuffer] use NativeBufferJNI");
            cl.q0 q0Var6 = this.f42606d;
            q0Var6.f42725c.bufferStoreBindTo(((cl.a) q0Var6.f42724b).f42568a.getIsolatePtr(), this.f42606d.e());
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.J2V8.V8ContextEngine", "[v8] [dl: ] [nativebuffer] use V8DirectApi");
            cl.q0 q0Var7 = this.f42606d;
            java.util.LinkedList linkedList4 = q0Var7.f42728f;
            cl.v1 v1Var = new cl.v1(q0Var7.f42725c);
            v1Var.b(q0Var7);
            linkedList4.add(v1Var);
        }
        cl.q0 q0Var8 = this.f42606d;
        java.util.LinkedList linkedList5 = q0Var8.f42728f;
        cl.h2 h2Var = new cl.h2(q0Var8.f42726d, q0Var8.f42727e);
        h2Var.b(q0Var8);
        linkedList5.add(h2Var);
    }
}
