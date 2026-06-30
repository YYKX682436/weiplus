package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes8.dex */
public final class o2 implements com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.u {
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18560xf3dc9c4e A;
    public final uh4.i0 B;
    public final jz5.g C;

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.a2 f254188a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f254189b;

    /* renamed from: c, reason: collision with root package name */
    public int f254190c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6 f254191d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5 f254192e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.a6 f254193f;

    /* renamed from: j, reason: collision with root package name */
    public long f254197j;

    /* renamed from: k, reason: collision with root package name */
    public int f254198k;

    /* renamed from: l, reason: collision with root package name */
    public int f254199l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f254200m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashMap f254201n;

    /* renamed from: p, reason: collision with root package name */
    public int f254203p;

    /* renamed from: q, reason: collision with root package name */
    public long f254204q;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f254206s;

    /* renamed from: u, reason: collision with root package name */
    public long f254208u;

    /* renamed from: v, reason: collision with root package name */
    public long f254209v;

    /* renamed from: x, reason: collision with root package name */
    public int f254211x;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18561xf8b54113 f254212y;

    /* renamed from: z, reason: collision with root package name */
    public final l75.q0 f254213z;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f254194g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public java.util.ArrayList f254195h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.ArrayList f254196i = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f254202o = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public int f254205r = 60;

    /* renamed from: t, reason: collision with root package name */
    public final ih4.a f254207t = new ih4.a();

    /* renamed from: w, reason: collision with root package name */
    public final java.util.ArrayList f254210w = new java.util.ArrayList();

