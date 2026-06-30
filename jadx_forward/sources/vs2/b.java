package vs2;

/* loaded from: classes2.dex */
public final class b extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570601dn3;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        vs2.a item = (vs2.a) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.cl7);
        android.widget.TextView textView = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.cjm);
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d e17 = g1Var.e();
        r45.m66 m66Var = item.f521404d;
        wo0.c b17 = e17.b(new mn2.q3(m66Var.m75945x2fec8307(0), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), g1Var.h(mn2.f1.B));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        b17.c(imageView);
        java.lang.String string = holder.f374654e.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nyu, java.lang.Integer.valueOf(m66Var.m75939xb282bd08(2)));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        if (textView != null) {
            textView.setText(string);
        }
        if (m66Var.m75939xb282bd08(2) > 0) {
            android.view.View view = holder.f3639x46306858;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/redpacket/FinderRedPacketCoverConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/redpacket/CoverConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/redpacket/FinderRedPacketCoverConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/redpacket/CoverConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        } else {
            android.view.View view2 = holder.f3639x46306858;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(0.3f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/redpacket/FinderRedPacketCoverConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/redpacket/CoverConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/redpacket/FinderRedPacketCoverConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/redpacket/CoverConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (textView == null) {
            return;
        }
        textView.setVisibility(item.f521405e ? 0 : 4);
    }
}
