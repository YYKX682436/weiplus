package cl;

/* loaded from: classes7.dex */
public class g3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f42647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f42648e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cl.l3 f42649f;

    public g3(cl.l3 l3Var, cl.q0 q0Var, java.lang.String str) {
        this.f42649f = l3Var;
        this.f42647d = q0Var;
        this.f42648e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f42648e;
        cl.l3 l3Var = this.f42649f;
        l3Var.getClass();
        cl.q0 q0Var = this.f42647d;
        if (q0Var.f().getType("onmessage") != 7) {
            return;
        }
        try {
            com.eclipsesource.mmv8.V8Function v8Function = (com.eclipsesource.mmv8.V8Function) q0Var.f().get("onmessage");
            com.eclipsesource.mmv8.V8Array newV8Array = q0Var.f().newV8Array();
            newV8Array.push(str);
            v8Function.call(q0Var.f().getGlobalObject(), newV8Array);
            v8Function.release();
            newV8Array.release();
        } catch (com.eclipsesource.mmv8.V8ScriptException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.V8EngineWorkerManager", e17, "hy: js exception in worker!", new java.lang.Object[0]);
            l3Var.g(q0Var, e17.getMessage(), e17.getJSStackTrace());
        }
    }
}
