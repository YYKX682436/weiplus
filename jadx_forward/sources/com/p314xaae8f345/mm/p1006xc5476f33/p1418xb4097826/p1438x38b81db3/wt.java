package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class wt extends in5.r {
    public wt() {
        jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.vt.f186345d);
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b7_;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        r45.i72 i72Var;
        so2.q2 item = (so2.q2) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.f fVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.f.f184849a;
        if (list != null) {
            for (java.lang.Object obj : list) {
                if ((obj instanceof java.lang.Integer) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, 2002)) {
                    android.view.View itemView = holder.f3639x46306858;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
                    fVar.c(itemView, item);
                    return;
                }
            }
        }
        android.view.View itemView2 = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView2, "itemView");
        fVar.b(itemView2, item);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.lyh);
        java.lang.String n27 = item.n2();
        if (p17 != null) {
            mn2.g1 g1Var = mn2.g1.f411508a;
            g1Var.f().c(new mn2.q3(n27, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), (android.widget.ImageView) p17, g1Var.h(mn2.f1.f411486d));
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = item.f492082n;
        r45.nw1 m76794xd0557130 = c19792x256d2725.m76794xd0557130();
        long m75942xfb822ef2 = (m76794xd0557130 == null || (i72Var = (r45.i72) m76794xd0557130.m75936x14adae67(44)) == null) ? 0L : i72Var.m75942xfb822ef2(1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("replay:");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c19792x256d2725.m76802x2dd01666();
        jz5.f0 f0Var = null;
        java.lang.String m76944x730bcac6 = m76802x2dd01666 != null ? m76802x2dd01666.m76944x730bcac6() : null;
        if (m76944x730bcac6 == null) {
            m76944x730bcac6 = "";
        }
        sb6.append(m76944x730bcac6);
        sb6.append("(feedId:");
        sb6.append(pm0.v.u(c19792x256d2725.m76784x5db1b11()));
        sb6.append(",liveId:");
        r45.nw1 m76794xd05571302 = c19792x256d2725.m76794xd0557130();
        sb6.append(m76794xd05571302 != null ? java.lang.Long.valueOf(m76794xd05571302.m75942xfb822ef2(0)) : null);
        sb6.append("),");
        sb6.append(item.p2());
        sb6.append(',');
        r45.nw1 m76794xd05571303 = c19792x256d2725.m76794xd0557130();
        cm2.a aVar = cm2.a.f124861a;
        sb6.append(m76794xd05571303 != null ? cm2.a.i(aVar, m76794xd05571303, "FinderLiveReplayFeed", false, 2, null) : "");
        sb6.append(" ,watchUV:");
        sb6.append(m75942xfb822ef2);
        sb6.append(", purchaseInfo:");
        r45.nw1 m76794xd05571304 = c19792x256d2725.m76794xd0557130();
        sb6.append(aVar.l(m76794xd05571304 != null ? (r45.o52) m76794xd05571304.m75936x14adae67(28) : null));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProfileReplayLiveConvert", sb6.toString());
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.lyd);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderProfileReplayLiveForAllConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLiveReplayFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderProfileReplayLiveForAllConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLiveReplayFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (c19792x256d2725.m76794xd0557130() != null) {
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.lyj)).setText(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.l(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, r1.m75939xb282bd08(6) * 1000));
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.lyj)).setVisibility(0);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.lyj)).setVisibility(4);
        }
        android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.f568171lz0);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p19, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderProfileReplayLiveForAllConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLiveReplayFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p19.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderProfileReplayLiveForAllConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLiveReplayFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ly6)).setVisibility(8);
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.lyk)).setVisibility(8);
        ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.lyt)).setVisibility(8);
        android.view.View p27 = holder.p(com.p314xaae8f345.mm.R.id.lyq);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(p27, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderProfileReplayLiveForAllConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLiveReplayFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p27.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderProfileReplayLiveForAllConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLiveReplayFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.lyr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
        hc2.o.a((android.widget.TextView) p17, false);
    }
}
