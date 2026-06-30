package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class r2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f79706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km5.b f79707e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.w2 f79708f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.l24 f79709g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f79710h;

    public r2(com.tencent.mm.plugin.appbrand.y yVar, km5.b bVar, com.tencent.mm.plugin.appbrand.jsapi.auth.w2 w2Var, r45.l24 l24Var, int i17) {
        this.f79706d = yVar;
        this.f79707e = bVar;
        this.f79708f = w2Var;
        this.f79709g = l24Var;
        this.f79710h = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.y yVar = this.f79706d;
        boolean isRunning = yVar.isRunning();
        km5.b bVar = this.f79707e;
        if (!isRunning) {
            bVar.a(com.tencent.mm.plugin.appbrand.jsapi.auth.s.f79724d);
            return;
        }
        int i17 = this.f79710h;
        com.tencent.mm.plugin.appbrand.jsapi.auth.w2 w2Var = this.f79708f;
        com.tencent.mm.plugin.appbrand.jsapi.auth.q2 q2Var = new com.tencent.mm.plugin.appbrand.jsapi.auth.q2(i17, w2Var, bVar, yVar);
        fl1.g2 dialogContainer = yVar.getDialogContainer();
        kotlin.jvm.internal.o.d(dialogContainer);
        android.content.Context b17 = w2Var.b(yVar);
        r45.l24 l24Var = this.f79709g;
        dialogContainer.c(new fl1.k(b17, com.tencent.mm.plugin.appbrand.jsapi.auth.n0.I(l24Var.f379088f), l24Var.f379089g, l24Var.f379090h, q2Var));
    }
}
