package f41;

/* loaded from: classes.dex */
public final class d extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.eln;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        f41.r0 item = (f41.r0) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.k3s);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = itemView.findViewById(com.p314xaae8f345.mm.R.id.hc6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.view.View findViewById4 = itemView.findViewById(com.p314xaae8f345.mm.R.id.t4l);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.view.View findViewById5 = itemView.findViewById(com.p314xaae8f345.mm.R.id.t4k);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = item.f341045e;
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) findViewById).setText(z3Var.g2());
        ((android.widget.TextView) findViewById3).setText(java.lang.String.valueOf(i17 + 1));
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai((android.widget.ImageView) findViewById2, z3Var.d1(), null);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = holder.f374655f;
        boolean z18 = i17 == (f2Var != null ? f2Var.mo1894x7e414b06() : 0) - 1;
        int i19 = z18 ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById4, arrayList.toArray(), "com/tencent/mm/open_voice_control/card/ContactConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/open_voice_control/card/SlotContactItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/open_voice_control/card/ContactConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/open_voice_control/card/SlotContactItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i27 = z18 ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i27));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById5, arrayList2.toArray(), "com/tencent/mm/open_voice_control/card/ContactConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/open_voice_control/card/SlotContactItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById5.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById5, "com/tencent/mm/open_voice_control/card/ContactConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/open_voice_control/card/SlotContactItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        r.b bVar = com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.AbstractC11199x9d3689a1.T1;
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        bVar.a(itemView);
    }
}
