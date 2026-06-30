package yn1;

/* loaded from: classes11.dex */
public final class n extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public n() {
        super(1000);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5146xcc9c5522 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5146xcc9c5522) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.c cVar = event.f135496g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.AccountExpiredListener", "[AccountExpired] " + cVar.f87829c + ", " + cVar.f87827a + ", " + cVar.f87828b);
        yn1.z0 z0Var = yn1.z0.f545466a;
        synchronized (z0Var) {
            if (!z0Var.n()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationGlobalHolder", "[onLogoutEvent] Migration is not initialized, ignore event");
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationGlobalHolder", "[onLogoutEvent] event=" + event);
            yn1.z0.f545476k = event;
            return false;
        }
    }
}
