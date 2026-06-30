package on2;

/* loaded from: classes3.dex */
public final class f2 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1555x373fe494.n f428439e;

    /* renamed from: f, reason: collision with root package name */
    public int f428440f;

    public f2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1555x373fe494.n presenter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        this.f428439e = presenter;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.atu;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        r45.gz1 gz1Var;
        r45.vd4 vd4Var;
        so2.b3 item = (so2.b3) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        holder.f374658i = item;
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d l17 = g1Var.l();
        r45.zy1 zy1Var = item.f491801d;
        mn2.n nVar = new mn2.n(zy1Var.m75945x2fec8307(2), null, 2, null);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.isp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
        l17.c(nVar, (android.widget.ImageView) p17, g1Var.h(mn2.f1.f411494o));
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.iss);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        boolean z18 = true;
        java.lang.String m75945x2fec8307 = zy1Var.m75945x2fec8307(1);
        ((ke0.e) xVar).getClass();
        android.content.Context context = holder.f374654e;
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, m75945x2fec8307));
        java.lang.String m75945x2fec83072 = zy1Var.m75945x2fec8307(6);
        if (m75945x2fec83072 == null || m75945x2fec83072.length() == 0) {
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.isq)).setVisibility(8);
        } else {
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.isq)).setText(zy1Var.m75945x2fec8307(6));
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.isq)).setVisibility(0);
        }
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.mld);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1555x373fe494.n nVar2 = this.f428439e;
        int i19 = (!nVar2.f202381h || nVar2.f202382i || nVar2.f202383m) ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/FinderLotteryWinnersConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLotteryWinnerData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/finder/lottery/FinderLotteryWinnersConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLotteryWinnerData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setOnClickListener(new on2.d2(item, holder, this));
        if (p18.getVisibility() == 0 && this.f428440f == 0) {
            android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f566472g03);
            this.f428440f = java.lang.Math.max(context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7), ((int) textView2.getPaint().measureText(textView2.getText().toString())) + context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz));
        }
        ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.iss)).setPadding(0, 0, this.f428440f, 0);
        ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.isq)).setPadding(0, 0, this.f428440f, 0);
        android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.q39);
        r45.iz1 iz1Var = (r45.iz1) zy1Var.m75936x14adae67(7);
        int i27 = iz1Var != null && iz1Var.m75933x41a8a7f2(1) ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i27));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p19, arrayList2.toArray(), "com/tencent/mm/plugin/finder/lottery/FinderLotteryWinnersConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLotteryWinnerData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p19.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p19, "com/tencent/mm/plugin/finder/lottery/FinderLotteryWinnersConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLotteryWinnerData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) holder.p(com.p314xaae8f345.mm.R.id.q6y);
        r45.iz1 iz1Var2 = (r45.iz1) zy1Var.m75936x14adae67(7);
        java.util.LinkedList m75941xfb821914 = iz1Var2 != null ? iz1Var2.m75941xfb821914(0) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = nVar2.f204084d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractC13919x46aff122, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryListLoader");
        r45.cz1 cz1Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13869x297bc248) abstractC13919x46aff122).f189022m;
        java.util.List m75941xfb8219142 = (cz1Var == null || (gz1Var = (r45.gz1) cz1Var.m75936x14adae67(14)) == null || (vd4Var = (r45.vd4) gz1Var.m75936x14adae67(2)) == null) ? null : vd4Var.m75941xfb821914(1);
        if (m75941xfb8219142 == null) {
            m75941xfb8219142 = kz5.p0.f395529d;
        }
        if (m75941xfb821914 != null && !m75941xfb821914.isEmpty()) {
            z18 = false;
        }
        if (z18) {
            c1163xf1deaba4.setVisibility(8);
            return;
        }
        c1163xf1deaba4.setVisibility(0);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
        on2.c2 c2Var = mo7946xf939df19 instanceof on2.c2 ? (on2.c2) mo7946xf939df19 : null;
        if (c2Var != null) {
            java.util.List a17 = rn2.y2.f479458e.a(m75941xfb821914, m75941xfb8219142);
            java.util.ArrayList arrayList3 = (java.util.ArrayList) c2Var.f428391d;
            arrayList3.clear();
            arrayList3.addAll(a17);
        }
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f566472g03)).getPaint(), 0.8f);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.mld);
        p17.post(new on2.e2(p17));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) holder.p(com.p314xaae8f345.mm.R.id.q6y);
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(recyclerView.getContext(), 0, false));
        c1163xf1deaba4.mo7960x6cab2c8d(new on2.c2());
    }
}
