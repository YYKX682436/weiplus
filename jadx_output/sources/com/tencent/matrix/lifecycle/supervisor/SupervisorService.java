package com.tencent.matrix.lifecycle.supervisor;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/tencent/matrix/lifecycle/supervisor/SupervisorService;", "Landroid/app/Service;", "<init>", "()V", "com/tencent/matrix/lifecycle/supervisor/m0", "RemoteProcessLifecycleProxy", "com/tencent/matrix/lifecycle/supervisor/r0", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class SupervisorService extends android.app.Service {

    /* renamed from: i, reason: collision with root package name */
    public static volatile boolean f52805i = false;

    /* renamed from: m, reason: collision with root package name */
    public static volatile boolean f52806m = false;

    /* renamed from: n, reason: collision with root package name */
    public static volatile java.lang.String f52807n = "";

    /* renamed from: o, reason: collision with root package name */
    public static int f52808o;

    /* renamed from: p, reason: collision with root package name */
    public static volatile com.tencent.matrix.lifecycle.supervisor.SupervisorService f52809p;

    /* renamed from: q, reason: collision with root package name */
    public static final com.tencent.matrix.lifecycle.supervisor.m0 f52810q = new com.tencent.matrix.lifecycle.supervisor.m0(null);

    /* renamed from: g, reason: collision with root package name */
    public yz5.q f52814g;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f52811d = com.tencent.matrix.lifecycle.q0.f52785f.a();

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.matrix.lifecycle.supervisor.r0 f52812e = new com.tencent.matrix.lifecycle.supervisor.r0();

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f52813f = jz5.h.a(jz5.i.f302829d, com.tencent.matrix.lifecycle.supervisor.s0.f52872d);

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.matrix.lifecycle.supervisor.z0 f52815h = new com.tencent.matrix.lifecycle.supervisor.z0(this);

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/tencent/matrix/lifecycle/supervisor/SupervisorService$RemoteProcessLifecycleProxy;", "Lcom/tencent/matrix/lifecycle/StatefulOwner;", "", "state", "Ljz5/f0;", "onStateChanged", "", "toString", "Lcom/tencent/matrix/lifecycle/supervisor/ProcessToken;", "token", "Lcom/tencent/matrix/lifecycle/supervisor/ProcessToken;", "getToken", "()Lcom/tencent/matrix/lifecycle/supervisor/ProcessToken;", "<init>", "(Lcom/tencent/matrix/lifecycle/supervisor/ProcessToken;)V", "Companion", "com/tencent/matrix/lifecycle/supervisor/o0", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public static final class RemoteProcessLifecycleProxy extends com.tencent.matrix.lifecycle.StatefulOwner {
        public static final com.tencent.matrix.lifecycle.supervisor.o0 Companion = new com.tencent.matrix.lifecycle.supervisor.o0(null);
        private static final jz5.g processProxies$delegate = jz5.h.b(com.tencent.matrix.lifecycle.supervisor.n0.f52860d);
        private final com.tencent.matrix.lifecycle.supervisor.ProcessToken token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteProcessLifecycleProxy(com.tencent.matrix.lifecycle.supervisor.ProcessToken token) {
            super(false, 1, null);
            kotlin.jvm.internal.o.g(token, "token");
            this.token = token;
            com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner.Companion.getClass();
            java.lang.String name = token.f52794g;
            kotlin.jvm.internal.o.g(name, "name");
            com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner dispatcherStateOwner = (com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner) com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner.access$getDispatchOwners$cp().get(name);
            if (dispatcherStateOwner != null) {
                dispatcherStateOwner.addSourceOwner(this);
            }
        }

        public final com.tencent.matrix.lifecycle.supervisor.ProcessToken getToken() {
            return this.token;
        }

        public final void onStateChanged(boolean z17) {
            if (z17) {
                turnOn();
            } else {
                turnOff();
            }
        }

        public java.lang.String toString() {
            return "OwnerProxy_" + this.token.f52794g + '_' + active() + '@' + hashCode() + '_' + this.token.f52793f + '_' + this.token.f52792e;
        }
    }

    public static final java.lang.String a(com.tencent.matrix.lifecycle.supervisor.SupervisorService supervisorService, java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue) {
        supervisorService.getClass();
        java.util.Iterator it = concurrentLinkedQueue.iterator();
        kotlin.jvm.internal.o.f(it, "iterator()");
        if (!it.hasNext()) {
            return "[]";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        while (true) {
            com.tencent.matrix.lifecycle.supervisor.ProcessToken processToken = (com.tencent.matrix.lifecycle.supervisor.ProcessToken) it.next();
            sb6.append(processToken.f52792e + '-' + processToken.f52793f);
            if (!it.hasNext()) {
                sb6.append(']');
                java.lang.String sb7 = sb6.toString();
                kotlin.jvm.internal.o.f(sb7, "sb.append(']').toString()");
                return sb7;
            }
            sb6.append(", ");
        }
    }

    public final java.util.concurrent.ConcurrentLinkedQueue b() {
        return (java.util.concurrent.ConcurrentLinkedQueue) this.f52813f.getValue();
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        oj.j.c("Matrix.ProcessSupervisor.Service", "onBind", new java.lang.Object[0]);
        return this.f52815h;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        f52806m = false;
        oj.j.c("Matrix.ProcessSupervisor.Service", "onCreate", new java.lang.Object[0]);
        f52805i = true;
        f52809p = this;
        com.tencent.matrix.lifecycle.supervisor.d0.f52834k.getClass();
        com.tencent.matrix.lifecycle.supervisor.j0 j0Var = com.tencent.matrix.lifecycle.supervisor.d0.f52827d;
        if (j0Var == null || true != j0Var.f52844a) {
            oj.j.b("Matrix.ProcessSupervisor.Service", "onCreate: supervisor was disabled", new java.lang.Object[0]);
            return;
        }
        com.tencent.matrix.lifecycle.supervisor.c cVar = com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner.Companion;
        com.tencent.matrix.lifecycle.supervisor.a1 a1Var = new com.tencent.matrix.lifecycle.supervisor.a1(this);
        cVar.getClass();
        for (java.util.Map.Entry entry : com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner.access$getDispatchOwners$cp().entrySet()) {
            ((com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner) entry.getValue()).observeForever(new com.tencent.matrix.lifecycle.supervisor.b(entry, a1Var));
        }
        com.tencent.matrix.lifecycle.supervisor.SubordinatePacemaker subordinatePacemaker = com.tencent.matrix.lifecycle.supervisor.SubordinatePacemaker.f52800e;
        android.content.Context applicationContext = getApplicationContext();
        kotlin.jvm.internal.o.f(applicationContext, "applicationContext");
        subordinatePacemaker.getClass();
        java.lang.String str = oj.m.f345709b;
        if (str == null) {
            str = applicationContext.getPackageName();
            oj.m.f345709b = str;
        }
        com.tencent.matrix.lifecycle.supervisor.SubordinatePacemaker.f52796a = str;
        android.content.Intent intent = new android.content.Intent("SUPERVISOR_INSTALLED");
        if (android.os.Build.VERSION.SDK_INT >= 33 && applicationContext.getApplicationInfo().targetSdkVersion >= 34) {
            intent.setPackage(applicationContext.getPackageName());
        }
        applicationContext.sendBroadcast(intent, (java.lang.String) ((jz5.n) com.tencent.matrix.lifecycle.supervisor.SubordinatePacemaker.f52797b).getValue());
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        oj.j.b("Matrix.ProcessSupervisor.Service", "SupervisorService destroyed!!!", new java.lang.Object[0]);
        com.tencent.matrix.lifecycle.supervisor.v vVar = com.tencent.matrix.lifecycle.supervisor.v.f52883f;
        com.tencent.matrix.lifecycle.supervisor.p c17 = vVar.c();
        c17.getClass();
        oj.j.b(com.tencent.matrix.lifecycle.supervisor.v.a(vVar), "clear ProcessSubordinate.manager", new java.lang.Object[0]);
        c17.c().clear();
        com.tencent.matrix.lifecycle.supervisor.SupervisorService.RemoteProcessLifecycleProxy.Companion.getClass();
        oj.j.b("Matrix.ProcessSupervisor.Service", "clear RemoteProcessLifecycleProxy", new java.lang.Object[0]);
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) com.tencent.matrix.lifecycle.supervisor.SupervisorService.RemoteProcessLifecycleProxy.processProxies$delegate.getValue()).entrySet().iterator();
        while (it.hasNext()) {
            for (java.util.Map.Entry entry : ((java.util.Map) ((java.util.Map.Entry) it.next()).getValue()).entrySet()) {
                oj.j.b("Matrix.ProcessSupervisor.Service", "remove proxy " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
                com.tencent.matrix.lifecycle.supervisor.c cVar = com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner.Companion;
                com.tencent.matrix.lifecycle.StatefulOwner owner = (com.tencent.matrix.lifecycle.StatefulOwner) entry.getValue();
                cVar.getClass();
                kotlin.jvm.internal.o.g(owner, "owner");
                oj.j.b(com.tencent.matrix.lifecycle.supervisor.d0.f52834k.b(), "DispatcherStateOwner clearSourceOwners", new java.lang.Object[0]);
                java.util.Set entrySet = com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner.access$getDispatchOwners$cp().entrySet();
                kotlin.jvm.internal.o.f(entrySet, "dispatchOwners.entries");
                java.util.Iterator it6 = entrySet.iterator();
                while (it6.hasNext()) {
                    ((com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner) ((java.util.Map.Entry) it6.next()).getValue()).removeSourceOwner(owner);
                }
            }
        }
        ((java.util.concurrent.ConcurrentHashMap) com.tencent.matrix.lifecycle.supervisor.SupervisorService.RemoteProcessLifecycleProxy.processProxies$delegate.getValue()).clear();
        f52809p = null;
        f52806m = true;
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        return 2;
    }
}
