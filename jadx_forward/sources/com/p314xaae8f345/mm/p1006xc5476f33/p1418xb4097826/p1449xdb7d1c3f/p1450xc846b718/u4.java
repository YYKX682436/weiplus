package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class u4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5 f187419d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5 l5Var) {
        super(0);
        this.f187419d = l5Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.at2 at2Var;
        java.util.ArrayList arrayList;
        r45.ng7 ng7Var;
        java.util.LinkedList m75941xfb821914;
        r45.at2 at2Var2 = new r45.at2();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5 l5Var = this.f187419d;
        try {
            java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_REDDOT_FREQ_CONF_STRING_SYNC, "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.String");
            at2Var2.mo11468x92b714fd(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h((java.lang.String) m17));
            byte[] a17 = fp.i0.a(at2Var2);
            if (a17 != null) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = ((com.p314xaae8f345.mm.p2495xc50a8b8b.f) r45.at2.class.newInstance()).mo11468x92b714fd(a17);
                if (mo11468x92b714fd == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderReddotFreqConfig");
                }
                at2Var = (r45.at2) mo11468x92b714fd;
            } else {
                at2Var = null;
            }
            l5Var.f187195n = at2Var;
            int i17 = 2;
            if (at2Var != null && (ng7Var = (r45.ng7) at2Var.m75936x14adae67(3)) != null && (m75941xfb821914 = ng7Var.m75941xfb821914(2)) != null) {
                m75941xfb821914.clear();
            }
            java.util.Iterator it = at2Var2.m75941xfb821914(0).iterator();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
            while (it.hasNext()) {
                r45.f90 f90Var = (r45.f90) it.next();
                if (f90Var.m75939xb282bd08(0) <= 0 || f90Var.m75939xb282bd08(1) <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotFreqControlHandler", "initFinderReddotFreqConfig remove invalid item:" + f90Var.m75939xb282bd08(0) + " - " + f90Var.m75939xb282bd08(1));
                    it.remove();
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("initFinderReddotFreqConfig nm=");
            java.util.LinkedList<r45.f90> m75941xfb8219142 = at2Var2.m75941xfb821914(0);
            int i18 = 10;
            if (m75941xfb8219142 != null) {
                arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb8219142, 10));
                for (r45.f90 f90Var2 : m75941xfb8219142) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append(f90Var2.m75939xb282bd08(0));
                    sb7.append('_');
                    sb7.append(f90Var2.m75939xb282bd08(1));
                    arrayList.add(sb7.toString());
                }
            } else {
                arrayList = null;
            }
            sb6.append(arrayList);
            sb6.append(",stay_entry_min_duration=");
            sb6.append(at2Var2.m75939xb282bd08(1));
            sb6.append(",simul_expose_max_count_limit=");
            sb6.append(at2Var2.m75939xb282bd08(2));
            sb6.append(",x_strategy=");
            r45.ng7 ng7Var2 = (r45.ng7) at2Var2.m75936x14adae67(3);
            sb6.append(ng7Var2 != null ? ng7Var2.m75941xfb821914(1) : null);
            sb6.append(",is_reset_client_record=");
            r45.ng7 ng7Var3 = (r45.ng7) at2Var2.m75936x14adae67(3);
            sb6.append(ng7Var3 != null ? java.lang.Boolean.valueOf(ng7Var3.m75933x41a8a7f2(4)) : null);
            sb6.append(",history_record_update_time=");
            r45.ng7 ng7Var4 = (r45.ng7) at2Var2.m75936x14adae67(3);
            sb6.append(ng7Var4 != null ? java.lang.Integer.valueOf(ng7Var4.m75939xb282bd08(3)) : null);
            sb6.append(",biz_x_strategy=");
            r45.en enVar = (r45.en) at2Var2.m75936x14adae67(6);
            sb6.append(enVar != null ? enVar.m75941xfb821914(0) : null);
            sb6.append(",biz_control_items=");
            java.util.LinkedList<r45.gk> m75941xfb8219143 = at2Var2.m75941xfb821914(4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219143, "getBiz_control_items(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(m75941xfb8219143, 10));
            for (r45.gk gkVar : m75941xfb8219143) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(gkVar.m75939xb282bd08(i17));
                sb8.append(",n_m=");
                java.util.LinkedList<r45.f90> m75941xfb8219144 = gkVar.m75941xfb821914(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219144, "getControl_items(...)");
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(m75941xfb8219144, i18));
                for (r45.f90 f90Var3 : m75941xfb8219144) {
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                    sb9.append(f90Var3.m75939xb282bd08(0));
                    sb9.append('_');
                    sb9.append(f90Var3.m75939xb282bd08(1));
                    arrayList3.add(sb9.toString());
                }
                sb8.append(arrayList3);
                arrayList2.add(sb8.toString());
                i17 = 2;
                i18 = 10;
            }
            sb6.append(arrayList2);
            sb6.append(",exempt_strategy=");
            r45.sl0 sl0Var = (r45.sl0) at2Var2.m75936x14adae67(5);
            sb6.append(sl0Var != null ? sl0Var.m75941xfb821914(2) : null);
            sb6.append(",is_count_with_x=");
            r45.sl0 sl0Var2 = (r45.sl0) at2Var2.m75936x14adae67(5);
            sb6.append(sl0Var2 != null ? java.lang.Boolean.valueOf(sl0Var2.m75933x41a8a7f2(1)) : null);
            sb6.append('!');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotFreqControlHandler", sb6.toString());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.RedDotFreqControlHandler", e17, "", new java.lang.Object[0]);
        }
        return at2Var2;
    }
}
