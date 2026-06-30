package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class fd implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f188266a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id f188267b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f188268c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f188269d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f188270e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fp0.r f188271f;

    public fd(yz5.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id idVar, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, long j17, fp0.r rVar) {
        this.f188266a = lVar;
        this.f188267b = idVar;
        this.f188268c = z17;
        this.f188269d = c14994x9b99c079;
        this.f188270e = j17;
        this.f188271f = rVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa2;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jc jcVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jc) obj;
        yz5.l lVar = this.f188266a;
        if (lVar == null || (linkedList = (java.util.LinkedList) lVar.mo146xb9724478(jcVar.f188627b)) == null) {
            linkedList = jcVar.f188627b;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id idVar = this.f188267b;
        yw2.n nVar = idVar.f188543p;
        java.lang.Object obj2 = null;
        if (nVar != null) {
            android.widget.FrameLayout frameLayout = nVar.f548188h;
            if (frameLayout == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
                throw null;
            }
            frameLayout.setVisibility(8);
            nVar.n().setOnClickListener(null);
        }
        boolean z17 = this.f188268c;
        if (!z17) {
            yw2.n nVar2 = idVar.f188543p;
            if (nVar2 != null) {
                nVar2.o().P(linkedList != null ? linkedList.size() : 0);
            }
        } else if (!idVar.f188545r) {
            yw2.n nVar3 = idVar.f188543p;
            if (nVar3 != null) {
                com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.I(nVar3.o(), null, 1, null);
            }
            yw2.n nVar4 = idVar.f188543p;
            if (nVar4 != null) {
                com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.r(nVar4.o(), false, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dd(idVar), 3, null);
            }
        }
        if (z17 && !idVar.f188544q) {
            yw2.n nVar5 = idVar.f188543p;
            if (nVar5 != null) {
                nVar5.g(false);
            }
            yw2.n nVar6 = idVar.f188543p;
            if (nVar6 != null) {
                nVar6.k().l(true);
            }
        }
        r45.a31 a31Var = jcVar.f188629d;
        r45.t11 t11Var = a31Var != null ? (r45.t11) a31Var.m75936x14adae67(0) : null;
        idVar.f188552y = t11Var != null ? (r45.ri0) t11Var.m75936x14adae67(1) : null;
        java.util.ArrayList arrayList = idVar.f188540m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f188269d;
        if (t11Var != null) {
            so2.f1 f1Var = new so2.f1(new r45.md1(), c14994x9b99c079.m59298x5bcf3ee6());
            f1Var.f491875m = t11Var;
            arrayList.add(f1Var);
        }
        r45.tl6 tl6Var = jcVar.f188628c;
        if (tl6Var != null && tl6Var.m75939xb282bd08(0) != 0) {
            so2.f1 f1Var2 = new so2.f1(new r45.md1(), c14994x9b99c079.m59298x5bcf3ee6());
            f1Var2.f491874i = tl6Var;
            arrayList.add(f1Var2);
        }
        if (linkedList == null || linkedList.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DrawerPresenter", "refresh header title...");
            idVar.o();
            if (z17) {
                arrayList.clear();
                yw2.n nVar7 = idVar.f188543p;
                if (nVar7 != null && (m82555x4905e9fa = nVar7.o().m82555x4905e9fa()) != null && (mo7946xf939df19 = m82555x4905e9fa.mo7946xf939df19()) != null) {
                    mo7946xf939df19.m8146xced61ae5();
                }
                if (jcVar.f188626a) {
                    yw2.n nVar8 = idVar.f188543p;
                    if (nVar8 != null) {
                        nVar8.q();
                    }
                } else {
                    yw2.n nVar9 = idVar.f188543p;
                    if (nVar9 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ed edVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ed(idVar, c14994x9b99c079);
                        android.widget.FrameLayout frameLayout2 = nVar9.f548188h;
                        if (frameLayout2 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
                            throw null;
                        }
                        frameLayout2.setVisibility(0);
                        android.view.View view = nVar9.f548189i;
                        if (view == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
                            throw null;
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList2.add(8);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        nVar9.l().setVisibility(8);
                        android.view.View n17 = nVar9.n();
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(n17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        n17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(n17, "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        nVar9.n().setOnClickListener(new yw2.m(edVar));
                    }
                }
            }
        } else {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.md1 md1Var = (r45.md1) it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(md1Var);
                so2.f1 f1Var3 = new so2.f1(md1Var, c14994x9b99c079.m59298x5bcf3ee6());
                com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = idVar.f188537g;
                r45.md1 md1Var2 = f1Var3.f491869d;
                if (gVar == null || md1Var2.m75939xb282bd08(7) != 1) {
                    if (idVar.f188538h.length() > 0) {
                        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(idVar.f188538h, md1Var2.m75945x2fec8307(5))) {
                        }
                    }
                    arrayList.add(f1Var3);
                }
                f1Var3.f491871f = true;
                arrayList.add(f1Var3);
            }
            if (((java.lang.Boolean) ((jz5.n) idVar.A).mo141623x754a37bb()).booleanValue() && !idVar.f188545r && arrayList.size() > 1) {
                java.util.Iterator it6 = arrayList.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it6.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((so2.f1) next).f491869d.m75945x2fec8307(5), c01.z1.r())) {
                        obj2 = next;
                        break;
                    }
                }
                so2.f1 f1Var4 = (so2.f1) obj2;
                if (f1Var4 != null) {
                    f1Var4.f491873h = true;
                }
            }
            yw2.n nVar10 = idVar.f188543p;
            if (nVar10 != null && (m82555x4905e9fa2 = nVar10.o().m82555x4905e9fa()) != null && (mo7946xf939df192 = m82555x4905e9fa2.mo7946xf939df19()) != null) {
                mo7946xf939df192.m8146xced61ae5();
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[refreshData] Cost=");
        sb6.append(java.lang.System.currentTimeMillis() - this.f188270e);
        sb6.append("ms, succ:");
        sb6.append(linkedList != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DrawerPresenter", sb6.toString());
        this.f188271f.b(fp0.u.f346823f);
        return jz5.f0.f384359a;
    }
}
