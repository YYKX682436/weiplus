package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class l6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.m6 f53506d;

    public l6(com.tencent.mm.app.m6 m6Var) {
        this.f53506d = m6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.app.u6 u6Var = this.f53506d.f53522g.f53543g;
        if (u6Var.D) {
            return;
        }
        u6Var.D = true;
        ((ku5.t0) ku5.t0.f312615d).g(this.f53506d.f53522g.f53543g.K);
    }
}
