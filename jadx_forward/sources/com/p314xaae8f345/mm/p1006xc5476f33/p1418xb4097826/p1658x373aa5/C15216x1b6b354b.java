package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/ContactUninterestEventListener;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderUninterestEvent;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;", "Lso2/j5;", "feedLoader", "<init>", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.ContactUninterestEventListener */
/* loaded from: classes2.dex */
public final class C15216x1b6b354b extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5545x4ee67671> {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 f212363d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15216x1b6b354b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122<so2.j5> feedLoader) {
        super(com.p314xaae8f345.mm.app.a0.f134821d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedLoader, "feedLoader");
        this.f212363d = feedLoader;
        this.f39173x3fe91575 = -429918623;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5545x4ee67671 c5545x4ee67671) {
        am.pd pdVar;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5545x4ee67671 event = c5545x4ee67671;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.f212363d.m56392xfc5c33e5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5.class));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) it.next();
            java.util.LinkedList h17 = nv2.n1.f422084h.h(abstractC14490x69736cb5.getFeedObject().getFeedObject());
            java.util.Iterator it6 = h17.iterator();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 = null;
            while (true) {
                boolean hasNext = it6.hasNext();
                pdVar = event.f135869g;
                if (!hasNext) {
                    break;
                }
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b872 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) it6.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c19781xd1c47b872.m76102x6c03c64c(), pdVar.f89146a)) {
                    c19781xd1c47b87 = c19781xd1c47b872;
                }
            }
            if (c19781xd1c47b87 != null) {
                h17.remove(c19781xd1c47b87);
                abstractC14490x69736cb5.getFeedObject().m59382x2d5669f8(r3.m59247xf67fd084() - 1);
                if (abstractC14490x69736cb5.getFeedObject().getFeedObject().m76798x4d29f51b() == 1 && c19781xd1c47b87.m76100x157d2fb1() == 1 && abstractC14490x69736cb5.getFeedObject().getFeedObject().m76785x6e4908f2() > 0) {
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject = abstractC14490x69736cb5.getFeedObject().getFeedObject();
                    feedObject.m76878x5748afe(feedObject.m76785x6e4908f2() - 1);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ContactUninterestEventListener", "FinderUninterestEvent " + pdVar.f89146a + ", " + abstractC14490x69736cb5.getFeedObject().getFeedObject().m76785x6e4908f2());
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3();
                am.ia iaVar = c5445x963cab3.f135785g;
                iaVar.f88452b = 4;
                iaVar.f88451a = abstractC14490x69736cb5.mo2128x1ed62e84();
                c5445x963cab3.e();
            }
        }
        return true;
    }
}
