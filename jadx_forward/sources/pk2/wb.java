package pk2;

/* loaded from: classes3.dex */
public final class wb extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437872h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437873i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437872h = helper.f437651x;
        this.f437873i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        pk2.g8 g8Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, "share2Friend isLandscape:" + o9Var.h());
        if (!o9Var.h() || (com.p314xaae8f345.mm.ui.bk.A() && !com.p314xaae8f345.mm.ui.bk.Q())) {
            D(o9Var);
            o9Var.j(qo0.b.f446868c3, null);
            return;
        }
        o9Var.j(qo0.b.f446868c3, null);
        pk2.d9 d9Var = o9Var.f437615f;
        if (d9Var == null || (g8Var = d9Var.f437191a) == null) {
            return;
        }
        ((pk2.k9) g8Var).b(new pk2.tb(this, o9Var));
    }

    public final void D(pk2.o9 o9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        pk2.f8.f437280a.c(5, 2, null);
        dk2.ef efVar = dk2.ef.f314905a;
        tn0.w0 w0Var = dk2.ef.f314911d;
        if (w0Var != null && w0Var.X()) {
            db5.t7.m123882x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.e2h, 1).show();
            return;
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.f409467a2, kz5.c1.l(new jz5.l("liveId", java.lang.String.valueOf(((mm2.e1) o9Var.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0))), new jz5.l("feedId", java.lang.String.valueOf(((mm2.e1) o9Var.c(mm2.e1.class)).f410516m)), new jz5.l("panel_sence", "3")), null, null, null, null, false, 124, null);
        mm2.e1 e1Var = (mm2.e1) o9Var.c(mm2.e1.class);
        long j17 = e1Var.f410516m;
        java.lang.String str = e1Var.f410525v;
        java.lang.String str2 = e1Var.f410517n;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = o9Var.f437611d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pq5.g l17 = new ek2.u0(j17, str, str2, 1, 0, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) pf5.z.f435481a.a(activity).c(zy2.ra.class))).V6(), 1).l();
        l17.K(new pk2.vb(o9Var));
        l17.f(activity);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437873i;
    }

    @Override // qk2.f
    public boolean o() {
        return true;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        menu.g(this.f437872h, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gyz), com.p314xaae8f345.mm.R.raw.f79219x3c70c84b);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.I8((zy2.zb) c17, ml2.u1.S1, kz5.c1.l(new jz5.l("liveId", java.lang.String.valueOf(((mm2.e1) o9Var.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0))), new jz5.l("feedId", java.lang.String.valueOf(((mm2.e1) o9Var.c(mm2.e1.class)).f410516m)), new jz5.l("panel_sence", "3")), null, null, null, null, false, 124, null);
        pk2.f8.f437280a.c(5, 1, null);
    }

    @Override // qk2.h
    public int y() {
        return this.f437872h;
    }
}
