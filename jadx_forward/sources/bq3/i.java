package bq3;

/* loaded from: classes4.dex */
public final class i extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public i() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5880xc8b90053 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5880xc8b90053) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ReceivePocketMoneyAppMsgEvent: ");
        am.wp wpVar = event.f136188g;
        sb6.append(wpVar.f89844b);
        sb6.append(", ");
        sb6.append(wpVar.f89843a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReceivePocketMoneyAppMsgEventListener", sb6.toString());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wpVar.f89844b) || wpVar.f89843a < 0) {
            return false;
        }
        i95.m c17 = i95.n0.c(bq3.l.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        dq3.a aVar = new dq3.a();
        aVar.f67247x297eb4f7 = wpVar.f89843a;
        aVar.f67248x6e706659 = wpVar.f89844b;
        ((bq3.l) c17).f105114d.mo880xb970c2b9(aVar);
        return false;
    }
}
