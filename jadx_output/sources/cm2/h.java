package cm2;

/* loaded from: classes3.dex */
public final class h extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f43347e;

    public h(yz5.l lVar) {
        this.f43347e = lVar;
    }

    @Override // in5.r
    public in5.s0 d(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View convertView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(convertView, "convertView");
        android.view.ViewGroup.LayoutParams layoutParams = convertView.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = (int) recyclerView.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479672c9);
        convertView.setLayoutParams(marginLayoutParams);
        return new cm2.f(convertView);
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.doa;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        cm2.e item = (cm2.e) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        if (holder instanceof cm2.f) {
            int integer = g92.b.f269769e.k2().getInteger(4);
            r45.of1 of1Var = item.f43336d;
            of1Var.getInteger(2);
            cm2.f fVar = (cm2.f) holder;
            android.widget.ImageView imageView = fVar.f43338n;
            if (imageView != null) {
                mn2.y.a(imageView, of1Var.getString(1), of1Var.getInteger(2) == 3);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            gm2.c1 c1Var = gm2.c1.f273320a;
            r45.xn1 xn1Var = (r45.xn1) of1Var.getCustom(6);
            android.text.style.ImageSpan n17 = gm2.c1.n(c1Var, xn1Var != null ? xn1Var.getList(11) : null, null, 2, null);
            if (n17 != null) {
                arrayList.add(n17);
            }
            android.content.Context context = holder.itemView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.lang.String string = of1Var.getString(0);
            if (string == null) {
                string = "";
            }
            fVar.f43339o.setText(c1Var.q(context, string, arrayList, false));
            java.lang.String g17 = zl2.r4.f473950a.g1(of1Var.getInteger(2));
            android.widget.TextView textView = fVar.f43340p;
            textView.setText(g17);
            java.lang.CharSequence text = textView.getText();
            kotlin.jvm.internal.o.f(text, "getText(...)");
            int i19 = r26.n0.N(text) ^ true ? 0 : 8;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(textView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/convert/FinderLiveSwitchRoleConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/view/convert/FinderLiveAliasInfoConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/view/convert/FinderLiveSwitchRoleConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/view/convert/FinderLiveAliasInfoConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view = fVar.f43341q;
            kotlin.jvm.internal.o.f(view, "<get-currentRole>(...)");
            int i27 = of1Var.getInteger(2) == integer ? 0 : 8;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Integer.valueOf(i27));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/view/convert/FinderLiveSwitchRoleConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/view/convert/FinderLiveAliasInfoConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/convert/FinderLiveSwitchRoleConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/view/convert/FinderLiveAliasInfoConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            holder.itemView.setOnClickListener(new cm2.g(of1Var, integer, this));
        }
    }
}