    static {
        new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z1(null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.taskbar.ui.TaskBarViewPresenter$taskBarUpdateEventListener$1] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.tencent.mm.plugin.taskbar.ui.TaskBarViewPresenter$homeTabChangedListener$1] */
    public o2() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f254212y = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6157x4f7ce339>(a0Var) { // from class: com.tencent.mm.plugin.taskbar.ui.TaskBarViewPresenter$taskBarUpdateEventListener$1
            {
                this.f39173x3fe91575 = -1489804983;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6157x4f7ce339 c6157x4f7ce339) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6157x4f7ce339 event = c6157x4f7ce339;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "received taskBarUpdateEventListener");
                com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2.this.b(true, 300L);
                return false;
            }
        };
        this.f254213z = new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.m2(this);
        this.A = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5643xca5254a8>(a0Var) { // from class: com.tencent.mm.plugin.taskbar.ui.TaskBarViewPresenter$homeTabChangedListener$1
            {
                this.f39173x3fe91575 = -1095690568;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5643xca5254a8 c5643xca5254a8) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5643xca5254a8 event = c5643xca5254a8;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 o2Var = com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2.this;
                boolean z17 = o2Var.f254203p == 0;
                am.nh nhVar = event.f135971g;
                if (nhVar != null) {
                    int i17 = nhVar.f88958a;
                    o2Var.f254203p = i17;
                    if (!z17) {
                        if (i17 == 0) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.a2 a2Var = o2Var.f254188a;
                            if (a2Var != null) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3) a2Var;
                                c18557xc00aa3f3.post(c18557xc00aa3f3.X2);
                                c18557xc00aa3f3.m1();
                            }
                            if (o2Var.f254198k == 1) {
                                ((ku5.t0) ku5.t0.f394148d).g(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.f2.f254145d);
                            }
                        }
                    }
                }
                return false;
            }
        };
        this.B = new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.n2(this);
        this.C = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.d2(this));
        this.f254201n = kz5.c1.i(new jz5.l(4, new lh4.n(4, new int[]{2, 21, 22, 25, 6, 4, 3})));
    }

    public final lh4.n a(int i17) {
        return (lh4.n) this.f254201n.get(java.lang.Integer.valueOf(i17));
    }

    public final void b(boolean z17, long j17) {
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.j2 j2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.j2(this, z17);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.t(j2Var, j17, "TaskBarReloadData");
    }

    public final synchronized void c(lh4.n viewModel) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.a2 a2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewModel, "viewModel");
        int size = viewModel.f400256c.size();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList c17 = lh4.n.f400252e.c();
        this.f254202o.clear();
        for (int i17 : viewModel.f400255b) {
            if (!lh4.n.f400252e.a(i17) && !c17.contains(java.lang.Integer.valueOf(i17))) {
                java.util.List Di = ((gh4.e0) ((gh4.s) i95.n0.c(gh4.s.class))).Di(i17);
                int size2 = Di.size();
                for (int i18 = 0; i18 < size2; i18++) {
                    if (i18 < 1) {
                        arrayList.add(Di.get(i18));
                    } else {
                        this.f254202o.add(Di.get(i18));
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "type blocked " + i17);
        }
        kz5.g0.t(arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.k2.f254171d);
        viewModel.f400256c = arrayList;
        if (size > 0 && arrayList.isEmpty() && (a2Var = this.f254188a) != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3) a2Var).l1(viewModel.f400254a);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "reloadOtherData " + viewModel.f400254a + ' ' + size + ' ' + viewModel.f400256c.size());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (!arrayList.isEmpty()) {
            arrayList2.addAll(arrayList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "trans recent cover images for tempSectionData");
        }
        if (!this.f254202o.isEmpty()) {
            arrayList2.addAll(this.f254202o);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "trans recent cover images for exceedOtherData");
        }
        if (!arrayList2.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "transSectionData size:%d", java.lang.Integer.valueOf(arrayList2.size()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarLogic", "transRecentCoverImgFilePath");
            o11.g gVar = gh4.j0.f353466a;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("taskbar_config").getBoolean("taskbar_recent_first_trans_image_path", true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarConfig", "needTaskBarRecentFirstTransImgPath flag:%b", java.lang.Boolean.valueOf(z17));
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarLogic", "need trans cover image path");
                ((ku5.t0) ku5.t0.f394148d).q(new gh4.k0(arrayList2));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x014e, code lost:
    
        if (r6 != false) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(boolean r13, int r14) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2.d(boolean, int):void");
    }

    public final void e(int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "removeWeAppData pos:%d, isMy:%b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.v vVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.v.f173600a;
        if (z17) {
            if (this.f254192e == null) {
                ((et.e) ((ft.u3) i95.n0.c(ft.u3.class))).getClass();
                this.f254192e = vVar.a();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5 z5Var = this.f254192e;
            if (z5Var != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.h) z5Var).nh(((cl1.n0) this.f254195h.get(i17)).f124421a.f157894d, ((cl1.n0) this.f254195h.get(i17)).f124421a.f157896f);
                return;
            }
            return;
        }
        if (this.f254191d == null) {
            ((et.e) ((ft.u3) i95.n0.c(ft.u3.class))).getClass();
            this.f254191d = vVar.c();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6 b6Var = this.f254191d;
        if (b6Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.j1) b6Var).x0(((cl1.n0) this.f254194g.get(i17)).f124421a.f157894d, ((cl1.n0) this.f254194g.get(i17)).f124421a.f157896f);
        }
    }

    public final void f() {
        java.util.ArrayList arrayList = this.f254210w;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.b2 b2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.b2) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = b2Var.f254105d;
            if (c16601x7ed0e40c != null) {
                ((gh4.e0) i95.n0.c(gh4.e0.class)).getClass();
                gh4.s0 s0Var = (gh4.s0) i95.n0.c(gh4.s0.class);
                s0Var.getClass();
                java.util.HashSet hashSet = (java.util.HashSet) s0Var.f353487d.get(c16601x7ed0e40c.f66793x2262335f);
                if (hashSet != null) {
                    java.util.Iterator it6 = hashSet.iterator();
                    while (it6.hasNext()) {
                        ((hh4.k) it6.next()).k0(c16601x7ed0e40c);
                    }
                }
                fs.g.c(hh4.j.class, java.lang.Integer.valueOf(c16601x7ed0e40c.f66793x2262335f), new gh4.q0(c16601x7ed0e40c));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "do reportFirstFeedShow " + b2Var.f254104c + ' ' + b2Var.f254103b + ' ' + b2Var.f254102a + ' ' + b2Var.f254106e);
            this.f254207t.d(b2Var.f254102a, b2Var.f254103b, b2Var.f254104c, 1, null, b2Var.f254106e, b2Var.f254108g, this.f254199l, b2Var.f254107f, b2Var.f254109h ? 4 : 0);
        }
        arrayList.clear();
    }

    public final void g(cl1.n0 item, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.String str = item.f124421a.f157895e;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        int i27 = item.f124422b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "reportOnItemManualDeleted appId:%s,pos:%d, viewType:%d", str, valueOf, java.lang.Integer.valueOf(i27));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 = item.f124421a;
        this.f254207t.c(i18, i19, i27 == 2 ? 3 : i27 == 7 ? 14 : 1, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.s0.b(c11714x918fd2e4.f157895e, c11714x918fd2e4.f157896f), 0, 1, 0, 0, item.f124421a.f157894d, item.b() ? 4 : 0);
    }

    public final void h(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c multiTaskInfo, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(multiTaskInfo, "multiTaskInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "reportOnItemAddDeleted type:%d,pos:%d", java.lang.Integer.valueOf(multiTaskInfo.f66793x2262335f), java.lang.Integer.valueOf(i17));
        long c17 = i18 == 2 ? c01.id.c() - multiTaskInfo.f66794xa783a79b : 0L;
        ih4.a aVar = this.f254207t;
        aVar.c(i18, i19, aVar.a(multiTaskInfo.f66793x2262335f), multiTaskInfo.f66791xc8a07680, ((int) c17) / 1000, 1, 0, 0, "", -1);
    }

    public final void i(android.view.View view, int i17) {
        android.view.View findViewById = view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.jqf) : null;
        if (findViewById != null && findViewById.getVisibility() == 0) {
            int i18 = 2;
            if (i17 == 2) {
                i18 = 11;
            } else if (i17 == 7) {
                i18 = 15;
            }
            this.f254207t.d(1, i18, null, 1, null, "", 0, this.f254199l, "", -1);
        }
    }

    public final void j(cl1.n0 item, boolean z17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 = item.f124421a;
        java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.s0.b(c11714x918fd2e4.f157895e, c11714x918fd2e4.f157896f);
        int i18 = item.f124422b;
        int i19 = i18 == 2 ? 3 : i18 == 7 ? 14 : 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.b2 b2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.b2();
        b2Var.f254102a = 1;
        b2Var.f254103b = i19;
        b2Var.f254104c = b17;
        b2Var.f254108g = i17;
        b2Var.f254107f = item.f124421a.f157894d;
        b2Var.f254109h = item.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11709x5a897c43 c11709x5a897c43 = item.f124421a.f157908u;
        if (c11709x5a897c43 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11709x5a897c43.f157872f)) {
            b2Var.f254106e = item.f124421a.f157908u.f157872f;
        }
        this.f254210w.add(b2Var);
    }

    public final void k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 appItem, int i17, int i18, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 o2Var;
        int i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appItem, "appItem");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        java.lang.String str = appItem.f157895e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "reportOnItemReorderWeApp appId:%s,start:%d end:%d", str, valueOf, valueOf2);
        java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.s0.b(str, appItem.f157896f);
        int i27 = z17 ? 1 : 3;
        if (appItem instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4) appItem).f157891z == 4) {
                o2Var = this;
                i19 = 4;
                o2Var.f254207t.c(3, 0, 3, b17, 0, i27, i17, i18, appItem.f157894d, i19);
            }
        }
        o2Var = this;
        i19 = 0;
        o2Var.f254207t.c(3, 0, 3, b17, 0, i27, i17, i18, appItem.f157894d, i19);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(boolean r26, int r27) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2.l(boolean, int):void");
    }

    public final void m() {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.c0) ((ft.j) i95.n0.c(ft.j.class))).getClass();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158000a;
        if (i17 == 0) {
            r45.a60 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.b();
            i17 = b17 != null ? b17.f451290e : 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158000a = i17;
        }
        int i18 = 8;
        int i19 = i17 != 1 ? 8 : 4;
        int i27 = ((com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.c0) ((ft.j) i95.n0.c(ft.j.class))).Bi() != 1 ? 8 : 4;
        boolean z17 = this.f254196i.size() > 0;
        if (!z17) {
            i19 = 0;
        } else if (this.f254196i.size() <= i19) {
            i19 = this.f254196i.size();
        }
        if (!z17) {
            i27 = this.f254194g.size() >= 8 ? 8 : this.f254194g.size();
        } else if (this.f254194g.size() < i27) {
            i27 = this.f254194g.size();
        }
        if (z17) {
            i18 = 0;
        } else if (this.f254195h.size() < 8) {
            i18 = this.f254195h.size();
        }
        this.f254210w.clear();
        if (!this.f254194g.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(this.f254194g);
            int size = arrayList.size();
            if (size <= i27) {
                i27 = size;
            }
            for (int i28 = 0; i28 < i27; i28++) {
                java.lang.Object obj = arrayList.get(i28);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                j((cl1.n0) obj, false, i28);
            }
        }
        if (!this.f254195h.isEmpty()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(this.f254195h);
            int size2 = arrayList2.size();
            if (size2 <= i18) {
                i18 = size2;
            }
            for (int i29 = 0; i29 < i18; i29++) {
                java.lang.Object obj2 = arrayList2.get(i29);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                j((cl1.n0) obj2, true, i29);
            }
        }
        if (!this.f254196i.isEmpty()) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList(this.f254196i);
            int size3 = arrayList3.size();
            if (size3 <= i19) {
                i19 = size3;
            }
            for (int i37 = 0; i37 < i19; i37++) {
                java.lang.Object obj3 = arrayList3.get(i37);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
                j((cl1.n0) obj3, true, i37);
            }
        }
    }

    public final void n() {
        if (gm0.j1.a()) {
            this.f254189b = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
            this.f254190c = ((uh4.c0) i95.n0.c(uh4.c0.class)).hd();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "updateTeenModeStatus isTeenMode: %b, miniProgramOption: %d", java.lang.Boolean.valueOf(this.f254189b), java.lang.Integer.valueOf(this.f254190c));
        }
    }
}
