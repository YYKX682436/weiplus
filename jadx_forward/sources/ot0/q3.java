package ot0;

/* loaded from: classes9.dex */
public final class q3 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public q3() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5172x3d23981 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5172x3d23981) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = event.f135521g.f87734a;
        if (f9Var == null) {
            return true;
        }
        if (f9Var.Q0() == null || !com.p314xaae8f345.mm.p2621x8fb0427b.z3.j4(f9Var.Q0())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppMsgInsertEventListener", "doReportReceiveAppMsgFromNotifyMessage not from notifymessage and ignore");
            return true;
        }
        ((ku5.t0) ku5.t0.f394148d).b(new ot0.p3(this, f9Var), "ReportAppMsg");
        return true;
    }
}
