package com.tencent.mm.plugin.expansions;

/* loaded from: classes16.dex */
public class k implements r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f99759a;

    public k(com.tencent.mm.plugin.expansions.ExpansionsGlobal$CP expansionsGlobal$CP, android.os.Bundle bundle) {
        this.f99759a = bundle;
    }

    @Override // r.a
    public java.lang.Object apply(java.lang.Object obj) {
        android.os.IBinder binder;
        java.lang.Integer num = (java.lang.Integer) obj;
        android.os.Bundle bundle = this.f99759a;
        if (bundle != null && (binder = bundle.getBinder("messenger")) != null) {
            com.tencent.mm.plugin.expansions.j jVar = new com.tencent.mm.plugin.expansions.j(this, binder, num);
            java.util.concurrent.ExecutorService executorService = p5.m.f351982f;
            p5.n nVar = new p5.n();
            try {
                executorService.execute(new p5.l(null, nVar, jVar));
            } catch (java.lang.Exception e17) {
                nVar.a(new p5.i(e17));
            }
        }
        return null;
    }
}
