package com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94;

/* loaded from: classes16.dex */
public class k implements r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f181292a;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.C13487xd865a7ba c13487xd865a7ba, android.os.Bundle bundle) {
        this.f181292a = bundle;
    }

    @Override // r.a
    /* renamed from: apply */
    public java.lang.Object mo1850x58b836e(java.lang.Object obj) {
        android.os.IBinder binder;
        java.lang.Integer num = (java.lang.Integer) obj;
        android.os.Bundle bundle = this.f181292a;
        if (bundle != null && (binder = bundle.getBinder("messenger")) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.j jVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.j(this, binder, num);
            java.util.concurrent.ExecutorService executorService = p5.m.f433515f;
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
