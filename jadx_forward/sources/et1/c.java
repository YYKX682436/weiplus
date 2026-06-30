package et1;

/* loaded from: classes8.dex */
public abstract class c implements vg3.t3 {
    @Override // vg3.t3
    public void C0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, xg3.l0 notifyInfo, boolean[] isConsumed) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notifyInfo, "notifyInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(isConsumed, "isConsumed");
        java.lang.String str = notifyInfo.f535943a;
        if (str == null || !m(str)) {
            return;
        }
        jz5.f0 f0Var = null;
        if (f9Var != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = (f9Var.m124847x74d37ac6() > 0L ? 1 : (f9Var.m124847x74d37ac6() == 0L ? 0 : -1)) != 0 ? f9Var : null;
            if (f9Var2 != null) {
                et1.b h17 = h(f9Var2);
                int i17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(notifyInfo.f535944b, "insert") ? notifyInfo.f535946d : 0;
                java.lang.Object f17 = f(str);
                c(f17, f9Var, notifyInfo);
                java.lang.Object n17 = n(f17, i(str), f9Var2, h17, i17, notifyInfo);
                if (n17 != null) {
                    l(n17);
                    b(n17, i17, f9Var2);
                    f0Var = jz5.f0.f384359a;
                }
            }
        }
        if (f0Var == null) {
            k(str);
        }
        isConsumed[0] = true;
    }

    @Override // vg3.t3
    public void S0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var, boolean z17, xg3.l0 l0Var) {
    }

    @Override // vg3.t3
    public void W(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var, boolean z17, xg3.l0 l0Var) {
    }

    public abstract void b(java.lang.Object obj, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var);

    public abstract void c(java.lang.Object obj, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, xg3.l0 l0Var);

    public abstract java.lang.Object f(java.lang.String str);

    public et1.b h(com.p314xaae8f345.mm.p2621x8fb0427b.f9 latestMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(latestMsg, "latestMsg");
        com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd0812 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        ((com.p314xaae8f345.mm.app.u7) Di.w()).getClass();
        qm.a0.d(latestMsg, c19772x1c2cd081, c19772x1c2cd0812, c19767x257d7f, false);
        return new et1.b(c19772x1c2cd081, c19772x1c2cd0812);
    }

    public abstract java.lang.Object i(java.lang.String str);

    public abstract void k(java.lang.String str);

    public abstract void l(java.lang.Object obj);

    public abstract boolean m(java.lang.String str);

    public abstract java.lang.Object n(java.lang.Object obj, java.lang.Object obj2, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, et1.b bVar, int i17, xg3.l0 l0Var);
}
