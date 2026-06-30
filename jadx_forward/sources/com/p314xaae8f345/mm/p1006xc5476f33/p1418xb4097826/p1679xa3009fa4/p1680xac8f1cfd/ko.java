package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class ko extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f216508d;

    /* renamed from: e, reason: collision with root package name */
    public final ey2.k0 f216509e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(ey2.k0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        this.f216509e = (ey2.k0) a17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LocationUIC", "[onActivityResult] requestCode=" + i17 + " resultCode=" + i18);
        ey2.k0 k0Var = this.f216509e;
        if (i17 == 563) {
            ya2.o1.t4(k0Var, false, null, 2, null);
        } else {
            if (i17 != 564) {
                return;
            }
            this.f216508d = k0Var.N6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        ey2.k0 k0Var = this.f216509e;
        boolean N6 = k0Var.N6();
        this.f216508d = N6;
        if (N6) {
            ya2.o1.t4(k0Var, false, null, 2, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        if (this.f216508d) {
            return;
        }
        ey2.k0 k0Var = this.f216509e;
        boolean N6 = k0Var.N6();
        this.f216508d = N6;
        if (N6) {
            ya2.o1.t4(k0Var, false, null, 2, null);
        }
    }
}
