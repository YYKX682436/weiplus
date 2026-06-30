package k50;

/* loaded from: classes9.dex */
public final class s extends m50.x {

    /* renamed from: t, reason: collision with root package name */
    public static final k50.n f385789t = new k50.n(null);

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 f385790s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // m50.x
    public boolean U6() {
        if (e7() != null) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.b0 S1 = m11.b1.Di().S1(e7());
            if (S1 != null && S1.f404166a > 0) {
                return true;
            }
        } else if (com.p314xaae8f345.mm.vfs.w6.j(((jd5.a) c7()).k())) {
            return true;
        }
        d75.b.g(k50.o.f385775d);
        return false;
    }

    @Override // m50.x
    public co.a V6() {
        return new jd5.a();
    }

    @Override // m50.x
    public int b7() {
        return 3;
    }

    @Override // m50.x
    public boolean k7(xi5.e action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.fd) ((rd0.k1) i95.n0.c(rd0.k1.class))).getClass();
        com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType d17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.d(action.f536274b);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 e76 = e7();
        if (e76 != null) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.b0 S1 = m11.b1.Di().S1(e7());
            java.lang.String str = S1.f404170e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getBigImgPath(...)");
            if (!r26.i0.y(str, "SERVERID://", false)) {
                k70.z zVar = (k70.z) i95.n0.c(k70.z.class);
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 e77 = e7();
                ((j70.e) zVar).getClass();
                java.lang.String c17 = m11.c0.c(e77, S1);
                ((rq3.k) ((cc0.l) i95.n0.c(cc0.l.class))).fj(c17, e76.m124847x74d37ac6(), 1);
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.fd) ((rd0.k1) i95.n0.c(rd0.k1.class))).wi(m158354x19263085(), e76, d17);
                return true;
            }
        } else if (com.p314xaae8f345.mm.vfs.w6.j(((jd5.a) c7()).k())) {
            rd0.k1 k1Var = (rd0.k1) i95.n0.c(rd0.k1.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
            java.lang.String k17 = ((jd5.a) c7()).k();
            if (k17 == null) {
                k17 = "";
            }
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.fd) k1Var).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.n(context, k17, d17);
            return true;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(m158354x19263085());
        u1Var.g(m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nce));
        u1Var.a(true);
        u1Var.l(null);
        u1Var.q(false);
        return false;
    }

    @Override // m50.x
    public void o7(java.lang.String toUser) {
        p15.x xVar;
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f385790s;
        if (f9Var != null) {
            f385789t.a(f9Var, toUser, ((jd5.a) c7()).l(), null);
            return;
        }
        java.lang.String k17 = ((jd5.a) c7()).k();
        java.lang.String str = k17 == null ? "" : k17;
        c01.h7 h7Var = new c01.h7();
        jd5.a aVar = (jd5.a) c7();
        h7Var.f118763e = aVar.m75945x2fec8307(aVar.f125235d + 4);
        k70.i0 i0Var = new k70.i0();
        i0Var.f386175a = 4;
        i0Var.f386188n = 2;
        i0Var.f386189o = h7Var;
        p15.n l17 = ((jd5.a) c7()).l();
        i0Var.f386184j = l17 != null ? l17.k() : null;
        p15.n l18 = ((jd5.a) c7()).l();
        if (l18 == null || (xVar = l18.l()) == null) {
            xVar = null;
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("1:");
            sb6.append(gm0.j1.b().k());
            sb6.append(':');
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(com.p314xaae8f345.mm.vfs.w6.q(str) + java.lang.System.currentTimeMillis() + gm0.j1.b().h()));
            sb6.append(':');
            sb6.append(xVar.k());
            xVar.s(sb6.toString());
        }
        i0Var.f386185k = xVar;
        p15.n l19 = ((jd5.a) c7()).l();
        i0Var.f386186l = l19 != null ? l19.j() : null;
        java.lang.String r17 = c01.z1.r();
        r70.g gVar = new r70.g(str, 1, r17 == null ? "" : r17, toUser, i0Var);
        gVar.f474641j = "forward_single_img";
        gm0.b bVar = gm0.j1.b().f354778h;
        if (bVar == null || (c20976x6ba6452a = bVar.f354678e) == null) {
            return;
        }
        v65.i.b(c20976x6ba6452a, null, new k50.r(gVar, null), 1, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 e76 = e7();
        if (e76 != null) {
            i95.m c17 = i95.n0.c(tg3.u0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            java.lang.String ga6 = tg3.u0.ga((tg3.u0) c17, e76, e76.z0(), false, 4, null);
            ((jd5.a) c7()).p(ga6.concat("hd"));
            if (!com.p314xaae8f345.mm.vfs.w6.j(((jd5.a) c7()).k())) {
                ((jd5.a) c7()).p(ga6);
            }
            jd5.a aVar = (jd5.a) c7();
            aVar.set(aVar.f125235d + 0, java.lang.Long.valueOf(e76.m124847x74d37ac6()));
            jd5.a aVar2 = (jd5.a) c7();
            java.lang.String Q0 = e76.Q0();
            if (Q0 == null) {
                Q0 = "";
            }
            aVar2.set(aVar2.f125235d + 1, Q0);
            j15.a ij6 = ((a80.b) ((xs.w0) i95.n0.c(xs.w0.class))).ij(e76);
            ((jd5.a) c7()).r(ij6.q());
            ((jd5.a) c7()).o(ij6.n());
        }
        this.f385790s = e7();
    }

    @Override // m50.x
    public java.lang.String p7() {
        java.lang.String k17 = ((jd5.a) c7()).k();
        if ((k17 == null || r26.n0.N(k17)) || !com.p314xaae8f345.mm.vfs.w6.j(k17)) {
            return null;
        }
        return k17;
    }
}
