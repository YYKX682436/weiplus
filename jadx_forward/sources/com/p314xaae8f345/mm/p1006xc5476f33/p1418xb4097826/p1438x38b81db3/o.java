package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class o extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.du_;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.y item = (so2.y) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ein);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        dm.pd pdVar = item.f491944d;
        java.lang.String str = pdVar.f66131xdec927b;
        java.lang.String str2 = pdVar.f66106x21f9b213;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            i95.m c17 = i95.n0.c(c61.yb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            str2 = c61.yb.md((c61.yb) c17, str == null ? "" : str, str2 == null ? "" : str2, false, 4, null);
        } else if (str2 == null) {
            str2 = "";
        }
        ((ke0.e) xVar).getClass();
        android.content.Context context = holder.f374654e;
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str2));
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.LayoutParams layoutParams2 = layoutParams instanceof com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.LayoutParams ? (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.f125727i = (int) textView.getPaint().measureText(hc2.x0.f(textView.getText().toString(), 4));
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.eii);
        mn2.n nVar = new mn2.n(pdVar.f66093xa3f9e12a, null, 2, null);
        int i19 = pdVar.f66082x26b1b2e8;
        int i27 = i19 & 2;
        mn2.g1 g1Var = mn2.g1.f411508a;
        if (i27 == 0 && (i19 & 1) == 0) {
            vo0.d l17 = g1Var.l();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            l17.c(nVar, imageView, g1Var.h(mn2.f1.f411494o));
        } else {
            vo0.d a17 = g1Var.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            a17.c(nVar, imageView, g1Var.h(mn2.f1.f411490h));
        }
        int i28 = pdVar.f66080xac3be4e;
        if (i28 != 0) {
            java.lang.String n17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.n(context, i28 * 1000);
            android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.o7z);
            textView2.setText(n17);
            textView2.setVisibility(0);
        }
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.r4b);
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderAggregatedMsgConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderAggregatedMsg;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderAggregatedMsgConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderAggregatedMsg;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.util.LinkedList m75941xfb821914 = pdVar.f66123xabd3e0e0.m75941xfb821914(55);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getInteraction_label_list(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : m75941xfb821914) {
            int m75939xb282bd08 = ((r45.zb1) obj).m75939xb282bd08(1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d3 d3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d3.f183609e;
            if (m75939xb282bd08 == 1) {
                arrayList2.add(obj);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15301xb3484a3c c15301xb3484a3c = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15301xb3484a3c) holder.p(com.p314xaae8f345.mm.R.id.e5y);
        if (c15301xb3484a3c != null) {
            int i29 = arrayList2.isEmpty() ^ true ? 0 : 8;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(java.lang.Integer.valueOf(i29));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(c15301xb3484a3c, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderAggregatedMsgConvert", "updateInteractionLabelGroup", "(Lcom/tencent/mm/plugin/finder/model/FinderAggregatedMsg;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c15301xb3484a3c.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(c15301xb3484a3c, "com/tencent/mm/plugin/finder/convert/FinderAggregatedMsgConvert", "updateInteractionLabelGroup", "(Lcom/tencent/mm/plugin/finder/model/FinderAggregatedMsg;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (c15301xb3484a3c.getVisibility() == 0) {
                c15301xb3484a3c.a(arrayList2);
            }
        }
        java.util.LinkedList m75941xfb8219142 = pdVar.f66123xabd3e0e0.m75941xfb821914(55);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getInteraction_label_list(...)");
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj2 : m75941xfb8219142) {
            int m75939xb282bd082 = ((r45.zb1) obj2).m75939xb282bd08(1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d3 d3Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d3.f183609e;
            if (m75939xb282bd082 == 2) {
                arrayList4.add(obj2);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15301xb3484a3c c15301xb3484a3c2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15301xb3484a3c) holder.p(com.p314xaae8f345.mm.R.id.rdn);
        if (c15301xb3484a3c2 != null) {
            int i37 = arrayList4.isEmpty() ^ true ? 0 : 8;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList5.add(java.lang.Integer.valueOf(i37));
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(c15301xb3484a3c2, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderAggregatedMsgConvert", "updateInteractionLabelGroup", "(Lcom/tencent/mm/plugin/finder/model/FinderAggregatedMsg;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c15301xb3484a3c2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(c15301xb3484a3c2, "com/tencent/mm/plugin/finder/convert/FinderAggregatedMsgConvert", "updateInteractionLabelGroup", "(Lcom/tencent/mm/plugin/finder/model/FinderAggregatedMsg;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (c15301xb3484a3c2.getVisibility() == 0) {
                c15301xb3484a3c2.a(arrayList4);
            }
        }
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
