package ap1;

/* loaded from: classes5.dex */
public final class w extends ap1.i0 {

    /* renamed from: h, reason: collision with root package name */
    public long f94284h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g f94285i;

    /* renamed from: m, reason: collision with root package name */
    public fo1.h f94286m;

    /* renamed from: n, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f94287n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // ap1.i0
    public void V6() {
        X6();
    }

    @Override // ap1.i0
    public void W6(ap1.a0 item, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        ap1.u uVar = new ap1.u(this, item, i17);
        if (this.f94286m != null) {
            uVar.mo152xb9724478();
        } else {
            pf5.e.m158344xbe96bc24(this, null, null, new ap1.s(this, uVar, null), 3, null);
        }
    }

    public final void X6() {
        pf5.e.m158343xd39de650(this, null, null, new ap1.m(this, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(m158354x19263085(), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.mwe), true, 3, new ap1.n(this)), null), 3, null);
    }

    @Override // ap1.i0, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        long longExtra = m158359x1e885992().getLongExtra("packageId", -1L);
        this.f94284h = longExtra;
        if (longExtra < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(pf5.o.TAG, "Invalid package id = " + this.f94284h);
            j75.f U6 = U6();
            if (U6 != null) {
                U6.B3(new ap1.c(null, 1, null));
                return;
            }
            return;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g k17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.k(longExtra);
        if (k17 != null) {
            this.f94285i = k17;
            this.f94287n = pf5.e.m158343xd39de650(this, null, null, new ap1.r(this, null), 3, null);
            super.mo450x3e5a77bb(bundle);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(pf5.o.TAG, "Fail to get package by id = " + this.f94284h);
        j75.f U62 = U6();
        if (U62 != null) {
            U62.B3(new ap1.c(null, 1, null));
        }
    }
}
