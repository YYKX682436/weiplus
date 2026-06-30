package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class me implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f290655d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ne f290656e;

    public me(com.p314xaae8f345.mm.ui.ne neVar, int i17) {
        this.f290656e = neVar;
        this.f290655d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.he heVar = this.f290656e.f290949d;
        com.p314xaae8f345.mm.ui.t1 t1Var = heVar.f290399g;
        if (t1Var != null) {
            ((com.p314xaae8f345.mm.ui.C21389xb8f36d3b) t1Var).k(this.f290655d);
            ((com.p314xaae8f345.mm.ui.C21374x812c2fd3) heVar.f290397e).w(false);
        }
    }
}
