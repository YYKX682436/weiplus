package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public final class a0 implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Application f52818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f52819e;

    public a0(android.app.Application application, android.content.Intent intent) {
        this.f52818d = application;
        this.f52819e = intent;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.tencent.matrix.lifecycle.q0.f52785f.a().post(new com.tencent.matrix.lifecycle.supervisor.x(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        com.tencent.matrix.lifecycle.supervisor.d0 d0Var = com.tencent.matrix.lifecycle.supervisor.d0.f52834k;
        if (d0Var.d()) {
            oj.j.b(d0Var.b(), "self disconnected", new java.lang.Object[0]);
            boolean z17 = com.tencent.matrix.lifecycle.supervisor.SupervisorService.f52805i;
            com.tencent.matrix.lifecycle.supervisor.SupervisorService.f52806m = true;
        }
        com.tencent.matrix.lifecycle.q0.f52785f.a().post(new com.tencent.matrix.lifecycle.supervisor.z(this, componentName));
    }
}
