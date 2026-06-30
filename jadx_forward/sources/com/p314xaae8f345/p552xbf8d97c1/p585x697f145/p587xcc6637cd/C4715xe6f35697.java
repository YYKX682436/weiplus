package com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd;

/* renamed from: com.tencent.matrix.trace.tracer.ThreadTracer */
/* loaded from: classes12.dex */
public class C4715xe6f35697 extends kj.g0 {
    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("trace-canary");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/matrix/trace/tracer/ThreadTracer", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/matrix/trace/tracer/ThreadTracer", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    /* renamed from: nativeGetPthreadKeySeq */
    private static native int m41298x37bfb1b();

    /* renamed from: nativeInitThreadHook */
    private static native void m41299xbde13774(int i17, int i18);

    /* renamed from: onMainThreadPriorityModified */
    private static void m41300x2bcbad0f(int i17, int i18) {
        try {
            dj.b bVar = (dj.b) ih.d.d().a(dj.b.class);
            if (bVar == null) {
                return;
            }
            java.lang.String a17 = lj.f.a();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            oj.d.d(jSONObject, ih.d.d().f373004b);
            jSONObject.put("detail", fj.a.PRIORITY_MODIFIED);
            jSONObject.put("threadStack", a17);
            jSONObject.put("processPriority", i18);
            ri.d0 d0Var = new ri.d0();
            d0Var.f477393b = "Trace_EvilMethod";
            d0Var.f477395d = jSONObject;
            bVar.d(d0Var);
            oj.j.b("ThreadPriorityTracer", "happens MainThreadPriorityModified : %s ", jSONObject.toString());
        } catch (java.lang.Throwable th6) {
            oj.j.b("ThreadPriorityTracer", "onMainThreadPriorityModified error: %s", th6.getMessage());
        }
    }

    /* renamed from: onMainThreadTimerSlackModified */
    private static void m41301x87576f36(long j17) {
        try {
            dj.b bVar = (dj.b) ih.d.d().a(dj.b.class);
            if (bVar == null) {
                return;
            }
            java.lang.String a17 = lj.f.a();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            oj.d.d(jSONObject, ih.d.d().f373004b);
            jSONObject.put("detail", fj.a.TIMERSLACK_MODIFIED);
            jSONObject.put("threadStack", a17);
            jSONObject.put("processTimerSlack", j17);
            ri.d0 d0Var = new ri.d0();
            d0Var.f477393b = "Trace_EvilMethod";
            d0Var.f477395d = jSONObject;
            bVar.d(d0Var);
            oj.j.b("ThreadPriorityTracer", "happens MainThreadPriorityModified : %s ", jSONObject.toString());
        } catch (java.lang.Throwable th6) {
            oj.j.b("ThreadPriorityTracer", "onMainThreadPriorityModified error: %s", th6.getMessage());
        }
    }

    /* renamed from: pthreadKeyCallback */
    private static void m41302xbf3690ea(int i17, int i18, int i19, java.lang.String str, java.lang.String str2) {
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
