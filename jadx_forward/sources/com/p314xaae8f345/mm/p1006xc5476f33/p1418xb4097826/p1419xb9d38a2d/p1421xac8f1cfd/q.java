package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd;

/* loaded from: classes2.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.s f183258d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.s sVar) {
        this.f183258d = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUICForNewLife$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.s sVar = this.f183258d;
        sVar.getClass();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.List list = sVar.f183262f;
        if (list != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((m92.b) obj).f68723xdec927b, sVar.f183267n)) {
                    arrayList3.add(obj);
                }
            }
            java.util.Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList2.add(new j92.a((m92.b) it.next(), false));
            }
        }
        if (arrayList2.size() == 0) {
            j92.a aVar = new j92.a(new m92.b(), false);
            aVar.f379887f = sVar.f183266m;
            arrayList2.add(aVar);
        }
        sVar.f183263g = arrayList2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLife.FinderAccountSwitchUICForNewLife", "[doAccountSwitch] curUserName:" + sVar.f183267n);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.api.p1420xac8f1cfd.C13638xb683e9ec c13638xb683e9ec = sVar.f183261e;
        if (c13638xb683e9ec == null) {
            h92.b bVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.api.p1420xac8f1cfd.C13638xb683e9ec.f183232y;
            android.app.Activity m80379x76847179 = sVar.m80379x76847179();
            android.view.Window window = sVar.m80379x76847179().getWindow();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(window, "getWindow(...)");
            java.lang.String str = sVar.f183267n;
            c13638xb683e9ec = bVar.a(m80379x76847179, window, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.e(str == null || r26.n0.N(str)));
            sVar.f183261e = c13638xb683e9ec;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82798x4905e9fa = c13638xb683e9ec.m82798x4905e9fa();
            m82798x4905e9fa.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(sVar.m80379x76847179()));
            java.util.ArrayList arrayList4 = sVar.f183263g;
            if (arrayList4 != null) {
                sVar.f183264h = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.account.component.FinderAccountSwitchUICForNewLife$buildConvert$1
                    @Override // in5.s
                    /* renamed from: getItemConvert */
                    public in5.r mo43555xf2bb75ea(int type) {
                        o92.a aVar2 = new o92.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.s.this.f183270q);
                        java.util.ArrayList arrayList5 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.s.this.f183263g;
                        if (arrayList5 != null) {
                            arrayList5.size();
                        }
                        return aVar2;
                    }
                }, arrayList4, false);
            }
            m82798x4905e9fa.mo7960x6cab2c8d(sVar.f183264h);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = sVar.f183264h;
            if (c22848x6ddd90cf != null) {
                c22848x6ddd90cf.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.p(sVar);
            }
            if (c22848x6ddd90cf != null) {
                c22848x6ddd90cf.m8146xced61ae5();
            }
        } else {
            android.view.ViewParent parent = c13638xb683e9ec.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null && viewGroup.indexOfChild(c13638xb683e9ec) != viewGroup.getChildCount() - 1) {
                viewGroup.removeView(c13638xb683e9ec);
                viewGroup.addView(c13638xb683e9ec);
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = sVar.f183264h;
            if (c22848x6ddd90cf2 != null) {
                java.util.List m82898xfb7e5820 = c22848x6ddd90cf2.m82898xfb7e5820();
                m82898xfb7e5820.clear();
                java.util.ArrayList arrayList5 = sVar.f183263g;
                if (arrayList5 != null) {
                    java.util.Iterator it6 = arrayList5.iterator();
                    while (it6.hasNext()) {
                        m82898xfb7e5820.add((j92.a) it6.next());
                    }
                }
                c22848x6ddd90cf2.m8146xced61ae5();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.api.p1420xac8f1cfd.C13638xb683e9ec c13638xb683e9ec2 = c13638xb683e9ec;
        c13638xb683e9ec2.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.m(c13638xb683e9ec2, sVar));
        java.lang.String str2 = sVar.f183267n;
        boolean z17 = str2 == null || r26.n0.N(str2);
        android.view.View findViewById = c13638xb683e9ec2.m82794x2d5b4f1b().findViewById(com.p314xaae8f345.mm.R.id.b0n);
        android.view.View findViewById2 = c13638xb683e9ec2.m82794x2d5b4f1b().findViewById(com.p314xaae8f345.mm.R.id.f564974av3);
        android.view.View findViewById3 = c13638xb683e9ec2.m82794x2d5b4f1b().findViewById(com.p314xaae8f345.mm.R.id.b5u);
        java.lang.String str3 = sVar.f183267n;
        if (str3 == null || r26.n0.N(str3)) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById2, arrayList6.toArray(), "com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUICForNewLife", "initBottomLayout", "(Lcom/tencent/mm/plugin/finder/account/api/component/FinderAccountSwitchDrawer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUICForNewLife", "initBottomLayout", "(Lcom/tencent/mm/plugin/finder/account/api/component/FinderAccountSwitchDrawer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(findViewById, arrayList7.toArray(), "com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUICForNewLife", "initBottomLayout", "(Lcom/tencent/mm/plugin/finder/account/api/component/FinderAccountSwitchDrawer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUICForNewLife", "initBottomLayout", "(Lcom/tencent/mm/plugin/finder/account/api/component/FinderAccountSwitchDrawer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(findViewById2, arrayList8.toArray(), "com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUICForNewLife", "initBottomLayout", "(Lcom/tencent/mm/plugin/finder/account/api/component/FinderAccountSwitchDrawer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUICForNewLife", "initBottomLayout", "(Lcom/tencent/mm/plugin/finder/account/api/component/FinderAccountSwitchDrawer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(0);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(findViewById, arrayList9.toArray(), "com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUICForNewLife", "initBottomLayout", "(Lcom/tencent/mm/plugin/finder/account/api/component/FinderAccountSwitchDrawer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUICForNewLife", "initBottomLayout", "(Lcom/tencent/mm/plugin/finder/account/api/component/FinderAccountSwitchDrawer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar2.Tj(findViewById, 40, 3, false);
        aVar2.pk(findViewById, "newlife_select_profile_hint");
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("enter_source", java.lang.Integer.valueOf(sVar.f183270q.m75939xb282bd08(0)));
        lVarArr[1] = new jz5.l("source_feedid", pm0.v.u(sVar.f183270q.m75942xfb822ef2(1)));
        java.lang.String str4 = sVar.f183267n;
        if (str4 == null) {
            str4 = "";
        }
        lVarArr[2] = new jz5.l("my_finder_username", str4);
        aVar2.gk(findViewById, kz5.c1.k(lVarArr));
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.n(sVar));
        findViewById3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.o(sVar));
        android.view.View findViewById4 = c13638xb683e9ec2.m82795xcb847e8d().findViewById(com.p314xaae8f345.mm.R.id.f566753gy5);
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        arrayList10.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList10);
        yj0.a.d(findViewById4, arrayList10.toArray(), "com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUICForNewLife", "initHeaderLayout", "(Lcom/tencent/mm/plugin/finder/account/api/component/FinderAccountSwitchDrawer;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUICForNewLife", "initHeaderLayout", "(Lcom/tencent/mm/plugin/finder/account/api/component/FinderAccountSwitchDrawer;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList11 = sVar.f183263g;
        int size = arrayList11 != null ? arrayList11.size() : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.f fVar = c13638xb683e9ec2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.f) c13638xb683e9ec2 : null;
        if (fVar != null) {
            fVar.m55421xf3e20c59(z17);
        }
        c13638xb683e9ec2.m55420xbd04defe(size);
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22821xbaee45b5.s(c13638xb683e9ec2, false, false, 0, 7, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUICForNewLife$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
