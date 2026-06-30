package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class po extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f214388e;

    public po(yz5.l isLast) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(isLast, "isLast");
        this.f214388e = isLast;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.arf;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        android.view.View view;
        int i19;
        int i27;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dk item = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dk) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ezm);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.ezl);
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.ezj);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ezk);
        r45.u24 u24Var = (r45.u24) item.f213433d;
        java.lang.String m75945x2fec8307 = u24Var.m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        textView.setText(m75945x2fec8307);
        int m75939xb282bd08 = u24Var.m75939xb282bd08(1);
        android.content.Context context = holder.f374654e;
        if (m75939xb282bd08 == 7 && item.f213434e) {
            r45.j73 j73Var = (r45.j73) u24Var.m75936x14adae67(2);
            int m75939xb282bd082 = j73Var != null ? j73Var.m75939xb282bd08(1) : 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTeamConditionBottomSheet", "current setting value: " + m75939xb282bd082);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            view = p18;
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/GameTeamConditionBottomSheet$GameTeamConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/FinderSingleSelectBottomSheet$ConditionData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/view/GameTeamConditionBottomSheet$GameTeamConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/FinderSingleSelectBottomSheet$ConditionData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView2.setVisibility(0);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String valueOf = java.lang.String.valueOf(m75939xb282bd082);
            android.graphics.drawable.Drawable e17 = com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f78868xd4a8b967, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c));
            e17.setBounds(0, 0, i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
            ((ke0.e) xVar).getClass();
            java.util.LinkedList linkedList = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.f272724a;
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            spannableStringBuilder.append((java.lang.CharSequence) " ");
            i19 = 1;
            spannableStringBuilder.setSpan(new al5.w(e17, 1), 0, 1, 17);
            spannableStringBuilder.append((java.lang.CharSequence) " ");
            spannableStringBuilder.append((java.lang.CharSequence) valueOf);
            textView2.setText(spannableStringBuilder);
            i27 = 8;
        } else {
            view = p18;
            i19 = 1;
            textView2.setVisibility(8);
            if (item.f213434e) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                i27 = 8;
                yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/GameTeamConditionBottomSheet$GameTeamConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/FinderSingleSelectBottomSheet$ConditionData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/view/GameTeamConditionBottomSheet$GameTeamConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/FinderSingleSelectBottomSheet$ConditionData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                i27 = 8;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(p17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/GameTeamConditionBottomSheet$GameTeamConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/FinderSingleSelectBottomSheet$ConditionData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/view/GameTeamConditionBottomSheet$GameTeamConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/FinderSingleSelectBottomSheet$ConditionData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (u24Var.m75939xb282bd08(i19) == i19) {
            textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560534n5));
        } else {
            textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        }
        if (((java.lang.Boolean) this.f214388e.mo146xb9724478(java.lang.Integer.valueOf(i17))).booleanValue()) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/finder/view/GameTeamConditionBottomSheet$GameTeamConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/FinderSingleSelectBottomSheet$ConditionData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = view;
            view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/view/GameTeamConditionBottomSheet$GameTeamConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/FinderSingleSelectBottomSheet$ConditionData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view3 = view;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(java.lang.Integer.valueOf(i27));
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view3, arrayList5.toArray(), "com/tencent/mm/plugin/finder/view/GameTeamConditionBottomSheet$GameTeamConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/FinderSingleSelectBottomSheet$ConditionData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/view/GameTeamConditionBottomSheet$GameTeamConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/FinderSingleSelectBottomSheet$ConditionData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
