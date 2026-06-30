package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes8.dex */
public final class l3 implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f263410d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Class f263411e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.y0 f263412f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 f263413g;

    public l3(boolean z17, java.lang.Class stubService) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stubService, "stubService");
        this.f263410d = z17;
        this.f263411e = stubService;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.y0 y0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.m3 m3Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.m3.f263419a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUIConnectionPool", "connected:" + componentName);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.t0.d(iBinder);
        this.f263413g = d17;
        if (d17 == null || (y0Var = this.f263412f) == null) {
            return;
        }
        y0Var.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.k3(this));
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.m3 m3Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.m3.f263419a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUIConnectionPool", "disconnected:" + componentName);
        this.f263413g = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.y0 y0Var = this.f263412f;
        java.lang.Class cls = this.f263411e;
        if (y0Var != null && y0Var.b()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.m3.f263419a.a(this.f263410d, cls, y0Var);
        }
        this.f263412f = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.m3.f263419a.b(cls).remove(this);
    }
}
