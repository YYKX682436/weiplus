package gq2;

/* loaded from: classes2.dex */
public final class j extends in5.r implements fq2.a, bq2.a, zp2.a {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f356095e;

    /* renamed from: f, reason: collision with root package name */
    public final sp2.c4 f356096f;

    /* renamed from: g, reason: collision with root package name */
    public final sp2.k f356097g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 f356098h;

    /* renamed from: i, reason: collision with root package name */
    public int f356099i;

    /* renamed from: m, reason: collision with root package name */
    public hq2.c f356100m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f356101n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f356102o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f356103p;

    public j(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, sp2.c4 outsideEventListener, sp2.k parentOutsideOperator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outsideEventListener, "outsideEventListener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentOutsideOperator, "parentOutsideOperator");
        this.f356095e = context;
        this.f356096f = outsideEventListener;
        this.f356097g = parentOutsideOperator;
        this.f356101n = new java.util.LinkedList();
        this.f356102o = jz5.h.b(new gq2.i(this));
        this.f356103p = jz5.h.b(new gq2.e(this));
    }

    @Override // bq2.a
    public java.util.ArrayList a(java.util.ArrayList collectScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(collectScene, "collectScene");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 c15359x536ace78 = this.f356098h;
        if (c15359x536ace78 != null && c15359x536ace78.isShown()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 c15359x536ace782 = this.f356098h;
            if (c15359x536ace782 != null && c15359x536ace782.isAttachedToWindow()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1590x89bc6776.p1591x9da2e250.C14553xb199db9 o17 = o();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14594x9de071a c14594x9de071a = o17 != null ? o17.f203618o : null;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1590x89bc6776.p1591x9da2e250.C14553xb199db9 o18 = o();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14594x9de071a c14594x9de071a2 = o18 != null ? o18.f203618o : null;
                java.lang.Object mo7946xf939df19 = c14594x9de071a2 != null ? c14594x9de071a2.mo7946xf939df19() : null;
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
                if (c14594x9de071a != null && c22848x6ddd90cf != null) {
                    return sp2.n3.f492649a.c(c14594x9de071a, c22848x6ddd90cf, collectScene);
                }
            }
        }
        return new java.util.ArrayList();
    }

