package com.tencent.matrix.hook.jnihook;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00052\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0007J\t\u0010\r\u001a\u00020\u0003H\u0087 J\u0011\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0005H\u0087 J\t\u0010\u0012\u001a\u00020\u0011H\u0087 J\t\u0010\u0014\u001a\u00020\u0013H\u0083 J\u0011\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0083 J\u0011\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0015H\u0083 J\u0011\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0015H\u0083 ¨\u0006\u001c"}, d2 = {"Lcom/tencent/matrix/hook/jnihook/JniHookJni;", "", "", "", "signaturePrefixes", "", "onSetHiddenApiExemptions", "([Ljava/lang/String;)I", "bufID", com.tencent.tmassistantsdk.downloadservice.DownloadInfo.PRIORITY, "tag", "msg", "on_println_native", "readPackageNameNative", "mode", "", "getPageSize", "", "setHiddenApiExemptionsEnabled", "Ljz5/f0;", "jniPlaceHolder", "Ljava/lang/reflect/Method;", "jniMethodPlaceHolder", "initJniHookByPlaceHolderMethod", "jniMethodSetHiddenApiExemptions", "installHooksForHiddenApiExemptions", "jniMethod_println_native", "installHooksPrintlnNative", "matrix-hooks_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class JniHookJni {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f52640a;

    /* renamed from: b, reason: collision with root package name */
    public static yz5.l f52641b;

    /* renamed from: c, reason: collision with root package name */
    public static yz5.r f52642c;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.matrix.hook.jnihook.JniHookJni f52644e = new com.tencent.matrix.hook.jnihook.JniHookJni();

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f52643d = jz5.h.b(yh.a.f462359d);

    public static final void c() {
        if (!f(false, 1, null)) {
            throw new java.lang.RuntimeException("Check #isSupported() before calling!");
        }
    }

    public static final int d(yz5.r rVar) {
        c();
        try {
            f52642c = rVar;
            java.lang.Class cls = java.lang.Integer.TYPE;
            java.lang.reflect.Method jniMethod = android.util.Log.class.getDeclaredMethod("println_native", cls, cls, java.lang.String.class, java.lang.String.class);
            kotlin.jvm.internal.o.f(jniMethod, "jniMethod");
            return installHooksPrintlnNative(jniMethod);
        } catch (java.lang.Exception e17) {
            oj.j.f("Matrix.JniHookJni", "hookJniMethod_println_native err:" + e17, new java.lang.Object[0]);
            return -1;
        }
    }

    public static final int e(yz5.l lVar) {
        c();
        try {
            f52641b = lVar;
            java.lang.reflect.Method jniMethod = java.lang.Class.forName("dalvik.system.VMRuntime").getDeclaredMethod("setHiddenApiExemptions", java.lang.String[].class);
            kotlin.jvm.internal.o.f(jniMethod, "jniMethod");
            return installHooksForHiddenApiExemptions(jniMethod);
        } catch (java.lang.Exception e17) {
            oj.j.f("Matrix.JniHookJni", "hookJniSetHiddenApiExemptions err:" + e17, new java.lang.Object[0]);
            return -1;
        }
    }

    public static boolean f(boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        if (z17) {
            oj.j.c("Matrix.JniHookJni", "init=" + f52640a + ", status=" + ((java.lang.Number) ((jz5.n) f52643d).getValue()).intValue(), new java.lang.Object[0]);
        }
        return f52640a && ((java.lang.Number) ((jz5.n) f52643d).getValue()).intValue() > 0;
    }

    public static final native long getPageSize(int mode);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int initJniHookByPlaceHolderMethod(java.lang.reflect.Method jniMethodPlaceHolder);

    private static final native int installHooksForHiddenApiExemptions(java.lang.reflect.Method jniMethodSetHiddenApiExemptions);

    private static final native int installHooksPrintlnNative(java.lang.reflect.Method jniMethod_println_native);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void jniPlaceHolder();

    public static final int onSetHiddenApiExemptions(java.lang.String[] signaturePrefixes) {
        java.lang.Integer num;
        oj.j.c("Matrix.JniHookJni", "onSetHiddenApiExemptions: " + signaturePrefixes, new java.lang.Object[0]);
        yz5.l lVar = f52641b;
        if (lVar == null || (num = (java.lang.Integer) lVar.invoke(signaturePrefixes)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public static final int on_println_native(int bufID, int priority, java.lang.String tag, java.lang.String msg) {
        java.lang.Integer num;
        yz5.r rVar = f52642c;
        if (rVar == null || (num = (java.lang.Integer) rVar.C(java.lang.Integer.valueOf(bufID), java.lang.Integer.valueOf(priority), tag, msg)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public static final native java.lang.String readPackageNameNative();

    public static final native boolean setHiddenApiExemptionsEnabled();
}
