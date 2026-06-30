package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public final class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.lifecycle.supervisor.z0 f52892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.lifecycle.supervisor.ProcessToken[] f52893e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.lifecycle.supervisor.g f52894f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f52895g;

    public y0(com.tencent.matrix.lifecycle.supervisor.z0 z0Var, com.tencent.matrix.lifecycle.supervisor.ProcessToken[] processTokenArr, com.tencent.matrix.lifecycle.supervisor.g gVar, int i17) {
        this.f52892d = z0Var;
        this.f52893e = processTokenArr;
        this.f52894f = gVar;
        this.f52895g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        com.tencent.matrix.lifecycle.supervisor.z0 z0Var = this.f52892d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("supervisor called register, tokens(");
        com.tencent.matrix.lifecycle.supervisor.ProcessToken[] processTokenArr = this.f52893e;
        sb6.append(processTokenArr.length);
        sb6.append("): ");
        java.lang.String arrays = java.util.Arrays.toString(processTokenArr);
        kotlin.jvm.internal.o.f(arrays, "java.util.Arrays.toString(this)");
        sb6.append(arrays);
        oj.j.c("Matrix.ProcessSupervisor.Service", sb6.toString(), new java.lang.Object[0]);
        try {
            com.tencent.matrix.lifecycle.supervisor.ProcessToken token = (com.tencent.matrix.lifecycle.supervisor.ProcessToken) kz5.z.L(processTokenArr);
            com.tencent.matrix.lifecycle.supervisor.SupervisorService supervisorService = z0Var.f52898e;
            com.tencent.matrix.lifecycle.supervisor.SupervisorService supervisorService2 = z0Var.f52898e;
            com.tencent.matrix.lifecycle.supervisor.r0 r0Var = supervisorService.f52812e;
            r0Var.getClass();
            kotlin.jvm.internal.o.g(token, "token");
            java.lang.String str = token.f52793f;
            int i18 = token.f52792e;
            ((java.util.concurrent.ConcurrentHashMap) r0Var.f52869a.getValue()).put(java.lang.Integer.valueOf(i18), token);
            ((java.util.concurrent.ConcurrentHashMap) r0Var.f52870b.getValue()).put(str, token);
            com.tencent.matrix.lifecycle.supervisor.p c17 = com.tencent.matrix.lifecycle.supervisor.v.f52883f.c();
            com.tencent.matrix.lifecycle.supervisor.g subordinate = this.f52894f;
            c17.getClass();
            kotlin.jvm.internal.o.g(subordinate, "subordinate");
            java.util.concurrent.ConcurrentLinkedQueue b17 = supervisorService2.b();
            b17.remove(token);
            b17.add(token);
            oj.j.c("Matrix.ProcessSupervisor.Service", "CREATED: [" + i18 + '-' + str + "] -> [" + supervisorService2.b().size() + ']' + com.tencent.matrix.lifecycle.supervisor.SupervisorService.a(supervisorService2, supervisorService2.b()), new java.lang.Object[0]);
            token.f52791d.linkToDeath(new com.tencent.matrix.lifecycle.supervisor.x0(token, this), 0);
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.ProcessSupervisor.Service", th6, "", new java.lang.Object[0]);
        }
        int length = processTokenArr.length;
        int i19 = 0;
        while (true) {
            i17 = this.f52895g;
            if (i19 >= length) {
                break;
            }
            com.tencent.matrix.lifecycle.supervisor.ProcessToken processToken = processTokenArr[i19];
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("register[");
            sb7.append(i17);
            sb7.append("]: ");
            sb7.append(processToken.f52793f);
            sb7.append(", ");
            sb7.append(processToken.f52794g);
            sb7.append(", ");
            boolean z17 = processToken.f52795h;
            sb7.append(z17);
            oj.j.c("Matrix.ProcessSupervisor.Service", sb7.toString(), new java.lang.Object[0]);
            com.tencent.matrix.lifecycle.supervisor.SupervisorService.RemoteProcessLifecycleProxy.Companion.a(processToken).onStateChanged(z17);
            i19++;
        }
        if (z0Var.f52898e.f52812e.a()) {
            oj.j.c("Matrix.ProcessSupervisor.Service", "stateRegister[" + i17 + "]: no other process registered, ignore state changes", new java.lang.Object[0]);
            return;
        }
        com.tencent.matrix.lifecycle.supervisor.c cVar = com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner.Companion;
        android.content.Context applicationContext = z0Var.f52898e.getApplicationContext();
        kotlin.jvm.internal.o.f(applicationContext, "applicationContext");
        int myPid = android.os.Process.myPid();
        java.lang.String b18 = oj.m.b(applicationContext);
        kotlin.jvm.internal.o.f(b18, "MatrixUtil.getProcessName(context)");
        com.tencent.matrix.lifecycle.supervisor.ProcessToken processToken2 = new com.tencent.matrix.lifecycle.supervisor.ProcessToken(myPid, b18, "", false);
        java.lang.String scene = z0Var.F3();
        cVar.getClass();
        kotlin.jvm.internal.o.g(scene, "scene");
        if (!com.tencent.matrix.lifecycle.supervisor.d0.f52834k.d()) {
            throw new java.lang.IllegalStateException("call forbidden");
        }
        concurrentHashMap = com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner.dispatchOwners;
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            boolean active = ((com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner) entry.getValue()).active();
            oj.j.c(com.tencent.matrix.lifecycle.supervisor.d0.f52834k.b(), "syncStates: " + ((java.lang.String) entry.getKey()) + ' ' + active, new java.lang.Object[0]);
            com.tencent.matrix.lifecycle.supervisor.v.f52883f.c().a(processToken2, scene, (java.lang.String) entry.getKey(), active);
        }
    }
}
