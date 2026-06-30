package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.lifecycle.supervisor.a0 f52896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.ComponentName f52897e;

    public z(com.tencent.matrix.lifecycle.supervisor.a0 a0Var, android.content.ComponentName componentName) {
        this.f52896d = a0Var;
        this.f52897e = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        com.tencent.matrix.lifecycle.k kVar;
        oj.j.b(com.tencent.matrix.lifecycle.supervisor.d0.f52834k.b(), "onServiceDisconnected " + this.f52897e, new java.lang.Object[0]);
        com.tencent.matrix.lifecycle.supervisor.d0.f52829f = null;
        com.tencent.matrix.lifecycle.owners.f0.f52742x.h(null);
        com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner.Companion.getClass();
        concurrentHashMap = com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner.dispatchOwners;
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner dispatcherStateOwner = (com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner) ((java.util.Map.Entry) it.next()).getValue();
            kVar = dispatcherStateOwner.attachedObserver;
            if (kVar != null) {
                dispatcherStateOwner.getAttachedSource().removeObserver(kVar);
            }
            dispatcherStateOwner.attachedObserver = null;
        }
        com.tencent.matrix.lifecycle.supervisor.d0 d0Var = com.tencent.matrix.lifecycle.supervisor.d0.f52834k;
        oj.j.c(d0Var.b(), "DispatcherStateOwners detached", new java.lang.Object[0]);
        com.tencent.matrix.lifecycle.supervisor.SupervisorPacemaker.f52804d.a(this.f52896d.f52818d);
        com.tencent.matrix.lifecycle.supervisor.a0 a0Var = this.f52896d;
        java.lang.String b17 = d0Var.b();
        try {
            this.f52896d.f52818d.unbindService(a0Var);
        } catch (java.lang.Throwable th6) {
            oj.j.d(b17, th6, "", new java.lang.Object[0]);
        }
        com.tencent.matrix.lifecycle.supervisor.a0 a0Var2 = this.f52896d;
        try {
            a0Var2.f52818d.bindService(a0Var2.f52819e, a0Var2, 32);
            oj.j.b(com.tencent.matrix.lifecycle.supervisor.d0.f52834k.b(), "rebound supervisor", new java.lang.Object[0]);
        } catch (java.lang.Throwable th7) {
            com.tencent.matrix.lifecycle.supervisor.d0 d0Var2 = com.tencent.matrix.lifecycle.supervisor.d0.f52834k;
            oj.j.d(d0Var2.b(), th7, "rebound supervisor failed", new java.lang.Object[0]);
            com.tencent.matrix.lifecycle.supervisor.SubordinatePacemaker subordinatePacemaker = com.tencent.matrix.lifecycle.supervisor.SubordinatePacemaker.f52800e;
            android.app.Application context = this.f52896d.f52818d;
            com.tencent.matrix.lifecycle.supervisor.y yVar = new com.tencent.matrix.lifecycle.supervisor.y(this);
            subordinatePacemaker.getClass();
            kotlin.jvm.internal.o.g(context, "context");
            if (com.tencent.matrix.lifecycle.supervisor.SubordinatePacemaker.f52798c != null) {
                oj.j.b(d0Var2.b(), "SubordinatePacemaker: already installed", new java.lang.Object[0]);
                return;
            }
            if (d0Var2.d()) {
                return;
            }
            com.tencent.matrix.lifecycle.supervisor.SubordinatePacemaker.f52799d = yVar;
            java.lang.String str = oj.m.f345709b;
            if (str == null) {
                str = context.getPackageName();
                oj.m.f345709b = str;
            }
            com.tencent.matrix.lifecycle.supervisor.SubordinatePacemaker.f52796a = str;
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("SUPERVISOR_INSTALLED");
            if (android.os.Build.VERSION.SDK_INT < 33 || context.getApplicationInfo().targetSdkVersion < 34) {
                context.registerReceiver(subordinatePacemaker, intentFilter, (java.lang.String) ((jz5.n) com.tencent.matrix.lifecycle.supervisor.SubordinatePacemaker.f52797b).getValue(), null);
            } else {
                context.registerReceiver(subordinatePacemaker, intentFilter, (java.lang.String) ((jz5.n) com.tencent.matrix.lifecycle.supervisor.SubordinatePacemaker.f52797b).getValue(), null, 4);
            }
            com.tencent.matrix.lifecycle.supervisor.SubordinatePacemaker.f52798c = new com.tencent.matrix.lifecycle.supervisor.g0(yVar);
            com.tencent.matrix.lifecycle.IForegroundStatefulOwner iForegroundStatefulOwner = com.tencent.matrix.lifecycle.owners.f0.f52733o;
            com.tencent.matrix.lifecycle.k kVar2 = com.tencent.matrix.lifecycle.supervisor.SubordinatePacemaker.f52798c;
            kotlin.jvm.internal.o.d(kVar2);
            iForegroundStatefulOwner.observeForever(kVar2);
        }
    }
}
