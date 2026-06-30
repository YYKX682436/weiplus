package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class br {
    public br(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.util.Map a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject2;
        r45.nw1 m76794xd0557130;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("feed_id", pm0.v.u(abstractC14490x69736cb5.getFeedObject().getFeedObject().m76784x5db1b11()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject3 = abstractC14490x69736cb5.getFeedObject();
        linkedHashMap.put("live_id", (feedObject3 == null || (feedObject2 = feedObject3.getFeedObject()) == null || (m76794xd0557130 = feedObject2.m76794xd0557130()) == null) ? "0" : java.lang.Long.valueOf(m76794xd0557130.m75942xfb822ef2(0)));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject4 = abstractC14490x69736cb5.getFeedObject();
        linkedHashMap.put("finder_username", (feedObject4 == null || (feedObject = feedObject4.getFeedObject()) == null) ? null : feedObject.m76836x6c03c64c());
        ml2.v1 v1Var = ml2.v1.f409673e;
        linkedHashMap.put("live_enter_status", 1L);
        linkedHashMap.put("share_username", "");
        return linkedHashMap;
    }

    public final void b(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item, java.lang.String eventId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a, view, "living_label", eventId, 26236, a(item), null, 32, null);
    }
}
