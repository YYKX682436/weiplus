package gk5;

/* loaded from: classes9.dex */
public final class m extends m50.x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // m50.x
    public co.a V6() {
        return new fc5.a();
    }

    @Override // m50.x
    public java.lang.String W6() {
        java.lang.String j17 = ((fc5.a) c7()).j();
        return j17 == null ? "" : j17;
    }

    @Override // m50.x
    public int b7() {
        return 49;
    }

    @Override // m50.x
    public boolean k7(xi5.e action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        gk5.m1 m1Var = (gk5.m1) pf5.z.f435481a.a(activity).a(gk5.m1.class);
        com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType d17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.d(action.f536274b);
        m1Var.getClass();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.r(m1Var.m158354x19263085(), m1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.ifb), d17);
        return true;
    }

    @Override // m50.x
    public void o7(java.lang.String toUser) {
        ot0.q v17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d7()) || (v17 = ot0.q.v(d7())) == null) {
            return;
        }
        fc5.a aVar = (fc5.a) c7();
        long m75942xfb822ef2 = aVar.m75942xfb822ef2(aVar.f125235d + 0);
        fc5.a aVar2 = (fc5.a) c7();
        java.lang.Object obj = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.K(v17, "", "", toUser, "", null, null, "", "", new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(m75942xfb822ef2, aVar2.m75945x2fec8307(aVar2.f125235d + 1))).second;
        if (obj != null) {
            com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.O6(toUser, (java.lang.Long) obj);
        }
    }
}
