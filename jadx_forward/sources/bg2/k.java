package bg2;

/* loaded from: classes10.dex */
public final class k extends tc2.c implements tc2.h, qi2.r1 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f101754e;

    /* renamed from: f, reason: collision with root package name */
    public final int f101755f;

    /* renamed from: g, reason: collision with root package name */
    public long f101756g;

    /* renamed from: h, reason: collision with root package name */
    public ri2.a f101757h;

    /* renamed from: i, reason: collision with root package name */
    public xi2.g f101758i;

    /* renamed from: m, reason: collision with root package name */
    public xi2.g f101759m;

    /* renamed from: n, reason: collision with root package name */
    public ai2.a f101760n;

    /* renamed from: o, reason: collision with root package name */
    public ai2.a f101761o;

    /* renamed from: p, reason: collision with root package name */
    public int f101762p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f101763q;

    /* renamed from: r, reason: collision with root package name */
    public final bg2.j f101764r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f101765s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f101766t;

    /* renamed from: u, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f101767u;

    /* renamed from: v, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f101768v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(tc2.g store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f101754e = "LiveConvertBattleUIController";
        this.f101755f = 1;
        this.f101762p = 0;
        this.f101764r = new bg2.j(this);
    }

    @Override // tc2.c
    public void P6() {
        android.view.View rootView;
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2;
        android.view.View rootView2;
        android.widget.ImageView imageView;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        tc2.g gVar = this.f498674d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = gVar.f498681h;
        this.f101765s = (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null) ? null : feedObject.f66949xdec927b;
        in5.s0 s0Var = gVar.f498682i;
        android.view.View p17 = s0Var != null ? s0Var.p(com.p314xaae8f345.mm.R.id.ep9) : null;
        if (p17 != null) {
            this.f101757h = new ri2.j(p17, this);
        }
        bg2.j jVar = this.f101764r;
        if (p17 != null && (c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) p17.findViewById(com.p314xaae8f345.mm.R.id.eou)) != null) {
            this.f101758i = new jd2.d(c22789xd23e9a9b, jVar);
        }
        if (p17 != null && (rootView2 = p17.getRootView()) != null && (imageView = (android.widget.ImageView) rootView2.findViewById(com.p314xaae8f345.mm.R.id.g98)) != null) {
            this.f101759m = new xi2.k(imageView, jVar);
        }
        if (p17 != null && (viewGroup2 = (android.view.ViewGroup) p17.findViewById(com.p314xaae8f345.mm.R.id.eoh)) != null) {
            this.f101760n = new lj2.d(viewGroup2, this);
        }
        if (p17 != null && (rootView = p17.getRootView()) != null && (viewGroup = (android.view.ViewGroup) rootView.findViewById(com.p314xaae8f345.mm.R.id.exz)) != null) {
            this.f101761o = new lj2.b(viewGroup);
        }
        if (p17 != null) {
            ym5.a1.h(p17, new bg2.g(this));
        }
    }

    @Override // tc2.c
    public void U6() {
        h7();
    }

    @Override // tc2.c
    public void X6() {
        xi2.g gVar = this.f101758i;
        if (gVar != null) {
            ((jd2.d) gVar).mo140756x6761d4f();
        }
        xi2.g gVar2 = this.f101759m;
        if (gVar2 != null) {
            ((xi2.k) gVar2).mo140756x6761d4f();
        }
    }

    public final void Y6(boolean z17) {
        r45.r22 r22Var;
        java.lang.Object obj;
        ri2.a aVar = this.f101757h;
        if (aVar != null) {
            if (f7() != null) {
                this.f101762p = this.f101755f;
                if (d7() <= 1) {
                    ai2.a aVar2 = this.f101760n;
                    if (aVar2 != null) {
                        ((lj2.d) aVar2).j(z17, f7());
                    }
                } else {
                    dk2.u4 f76 = f7();
                    if (f76 != null) {
                        int i17 = f76.f315693g;
                        if (i17 != 2 && f76.f315690d == 3) {
                            ai2.a aVar3 = this.f101761o;
                            if (aVar3 != null) {
                                ((lj2.b) aVar3).j(z17, f76);
                            }
                        } else if (i17 == 2) {
                            java.util.List list = f76.f315696j;
                            if (list != null) {
                                java.util.Iterator it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj = null;
                                        break;
                                    } else {
                                        obj = it.next();
                                        if (((r45.r22) obj).m75939xb282bd08(2) != 3) {
                                            break;
                                        }
                                    }
                                }
                                r22Var = (r45.r22) obj;
                            } else {
                                r22Var = null;
                            }
                            if (r22Var == null) {
                                ai2.a aVar4 = this.f101761o;
                                if (aVar4 != null) {
                                    ((lj2.b) aVar4).j(z17, f76);
                                }
                            }
                        }
                    }
                    java.util.Iterator it6 = g7().iterator();
                    while (it6.hasNext()) {
                        ai2.a aVar5 = (ai2.a) it6.next();
                        if (aVar5 != null) {
                            aVar5.j(z17, f7());
                        }
                    }
                }
            }
            ri2.j jVar = (ri2.j) aVar;
            if (jVar.f477591a != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("battleEnd getCurBattle():");
                bg2.k kVar = jVar.f477592b;
                sb6.append(kVar.f7());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(jVar.f477593c, sb6.toString());
                android.widget.TextView textView = jVar.f477608r;
                if (textView != null) {
                    textView.setText(no0.m.f420263a.b(0, ":"));
                }
                p3325xe03a0797.p3326xc267989b.r2 r2Var = jVar.A;
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                }
                if (kVar.f7() != null) {
                    android.view.View view = jVar.f477607q;
                    if (view != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "battleEnd", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "battleEnd", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    if (z17) {
                        return;
                    }
                    jVar.e();
                }
            }
        }
    }

    public final void Z6(boolean z17) {
        xi2.g e76;
        java.lang.String str;
        java.util.ArrayList arrayList;
        zy2.a aVar;
        zy2.a8 liveFeedDecorator;
        zy2.a8 liveFeedDecorator2;
        zy2.a aVar2;
        zy2.a8 liveFeedDecorator3;
        r45.wk6 wk6Var;
        r45.wk6 wk6Var2;
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj;
        java.util.LinkedList m75941xfb8219142;
        java.lang.Object obj2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f101754e, "battleStart withAnim:" + z17);
        if (this.f101757h == null) {
            return;
        }
        boolean z18 = false;
        this.f101762p = 0;
        ai2.a aVar3 = this.f101760n;
        if (aVar3 != null) {
            ((lj2.d) aVar3).i(z17);
        }
        ai2.a aVar4 = this.f101761o;
        if (aVar4 != null) {
            ((lj2.b) aVar4).i(z17);
        }
        for (ai2.a aVar5 : g7()) {
            if (aVar5 != null) {
                aVar5.i(z17);
            }
        }
        ri2.a aVar6 = this.f101757h;
        if (aVar6 != null) {
            ri2.j jVar = (ri2.j) aVar6;
            android.view.View view = jVar.f477591a;
            android.content.Context context = view != null ? view.getContext() : null;
            if (context != null) {
                jVar.d(0);
                p3325xe03a0797.p3326xc267989b.y0 y0Var = jVar.f477592b.f498674d.f498680g;
                if (y0Var != null) {
                    p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new ri2.e(jVar, context, null), 3, null);
                }
                android.view.View view2 = jVar.f477591a;
                if (view2 != null) {
                    android.view.View view3 = jVar.f477615y;
                    if (view3 != null) {
                        view3.setBackgroundDrawable(view2.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a0c));
                    }
                    android.view.View view4 = jVar.f477616z;
                    if (view4 != null) {
                        view4.setBackgroundDrawable(view2.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a0b));
                    }
                    dk2.u4 f76 = jVar.f477592b.f7();
                    if (f76 != null && f76.f315693g == 2) {
                        r45.r22 r22Var = (r45.r22) kz5.n0.a0(f76.f315696j, 0);
                        if (r22Var == null || (m75941xfb8219142 = r22Var.m75941xfb821914(0)) == null) {
                            wk6Var = null;
                        } else {
                            synchronized (m75941xfb8219142) {
                                java.util.Iterator it = m75941xfb8219142.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.wk6) obj2).m75945x2fec8307(0), jVar.f477592b.f101765s)) {
                                            break;
                                        }
                                    } else {
                                        obj2 = null;
                                        break;
                                    }
                                }
                            }
                            wk6Var = (r45.wk6) obj2;
                        }
                        if (wk6Var != null) {
                            android.view.View view5 = jVar.f477615y;
                            if (view5 != null) {
                                view5.setBackgroundDrawable(view2.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a0c));
                            }
                            android.view.View view6 = jVar.f477616z;
                            if (view6 != null) {
                                view6.setBackgroundDrawable(view2.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a0b));
                            }
                        }
                        r45.r22 r22Var2 = (r45.r22) kz5.n0.a0(f76.f315696j, 1);
                        if (r22Var2 == null || (m75941xfb821914 = r22Var2.m75941xfb821914(0)) == null) {
                            wk6Var2 = null;
                        } else {
                            synchronized (m75941xfb821914) {
                                java.util.Iterator it6 = m75941xfb821914.iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        obj = it6.next();
                                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.wk6) obj).m75945x2fec8307(0), jVar.f477592b.f101765s)) {
                                            break;
                                        }
                                    } else {
                                        obj = null;
                                        break;
                                    }
                                }
                            }
                            wk6Var2 = (r45.wk6) obj;
                        }
                        if (wk6Var2 != null) {
                            android.view.View view7 = jVar.f477615y;
                            if (view7 != null) {
                                view7.setBackgroundDrawable(view2.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a0b));
                            }
                            android.view.View view8 = jVar.f477616z;
                            if (view8 != null) {
                                view8.setBackgroundDrawable(view2.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a0c));
                            }
                        }
                    }
                }
                android.widget.TextView textView = jVar.f477596f;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                android.view.View view9 = jVar.f477597g;
                if (view9 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view9, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view9.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view9, "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View view10 = jVar.f477607q;
                if (view10 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view10, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view10.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view10, "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                p3325xe03a0797.p3326xc267989b.r2 r2Var = jVar.A;
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                }
                p3325xe03a0797.p3326xc267989b.y0 y0Var2 = jVar.f477592b.f498674d.f498680g;
                jVar.A = y0Var2 != null ? p3325xe03a0797.p3326xc267989b.l.d(y0Var2, null, null, new ri2.b(jVar, null), 3, null) : null;
                android.widget.TextView textView2 = jVar.f477608r;
                if (textView2 != null) {
                    no0.l lVar = no0.m.f420263a;
                    dk2.u4 f77 = jVar.f477592b.f7();
                    textView2.setText(lVar.b(f77 != null ? f77.f315689c : 0, ":"));
                }
                uc2.g gVar = (uc2.g) jVar.f477592b.O6(uc2.g.class);
                cw2.da Z6 = gVar != null ? ((sb2.l) gVar).Z6() : null;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b c15182x1607686b = Z6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b) Z6 : null;
                jz5.l m61341x8cf660c8 = c15182x1607686b != null ? c15182x1607686b.m61341x8cf660c8() : null;
                if (m61341x8cf660c8 != null) {
                    int B0 = zl2.r4.f555483a.B0(((java.lang.Number) m61341x8cf660c8.f384366d).intValue(), ((java.lang.Number) m61341x8cf660c8.f384367e).intValue());
                    android.view.View view11 = jVar.f477591a;
                    if (view11 != null) {
                        view11.setPadding(0, B0, 0, 0);
                    }
                    if (view11 != null) {
                        view11.requestLayout();
                    }
                }
                if (z17) {
                    ya2.g gVar2 = ya2.h.f542017a;
                    bg2.k kVar = jVar.f477592b;
                    ya2.b2 b17 = gVar2.b(kVar.f101765s);
                    java.lang.String m176700xe5e0d2a0 = b17 != null ? b17.m176700xe5e0d2a0() : null;
                    ya2.b2 b18 = gVar2.b(kVar.f101765s);
                    java.lang.String w07 = b18 != null ? b18.w0() : null;
                    android.widget.ImageView imageView = jVar.f477601k;
                    if (imageView != null) {
                        mn2.g1 g1Var = mn2.g1.f411508a;
                        g1Var.a().c(new mn2.n(m176700xe5e0d2a0, null, 2, null), imageView, g1Var.h(mn2.f1.f411490h));
                    }
                    android.widget.TextView textView3 = jVar.f477602l;
                    if (textView3 != null) {
                        textView3.setText(w07);
                    }
                    ri2.c cVar = new ri2.c(jVar);
                    uc2.g gVar3 = (uc2.g) kVar.O6(uc2.g.class);
                    cw2.da Z62 = gVar3 != null ? ((sb2.l) gVar3).Z6() : null;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b c15182x1607686b2 = Z62 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b) Z62 : null;
                    java.util.List h17 = (c15182x1607686b2 == null || (liveFeedDecorator3 = c15182x1607686b2.getLiveFeedDecorator()) == null) ? null : ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uf) liveFeedDecorator3).h();
                    if (h17 == null || (aVar2 = (zy2.a) kz5.n0.Z(h17)) == null || (str = aVar2.f558867a) == null) {
                        str = "";
                    }
                    if (c15182x1607686b2 != null && (liveFeedDecorator2 = c15182x1607686b2.getLiveFeedDecorator()) != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uf ufVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uf) liveFeedDecorator2;
                        java.lang.String j17 = ufVar.j();
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getPkUserData sdkUserId：");
                        sb6.append(str);
                        sb6.append(" micUserCache: ");
                        java.util.HashMap hashMap = ufVar.f190708u;
                        sb6.append(hashMap);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j17, sb6.toString());
                        if (hashMap.get(str) != null) {
                            km2.q qVar = (km2.q) hashMap.get(str);
                            if (qVar != null) {
                                cVar.mo146xb9724478(qVar);
                            }
                            z18 = true;
                        } else {
                            ufVar.C.put(str, cVar);
                            if (!ufVar.f190695h) {
                                ufVar.r();
                            }
                        }
                    }
                    java.lang.String str2 = jVar.f477593c;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "setCurLinkMicUserInfo anchorList: " + h17 + " otherAnchorUserId: " + str + " result: " + z18);
                    if (c15182x1607686b2 != null && (liveFeedDecorator = c15182x1607686b2.getLiveFeedDecorator()) != null) {
                        ri2.h hVar = new ri2.h(jVar);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kf kfVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uf) liveFeedDecorator).f190701n;
                        kfVar.getClass();
                        kfVar.C = hVar;
                    }
                    if (!z18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "loadOtherUserInfo use joinLiveData");
                        bg2.d dVar = (bg2.d) kVar.N6(bg2.d.class);
                        if (dVar != null && (arrayList = dVar.f101530i) != null && (aVar = (zy2.a) kz5.n0.Z(arrayList)) != null) {
                            jVar.c(aVar.f558871e, aVar.f558868b, aVar.f558870d, aVar.f558867a);
                        }
                    }
                } else {
                    android.view.View view12 = jVar.f477599i;
                    if (view12 != null) {
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                        arrayList4.add(8);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(view12, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view12.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(view12, "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    jVar.e();
                    android.view.View view13 = jVar.f477607q;
                    if (view13 != null) {
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                        arrayList5.add(0);
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(view13, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view13.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                        yj0.a.f(view13, "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view14 = jVar.f477609s;
                    if (view14 != null) {
                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                        arrayList6.add(0);
                        java.util.Collections.reverse(arrayList6);
                        yj0.a.d(view14, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view14.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                        yj0.a.f(view14, "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view15 = jVar.f477610t;
                    if (view15 != null) {
                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
                        arrayList7.add(8);
                        java.util.Collections.reverse(arrayList7);
                        yj0.a.d(view15, arrayList7.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view15.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                        yj0.a.f(view15, "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }
        }
        if (!z17) {
            xi2.g e77 = e7();
            if (e77 != null) {
                e77.mo140757x901b6914(8);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f498674d.f498681h;
        so2.h1 h1Var = abstractC14490x69736cb5 instanceof so2.h1 ? (so2.h1) abstractC14490x69736cb5 : null;
        if (h1Var != null) {
            dk2.u4 f78 = f7();
            h1Var.f491912f = f78 != null ? f78.f315687a : null;
        }
        p3325xe03a0797.p3326xc267989b.y0 y0Var3 = this.f498674d.f498680g;
        if (y0Var3 == null || (e76 = e7()) == null) {
            return;
        }
        e76.b(y0Var3);
    }

    public final void a7(long j17) {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f101767u;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f498674d.f498680g;
        this.f101767u = y0Var != null ? p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new bg2.e(this, j17, null), 3, null) : null;
    }

    public final void b7(long j17) {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f101768v;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f498674d.f498680g;
        this.f101768v = y0Var != null ? p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new bg2.f(this, j17, null), 3, null) : null;
    }

    public final java.util.List c7() {
        zy2.a8 liveFeedDecorator;
        uc2.g gVar = (uc2.g) O6(uc2.g.class);
        zy2.g5 Z6 = gVar != null ? ((sb2.l) gVar).Z6() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b c15182x1607686b = Z6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b) Z6 : null;
        return (c15182x1607686b == null || (liveFeedDecorator = c15182x1607686b.getLiveFeedDecorator()) == null) ? new java.util.ArrayList() : ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uf) liveFeedDecorator).h();
    }

    public final int d7() {
        java.util.ArrayList arrayList;
        zy2.a8 liveFeedDecorator;
        uc2.g gVar = (uc2.g) O6(uc2.g.class);
        zy2.g5 Z6 = gVar != null ? ((sb2.l) gVar).Z6() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b c15182x1607686b = Z6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b) Z6 : null;
        if (c15182x1607686b != null && (liveFeedDecorator = c15182x1607686b.getLiveFeedDecorator()) != null) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uf) liveFeedDecorator).h().size();
        }
        bg2.d dVar = (bg2.d) N6(bg2.d.class);
        if (dVar == null || (arrayList = dVar.f101530i) == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final xi2.g e7() {
        xi2.g gVar;
        return (d7() <= 1 || (gVar = this.f101759m) == null) ? this.f101758i : gVar;
    }

    public final dk2.u4 f7() {
        bg2.d dVar = (bg2.d) N6(bg2.d.class);
        if (dVar != null) {
            return dVar.f101529h;
        }
        return null;
    }

    public final java.util.ArrayList g7() {
        zy2.a8 liveFeedDecorator;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        uc2.g gVar = (uc2.g) O6(uc2.g.class);
        zy2.g5 Z6 = gVar != null ? ((sb2.l) gVar).Z6() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b c15182x1607686b = Z6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b) Z6 : null;
        if (c15182x1607686b != null && (liveFeedDecorator = c15182x1607686b.getLiveFeedDecorator()) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.C22840x82866af5 c22840x82866af5 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uf) liveFeedDecorator).f190690c;
            if (c22840x82866af5 != null) {
                int childCount = c22840x82866af5.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    android.view.View childAt = c22840x82866af5.getChildAt(i17);
                    if (childAt instanceof xh2.f) {
                        arrayList2.add(childAt);
                    }
                }
            }
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ai2.a mo175548x1de6fcf4 = ((xh2.f) it.next()).mo175548x1de6fcf4();
                if (mo175548x1de6fcf4 != null) {
                    arrayList.add(mo175548x1de6fcf4);
                }
            }
        }
        return arrayList;
    }

    public final void h7() {
        this.f101762p = 0;
        xi2.g gVar = this.f101758i;
        if (gVar != null) {
            ((jd2.d) gVar).mo140756x6761d4f();
        }
        xi2.g gVar2 = this.f101759m;
        if (gVar2 != null) {
            ((xi2.k) gVar2).mo140756x6761d4f();
        }
        ai2.a aVar = this.f101760n;
        if (aVar != null) {
            ((lj2.d) aVar).mo2073x6761d4f();
        }
        java.util.Iterator it = g7().iterator();
        while (it.hasNext()) {
            ai2.a aVar2 = (ai2.a) it.next();
            if (aVar2 != null) {
                aVar2.mo2073x6761d4f();
            }
        }
        ai2.a aVar3 = this.f101761o;
        if (aVar3 != null) {
            ((lj2.b) aVar3).mo2073x6761d4f();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f101754e, "battle setVisible: 8");
        ri2.a aVar4 = this.f101757h;
        if (aVar4 != null) {
            ((ri2.j) aVar4).d(8);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f101768v;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f101767u;
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
        }
        ri2.a aVar5 = this.f101757h;
        if (aVar5 != null) {
            ri2.j jVar = (ri2.j) aVar5;
            jVar.d(8);
            p3325xe03a0797.p3326xc267989b.r2 r2Var3 = jVar.A;
            if (r2Var3 != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var3, null, 1, null);
            }
            jVar.A = null;
        }
    }

    public final void i7() {
        ri2.a aVar = this.f101757h;
        if (aVar != null) {
            ri2.j jVar = (ri2.j) aVar;
            java.lang.Long b17 = jVar.b();
            java.lang.Long a17 = jVar.a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(jVar.f477593c, "updateBattleInfo: selfBattleWeCoinHot:" + b17 + " otherBattleWecoinHot:" + a17 + " otherAnchorUserName: " + jVar.f477592b.f101766t);
            android.widget.TextView textView = jVar.f477611u;
            if (textView != null) {
                textView.setVisibility(8);
            }
            android.widget.TextView textView2 = jVar.f477612v;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            jVar.f(b17, a17, false);
        }
    }

    @Override // tc2.h
    /* renamed from: onLiveMsg */
    public void mo10406x5aa1c816(r45.r71 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        if (f7() != null) {
            this.f101763q = true;
            i7();
        }
    }

    @Override // tc2.h
    /* renamed from: onLiveStart */
    public void mo10403x39a513b7(r45.hc1 hc1Var) {
        if (f7() != null) {
            i7();
        }
    }

    @Override // qi2.r1
    public km2.k s3() {
        dk2.u4 f76 = f7();
        java.lang.String str = null;
        if (f76 == null) {
            return null;
        }
        java.lang.String str2 = this.f101766t;
        if (str2 == null) {
            zy2.a aVar = (zy2.a) kz5.n0.Z(c7());
            if (aVar != null) {
                str = aVar.f558868b;
            }
        } else {
            str = str2;
        }
        return f76.c(str);
    }

    @Override // qi2.r1
    public km2.k t5() {
        dk2.u4 f76 = f7();
        if (f76 != null) {
            return f76.e(this.f101765s);
        }
        return null;
    }

    @Override // qi2.r1
    public dk2.u4 y3() {
        return f7();
    }
}
