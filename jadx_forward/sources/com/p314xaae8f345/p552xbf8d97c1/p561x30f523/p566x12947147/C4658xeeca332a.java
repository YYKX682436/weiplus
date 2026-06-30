package com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p566x12947147;

/* renamed from: com.tencent.matrix.hook.signaled.SignaledHook */
/* loaded from: classes12.dex */
public class C4658xeeca332a extends xh.b {

    /* renamed from: b, reason: collision with root package name */
    public static m3.a f134217b = new ci.C1395x2ca3e0();

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p566x12947147.C4658xeeca332a f134218c = new com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p566x12947147.C4658xeeca332a();

    /* renamed from: initLoggerNative */
    private static native void m40951xb67266f7(java.lang.String str);

    /* renamed from: installHooksForJniMethod */
    private static native void m40952x45fcd92(java.lang.reflect.Method method);

    /* renamed from: installHooksNative */
    private static native void m40953x970feb4c(boolean z17, boolean z18);

    /* renamed from: logging */
    public static void m40954x1466cb5f(int i17, java.lang.String str, java.lang.String str2) {
        if (i17 == 4) {
            oj.j.c(str, str2, new java.lang.Object[0]);
            return;
        }
        if (i17 == 5) {
            oj.j.f(str, str2, new java.lang.Object[0]);
            return;
        }
        if (i17 == 6) {
            oj.j.b(str, str2, new java.lang.Object[0]);
            return;
        }
        throw new java.lang.IllegalArgumentException("Unknown log level: " + i17 + ", tag=" + str + ", msg=" + str2);
    }

    /* renamed from: onSignaled */
    public static void m40955xb7ae9446(java.lang.String str, int i17, int i18, int i19, int i27, int i28) {
        f134217b.mo3938xab27b508(new ci.b(str, i17, i18, i19, i27, i28));
    }

    /* renamed from: setIgnoredSoListNative */
    private static native void m40956x6b6c2801(java.lang.String[] strArr);

    /* renamed from: setSignalFilterNative */
    private static native void m40957x1f677879(int[] iArr);

    /* renamed from: testKillNative */
    public static native void m40958x6efc0b47(boolean z17, int[] iArr);

    @Override // xh.b
    public java.lang.String a() {
        return "matrix-signaledhook";
    }

    @Override // xh.b
    public boolean b() {
        return true;
    }

    @Override // xh.b
    public boolean c(boolean z17) {
        oj.j.c("Matrix.SignaledHook", "#onHook, installHooksNative: debug=" + z17, new java.lang.Object[0]);
        m40953x970feb4c(false, false);
        return true;
    }

    public void d(java.lang.String str) {
        m40951xb67266f7(str);
    }

    public void e(boolean z17, boolean z18) {
        m40953x970feb4c(z17, z18);
    }

    public void f() {
        com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p562xa9023648.C4650x92765c3d.c();
        try {
            java.lang.Class cls = java.lang.Integer.TYPE;
            m40952x45fcd92(android.os.Process.class.getDeclaredMethod("sendSignal", cls, cls));
        } catch (java.lang.NoSuchMethodException e17) {
            oj.j.f("Matrix.SignaledHook", "installForJni err:" + e17, new java.lang.Object[0]);
        }
    }

    public void g(java.lang.String[] strArr) {
        m40956x6b6c2801(strArr);
    }

    public void h(int[] iArr) {
        m40957x1f677879(iArr);
    }
}
