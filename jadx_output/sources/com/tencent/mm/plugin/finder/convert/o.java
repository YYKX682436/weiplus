package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class o extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.du_;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.y item = (so2.y) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ein);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        dm.pd pdVar = item.f410411d;
        java.lang.String str = pdVar.field_username;
        java.lang.String str2 = pdVar.field_nickname;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            i95.m c17 = i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            str2 = c61.yb.md((c61.yb) c17, str == null ? "" : str, str2 == null ? "" : str2, false, 4, null);
        } else if (str2 == null) {
            str2 = "";
        }
        ((ke0.e) xVar).getClass();
        android.content.Context context = holder.f293121e;
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str2));
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        com.google.android.flexbox.FlexboxLayout.LayoutParams layoutParams2 = layoutParams instanceof com.google.android.flexbox.FlexboxLayout.LayoutParams ? (com.google.android.flexbox.FlexboxLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.f44194i = (int) textView.getPaint().measureText(hc2.x0.f(textView.getText().toString(), 4));
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.eii);
        mn2.n nVar = new mn2.n(pdVar.field_headUrl, null, 2, null);
        int i19 = pdVar.field_extFlag;
        int i27 = i19 & 2;
        mn2.g1 g1Var = mn2.g1.f329975a;
        if (i27 == 0 && (i19 & 1) == 0) {
            vo0.d l17 = g1Var.l();
            kotlin.jvm.internal.o.d(imageView);
            l17.c(nVar, imageView, g1Var.h(mn2.f1.f329961o));
        } else {
            vo0.d a17 = g1Var.a();
            kotlin.jvm.internal.o.d(imageView);
            a17.c(nVar, imageView, g1Var.h(mn2.f1.f329957h));
        }
        int i28 = pdVar.field_createTime;
        if (i28 != 0) {
            java.lang.String n17 = com.tencent.mm.plugin.finder.assist.w2.n(context, i28 * 1000);
            android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.o7z);
            textView2.setText(n17);
            textView2.setVisibility(0);
        }
        android.view.View p17 = holder.p(com.tencent.mm.R.id.r4b);
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderAggregatedMsgConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderAggregatedMsg;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderAggregatedMsgConvert", "refresh", "(Lcom/tencent/mm/plugin/finder/model/FinderAggregatedMsg;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.util.LinkedList list2 = pdVar.field_svrMention.getList(55);
        kotlin.jvm.internal.o.f(list2, "getInteraction_label_list(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : list2) {
            int integer = ((r45.zb1) obj).getInteger(1);
            com.tencent.mm.plugin.finder.assist.d3 d3Var = com.tencent.mm.plugin.finder.assist.d3.f102076e;
            if (integer == 1) {
                arrayList2.add(obj);
            }
        }
        com.tencent.mm.plugin.finder.view.FinderInteractionLabelGroupView finderInteractionLabelGroupView = (com.tencent.mm.plugin.finder.view.FinderInteractionLabelGroupView) holder.p(com.tencent.mm.R.id.e5y);
        if (finderInteractionLabelGroupView != null) {
            int i29 = arrayList2.isEmpty() ^ true ? 0 : 8;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(java.lang.Integer.valueOf(i29));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(finderInteractionLabelGroupView, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderAggregatedMsgConvert", "updateInteractionLabelGroup", "(Lcom/tencent/mm/plugin/finder/model/FinderAggregatedMsg;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            finderInteractionLabelGroupView.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(finderInteractionLabelGroupView, "com/tencent/mm/plugin/finder/convert/FinderAggregatedMsgConvert", "updateInteractionLabelGroup", "(Lcom/tencent/mm/plugin/finder/model/FinderAggregatedMsg;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (finderInteractionLabelGroupView.getVisibility() == 0) {
                finderInteractionLabelGroupView.a(arrayList2);
            }
        }
        java.util.LinkedList list3 = pdVar.field_svrMention.getList(55);
        kotlin.jvm.internal.o.f(list3, "getInteraction_label_list(...)");
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list3) {
            int integer2 = ((r45.zb1) obj2).getInteger(1);
            com.tencent.mm.plugin.finder.assist.d3 d3Var2 = com.tencent.mm.plugin.finder.assist.d3.f102076e;
            if (integer2 == 2) {
                arrayList4.add(obj2);
            }
        }
        com.tencent.mm.plugin.finder.view.FinderInteractionLabelGroupView finderInteractionLabelGroupView2 = (com.tencent.mm.plugin.finder.view.FinderInteractionLabelGroupView) holder.p(com.tencent.mm.R.id.rdn);
        if (finderInteractionLabelGroupView2 != null) {
            int i37 = arrayList4.isEmpty() ^ true ? 0 : 8;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList5.add(java.lang.Integer.valueOf(i37));
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(finderInteractionLabelGroupView2, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderAggregatedMsgConvert", "updateInteractionLabelGroup", "(Lcom/tencent/mm/plugin/finder/model/FinderAggregatedMsg;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            finderInteractionLabelGroupView2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(finderInteractionLabelGroupView2, "com/tencent/mm/plugin/finder/convert/FinderAggregatedMsgConvert", "updateInteractionLabelGroup", "(Lcom/tencent/mm/plugin/finder/model/FinderAggregatedMsg;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (finderInteractionLabelGroupView2.getVisibility() == 0) {
                finderInteractionLabelGroupView2.a(arrayList4);
            }
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
