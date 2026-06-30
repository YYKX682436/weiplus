package pk2;

/* loaded from: classes3.dex */
public final class sa extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437780h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437781i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f437782j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437780h = helper.E;
        this.f437781i = "audience.more.morefunction";
        this.f437782j = kz5.c0.k(new pk2.za(helper, i17), new pk2.pa(helper, i17), new pk2.da(helper, i17), new pk2.y9(helper, i17), new pk2.xa(helper, i17));
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        D(false, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    public final void D(boolean z17, java.lang.Integer num) {
        pk2.da daVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var2;
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var5;
        pk2.f8 f8Var = pk2.f8.f437280a;
        f8Var.c(4, 2, null);
        pk2.o9 o9Var = this.f445960a;
        pk2.d9 d9Var = o9Var.f437615f;
        if (d9Var != null) {
            d9Var.f437196f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3(o9Var.f437611d);
        }
        pk2.d9 d9Var2 = o9Var.f437615f;
        if (d9Var2 != null && (e3Var5 = d9Var2.f437196f) != null) {
            e3Var5.f(com.p314xaae8f345.mm.R.C30864xbddafb2a.b17);
            android.view.View view2 = e3Var5.f213492f;
            android.view.View findViewById = view2.findViewById(com.p314xaae8f345.mm.R.id.jrn);
            findViewById.setContentDescription(findViewById.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dkw));
            findViewById.setOnClickListener(new pk2.qa(e3Var5, o9Var));
            android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.odf);
            if (textView != null) {
                com.p314xaae8f345.mm.ui.fk.a(textView);
            }
            e3Var5.c(true);
            e3Var5.b();
        }
        java.util.List<qk2.f> list = this.f437782j;
        if (d9Var2 != null && (e3Var4 = d9Var2.f437196f) != null) {
            for (qk2.f fVar : list) {
                qk2.d dVar = fVar instanceof qk2.d ? (qk2.d) fVar : null;
                if (dVar != null) {
                    dVar.r(e3Var4, num);
                }
            }
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                daVar = it.next();
                if (((qk2.f) daVar) instanceof pk2.da) {
                    break;
                }
            } else {
                daVar = 0;
                break;
            }
        }
        pk2.da daVar2 = daVar instanceof pk2.da ? daVar : null;
        if (daVar2 != null) {
            daVar2.f437215j = z17;
        }
        if (d9Var2 != null && (e3Var3 = d9Var2.f437196f) != null) {
            e3Var3.f213501r = new pk2.ra(this);
        }
        if (d9Var2 != null && (e3Var2 = d9Var2.f437196f) != null && (view = e3Var2.f213492f) != null) {
            android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.f565557cq5);
            android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.cq6);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) view.findViewById(com.p314xaae8f345.mm.R.id.ntg);
            if (((mm2.j2) o9Var.c(mm2.j2.class)).R6()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/DanmakuCustomerSwitchKt", "addDanmakuCustomerSwitchOption", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/moreaction/DanmakuCustomerSwitchKt", "addDanmakuCustomerSwitchOption", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/DanmakuCustomerSwitchKt", "addDanmakuCustomerSwitchOption", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/moreaction/DanmakuCustomerSwitchKt", "addDanmakuCustomerSwitchOption", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(((java.lang.Boolean) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.j2) o9Var.c(mm2.j2.class)).f410702q).mo144003x754a37bb()).booleanValue());
                pk2.f8.d(f8Var, 4, 0, 4, 1, null, 16, null);
                viewOnClickListenerC22631x1cc07cc8.m81396xb3e0a10a(new pk2.r6(o9Var));
            } else {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/DanmakuCustomerSwitchKt", "addDanmakuCustomerSwitchOption", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/moreaction/DanmakuCustomerSwitchKt", "addDanmakuCustomerSwitchOption", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/DanmakuCustomerSwitchKt", "addDanmakuCustomerSwitchOption", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/moreaction/DanmakuCustomerSwitchKt", "addDanmakuCustomerSwitchOption", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (d9Var2 == null || (e3Var = d9Var2.f437196f) == null) {
            return;
        }
        e3Var.i();
    }

    @Override // qk2.f
    public java.util.List g() {
        return this.f437782j;
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437781i;
    }

    @Override // qk2.f
    public boolean o() {
        return true;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        zl2.r4 r4Var = zl2.r4.f555483a;
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_VISITOR_HAS_SHOW_MORE_SETTING_BOOLEAN_SYNC;
        boolean o17 = c17.o(u3Var, false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("canShowVisitorMoreSettingRedDot:");
        sb6.append(!o17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", sb6.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", "hasClickVisitorMoreSettingRedDot");
        gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
        int i17 = this.f437780h;
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dxw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        t(menu, i17, string, com.p314xaae8f345.mm.R.raw.f80194x8f1a8525, o9Var.f437611d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        pk2.f8.f437280a.c(4, 1, null);
    }

    @Override // qk2.h
    public int y() {
        return this.f437780h;
    }
}
