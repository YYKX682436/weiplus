package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class kr extends com.tencent.mm.plugin.finder.convert.nr {

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.tl f103855g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f103856h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr(com.tencent.mm.plugin.finder.feed.tl contract) {
        super(contract);
        kotlin.jvm.internal.o.g(contract, "contract");
        this.f103855g = contract;
        this.f103856h = jz5.h.b(com.tencent.mm.plugin.finder.convert.jr.f103776d);
    }

    @Override // com.tencent.mm.plugin.finder.convert.nr, in5.r
    public int e() {
        return com.tencent.mm.R.layout.dj_;
    }

    @Override // com.tencent.mm.plugin.finder.convert.nr
    public com.tencent.mm.plugin.finder.feed.tl n() {
        return this.f103855g;
    }

    @Override // com.tencent.mm.plugin.finder.convert.nr, in5.r
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void h(in5.s0 holder, so2.u1 item, int i17, int i18, boolean z17, java.util.List list) {
        boolean z18;
        java.lang.String str;
        boolean z19;
        java.lang.String str2;
        int i19;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.aha);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        com.tencent.mm.ui.fk.a((android.widget.TextView) p17);
        android.view.View p18 = holder.p(com.tencent.mm.R.id.f483374ah5);
        kotlin.jvm.internal.o.f(p18, "getView(...)");
        com.tencent.mm.ui.fk.a((android.widget.TextView) p18);
        android.view.View p19 = holder.p(com.tencent.mm.R.id.qlm);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p19, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderNewStyle2BigCardConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p19.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderNewStyle2BigCardConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.hqt)).setVisibility(0);
        if (((java.lang.Boolean) ((jz5.n) this.f103856h).getValue()).booleanValue()) {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.ah6)).setVisibility(0);
        } else {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.ah6)).setVisibility(8);
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.qgk);
        boolean z27 = true;
        if (item.getFeedObject().showSeeLaterInVideo()) {
            z18 = true;
        } else {
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            z18 = false;
        }
        android.content.Context context = holder.f293121e;
        if (z18) {
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            kotlin.jvm.internal.o.d(viewGroup);
            com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
            com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(context);
            r45.qt2 V6 = e17 != null ? e17.V6() : null;
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(viewGroup, "watch_later_in_feed_card");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("watch_later_");
            com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(context);
            sb6.append(e18 != null ? java.lang.Integer.valueOf(e18.f135380n) : null);
            sb6.append('_');
            com.tencent.mm.plugin.finder.storage.FinderItem feedObject = item.getFeedObject();
            sb6.append(pm0.v.u(feedObject != null ? feedObject.getId() : 0L));
            aVar.tk(viewGroup, sb6.toString());
            aVar.Tj(viewGroup, 24, 1, true);
            aVar.Ai(viewGroup, new vn2.w0(viewGroup, context, item, 0.0f));
            jz5.l[] lVarArr = new jz5.l[3];
            lVarArr[0] = new jz5.l("finder_context_id", V6 != null ? V6.getString(1) : null);
            lVarArr[1] = new jz5.l("finder_tab_context_id", V6 != null ? V6.getString(2) : null);
            com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(context);
            lVarArr[2] = new jz5.l("comment_scene", e19 != null ? java.lang.Integer.valueOf(e19.f135380n) : null);
            aVar.gk(viewGroup, kz5.c1.k(lVarArr));
            viewGroup.setVisibility(0);
            if (((java.util.HashSet) ((jz5.n) ((ey2.g1) pf5.u.f353936a.e(c61.l7.class).a(ey2.g1.class)).f257379h).getValue()).contains(java.lang.Long.valueOf(item.getItemId()))) {
                ((android.widget.ImageView) holder.p(com.tencent.mm.R.id.qwd)).setVisibility(0);
                ((android.widget.TextView) holder.p(com.tencent.mm.R.id.qgl)).setText(com.tencent.mm.R.string.lsz);
                viewGroup.setOnClickListener(new com.tencent.mm.plugin.finder.convert.hr(holder, item, this, i17));
            } else {
                viewGroup.setOnClickListener(new com.tencent.mm.plugin.finder.convert.ir(holder, item, this, i17));
                ((android.widget.ImageView) holder.p(com.tencent.mm.R.id.qwd)).setVisibility(8);
                ((android.widget.TextView) holder.p(com.tencent.mm.R.id.qgl)).setText(com.tencent.mm.R.string.lqi);
            }
        } else {
            viewGroup.setVisibility(8);
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ahb);
        java.lang.String str4 = "";
        if (textView != null) {
            r45.ru2 flow_card_recommand_reason = item.getFeedObject().getFeedObject().getFlow_card_recommand_reason();
            if (flow_card_recommand_reason == null || (str2 = flow_card_recommand_reason.getString(0)) == null) {
                str2 = "";
            }
            r45.ru2 flow_card_recommand_reason2 = item.getFeedObject().getFeedObject().getFlow_card_recommand_reason();
            int integer = flow_card_recommand_reason2 != null ? flow_card_recommand_reason2.getInteger(1) : 0;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(str2);
                if (integer != 3) {
                    if (integer == 4) {
                        i19 = com.tencent.mm.R.color.Indigo_100;
                    } else if (integer == 5) {
                        i19 = com.tencent.mm.R.color.Orange_100;
                    }
                    textView.setTextColor(context.getColor(i19));
                }
                i19 = com.tencent.mm.R.color.Brand_100;
                textView.setTextColor(context.getColor(i19));
            }
        }
        r45.ru2 flow_card_recommand_reason3 = item.getFeedObject().getFeedObject().getFlow_card_recommand_reason();
        if (flow_card_recommand_reason3 == null || (str = flow_card_recommand_reason3.getString(2)) == null) {
            str = "";
        }
        if (str.length() == 0) {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.hqr)).setVisibility(8);
        } else {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.hqr)).setVisibility(0);
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.hqr)).setText(str);
        }
        ya2.g gVar = ya2.h.f460484a;
        java.lang.String str5 = item.getFeedObject().field_username;
        r45.xk bizInfo = item.getFeedObject().getBizInfo();
        if (ya2.g.h(gVar, str5, bizInfo != null ? bizInfo.getString(0) : null, false, false, 12, null)) {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.hqt)).setVisibility(0);
        } else {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.hqt)).setVisibility(8);
        }
        if (!(this.f103855g.f109069d.getIntent().getIntExtra("key_reuqest_scene", 0) == 40)) {
            androidx.appcompat.widget.AppCompatSeekBar appCompatSeekBar = (androidx.appcompat.widget.AppCompatSeekBar) holder.p(com.tencent.mm.R.id.f487542oy0);
            if (appCompatSeekBar == null) {
                return;
            }
            appCompatSeekBar.setVisibility(8);
            return;
        }
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(com.tencent.mm.plugin.finder.storage.FeedData.Companion.a(item).getMediaList());
        if (mb4Var != null) {
            str4 = ds2.h.f242866a.c(item.getItemId(), mb4Var, false).n();
            float f17 = cu2.x.c(cu2.x.f222449a, str4, false, false, false, 14, null).field_playProgress;
            if (f17 <= 0.0f) {
                r45.no2 playhistory_info = item.getFeedObject().getFeedObject().getPlayhistory_info();
                int integer2 = playhistory_info != null ? playhistory_info.getInteger(0) : 0;
                f17 = (integer2 <= 0 || mb4Var.getInteger(3) <= 0) ? 0.0f : (integer2 * 1.0f) / mb4Var.getInteger(3);
            }
            androidx.appcompat.widget.AppCompatSeekBar appCompatSeekBar2 = (androidx.appcompat.widget.AppCompatSeekBar) holder.p(com.tencent.mm.R.id.f487542oy0);
            if (appCompatSeekBar2 != null) {
                appCompatSeekBar2.setProgress(a06.d.b(1000 * f17));
                appCompatSeekBar2.setVisibility(f17 > 0.0f ? 0 : 8);
            }
        } else {
            androidx.appcompat.widget.AppCompatSeekBar appCompatSeekBar3 = (androidx.appcompat.widget.AppCompatSeekBar) holder.p(com.tencent.mm.R.id.f487542oy0);
            if (appCompatSeekBar3 != null) {
                appCompatSeekBar3.setProgress(0);
                appCompatSeekBar3.setVisibility(8);
            }
        }
        java.lang.String str6 = str4;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z19 = true;
        } else {
            java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
            z19 = false;
        }
        if (!z19 && !z65.c.a()) {
            kb2.b bVar = kb2.b.f306225a;
            z27 = false;
        }
        if (z27) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("setPlayProgress cachePlayProgress=");
            sb7.append(cu2.x.c(cu2.x.f222449a, str6, false, false, false, 14, null).field_playProgress);
            sb7.append(",breakPointTimeMs=");
            r45.no2 playhistory_info2 = item.getFeedObject().getFeedObject().getPlayhistory_info();
            sb7.append(playhistory_info2 != null ? java.lang.Integer.valueOf(playhistory_info2.getInteger(0)) : null);
            sb7.append(",videoDuration=");
            sb7.append(mb4Var != null ? java.lang.Integer.valueOf(mb4Var.getInteger(3)) : null);
            com.tencent.mars.xlog.Log.i("FinderNewStyle2BigCardConvert", sb7.toString());
        }
    }
}
