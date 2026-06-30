package com.tencent.matrix.lifecycle.supervisor;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/matrix/lifecycle/supervisor/SupervisorPacemaker;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class SupervisorPacemaker extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f52801a;

    /* renamed from: c, reason: collision with root package name */
    public static volatile com.tencent.matrix.lifecycle.k f52803c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.matrix.lifecycle.supervisor.SupervisorPacemaker f52804d = new com.tencent.matrix.lifecycle.supervisor.SupervisorPacemaker();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f52802b = jz5.h.b(com.tencent.matrix.lifecycle.supervisor.l0.f52855d);

    private SupervisorPacemaker() {
    }

    public final void a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String str = oj.m.f345709b;
        if (str == null) {
            str = context.getPackageName();
            oj.m.f345709b = str;
        }
        f52801a = str;
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        com.tencent.matrix.lifecycle.supervisor.d0 d0Var = com.tencent.matrix.lifecycle.supervisor.d0.f52834k;
        if (d0Var.d()) {
            intentFilter.addAction("TELL_SUPERVISOR_FOREGROUND");
            if (android.os.Build.VERSION.SDK_INT < 33 || context.getApplicationInfo().targetSdkVersion < 34) {
                context.registerReceiver(this, intentFilter, (java.lang.String) ((jz5.n) f52802b).getValue(), null);
            } else {
                context.registerReceiver(this, intentFilter, (java.lang.String) ((jz5.n) f52802b).getValue(), null, 4);
            }
            oj.j.c(d0Var.b(), "pacemaker: receiver installed", new java.lang.Object[0]);
            return;
        }
        if (f52803c == null) {
            f52803c = new com.tencent.matrix.lifecycle.supervisor.k0(context);
            com.tencent.matrix.lifecycle.IForegroundStatefulOwner iForegroundStatefulOwner = com.tencent.matrix.lifecycle.owners.f0.f52733o;
            com.tencent.matrix.lifecycle.k kVar = f52803c;
            kotlin.jvm.internal.o.d(kVar);
            iForegroundStatefulOwner.observeForever(kVar);
            oj.j.c(d0Var.b(), "pacemaker: install pacemaker", new java.lang.Object[0]);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String action = intent != null ? intent.getAction() : null;
        if (action != null && action.hashCode() == -1689097108 && action.equals("TELL_SUPERVISOR_FOREGROUND")) {
            com.tencent.matrix.lifecycle.supervisor.d0 d0Var = com.tencent.matrix.lifecycle.supervisor.d0.f52834k;
            d0Var.getClass();
            com.tencent.matrix.lifecycle.supervisor.j0 j0Var = com.tencent.matrix.lifecycle.supervisor.d0.f52827d;
            if (j0Var == null || true != j0Var.f52844a) {
                oj.j.b(d0Var.b(), "TELL_SUPERVISOR_FOREGROUND: supervisor was disabled", new java.lang.Object[0]);
                return;
            }
            if (!d0Var.d()) {
                oj.j.b(d0Var.b(), "ERROR: this is NOT supervisor process", new java.lang.Object[0]);
                return;
            }
            java.lang.String stringExtra = intent.getStringExtra("KEY_PROCESS_NAME");
            int intExtra = intent.getIntExtra("KEY_PROCESS_PID", -1);
            oj.j.c(d0Var.b(), "pacemaker: receive TELL_SUPERVISOR_FOREGROUND from " + intExtra + '-' + stringExtra, new java.lang.Object[0]);
            com.tencent.matrix.lifecycle.supervisor.m0 m0Var = com.tencent.matrix.lifecycle.supervisor.SupervisorService.f52810q;
            android.content.Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.o.f(applicationContext, "context.applicationContext");
            m0Var.a(applicationContext);
        }
    }
}
