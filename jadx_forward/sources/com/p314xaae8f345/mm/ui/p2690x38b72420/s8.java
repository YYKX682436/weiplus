package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes.dex */
public final class s8 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2690x38b72420.u8 f288708e;

    public s8(com.p314xaae8f345.mm.ui.p2690x38b72420.u8 u8Var) {
        this.f288708e = u8Var;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ccj;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.w8 w8Var;
        android.view.View view;
        android.widget.ImageView imageView;
        int i19;
        com.p314xaae8f345.mm.ui.p2690x38b72420.v8 item = (com.p314xaae8f345.mm.ui.p2690x38b72420.v8) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ou7);
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.a9o);
        android.widget.ImageView imageView3 = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.sg8);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) holder.p(com.p314xaae8f345.mm.R.id.mht);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.f568329v22);
        android.widget.Button button = (android.widget.Button) holder.p(com.p314xaae8f345.mm.R.id.f568328v21);
        com.p314xaae8f345.mm.ui.p2690x38b72420.w8 w8Var2 = item.f288753d;
        java.lang.String str = w8Var2.f288764a;
        java.lang.String str2 = w8Var2.f288765b;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.spk);
        if (i18 == 1) {
            android.view.ViewGroup.LayoutParams layoutParams = holder.f3639x46306858.getLayoutParams();
            if (w8Var2.f288767d) {
                android.view.View view2 = holder.f3639x46306858;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/contact/RecentForwardConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/contact/RecentForwardItemConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/contact/RecentForwardConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/contact/RecentForwardItemConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                layoutParams.height = 0;
                layoutParams.width = 0;
            } else {
                android.view.View view3 = holder.f3639x46306858;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/ui/contact/RecentForwardConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/contact/RecentForwardItemConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/ui/contact/RecentForwardConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/contact/RecentForwardItemConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                checkBox.setVisibility(8);
                textView.setVisibility(8);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(p17, arrayList3.toArray(), "com/tencent/mm/ui/contact/RecentForwardConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/contact/RecentForwardItemConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/ui/contact/RecentForwardConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/contact/RecentForwardItemConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (w8Var2.f288768e) {
                    imageView2.setVisibility(8);
                    button.setVisibility(0);
                    button.setOnClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.p8(this));
                    button.setTextSize(1, 14 * java.lang.Math.min(1.125f, i65.a.q(holder.f3639x46306858.getContext())));
                } else {
                    imageView2.setVisibility(0);
                    button.setVisibility(8);
                    imageView2.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562487g9);
                }
                layoutParams.height = -2;
                layoutParams.width = -2;
            }
            holder.f3639x46306858.setLayoutParams(layoutParams);
            return;
        }
        textView.setText(str2);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            imageView = imageView3;
            i19 = 0;
            w8Var = w8Var2;
            view = p17;
            ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).ij(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, textView, str2, n17.Q0(), n17.G0(), (int) textView.getTextSize());
        } else {
            w8Var = w8Var2;
            view = p17;
            imageView = imageView3;
            i19 = 0;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView2, str, null);
        if (c01.e2.R(str)) {
            android.graphics.drawable.Drawable drawable = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80791xd2795aeb);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(drawable, "getDrawable(...)");
            drawable.setBounds(i19, i19, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            textView.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, drawable, (android.graphics.drawable.Drawable) null);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        }
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).wi(textView, str, i65.a.h(holder.f374654e, com.p314xaae8f345.mm.R.C30860x5b28f31.f561224cq));
        com.p314xaae8f345.mm.ui.p2690x38b72420.w8 w8Var3 = w8Var;
        checkBox.setVisibility((!w8Var3.f288767d || w8Var3.f288768e) ? 8 : i19);
        checkBox.setChecked(w8Var3.f288766c);
        if (checkBox.isChecked() && j65.e.b() && com.p314xaae8f345.mm.ui.bk.C()) {
            checkBox.setBackgroundResource(com.p314xaae8f345.mm.R.raw.f78839x3e804f8b);
        }
        int i27 = w8Var3.f288768e ? i19 : 8;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList4.add(java.lang.Integer.valueOf(i27));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/ui/contact/RecentForwardConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/contact/RecentForwardItemConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = view;
        view4.setVisibility(((java.lang.Integer) arrayList4.get(i19)).intValue());
        yj0.a.f(view4, "com/tencent/mm/ui/contact/RecentForwardConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/contact/RecentForwardItemConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setOnClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.q8(this, i17, item));
        vh0.i2 i2Var = (vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class));
        java.lang.String str3 = w8Var3.f288764a;
        if (i2Var.Di(str3)) {
            c22699x3dcdb352.setVisibility(i19);
        } else {
            c22699x3dcdb352.setVisibility(8);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecentForwardConverter", "onBindViewHolder: displayName :" + w8Var3.f288765b + "  contactUserName:" + str3 + " isSelected:" + w8Var3.f288766c + ' ');
        holder.f3639x46306858.setOnTouchListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.r8(imageView));
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
