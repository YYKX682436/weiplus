package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3;

/* loaded from: classes14.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.t f211202d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.g61 f211203e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f211204f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.t tVar, r45.g61 g61Var, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f211202d = tVar;
        this.f211203e = g61Var;
        this.f211204f = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.l(this.f211202d, this.f211203e, this.f211204f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        lVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        int i17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.t tVar = this.f211202d;
        final int i18 = 0;
        tVar.m60958x4905e9fa().setVisibility(0);
        android.widget.FrameLayout frameLayout = tVar.f211218e;
        if (frameLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
            throw null;
        }
        frameLayout.setVisibility(8);
        tVar.R6().setOnClickListener(null);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = tVar.f211223m;
        if (viewOnClickListenerC22631x1cc07cc8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("switchBtn");
            throw null;
        }
        boolean z17 = true;
        viewOnClickListenerC22631x1cc07cc8.setEnabled(true);
        r45.g61 g61Var = this.f211203e;
        if (g61Var.m75939xb282bd08(4) != 0) {
            android.widget.TextView textView = tVar.f211222i;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                throw null;
            }
            textView.setText(tVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572839nk1, new java.lang.Integer(g61Var.m75939xb282bd08(4))));
            android.widget.TextView textView2 = tVar.f211222i;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                throw null;
            }
            textView2.setVisibility(0);
        } else {
            android.widget.TextView textView3 = tVar.f211222i;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                throw null;
            }
            textView3.setVisibility(8);
        }
        java.util.ArrayList arrayList = tVar.f211226p;
        arrayList.clear();
        arrayList.addAll(this.f211204f);
        if (arrayList.isEmpty()) {
            android.view.View view = tVar.f211220g;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nothingView");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/promotion/FinderPromotionUserListUIC", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/promotion/FinderPromotionUserListUIC", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.FrameLayout frameLayout2 = tVar.f211218e;
            if (frameLayout2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
                throw null;
            }
            frameLayout2.setVisibility(0);
            tVar.m60958x4905e9fa().setVisibility(8);
            android.view.View view2 = tVar.f211219f;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/ui/promotion/FinderPromotionUserListUIC", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/ui/promotion/FinderPromotionUserListUIC", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            tVar.m60958x4905e9fa().setVisibility(8);
            android.view.View R6 = tVar.R6();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(R6, arrayList4.toArray(), "com/tencent/mm/plugin/finder/ui/promotion/FinderPromotionUserListUIC", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            R6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(R6, "com/tencent/mm/plugin/finder/ui/promotion/FinderPromotionUserListUIC", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            int m75939xb282bd08 = g61Var.m75939xb282bd08(4);
            int i19 = tVar.f211235y;
            if (m75939xb282bd08 < i19) {
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 m60958x4905e9fa = tVar.m60958x4905e9fa();
                com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                java.lang.System.nanoTime();
                if (!com.p314xaae8f345.mm.ui.bk.y() && !com.p314xaae8f345.mm.ui.bk.Q() && !com.p314xaae8f345.mm.ui.bk.A()) {
                    z17 = false;
                }
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                int i27 = a17.f278668a;
                if (!z17 && i27 > (i17 = a17.f278669b)) {
                    i27 = i17;
                }
                final int dimension = (int) ((i27 - tVar.m80379x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.akp)) / i19);
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.ui.promotion.FinderPromotionUserListUIC$getAdapter$1
                    @Override // in5.s
                    /* renamed from: getItemConvert */
                    public in5.r mo43555xf2bb75ea(int type) {
                        if (type == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.e.class.getName().hashCode()) {
                            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.g(dimension, tVar.f211228r);
                        }
                        hc2.l.a(pf5.o.TAG, type);
                        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
                    }
                }, arrayList, false);
                tVar.f211225o = c22848x6ddd90cf;
                m60958x4905e9fa.mo7960x6cab2c8d(c22848x6ddd90cf);
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 m60958x4905e9fa2 = tVar.m60958x4905e9fa();
                final android.app.Activity m80379x76847179 = tVar.m80379x76847179();
                m60958x4905e9fa2.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(m80379x76847179) { // from class: com.tencent.mm.plugin.finder.ui.promotion.FinderPromotionUserListUIC$requestInit$1$1$1$1
                    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
                    /* renamed from: canScrollVertically */
                    public boolean getF204840r() {
                        return false;
                    }
                });
            } else {
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 m60958x4905e9fa3 = tVar.m60958x4905e9fa();
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.ui.promotion.FinderPromotionUserListUIC$getAdapter$1
                    @Override // in5.s
                    /* renamed from: getItemConvert */
                    public in5.r mo43555xf2bb75ea(int type) {
                        if (type == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.e.class.getName().hashCode()) {
                            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.g(i18, tVar.f211228r);
                        }
                        hc2.l.a(pf5.o.TAG, type);
                        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
                    }
                }, arrayList, false);
                tVar.f211225o = c22848x6ddd90cf2;
                m60958x4905e9fa3.mo7960x6cab2c8d(c22848x6ddd90cf2);
                tVar.m60958x4905e9fa().mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(tVar.m80379x76847179(), i19));
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf3 = tVar.f211225o;
            if (c22848x6ddd90cf3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            c22848x6ddd90cf3.m8146xced61ae5();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.t.P6(tVar);
        }
        return jz5.f0.f384359a;
    }
}
