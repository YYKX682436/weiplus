package k50;

/* loaded from: classes9.dex */
public final class v extends m50.x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // m50.x
    public co.a V6() {
        return new xd5.a();
    }

    @Override // m50.x
    public boolean k7(xi5.e action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        pt0.e0 e0Var = pt0.f0.f439742b1;
        xd5.a aVar = (xd5.a) c7();
        java.lang.String m75945x2fec8307 = aVar.m75945x2fec8307(aVar.f125235d + 1);
        xd5.a aVar2 = (xd5.a) c7();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k(m75945x2fec8307, aVar2.m75942xfb822ef2(aVar2.f125235d + 0));
        if (k17 == null) {
            return false;
        }
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.fd) ((rd0.k1) i95.n0.c(rd0.k1.class))).getClass();
        com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType d17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.d(action.f536274b);
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.fd) ((rd0.k1) i95.n0.c(rd0.k1.class))).wi(m158354x19263085(), k17, d17);
        return true;
    }

    @Override // m50.x
    public void o7(java.lang.String toUser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        pt0.e0 e0Var = pt0.f0.f439742b1;
        xd5.a aVar = (xd5.a) c7();
        java.lang.String m75945x2fec8307 = aVar.m75945x2fec8307(aVar.f125235d + 1);
        xd5.a aVar2 = (xd5.a) c7();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k(m75945x2fec8307, aVar2.m75942xfb822ef2(aVar2.f125235d + 0));
        if (k17 == null) {
            return;
        }
        l15.c cVar = new l15.c();
        java.lang.String U1 = k17.U1();
        if (U1 == null) {
            U1 = "";
        }
        cVar.m126728xdc93280d(U1);
        gu.k kVar = new gu.k(toUser, cVar);
        kVar.f357149s = "forward_record";
        kVar.f357150t = ((ez.e) ((pt.j0) i95.n0.c(pt.j0.class))).qj(k17);
        ((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).getClass();
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j d17 = qi3.x.f445294a.d(new ru.u(kVar));
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a != null) {
            v65.i.b(c20976x6ba6452a, null, new k50.u(d17, null), 1, null);
        }
    }
}
