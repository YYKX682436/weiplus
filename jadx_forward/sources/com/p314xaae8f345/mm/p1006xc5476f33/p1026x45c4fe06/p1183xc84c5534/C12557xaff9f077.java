package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0002H\u0007¨\u0006\t"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/report/AppBrandLauncherDesktopReporter;", "Landroidx/lifecycle/x;", "Ljz5/f0;", "onDestroy", "onCreate", "onStop", "onResume", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.report.AppBrandLauncherDesktopReporter */
/* loaded from: classes5.dex */
public final class C12557xaff9f077 implements p012xc85e97e9.p093xedfae76a.x {

    /* renamed from: d, reason: collision with root package name */
    public long f169306d;

    /* renamed from: e, reason: collision with root package name */
    public long f169307e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f169308f = new java.util.LinkedHashSet();

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_CREATE)
    /* renamed from: onCreate */
    public final void m52353x3e5a77bb() {
        this.f169306d = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19468, 1, "", "", "", "", "", java.lang.Long.valueOf(this.f169306d));
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
    /* renamed from: onDestroy */
    public final void m52354xac79a11b() {
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
    /* renamed from: onResume */
    public final void m52355x57429eec() {
        this.f169307e = java.lang.System.currentTimeMillis();
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_STOP)
    /* renamed from: onStop */
    public final void m52356xc39f8281() {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f169307e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(19468, 8, "", java.lang.Long.valueOf(currentTimeMillis), "", "", java.lang.Long.valueOf(this.f169306d));
        java.util.Set set = this.f169308f;
        g0Var.d(19468, 7, "", "", "", "", java.lang.Integer.valueOf(set.size()), java.lang.Long.valueOf(this.f169306d));
        set.clear();
    }
}
