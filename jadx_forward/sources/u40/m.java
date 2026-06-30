package u40;

/* loaded from: classes8.dex */
public final class m extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public m() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (!gm0.j1.a()) {
            return false;
        }
        dk2.ef efVar = dk2.ef.f314905a;
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        if (e1Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveService", "receive logoutEvent, liveId:" + e1Var.f410521r.m75942xfb822ef2(0));
            dk2.ef.T(efVar, false, null, 3, null);
        }
        return false;
    }
}
