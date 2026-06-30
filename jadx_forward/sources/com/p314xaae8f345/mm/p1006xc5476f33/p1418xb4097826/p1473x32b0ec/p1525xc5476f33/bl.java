package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class bl implements tg2.h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f193579a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm f193580b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f193581c;

    public bl(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar, android.view.ViewGroup viewGroup) {
        this.f193580b = hmVar;
        this.f193581c = viewGroup;
    }

    @Override // tg2.h
    public void a(java.lang.String giftId, int i17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftId, "giftId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193580b.f194364r, "on gift batch send, giftId: " + giftId + ", batchNum: " + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm.J1(this.f193580b, null, giftId, i17, false, false, null, false, 113, null);
    }

    @Override // tg2.h
    public void b(android.view.ViewGroup view, java.lang.String giftId, boolean z17, ce2.i iVar, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftId, "giftId");
        if (iVar != null && iVar.T0()) {
            r45.mb v07 = iVar.v0();
            if (!(v07 != null && v07.m75939xb282bd08(0) == 3)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm.t1(this.f193580b, iVar);
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm.J1(this.f193580b, view, giftId, 0, false, z17, iVar, z18, 12, null);
    }

    @Override // tg2.h
    public void c(android.view.ViewGroup view, java.lang.String giftId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftId, "giftId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar = this.f193580b;
        hmVar.L = giftId;
        dk2.u7 u7Var = dk2.u7.f315714a;
        u7Var.h(giftId, false);
        if (hmVar.L != null) {
            java.lang.Object obj = hmVar.K;
            if (obj instanceof android.os.Vibrator) {
                ((android.os.Vibrator) obj).vibrate(50L);
            }
        }
        ce2.i e17 = u7Var.e(giftId);
        if (e17 != null) {
            if (e17.z0().size() == 0) {
                android.view.ViewGroup viewGroup = this.f193581c;
                db5.t7.m(viewGroup.getContext(), viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dja));
                hmVar.G1();
                return;
            }
            ((vg2.b0) ((jz5.n) hmVar.f194359l1).mo141623x754a37bb()).c();
            hmVar.A.c(giftId, 1);
            vg2.a0 a0Var = (vg2.a0) ((jz5.n) hmVar.f194362p1).mo141623x754a37bb();
            a0Var.getClass();
            a0Var.f518005h = e17;
            java.util.LinkedList z07 = e17.z0();
            if (z07.size() == 0) {
                a0Var.a();
                return;
            }
            android.view.View view2 = a0Var.f518001d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/GiftBatchSelectPanelWidget", "showWidget", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/gift/widget/GiftBatchSelectPanelWidget", "showWidget", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = a0Var.f518001d;
            view3.getViewTreeObserver().addOnPreDrawListener(new vg2.z(a0Var, view));
            java.util.LinkedList linkedList = a0Var.f518003f;
            linkedList.clear();
            linkedList.addAll(z07);
            a0Var.f518004g.m8151xc67946d3(0, linkedList.size());
            android.view.ViewGroup.LayoutParams layoutParams = a0Var.f518006i.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.leftMargin = 0;
            }
            view3.requestLayout();
            android.view.ViewGroup viewGroup2 = a0Var.f517999b;
            viewGroup2.removeView(view3);
            viewGroup2.addView(view3);
        }
    }

    @Override // tg2.h
    public void e(android.view.ViewGroup view, java.lang.String giftId) {
        java.lang.String str;
        java.lang.String str2;
        java.util.List arrayList;
        r45.mb v07;
        r45.wd0 wd0Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftId, "giftId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193580b.f194364r, "onGiftItemClick giftId:" + giftId + " click,panelHiding:" + this.f193580b.f194358J + '!');
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar = this.f193580b;
        dk2.u7 u7Var = dk2.u7.f315714a;
        hmVar.O1 = u7Var.e(giftId);
        ce2.i iVar = this.f193580b.O1;
        boolean z17 = false;
        jz5.f0 f0Var = null;
        if (iVar != null && iVar.U0()) {
            dk2.ef efVar = dk2.ef.f314905a;
            if (dk2.ef.f314937s) {
                if (dk2.ef.f314936r == null) {
                    efVar.c0(((it2.x) ((rs5.f) i95.n0.c(rs5.f.class))).Bi());
                }
                if (!(dk2.ef.f314937s && dk2.ef.f314936r != null)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193580b.f194364r, "isCustomGift but resource is not ready, forceUpdate");
                    it2.x xVar = (it2.x) ((rs5.f) i95.n0.c(rs5.f.class));
                    xVar.getClass();
                    com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q qVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q();
                    qVar.c(xVar.f376074r);
                    ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Bi(qVar);
                } else if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dk2.u7.f315720g.get(giftId), java.lang.Boolean.TRUE)) {
                    ce2.i iVar2 = this.f193580b.O1;
                    r45.na0 D0 = iVar2 != null ? iVar2.D0() : null;
                    if (iVar2 != null && D0 != null) {
                        u7Var.c("onGiftItemCallback", iVar2, D0);
                    }
                }
            }
        }
        this.f193580b.G1();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar2 = this.f193580b;
        if (hmVar2.f194363q == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jj.f194648e && hmVar2.R1 == 1) {
            ce2.i iVar3 = hmVar2.O1;
            if (iVar3 != null && iVar3.W0()) {
                r45.eq1 eq1Var = ((mm2.n2) this.f193580b.P0(mm2.n2.class)).f410812g;
                if (eq1Var != null && !eq1Var.m75933x41a8a7f2(1)) {
                    z17 = true;
                }
                if (z17) {
                    qo0.c cVar = this.f193580b.f194360p;
                    qo0.b bVar = qo0.b.O4;
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putBoolean("PARAM_FINDER_LIVE_SHOW_FANS_FROM_WISH", true);
                    cVar.mo46557x60d69242(bVar, bundle);
                    this.f193580b.H1();
                    return;
                }
            }
            ((mm2.s2) this.f193580b.P0(mm2.s2.class)).f410939h.mo7808x76db6cb1(u7Var.e(giftId));
            this.f193580b.H1();
            return;
        }
        if (hmVar2.f194358J) {
            return;
        }
        u7Var.h(giftId, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193580b.f194364r, "onGiftItemClick start Preview");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar3 = this.f193580b;
        hmVar3.L = giftId;
        ce2.i iVar4 = hmVar3.O1;
        java.lang.String str3 = iVar4 != null ? iVar4.f67796x4f4dc37 : null;
        if (str3 == null || str3.length() == 0) {
            this.f193580b.A.c(giftId, 0);
        } else {
            this.f193580b.A.c(giftId, 2);
        }
        ((vg2.t) ((jz5.n) this.f193580b.f194374y0).mo141623x754a37bb()).d(view, giftId);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar4 = this.f193580b;
        ce2.i iVar5 = hmVar4.O1;
        str = "";
        if (iVar5 != null && pm0.v.z(iVar5.f67799x225ba391, 524288) && (wd0Var = iVar5.f67797x9223715e) != null && (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) wd0Var.m75936x14adae67(0)) != null) {
            java.lang.String m76184x8010e5e4 = c19782x23db1cfa.m76184x8010e5e4();
            if (m76184x8010e5e4 == null) {
                m76184x8010e5e4 = "";
            }
            java.lang.String m76175x6d346f39 = c19782x23db1cfa.m76175x6d346f39();
            if (m76175x6d346f39 == null) {
                m76175x6d346f39 = "";
            }
            c19782x23db1cfa.m76197x6c03c64c();
            if (m76184x8010e5e4.length() > 0) {
                vg2.e0 e0Var = (vg2.e0) ((jz5.n) hmVar4.f194372x1).mo141623x754a37bb();
                e0Var.getClass();
                e0Var.f518036g.setText(m76184x8010e5e4);
                if (!(m76175x6d346f39.length() == 0)) {
                    ((wo0.b) new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.q3(m76175x6d346f39, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f))).c(e0Var.f518035f);
                }
                android.view.View view2 = e0Var.f518032c;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(4);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/GiftDesignerTipsWidget", "showWidget", "(Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/gift/widget/GiftDesignerTipsWidget", "showWidget", "(Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view3 = e0Var.f518032c;
                view3.getViewTreeObserver().addOnPreDrawListener(new vg2.d0(e0Var, view));
                android.view.ViewGroup viewGroup = e0Var.f518031b;
                viewGroup.removeView(view3);
                viewGroup.addView(view3);
            }
        }
        ce2.i iVar6 = this.f193580b.O1;
        if (iVar6 != null && iVar6.a1()) {
            ce2.i iVar7 = this.f193580b.O1;
            if (iVar7 != null) {
                ce2.i iVar8 = iVar7.f67816xdcd1d904.m75941xfb821914(0).size() > 0 ? iVar7 : null;
                if (iVar8 != null) {
                    vg2.r1.j(this.f193580b.E1(), view, iVar8, false, false, 12, null);
                }
            }
        } else {
            ce2.i iVar9 = this.f193580b.O1;
            if (iVar9 != null && iVar9.T0()) {
                ce2.i iVar10 = this.f193580b.O1;
                java.lang.Integer valueOf = (iVar10 == null || (v07 = iVar10.v0()) == null) ? null : java.lang.Integer.valueOf(v07.m75939xb282bd08(0));
                if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar5 = this.f193580b;
                    ce2.i iVar11 = hmVar5.O1;
                    if (iVar11 != null) {
                        vg2.r1.j(hmVar5.E1(), view, iVar11, false, false, 12, null);
                    }
                }
            }
            ce2.i iVar12 = this.f193580b.O1;
            if (iVar12 != null && iVar12.Y0()) {
                vg2.v0 v0Var = this.f193580b.B1;
                if (v0Var != null) {
                    v0Var.b();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar6 = this.f193580b;
                android.content.Context context = this.f193581c.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                vg2.v0 v0Var2 = new vg2.v0(context, this.f193581c, this.f193580b, null, 8, null);
                android.view.View view4 = v0Var2.f518136d;
                if (view4.getParent() == null) {
                    v0Var2.f518134b.addView(view4);
                }
                android.view.View view5 = v0Var2.f518136d;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/GiftPkSelectPanelWidget", "showWidget", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/gift/widget/GiftPkSelectPanelWidget", "showWidget", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.getViewTreeObserver().addOnGlobalLayoutListener(new vg2.q0(v0Var2, view));
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = v0Var2.f518135c;
                tf2.o oVar = (tf2.o) lVar.U0(tf2.o.class);
                if (oVar == null || (arrayList = oVar.f500473n) == null) {
                    arrayList = new java.util.ArrayList();
                }
                tf2.o oVar2 = (tf2.o) lVar.U0(tf2.o.class);
                km2.q qVar2 = oVar2 != null ? oVar2.f500472m : null;
                if (arrayList.size() <= 1 || qVar2 == null) {
                    android.view.View view6 = (android.view.View) ((jz5.n) v0Var2.f518140h).mo141623x754a37bb();
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/GiftPkSelectPanelWidget", "showWidget", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view6, "com/tencent/mm/plugin/finder/live/gift/widget/GiftPkSelectPanelWidget", "showWidget", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view7 = (android.view.View) ((jz5.n) v0Var2.f518139g).mo141623x754a37bb();
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(0);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view7, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/GiftPkSelectPanelWidget", "showWidget", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view7.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view7, "com/tencent/mm/plugin/finder/live/gift/widget/GiftPkSelectPanelWidget", "showWidget", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    ((android.view.View) ((jz5.n) v0Var2.f518139g).mo141623x754a37bb()).setOnClickListener(new vg2.u0(v0Var2));
                } else {
                    android.view.View view8 = (android.view.View) ((jz5.n) v0Var2.f518140h).mo141623x754a37bb();
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add(0);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(view8, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/GiftPkSelectPanelWidget", "showWidget", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view8.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(view8, "com/tencent/mm/plugin/finder/live/gift/widget/GiftPkSelectPanelWidget", "showWidget", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view9 = (android.view.View) ((jz5.n) v0Var2.f518139g).mo141623x754a37bb();
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    arrayList7.add(8);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(view9, arrayList7.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/GiftPkSelectPanelWidget", "showWidget", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view9.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(view9, "com/tencent/mm/plugin/finder/live/gift/widget/GiftPkSelectPanelWidget", "showWidget", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.widget.TextView textView = (android.widget.TextView) ((jz5.n) v0Var2.f518142j).mo141623x754a37bb();
                    java.lang.String str4 = qVar2.f390706d;
                    textView.setText(str4 != null ? str4 : "");
                    ((android.widget.RelativeLayout) ((jz5.n) v0Var2.f518141i).mo141623x754a37bb()).removeAllViews();
                    android.content.Context context2 = v0Var2.f518133a;
                    android.widget.ImageView imageView = new android.widget.ImageView(context2);
                    android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ((jz5.n) v0Var2.f518141i).mo141623x754a37bb();
                    android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u5.a(context2, 20), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u5.a(context2, 20));
                    layoutParams.setMargins(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u5.a(context2, 0), 0, 0, 0);
                    relativeLayout.addView(imageView, layoutParams);
                    mn2.g1 g1Var = mn2.g1.f411508a;
                    g1Var.a().c(new mn2.n(qVar2.f390704b, null, 2, null), imageView, g1Var.h(mn2.f1.f411490h));
                    ((android.view.View) ((jz5.n) v0Var2.f518140h).mo141623x754a37bb()).setOnClickListener(new vg2.t0(v0Var2, arrayList, qVar2));
                }
                hmVar6.B1 = v0Var2;
            } else {
                ce2.i iVar13 = this.f193580b.O1;
                if (iVar13 != null && iVar13.U0()) {
                    dk2.ef efVar2 = dk2.ef.f314905a;
                    if (dk2.ef.f314937s && dk2.ef.f314936r != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar7 = this.f193580b;
                        ce2.i iVar14 = hmVar7.O1;
                        if (iVar14 != null) {
                            java.lang.String str5 = iVar14.f67814x2c488eb6;
                            if (str5 != null && str5.length() != 0) {
                                r4 = false;
                            }
                            if (r4) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(hmVar7.f194364r, "onGiftItemClick custom gift info id is null!");
                            } else {
                                pm0.v.L("preloadCustomGiftService", false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.al(hmVar7));
                                if (vg2.r1.j(hmVar7.E1(), view, iVar14, false, true, 4, null) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dk2.u7.f315720g.get(str5), java.lang.Boolean.TRUE)) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str5);
                                    hmVar7.K1(str5);
                                    dk2.u7.f315732s = new it2.b(new java.lang.ref.WeakReference(hmVar7));
                                }
                            }
                            f0Var = jz5.f0.f384359a;
                        }
                        if (f0Var == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f193580b.f194364r, "onGiftItemClick curClickGiftInfo change to null!");
                        }
                    }
                }
                if (dk2.u7.f315722i.containsKey(giftId)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p1526x373aa5.p1528x306930.C14279xd5b5745d c14279xd5b5745d = this.f193580b.f194367u;
                    int i17 = c14279xd5b5745d.selectedTabIndex;
                    java.util.List list = c14279xd5b5745d.f196289g;
                    if (list != null && (str2 = (java.lang.String) list.get(i17)) != null) {
                        str = str2;
                    }
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, this.f193581c.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573096dj5))) {
                        ((vg2.x0) ((jz5.n) this.f193580b.f194375y1).mo141623x754a37bb()).d(view, giftId);
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193580b.f194364r, "onGiftItemClick end Preview");
        if (this.f193580b.f194360p.mo11219xd0598cf8() == 0) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Wj(ml2.h5.f409058f, giftId, 0);
        }
    }

    @Override // tg2.h
    public void f(android.view.ViewGroup view, ce2.i giftInfo) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftInfo, "giftInfo");
        if (this.f193579a) {
            return;
        }
        zl2.r4 r4Var = zl2.r4.f555483a;
        int i17 = r4Var.I0().getInt("BATCH_SELECT_SHOW_NUM_KEY", 0);
        if (i17 > 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGiftUtil", "isEnableShowBatchToastWidget: " + i17);
            z17 = false;
        } else {
            z17 = !android.text.format.DateUtils.isToday(r4Var.I0().getLong("BATCH_SELECT_SHOW_TIME_KEY", 0L));
        }
        if (z17) {
            vg2.b0 b0Var = (vg2.b0) ((jz5.n) this.f193580b.f194359l1).mo141623x754a37bb();
            java.lang.String field_rewardProductId = giftInfo.f67814x2c488eb6;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_rewardProductId, "field_rewardProductId");
            b0Var.d(view, field_rewardProductId);
            this.f193579a = true;
            r4Var.I0().putInt("BATCH_SELECT_SHOW_NUM_KEY", r4Var.I0().getInt("BATCH_SELECT_SHOW_NUM_KEY", 0) + 1);
            r4Var.I0().putLong("BATCH_SELECT_SHOW_TIME_KEY", java.lang.System.currentTimeMillis());
        }
    }
}
