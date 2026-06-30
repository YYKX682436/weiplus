package ak5;

/* loaded from: classes5.dex */
public final class a0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public a0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5946x34ca3d16 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5946x34ca3d16) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.ds dsVar = event.f136247g;
        long j17 = dsVar.f88029a;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(dsVar.f88031c, j17);
        long I0 = n17.I0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopMsgRevokeNativeMessageListener", "revokeNativeMsg callback srvId:%s", java.lang.Long.valueOf(I0));
        if (I0 == 0) {
            return false;
        }
        ak5.v Bi = ((ak5.g0) i95.n0.c(ak5.g0.class)).Bi(n17.Q0());
        if (Bi != null) {
            Bi.a(I0);
        }
        zj5.a.f554881a.a(6, I0);
        return false;
    }
}
