package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class so extends sb4.e {
    public java.lang.String C;
    public boolean D;
    public long E;
    public java.lang.String F;
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.vo G;
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xo H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f252011J;
    public boolean K;
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qu L;
    public int M;

    public so(boolean z17, android.app.Activity activity, sb4.v vVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ro roVar) {
        super(z17, activity, vVar, str);
        this.C = "";
        this.D = false;
        this.E = 0L;
        this.F = "";
        this.I = 0L;
        this.f252011J = false;
        this.K = false;
        this.M = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qu quVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qu(activity, str, this.f486995n);
        this.L = quVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
        if (cc4.b.f122015a.a()) {
            quVar.f251900j.mo48813x58998cd();
        }
        quVar.f251896f = quVar.f251891a.getIntent().getIntExtra("sns_source", 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
        this.G = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.vo(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.po(this, roVar), str, this.f486995n);
        this.H = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xo(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qo(this, roVar), str, this.f486995n);
        S(0L);
        P(false);
    }

    public static /* synthetic */ boolean H(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.so soVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        boolean z17 = soVar.f252011J;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return z17;
    }

    public static void I(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.so soVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$800", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        soVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findOutCorrectRecentLimitId", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        if (soVar.I != 0) {
            int i17 = 0;
            int i18 = 0;
            while (true) {
                java.util.ArrayList arrayList = (java.util.ArrayList) soVar.f486989e;
                if (i18 >= arrayList.size()) {
                    break;
                }
                long j17 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) arrayList.get(i18)).f68891x29d1292e;
                if (j17 <= soVar.I) {
                    soVar.f486998q = j17;
                    i17 = i18;
                    break;
                }
                i18++;
            }
            if (i17 == 0 && !soVar.K) {
                soVar.f486998q = 0L;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findOutCorrectRecentLimitId", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$800", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qu J(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.so soVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$900", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qu quVar = soVar.L;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$900", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return quVar;
    }

    @Override // sb4.e
    public boolean A() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSearchModeEnd", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        boolean z17 = this.f252011J;
        boolean z18 = !z17 || (z17 && this.K);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSearchModeEnd", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return z18;
    }

    public void K() {
        long j17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addSize", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        java.util.List list = this.f486989e;
        if (((java.util.ArrayList) list).isEmpty()) {
            j17 = 0;
        } else {
            j17 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) ((java.util.ArrayList) list).get(((java.util.ArrayList) list).size() - 1)).f68891x29d1292e;
        }
        S(j17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addSize", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
    }

    public java.lang.String L() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLimtiSeq", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        java.lang.String str = this.F;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLimtiSeq", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return str;
    }

    public boolean M() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSearchMode", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        boolean z17 = this.f252011J;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSearchMode", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return z17;
    }

    public java.util.ArrayList N(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeGalleryItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.M = i18;
        int i19 = 0;
        while (true) {
            java.util.List list = this.f486989e;
            if (i19 >= ((java.util.ArrayList) list).size()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeGalleryItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                return arrayList;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) ((java.util.ArrayList) list).get(i19);
            int i27 = c17933xe8d1b226.f38324x142bbdc6;
            if (c17933xe8d1b226.m70371x485d7() != null && c17933xe8d1b226.m70371x485d7().f39014x86965dde != null && c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451373h.size() != 0 && (c17933xe8d1b226.m70405x7b43eb28() || c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 15)) {
                if (i27 == i17) {
                    this.M = arrayList.size();
                }
                java.util.Iterator it = c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451373h.iterator();
                int i28 = 0;
                while (it.hasNext()) {
                    r45.jj4 jj4Var = (r45.jj4) it.next();
                    r45.m33 m33Var = new r45.m33();
                    m33Var.f461642d = jj4Var;
                    m33Var.f461643e = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.i("sns_table_", i27);
                    m33Var.f461644f = c17933xe8d1b226.m70357x3fdd41df();
                    m33Var.f461645g = i28;
                    arrayList.add(m33Var);
                    i28++;
                }
            }
            i19++;
        }
    }

    public void O(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onNotifyChange", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        P(true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        notifyDataSetChanged();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onNotifyChange", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
    }

    public void P(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        java.lang.String str = this.F;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.vo voVar = this.G;
        if (voVar != null) {
            if (this.f252011J) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xo xoVar = this.H;
                xoVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                xoVar.a(z17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
            } else {
                boolean z18 = this.D;
                voVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                voVar.f252236h = str;
                voVar.f252237i = z18;
                voVar.a(z17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
    }

    public void Q(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.b0 b0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setReporter", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setReporter", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        this.A = b0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setReporter", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        b0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSourcePath50330", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        int i17 = b0Var.f246364a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSourcePath50330", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qu quVar = this.L;
        quVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSourcePath", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
        quVar.f251899i = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSourcePath", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setReporter", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void R(java.util.List r14, java.util.Map r15, java.util.Map r16, java.util.Map r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.so.R(java.util.List, java.util.Map, java.util.Map, java.util.Map, int, int):void");
    }

    public final void S(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateLimitSeq", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2 Fj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d6 Kj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Kj();
        java.lang.String str = this.f487000s;
        java.lang.String s07 = ca4.z0.s0(Fj.F2(j17, Kj.j(str), this.f487000s, this.f486995n));
        if (this.C.equals("")) {
            this.F = s07;
        } else {
            if (s07.compareTo(this.C) >= 0) {
                s07 = this.C;
            }
            this.F = s07;
        }
        long j18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ej().J0(str).t0().f453293e;
        if (j18 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateLimitSeq", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return;
        }
        java.lang.String s08 = ca4.z0.s0(j18);
        if (this.F.equals("")) {
            this.F = s08;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateLimitSeq", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        } else {
            if (s08.compareTo(this.F) <= 0) {
                s08 = this.F;
            }
            this.F = s08;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateLimitSeq", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        }
    }

    @Override // sb4.e
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("browseFeed", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
        s0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("browseFeed", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (c17933xe8d1b226 != null) {
            java.lang.String s07 = ca4.z0.s0(c17933xe8d1b226.f68891x29d1292e);
            java.util.ArrayList arrayList = (java.util.ArrayList) s0Var.f246498r;
            if (!arrayList.contains(s07)) {
                arrayList.add(s07);
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.f(c17933xe8d1b226).f38987x8b2694de > 0) {
                java.util.ArrayList arrayList2 = (java.util.ArrayList) s0Var.f246499s;
                if (!arrayList2.contains(s07)) {
                    arrayList2.add(s07);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("browseFeed", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.b0 b0Var = this.A;
        if (b0Var != null && c17933xe8d1b226 != null) {
            b0Var.c(c17933xe8d1b226);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("browseFeed", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCount", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        int i17 = this.f486999r;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCount", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return i17;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        java.lang.Object obj = ((java.util.ArrayList) this.f486989e).get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return obj;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemId", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemId", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        if (cc4.b.f122015a.a() && i17 == 0 && A()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return 7;
        }
        if (z(i17) && A()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return 0;
        }
        java.util.Map map = this.f486992h;
        int intValue = ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17)) != null ? ((java.lang.Integer) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17))).intValue() : -1;
        if (intValue == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsphotoAdapter", "unknow error " + intValue);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) getItem(intValue);
        if (c17933xe8d1b226.m70405x7b43eb28()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return 0;
        }
        if (c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 15) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return 2;
        }
        if (c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 21) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return 3;
        }
        if (c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 28 || c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 50 || c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 59 || c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 29 || c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 37 || c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 38 || c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 53 || c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 34 || c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 45 || c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 43 || c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 36 || c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 44 || c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 46 || c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 51 || c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 52 || c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 55 || c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 56) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return 4;
        }
        if (c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 33) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return 5;
        }
        if (c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 4) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("wx5aa333606550dfd5", c17933xe8d1b226.m70371x485d7().f39012x33e0f24f != null ? c17933xe8d1b226.m70371x485d7().f39012x33e0f24f.f472379d : "")) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                return 6;
            }
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_new_music_type_flag, bm5.h0.RepairerConfig_Mv_CardDownLevel_Int, 0) == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                return 1;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return 1;
        }
        if (c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 47) {
            if (je4.g.d(this.f486988d, c17933xe8d1b226.m70371x485d7())) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                return 6;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return 1;
        }
        if (c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 42) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return 6;
        }
        if (c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 39 && ((i18 = c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451383u) == 3 || i18 == 100000000)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return 4;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return 1;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View p17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.dw dwVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getView", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createView", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        int itemViewType = getItemViewType(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsphotoAdapter", "position " + itemViewType);
        if (itemViewType == 7) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qu quVar = this.L;
            quVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createView", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUserStarSlotHelper", "createViews >> position: " + i17);
            java.lang.Object tag = view != null ? view.getTag() : null;
            android.app.Activity activity = quVar.f251891a;
            if (tag == null || !(view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.dw)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUserStarSlotHelper", "createViews >> convert view is null");
                p17 = com.p314xaae8f345.mm.ui.id.b(activity).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cuw, (android.view.ViewGroup) null);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "inflate(...)");
                dwVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.dw(p17);
                p17.setTag(dwVar);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUserStarSlotHelper", "createViews >> convert view is no null");
                java.lang.Object tag2 = view.getTag();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag2, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.StarSlotViewHolder");
                dwVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.dw) tag2;
                p17 = view;
            }
            if (quVar.f251895e.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUserStarSlotHelper", "starFeed is empty");
                android.view.View a17 = dwVar.a();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsUserStarSlotHelper", "createView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                a17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(a17, "com/tencent/mm/plugin/sns/ui/SnsUserStarSlotHelper", "createView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createView", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
            } else {
                if (dwVar.a().getVisibility() == 8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUserStarSlotHelper", "createViews >> parentView is gone to notify view");
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(activity);
                    c1162x665295de.Q(0);
                    android.view.View a18 = dwVar.a();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(a18, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsUserStarSlotHelper", "createView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    a18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(a18, "com/tencent/mm/plugin/sns/ui/SnsUserStarSlotHelper", "createView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSlotList", "com.tencent.mm.plugin.sns.ui.StarSlotViewHolder");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSlotList", "com.tencent.mm.plugin.sns.ui.StarSlotViewHolder");
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = dwVar.f249746b;
                    c1163xf1deaba4.mo7967x900dcbe1(c1162x665295de);
                    java.util.ArrayList arrayList3 = quVar.f251895e;
                    sb4.y yVar = quVar.f251894d;
                    yVar.x(arrayList3);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSlotList", "com.tencent.mm.plugin.sns.ui.StarSlotViewHolder");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSlotList", "com.tencent.mm.plugin.sns.ui.StarSlotViewHolder");
                    c1163xf1deaba4.mo7960x6cab2c8d(yVar);
                    dwVar.a().setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.mu(quVar));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createView", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createView", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        } else if (itemViewType == 0) {
            p17 = q(i17, view);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createView", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        } else if (itemViewType == 2) {
            p17 = r(i17, view);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createView", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        } else if (itemViewType == 3) {
            p17 = m(i17, view);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createView", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        } else if (itemViewType == 4) {
            p17 = l(i17, view);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createView", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        } else if (itemViewType == 5) {
            p17 = n(i17, view);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createView", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        } else if (itemViewType == 6) {
            p17 = o(i17, view);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createView", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        } else {
            p17 = p(i17, view);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createView", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getView", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return p17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getViewTypeCount", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewTypeCount", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return 8;
    }

    @Override // sb4.e
    public boolean h(int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkDateTvDisplay", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        boolean z17 = true;
        if (!this.f252011J) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkDateTvDisplay", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return true;
        }
        if ((i17 != 1 || this.E != j17) && i17 <= 0 && !this.K) {
            z17 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkDateTvDisplay", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return z17;
    }

    @Override // sb4.e
    public boolean j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkToShowStarIcon", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        boolean z17 = cc4.b.f122015a.a() && this.f486995n;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkToShowStarIcon", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return z17;
    }

    @Override // sb4.e
    public void k(android.widget.TextView textView, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkYearTvView", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        int i19 = i17 / 10000;
        int i27 = i18 / 10000;
        d(textView);
        boolean z17 = this.f252011J;
        android.app.Activity activity = this.f486988d;
        if (z17) {
            if (i19 != 0 && i27 != i19) {
                B(textView);
                textView.setText(java.lang.String.format(activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jh6), java.lang.Integer.valueOf(i27)));
                textView.setVisibility(0);
                d(textView);
            }
        } else if (i19 == 0) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.os.f() != i27) {
                B(textView);
                textView.setText(java.lang.String.format(activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jh6), java.lang.Integer.valueOf(i27)));
                textView.setVisibility(0);
                d(textView);
            }
        } else if (i27 != i19) {
            B(textView);
            textView.setText(java.lang.String.format(activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jh6), java.lang.Integer.valueOf(i27)));
            textView.setVisibility(0);
            d(textView);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkYearTvView", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyDataSetChanged", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        super.notifyDataSetChanged();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyDataSetChanged", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
    }

    @Override // sb4.e
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 t(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLastestSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        if (this.f487001t != c17933xe8d1b226.f38324x142bbdc6) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLastestSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l1.b(c17933xe8d1b226.m70363x51f8f990());
        this.f487001t = -1;
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsphotoAdapter", "getLastestSnsInfo failed to sight update snsInfo, fixPos:%d, localId:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(c17933xe8d1b226.f38324x142bbdc6));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLastestSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsphotoAdapter", "getLastestSnsInfo success to update snsInfo, fixPos:%d, localId:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(c17933xe8d1b226.f38324x142bbdc6));
        ((java.util.ArrayList) this.f486989e).set(i17, b17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.vo voVar = this.G;
        voVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
        int i18 = 0;
        while (true) {
            if (i18 >= voVar.f252232d.size()) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) voVar.f252232d.get(i18);
            if (c17933xe8d1b2262.f38324x142bbdc6 == b17.f38324x142bbdc6 && c17933xe8d1b2262.m70357x3fdd41df() == b17.m70357x3fdd41df() && b17.f68891x29d1292e > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSelfHelper", "updateItem %d >> ", java.lang.Integer.valueOf(b17.f38324x142bbdc6));
                voVar.f252232d.set(i18, b17);
                break;
            }
            i18++;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLastestSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return b17;
    }

    @Override // sb4.e
    public int v() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPositionTop", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        if (cc4.b.f122015a.a()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPositionTop", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return 1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPositionTop", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return 0;
    }

    @Override // sb4.e
    public boolean z(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPositionGoToPhoto", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        boolean z17 = false;
        if (cc4.b.f122015a.a()) {
            if (this.f486995n && i17 == 1) {
                z17 = true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPositionGoToPhoto", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return z17;
        }
        if (this.f486995n && i17 == 0) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPositionGoToPhoto", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return z17;
    }
}
