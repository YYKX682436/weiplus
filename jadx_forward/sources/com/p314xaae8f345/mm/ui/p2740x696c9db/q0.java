package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes13.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f292177d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f292178e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f292179f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.k0 f292180g;

    public q0(android.content.Context context, android.net.Uri uri, java.lang.String str, com.p314xaae8f345.mm.ui.p2740x696c9db.k0 k0Var) {
        this.f292177d = context;
        this.f292178e = uri;
        this.f292179f = str;
        this.f292180g = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String a17 = com.p314xaae8f345.mm.ui.p2740x696c9db.r0.a(this.f292177d, this.f292178e, this.f292179f);
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.ui.p2740x696c9db.p0(this.f292180g, a17));
    }
}
