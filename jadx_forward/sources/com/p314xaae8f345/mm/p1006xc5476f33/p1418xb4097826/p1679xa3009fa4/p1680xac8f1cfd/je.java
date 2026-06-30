package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class je extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ee implements zy2.h7 {

    /* renamed from: n, reason: collision with root package name */
    public final so2.c f216391n;

    /* renamed from: o, reason: collision with root package name */
    public r45.u25 f216392o;

    /* renamed from: p, reason: collision with root package name */
    public int f216393p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashSet f216394q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f216391n = so2.c.f491811e;
        this.f216393p = com.p314xaae8f345.mm.ui.bh.a(m80379x76847179()).f278668a;
        this.f216394q = new java.util.HashSet();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public android.view.View R6(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.g1n);
        if (p17 != null) {
            return p17;
        }
        android.view.ViewStub viewStub = (android.view.ViewStub) holder.p(com.p314xaae8f345.mm.R.id.g1o);
        return viewStub != null ? viewStub.inflate() : null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public so2.c S6() {
        return this.f216391n;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ee
    public void g7(in5.s0 holder) {
        android.view.View R6;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.g7(holder);
        java.lang.Object obj = holder.f374658i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
        if (abstractC14490x69736cb5 != null && hc2.b0.a(abstractC14490x69736cb5)) {
            android.content.Context context = holder.f374654e;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
            if (abstractActivityC21394xb3d2c0cf == null || (R6 = R6(holder)) == null) {
                return;
            }
            gs2.c cVar = gs2.c.f356605a;
            int hashCode = holder.hashCode();
            gs2.a aVar = gs2.a.f356598x;
            if (!cVar.c(hashCode, aVar) || ((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.K0().r()).booleanValue()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(R6, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneBubbleUIC", "onBindView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                R6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(R6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneBubbleUIC", "onBindView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LAST_REMIND_TIME_LONG_SYNC, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.kmh);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
            com.p314xaae8f345.mm.ui.fk.a(textView);
            android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.f568221m53);
            java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f2b);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(R6, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneBubbleUIC", "onBindView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            R6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(R6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneBubbleUIC", "onBindView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            h0Var.f391656d = "";
            pm0.v.y(((xc2.k0) ((jz5.n) this.f215802i).mo141623x754a37bb()).c7(abstractC14490x69736cb5.mo2128x1ed62e84()), abstractActivityC21394xb3d2c0cf, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fe(this, textView, h0Var, R6, p17, abstractC14490x69736cb5, string));
            android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.mnj);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
            com.p314xaae8f345.mm.ui.fk.a(textView2);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.f568219m51);
            android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.f568218m50);
            p18.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.he(this, abstractC14490x69736cb5, holder));
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y5.f184249a.b(abstractC14490x69736cb5)) {
                c22699x3dcdb352.setVisibility(0);
                textView2.setText(m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f2c));
                p18.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563184z7);
                textView2.setTextColor(m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
                i17 = 8;
            } else {
                i17 = 8;
                c22699x3dcdb352.setVisibility(8);
                textView2.setText(m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f48));
                textView2.setTextColor(m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
                p18.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563184z7);
            }
            android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.m58);
            java.lang.String o17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.o(abstractC14490x69736cb5.getFeedObject().f66937x27cd822a.m76826xb1bffb28(), false);
            if (abstractC14490x69736cb5.getFeedObject().f66937x27cd822a.m76826xb1bffb28() >= 1) {
                textView3.setVisibility(0);
            } else {
                textView3.setVisibility(i17);
            }
            textView3.setTextSize(0, m80379x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561321f9));
            textView3.setText(m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f2a, o17));
            ym5.a1.h(R6, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ie(this, abstractC14490x69736cb5));
            cVar.e(holder, R6, aVar, false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onConfigurationChanged */
    public void mo2276x50e1c15d(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.mo2276x50e1c15d(newConfig);
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(m80379x76847179());
        int i17 = this.f216393p;
        int i18 = a17.f278668a;
        if (i18 != i17) {
            this.f216393p = i18;
            double d17 = i18 * 0.6d;
            for (android.view.View view : this.f216394q) {
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (e7(view) > d17) {
                    layoutParams.width = (int) d17;
                } else {
                    layoutParams.width = -2;
                }
                view.setLayoutParams(layoutParams);
                view.requestLayout();
            }
        }
    }
}
