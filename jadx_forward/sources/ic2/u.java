package ic2;

/* loaded from: classes10.dex */
public final class u implements com.p314xaae8f345.mm.p944x882e457a.h1 {

    /* renamed from: d, reason: collision with root package name */
    public static final ic2.u f371903d = new ic2.u();

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f371904e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f371905f;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f371906g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile int f371907h;

    @Override // com.p314xaae8f345.mm.p944x882e457a.n0
    public void b(r45.tp tpVar) {
        if (gm0.j1.a() && f371907h > 0) {
            int i17 = 0;
            for (ce2.l lVar : ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Pj().J0()) {
                if (lVar.f68159xbc5c91be == 0 && lVar.f68164xed074063 == 0) {
                    i17++;
                }
            }
            if (f371907h > i17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1552L, 89L, 1L);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.n0
    public void c(int i17, com.p314xaae8f345.mm.p944x882e457a.m0 m0Var) {
        if (gm0.j1.a()) {
            r45.tp tpVar = m0Var != null ? m0Var.f152220a : null;
            if (tpVar == null) {
                return;
            }
            r45.a41 a41Var = new r45.a41();
            a41Var.set(1, 0);
            a41Var.set(0, db2.t4.f309704a.a(i17));
            f371907h = 0;
            if (m0Var != null) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f371904e, m0Var.f152221b)) {
                    a41Var.set(2, f371906g);
                    a41Var.set(1, 1);
                    f371906g = "";
                    f371904e = "";
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f371905f, m0Var.f152221b)) {
                    a41Var.set(1, 2);
                    f371905f = "";
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveNotifyFuncMsgExtension", "onBuildFetchParams scene[" + a41Var.m75939xb282bd08(1) + ']');
            java.util.ArrayList<ce2.l> J0 = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Pj().J0();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (ce2.l lVar : J0) {
                if (lVar.f68159xbc5c91be == 0 && lVar.f68164xed074063 == 0) {
                    f371907h++;
                }
                r45.ex4 ex4Var = new r45.ex4();
                ex4Var.set(3, java.lang.Long.valueOf(lVar.f68162xf2bdb98b));
                ex4Var.set(2, lVar.f68169x11c19d58);
                ex4Var.set(5, java.lang.Integer.valueOf(lVar.f68159xbc5c91be));
                ex4Var.set(6, java.lang.Integer.valueOf(lVar.f68164xed074063));
                ex4Var.set(0, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(lVar.f68163x41d5e0c)));
                ex4Var.set(4, java.lang.Integer.valueOf(lVar.f68158xe1889bb8));
                ex4Var.set(7, lVar.f68156x897ce102);
                ex4Var.set(1, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(lVar.f68160xf9a02e3e)));
                linkedList.add(ex4Var);
            }
            a41Var.set(4, linkedList);
            java.util.LinkedList m75941xfb821914 = a41Var.m75941xfb821914(4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getList(...)");
            a41Var.set(4, new java.util.LinkedList(kz5.n0.F0(m75941xfb821914, new ic2.t())));
            ae2.in inVar = ae2.in.f85221a;
            int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85257d5).mo141623x754a37bb()).r()).intValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveNotifyFuncMsgExtension", "onBuildFetchParams limit = " + intValue);
            if (a41Var.m75941xfb821914(4).size() > intValue) {
                java.util.LinkedList m75941xfb8219142 = a41Var.m75941xfb821914(4);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getList(...)");
                a41Var.set(4, new java.util.LinkedList(kz5.n0.K0(m75941xfb8219142, intValue)));
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.LinkedList m75941xfb8219143 = a41Var.m75941xfb821914(4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219143, "getList(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb8219143, 10));
            java.util.Iterator it = m75941xfb8219143.iterator();
            while (it.hasNext()) {
                arrayList.add(((r45.ex4) it.next()).m75945x2fec8307(2));
            }
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                sb6.append((java.lang.String) it6.next());
                sb6.append(",");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveNotifyFuncMsgExtension", "onBuildFetchParams list = [" + ((java.lang.Object) sb6) + ']');
            tpVar.f468170e = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(a41Var.mo14344x5f01b1f6());
        }
    }
}
