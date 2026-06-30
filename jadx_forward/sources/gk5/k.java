package gk5;

/* loaded from: classes9.dex */
public final class k extends m50.x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // m50.x
    public co.a V6() {
        return new fc5.f();
    }

    @Override // m50.x
    public java.lang.String W6() {
        java.lang.String j17 = ((fc5.f) c7()).j();
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
        ((gk5.m1) pf5.z.f435481a.a(activity).a(gk5.m1.class)).U6(d7(), com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.d(action.f536274b));
        return true;
    }

    @Override // m50.x
    public void o7(java.lang.String toUser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d7())) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardFinderLiveUIC", "transfer finder name card to %s", toUser);
        ot0.q v17 = ot0.q.v(d7());
        if (v17 != null) {
            fc5.f fVar = (fc5.f) c7();
            long m75942xfb822ef2 = fVar.m75942xfb822ef2(fVar.f125235d + 0);
            fc5.f fVar2 = (fc5.f) c7();
            java.lang.Object obj = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.K(v17, "", "", toUser, "", null, null, "", "", new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(m75942xfb822ef2, fVar2.m75945x2fec8307(fVar2.f125235d + 1))).second;
            if (obj != null) {
                com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.O6(toUser, (java.lang.Long) obj);
            }
        }
    }
}