    @Override // zp2.a
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1590x89bc6776.p1591x9da2e250.C14553xb199db9 o17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 c15359x536ace78 = this.f356098h;
        if (!(c15359x536ace78 != null && c15359x536ace78.isShown())) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 c15359x536ace782 = this.f356098h;
        if (!(c15359x536ace782 != null && c15359x536ace782.isAttachedToWindow()) || (o17 = o()) == null) {
            return null;
        }
        return o17.f203618o;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570878c74;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        int i19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1590x89bc6776.p1591x9da2e250.C14553xb199db9 c14553xb199db9;
        hq2.c item = (hq2.c) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f356100m = item;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LiveTabViewPagerConvert onBindViewHolder size: ");
        java.util.ArrayList arrayList = item.f364743e;
        sb6.append(arrayList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveTabViewPagerConvert", sb6.toString());
        java.util.LinkedList linkedList = this.f356101n;
        linkedList.clear();
        n();
        if (arrayList.size() <= 0) {
            ((com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.nv8)).n();
            ((p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f569103p16)).removeAllViews();
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = holder.f3639x46306858.getLayoutParams();
        if (layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) {
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) layoutParams).f93474i = true;
        }
        n();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        int i27 = 0;
        if (arrayList.size() > 0) {
            java.util.Iterator it = arrayList.iterator();
            int i28 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i29 = i28 + 1;
                if (i28 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                hq2.a aVar = (hq2.a) next;
                int m75939xb282bd08 = aVar.f364738d.m75939xb282bd08(i27);
                r45.dd2 dd2Var = aVar.f364738d;
                r45.fa2 fa2Var = item.f364742d;
                int i37 = fa2Var.f455659e;
                int i38 = fa2Var.f455658d;
                r45.u80 u80Var = new r45.u80();
                u80Var.set(i27, java.lang.Integer.valueOf(fa2Var.f455658d));
                u80Var.set(1, fa2Var.f455665n);
                u80Var.m75941xfb821914(2).addAll(item.g());
                u80Var.set(3, java.lang.Integer.valueOf(item.c()));
                linkedList2.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1590x89bc6776.p1591x9da2e250.C14553xb199db9(new jq2.a(i28, m75939xb282bd08, dd2Var, i37, i38, u80Var, this, aVar.f364739e.f455669r, item)));
                i27 = 0;
                i28 = i29;
                arrayList = arrayList;
                linkedList = linkedList;
            }
        }
        java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1590x89bc6776.p1591x9da2e250.C14553xb199db9> linkedList3 = linkedList;
        java.util.ArrayList arrayList2 = arrayList;
        linkedList3.clear();
        linkedList3.addAll(linkedList2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 c15359x536ace78 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f569103p16);
        c15359x536ace78.m62442xecae6946(true);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1590x89bc6776.p1591x9da2e250.C14553xb199db9 c14553xb199db92 : linkedList3) {
            try {
                java.lang.reflect.Field declaredField = p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670.class.getDeclaredField("mContainer");
                declaredField.setAccessible(true);
                declaredField.set(c14553xb199db92, c15359x536ace78);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveTabViewPagerConvert", "reflectSetFragmentContainer exception", th6);
            }
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        ae2.b2 b2Var = ae2.b2.f84994a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.G).mo141623x754a37bb()).r()).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveTabViewPagerConvert", "reflect cost: " + currentTimeMillis2 + " opSwitch: " + intValue);
        c15359x536ace78.m8321x40341e13(2);
        c15359x536ace78.removeAllViewsInLayout();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f356095e;
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d mo7595x9cdc264 = abstractActivityC21394xb3d2c0cf.mo7595x9cdc264();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo7595x9cdc264, "getSupportFragmentManager(...)");
        c15359x536ace78.m8315x6cab2c8d(new dq2.c(mo7595x9cdc264, linkedList3, intValue == 1 ? 1 : 0));
        int intValue2 = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.D2().r()).intValue();
        if (intValue2 > 0) {
            try {
                java.lang.reflect.Field declaredField2 = p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.class.getDeclaredField("mScroller");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredField2, "getDeclaredField(...)");
                declaredField2.setAccessible(true);
                declaredField2.set(c15359x536ace78, new hc2.h1(abstractActivityC21394xb3d2c0cf, intValue2));
            } catch (java.lang.Exception e17) {
                i19 = 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("ViewPagerExt", e17, "", new java.lang.Object[0]);
            }
        }
        i19 = 0;
        p012xc85e97e9.p114xa324943e.p115xd1075a44.a m8299xf939df19 = c15359x536ace78.m8299xf939df19();
        if (m8299xf939df19 != null) {
            m8299xf939df19.mo8343xced61ae5();
        }
        this.f356098h = c15359x536ace78;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = this.f356095e;
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        gq2.g gVar = new gq2.g(new gq2.d(abstractActivityC21394xb3d2c0cf2, itemView, arrayList2, this, new gq2.h(this, item)), this, item, this.f356095e, linkedList3);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 c15359x536ace782 = this.f356098h;
        if (c15359x536ace782 != null) {
            c15359x536ace782.m8293xf6d5dd34();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 c15359x536ace783 = this.f356098h;
        if (c15359x536ace783 != null) {
            c15359x536ace783.m8289xa5a25773(gVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveTabViewPagerConvert", "onPageSelected");
        sp2.b bVar = sp2.b.f492505a;
        java.lang.String key = (java.lang.String) ((jz5.n) this.f356102o).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.util.HashMap hashMap = sp2.b.f492507c;
        java.lang.Object obj = hashMap.get(key);
        if (obj == null) {
            obj = new sp2.a();
            hashMap.put(key, obj);
        }
        int i39 = ((sp2.a) obj).f492495i;
        if (i39 <= linkedList3.size() - 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 c15359x536ace784 = this.f356098h;
            if (c15359x536ace784 != null) {
                c15359x536ace784.m8316x940d026a(i39);
            }
            gVar.mo8333x510f45c9(i39);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 c15359x536ace785 = this.f356098h;
            if (c15359x536ace785 != null) {
                c15359x536ace785.m8316x940d026a(i19);
            }
            gVar.mo8333x510f45c9(i19);
        }
        java.util.Iterator it6 = arrayList2.iterator();
        int i47 = i19;
        while (it6.hasNext()) {
            java.lang.Object next2 = it6.next();
            int i48 = i47 + 1;
            if (i47 < 0) {
                kz5.c0.p();
                throw null;
            }
            hq2.a aVar2 = (hq2.a) next2;
            if (aVar2.f364738d.m75933x41a8a7f2(2) && (c14553xb199db9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1590x89bc6776.p1591x9da2e250.C14553xb199db9) kz5.n0.a0(linkedList3, i47)) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveTabViewPagerConvert", "checkPreloadTargetTabData index: " + i47);
                eq2.e eVar = eq2.e.f337433a;
                int d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) abstractActivityC21394xb3d2c0cf).getD();
                int m75939xb282bd082 = aVar2.f364738d.m75939xb282bd08(i19);
                jq2.a aVar3 = c14553xb199db9.f203617n;
                java.lang.String str = (java.lang.String) ((jz5.n) this.f356103p).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "<get-fromCommentScene>(...)");
                eVar.a(d17, m75939xb282bd082, 0, 12, aVar3, str);
            }
            i47 = i48;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 c15359x536ace786 = this.f356098h;
        if (c15359x536ace786 != null) {
            c15359x536ace786.postDelayed(new gq2.f(this), 500L);
        }
    }

    public final void n() {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f356095e;
        java.util.List<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> m7675x1626d96d = abstractActivityC21394xb3d2c0cf.mo7595x9cdc264().m7675x1626d96d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7675x1626d96d, "getFragments(...)");
        if (!m7675x1626d96d.isEmpty()) {
            java.util.Iterator<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> it = m7675x1626d96d.iterator();
            while (it.hasNext()) {
                p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 next = it.next();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1590x89bc6776.p1591x9da2e250.C14553xb199db9 c14553xb199db9 = next instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1590x89bc6776.p1591x9da2e250.C14553xb199db9 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1590x89bc6776.p1591x9da2e250.C14553xb199db9) next : null;
                if (c14553xb199db9 != null) {
                    lq2.a aVar = c14553xb199db9.f203619p;
                    if (aVar != null) {
                        iq2.d0 d0Var = aVar.f401988e;
                        if (d0Var == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveThemeCallback");
                            throw null;
                        }
                        d0Var.A = true;
                    }
                    p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = abstractActivityC21394xb3d2c0cf.mo7595x9cdc264().m7630xb2c12e75();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7630xb2c12e75, "beginTransaction(...)");
                    m7630xb2c12e75.j(c14553xb199db9);
                    m7630xb2c12e75.f();
                    it.remove();
                }
            }
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1590x89bc6776.p1591x9da2e250.C14553xb199db9 o() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 c15359x536ace78 = this.f356098h;
        int m8300xfda78ef6 = c15359x536ace78 != null ? c15359x536ace78.m8300xfda78ef6() : 0;
        if (m8300xfda78ef6 >= 0) {
            java.util.LinkedList linkedList = this.f356101n;
            if (m8300xfda78ef6 < linkedList.size() && linkedList.size() != 0) {
                return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1590x89bc6776.p1591x9da2e250.C14553xb199db9) linkedList.get(m8300xfda78ef6);
            }
        }
        return null;
    }
}
