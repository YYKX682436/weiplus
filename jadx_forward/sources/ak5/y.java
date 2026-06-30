package ak5;

/* loaded from: classes5.dex */
public final class y extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public y() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5945xdd67bc5f event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5945xdd67bc5f) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.cs csVar = event.f136246g;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = csVar.f87929c;
        long j17 = csVar.f87931e;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Boolean.valueOf(f9Var != null);
        objArr[1] = java.lang.Long.valueOf(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopMsgRevokeMsgListener", "revokeMsg callback msgInfoNotNull:%s srvId:%s", objArr);
        if (f9Var != null && j17 != 0) {
            ak5.v Bi = ((ak5.g0) i95.n0.c(ak5.g0.class)).Bi(f9Var.Q0());
            if (Bi != null) {
                Bi.a(j17);
            }
            zj5.a.f554881a.a(6, j17);
        }
        return false;
    }
}
