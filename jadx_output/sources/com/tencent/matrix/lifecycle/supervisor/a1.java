package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.lifecycle.supervisor.SupervisorService f52820d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.tencent.matrix.lifecycle.supervisor.SupervisorService supervisorService) {
        super(2);
        this.f52820d = supervisorService;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String stateName = (java.lang.String) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        kotlin.jvm.internal.o.g(stateName, "stateName");
        if (this.f52820d.f52812e.a()) {
            oj.j.c("Matrix.ProcessSupervisor.Service", "observe: no other process registered, ignore state changes", new java.lang.Object[0]);
        } else {
            com.tencent.matrix.lifecycle.supervisor.p c17 = com.tencent.matrix.lifecycle.supervisor.v.f52883f.c();
            android.content.Context applicationContext = this.f52820d.getApplicationContext();
            kotlin.jvm.internal.o.f(applicationContext, "applicationContext");
            int myPid = android.os.Process.myPid();
            java.lang.String b17 = oj.m.b(applicationContext);
            kotlin.jvm.internal.o.f(b17, "MatrixUtil.getProcessName(context)");
            com.tencent.matrix.lifecycle.supervisor.ProcessToken processToken = new com.tencent.matrix.lifecycle.supervisor.ProcessToken(myPid, b17, "", false);
            boolean z17 = com.tencent.matrix.lifecycle.supervisor.SupervisorService.f52805i;
            c17.a(processToken, com.tencent.matrix.lifecycle.supervisor.SupervisorService.f52807n, stateName, booleanValue);
        }
        return jz5.f0.f302826a;
    }
}
