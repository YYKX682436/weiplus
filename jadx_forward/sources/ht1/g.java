package ht1;

/* loaded from: classes4.dex */
public final class g extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public g() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        yz5.a aVar;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5219x1606f522 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5219x1606f522) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BypSyncNewNotifyEventListener", "Get a BypNotifyActionEvent notifyAction=" + event.f135552g.f88525a);
        if (event.f135552g.f88525a == 2) {
            r45.lq lqVar = new r45.lq();
            lqVar.mo11468x92b714fd(event.f135552g.f88526b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BypSyncNewNotifyEventListener", "Get a BypNotifyActionEvent sync_all_selector=" + lqVar.f461247f + ", selector=" + lqVar.f461245d);
            if (lqVar.f461245d.contains(1)) {
                qx.a aVar2 = qx.a.f448773a;
                if (!qx.a.f448775c && !qx.a.f448774b) {
                    synchronized (aVar2) {
                        if (!qx.a.f448775c) {
                            if (!qx.a.f448774b) {
                                qx.a.f448774b = true;
                                boolean z17 = qx.a.f448776d != null;
                                if (z17 && (aVar = qx.a.f448776d) != null) {
                                    aVar.mo152xb9724478();
                                }
                            }
                        }
                    }
                }
            }
            if (lqVar.f461247f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BypSyncNewNotifyEventListener", "sync_all_selector true");
                bt1.l lVar = ((bt1.d) ((ct1.t) i95.n0.c(ct1.t.class))).f105680d;
                if (lVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("syncExtension");
                    throw null;
                }
                bt1.l.b(lVar, bt1.a.f105677b, bt1.g.f105687g, false, 0, 12, null);
            } else {
                bt1.l lVar2 = ((bt1.d) ((ct1.t) i95.n0.c(ct1.t.class))).f105680d;
                if (lVar2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("syncExtension");
                    throw null;
                }
                java.util.LinkedList selector = lqVar.f461245d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(selector, "selector");
                bt1.l.b(lVar2, selector, bt1.g.f105687g, false, 0, 12, null);
            }
        }
        return true;
    }
}
