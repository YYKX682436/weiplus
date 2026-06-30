package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.lifecycle.supervisor.a0 f52888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.IBinder f52889e;

    public x(com.tencent.matrix.lifecycle.supervisor.a0 a0Var, android.os.IBinder iBinder) {
        this.f52888d = a0Var;
        this.f52889e = iBinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        com.tencent.matrix.lifecycle.k kVar;
        com.tencent.matrix.lifecycle.k kVar2;
        com.tencent.matrix.lifecycle.supervisor.SupervisorPacemaker.f52804d.getClass();
        com.tencent.matrix.lifecycle.supervisor.j jVar = null;
        if (com.tencent.matrix.lifecycle.supervisor.SupervisorPacemaker.f52803c != null) {
            com.tencent.matrix.lifecycle.IForegroundStatefulOwner iForegroundStatefulOwner = com.tencent.matrix.lifecycle.owners.f0.f52733o;
            com.tencent.matrix.lifecycle.k kVar3 = com.tencent.matrix.lifecycle.supervisor.SupervisorPacemaker.f52803c;
            kotlin.jvm.internal.o.d(kVar3);
            iForegroundStatefulOwner.removeObserver(kVar3);
            com.tencent.matrix.lifecycle.supervisor.SupervisorPacemaker.f52803c = null;
            oj.j.c(com.tencent.matrix.lifecycle.supervisor.d0.f52834k.b(), "pacemaker: uninstall pacemaker", new java.lang.Object[0]);
        }
        com.tencent.matrix.lifecycle.supervisor.SubordinatePacemaker.f52800e.a(this.f52888d.f52818d);
        com.tencent.matrix.lifecycle.supervisor.d0 d0Var = com.tencent.matrix.lifecycle.supervisor.d0.f52834k;
        android.os.IBinder iBinder = this.f52889e;
        int i17 = com.tencent.matrix.lifecycle.supervisor.i.f52842d;
        if (iBinder != null) {
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
            jVar = (queryLocalInterface == null || !(queryLocalInterface instanceof com.tencent.matrix.lifecycle.supervisor.j)) ? new com.tencent.matrix.lifecycle.supervisor.h(iBinder) : (com.tencent.matrix.lifecycle.supervisor.j) queryLocalInterface;
        }
        d0Var.getClass();
        com.tencent.matrix.lifecycle.supervisor.d0.f52829f = jVar;
        java.lang.String b17 = d0Var.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on Supervisor Connected ");
        d0Var.getClass();
        sb6.append(com.tencent.matrix.lifecycle.supervisor.d0.f52829f);
        oj.j.c(b17, sb6.toString(), new java.lang.Object[0]);
        com.tencent.matrix.lifecycle.owners.f0.f52742x.h(new com.tencent.matrix.lifecycle.supervisor.w());
        d0Var.getClass();
        com.tencent.matrix.lifecycle.supervisor.j jVar2 = com.tencent.matrix.lifecycle.supervisor.d0.f52829f;
        if (jVar2 != null) {
            java.lang.String b18 = d0Var.b();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("supervisor is ");
            d0Var.getClass();
            sb7.append(com.tencent.matrix.lifecycle.supervisor.d0.f52829f);
            java.lang.String sb8 = sb7.toString();
            try {
                com.tencent.matrix.lifecycle.supervisor.ProcessToken[] a17 = com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner.Companion.a(this.f52888d.f52818d);
                jz5.g gVar = com.tencent.matrix.lifecycle.supervisor.v.f52878a;
                android.app.Application app = this.f52888d.f52818d;
                kotlin.jvm.internal.o.g(app, "app");
                jVar2.a7(a17, new com.tencent.matrix.lifecycle.supervisor.r(app));
            } catch (java.lang.Throwable th6) {
                oj.j.d(b18, th6, sb8, new java.lang.Object[0]);
            }
        }
        com.tencent.matrix.lifecycle.supervisor.c cVar = com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner.Companion;
        com.tencent.matrix.lifecycle.supervisor.d0.f52834k.getClass();
        android.app.Application application = com.tencent.matrix.lifecycle.supervisor.d0.f52826c;
        kotlin.jvm.internal.o.d(application);
        cVar.getClass();
        concurrentHashMap = com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner.dispatchOwners;
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner dispatcherStateOwner = (com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner) entry.getValue();
            kVar = dispatcherStateOwner.attachedObserver;
            if (kVar != null) {
                dispatcherStateOwner.getAttachedSource().removeObserver(kVar);
            }
            dispatcherStateOwner.attachedObserver = new com.tencent.matrix.lifecycle.supervisor.a(entry, application);
            com.tencent.matrix.lifecycle.IStatefulOwner attachedSource = dispatcherStateOwner.getAttachedSource();
            kVar2 = dispatcherStateOwner.attachedObserver;
            kotlin.jvm.internal.o.d(kVar2);
            attachedSource.observeForever(kVar2);
        }
        oj.j.c(com.tencent.matrix.lifecycle.supervisor.d0.f52834k.b(), "DispatcherStateOwners attached", new java.lang.Object[0]);
    }
}
