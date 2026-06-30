package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class v5 extends com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf {
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14889x51ce1ce I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14889x51ce1ce c14889x51ce1ce, in5.s sVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa) {
        super(sVar, c13920xa5f564aa, false);
        this.I = c14889x51ce1ce;
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: B0 */
    public void mo8160xd8bfd53(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.mo8160xd8bfd53(holder);
        android.view.ViewGroup.LayoutParams layoutParams = holder.f3639x46306858.getLayoutParams();
        if (layoutParams == null || !(layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams)) {
            return;
        }
        ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) layoutParams).f93474i = holder.m8185xcdaf1228() == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14889x51ce1ce.m58640xdeca180e();
    }

    @Override // in5.n0, com.p314xaae8f345.mm.ui.p2730xe821e364.AbstractC22470xf90b5f7b, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List payloads) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        super.mo8157xe5e2e48d(holder, i17, payloads);
        so2.j5 j5Var = (so2.j5) holder.f374658i;
        if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
            if (zl2.q4.f555466a.C(abstractC14490x69736cb5)) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.f3639x46306858, "profile_live_room_card");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(holder.f3639x46306858, 40, 26236);
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                r45.nw1 m59258xd0557130 = abstractC14490x69736cb5.getFeedObject().m59258xd0557130();
                if (m59258xd0557130 != null) {
                    linkedHashMap.put("live_id", pm0.v.u(m59258xd0557130.m75942xfb822ef2(0)));
                }
                linkedHashMap.put("feed_id", pm0.v.u(abstractC14490x69736cb5.getFeedObject().getFeedObject().m76784x5db1b11()));
                java.lang.String m76836x6c03c64c = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76836x6c03c64c();
                if (m76836x6c03c64c == null) {
                    m76836x6c03c64c = "";
                }
                linkedHashMap.put("finder_username", m76836x6c03c64c);
                ml2.q1 q1Var = ml2.q1.f409345e;
                linkedHashMap.put("comment_scene", "temp_5");
                linkedHashMap.put("session_buffer", "");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(holder.f3639x46306858, linkedHashMap);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(holder.f3639x46306858, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.u5(this.I, j5Var));
            }
        }
    }
}
