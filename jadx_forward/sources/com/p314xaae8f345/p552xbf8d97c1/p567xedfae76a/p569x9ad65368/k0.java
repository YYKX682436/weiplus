package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368;

/* loaded from: classes12.dex */
public final class k0 implements com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f134384d;

    public k0(android.content.Context context) {
        this.f134384d = context;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k
    public void off() {
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k
    public void on() {
        java.lang.String b17 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pacemaker: call supervisor, auto create = ");
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j0 j0Var = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134360d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j0Var);
        sb6.append(j0Var.f134378b);
        oj.j.c(b17, sb6.toString(), new java.lang.Object[0]);
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j0 j0Var2 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134360d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j0Var2);
        boolean z17 = j0Var2.f134378b;
        android.content.Context context = this.f134384d;
        if (z17) {
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d.f134343q.a(context);
            return;
        }
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4691x67659369.f134337d.getClass();
        android.content.Intent intent = new android.content.Intent("TELL_SUPERVISOR_FOREGROUND");
        intent.putExtra("KEY_PROCESS_NAME", oj.m.b(context));
        intent.putExtra("KEY_PROCESS_PID", android.os.Process.myPid());
        if (android.os.Build.VERSION.SDK_INT >= 33 && context.getApplicationInfo().targetSdkVersion >= 34) {
            intent.setPackage(context.getPackageName());
        }
        context.sendBroadcast(intent, (java.lang.String) ((jz5.n) com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4691x67659369.f134335b).mo141623x754a37bb());
    }
}
