package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class l70 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l70(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public final void O6(in5.s0 s0Var) {
        android.view.View view;
        android.view.View findViewById = (s0Var == null || (view = s0Var.f3639x46306858) == null) ? null : view.findViewById(com.p314xaae8f345.mm.R.id.tvl);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSubtitleSettingUIC", "detachSubtitleContainer", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSubtitleSettingUIC", "detachSubtitleContainer", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt ptVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt) pf5.z.f435481a.a(activity).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt.class);
        if (ptVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.C15413x7c45044c X6 = !ptVar.f217139d ? null : ptVar.X6();
            android.view.View findViewById2 = X6 != null ? X6.findViewById(com.p314xaae8f345.mm.R.id.tvl) : null;
            if (findViewById2 == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            android.view.View view2 = findViewById2;
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderOrientationUIC", "hideSubtitleContainer", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderOrientationUIC", "hideSubtitleContainer", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void P6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.C15413x7c45044c X6;
        android.view.View findViewById;
        if (abstractC14490x69736cb5 == null || !abstractC14490x69736cb5.getFeedObject().m59201x2d62da25()) {
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt ptVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt) pf5.z.f435481a.a(activity).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt.class);
        if (ptVar == null || (X6 = ptVar.X6()) == null || (findViewById = X6.findViewById(com.p314xaae8f345.mm.R.id.tvl)) == null) {
            return;
        }
        android.view.View findViewById2 = X6.findViewById(com.p314xaae8f345.mm.R.id.ufv);
        android.view.View findViewById3 = X6.findViewById(com.p314xaae8f345.mm.R.id.ufu);
        int dimensionPixelSize = findViewById.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
        if (findViewById2 != null && findViewById2.isShown()) {
            dimensionPixelSize += findViewById2.getHeight();
        }
        if (findViewById3 != null && findViewById3.isShown()) {
            dimensionPixelSize += findViewById3.getHeight();
        }
        if (dimensionPixelSize > 0) {
            findViewById.getLayoutParams();
            com.p314xaae8f345.mm.ui.kk.d(findViewById, dimensionPixelSize);
        } else {
            findViewById.getLayoutParams();
            com.p314xaae8f345.mm.ui.kk.d(findViewById, findViewById.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs));
        }
        findViewById.requestLayout();
    }

    public final void Q6(in5.s0 s0Var, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.C15413x7c45044c X6;
        android.view.View findViewById;
        android.view.View findViewById2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.C15413x7c45044c X62;
        if (s0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSubtitleSettingUIC", "setSubtitleStatusVisible holder is null");
            return;
        }
        int i17 = z17 ? com.p314xaae8f345.mm.R.raw.f78744x2541c641 : com.p314xaae8f345.mm.R.raw.f78745xab141a43;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90) s0Var.p(com.p314xaae8f345.mm.R.id.ghd);
        android.view.View m61271xb4df69ee = c15178x4303ff90 != null ? c15178x4303ff90.m61271xb4df69ee() : null;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = m61271xb4df69ee instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) m61271xb4df69ee : null;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setImageResource(i17);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt ptVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt) pf5.z.f435481a.a(activity).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt.class);
        android.view.KeyEvent.Callback m62804x7537a6b8 = (ptVar == null || (X62 = ptVar.X6()) == null) ? null : X62.m62804x7537a6b8();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = m62804x7537a6b8 instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) m62804x7537a6b8 : null;
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.setImageResource(i17);
        }
        android.view.View view = s0Var.f3639x46306858;
        if (view != null && (findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.tvl)) != null) {
            int i18 = z17 ? 8 : 0;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSubtitleSettingUIC", "setSubtitleStatusVisible", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSubtitleSettingUIC", "setSubtitleStatusVisible", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt ptVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt) pf5.z.f435481a.a(activity2).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt.class);
        if (ptVar2 == null || (X6 = ptVar2.X6()) == null || (findViewById = X6.findViewById(com.p314xaae8f345.mm.R.id.tvl)) == null) {
            return;
        }
        int i19 = z17 ? 8 : 0;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSubtitleSettingUIC", "setSubtitleStatusVisible", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSubtitleSettingUIC", "setSubtitleStatusVisible", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void R6(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, java.lang.String str, int i17, java.lang.String str2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.ra.class))).V6();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[9];
        java.lang.String m75945x2fec8307 = V6.m75945x2fec8307(2);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        lVarArr[0] = new jz5.l("finder_tab_context_id", m75945x2fec8307);
        java.lang.String m75945x2fec83072 = V6.m75945x2fec8307(1);
        lVarArr[1] = new jz5.l("finder_context_id", m75945x2fec83072 != null ? m75945x2fec83072 : "");
        lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.m75939xb282bd08(5)));
        lVarArr[3] = new jz5.l("feed_id", pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84()));
        lVarArr[4] = new jz5.l("session_buffer", abstractC14490x69736cb5.g0());
        lVarArr[5] = new jz5.l("subtitle_option_cnt", java.lang.Integer.valueOf(i17));
        pf5.z zVar2 = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o70 o70Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o70) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o70.class);
        lVarArr[6] = new jz5.l("current_language", o70Var != null ? o70Var.P6(abstractC14490x69736cb5.mo2128x1ed62e84()) : null);
        lVarArr[7] = new jz5.l("my_finder_username", abstractC14490x69736cb5.getFeedObject().m59299x6bf53a6c());
        lVarArr[8] = new jz5.l("subtitle_language_opt", str2);
        ((cy1.a) rVar).Bj("finder_subtitle_option_page", str, kz5.c1.k(lVarArr), 1, false);
    }

    public final void S6(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        ((cy1.a) rVar).Mj(view);
        cy1.a aVar = (cy1.a) rVar;
        aVar.pk(view, "finder_subtitle_switch");
        aVar.ik(view, 40, 25496);
        aVar.Tj(view, 40, 1, false);
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        aVar.Ai(view, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h70(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.ra.class))).V6(), abstractC14490x69736cb5, this));
    }

    public final void T6(in5.s0 s0Var) {
        char c17;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.n70 n70Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = s0Var != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) s0Var.f374658i : null;
        if (!(abstractC14490x69736cb5 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5)) {
            abstractC14490x69736cb5 = null;
        }
        if (s0Var == null || abstractC14490x69736cb5 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSubtitleSettingUIC", "subtitleSettingClick holder or item is null");
            return;
        }
        long mo2128x1ed62e84 = abstractC14490x69736cb5.mo2128x1ed62e84();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.pl plVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.pl(m80379x76847179(), mo2128x1ed62e84);
        boolean N0 = abstractC14490x69736cb5.N0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.nl nlVar = plVar.f214384d;
        if (N0) {
            java.lang.String string = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o2b);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject = abstractC14490x69736cb5.getFeedObject();
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.tr("self_open_subtitle", string, feedObject != null && feedObject.m59201x2d62da25(), null, 8, null));
            java.lang.String string2 = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o2_);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject2 = abstractC14490x69736cb5.getFeedObject();
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.tr("self_close_subtitle", string2, (feedObject2 == null || feedObject2.m59201x2d62da25()) ? false : true, null, 8, null));
            nlVar.getClass();
            nlVar.f214254e = arrayList;
            nlVar.f214255f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.i70(s0Var, this, arrayList);
        } else {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o70 o70Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o70) pf5.z.f435481a.a(activity).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o70.class);
            if (o70Var == null) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.n70 n70Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.n70) o70Var.f216969d.get(java.lang.Long.valueOf(mo2128x1ed62e84));
            java.util.List<r45.ay2> list = n70Var2 != null ? n70Var2.f216809l : null;
            if (list == null) {
                return;
            }
            for (r45.ay2 ay2Var : list) {
                java.lang.String str = "lang_" + ay2Var.m75945x2fec8307(1);
                java.lang.String m75945x2fec8307 = ay2Var.m75945x2fec8307(1);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.tr(str, m75945x2fec8307, false, kz5.c0.k(ay2Var), 4, null));
            }
            if (arrayList.size() == 2) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("lang_");
                r45.ay2 ay2Var2 = (r45.ay2) kz5.n0.a0(list, 0);
                sb6.append(ay2Var2 != null ? ay2Var2.m75945x2fec8307(1) : null);
                sb6.append('_');
                r45.ay2 ay2Var3 = (r45.ay2) kz5.n0.a0(list, 1);
                sb6.append(ay2Var3 != null ? ay2Var3.m75945x2fec8307(1) : null);
                java.lang.String sb7 = sb6.toString();
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                r45.ay2 ay2Var4 = (r45.ay2) kz5.n0.a0(list, 0);
                sb8.append(ay2Var4 != null ? ay2Var4.m75945x2fec8307(1) : null);
                sb8.append('+');
                r45.ay2 ay2Var5 = (r45.ay2) kz5.n0.a0(list, 1);
                sb8.append(ay2Var5 != null ? ay2Var5.m75945x2fec8307(1) : null);
                java.lang.String sb9 = sb8.toString();
                c17 = '_';
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.tr trVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.tr(sb7, sb9, false, list, 4, null);
                z17 = false;
                arrayList.add(0, trVar);
            } else {
                c17 = '_';
                z17 = false;
            }
            java.lang.String string3 = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o28);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.tr("close_subtitle", string3, false, null, 4, null));
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o70 o70Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o70) pf5.z.f435481a.a(activity2).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o70.class);
            java.util.List list2 = (o70Var2 == null || (n70Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.n70) o70Var2.f216969d.get(java.lang.Long.valueOf(mo2128x1ed62e84))) == null) ? null : n70Var.f216808k;
            java.lang.String str2 = "lang";
            if (list2 != null) {
                java.util.Iterator it = list2.iterator();
                while (it.hasNext()) {
                    str2 = str2 + c17 + ((r45.ay2) it.next()).m75945x2fec8307(1);
                }
            }
            if ((list2 == null || list2.isEmpty()) ? true : z17) {
                str2 = "close_subtitle";
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                java.lang.Object next = it6.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.tr) next).f214681a, str2)) {
                    arrayList2.add(next);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.tr trVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.tr) kz5.n0.Z(arrayList2);
            if (trVar2 != null) {
                trVar2.f214683c = true;
            }
            nlVar.getClass();
            nlVar.f214254e = arrayList;
            nlVar.f214255f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j70(this, abstractC14490x69736cb5, arrayList, mo2128x1ed62e84);
        }
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a4) ((jz5.n) plVar.f214382b).mo141623x754a37bb()).show();
        R6(m80379x76847179(), abstractC14490x69736cb5, "view_exp", arrayList.size(), null);
    }

    public final void U6(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, boolean z17) {
        if (s0Var == null || abstractC14490x69736cb5 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSubtitleSettingUIC", "switchSubtitleStatusBySelf holder or item is null");
            return;
        }
        if (!abstractC14490x69736cb5.N0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSubtitleSettingUIC", "switchSubtitleStatusBySelf error, " + abstractC14490x69736cb5.mo2128x1ed62e84() + " is not self feed ");
            return;
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        hb2.b0 b0Var = hb2.b0.f361558e;
        long mo2128x1ed62e84 = abstractC14490x69736cb5.mo2128x1ed62e84();
        java.lang.String objectNonceId = abstractC14490x69736cb5.getFeedObject().m59276x6c285d75();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.k70 k70Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.k70(z17, this, s0Var, abstractC14490x69736cb5);
        b0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectNonceId, "objectNonceId");
        r45.wh2 wh2Var = new r45.wh2();
        wh2Var.set(0, java.lang.Long.valueOf(mo2128x1ed62e84));
        wh2Var.set(1, 9);
        wh2Var.set(2, java.lang.Integer.valueOf(z17 ? 1 : 0));
        wh2Var.set(3, objectNonceId);
        hb2.w0.m(b0Var, wh2Var, k70Var, false, false, null, null, 60, null);
        V6(s0Var, abstractC14490x69736cb5, z17);
        db5.t7.h(m80379x76847179(), m80379x76847179().getResources().getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.o2a : com.p314xaae8f345.mm.R.C30867xcad56011.o2c));
    }

    public final void V6(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, boolean z17) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        r45.dm2 m76806xdef68064;
        r45.dm2 m76806xdef680642 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76806xdef68064();
        if (m76806xdef680642 != null) {
            if (z17) {
                m76806xdef680642.set(30, java.lang.Long.valueOf(m76806xdef680642.m75942xfb822ef2(30) | 16384));
            } else {
                m76806xdef680642.set(30, java.lang.Long.valueOf(m76806xdef680642.m75942xfb822ef2(30) & (-16385)));
            }
        }
        cq.k kVar = (cq.k) i95.n0.c(cq.k.class);
        long mo2128x1ed62e84 = abstractC14490x69736cb5.mo2128x1ed62e84();
        kVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(mo2128x1ed62e84);
        if (h17 != null && (feedObject = h17.getFeedObject()) != null && (m76806xdef68064 = feedObject.m76806xdef68064()) != null) {
            if (z17) {
                m76806xdef68064.set(30, java.lang.Long.valueOf(m76806xdef68064.m75942xfb822ef2(30) | 16384));
            } else {
                m76806xdef68064.set(30, java.lang.Long.valueOf((-16385) & m76806xdef68064.m75942xfb822ef2(30)));
            }
        }
        Q6(s0Var, z17);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3();
        long mo2128x1ed62e842 = abstractC14490x69736cb5.mo2128x1ed62e84();
        am.ia iaVar = c5445x963cab3.f135785g;
        iaVar.f88451a = mo2128x1ed62e842;
        iaVar.f88452b = 36;
        c5445x963cab3.e();
    }
}
