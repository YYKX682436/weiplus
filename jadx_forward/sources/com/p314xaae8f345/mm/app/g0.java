package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.k0 f134955d;

    public g0(com.p314xaae8f345.mm.app.k0 k0Var) {
        this.f134955d = k0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (ih.a.f(e42.d0.clicfg_crash_push_double_upload_v2, true)) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            com.p314xaae8f345.mm.app.k0 k0Var = this.f134955d;
            k0Var.a(context);
            k0Var.f135012d.postDelayed(k0Var.f135013e, 3600000L);
        }
    }
}
