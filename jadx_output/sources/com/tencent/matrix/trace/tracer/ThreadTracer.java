package com.tencent.matrix.trace.tracer;

/* loaded from: classes12.dex */
public class ThreadTracer extends kj.g0 {
    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("trace-canary");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/matrix/trace/tracer/ThreadTracer", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/matrix/trace/tracer/ThreadTracer", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    private static native int nativeGetPthreadKeySeq();

    private static native void nativeInitThreadHook(int i17, int i18);

    private static void onMainThreadPriorityModified(int i17, int i18) {
        try {
            dj.b bVar = (dj.b) ih.d.d().a(dj.b.class);
            if (bVar == null) {
                return;
            }
            java.lang.String a17 = lj.f.a();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            oj.d.d(jSONObject, ih.d.d().f291471b);
            jSONObject.put("detail", fj.a.PRIORITY_MODIFIED);
            jSONObject.put("threadStack", a17);
            jSONObject.put("processPriority", i18);
            ri.d0 d0Var = new ri.d0();
            d0Var.f395860b = "Trace_EvilMethod";
            d0Var.f395862d = jSONObject;
            bVar.d(d0Var);
            oj.j.b("ThreadPriorityTracer", "happens MainThreadPriorityModified : %s ", jSONObject.toString());
        } catch (java.lang.Throwable th6) {
            oj.j.b("ThreadPriorityTracer", "onMainThreadPriorityModified error: %s", th6.getMessage());
        }
    }

    private static void onMainThreadTimerSlackModified(long j17) {
        try {
            dj.b bVar = (dj.b) ih.d.d().a(dj.b.class);
            if (bVar == null) {
                return;
            }
            java.lang.String a17 = lj.f.a();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            oj.d.d(jSONObject, ih.d.d().f291471b);
            jSONObject.put("detail", fj.a.TIMERSLACK_MODIFIED);
            jSONObject.put("threadStack", a17);
            jSONObject.put("processTimerSlack", j17);
            ri.d0 d0Var = new ri.d0();
            d0Var.f395860b = "Trace_EvilMethod";
            d0Var.f395862d = jSONObject;
            bVar.d(d0Var);
            oj.j.b("ThreadPriorityTracer", "happens MainThreadPriorityModified : %s ", jSONObject.toString());
        } catch (java.lang.Throwable th6) {
            oj.j.b("ThreadPriorityTracer", "onMainThreadPriorityModified error: %s", th6.getMessage());
        }
    }

    private static void pthreadKeyCallback(int i17, int i18, int i19, java.lang.String str, java.lang.String str2) {
    }

    @Override // kj.g0
    public void d() {
        super.d();
    }

    @Override // kj.g0
    public void f() {
        super.f();
    }
}
