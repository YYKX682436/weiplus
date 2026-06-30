package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public final class a implements com.tencent.matrix.lifecycle.k, com.tencent.matrix.lifecycle.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map.Entry f52816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Application f52817e;

    public a(java.util.Map.Entry entry, android.app.Application application) {
        this.f52816d = entry;
        this.f52817e = application;
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void off() {
        com.tencent.matrix.lifecycle.supervisor.d0 d0Var = com.tencent.matrix.lifecycle.supervisor.d0.f52834k;
        oj.j.a(d0Var.b(), "attached " + ((java.lang.String) this.f52816d.getKey()) + " turned OFF", new java.lang.Object[0]);
        java.lang.String str = d0Var.b() + '.' + ((java.lang.String) this.f52816d.getKey());
        try {
            d0Var.getClass();
            com.tencent.matrix.lifecycle.supervisor.j jVar = com.tencent.matrix.lifecycle.supervisor.d0.f52829f;
            if (jVar != null) {
                android.app.Application context = this.f52817e;
                java.lang.String statefulName = (java.lang.String) this.f52816d.getKey();
                kotlin.jvm.internal.o.g(context, "context");
                kotlin.jvm.internal.o.g(statefulName, "statefulName");
                int myPid = android.os.Process.myPid();
                java.lang.String b17 = oj.m.b(context);
                kotlin.jvm.internal.o.f(b17, "MatrixUtil.getProcessName(context)");
                jVar.fg(new com.tencent.matrix.lifecycle.supervisor.ProcessToken(myPid, b17, statefulName, false));
            }
        } catch (java.lang.Throwable th6) {
            oj.j.d(str, th6, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void on() {
        com.tencent.matrix.lifecycle.supervisor.d0 d0Var = com.tencent.matrix.lifecycle.supervisor.d0.f52834k;
        oj.j.a(d0Var.b(), "attached " + ((java.lang.String) this.f52816d.getKey()) + " turned ON", new java.lang.Object[0]);
        java.lang.String str = d0Var.b() + '.' + ((java.lang.String) this.f52816d.getKey());
        try {
            d0Var.getClass();
            com.tencent.matrix.lifecycle.supervisor.j jVar = com.tencent.matrix.lifecycle.supervisor.d0.f52829f;
            if (jVar != null) {
                android.app.Application context = this.f52817e;
                java.lang.String statefulName = (java.lang.String) this.f52816d.getKey();
                kotlin.jvm.internal.o.g(context, "context");
                kotlin.jvm.internal.o.g(statefulName, "statefulName");
                int myPid = android.os.Process.myPid();
                java.lang.String b17 = oj.m.b(context);
                kotlin.jvm.internal.o.f(b17, "MatrixUtil.getProcessName(context)");
                jVar.fg(new com.tencent.matrix.lifecycle.supervisor.ProcessToken(myPid, b17, statefulName, true));
            }
        } catch (java.lang.Throwable th6) {
            oj.j.d(str, th6, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.matrix.lifecycle.j
    public boolean serial() {
        return true;
    }
}
