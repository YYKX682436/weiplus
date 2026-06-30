package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4;

/* loaded from: classes2.dex */
public abstract class c {
    public static final void a(in5.s0 holder) {
        p012xc85e97e9.p093xedfae76a.k0 k0Var;
        p012xc85e97e9.p093xedfae76a.j0 j0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object tag = holder.f3639x46306858.getTag(com.p314xaae8f345.mm.R.id.f566208tj0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.a aVar = tag instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.a ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.a) tag : null;
        if (aVar != null && (k0Var = aVar.f192956c) != null && (j0Var = aVar.f192955b) != null) {
            j0Var.mo522xb5bdeb7a(k0Var);
        }
        if (aVar != null) {
            aVar.f192955b = null;
        }
        if (aVar != null) {
            aVar.f192956c = null;
        }
        holder.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.f566208tj0, null);
    }

    public static final void b(java.util.Set set, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.a aVar, in5.s0 s0Var, int i17) {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90) s0Var.p(com.p314xaae8f345.mm.R.id.ghd);
        if (c15178x4303ff90 == null || set == null) {
            return;
        }
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 : ((xc2.t) it.next()).f534835d) {
                if (c19786x6a1e2862.m76480xe2ee1ca3() == 110) {
                    java.util.LinkedList<r45.wf6> m76521x7528c3fb = c19786x6a1e2862.m76521x7528c3fb();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
                    java.util.Iterator<T> it6 = m76521x7528c3fb.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            obj = it6.next();
                            if (((r45.wf6) obj).m75939xb282bd08(2) == 41) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    r45.wf6 wf6Var = (r45.wf6) obj;
                    if (wf6Var == null) {
                        c15178x4303ff90.K(null, 0);
                    } else if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar.f192954a, (r45.s84) wf6Var.m75936x14adae67(49))) {
                        aVar.f192954a = (r45.s84) wf6Var.m75936x14adae67(49);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FeedFullConvert", "update live_highlight_style");
                        r45.s84 s84Var = (r45.s84) wf6Var.m75936x14adae67(49);
                        c15178x4303ff90.K(s84Var != null ? s84Var.m75941xfb821914(0) : null, i17);
                    }
                }
            }
        }
    }

    public static final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qeVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.content.Context context = holder.f374654e;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        if (abstractActivityC21394xb3d2c0cf == null) {
            return;
        }
        pf5.u uVar = pf5.u.f435469a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        int m75939xb282bd08 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) uVar.b(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6().m75939xb282bd08(5);
        a(holder);
        java.lang.Object tag = holder.f3639x46306858.getTag(com.p314xaae8f345.mm.R.id.f566208tj0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.a aVar = tag instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.a ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.a) tag : null;
        if (aVar == null) {
            aVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.a();
            holder.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.f566208tj0, aVar);
        }
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(item.getFeedObject().m59264x7efe73ec());
        int m75939xb282bd082 = mb4Var != null ? mb4Var.m75939xb282bd08(3) : 0;
        if (m75939xb282bd082 <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90) holder.p(com.p314xaae8f345.mm.R.id.ghd);
            if (c15178x4303ff90 == null) {
                return;
            }
            c15178x4303ff90.K(null, 0);
            return;
        }
        p012xc85e97e9.p093xedfae76a.j0 W6 = ((xc2.k0) uVar.e(zy2.b6.class).a(xc2.k0.class)).W6(item.mo2128x1ed62e84(), m75939xb282bd08, item.w());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.b bVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.b(aVar, holder, m75939xb282bd082);
        pm0.v.y(W6, abstractActivityC21394xb3d2c0cf, bVar);
        aVar.f192955b = W6;
        aVar.f192956c = bVar;
        b((java.util.Set) W6.mo3195x754a37bb(), aVar, holder, m75939xb282bd082);
    }
}
