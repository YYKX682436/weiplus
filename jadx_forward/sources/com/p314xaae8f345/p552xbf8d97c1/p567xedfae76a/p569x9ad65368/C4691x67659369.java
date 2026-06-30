package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/matrix/lifecycle/supervisor/SupervisorPacemaker;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.tencent.matrix.lifecycle.supervisor.SupervisorPacemaker */
/* loaded from: classes12.dex */
public final class C4691x67659369 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f134334a;

    /* renamed from: c, reason: collision with root package name */
    public static volatile com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k f134336c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4691x67659369 f134337d = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4691x67659369();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f134335b = jz5.h.b(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.l0.f134388d);

    private C4691x67659369() {
    }

    public final void a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String str = oj.m.f427242b;
        if (str == null) {
            str = context.getPackageName();
            oj.m.f427242b = str;
        }
        f134334a = str;
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0 d0Var = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k;
        if (d0Var.d()) {
            intentFilter.addAction("TELL_SUPERVISOR_FOREGROUND");
            if (android.os.Build.VERSION.SDK_INT < 33 || context.getApplicationInfo().targetSdkVersion < 34) {
                context.registerReceiver(this, intentFilter, (java.lang.String) ((jz5.n) f134335b).mo141623x754a37bb(), null);
            } else {
                context.registerReceiver(this, intentFilter, (java.lang.String) ((jz5.n) f134335b).mo141623x754a37bb(), null, 4);
            }
            oj.j.c(d0Var.b(), "pacemaker: receiver installed", new java.lang.Object[0]);
            return;
        }
        if (f134336c == null) {
            f134336c = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.k0(context);
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4661x636abfbb interfaceC4661x636abfbb = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134266o;
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k kVar = f134336c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(kVar);
            interfaceC4661x636abfbb.mo40966xc74540ab(kVar);
            oj.j.c(d0Var.b(), "pacemaker: install pacemaker", new java.lang.Object[0]);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String action = intent != null ? intent.getAction() : null;
        if (action != null && action.hashCode() == -1689097108 && action.equals("TELL_SUPERVISOR_FOREGROUND")) {
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0 d0Var = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k;
            d0Var.getClass();
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j0 j0Var = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134360d;
            if (j0Var == null || true != j0Var.f134377a) {
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
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.m0 m0Var = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d.f134343q;
            android.content.Context applicationContext = context.getApplicationContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(applicationContext, "context.applicationContext");
            m0Var.a(applicationContext);
        }
    }
}
