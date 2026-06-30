package r63;

/* loaded from: classes14.dex */
public final class s extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public s() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5811xe7e12238 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5811xe7e12238) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.j()) {
            r63.n nVar = r63.n.f474575a;
            if (r63.n.f474585k == null) {
                r63.n.f474585k = java.lang.Boolean.valueOf(j62.e.g().l("clicfg_global_page_lifecycle_open_config", true, true, true));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderStayTimeMonitor", "isOpenLifecycleMonitor: " + r63.n.f474585k);
            }
            java.lang.Boolean bool = r63.n.f474585k;
            if (bool != null ? bool.booleanValue() : false) {
                vp1.i iVar = vp1.i.f520422a;
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = vp1.i.f520430i;
                if (!copyOnWriteArrayList.contains(nVar)) {
                    copyOnWriteArrayList.add(nVar);
                }
                r63.p pVar = r63.n.f474576b;
                ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().H(pVar);
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Application");
                ((android.app.Application) context).registerActivityLifecycleCallbacks(new r63.o(pVar));
                r63.l lVar = r63.l.f474555a;
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(r63.l.f474574t, intentFilter);
            }
        }
        return false;
    }
}
