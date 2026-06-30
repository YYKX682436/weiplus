package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public final class x0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f292424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f292425e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.s0 f292426f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f292427g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f292428h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f292429i;

    public x0(android.app.Activity activity, java.lang.Runnable runnable, com.p314xaae8f345.mm.ui.p2740x696c9db.s0 s0Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, int i18) {
        this.f292424d = activity;
        this.f292425e = runnable;
        this.f292426f = s0Var;
        this.f292427g = f9Var;
        this.f292428h = i17;
        this.f292429i = i18;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        android.app.Activity activity = this.f292424d;
        if (activity.isDestroyed() || activity.isFinishing() || menuItem.getItemId() != 1) {
            return;
        }
        java.lang.Runnable runnable = this.f292425e;
        if (runnable != null) {
            runnable.run();
        }
        this.f292426f.a();
        ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).mj(this.f292424d, this.f292427g, this.f292428h, this.f292429i, false);
    }
}
