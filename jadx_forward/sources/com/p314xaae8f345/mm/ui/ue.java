package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class ue implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f292620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.he f292621e;

    public ue(com.p314xaae8f345.mm.ui.he heVar, java.lang.Runnable runnable) {
        this.f292621e = heVar;
        this.f292620d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.he heVar = this.f292621e;
        heVar.getClass();
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.pe(heVar));
        nm.j.f419976g.a(new com.p314xaae8f345.mm.ui.ve(heVar));
        heVar.b();
        java.lang.Runnable runnable = this.f292620d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
