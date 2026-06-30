package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public final class a4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o4 f268634d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f268635e;

    public a4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o4 o4Var, java.lang.Runnable runnable) {
        this.f268634d = o4Var;
        this.f268635e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f268634d.k();
        java.lang.Runnable runnable = this.f268635e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
