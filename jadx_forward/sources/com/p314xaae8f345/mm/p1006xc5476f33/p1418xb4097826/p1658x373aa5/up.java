package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class up extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f214748e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zp f214749f;

    public up(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zp zpVar, yz5.l isLast) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(isLast, "isLast");
        this.f214749f = zpVar;
        this.f214748e = isLast;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.apm;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.Integer num;
        java.lang.Integer num2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.tp item = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.tp) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ezm);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.ezj);
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.ezn);
        if (i17 == 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            num = 8;
            yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$DataConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$Data;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$DataConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$Data;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            num2 = 0;
        } else {
            num = 8;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            num2 = 0;
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$DataConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$Data;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$DataConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$Data;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (i17 == this.f214749f.f215020d.size() - 1) {
            textView.setTextSize(1, 17.0f);
            textView.setText(textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d8n));
        } else {
            textView.setTextSize(1, 20.0f);
            textView.setText(java.lang.String.valueOf(item.f214679d));
        }
        if (((java.lang.Boolean) this.f214748e.mo146xb9724478(java.lang.Integer.valueOf(i17))).booleanValue()) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(num2);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$DataConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$Data;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$DataConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$Data;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(num);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(p17, arrayList4.toArray(), "com/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$DataConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$Data;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$DataConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$Data;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ezm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        hc2.o.a(textView, false);
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
    }
}
