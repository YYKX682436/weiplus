package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public abstract class yw extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kp f186599e;

    public yw(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kp data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f186599e = data;
    }

    public static final void n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yw ywVar, android.content.Context context, dm.pd pdVar) {
        ywVar.getClass();
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(context);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(context);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dqd, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        y1Var.l(inflate, new android.widget.FrameLayout.LayoutParams(-1, (a17.f278669b * 3) / 4));
        android.widget.TextView textView = (android.widget.TextView) y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.obc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        com.p314xaae8f345.mm.ui.fk.a(textView);
        java.lang.String str = pdVar.f66069xb0606dbe;
        if (str == null || str.length() == 0) {
            int m75939xb282bd08 = pdVar.f66123xabd3e0e0.m75939xb282bd08(2);
            if (m75939xb282bd08 == 2) {
                android.content.res.Resources resources = textView.getContext().getResources();
                java.lang.Object[] objArr = new java.lang.Object[1];
                r45.rg2 rg2Var = pdVar.f66070x5f9d295d;
                objArr[0] = java.lang.Integer.valueOf(rg2Var != null ? rg2Var.m75939xb282bd08(1) : 0);
                java.lang.String string = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mg6, objArr);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(string);
                spannableStringBuilder.append((java.lang.CharSequence) " ");
                android.graphics.drawable.Drawable e17 = com.p314xaae8f345.mm.ui.uk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.raw.f79966x51623d13, textView.getCurrentTextColor());
                e17.setBounds(0, 0, i65.a.b(textView.getContext(), 16), i65.a.b(textView.getContext(), 16));
                spannableStringBuilder.setSpan(new al5.v(e17, 2), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
                spannableStringBuilder.append((java.lang.CharSequence) textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mg7));
                textView.setText(new android.text.SpannableString(spannableStringBuilder));
            } else if (m75939xb282bd08 != 7) {
                android.content.res.Resources resources2 = textView.getContext().getResources();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                r45.rg2 rg2Var2 = pdVar.f66070x5f9d295d;
                objArr2[0] = java.lang.Integer.valueOf(rg2Var2 != null ? rg2Var2.m75939xb282bd08(1) : 0);
                java.lang.String string2 = resources2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mg6, objArr2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                textView.setText(string2);
            } else {
                android.content.res.Resources resources3 = textView.getContext().getResources();
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                r45.rg2 rg2Var3 = pdVar.f66070x5f9d295d;
                objArr3[0] = java.lang.Integer.valueOf(rg2Var3 != null ? rg2Var3.m75939xb282bd08(1) : 0);
                java.lang.String string3 = resources3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mg8, objArr3);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(string3);
                spannableStringBuilder2.append((java.lang.CharSequence) " ");
                android.graphics.drawable.Drawable e18 = com.p314xaae8f345.mm.ui.uk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.raw.f79668x47e8ad96, textView.getCurrentTextColor());
                e18.setBounds(0, 0, i65.a.b(textView.getContext(), 16), i65.a.b(textView.getContext(), 16));
                spannableStringBuilder2.setSpan(new al5.v(e18, 2), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 17);
                textView.setText(new android.text.SpannableString(spannableStringBuilder2));
            }
        } else {
            i95.m c17 = i95.n0.c(zy2.s6.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            java.lang.String field_aggregateTitle = pdVar.f66069xb0606dbe;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_aggregateTitle, "field_aggregateTitle");
            textView.setText(zy2.s6.l6((zy2.s6) c17, field_aggregateTitle, (int) textView.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561207cb), false, null, 0, false, null, 124, null));
        }
        y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.bys).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.sw(y1Var));
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) inflate.findViewById(com.p314xaae8f345.mm.R.id.m6e);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.im7);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa = c22801x87cbdc00.m82555x4905e9fa();
        m82555x4905e9fa.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context, 1, false));
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.convert.FinderSupportAggregatedMsgConvert$showAggregatedMentionList$1$2
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.o();
            }
        }, arrayList, true);
        c22848x6ddd90cf.mo8164xbbdced85(false);
        c22848x6ddd90cf.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.tw(arrayList, ywVar);
        m82555x4905e9fa.mo7960x6cab2c8d(c22848x6ddd90cf);
        android.view.View inflate2 = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570760bs5, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
        c22801x87cbdc00.m82697xe136b7d8(inflate2);
        c22801x87cbdc00.m82690xd3a27e96(false);
        c22801x87cbdc00.m82688x390c1d00(true);
        c22801x87cbdc00.m82683xb165a19d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.vw(ywVar, context, pdVar, h0Var, arrayList, c22801x87cbdc00));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderSupportAggregatedMsgConvert", "showAggregatedMentionList", "(Landroid/content/Context;Lcom/tencent/mm/autogen/table/LocalFinderMention;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/convert/FinderSupportAggregatedMsgConvert", "showAggregatedMentionList", "(Landroid/content/Context;Lcom/tencent/mm/autogen/table/LocalFinderMention;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kp kpVar = ywVar.f186599e;
        new bq.a(kpVar.f185384a, kpVar.f185385b, xy2.c.e(context), pdVar.f66124x65f321b, (com.p314xaae8f345.mm.p2495xc50a8b8b.g) h0Var.f391656d).l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.xw(h0Var, c22801x87cbdc00, findViewById, context, y1Var, arrayList));
        y1Var.s();
    }

    /* renamed from: o */
    public void h(in5.s0 holder, so2.i item, int i17, int i18, boolean z17, java.util.List list) {
        android.widget.ImageView imageView;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        dm.pd pdVar = item.f491944d;
        if (pdVar.u0() && holder.p(com.p314xaae8f345.mm.R.id.knh) != null && holder.p(com.p314xaae8f345.mm.R.id.a_4) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSupportAggregatedMsgConvert", "overlap " + pdVar.v0() + " content " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(pdVar.f66079xad49e234) + " id " + pdVar.f66095xc8a07680 + " time " + pdVar.f66080xac3be4e);
            android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.a_4);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderSupportAggregatedMsgConvert", "refreshAggregatedAvatar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderSupportAggregatedMsgConvert", "refreshAggregatedAvatar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.knh);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderSupportAggregatedMsgConvert", "refreshAggregatedAvatar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderSupportAggregatedMsgConvert", "refreshAggregatedAvatar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            r45.rg2 rg2Var = pdVar.f66070x5f9d295d;
            if (rg2Var != null) {
                int size = rg2Var.m75941xfb821914(0).size();
                mn2.g1 g1Var = mn2.g1.f411508a;
                if (size > 0 && (imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.kng)) != null) {
                    imageView.setAdjustViewBounds(true);
                    imageView.setClipToOutline(true);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) rg2Var.m75941xfb821914(0).get(0);
                    boolean z18 = c19782x23db1cfa != null && com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.f204353a.m(c19782x23db1cfa);
                    android.content.Context context = holder.f374654e;
                    if (z18) {
                        imageView.setOutlineProvider(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ow());
                        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561175bh);
                        imageView.setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
                        g1Var.a().c(new mn2.n(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) rg2Var.m75941xfb821914(0).get(0)).m76175x6d346f39(), null, 2, null), imageView, g1Var.h(mn2.f1.f411493n));
                    } else {
                        imageView.setOutlineProvider(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.pw(holder));
                        int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561175bh);
                        imageView.setPadding(dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2);
                        g1Var.l().c(new mn2.n(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) rg2Var.m75941xfb821914(0).get(0)).m76175x6d346f39(), null, 2, null), imageView, g1Var.h(mn2.f1.f411494o));
                    }
                }
                if (rg2Var.m75941xfb821914(0).size() > 1) {
                    vo0.d l17 = g1Var.l();
                    mn2.n nVar = new mn2.n(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) rg2Var.m75941xfb821914(0).get(1)).m76175x6d346f39(), null, 2, null);
                    android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.knf);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p19, "getView(...)");
                    l17.c(nVar, (android.widget.ImageView) p19, g1Var.h(mn2.f1.f411494o));
                }
            }
        }
        android.view.View p27 = holder.p(com.p314xaae8f345.mm.R.id.f565796rk2);
        if (p27 == null) {
            return;
        }
        android.view.View p28 = holder.p(com.p314xaae8f345.mm.R.id.knh);
        if (!pdVar.u0()) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p27, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderSupportAggregatedMsgConvert", "refreshExpandAggregatedBtn", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderSupportAggregatedMsgConvert", "refreshExpandAggregatedBtn", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(p27, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderSupportAggregatedMsgConvert", "refreshExpandAggregatedBtn", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p27.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderSupportAggregatedMsgConvert", "refreshExpandAggregatedBtn", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p27.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qw(this, holder, item));
        p28.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rw(this, holder, item));
    }
}
