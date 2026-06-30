package du2;

/* loaded from: classes2.dex */
public final class i {
    public i(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final boolean a() {
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Mg).mo141623x754a37bb()).r()).booleanValue();
    }

    public final boolean b() {
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Lg).mo141623x754a37bb()).r()).booleanValue();
    }

    public final boolean c() {
        if (gm0.j1.a()) {
            return b() || a();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerController", "[isHitExp], account not ready, return false!");
        return false;
    }

    public final boolean d(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerController", "[isHitExp], account not ready, return false!");
            return false;
        }
        so2.j5 j5Var = (so2.j5) holder.f374658i;
        if (j5Var instanceof so2.u1) {
            return b();
        }
        if (j5Var instanceof so2.h1) {
            return a();
        }
        return false;
    }
}
