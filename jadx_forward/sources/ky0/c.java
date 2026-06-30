package ky0;

/* loaded from: classes5.dex */
public final class c extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public c() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5208x21fb95ff event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5208x21fb95ff) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BypCommonBizAIMediaGenerateCompleteEvent", "Received a BypCommonBizWebSearchRedDotEvent");
        ky0.b bVar = ky0.b.f394985a;
        boolean z17 = event.f135548g.f88158a;
        synchronized (bVar) {
            java.util.List list = (java.util.List) ((java.util.LinkedHashMap) ky0.b.f394986b).get(z17 ? ky0.a.f394982d : ky0.a.f394983e);
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((yz5.a) it.next()).mo152xb9724478();
                }
            }
        }
        return true;
    }
}
