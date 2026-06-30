package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public abstract class yw extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.convert.kp f105066e;

    public yw(int i17, com.tencent.mm.plugin.finder.convert.kp data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f105066e = data;
    }

    public static final void n(com.tencent.mm.plugin.finder.convert.yw ywVar, android.content.Context context, dm.pd pdVar) {
        ywVar.getClass();
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(context);
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(context);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dqd, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        y1Var.l(inflate, new android.widget.FrameLayout.LayoutParams(-1, (a17.f197136b * 3) / 4));
        android.widget.TextView textView = (android.widget.TextView) y1Var.f212027f.findViewById(com.tencent.mm.R.id.obc);
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.fk.a(textView);
        java.lang.String str = pdVar.field_aggregateTitle;
        if (str == null || str.length() == 0) {
            int integer = pdVar.field_svrMention.getInteger(2);
            if (integer == 2) {
                android.content.res.Resources resources = textView.getContext().getResources();
                java.lang.Object[] objArr = new java.lang.Object[1];
                r45.rg2 rg2Var = pdVar.field_aggregatedContacts;
                objArr[0] = java.lang.Integer.valueOf(rg2Var != null ? rg2Var.getInteger(1) : 0);
                java.lang.String string = resources.getString(com.tencent.mm.R.string.mg6, objArr);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(string);
                spannableStringBuilder.append((java.lang.CharSequence) " ");
                android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.raw.icons_good_detail_outlined, textView.getCurrentTextColor());
                e17.setBounds(0, 0, i65.a.b(textView.getContext(), 16), i65.a.b(textView.getContext(), 16));
                spannableStringBuilder.setSpan(new al5.v(e17, 2), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
                spannableStringBuilder.append((java.lang.CharSequence) textView.getContext().getResources().getString(com.tencent.mm.R.string.mg7));
                textView.setText(new android.text.SpannableString(spannableStringBuilder));
            } else if (integer != 7) {
                android.content.res.Resources resources2 = textView.getContext().getResources();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                r45.rg2 rg2Var2 = pdVar.field_aggregatedContacts;
                objArr2[0] = java.lang.Integer.valueOf(rg2Var2 != null ? rg2Var2.getInteger(1) : 0);
                java.lang.String string2 = resources2.getString(com.tencent.mm.R.string.mg6, objArr2);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                textView.setText(string2);
            } else {
                android.content.res.Resources resources3 = textView.getContext().getResources();
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                r45.rg2 rg2Var3 = pdVar.field_aggregatedContacts;
                objArr3[0] = java.lang.Integer.valueOf(rg2Var3 != null ? rg2Var3.getInteger(1) : 0);
                java.lang.String string3 = resources3.getString(com.tencent.mm.R.string.mg8, objArr3);
                kotlin.jvm.internal.o.f(string3, "getString(...)");
                android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(string3);
                spannableStringBuilder2.append((java.lang.CharSequence) " ");
                android.graphics.drawable.Drawable e18 = com.tencent.mm.ui.uk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.raw.icons_filled_channels_like_bold, textView.getCurrentTextColor());
                e18.setBounds(0, 0, i65.a.b(textView.getContext(), 16), i65.a.b(textView.getContext(), 16));
                spannableStringBuilder2.setSpan(new al5.v(e18, 2), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 17);
                textView.setText(new android.text.SpannableString(spannableStringBuilder2));
            }
        } else {
            i95.m c17 = i95.n0.c(zy2.s6.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            java.lang.String field_aggregateTitle = pdVar.field_aggregateTitle;
            kotlin.jvm.internal.o.f(field_aggregateTitle, "field_aggregateTitle");
            textView.setText(zy2.s6.l6((zy2.s6) c17, field_aggregateTitle, (int) textView.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479674cb), false, null, 0, false, null, 124, null));
        }
        y1Var.f212027f.findViewById(com.tencent.mm.R.id.bys).setOnClickListener(new com.tencent.mm.plugin.finder.convert.sw(y1Var));
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) inflate.findViewById(com.tencent.mm.R.id.m6e);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.im7);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.recyclerview.widget.RecyclerView recyclerView = refreshLoadMoreLayout.getRecyclerView();
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context, 1, false));
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.convert.FinderSupportAggregatedMsgConvert$showAggregatedMentionList$1$2
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new com.tencent.mm.plugin.finder.convert.o();
            }
        }, arrayList, true);
        wxRecyclerAdapter.setHasStableIds(false);
        wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.convert.tw(arrayList, ywVar);
        recyclerView.setAdapter(wxRecyclerAdapter);
        android.view.View inflate2 = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f489227bs5, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
        refreshLoadMoreLayout.setLoadMoreFooter(inflate2);
        refreshLoadMoreLayout.setEnableRefresh(false);
        refreshLoadMoreLayout.setEnableLoadMore(true);
        refreshLoadMoreLayout.setActionCallback(new com.tencent.mm.plugin.finder.convert.vw(ywVar, context, pdVar, h0Var, arrayList, refreshLoadMoreLayout));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderSupportAggregatedMsgConvert", "showAggregatedMentionList", "(Landroid/content/Context;Lcom/tencent/mm/autogen/table/LocalFinderMention;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/convert/FinderSupportAggregatedMsgConvert", "showAggregatedMentionList", "(Landroid/content/Context;Lcom/tencent/mm/autogen/table/LocalFinderMention;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.finder.convert.kp kpVar = ywVar.f105066e;
        new bq.a(kpVar.f103851a, kpVar.f103852b, xy2.c.e(context), pdVar.field_svrMentionId, (com.tencent.mm.protobuf.g) h0Var.f310123d).l().K(new com.tencent.mm.plugin.finder.convert.xw(h0Var, refreshLoadMoreLayout, findViewById, context, y1Var, arrayList));
        y1Var.s();
    }

    /* renamed from: o */
    public void h(in5.s0 holder, so2.i item, int i17, int i18, boolean z17, java.util.List list) {
        android.widget.ImageView imageView;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        dm.pd pdVar = item.f410411d;
        if (pdVar.u0() && holder.p(com.tencent.mm.R.id.knh) != null && holder.p(com.tencent.mm.R.id.a_4) != null) {
            com.tencent.mars.xlog.Log.i("FinderSupportAggregatedMsgConvert", "overlap " + pdVar.v0() + " content " + com.tencent.mm.sdk.platformtools.t8.G1(pdVar.field_content) + " id " + pdVar.field_id + " time " + pdVar.field_createTime);
            android.view.View p17 = holder.p(com.tencent.mm.R.id.a_4);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderSupportAggregatedMsgConvert", "refreshAggregatedAvatar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderSupportAggregatedMsgConvert", "refreshAggregatedAvatar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View p18 = holder.p(com.tencent.mm.R.id.knh);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderSupportAggregatedMsgConvert", "refreshAggregatedAvatar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderSupportAggregatedMsgConvert", "refreshAggregatedAvatar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            r45.rg2 rg2Var = pdVar.field_aggregatedContacts;
            if (rg2Var != null) {
                int size = rg2Var.getList(0).size();
                mn2.g1 g1Var = mn2.g1.f329975a;
                if (size > 0 && (imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.kng)) != null) {
                    imageView.setAdjustViewBounds(true);
                    imageView.setClipToOutline(true);
                    com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) rg2Var.getList(0).get(0);
                    boolean z18 = finderContact != null && com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a.m(finderContact);
                    android.content.Context context = holder.f293121e;
                    if (z18) {
                        imageView.setOutlineProvider(new com.tencent.mm.plugin.finder.convert.ow());
                        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479642bh);
                        imageView.setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
                        g1Var.a().c(new mn2.n(((com.tencent.mm.protocal.protobuf.FinderContact) rg2Var.getList(0).get(0)).getHeadUrl(), null, 2, null), imageView, g1Var.h(mn2.f1.f329960n));
                    } else {
                        imageView.setOutlineProvider(new com.tencent.mm.plugin.finder.convert.pw(holder));
                        int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479642bh);
                        imageView.setPadding(dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2);
                        g1Var.l().c(new mn2.n(((com.tencent.mm.protocal.protobuf.FinderContact) rg2Var.getList(0).get(0)).getHeadUrl(), null, 2, null), imageView, g1Var.h(mn2.f1.f329961o));
                    }
                }
                if (rg2Var.getList(0).size() > 1) {
                    vo0.d l17 = g1Var.l();
                    mn2.n nVar = new mn2.n(((com.tencent.mm.protocal.protobuf.FinderContact) rg2Var.getList(0).get(1)).getHeadUrl(), null, 2, null);
                    android.view.View p19 = holder.p(com.tencent.mm.R.id.knf);
                    kotlin.jvm.internal.o.f(p19, "getView(...)");
                    l17.c(nVar, (android.widget.ImageView) p19, g1Var.h(mn2.f1.f329961o));
                }
            }
        }
        android.view.View p27 = holder.p(com.tencent.mm.R.id.f484263rk2);
        if (p27 == null) {
            return;
        }
        android.view.View p28 = holder.p(com.tencent.mm.R.id.knh);
        if (!pdVar.u0()) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p27, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderSupportAggregatedMsgConvert", "refreshExpandAggregatedBtn", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderSupportAggregatedMsgConvert", "refreshExpandAggregatedBtn", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(p27, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderSupportAggregatedMsgConvert", "refreshExpandAggregatedBtn", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p27.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderSupportAggregatedMsgConvert", "refreshExpandAggregatedBtn", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p27.setOnClickListener(new com.tencent.mm.plugin.finder.convert.qw(this, holder, item));
        p28.setOnClickListener(new com.tencent.mm.plugin.finder.convert.rw(this, holder, item));
    }
}
