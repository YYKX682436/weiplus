package k50;

/* loaded from: classes.dex */
public final class c0 extends m50.x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // m50.x
    public co.a V6() {
        return new ne5.a();
    }

    @Override // m50.x
    public java.lang.String W6() {
        return ((ne5.a) c7()).j();
    }

    @Override // m50.x
    public boolean k7(xi5.e action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        ot0.q Z6 = Z6();
        java.lang.String str = Z6 != null ? Z6.f430187f : null;
        if (str == null) {
            str = d7();
        }
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.fd) ((rd0.k1) i95.n0.c(rd0.k1.class))).Ai(m158354x19263085(), str, action.f536274b);
        return true;
    }

    @Override // m50.x
    public void o7(java.lang.String toUser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        ot0.q Z6 = Z6();
        java.lang.String str = Z6 != null ? Z6.f430187f : null;
        if (str == null) {
            str = d7();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ForwardTextUIC", "processTextTransfer: msgContent empty");
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(toUser)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ForwardTextUIC", "processTextTransfer: toUser empty");
        } else {
            ((dk5.s5) tg3.t1.a()).fj(toUser, str, c01.e2.C(toUser), 0);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        ot0.q Z6 = Z6();
        if (!(Z6 != null && Z6.f430199i == 53)) {
            ot0.q Z62 = Z6();
            if (!(Z62 != null && Z62.f430199i == 57)) {
                ot0.q Z63 = Z6();
                if (!(Z63 != null && Z63.f430199i == 1)) {
                    return;
                }
            }
        }
        ne5.a aVar = (ne5.a) c7();
        ot0.q Z64 = Z6();
        java.lang.String str = Z64 != null ? Z64.f430187f : null;
        if (str == null) {
            str = d7();
        }
        aVar.n(str);
    }
}
