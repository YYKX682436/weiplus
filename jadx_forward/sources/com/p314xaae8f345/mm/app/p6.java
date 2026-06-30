package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public class p6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f135118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.q6 f135119e;

    public p6(com.p314xaae8f345.mm.app.q6 q6Var, android.view.View view) {
        this.f135119e = q6Var;
        this.f135118d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((com.p314xaae8f345.mm.app.n6) this.f135119e.f135274d).b(this.f135118d);
    }
}
