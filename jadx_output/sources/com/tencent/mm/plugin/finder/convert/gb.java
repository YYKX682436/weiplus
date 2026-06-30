package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class gb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f103469e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f103470f;

    public gb(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.convert.qe qeVar) {
        this.f103468d = s0Var;
        this.f103469e = baseFinderFeed;
        this.f103470f = qeVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$onBindViewHolder$onAvatarClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f103468d;
        int adapterPosition = s0Var.getAdapterPosition();
        android.content.Context context = s0Var.f293121e;
        if (adapterPosition == 0) {
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            zu2.q qVar = ((zu2.a0) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(zu2.a0.class)).f475694f;
            if (qVar != null) {
                qVar.a();
                qVar.d("headimage");
            }
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f103469e;
        if (hc2.g0.f(baseFinderFeed.getFeedObject().getFeedObject(), s0Var, null)) {
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).tj(baseFinderFeed, s0Var.getAdapterPosition(), java.lang.String.valueOf(nyVar2 != null ? nyVar2.f135380n : 0));
            if (context instanceof com.tencent.mm.ui.MMActivity) {
                ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Ni(s0Var, baseFinderFeed.getItemId(), baseFinderFeed.getFeedObject());
                com.tencent.mm.plugin.finder.convert.t8 t8Var = com.tencent.mm.plugin.finder.convert.qe.U;
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                t8Var.c((com.tencent.mm.ui.MMActivity) context, baseFinderFeed, false);
            }
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar3 = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Sk(baseFinderFeed, nyVar3 != null ? nyVar3.V6() : null);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$onBindViewHolder$onAvatarClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.finder.convert.qe.B(this.f103470f, this.f103468d, 5, false, 0, 8, null);
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.t0 t0Var = (com.tencent.mm.plugin.finder.viewmodel.component.t0) zVar2.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.t0.class);
        if (t0Var == null || !t0Var.P6(s0Var)) {
            str = "(Landroid/view/View;)V";
            nyVar = null;
        } else {
            java.lang.Object obj = s0Var.f293125i;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hideAccountUpdateInfoTips ");
            str = "(Landroid/view/View;)V";
            if (baseFinderFeed2 != null) {
                nyVar = null;
                str2 = hc2.b0.h(baseFinderFeed2, false, 1, null);
            } else {
                nyVar = null;
                str2 = null;
            }
            sb6.append(str2);
            com.tencent.mars.xlog.Log.i("Finder.FinderAccountUpdateInfoUIC", sb6.toString());
            java.lang.Object findViewById = s0Var.itemView.findViewById(com.tencent.mm.R.id.a8p);
            if (!(findViewById instanceof android.widget.TextView)) {
                findViewById = nyVar;
            }
            android.widget.TextView textView = (android.widget.TextView) findViewById;
            if (textView != null) {
                textView.setMaxLines(t0Var.getContext().getResources().getInteger(com.tencent.mm.R.integer.f487814x));
            }
            java.lang.Object findViewById2 = s0Var.itemView.findViewById(com.tencent.mm.R.id.g9g);
            if (!(findViewById2 instanceof com.tencent.mm.ui.widget.FlowTextMixView)) {
                findViewById2 = nyVar;
            }
            com.tencent.mm.ui.widget.FlowTextMixView flowTextMixView = (com.tencent.mm.ui.widget.FlowTextMixView) findViewById2;
            if (flowTextMixView != null) {
                flowTextMixView.setOneLineMode(false);
            }
            java.lang.Object findViewById3 = s0Var.itemView.findViewById(com.tencent.mm.R.id.ggt);
            if (!(findViewById3 instanceof android.widget.TextView)) {
                findViewById3 = nyVar;
            }
            android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
            if (textView2 != null) {
                textView2.setVisibility(8);
                textView2.setTag(com.tencent.mm.R.id.tb_, java.lang.Boolean.FALSE);
            }
            yz5.l lVar = t0Var.f135954g;
            if (lVar != null) {
                lVar.invoke(s0Var);
            }
            java.lang.Object findViewById4 = s0Var.itemView.findViewById(com.tencent.mm.R.id.f484351dz5);
            if (!(findViewById4 instanceof android.widget.FrameLayout)) {
                findViewById4 = nyVar;
            }
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById4;
            if (frameLayout != null) {
                frameLayout.requestLayout();
                frameLayout.invalidate();
            }
        }
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar4 = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar2.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : nyVar;
        r45.qt2 V6 = nyVar4 != null ? nyVar4.V6() : nyVar;
        if (V6 != null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("feed_avatar", "view_clk", kz5.c1.k(new jz5.l("feed_id", pm0.v.u(baseFinderFeed.getItemId())), new jz5.l("finder_context_id", V6.getString(1)), new jz5.l("finder_tab_context_id", V6.getString(2)), new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.getInteger(5))), new jz5.l("session_buffer", r26.i0.t(((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(baseFinderFeed.getItemId(), baseFinderFeed.w(), V6.getInteger(5)), ",", ";", false)), new jz5.l("finder_username", baseFinderFeed.getFeedObject().getUserName()), new jz5.l("extra_info", V6.getString(11))), 1, false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$onBindViewHolder$onAvatarClickListener$1", "android/view/View$OnClickListener", "onClick", str);
    }
}
