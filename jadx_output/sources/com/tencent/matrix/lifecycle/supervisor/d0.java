package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public final class d0 implements com.tencent.matrix.lifecycle.supervisor.d {

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f52825b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile android.app.Application f52826c;

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.matrix.lifecycle.supervisor.j0 f52827d;

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f52828e;

    /* renamed from: f, reason: collision with root package name */
    public static volatile com.tencent.matrix.lifecycle.supervisor.j f52829f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.matrix.lifecycle.IForegroundStatefulOwner f52830g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.matrix.lifecycle.IBackgroundStatefulOwner f52831h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.matrix.lifecycle.IBackgroundStatefulOwner f52832i;

    /* renamed from: j, reason: collision with root package name */
    public static final com.tencent.matrix.lifecycle.IBackgroundStatefulOwner f52833j;

    /* renamed from: k, reason: collision with root package name */
    public static final com.tencent.matrix.lifecycle.supervisor.d0 f52834k;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.lifecycle.supervisor.d f52835a;

    static {
        com.tencent.matrix.lifecycle.supervisor.d0 d0Var = new com.tencent.matrix.lifecycle.supervisor.d0();
        f52834k = d0Var;
        f52825b = jz5.h.b(com.tencent.matrix.lifecycle.supervisor.c0.f52824d);
        f52828e = jz5.h.b(com.tencent.matrix.lifecycle.supervisor.b0.f52823d);
        int i17 = com.tencent.matrix.lifecycle.u0.f52901a;
        com.tencent.matrix.lifecycle.t0 t0Var = com.tencent.matrix.lifecycle.t0.f52900d;
        java.lang.String str = com.tencent.matrix.lifecycle.owners.f0.f52719a;
        f52830g = new com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor$appUIForegroundOwner$1(d0Var, t0Var, com.tencent.matrix.lifecycle.owners.f0.f52733o, "StartedStateOwner");
        com.tencent.matrix.lifecycle.s0 s0Var = com.tencent.matrix.lifecycle.s0.f52790d;
        f52831h = new com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor$appExplicitBackgroundOwner$1(d0Var, s0Var, com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.INSTANCE, "ExplicitBackgroundOwner");
        f52832i = new com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor$appDeepBackgroundOwner$1(d0Var, s0Var, com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner.INSTANCE, "DeepBackgroundOwner");
        f52833j = new com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor$AppStagedBackgroundOwner(null, 1, null);
    }

    public d0() {
        jz5.g gVar = com.tencent.matrix.lifecycle.supervisor.v.f52878a;
        this.f52835a = com.tencent.matrix.lifecycle.supervisor.v.f52882e;
    }

    public java.lang.String a() {
        ((com.tencent.matrix.lifecycle.supervisor.u) this.f52835a).getClass();
        java.lang.String str = "";
        boolean z17 = com.tencent.matrix.lifecycle.supervisor.SupervisorService.f52805i;
        java.lang.String str2 = com.tencent.matrix.lifecycle.supervisor.SupervisorService.f52807n;
        if (!android.text.TextUtils.isEmpty(str2)) {
            return str2;
        }
        java.lang.String b17 = f52834k.b();
        try {
            com.tencent.matrix.lifecycle.supervisor.j jVar = f52829f;
            if (jVar != null) {
                java.lang.String F3 = jVar.F3();
                if (F3 != null) {
                    str = F3;
                }
            }
        } catch (java.lang.Throwable th6) {
            oj.j.d(b17, th6, "", new java.lang.Object[0]);
        }
        return str;
    }

    public final java.lang.String b() {
        return (java.lang.String) ((jz5.n) f52825b).getValue();
    }

    public final boolean c(android.app.Application app, com.tencent.matrix.lifecycle.supervisor.j0 j0Var) {
        kotlin.jvm.internal.o.g(app, "app");
        f52827d = j0Var;
        if (j0Var != null) {
            if (true == j0Var.f52844a) {
                f52826c = app;
                if (d()) {
                    com.tencent.matrix.lifecycle.supervisor.SupervisorService.f52810q.a(app);
                    oj.j.c(b(), "initSupervisor", new java.lang.Object[0]);
                }
                boolean z17 = j0Var.f52845b;
                android.content.Intent intent = new android.content.Intent(app, (java.lang.Class<?>) com.tencent.matrix.lifecycle.supervisor.SupervisorService.class);
                oj.j.c(b(), "bind to Supervisor", new java.lang.Object[0]);
                com.tencent.matrix.lifecycle.supervisor.SupervisorPacemaker.f52804d.a(app);
                app.bindService(intent, new com.tencent.matrix.lifecycle.supervisor.a0(app, intent), z17 ? 1 : 32);
                oj.j.c(b(), "inCharge", new java.lang.Object[0]);
                return d();
            }
        }
        oj.j.c("Matrix.ProcessSupervisor", "init: Supervisor is disabled", new java.lang.Object[0]);
        return false;
    }

    public final boolean d() {
        return ((java.lang.Boolean) ((jz5.n) f52828e).getValue()).booleanValue();
    }
}
