package com.tencent.matrix.hook.signaled;

/* loaded from: classes12.dex */
public class SignaledHook extends xh.b {

    /* renamed from: b, reason: collision with root package name */
    public static m3.a f52684b = new ci.a$$a();

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.matrix.hook.signaled.SignaledHook f52685c = new com.tencent.matrix.hook.signaled.SignaledHook();

    private static native void initLoggerNative(java.lang.String str);

    private static native void installHooksForJniMethod(java.lang.reflect.Method method);

    private static native void installHooksNative(boolean z17, boolean z18);

    public static void logging(int i17, java.lang.String str, java.lang.String str2) {
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

    public static void onSignaled(java.lang.String str, int i17, int i18, int i19, int i27, int i28) {
        f52684b.accept(new ci.b(str, i17, i18, i19, i27, i28));
    }

    private static native void setIgnoredSoListNative(java.lang.String[] strArr);

    private static native void setSignalFilterNative(int[] iArr);

    public static native void testKillNative(boolean z17, int[] iArr);

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
        installHooksNative(false, false);
        return true;
    }

    public void d(java.lang.String str) {
        initLoggerNative(str);
    }

    public void e(boolean z17, boolean z18) {
        installHooksNative(z17, z18);
    }

    public void f() {
        com.tencent.matrix.hook.jnihook.JniHookJni.c();
        try {
            java.lang.Class cls = java.lang.Integer.TYPE;
            installHooksForJniMethod(android.os.Process.class.getDeclaredMethod("sendSignal", cls, cls));
        } catch (java.lang.NoSuchMethodException e17) {
            oj.j.f("Matrix.SignaledHook", "installForJni err:" + e17, new java.lang.Object[0]);
        }
    }

    public void g(java.lang.String[] strArr) {
        setIgnoredSoListNative(strArr);
    }

    public void h(int[] iArr) {
        setSignalFilterNative(iArr);
    }
}
