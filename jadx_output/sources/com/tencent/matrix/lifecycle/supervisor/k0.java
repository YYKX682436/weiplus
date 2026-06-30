package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public final class k0 implements com.tencent.matrix.lifecycle.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f52851d;

    public k0(android.content.Context context) {
        this.f52851d = context;
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void off() {
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void on() {
        java.lang.String b17 = com.tencent.matrix.lifecycle.supervisor.d0.f52834k.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pacemaker: call supervisor, auto create = ");
        com.tencent.matrix.lifecycle.supervisor.j0 j0Var = com.tencent.matrix.lifecycle.supervisor.d0.f52827d;
        kotlin.jvm.internal.o.d(j0Var);
        sb6.append(j0Var.f52845b);
        oj.j.c(b17, sb6.toString(), new java.lang.Object[0]);
        com.tencent.matrix.lifecycle.supervisor.j0 j0Var2 = com.tencent.matrix.lifecycle.supervisor.d0.f52827d;
        kotlin.jvm.internal.o.d(j0Var2);
        boolean z17 = j0Var2.f52845b;
        android.content.Context context = this.f52851d;
        if (z17) {
            com.tencent.matrix.lifecycle.supervisor.SupervisorService.f52810q.a(context);
            return;
        }
        com.tencent.matrix.lifecycle.supervisor.SupervisorPacemaker.f52804d.getClass();
        android.content.Intent intent = new android.content.Intent("TELL_SUPERVISOR_FOREGROUND");
        intent.putExtra("KEY_PROCESS_NAME", oj.m.b(context));
        intent.putExtra("KEY_PROCESS_PID", android.os.Process.myPid());
        if (android.os.Build.VERSION.SDK_INT >= 33 && context.getApplicationInfo().targetSdkVersion >= 34) {
            intent.setPackage(context.getPackageName());
        }
        context.sendBroadcast(intent, (java.lang.String) ((jz5.n) com.tencent.matrix.lifecycle.supervisor.SupervisorPacemaker.f52802b).getValue());
    }
}
