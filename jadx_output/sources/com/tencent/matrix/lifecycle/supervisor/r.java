package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public final class r extends com.tencent.matrix.lifecycle.supervisor.f {

    /* renamed from: e, reason: collision with root package name */
    public boolean f52867e;

    /* renamed from: f, reason: collision with root package name */
    public final android.app.Application f52868f;

    public r(android.app.Application app) {
        kotlin.jvm.internal.o.g(app, "app");
        this.f52868f = app;
    }

    @Override // com.tencent.matrix.lifecycle.supervisor.g
    public void E2(java.lang.String scene, java.lang.String targetProcess, int i17) {
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(targetProcess, "targetProcess");
        com.tencent.matrix.lifecycle.supervisor.v vVar = com.tencent.matrix.lifecycle.supervisor.v.f52883f;
        java.lang.String a17 = com.tencent.matrix.lifecycle.supervisor.v.a(vVar);
        try {
            com.tencent.matrix.lifecycle.supervisor.d0 d0Var = com.tencent.matrix.lifecycle.supervisor.d0.f52834k;
            oj.j.a(d0Var.b(), "receive kill target: " + i17 + '-' + targetProcess, new java.lang.Object[0]);
            boolean b17 = com.tencent.matrix.lifecycle.supervisor.v.b(vVar, com.tencent.matrix.lifecycle.supervisor.v.f52880c, scene, targetProcess, java.lang.Integer.valueOf(i17));
            if (kotlin.jvm.internal.o.b(targetProcess, oj.m.b(this.f52868f)) && android.os.Process.myPid() == i17) {
                android.app.Application context = this.f52868f;
                java.lang.String statefulName = (6 & 2) != 0 ? "" : null;
                kotlin.jvm.internal.o.g(context, "context");
                kotlin.jvm.internal.o.g(statefulName, "statefulName");
                int myPid = android.os.Process.myPid();
                java.lang.String b18 = oj.m.b(context);
                kotlin.jvm.internal.o.f(b18, "MatrixUtil.getProcessName(context)");
                com.tencent.matrix.lifecycle.supervisor.ProcessToken processToken = new com.tencent.matrix.lifecycle.supervisor.ProcessToken(myPid, b18, statefulName, false);
                if (!b17 || !this.f52867e) {
                    com.tencent.matrix.lifecycle.q0.f52785f.a().postDelayed(new com.tencent.matrix.lifecycle.supervisor.q(this, processToken), java.util.concurrent.TimeUnit.SECONDS.toMillis(10L));
                    return;
                }
                this.f52867e = true;
                d0Var.getClass();
                com.tencent.matrix.lifecycle.supervisor.j jVar = com.tencent.matrix.lifecycle.supervisor.d0.f52829f;
                if (jVar != null) {
                    jVar.g4(processToken);
                }
                oj.j.b(d0Var.b(), "rescued once !!!", new java.lang.Object[0]);
            }
        } catch (java.lang.Throwable th6) {
            oj.j.d(a17, th6, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.matrix.lifecycle.supervisor.g
    public void J8(java.lang.String scene, java.lang.String targetProcess, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(targetProcess, "targetProcess");
        java.lang.String a17 = com.tencent.matrix.lifecycle.supervisor.v.a(com.tencent.matrix.lifecycle.supervisor.v.f52883f);
        try {
            java.util.ArrayList arrayList = com.tencent.matrix.lifecycle.supervisor.v.f52881d;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z17);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                yz5.r rVar = (yz5.r) it.next();
                java.lang.String b17 = com.tencent.matrix.lifecycle.supervisor.d0.f52834k.b();
                try {
                    rVar.C(scene, targetProcess, valueOf, valueOf2);
                } catch (java.lang.Throwable th6) {
                    oj.j.d(b17, th6, "", new java.lang.Object[0]);
                }
            }
        } catch (java.lang.Throwable th7) {
            oj.j.d(a17, th7, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.matrix.lifecycle.supervisor.g
    public void c5(java.lang.String scene, java.lang.String stateName, boolean z17) {
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(stateName, "stateName");
        com.tencent.matrix.lifecycle.supervisor.v vVar = com.tencent.matrix.lifecycle.supervisor.v.f52883f;
        java.lang.String a17 = com.tencent.matrix.lifecycle.supervisor.v.a(vVar);
        try {
            oj.j.c(com.tencent.matrix.lifecycle.supervisor.v.a(vVar), "subordinate received state " + stateName + ", " + z17, new java.lang.Object[0]);
            if (z17) {
                com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner.Companion.getClass();
                com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner dispatcherStateOwner = (com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner) com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner.access$getDispatchOwners$cp().get(stateName);
                if (dispatcherStateOwner != null) {
                    com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner.access$dispatchOn(dispatcherStateOwner);
                }
            } else {
                com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner.Companion.getClass();
                com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner dispatcherStateOwner2 = (com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner) com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner.access$getDispatchOwners$cp().get(stateName);
                if (dispatcherStateOwner2 != null) {
                    com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner.access$dispatchOff(dispatcherStateOwner2);
                }
            }
        } catch (java.lang.Throwable th6) {
            oj.j.d(a17, th6, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.matrix.lifecycle.supervisor.g
    public com.tencent.matrix.util.MemInfo y5() {
        java.lang.String a17 = com.tencent.matrix.lifecycle.supervisor.v.a(com.tencent.matrix.lifecycle.supervisor.v.f52883f);
        com.tencent.matrix.util.MemInfo memInfo = new com.tencent.matrix.util.MemInfo(null, null, null, null, null, new com.tencent.matrix.util.PssInfo(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null), new com.tencent.matrix.util.PssInfo(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null), null, com.tencent.mm.plugin.appbrand.jsapi.audio.e0.CTRL_INDEX, null);
        try {
            return com.tencent.matrix.util.MemInfo.f53095p.b();
        } catch (java.lang.Throwable th6) {
            oj.j.d(a17, th6, "", new java.lang.Object[0]);
            return memInfo;
        }
    }
}
