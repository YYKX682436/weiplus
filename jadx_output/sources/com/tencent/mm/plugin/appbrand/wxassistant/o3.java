package com.tencent.mm.plugin.appbrand.wxassistant;

/* loaded from: classes12.dex */
public final class o3 extends kj.g0 implements jj.d {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f92267e;

    public o3(boolean z17) {
        new com.tencent.mm.plugin.appbrand.wxassistant.n3(this);
        this.f92267e = new java.util.concurrent.atomic.AtomicInteger(-1);
    }

    @Override // jj.d
    public void b(java.lang.String str, long j17, long j18) {
    }

    @Override // jj.d
    public void c(java.lang.String str) {
        rk0.c.d("MicroMsg.WxAssistantMonitor", "onDispatchBegin log:" + str + " fail, postDelayed return false", new java.lang.Object[0]);
    }

    @Override // kj.g0
    public void d() {
        super.d();
    }

    @Override // kj.g0
    public void f() {
        super.f();
    }

    public final void h() {
        int myPid = android.os.Process.myPid();
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f92267e;
        if (atomicInteger.get() != myPid || myPid <= 0) {
            atomicInteger.set(myPid);
            rk0.c.b("MicroMsg.WxAssistantMonitor", "trigger fail, postDelayed return false, anrHandler=null", new java.lang.Object[0]);
            return;
        }
        rk0.c.b("MicroMsg.WxAssistantMonitor", "trigger: consecutive timeout detected, killing process directly! pid: " + myPid, new java.lang.Object[0]);
        int myPid2 = android.os.Process.myPid();
        rk0.c.b("MicroMsg.WxAssistantMonitor", "killProcessDirectly: killing pid=" + myPid2, new java.lang.Object[0]);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(myPid2));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/wxassistant/WxAssistantTracer", "killProcessDirectly", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(obj, "com/tencent/mm/plugin/appbrand/wxassistant/WxAssistantTracer", "killProcessDirectly", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        } catch (java.lang.Throwable th6) {
            rk0.c.b("MicroMsg.WxAssistantMonitor", "killProcess failed: " + th6.getMessage(), new java.lang.Object[0]);
        }
        try {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/wxassistant/WxAssistantTracer", "killProcessDirectly", "()V", "java/lang/System_EXEC_", "exit", "(I)V");
            java.lang.System.exit(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(obj2, "com/tencent/mm/plugin/appbrand/wxassistant/WxAssistantTracer", "killProcessDirectly", "()V", "java/lang/System_EXEC_", "exit", "(I)V");
            throw new java.lang.RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        } catch (java.lang.Throwable th7) {
            rk0.c.b("MicroMsg.WxAssistantMonitor", "exitProcess also failed: " + th7.getMessage(), new java.lang.Object[0]);
            atomicInteger.set(-1);
        }
    }

    @Override // jj.d
    public boolean isValid() {
        return true;
    }
}
