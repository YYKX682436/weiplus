package com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd;

/* renamed from: com.tencent.matrix.trace.tracer.TouchEventLagTracer */
/* loaded from: classes12.dex */
public class C4716x16362384 extends kj.g0 {

    /* renamed from: e, reason: collision with root package name */
    public static ej.c f134558e;

    /* renamed from: f, reason: collision with root package name */
    public static long f134559f;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f134560g;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("trace-canary");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/matrix/trace/tracer/TouchEventLagTracer", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/matrix/trace/tracer/TouchEventLagTracer", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public C4716x16362384(ej.c cVar) {
        f134558e = cVar;
    }

    /* renamed from: nativeInitTouchEventLagDetective */
    public static native void m41304xc8fcd6c5(int i17);

    /* renamed from: onTouchEventLag */
    private static void m41305x719bf158(int i17) {
        oj.j.b("Matrix.TouchEventLagTracer", "onTouchEventLag, fd = " + i17, new java.lang.Object[0]);
        oj.g.a().post(new kj.f0());
    }

    /* renamed from: onTouchEventLagDumpTrace */
    private static void m41306x6f941139(int i17) {
        oj.j.b("Matrix.TouchEventLagTracer", "onTouchEventLagDumpTrace, fd = " + i17, new java.lang.Object[0]);
        f134560g = lj.f.a();
    }

    @Override // kj.g0
    public synchronized void d() {
        super.d();
        ej.c cVar = f134558e;
        if (cVar.f334792f) {
            cVar.getClass();
            m41304xc8fcd6c5(2000);
        }
    }

    @Override // kj.g0
    public void f() {
        super.f();
    }
}
