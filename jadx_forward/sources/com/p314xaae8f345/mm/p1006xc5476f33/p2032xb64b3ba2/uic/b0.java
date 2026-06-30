package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes10.dex */
public final class b0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public long f239876d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239877e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f239878f;

    /* renamed from: g, reason: collision with root package name */
    public px3.j f239879g;

    /* renamed from: h, reason: collision with root package name */
    public rx3.h f239880h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f239876d = -1L;
        this.f239877e = true;
        this.f239878f = new java.util.ArrayList();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        rx3.h hVar = new rx3.h();
        this.f239880h = hVar;
        this.f239879g = new px3.j(hVar);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        rx3.h hVar = this.f239880h;
        if (hVar != null) {
            p3325xe03a0797.p3326xc267989b.z0.e(hVar.f482565a, null, 1, null);
        }
        px3.j jVar = this.f239879g;
        if (jVar != null) {
            p3325xe03a0797.p3326xc267989b.r2 r2Var = jVar.f440487i;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            p3325xe03a0797.p3326xc267989b.y0 y0Var = jVar.f440483e;
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new px3.e(jVar, null), 3, null);
            p3325xe03a0797.p3326xc267989b.z0.e(y0Var, null, 1, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        px3.j jVar = this.f239879g;
        if (jVar != null) {
            jVar.f440487i = p3325xe03a0797.p3326xc267989b.l.d(jVar.f440483e, null, null, new px3.f(jVar, null), 3, null);
        }
        this.f239877e = true;
        this.f239876d = -1L;
        this.f239878f.clear();
        p3325xe03a0797.p3326xc267989b.l.d(mo144225x95f74600(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.a0(this, null), 3, null);
    }
}
