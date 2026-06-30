package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav;

/* loaded from: classes2.dex */
public final class t implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.x f210737d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.x xVar) {
        this.f210737d = xVar;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar;
        android.content.Context context;
        boolean z18;
        q40.h hVar;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.x xVar = this.f210737d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.C15106x1388ca00 fragment = xVar.f210751b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        pf5.z zVar = pf5.z.f435481a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.b(fragment).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        java.lang.Object obj = holder.f374658i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "getAssociatedObject(...)");
        if (xVar.h(V6, view, i17, (so2.j5) obj)) {
            return;
        }
        java.lang.Object obj2 = holder.f374658i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj2 : null;
        if (abstractC14490x69736cb5 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.a aVar = xVar.f210752c;
        boolean g17 = aVar.g();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
        android.app.Activity context2 = xVar.f210750a;
        if (!g17) {
            if (V6 != null) {
                i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                z17 = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.wj((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17, V6, abstractC14490x69736cb5.mo2128x1ed62e84(), abstractC14490x69736cb5.w(), xVar.d(), 0, null, 0L, null, 240, null);
            } else {
                z17 = true;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_COLLECTION", z17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.p pVar = aVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.p ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.p) aVar : null;
            if (pVar != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.addAll(pVar.c());
                iyVar = iyVar2;
                pVar.f210729g.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9(arrayList, pVar.z().m56357x44e5026c(), i17, null, null, 16, null), intent);
            } else {
                iyVar = iyVar2;
            }
            iyVar.c(context2, intent);
            wa2.x.e(intent, view, 0L, false, false, null, 30, null);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).fj(context2, intent, 10001);
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fd.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fd fdVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fd) a17;
        if (fdVar.f215926d) {
            boolean z19 = !fdVar.O6(abstractC14490x69736cb5.mo2128x1ed62e84());
            fdVar.f215927e.put(java.lang.Long.valueOf(abstractC14490x69736cb5.mo2128x1ed62e84()), java.lang.Boolean.valueOf(z19));
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.w) xVar.f210761l).C(holder, abstractC14490x69736cb5, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z19));
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = xVar.d().mo7946xf939df19();
            if (mo7946xf939df19 != null) {
                mo7946xf939df19.m8147xed6e4d18(i17);
                return;
            }
            return;
        }
        boolean z27 = aVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.g gVar = z27 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.g) aVar : null;
        if ((gVar == null || (hVar = gVar.f210700g) == null) ? false : hVar.M(i17)) {
            return;
        }
        if (V6 != null) {
            i95.m c18 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            context = context2;
            z18 = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.wj((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c18, V6, abstractC14490x69736cb5.mo2128x1ed62e84(), abstractC14490x69736cb5.w(), xVar.d(), 0, null, 0L, null, 240, null);
        } else {
            context = context2;
            z18 = true;
        }
        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14114xff3e44c.class);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(43, 34, 189, intent2);
        java.util.ArrayList c19 = aVar.c();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(c19, 10));
        java.util.Iterator it = c19.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.Long.valueOf(((so2.j5) it.next()).mo2128x1ed62e84()));
        }
        long[] T0 = kz5.n0.T0(arrayList2);
        iyVar2.c(context, intent2);
        intent2.putExtra("KEY_FEED_ID_LIST", T0);
        intent2.putExtra("KEY_CENTER_FEED_ID", abstractC14490x69736cb5.mo2128x1ed62e84());
        intent2.putExtra("KEY_CENTER_FEED_POS", i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.g gVar2 = z27 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.g) aVar : null;
        intent2.putExtra("KEY_HAS_MORE", gVar2 != null ? java.lang.Boolean.valueOf(gVar2.f210701h) : null);
        intent2.putExtra("KEY_IS_GLOBAL_FAV", z18);
        wa2.x.e(intent2, view, 0L, false, false, null, 30, null);
        android.app.Activity activity = xVar.f210750a;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList3.add(java.lang.Integer.valueOf(z18 ? 1 : 0));
        arrayList3.add(intent2);
        java.util.Collections.reverse(arrayList3);
        yj0.a.k(activity, arrayList3.toArray(), "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback$initCenter$4", "onItemClick", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;ILcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }
}
