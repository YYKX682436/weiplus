package com.tencent.matrix.trace.tracer;

/* loaded from: classes12.dex */
public class FileHookTracer extends kj.g0 {

    /* renamed from: e, reason: collision with root package name */
    public static kj.d f53002e = null;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f53003f = "";

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String[] f53004g = new java.lang.String[0];

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("trace-canary");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/matrix/trace/tracer/FileHookTracer", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/matrix/trace/tracer/FileHookTracer", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public static native void nativeInitFileHook(java.lang.String str, java.lang.String[] strArr);

    private static void onFileWrite(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        kj.d dVar = f53002e;
        if (dVar != null) {
            aw1.g gVar = (aw1.g) dVar;
            gVar.getClass();
            kotlin.jvm.internal.o.d(str);
            if (r26.n0.B(str, "test_writable", false) || r26.n0.B(str, "/.ref/", false) || r26.n0.B(str, "/c2c_temp/", false) || r26.i0.n(str, "⌖", false) || z65.c.f470458d || mt1.b0.f331203m) {
                return;
            }
            java.util.Iterator it = aw1.m.f14590b.iterator();
            boolean z17 = false;
            while (it.hasNext()) {
                if (r26.n0.B(str, (java.lang.String) it.next(), false)) {
                    z17 = true;
                }
            }
            if (z17) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
                kotlin.jvm.internal.o.f(stackTrace, "getStackTrace(...)");
                for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
                    sb6.append(stackTraceElement);
                    sb6.append(";");
                }
                com.tencent.mm.sdk.platformtools.o4 o4Var = gVar.f14519a;
                if (o4Var.contains(str)) {
                    return;
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append((java.lang.Object) sb6);
                kotlin.jvm.internal.o.d(str3);
                sb7.append(r26.i0.t(str3, "\n", ";", false));
                o4Var.putString(str, sb7.toString());
                gVar.f14520b.putLong(str, hq.d.a());
                com.tencent.mars.xlog.Log.i("MicroMsg.C2CWildFileCleaner", "path = " + str + ", flags = " + i17 + ", soName = " + str2);
            }
        }
    }

    @Override // kj.g0
    public synchronized void d() {
        super.d();
        java.util.Arrays.toString(f53004g);
        nativeInitFileHook(f53003f, f53004g);
    }

    @Override // kj.g0
    public void f() {
        super.f();
    }
}
