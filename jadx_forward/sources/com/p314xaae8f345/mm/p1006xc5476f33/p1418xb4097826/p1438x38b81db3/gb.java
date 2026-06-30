package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class gb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f185002e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f185003f;

    public gb(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar) {
        this.f185001d = s0Var;
        this.f185002e = abstractC14490x69736cb5;
        this.f185003f = qeVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$onBindViewHolder$onAvatarClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f185001d;
        int m8183xf806b362 = s0Var.m8183xf806b362();
        android.content.Context context = s0Var.f374654e;
        if (m8183xf806b362 == 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            zu2.q qVar = ((zu2.a0) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(zu2.a0.class)).f557227f;
            if (qVar != null) {
                qVar.a();
                qVar.d("headimage");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f185002e;
        if (hc2.g0.f(abstractC14490x69736cb5.getFeedObject().getFeedObject(), s0Var, null)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).tj(abstractC14490x69736cb5, s0Var.m8183xf806b362(), java.lang.String.valueOf(nyVar2 != null ? nyVar2.f216913n : 0));
            if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Ni(s0Var, abstractC14490x69736cb5.mo2128x1ed62e84(), abstractC14490x69736cb5.getFeedObject());
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.t8 t8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe.U;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                t8Var.c((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, abstractC14490x69736cb5, false);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar3 = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Sk(abstractC14490x69736cb5, nyVar3 != null ? nyVar3.V6() : null);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$onBindViewHolder$onAvatarClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe.B(this.f185003f, this.f185001d, 5, false, 0, 8, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar2 = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t0 t0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t0) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t0.class);
        if (t0Var == null || !t0Var.P6(s0Var)) {
            str = "(Landroid/view/View;)V";
            nyVar = null;
        } else {
            java.lang.Object obj = s0Var.f374658i;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hideAccountUpdateInfoTips ");
            str = "(Landroid/view/View;)V";
            if (abstractC14490x69736cb52 != null) {
                nyVar = null;
                str2 = hc2.b0.h(abstractC14490x69736cb52, false, 1, null);
            } else {
                nyVar = null;
                str2 = null;
            }
            sb6.append(str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderAccountUpdateInfoUIC", sb6.toString());
            java.lang.Object findViewById = s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.a8p);
            if (!(findViewById instanceof android.widget.TextView)) {
                findViewById = nyVar;
            }
            android.widget.TextView textView = (android.widget.TextView) findViewById;
            if (textView != null) {
                textView.setMaxLines(t0Var.m80379x76847179().getResources().getInteger(com.p314xaae8f345.mm.R.C30862x74b5813e.f569347x));
            }
            java.lang.Object findViewById2 = s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.g9g);
            if (!(findViewById2 instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22604x4b44d306)) {
                findViewById2 = nyVar;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22604x4b44d306 c22604x4b44d306 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22604x4b44d306) findViewById2;
            if (c22604x4b44d306 != null) {
                c22604x4b44d306.m81270xc0a44a7b(false);
            }
            java.lang.Object findViewById3 = s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.ggt);
            if (!(findViewById3 instanceof android.widget.TextView)) {
                findViewById3 = nyVar;
            }
            android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
            if (textView2 != null) {
                textView2.setVisibility(8);
                textView2.setTag(com.p314xaae8f345.mm.R.id.tb_, java.lang.Boolean.FALSE);
            }
            yz5.l lVar = t0Var.f217487g;
            if (lVar != null) {
                lVar.mo146xb9724478(s0Var);
            }
            java.lang.Object findViewById4 = s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f565884dz5);
            if (!(findViewById4 instanceof android.widget.FrameLayout)) {
                findViewById4 = nyVar;
            }
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById4;
            if (frameLayout != null) {
                frameLayout.requestLayout();
                frameLayout.invalidate();
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar4 = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : nyVar;
        r45.qt2 V6 = nyVar4 != null ? nyVar4.V6() : nyVar;
        if (V6 != null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("feed_avatar", "view_clk", kz5.c1.k(new jz5.l("feed_id", pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84())), new jz5.l("finder_context_id", V6.m75945x2fec8307(1)), new jz5.l("finder_tab_context_id", V6.m75945x2fec8307(2)), new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.m75939xb282bd08(5))), new jz5.l("session_buffer", r26.i0.t(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(abstractC14490x69736cb5.mo2128x1ed62e84(), abstractC14490x69736cb5.w(), V6.m75939xb282bd08(5)), ",", ";", false)), new jz5.l("finder_username", abstractC14490x69736cb5.getFeedObject().m59299x6bf53a6c()), new jz5.l("extra_info", V6.m75945x2fec8307(11))), 1, false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$onBindViewHolder$onAvatarClickListener$1", "android/view/View$OnClickListener", "onClick", str);
    }
}
