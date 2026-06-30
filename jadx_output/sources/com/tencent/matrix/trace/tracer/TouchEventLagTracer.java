package com.tencent.matrix.trace.tracer;

/* loaded from: classes12.dex */
public class TouchEventLagTracer extends kj.g0 {

    /* renamed from: e, reason: collision with root package name */
    public static ej.c f53025e;

    /* renamed from: f, reason: collision with root package name */
    public static long f53026f;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f53027g;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("trace-canary");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/matrix/trace/tracer/TouchEventLagTracer", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/matrix/trace/tracer/TouchEventLagTracer", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public TouchEventLagTracer(ej.c cVar) {
        f53025e = cVar;
    }

    public static native void nativeInitTouchEventLagDetective(int i17);

    private static void onTouchEventLag(int i17) {
        oj.j.b("Matrix.TouchEventLagTracer", "onTouchEventLag, fd = " + i17, new java.lang.Object[0]);
        oj.g.a().post(new kj.f0());
    }

    private static void onTouchEventLagDumpTrace(int i17) {
        oj.j.b("Matrix.TouchEventLagTracer", "onTouchEventLagDumpTrace, fd = " + i17, new java.lang.Object[0]);
        f53027g = lj.f.a();
    }

    @Override // kj.g0
    public synchronized void d() {
        super.d();
        ej.c cVar = f53025e;
        if (cVar.f253259f) {
            cVar.getClass();
            nativeInitTouchEventLagDetective(2000);
        }
    }

    @Override // kj.g0
    public void f() {
        super.f();
    }
}
