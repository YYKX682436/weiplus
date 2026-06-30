package on2;

/* loaded from: classes3.dex */
public final class j2 extends in5.r {
    public static final void n(on2.j2 j2Var, in5.s0 s0Var, java.lang.String str) {
        j2Var.getClass();
        if (str == null || str.length() == 0) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(s0Var.f374654e, 2, 2);
        android.content.Context context = s0Var.f374654e;
        z2Var.y(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
        z2Var.F = new on2.i2(z2Var);
        z2Var.x(1);
        z2Var.q(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572072xy));
        com.p314xaae8f345.mm.ui.bk.r0(z2Var.C.getPaint(), 0.8f);
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96, null));
        textView.setText(str);
        z2Var.j(textView);
        z2Var.C();
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570452au2;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.c3 item = (so2.c3) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ir9);
        r45.cz1 cz1Var = item.f491829d;
        textView.setText(cz1Var.m75945x2fec8307(4));
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f567259is5);
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(cz1Var.m75939xb282bd08(6)), zl2.r4.f555483a.H0((r45.xy1) cz1Var.m75936x14adae67(5))};
        android.content.Context context = holder.f374654e;
        textView2.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dqe, objArr));
        ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.is6)).setText(k35.m1.d("yyyy-MM-dd HH:mm", cz1Var.m75939xb282bd08(2)));
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.irz);
        int i19 = item.f491830e ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/FinderLotteryWinnersHeaderConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLotteryWinnerListHeader;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/lottery/FinderLotteryWinnersHeaderConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLotteryWinnerListHeader;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.qlv);
        textView3.setVisibility(!lk5.s.b(context) ? 8 : 0);
        on2.l3.f428499a.f(textView3);
        java.lang.String str = item.f491832g;
        if (str == null || str.length() == 0) {
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.bwy)).setVisibility(8);
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.bwz)).setVisibility(8);
            return;
        }
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Fj(ml2.j1.f409139v, "");
        ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.bwy)).setOnClickListener(new on2.g2(item, this, holder));
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.bwz)).setOnClickListener(new on2.h2(this, holder, item));
        ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.bwy)).setVisibility(0);
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.bwz)).setVisibility(0);
        if (item.f491833h == 1) {
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.bwy)).setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dqg));
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.bwy)).setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77911xe61cad92, null));
        } else {
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.bwy)).setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dqf));
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.bwy)).setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo, null));
        }
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
