package com.p314xaae8f345.p552xbf8d97c1.p561x30f523;

/* renamed from: com.tencent.matrix.hook.HookManager */
/* loaded from: classes12.dex */
public class C4648x15f5dcea {

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.p552xbf8d97c1.p561x30f523.C4648x15f5dcea f134165e = new com.p314xaae8f345.p552xbf8d97c1.p561x30f523.C4648x15f5dcea();

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f134166a = false;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f134167b = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f134168c = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public xh.d f134169d = null;

    public static java.lang.String d(java.lang.StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (!stackTraceElement.getClassName().contains("java.lang.Thread")) {
                sb6.append(stackTraceElement);
                sb6.append(';');
            }
        }
        return sb6.toString();
    }

    /* renamed from: doFinalInitializeNative */
    private native void m40870xa74a8d92(boolean z17);

    /* renamed from: doPreHookInitializeNative */
    private native boolean m40871x3e2ac542(boolean z17);

    /* renamed from: getStack */
    public static java.lang.String m40872x752868d2() {
        try {
            java.lang.Thread currentThread = java.lang.Thread.currentThread();
            if (!di.a.a(currentThread)) {
                return "ERROR: invalid";
            }
            f134165e.getClass();
            return d(currentThread.getStackTrace());
        } catch (java.lang.Throwable th6) {
            return "ERROR: " + d(th6.getStackTrace());
        }
    }

    public com.p314xaae8f345.p552xbf8d97c1.p561x30f523.C4648x15f5dcea a(xh.b bVar) {
        if (bVar != null && bVar.f535999a != xh.a.COMMIT_SUCCESS) {
            synchronized (this.f134168c) {
                ((java.util.HashSet) this.f134168c).add(bVar);
            }
        }
        return this;
    }

    public void b() {
        oj.j.c("Matrix.HookManager", "commitHooks", new java.lang.Object[0]);
        synchronized (this.f134167b) {
            synchronized (this.f134168c) {
                if (((java.util.HashSet) this.f134168c).isEmpty()) {
                    return;
                }
                if (this.f134166a) {
                    c();
                } else {
                    try {
                        xh.d dVar = this.f134169d;
                        if (dVar != null) {
                            dVar.mo77743xeb57c8f5("matrix-hookcommon");
                        } else {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.add("matrix-hookcommon");
                            java.lang.Object obj = new java.lang.Object();
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(obj, arrayList.toArray(), "com/tencent/matrix/hook/HookManager", "commitHooks", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                            java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
                            yj0.a.f(obj, "com/tencent/matrix/hook/HookManager", "commitHooks", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                        }
                        if (!m40871x3e2ac542(false)) {
                            throw new xh.c("Fail to do hook common pre-hook initialize.");
                        }
                        c();
                        m40870xa74a8d92(false);
                        this.f134166a = true;
                    } catch (java.lang.Throwable th6) {
                        oj.j.d("Matrix.HookManager", th6, "", new java.lang.Object[0]);
                    }
                }
            }
        }
    }

    public final void c() {
        oj.j.c("Matrix.HookManager", "commitHooksLocked, hooks=" + this.f134168c, new java.lang.Object[0]);
        synchronized (this.f134168c) {
            java.util.Iterator it = ((java.util.HashSet) this.f134168c).iterator();
            while (it.hasNext()) {
                xh.b bVar = (xh.b) it.next();
                java.lang.String a17 = bVar.a();
                if (!android.text.TextUtils.isEmpty(a17)) {
                    try {
                        xh.d dVar = this.f134169d;
                        if (dVar != null) {
                            dVar.mo77743xeb57c8f5(a17);
                        } else {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.add(a17);
                            java.lang.Object obj = new java.lang.Object();
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(obj, arrayList.toArray(), "com/tencent/matrix/hook/HookManager", "commitHooksLocked", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                            java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
                            yj0.a.f(obj, "com/tencent/matrix/hook/HookManager", "commitHooksLocked", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                        }
                    } catch (java.lang.Throwable th6) {
                        oj.j.d("Matrix.HookManager", th6, "", new java.lang.Object[0]);
                        oj.j.b("Matrix.HookManager", "Fail to load native library for %s, skip next steps.", bVar.getClass().getName());
                        bVar.f535999a = xh.a.COMMIT_FAIL_ON_LOAD_LIB;
                    }
                }
            }
            java.util.Iterator it6 = ((java.util.HashSet) this.f134168c).iterator();
            while (it6.hasNext()) {
                xh.b bVar2 = (xh.b) it6.next();
                if (bVar2.f535999a != xh.a.UNCOMMIT) {
                    oj.j.b("Matrix.HookManager", "%s has failed steps before, skip calling onConfigure on it.", bVar2.getClass().getName());
                } else if (!bVar2.b()) {
                    oj.j.b("Matrix.HookManager", "Fail to configure %s, skip next steps", bVar2.getClass().getName());
                    bVar2.f535999a = xh.a.COMMIT_FAIL_ON_CONFIGURE;
                }
            }
            java.util.Iterator it7 = ((java.util.HashSet) this.f134168c).iterator();
            while (it7.hasNext()) {
                xh.b bVar3 = (xh.b) it7.next();
                if (bVar3.f535999a != xh.a.UNCOMMIT) {
                    oj.j.b("Matrix.HookManager", "%s has failed steps before, skip calling onHook on it.", bVar3.getClass().getName());
                } else if (bVar3.c(false)) {
                    oj.j.c("Matrix.HookManager", "%s is committed successfully.", bVar3.getClass().getName());
                    bVar3.f535999a = xh.a.COMMIT_SUCCESS;
                } else {
                    oj.j.b("Matrix.HookManager", "Fail to do hook in %s.", bVar3.getClass().getName());
                    bVar3.f535999a = xh.a.COMMIT_FAIL_ON_HOOK;
                }
            }
            ((java.util.HashSet) this.f134168c).clear();
        }
    }
}
