package pk2;

/* loaded from: classes3.dex */
public final class v2 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437833h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437834i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437833h = helper.f437639r;
        this.f437834i = "anchorlive.more.pauselive";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        pk2.g8 g8Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.f409537y, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409449f), null, null, null, null, false, 124, null);
        in0.q e17 = dk2.ef.f314905a.e();
        java.lang.String str = o9Var.f437605a;
        if (e17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "pauseLive wasn't anchor!");
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(((mm2.o4) o9Var.c(mm2.o4.class)).f410860v, "<get-audienceLinkMicUserList>(...)");
        if (!(!r2.isEmpty()) && ((mm2.o4) o9Var.c(mm2.o4.class)).f410857s.size() <= 0) {
            dk2.xf f17 = o9Var.f();
            if (f17 != null) {
                ((dk2.r4) f17).d0(1, 0, new pk2.u2(o9Var));
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "pauseLive mick linking!");
        pk2.d9 d9Var = o9Var.f437615f;
        if (d9Var == null || (g8Var = d9Var.f437191a) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = ((pk2.k9) g8Var).f437457a.f372632e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = ubVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) ubVar : null;
        if (k0Var != null) {
            k0Var.m57765x2eb2fa87(o9Var.f437611d, "", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e3q), "");
        }
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437834i;
    }

    @Override // qk2.f
    public boolean o() {
        if (((mm2.c1) this.f445960a.c(mm2.c1.class)).f410311a5) {
            return false;
        }
        return in0.q.f374302b2 != null;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        java.lang.String string = o9Var.f437611d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e3t);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        s(menu, this.f437833h, string, com.p314xaae8f345.mm.R.raw.f79180x280c3697);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.I8((zy2.zb) c17, ml2.u1.D, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409449f), null, null, null, null, false, 124, null);
    }

    @Override // qk2.h
    public int y() {
        return this.f437833h;
    }
}
