package oe2;

/* loaded from: classes8.dex */
public final class r extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public r() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.ia iaVar = event.f135785g;
        if (iaVar.f88452b != 8 || iaVar.f88458h != 2) {
            return false;
        }
        long j17 = iaVar.f88451a;
        oe2.x xVar = oe2.x.f426319a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveTipsBarDataEventReceiver", "liveEndListener recv liveId:".concat(pm0.v.u(j17)));
        rl2.v b17 = oe2.x.b(oe2.x.f426319a);
        if (b17 == null) {
            return false;
        }
        b17.z0(j17, true);
        return false;
    }
}
