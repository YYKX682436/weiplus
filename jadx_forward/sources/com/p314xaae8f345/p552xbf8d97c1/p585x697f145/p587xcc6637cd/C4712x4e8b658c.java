package com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd;

/* renamed from: com.tencent.matrix.trace.tracer.FileHookTracer */
/* loaded from: classes12.dex */
public class C4712x4e8b658c extends kj.g0 {

    /* renamed from: e, reason: collision with root package name */
    public static kj.d f134535e = null;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f134536f = "";

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String[] f134537g = new java.lang.String[0];

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("trace-canary");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/matrix/trace/tracer/FileHookTracer", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/matrix/trace/tracer/FileHookTracer", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    /* renamed from: nativeInitFileHook */
    public static native void m41280xb31c33a6(java.lang.String str, java.lang.String[] strArr);

    /* renamed from: onFileWrite */
    private static void m41281xaf43bca4(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        kj.d dVar = f134535e;
        if (dVar != null) {
            aw1.g gVar = (aw1.g) dVar;
            gVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            if (r26.n0.B(str, "test_writable", false) || r26.n0.B(str, "/.ref/", false) || r26.n0.B(str, "/c2c_temp/", false) || r26.i0.n(str, "⌖", false) || z65.c.f551991d || mt1.b0.f412736m) {
                return;
            }
            java.util.Iterator it = aw1.m.f96123b.iterator();
            boolean z17 = false;
            while (it.hasNext()) {
                if (r26.n0.B(str, (java.lang.String) it.next(), false)) {
                    z17 = true;
                }
            }
            if (z17) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stackTrace, "getStackTrace(...)");
                for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
                    sb6.append(stackTraceElement);
                    sb6.append(";");
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = gVar.f96052a;
                if (o4Var.contains(str)) {
                    return;
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append((java.lang.Object) sb6);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
                sb7.append(r26.i0.t(str3, "\n", ";", false));
                o4Var.putString(str, sb7.toString());
                gVar.f96053b.putLong(str, hq.d.a());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CWildFileCleaner", "path = " + str + ", flags = " + i17 + ", soName = " + str2);
            }
        }
    }

    @Override // kj.g0
    public synchronized void d() {
        super.d();
        java.util.Arrays.toString(f134537g);
        m41280xb31c33a6(f134536f, f134537g);
    }

    @Override // kj.g0
    public void f() {
        super.f();
    }
}
