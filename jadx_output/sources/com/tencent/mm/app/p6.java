package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class p6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f53585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.q6 f53586e;

    public p6(com.tencent.mm.app.q6 q6Var, android.view.View view) {
        this.f53586e = q6Var;
        this.f53585d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((com.tencent.mm.app.n6) this.f53586e.f53741d).b(this.f53585d);
    }
}
