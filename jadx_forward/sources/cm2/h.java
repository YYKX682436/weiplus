package cm2;

/* loaded from: classes3.dex */
public final class h extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f124880e;

    public h(yz5.l lVar) {
        this.f124880e = lVar;
    }

    @Override // in5.r
    public in5.s0 d(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, android.view.View convertView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(convertView, "convertView");
        android.view.ViewGroup.LayoutParams layoutParams = convertView.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = (int) recyclerView.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        convertView.setLayoutParams(marginLayoutParams);
        return new cm2.f(convertView);
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.doa;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        cm2.e item = (cm2.e) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if (holder instanceof cm2.f) {
            int m75939xb282bd08 = g92.b.f351302e.k2().m75939xb282bd08(4);
            r45.of1 of1Var = item.f124869d;
            of1Var.m75939xb282bd08(2);
            cm2.f fVar = (cm2.f) holder;
            android.widget.ImageView imageView = fVar.f124871n;
            if (imageView != null) {
                mn2.y.a(imageView, of1Var.m75945x2fec8307(1), of1Var.m75939xb282bd08(2) == 3);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            gm2.c1 c1Var = gm2.c1.f354853a;
            r45.xn1 xn1Var = (r45.xn1) of1Var.m75936x14adae67(6);
            android.text.style.ImageSpan n17 = gm2.c1.n(c1Var, xn1Var != null ? xn1Var.m75941xfb821914(11) : null, null, 2, null);
            if (n17 != null) {
                arrayList.add(n17);
            }
            android.content.Context context = holder.f3639x46306858.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            java.lang.String m75945x2fec8307 = of1Var.m75945x2fec8307(0);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            fVar.f124872o.setText(c1Var.q(context, m75945x2fec8307, arrayList, false));
            java.lang.String g17 = zl2.r4.f555483a.g1(of1Var.m75939xb282bd08(2));
            android.widget.TextView textView = fVar.f124873p;
            textView.setText(g17);
            java.lang.CharSequence text = textView.getText();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text, "getText(...)");
            int i19 = r26.n0.N(text) ^ true ? 0 : 8;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(textView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/convert/FinderLiveSwitchRoleConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/view/convert/FinderLiveAliasInfoConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/view/convert/FinderLiveSwitchRoleConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/view/convert/FinderLiveAliasInfoConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view = fVar.f124874q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view, "<get-currentRole>(...)");
            int i27 = of1Var.m75939xb282bd08(2) == m75939xb282bd08 ? 0 : 8;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Integer.valueOf(i27));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/view/convert/FinderLiveSwitchRoleConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/view/convert/FinderLiveAliasInfoConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/convert/FinderLiveSwitchRoleConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/view/convert/FinderLiveAliasInfoConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            holder.f3639x46306858.setOnClickListener(new cm2.g(of1Var, m75939xb282bd08, this));
        }
    }
}
