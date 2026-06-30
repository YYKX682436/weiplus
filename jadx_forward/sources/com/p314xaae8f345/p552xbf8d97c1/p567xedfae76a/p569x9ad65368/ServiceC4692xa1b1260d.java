package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/tencent/matrix/lifecycle/supervisor/SupervisorService;", "Landroid/app/Service;", "<init>", "()V", "com/tencent/matrix/lifecycle/supervisor/m0", "RemoteProcessLifecycleProxy", "com/tencent/matrix/lifecycle/supervisor/r0", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.tencent.matrix.lifecycle.supervisor.SupervisorService */
/* loaded from: classes12.dex */
public final class ServiceC4692xa1b1260d extends android.app.Service {

    /* renamed from: i, reason: collision with root package name */
    public static volatile boolean f134338i = false;

    /* renamed from: m, reason: collision with root package name */
    public static volatile boolean f134339m = false;

    /* renamed from: n, reason: collision with root package name */
    public static volatile java.lang.String f134340n = "";

    /* renamed from: o, reason: collision with root package name */
    public static int f134341o;

    /* renamed from: p, reason: collision with root package name */
    public static volatile com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d f134342p;

    /* renamed from: q, reason: collision with root package name */
    public static final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.m0 f134343q = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.m0(null);

    /* renamed from: g, reason: collision with root package name */
    public yz5.q f134347g;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f134344d = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.q0.f134318f.a();

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.r0 f134345e = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.r0();

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f134346f = jz5.h.a(jz5.i.f384362d, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.s0.f134405d);

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.z0 f134348h = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.z0(this);

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/tencent/matrix/lifecycle/supervisor/SupervisorService$RemoteProcessLifecycleProxy;", "Lcom/tencent/matrix/lifecycle/StatefulOwner;", "", "state", "Ljz5/f0;", "onStateChanged", "", "toString", "Lcom/tencent/matrix/lifecycle/supervisor/ProcessToken;", "token", "Lcom/tencent/matrix/lifecycle/supervisor/ProcessToken;", "getToken", "()Lcom/tencent/matrix/lifecycle/supervisor/ProcessToken;", "<init>", "(Lcom/tencent/matrix/lifecycle/supervisor/ProcessToken;)V", "Companion", "com/tencent/matrix/lifecycle/supervisor/o0", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: com.tencent.matrix.lifecycle.supervisor.SupervisorService$RemoteProcessLifecycleProxy */
    /* loaded from: classes12.dex */
    public static final class RemoteProcessLifecycleProxy extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4666xb9b62ea7 {

        /* renamed from: Companion */
        public static final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.o0 f19987x233c02ec = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.o0(null);

        /* renamed from: processProxies$delegate */
        private static final jz5.g f19988xa3242c = jz5.h.b(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.n0.f134393d);
        private final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteProcessLifecycleProxy(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea token) {
            super(false, 1, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(token, "token");
            this.token = token;
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9.f19976x233c02ec.getClass();
            java.lang.String name = token.f134327g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9 c4684xa6b8b6c9 = (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9) com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9.m41090x31dedea1().get(name);
            if (c4684xa6b8b6c9 != null) {
                c4684xa6b8b6c9.mo40979x1f1aa3f7(this);
            }
        }

        public final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea getToken() {
            return this.token;
        }

        /* renamed from: onStateChanged */
        public final void m41107xaba1ac62(boolean z17) {
            if (z17) {
                m40993xcc985f3c();
            } else {
                m40992xc67387b2();
            }
        }

        /* renamed from: toString */
        public java.lang.String m41108x9616526c() {
            return "OwnerProxy_" + this.token.f134327g + '_' + mo40960xab2f7f06() + '@' + hashCode() + '_' + this.token.f134326f + '_' + this.token.f134325e;
        }
    }

    public static final java.lang.String a(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d serviceC4692xa1b1260d, java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue) {
        serviceC4692xa1b1260d.getClass();
        java.util.Iterator it = concurrentLinkedQueue.iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator()");
        if (!it.hasNext()) {
            return "[]";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        while (true) {
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea c4689x7ffeacea = (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea) it.next();
            sb6.append(c4689x7ffeacea.f134325e + '-' + c4689x7ffeacea.f134326f);
            if (!it.hasNext()) {
                sb6.append(']');
                java.lang.String sb7 = sb6.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "sb.append(']').toString()");
                return sb7;
            }
            sb6.append(", ");
        }
    }

