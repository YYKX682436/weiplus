package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.NewSnsLabelUI */
/* loaded from: classes4.dex */
public class ActivityC17981xde240d90 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c implements zd4.p {
    public static final /* synthetic */ int P = 0;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.v6 H;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17981xde240d90.ReturnSnsObjectDetailEventListener I;
    public boolean E = false;
    public int F = -1;
    public java.lang.Long G = -1L;

    /* renamed from: J, reason: collision with root package name */
    public long f247939J = 0;
    public boolean K = false;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d L = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6085x679e6f54>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.sns.ui.NewSnsLabelUI.1
        {
            this.f39173x3fe91575 = 1901115748;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6085x679e6f54 c6085x679e6f54) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$1");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$1");
            long j17 = c6085x679e6f54.f136363g.f88907b;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on sns post success, postId = ");
            sb6.append(j17);
            sb6.append(", sns local id = ");
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17981xde240d90.P;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17981xde240d90 activityC17981xde240d90 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17981xde240d90.this;
            int i18 = activityC17981xde240d90.F;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
            sb6.append(i18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewSnsLabelUI", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
            int i19 = activityC17981xde240d90.F;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
            if (i19 == j17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                boolean z17 = activityC17981xde240d90.K;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                if (z17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                    activityC17981xde240d90.m7();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$1");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$1");
            return false;
        }
    };
    public long M = 0;
    public long N = 0;

    /* renamed from: com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$ReturnSnsObjectDetailEventListener */
    /* loaded from: classes4.dex */
    public static class ReturnSnsObjectDetailEventListener extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5943x201a82e2> {

        /* renamed from: d, reason: collision with root package name */
        public final java.lang.ref.WeakReference f247941d;

        public ReturnSnsObjectDetailEventListener(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
            super(com.p314xaae8f345.mm.app.a0.f134821d);
            this.f247941d = new java.lang.ref.WeakReference(abstractActivityC21394xb3d2c0cf);
            this.f39173x3fe91575 = -1656522510;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5943x201a82e2 c5943x201a82e2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$ReturnSnsObjectDetailEventListener");
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5943x201a82e2 c5943x201a82e22 = c5943x201a82e2;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$ReturnSnsObjectDetailEventListener");
            boolean z17 = false;
            if (c5943x201a82e22 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$ReturnSnsObjectDetailEventListener");
            } else {
                java.lang.ref.WeakReference weakReference = this.f247941d;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17981xde240d90 activityC17981xde240d90 = (weakReference == null || weakReference.get() == null || !(weakReference.get() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17981xde240d90)) ? null : (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17981xde240d90) weakReference.get();
                if (activityC17981xde240d90 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewSnsLabelUI", "ReturnSnsObjectDetailEvent callback, but NewSnsLabelUI not alive !!");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$ReturnSnsObjectDetailEventListener");
                } else {
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = c5943x201a82e22.f136244g.f87718a;
                    if (c19806x4c372b7 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewSnsLabelUI", "ReturnSnsObjectDetailEvent callback, snsobject id:%s", java.lang.Long.valueOf(c19806x4c372b7.Id));
                        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17981xde240d90.P;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$800", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                        activityC17981xde240d90.o7(c19806x4c372b7);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$800", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$900", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshAdapter", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk xkVar = activityC17981xde240d90.f252216q;
                        int i18 = activityC17981xde240d90.f252218s;
                        xkVar.f253073k = i18;
                        if (activityC17981xde240d90.f252217r.o(i18, 2)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "refreshAdapter: SavedSelect:%d, expand INCLUDE", java.lang.Integer.valueOf(activityC17981xde240d90.f252218s));
                            activityC17981xde240d90.f252207e.expandGroup(activityC17981xde240d90.f252217r.i(2));
                        } else if (activityC17981xde240d90.f252217r.o(activityC17981xde240d90.f252216q.f253073k, 3)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "refreshAdapter: SavedSelect:%d, expand EXCLUDE", java.lang.Integer.valueOf(activityC17981xde240d90.f252218s));
                            activityC17981xde240d90.f252207e.expandGroup(activityC17981xde240d90.f252217r.i(3));
                        }
                        activityC17981xde240d90.f252216q.notifyDataSetChanged();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshAdapter", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$900", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                    } else {
                        db5.e1.t(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f574746jb4), "", new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.w6(this, activityC17981xde240d90));
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$ReturnSnsObjectDetailEventListener");
                    z17 = true;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$ReturnSnsObjectDetailEventListener");
            return z17;
        }
    }

    @Override // zd4.p
    public boolean A6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initFromFeedInfo", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        gm0.j1.i();
        gm0.j1.n().f354821b.a(218, this.H);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5618x529c81c8 c5618x529c81c8 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5618x529c81c8();
        c5618x529c81c8.f135943g.f88780a = this.F;
        c5618x529c81c8.e();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = c5618x529c81c8.f135944h.f88880a;
        if (c19806x4c372b7 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewSnsLabelUI", "[initFromFeedInfo] get snsObject null,try request objectdetail, show loading");
            n7();
        }
        boolean o76 = o7(c19806x4c372b7);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initFromFeedInfo", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        return o76;
    }

    @Override // zd4.p
    public boolean C6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isNeedDynamicChangeVisibleRange", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        boolean z17 = this.E;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isNeedDynamicChangeVisibleRange", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        return z17;
    }

    @Override // zd4.p
    public boolean I3() {
        boolean z17;
        int i17;
        java.util.Iterator it;
        java.util.Iterator it6;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dynamicChangeVisibleRange", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewSnsLabelUI", "dynamicChangeVisibleRange start");
        n7();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().i1(this.F);
        long j17 = i18 == null ? 0L : i18.f68891x29d1292e;
        this.G = java.lang.Long.valueOf(j17);
        if (j17 != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("changeVisible", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
            r45.p96 p96Var = new r45.p96();
            if (this.f252217r.o(this.f252216q.f253073k, 2)) {
                p96Var.f464432o = 3;
                p96Var.f464428h = this.f252216q.f253078p.size();
                java.util.Iterator it7 = this.f252216q.f253078p.iterator();
                while (it7.hasNext()) {
                    p96Var.f464429i.add(x51.j1.i((java.lang.String) it7.next()));
                }
                p96Var.f464430m = this.f252216q.f253076n.size();
                java.util.Iterator it8 = this.f252216q.f253076n.iterator();
                i17 = 0;
                while (it8.hasNext()) {
                    java.lang.String str = (java.lang.String) it8.next();
                    try {
                        p96Var.f464431n.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str)));
                        it6 = it8;
                    } catch (java.lang.Exception e17) {
                        it6 = it8;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NewSnsLabelUI", e17, "SnsObjectOpChangeVisibility parse error", new java.lang.Object[0]);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
                    int i19 = this.f252216q.f253073k;
                    s0Var.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkSearchLabelOfDynaLabel", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                    java.util.Set w17 = s0Var.w(i19);
                    boolean z18 = w17 != null && w17.contains(str);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSearchLabelOfDynaLabel", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                    if (z18) {
                        i17++;
                    }
                    it8 = it6;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.B().M = i17;
            } else if (this.f252217r.o(this.f252216q.f253073k, 3)) {
                p96Var.f464432o = 4;
                p96Var.f464424d = this.f252216q.f253079q.size();
                java.util.Iterator it9 = this.f252216q.f253079q.iterator();
                while (it9.hasNext()) {
                    p96Var.f464425e.add(x51.j1.i((java.lang.String) it9.next()));
                }
                p96Var.f464426f = this.f252216q.f253077o.size();
                java.util.Iterator it10 = this.f252216q.f253077o.iterator();
                i17 = 0;
                while (it10.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it10.next();
                    try {
                        p96Var.f464427g.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str2)));
                        it = it10;
                    } catch (java.lang.Exception e18) {
                        it = it10;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NewSnsLabelUI", e18, "SnsObjectOpChangeVisibility parse error", new java.lang.Object[0]);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
                    int i27 = this.f252216q.f253073k;
                    s0Var2.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkSearchLabelOfDynaLabel", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                    java.util.Set w18 = s0Var2.w(i27);
                    boolean z19 = w18 != null && w18.contains(str2);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSearchLabelOfDynaLabel", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                    if (z19) {
                        i17++;
                    }
                    it10 = it;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.B().M = i17;
            } else {
                if (this.f252217r.o(this.f252216q.f253073k, 0)) {
                    p96Var.f464432o = 1;
                } else if (this.f252217r.o(this.f252216q.f253073k, 1)) {
                    p96Var.f464432o = 2;
                }
                i17 = 0;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewSnsLabelUI", "dynamicChangeVisibleRange: selectVisibleState:%d， matchLabelCountFromSearch:%d", java.lang.Integer.valueOf(this.f252216q.f253073k), java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewSnsLabelUI", "dynamicChangeVisibleRange opChangeVisibility:%s", " OpType:" + p96Var.f464432o + " GroupUserCount:" + p96Var.f464428h + " BlackListCount:" + p96Var.f464424d + " BlackContactTagIdListCount:" + p96Var.f464426f + " GroupContactTagIdListCount:" + p96Var.f464430m);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateInTransform", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            this.f252220u = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateInTransform", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2 q2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2(j17, p96Var);
            oi0.e.f427124d.f(j17, p96Var);
            gm0.j1.i();
            gm0.j1.n().f354821b.g(q2Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("changeVisible", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
            this.K = false;
            z17 = true;
        } else {
            z17 = true;
            this.K = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dynamicChangeVisibleRange", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        return z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c
    public zd4.o Z6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createSelectVisibleResCollectorInstance", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        zd4.s sVar = new zd4.s();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSelectVisibleResCollectorInstance", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        return sVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c
    public android.content.Intent c7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSelectLabelIntent", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        android.content.Intent c76 = super.c7();
        c76.putExtra("contact_select_label_from_scene", 1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelectLabelIntent", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        return c76;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c
    public void g7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("gotoSelectContact", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        super.g7();
        this.M = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("gotoSelectContact", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c
    public void h7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("gotoSelectLabel", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        super.h7();
        this.N = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("gotoSelectLabel", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o7(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 r14) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17981xde240d90.o7(com.tencent.mm.protocal.protobuf.SnsObject):boolean");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        super.onActivityResult(i17, i18, intent);
        if (i17 == 4003) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
            long currentTimeMillis = s0Var.B().I + (java.lang.System.currentTimeMillis() - this.M);
            s0Var.B().I = currentTimeMillis;
            if (this.E && intent != null) {
                java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                    s0Var.T(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(",")));
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewSnsLabelUI", "setSelectFriendDuration %d", java.lang.Long.valueOf(currentTimeMillis));
        } else if (i17 == 4005) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
            long currentTimeMillis2 = s0Var2.B().L + (java.lang.System.currentTimeMillis() - this.N);
            s0Var2.B().L = currentTimeMillis2;
            if (this.E && intent != null) {
                java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("label_id");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateSelectedLabelReport", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateSelectedLabelReport", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                } else {
                    s0Var2.f246492l.f142789w += stringArrayListExtra.size();
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6969xa989d0b0 c6969xa989d0b0 = s0Var2.f246492l;
                    c6969xa989d0b0.C = c6969xa989d0b0.b("SelectedLabelidList", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(stringArrayListExtra, ";"), true);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    for (java.lang.String str : stringArrayListExtra) {
                        java.util.List j17 = ((b93.b) c93.a.a()).j(str);
                        java.lang.String g17 = ((b93.b) c93.a.a()).g(str);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsReportHelper", "select label:%s name:%s count:%d", str, g17, java.lang.Integer.valueOf(j17.size()));
                        sb6.append(g17);
                        sb6.append("|");
                        sb6.append(j17.size());
                        sb6.append(";");
                    }
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6969xa989d0b0 c6969xa989d0b02 = s0Var2.f246492l;
                    c6969xa989d0b02.f142790x = c6969xa989d0b02.b("SelectedLabelList", sb6.toString(), true);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateSelectedLabelReport", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewSnsLabelUI", "setDynamicLabelDuration %d", java.lang.Long.valueOf(currentTimeMillis2));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        this.E = getIntent().hasExtra("key_from_sns_feed_id");
        this.F = getIntent().getIntExtra("key_from_sns_feed_id", -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewSnsLabelUI", "onCreate isFromFeedDialog:%b", java.lang.Boolean.valueOf(this.E));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDynamicChangeVisibleRange", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        this.f252225z = this;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDynamicChangeVisibleRange", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        this.H = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.v6(new java.lang.ref.WeakReference(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17981xde240d90.ReturnSnsObjectDetailEventListener returnSnsObjectDetailEventListener = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17981xde240d90.ReturnSnsObjectDetailEventListener(this);
        this.I = returnSnsObjectDetailEventListener;
        returnSnsObjectDetailEventListener.mo48813x58998cd();
        super.onCreate(bundle);
        if (this.E) {
            mo60878xf6b21fea(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.j_e));
        }
        this.L.mo48813x58998cd();
        this.f247939J = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewSnsLabelUI", "onDestroy");
        gm0.j1.i();
        gm0.j1.n().f354821b.q(218, this.H);
        this.I.mo48814x2efc64();
        this.L.mo48814x2efc64();
        super.onDestroy();
        if (C6()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.K();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewSnsLabelUI", "onResume");
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStop", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        super.onStop();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewSnsLabelUI", "onStop");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.B().H = java.lang.System.currentTimeMillis() - this.f247939J;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStop", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
    }
}
