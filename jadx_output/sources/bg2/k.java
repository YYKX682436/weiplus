package bg2;

/* loaded from: classes10.dex */
public final class k extends tc2.c implements tc2.h, qi2.r1 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f20221e;

    /* renamed from: f, reason: collision with root package name */
    public final int f20222f;

    /* renamed from: g, reason: collision with root package name */
    public long f20223g;

    /* renamed from: h, reason: collision with root package name */
    public ri2.a f20224h;

    /* renamed from: i, reason: collision with root package name */
    public xi2.g f20225i;

    /* renamed from: m, reason: collision with root package name */
    public xi2.g f20226m;

    /* renamed from: n, reason: collision with root package name */
    public ai2.a f20227n;

    /* renamed from: o, reason: collision with root package name */
    public ai2.a f20228o;

    /* renamed from: p, reason: collision with root package name */
    public int f20229p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f20230q;

    /* renamed from: r, reason: collision with root package name */
    public final bg2.j f20231r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f20232s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f20233t;

    /* renamed from: u, reason: collision with root package name */
    public kotlinx.coroutines.r2 f20234u;

    /* renamed from: v, reason: collision with root package name */
    public kotlinx.coroutines.r2 f20235v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f20221e = "LiveConvertBattleUIController";
        this.f20222f = 1;
        this.f20229p = 0;
        this.f20231r = new bg2.j(this);
    }

    @Override // tc2.c
    public void P6() {
        android.view.View rootView;
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2;
        android.view.View rootView2;
        android.widget.ImageView imageView;
        com.tencent.mm.view.MMPAGView mMPAGView;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        tc2.g gVar = this.f417141d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = gVar.f417148h;
        this.f20232s = (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null) ? null : feedObject.field_username;
        in5.s0 s0Var = gVar.f417149i;
        android.view.View p17 = s0Var != null ? s0Var.p(com.tencent.mm.R.id.ep9) : null;
        if (p17 != null) {
            this.f20224h = new ri2.j(p17, this);
        }
        bg2.j jVar = this.f20231r;
        if (p17 != null && (mMPAGView = (com.tencent.mm.view.MMPAGView) p17.findViewById(com.tencent.mm.R.id.eou)) != null) {
            this.f20225i = new jd2.d(mMPAGView, jVar);
        }
        if (p17 != null && (rootView2 = p17.getRootView()) != null && (imageView = (android.widget.ImageView) rootView2.findViewById(com.tencent.mm.R.id.g98)) != null) {
            this.f20226m = new xi2.k(imageView, jVar);
        }
        if (p17 != null && (viewGroup2 = (android.view.ViewGroup) p17.findViewById(com.tencent.mm.R.id.eoh)) != null) {
            this.f20227n = new lj2.d(viewGroup2, this);
        }
        if (p17 != null && (rootView = p17.getRootView()) != null && (viewGroup = (android.view.ViewGroup) rootView.findViewById(com.tencent.mm.R.id.exz)) != null) {
            this.f20228o = new lj2.b(viewGroup);
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
        xi2.g gVar = this.f20225i;
        if (gVar != null) {
            ((jd2.d) gVar).reset();
        }
        xi2.g gVar2 = this.f20226m;
        if (gVar2 != null) {
            ((xi2.k) gVar2).reset();
        }
    }

    public final void Y6(boolean z17) {
        r45.r22 r22Var;
        java.lang.Object obj;
        ri2.a aVar = this.f20224h;
        if (aVar != null) {
            if (f7() != null) {
                this.f20229p = this.f20222f;
                if (d7() <= 1) {
                    ai2.a aVar2 = this.f20227n;
                    if (aVar2 != null) {
                        ((lj2.d) aVar2).j(z17, f7());
                    }
                } else {
                    dk2.u4 f76 = f7();
                    if (f76 != null) {
                        int i17 = f76.f234160g;
                        if (i17 != 2 && f76.f234157d == 3) {
                            ai2.a aVar3 = this.f20228o;
                            if (aVar3 != null) {
                                ((lj2.b) aVar3).j(z17, f76);
                            }
                        } else if (i17 == 2) {
                            java.util.List list = f76.f234163j;
                            if (list != null) {
                                java.util.Iterator it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj = null;
                                        break;
                                    } else {
                                        obj = it.next();
                                        if (((r45.r22) obj).getInteger(2) != 3) {
                                            break;
                                        }
                                    }
                                }
                                r22Var = (r45.r22) obj;
                            } else {
                                r22Var = null;
                            }
                            if (r22Var == null) {
                                ai2.a aVar4 = this.f20228o;
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
            if (jVar.f396058a != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("battleEnd getCurBattle():");
                bg2.k kVar = jVar.f396059b;
                sb6.append(kVar.f7());
                com.tencent.mars.xlog.Log.i(jVar.f396060c, sb6.toString());
                android.widget.TextView textView = jVar.f396075r;
                if (textView != null) {
                    textView.setText(no0.m.f338730a.b(0, ":"));
                }
                kotlinx.coroutines.r2 r2Var = jVar.A;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                if (kVar.f7() != null) {
                    android.view.View view = jVar.f396074q;
                    if (view != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
        java.util.LinkedList list;
        java.lang.Object obj;
        java.util.LinkedList list2;
        java.lang.Object obj2;
        com.tencent.mars.xlog.Log.i(this.f20221e, "battleStart withAnim:" + z17);
        if (this.f20224h == null) {
            return;
        }
        boolean z18 = false;
        this.f20229p = 0;
        ai2.a aVar3 = this.f20227n;
        if (aVar3 != null) {
            ((lj2.d) aVar3).i(z17);
        }
        ai2.a aVar4 = this.f20228o;
        if (aVar4 != null) {
            ((lj2.b) aVar4).i(z17);
        }
        for (ai2.a aVar5 : g7()) {
            if (aVar5 != null) {
                aVar5.i(z17);
            }
        }
        ri2.a aVar6 = this.f20224h;
        if (aVar6 != null) {
            ri2.j jVar = (ri2.j) aVar6;
            android.view.View view = jVar.f396058a;
            android.content.Context context = view != null ? view.getContext() : null;
            if (context != null) {
                jVar.d(0);
                kotlinx.coroutines.y0 y0Var = jVar.f396059b.f417141d.f417147g;
                if (y0Var != null) {
                    kotlinx.coroutines.l.d(y0Var, null, null, new ri2.e(jVar, context, null), 3, null);
                }
                android.view.View view2 = jVar.f396058a;
                if (view2 != null) {
                    android.view.View view3 = jVar.f396082y;
                    if (view3 != null) {
                        view3.setBackgroundDrawable(view2.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.a0c));
                    }
                    android.view.View view4 = jVar.f396083z;
                    if (view4 != null) {
                        view4.setBackgroundDrawable(view2.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.a0b));
                    }
                    dk2.u4 f76 = jVar.f396059b.f7();
                    if (f76 != null && f76.f234160g == 2) {
                        r45.r22 r22Var = (r45.r22) kz5.n0.a0(f76.f234163j, 0);
                        if (r22Var == null || (list2 = r22Var.getList(0)) == null) {
                            wk6Var = null;
                        } else {
                            synchronized (list2) {
                                java.util.Iterator it = list2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        if (kotlin.jvm.internal.o.b(((r45.wk6) obj2).getString(0), jVar.f396059b.f20232s)) {
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
                            android.view.View view5 = jVar.f396082y;
                            if (view5 != null) {
                                view5.setBackgroundDrawable(view2.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.a0c));
                            }
                            android.view.View view6 = jVar.f396083z;
                            if (view6 != null) {
                                view6.setBackgroundDrawable(view2.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.a0b));
                            }
                        }
                        r45.r22 r22Var2 = (r45.r22) kz5.n0.a0(f76.f234163j, 1);
                        if (r22Var2 == null || (list = r22Var2.getList(0)) == null) {
                            wk6Var2 = null;
                        } else {
                            synchronized (list) {
                                java.util.Iterator it6 = list.iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        obj = it6.next();
                                        if (kotlin.jvm.internal.o.b(((r45.wk6) obj).getString(0), jVar.f396059b.f20232s)) {
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
                            android.view.View view7 = jVar.f396082y;
                            if (view7 != null) {
                                view7.setBackgroundDrawable(view2.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.a0b));
                            }
                            android.view.View view8 = jVar.f396083z;
                            if (view8 != null) {
                                view8.setBackgroundDrawable(view2.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.a0c));
                            }
                        }
                    }
                }
                android.widget.TextView textView = jVar.f396063f;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                android.view.View view9 = jVar.f396064g;
                if (view9 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view9, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view9.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view9, "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View view10 = jVar.f396074q;
                if (view10 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view10, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view10.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view10, "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                kotlinx.coroutines.r2 r2Var = jVar.A;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                kotlinx.coroutines.y0 y0Var2 = jVar.f396059b.f417141d.f417147g;
                jVar.A = y0Var2 != null ? kotlinx.coroutines.l.d(y0Var2, null, null, new ri2.b(jVar, null), 3, null) : null;
                android.widget.TextView textView2 = jVar.f396075r;
                if (textView2 != null) {
                    no0.l lVar = no0.m.f338730a;
                    dk2.u4 f77 = jVar.f396059b.f7();
                    textView2.setText(lVar.b(f77 != null ? f77.f234156c : 0, ":"));
                }
                uc2.g gVar = (uc2.g) jVar.f396059b.O6(uc2.g.class);
                cw2.da Z6 = gVar != null ? ((sb2.l) gVar).Z6() : null;
                com.tencent.mm.plugin.finder.video.FinderLivePlayView finderLivePlayView = Z6 instanceof com.tencent.mm.plugin.finder.video.FinderLivePlayView ? (com.tencent.mm.plugin.finder.video.FinderLivePlayView) Z6 : null;
                jz5.l videoParam = finderLivePlayView != null ? finderLivePlayView.getVideoParam() : null;
                if (videoParam != null) {
                    int B0 = zl2.r4.f473950a.B0(((java.lang.Number) videoParam.f302833d).intValue(), ((java.lang.Number) videoParam.f302834e).intValue());
                    android.view.View view11 = jVar.f396058a;
                    if (view11 != null) {
                        view11.setPadding(0, B0, 0, 0);
                    }
                    if (view11 != null) {
                        view11.requestLayout();
                    }
                }
                if (z17) {
                    ya2.g gVar2 = ya2.h.f460484a;
                    bg2.k kVar = jVar.f396059b;
                    ya2.b2 b17 = gVar2.b(kVar.f20232s);
                    java.lang.String avatarUrl = b17 != null ? b17.getAvatarUrl() : null;
                    ya2.b2 b18 = gVar2.b(kVar.f20232s);
                    java.lang.String w07 = b18 != null ? b18.w0() : null;
                    android.widget.ImageView imageView = jVar.f396068k;
                    if (imageView != null) {
                        mn2.g1 g1Var = mn2.g1.f329975a;
                        g1Var.a().c(new mn2.n(avatarUrl, null, 2, null), imageView, g1Var.h(mn2.f1.f329957h));
                    }
                    android.widget.TextView textView3 = jVar.f396069l;
                    if (textView3 != null) {
                        textView3.setText(w07);
                    }
                    ri2.c cVar = new ri2.c(jVar);
                    uc2.g gVar3 = (uc2.g) kVar.O6(uc2.g.class);
                    cw2.da Z62 = gVar3 != null ? ((sb2.l) gVar3).Z6() : null;
                    com.tencent.mm.plugin.finder.video.FinderLivePlayView finderLivePlayView2 = Z62 instanceof com.tencent.mm.plugin.finder.video.FinderLivePlayView ? (com.tencent.mm.plugin.finder.video.FinderLivePlayView) Z62 : null;
                    java.util.List h17 = (finderLivePlayView2 == null || (liveFeedDecorator3 = finderLivePlayView2.getLiveFeedDecorator()) == null) ? null : ((com.tencent.mm.plugin.finder.feed.uf) liveFeedDecorator3).h();
                    if (h17 == null || (aVar2 = (zy2.a) kz5.n0.Z(h17)) == null || (str = aVar2.f477334a) == null) {
                        str = "";
                    }
                    if (finderLivePlayView2 != null && (liveFeedDecorator2 = finderLivePlayView2.getLiveFeedDecorator()) != null) {
                        com.tencent.mm.plugin.finder.feed.uf ufVar = (com.tencent.mm.plugin.finder.feed.uf) liveFeedDecorator2;
                        java.lang.String j17 = ufVar.j();
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getPkUserData sdkUserId：");
                        sb6.append(str);
                        sb6.append(" micUserCache: ");
                        java.util.HashMap hashMap = ufVar.f109175u;
                        sb6.append(hashMap);
                        com.tencent.mars.xlog.Log.i(j17, sb6.toString());
                        if (hashMap.get(str) != null) {
                            km2.q qVar = (km2.q) hashMap.get(str);
                            if (qVar != null) {
                                cVar.invoke(qVar);
                            }
                            z18 = true;
                        } else {
                            ufVar.C.put(str, cVar);
                            if (!ufVar.f109162h) {
                                ufVar.r();
                            }
                        }
                    }
                    java.lang.String str2 = jVar.f396060c;
                    com.tencent.mars.xlog.Log.i(str2, "setCurLinkMicUserInfo anchorList: " + h17 + " otherAnchorUserId: " + str + " result: " + z18);
                    if (finderLivePlayView2 != null && (liveFeedDecorator = finderLivePlayView2.getLiveFeedDecorator()) != null) {
                        ri2.h hVar = new ri2.h(jVar);
                        com.tencent.mm.plugin.finder.feed.kf kfVar = ((com.tencent.mm.plugin.finder.feed.uf) liveFeedDecorator).f109168n;
                        kfVar.getClass();
                        kfVar.C = hVar;
                    }
                    if (!z18) {
                        com.tencent.mars.xlog.Log.i(str2, "loadOtherUserInfo use joinLiveData");
                        bg2.d dVar = (bg2.d) kVar.N6(bg2.d.class);
                        if (dVar != null && (arrayList = dVar.f19997i) != null && (aVar = (zy2.a) kz5.n0.Z(arrayList)) != null) {
                            jVar.c(aVar.f477338e, aVar.f477335b, aVar.f477337d, aVar.f477334a);
                        }
                    }
                } else {
                    android.view.View view12 = jVar.f396066i;
                    if (view12 != null) {
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                        arrayList4.add(8);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(view12, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view12.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(view12, "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    jVar.e();
                    android.view.View view13 = jVar.f396074q;
                    if (view13 != null) {
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                        arrayList5.add(0);
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(view13, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view13.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                        yj0.a.f(view13, "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view14 = jVar.f396076s;
                    if (view14 != null) {
                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                        arrayList6.add(0);
                        java.util.Collections.reverse(arrayList6);
                        yj0.a.d(view14, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view14.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                        yj0.a.f(view14, "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view15 = jVar.f396077t;
                    if (view15 != null) {
                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
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
                e77.setVisibility(8);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f417141d.f417148h;
        so2.h1 h1Var = baseFinderFeed instanceof so2.h1 ? (so2.h1) baseFinderFeed : null;
        if (h1Var != null) {
            dk2.u4 f78 = f7();
            h1Var.f410379f = f78 != null ? f78.f234154a : null;
        }
        kotlinx.coroutines.y0 y0Var3 = this.f417141d.f417147g;
        if (y0Var3 == null || (e76 = e7()) == null) {
            return;
        }
        e76.b(y0Var3);
    }

    public final void a7(long j17) {
        kotlinx.coroutines.r2 r2Var = this.f20234u;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        kotlinx.coroutines.y0 y0Var = this.f417141d.f417147g;
        this.f20234u = y0Var != null ? kotlinx.coroutines.l.d(y0Var, null, null, new bg2.e(this, j17, null), 3, null) : null;
    }

    public final void b7(long j17) {
        kotlinx.coroutines.r2 r2Var = this.f20235v;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        kotlinx.coroutines.y0 y0Var = this.f417141d.f417147g;
        this.f20235v = y0Var != null ? kotlinx.coroutines.l.d(y0Var, null, null, new bg2.f(this, j17, null), 3, null) : null;
    }

    public final java.util.List c7() {
        zy2.a8 liveFeedDecorator;
        uc2.g gVar = (uc2.g) O6(uc2.g.class);
        zy2.g5 Z6 = gVar != null ? ((sb2.l) gVar).Z6() : null;
        com.tencent.mm.plugin.finder.video.FinderLivePlayView finderLivePlayView = Z6 instanceof com.tencent.mm.plugin.finder.video.FinderLivePlayView ? (com.tencent.mm.plugin.finder.video.FinderLivePlayView) Z6 : null;
        return (finderLivePlayView == null || (liveFeedDecorator = finderLivePlayView.getLiveFeedDecorator()) == null) ? new java.util.ArrayList() : ((com.tencent.mm.plugin.finder.feed.uf) liveFeedDecorator).h();
    }

    public final int d7() {
        java.util.ArrayList arrayList;
        zy2.a8 liveFeedDecorator;
        uc2.g gVar = (uc2.g) O6(uc2.g.class);
        zy2.g5 Z6 = gVar != null ? ((sb2.l) gVar).Z6() : null;
        com.tencent.mm.plugin.finder.video.FinderLivePlayView finderLivePlayView = Z6 instanceof com.tencent.mm.plugin.finder.video.FinderLivePlayView ? (com.tencent.mm.plugin.finder.video.FinderLivePlayView) Z6 : null;
        if (finderLivePlayView != null && (liveFeedDecorator = finderLivePlayView.getLiveFeedDecorator()) != null) {
            return ((com.tencent.mm.plugin.finder.feed.uf) liveFeedDecorator).h().size();
        }
        bg2.d dVar = (bg2.d) N6(bg2.d.class);
        if (dVar == null || (arrayList = dVar.f19997i) == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final xi2.g e7() {
        xi2.g gVar;
        return (d7() <= 1 || (gVar = this.f20226m) == null) ? this.f20225i : gVar;
    }

    public final dk2.u4 f7() {
        bg2.d dVar = (bg2.d) N6(bg2.d.class);
        if (dVar != null) {
            return dVar.f19996h;
        }
        return null;
    }

    public final java.util.ArrayList g7() {
        zy2.a8 liveFeedDecorator;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        uc2.g gVar = (uc2.g) O6(uc2.g.class);
        zy2.g5 Z6 = gVar != null ? ((sb2.l) gVar).Z6() : null;
        com.tencent.mm.plugin.finder.video.FinderLivePlayView finderLivePlayView = Z6 instanceof com.tencent.mm.plugin.finder.video.FinderLivePlayView ? (com.tencent.mm.plugin.finder.video.FinderLivePlayView) Z6 : null;
        if (finderLivePlayView != null && (liveFeedDecorator = finderLivePlayView.getLiveFeedDecorator()) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            com.tencent.mm.view.ratio.RatioLayout ratioLayout = ((com.tencent.mm.plugin.finder.feed.uf) liveFeedDecorator).f109157c;
            if (ratioLayout != null) {
                int childCount = ratioLayout.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    android.view.View childAt = ratioLayout.getChildAt(i17);
                    if (childAt instanceof xh2.f) {
                        arrayList2.add(childAt);
                    }
                }
            }
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ai2.a battleResultWidgetCallback = ((xh2.f) it.next()).getBattleResultWidgetCallback();
                if (battleResultWidgetCallback != null) {
                    arrayList.add(battleResultWidgetCallback);
                }
            }
        }
        return arrayList;
    }

    public final void h7() {
        this.f20229p = 0;
        xi2.g gVar = this.f20225i;
        if (gVar != null) {
            ((jd2.d) gVar).reset();
        }
        xi2.g gVar2 = this.f20226m;
        if (gVar2 != null) {
            ((xi2.k) gVar2).reset();
        }
        ai2.a aVar = this.f20227n;
        if (aVar != null) {
            ((lj2.d) aVar).reset();
        }
        java.util.Iterator it = g7().iterator();
        while (it.hasNext()) {
            ai2.a aVar2 = (ai2.a) it.next();
            if (aVar2 != null) {
                aVar2.reset();
            }
        }
        ai2.a aVar3 = this.f20228o;
        if (aVar3 != null) {
            ((lj2.b) aVar3).reset();
        }
        com.tencent.mars.xlog.Log.i(this.f20221e, "battle setVisible: 8");
        ri2.a aVar4 = this.f20224h;
        if (aVar4 != null) {
            ((ri2.j) aVar4).d(8);
        }
        kotlinx.coroutines.r2 r2Var = this.f20235v;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        kotlinx.coroutines.r2 r2Var2 = this.f20234u;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        ri2.a aVar5 = this.f20224h;
        if (aVar5 != null) {
            ri2.j jVar = (ri2.j) aVar5;
            jVar.d(8);
            kotlinx.coroutines.r2 r2Var3 = jVar.A;
            if (r2Var3 != null) {
                kotlinx.coroutines.p2.a(r2Var3, null, 1, null);
            }
            jVar.A = null;
        }
    }

    public final void i7() {
        ri2.a aVar = this.f20224h;
        if (aVar != null) {
            ri2.j jVar = (ri2.j) aVar;
            java.lang.Long b17 = jVar.b();
            java.lang.Long a17 = jVar.a();
            com.tencent.mars.xlog.Log.i(jVar.f396060c, "updateBattleInfo: selfBattleWeCoinHot:" + b17 + " otherBattleWecoinHot:" + a17 + " otherAnchorUserName: " + jVar.f396059b.f20233t);
            android.widget.TextView textView = jVar.f396078u;
            if (textView != null) {
                textView.setVisibility(8);
            }
            android.widget.TextView textView2 = jVar.f396079v;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            jVar.f(b17, a17, false);
        }
    }

    @Override // tc2.h
    public void onLiveMsg(r45.r71 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        if (f7() != null) {
            this.f20230q = true;
            i7();
        }
    }

    @Override // tc2.h
    public void onLiveStart(r45.hc1 hc1Var) {
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
        java.lang.String str2 = this.f20233t;
        if (str2 == null) {
            zy2.a aVar = (zy2.a) kz5.n0.Z(c7());
            if (aVar != null) {
                str = aVar.f477335b;
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
            return f76.e(this.f20232s);
        }
        return null;
    }

    @Override // qi2.r1
    public dk2.u4 y3() {
        return f7();
    }
}
