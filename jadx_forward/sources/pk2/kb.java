package pk2;

/* loaded from: classes3.dex */
public final class kb extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f437460h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437460h = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        int y17 = y();
        if (y17 == o9Var.L) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) o9Var.f437611d, 1, true);
            k0Var.f293405n = new pk2.ib(o9Var);
            k0Var.f293414s = new pk2.jb(this, o9Var);
            k0Var.v();
            return;
        }
        if (y17 == o9Var.f437631n) {
            E(o9Var);
        } else if (y17 == o9Var.f437656z0) {
            D(o9Var);
        }
    }

    public final void D(pk2.o9 o9Var) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = ((mm2.c1) o9Var.c(mm2.c1.class)).V5;
        if (c19786x6a1e2862 != null) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = o9Var.f437611d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            xc2.y2 y2Var = xc2.y2.f534876a;
            xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
            p0Var.f534785n = 0;
            xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
        }
        zl2.r4.f555483a.T2(7);
    }

    public final void E(pk2.o9 o9Var) {
        pk2.g8 g8Var;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_LOTTERY_HISTORY_SCENE", 2);
        intent.putExtra("KEY_LOTTERY_HISTORY_LIVE_ID", ((mm2.e1) o9Var.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0));
        intent.putExtra("KEY_LOTTERY_HISTORY_OBJECT_ID", ((mm2.e1) o9Var.c(mm2.e1.class)).f410516m);
        intent.putExtra("KEY_LOTTERY_HISTORY_OBJECT_NONCE_ID", ((mm2.e1) o9Var.c(mm2.e1.class)).f410525v);
        intent.putExtra("KEY_LIVE_ANCHOR_USERNAME", ((mm2.c1) o9Var.c(mm2.c1.class)).f410385o);
        i95.m c17 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        pk2.o9 o9Var2 = this.f445960a;
        c61.yb.H7((c61.yb) c17, o9Var2.f437611d, intent, 0L, null, 0, 0, false, 124, null);
        intent.putExtra("KEY_CUSTOM_TITLE", o9Var.f437611d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dyh));
        i95.m c18 = i95.n0.c(c61.ub.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) c18)).Oj(o9Var2.f437611d, intent, false);
        intent.putExtra("KEY_LIVE_COOKIES", ((mm2.e1) o9Var.c(mm2.e1.class)).f410518o);
        intent.putExtra("KEY_LOTTERY_HISTORY_SOURCE", 2);
        ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
        java.lang.String str = a52.a.f83117l;
        if (str == null) {
            str = "";
        }
        intent.putExtra("KEY_FROM_COMMENT_SCENE", str);
        i95.m c19 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
        ml2.r0.ek((ml2.r0) c19, ml2.p4.f409334o, "", null, 0, null, 28, null);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        pk2.d9 d9Var = o9Var.f437615f;
        ((cy1.a) rVar).Cj("finder_live_win_record_clk", (d9Var == null || (g8Var = d9Var.f437191a) == null) ? null : ((pk2.k9) g8Var).f437457a.f312546n, null, 25561);
    }

    public final boolean F() {
        boolean z17;
        mm2.c1 c1Var = (mm2.c1) this.f445960a.c(mm2.c1.class);
        if (!c1Var.U5) {
            return false;
        }
        if (!(in0.q.f374302b2 != null)) {
            if (!(sn0.b.f491497e2 != null)) {
                z17 = false;
                return (z17 || c1Var.V5 == null) ? false : true;
            }
        }
        z17 = true;
        if (z17) {
            return false;
        }
    }

    public final boolean G() {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((on2.z2) this.f445960a.c(on2.z2.class)).f428628p.mo3195x754a37bb(), java.lang.Boolean.TRUE);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437460h;
    }

    @Override // qk2.f
    public boolean o() {
        return G() || F();
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        int y17 = y();
        int i17 = o9Var.L;
        if (y17 == i17) {
            menu.b(i17, com.p314xaae8f345.mm.R.C30867xcad56011.f573231dy3, com.p314xaae8f345.mm.R.raw.f80363xc4fd8489);
            return;
        }
        int i18 = o9Var.f437631n;
        if (y17 == i18) {
            menu.b(i18, com.p314xaae8f345.mm.R.C30867xcad56011.dyh, com.p314xaae8f345.mm.R.raw.f80363xc4fd8489);
            return;
        }
        int i19 = o9Var.f437656z0;
        if (y17 == i19) {
            menu.b(i19, com.p314xaae8f345.mm.R.C30867xcad56011.dxd, com.p314xaae8f345.mm.R.raw.f80363xc4fd8489);
        }
    }

    @Override // qk2.h
    public int y() {
        boolean G = G();
        pk2.o9 o9Var = this.f445960a;
        if (G && F()) {
            return o9Var.L;
        }
        if (G()) {
            return o9Var.f437631n;
        }
        if (F()) {
            return o9Var.f437656z0;
        }
        return -1;
    }
}
