package yi2;

/* loaded from: classes10.dex */
public final class f extends yi2.p {
    public final android.view.View B;
    public final android.view.View C;
    public final android.widget.ImageView D;
    public final android.widget.TextView E;
    public final android.view.View F;
    public final android.widget.ImageView G;
    public final android.widget.TextView H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.view.ViewGroup root, xi2.e server) {
        super(root, server);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(server, "server");
        this.B = root.findViewById(com.p314xaae8f345.mm.R.id.eoy);
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.eow);
        this.C = findViewById;
        this.D = (android.widget.ImageView) root.findViewById(com.p314xaae8f345.mm.R.id.eov);
        this.E = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.eox);
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.eos);
        this.F = findViewById2;
        this.G = (android.widget.ImageView) root.findViewById(com.p314xaae8f345.mm.R.id.eor);
        this.H = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.eot);
        int i17 = com.p314xaae8f345.mm.ui.bl.b(root.getContext()).x / 2;
        android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMarginEnd(((i17 * 7) / 25) + i17);
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = findViewById2.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 == null) {
            return;
        }
        marginLayoutParams2.setMarginStart(i17 + ((i17 * 7) / 25));
    }

    @Override // yi2.p, yi2.o0
    public void d() {
        t();
        super.d();
    }

    @Override // yi2.p, yi2.o0
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f544096c, "onAnimationStart status:");
        if (((mm2.o4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8) this.f544095b).a().a(mm2.o4.class)).f410857s.size() == 1) {
            android.view.View view = this.B;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleBarWidget", "onStartBattleAnimateStart", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleBarWidget", "onStartBattleAnimateStart", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view2 = this.B;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleBarWidget", "onStartBattleAnimateStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleBarWidget", "onStartBattleAnimateStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.B.animate().alpha(1.0f).setListener(null).setDuration(500L).setInterpolator(new android.view.animation.AccelerateInterpolator()).start();
            this.f544094a.postDelayed(new yi2.e(this), 2500L);
            t();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f5  */
    @Override // yi2.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h() {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yi2.f.h():void");
    }

    @Override // yi2.o0
    public void i(boolean z17) {
        android.view.View view = this.f544103j;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f544109p;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.A;
        b4Var.d();
        b4Var.c(1000L, 1000L);
        no0.l lVar = no0.m.f420263a;
        xi2.e eVar = this.f544095b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8 p8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8) eVar;
        dk2.u4 u4Var = ((mm2.o4) p8Var.a().a(mm2.o4.class)).Z;
        this.f544112s.setText(lVar.b(u4Var != null ? u4Var.f315689c : 0, ":"));
        g(false);
        mo177186xcd1079b0(0);
        if (!z17) {
            android.view.View view3 = this.B;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            h();
            android.view.View view4 = this.f544109p;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = this.f544113t;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view6 = this.f544114u;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (!(((mm2.o4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8) eVar).a().a(mm2.o4.class)).f410857s.size() == 1)) {
            android.view.View view7 = this.B;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        ya2.g gVar = ya2.h.f542017a;
        ya2.b2 b17 = gVar.b(((mm2.c1) p8Var.a().a(mm2.c1.class)).f410385o);
        java.lang.String m176700xe5e0d2a0 = b17 != null ? b17.m176700xe5e0d2a0() : null;
        km2.q l76 = ((mm2.o4) p8Var.a().a(mm2.o4.class)).l7();
        java.lang.String str = l76 != null ? l76.f390704b : null;
        ya2.b2 b18 = gVar.b(((mm2.c1) p8Var.a().a(mm2.c1.class)).f410385o);
        java.lang.String w07 = b18 != null ? b18.w0() : null;
        km2.q l77 = ((mm2.o4) p8Var.a().a(mm2.o4.class)).l7();
        java.lang.String str2 = l77 != null ? l77.f390706d : null;
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d a17 = g1Var.a();
        mn2.n nVar = new mn2.n(m176700xe5e0d2a0, null, 2, null);
        android.widget.ImageView battleStartSelfUserAvatar = this.D;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(battleStartSelfUserAvatar, "battleStartSelfUserAvatar");
        mn2.f1 f1Var = mn2.f1.f411490h;
        a17.c(nVar, battleStartSelfUserAvatar, g1Var.h(f1Var));
        vo0.d a18 = g1Var.a();
        mn2.n nVar2 = new mn2.n(str, null, 2, null);
        android.widget.ImageView battleStartOtherUserAvatar = this.G;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(battleStartOtherUserAvatar, "battleStartOtherUserAvatar");
        a18.c(nVar2, battleStartOtherUserAvatar, g1Var.h(f1Var));
        this.E.setText(w07);
        this.H.setText(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f544096c, "selfAvatar:" + m176700xe5e0d2a0 + " otherAvatarUrl:" + str + " selfNickname:" + w07 + " otherNickname:" + str2);
    }

    @Override // yi2.p
    public java.lang.String n() {
        return "FinderLiveBattleBarWidget";
    }

    @Override // yi2.p
    public void r() {
        super.r();
        mo177186xcd1079b0(0);
    }

    public final void t() {
        android.view.View view = this.f544103j;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159) view : null;
        if (c22645x24069159 != null) {
            xi2.e eVar = this.f544095b;
            dk2.u4 u4Var = ((mm2.o4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8) eVar).a().a(mm2.o4.class)).Z;
            if (u4Var != null && u4Var.f() && u4Var.f315693g == 1) {
                xh2.c cVar = (xh2.c) ((mm2.o4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8) eVar).a().a(mm2.o4.class)).A.mo3195x754a37bb();
                int i17 = cVar != null ? cVar.f536066c : 0;
                if (!(i17 == 7 && u4Var.f315701o == 1) && (i17 == 7 || u4Var.f315701o == 1)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f544096c, "stateError");
                    return;
                }
                int i18 = u4Var.f315701o;
                android.view.View view2 = this.f544094a;
                float b17 = i18 == 1 ? i65.a.b(view2.getContext(), 12) : 0.0f;
                int b18 = u4Var.f315701o == 1 ? i65.a.b(view2.getContext(), 16) : 0;
                if (this.f544100g != b18) {
                    c22645x24069159.m81436x205ac394(b17);
                    android.view.ViewGroup.LayoutParams layoutParams = c22645x24069159.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams != null) {
                        marginLayoutParams.leftMargin = b18;
                        marginLayoutParams.rightMargin = b18;
                    }
                    this.f544100g = b18;
                }
            }
        }
    }
}