    public final java.util.concurrent.ConcurrentLinkedQueue b() {
        return (java.util.concurrent.ConcurrentLinkedQueue) this.f134346f.mo141623x754a37bb();
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        oj.j.c("Matrix.ProcessSupervisor.Service", "onBind", new java.lang.Object[0]);
        return this.f134348h;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        f134339m = false;
        oj.j.c("Matrix.ProcessSupervisor.Service", "onCreate", new java.lang.Object[0]);
        f134338i = true;
        f134342p = this;
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k.getClass();
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j0 j0Var = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134360d;
        if (j0Var == null || true != j0Var.f134377a) {
            oj.j.b("Matrix.ProcessSupervisor.Service", "onCreate: supervisor was disabled", new java.lang.Object[0]);
            return;
        }
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.c cVar = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9.f19976x233c02ec;
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.a1 a1Var = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.a1(this);
        cVar.getClass();
        for (java.util.Map.Entry entry : com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9.m41090x31dedea1().entrySet()) {
            ((com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9) entry.getValue()).mo40966xc74540ab(new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.b(entry, a1Var));
        }
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4690x9af4e045 c4690x9af4e045 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4690x9af4e045.f134333e;
        android.content.Context applicationContext = getApplicationContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(applicationContext, "applicationContext");
        c4690x9af4e045.getClass();
        java.lang.String str = oj.m.f427242b;
        if (str == null) {
            str = applicationContext.getPackageName();
            oj.m.f427242b = str;
        }
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4690x9af4e045.f134329a = str;
        android.content.Intent intent = new android.content.Intent("SUPERVISOR_INSTALLED");
        if (android.os.Build.VERSION.SDK_INT >= 33 && applicationContext.getApplicationInfo().targetSdkVersion >= 34) {
            intent.setPackage(applicationContext.getPackageName());
        }
        applicationContext.sendBroadcast(intent, (java.lang.String) ((jz5.n) com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4690x9af4e045.f134330b).mo141623x754a37bb());
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        oj.j.b("Matrix.ProcessSupervisor.Service", "SupervisorService destroyed!!!", new java.lang.Object[0]);
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v vVar = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v.f134416f;
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.p c17 = vVar.c();
        c17.getClass();
        oj.j.b(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v.a(vVar), "clear ProcessSubordinate.manager", new java.lang.Object[0]);
        c17.c().clear();
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d.RemoteProcessLifecycleProxy.f19987x233c02ec.getClass();
        oj.j.b("Matrix.ProcessSupervisor.Service", "clear RemoteProcessLifecycleProxy", new java.lang.Object[0]);
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d.RemoteProcessLifecycleProxy.f19988xa3242c.mo141623x754a37bb()).entrySet().iterator();
        while (it.hasNext()) {
            for (java.util.Map.Entry entry : ((java.util.Map) ((java.util.Map.Entry) it.next()).getValue()).entrySet()) {
                oj.j.b("Matrix.ProcessSupervisor.Service", "remove proxy " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
                com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.c cVar = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9.f19976x233c02ec;
                com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4666xb9b62ea7 owner = (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4666xb9b62ea7) entry.getValue();
                cVar.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                oj.j.b(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k.b(), "DispatcherStateOwner clearSourceOwners", new java.lang.Object[0]);
                java.util.Set entrySet = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9.m41090x31dedea1().entrySet();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "dispatchOwners.entries");
                java.util.Iterator it6 = entrySet.iterator();
                while (it6.hasNext()) {
                    ((com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9) ((java.util.Map.Entry) it6.next()).getValue()).mo40980x72c16834(owner);
                }
            }
        }
        ((java.util.concurrent.ConcurrentHashMap) com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d.RemoteProcessLifecycleProxy.f19988xa3242c.mo141623x754a37bb()).clear();
        f134342p = null;
        f134339m = true;
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        return 2;
    }
}
