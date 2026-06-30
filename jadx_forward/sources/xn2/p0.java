package xn2;

/* loaded from: classes2.dex */
public final class p0 implements xn2.a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.e {
    public gp1.a0 A;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.f B;
    public java.lang.Boolean C;
    public final java.util.HashSet D;
    public final java.util.HashMap E;
    public final android.graphics.Rect F;
    public final jz5.g G;

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f537076a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f537077b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f537078c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f537079d;

    /* renamed from: e, reason: collision with root package name */
    public xn2.b f537080e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f537081f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f537082g;

    /* renamed from: h, reason: collision with root package name */
    public final cw2.f8 f537083h;

    /* renamed from: i, reason: collision with root package name */
    public long f537084i;

    /* renamed from: j, reason: collision with root package name */
    public int f537085j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f537086k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f537087l;

    /* renamed from: m, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f537088m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.p1561xde351112.C14440xf667bcd4 f537089n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.p1561xde351112.C14443x601a0492 f537090o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f537091p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.p1561xde351112.C14441x908b9bef f537092q;

    /* renamed from: r, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f537093r;

    /* renamed from: s, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f537094s;

    /* renamed from: t, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f537095t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f537096u;

    /* renamed from: v, reason: collision with root package name */
    public long f537097v;

    /* renamed from: w, reason: collision with root package name */
    public int f537098w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f537099x;

    /* renamed from: y, reason: collision with root package name */
    public do2.b f537100y;

    /* renamed from: z, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.p1561xde351112.C14444x1eb6efc0 f537101z;

    /* JADX WARN: Type inference failed for: r3v10, types: [com.tencent.mm.plugin.finder.megavideo.topstory.flow.contract.MegaVideoPresenter$showLastExitFeedHintEventListener$1] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.tencent.mm.plugin.finder.megavideo.topstory.flow.contract.MegaVideoPresenter$autoRefreshEventListener$1] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.tencent.mm.plugin.finder.megavideo.topstory.flow.contract.MegaVideoPresenter$seeLaterDeleteEventListener$1] */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.tencent.mm.plugin.finder.megavideo.topstory.flow.contract.MegaVideoPresenter$feedDeleteListener$1] */
    public p0(android.app.Activity activity, java.lang.String contextId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextId, "contextId");
        this.f537076a = activity;
        this.f537077b = contextId;
        this.f537078c = "Finder.MegaVideoPresenter";
        this.f537079d = jz5.h.b(xn2.q.f537102d);
        this.f537081f = jz5.h.b(new xn2.g0(this));
        this.f537082g = jz5.h.b(new xn2.s(this));
        this.f537083h = new cw2.f8(9);
        this.f537085j = 1;
        this.f537087l = jz5.h.b(xn2.f0.f537024d);
        this.f537088m = p3325xe03a0797.p3326xc267989b.z0.b();
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f537089n = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5543xbe6908c6>(a0Var) { // from class: com.tencent.mm.plugin.finder.megavideo.topstory.flow.contract.MegaVideoPresenter$autoRefreshEventListener$1
            {
                this.f39173x3fe91575 = 999423702;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5543xbe6908c6 c5543xbe6908c6) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5543xbe6908c6 event = c5543xbe6908c6;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                pm0.v.X(new xn2.c(event, xn2.p0.this));
                return false;
            }
        };
        this.f537090o = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5704xb2ebef43>(a0Var) { // from class: com.tencent.mm.plugin.finder.megavideo.topstory.flow.contract.MegaVideoPresenter$seeLaterDeleteEventListener$1
            {
                this.f39173x3fe91575 = -1264681165;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5704xb2ebef43 c5704xb2ebef43) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5704xb2ebef43 event = c5704xb2ebef43;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                pm0.v.X(new xn2.h0(xn2.p0.this, event));
                return false;
            }
        };
        this.f537091p = jz5.h.b(new xn2.i0(this));
        this.f537092q = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11>(a0Var) { // from class: com.tencent.mm.plugin.finder.megavideo.topstory.flow.contract.MegaVideoPresenter$feedDeleteListener$1
            {
                this.f39173x3fe91575 = -108499199;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11 c5437xe8b43b11) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11 event = c5437xe8b43b11;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                pm0.v.X(new xn2.n(xn2.p0.this, event));
                return false;
            }
        };
        this.f537099x = jz5.h.b(xn2.f.f537023d);
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5469x8288cd99>(a0Var) { // from class: com.tencent.mm.plugin.finder.megavideo.topstory.flow.contract.MegaVideoPresenter$feedDislikeListener$1
            {
                this.f39173x3fe91575 = -633386071;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0055 A[EDGE_INSN: B:17:0x0055->B:18:0x0055 BREAK  A[LOOP:0: B:4:0x0022->B:64:?], SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:64:? A[LOOP:0: B:4:0x0022->B:64:?, LOOP_END, SYNTHETIC] */
            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5469x8288cd99 r14) {
                /*
                    Method dump skipped, instructions count: 327
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.p1561xde351112.C14442x4dda6803.mo1xf5bc2045(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f537101z = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5505x8c69712b>(a0Var) { // from class: com.tencent.mm.plugin.finder.megavideo.topstory.flow.contract.MegaVideoPresenter$showLastExitFeedHintEventListener$1
            {
                this.f39173x3fe91575 = 1499630395;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5505x8c69712b c5505x8c69712b) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5505x8c69712b event = c5505x8c69712b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                pm0.v.X(new xn2.l0(xn2.p0.this, event));
                return false;
            }
        };
        this.D = new java.util.HashSet();
        this.E = new java.util.HashMap();
        this.F = new android.graphics.Rect();
        this.G = jz5.h.b(xn2.l.f537057d);
    }

    public static final void b(xn2.p0 p0Var, so2.j5 j5Var, boolean z17) {
        int i17;
        if (p0Var.i()) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.g0();
        long mo2128x1ed62e84 = j5Var.mo2128x1ed62e84();
        g0Var.f391654d = mo2128x1ed62e84;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p0Var.f537078c, "mega_verify try delete %s, isLV: %b", java.lang.Long.valueOf(mo2128x1ed62e84), java.lang.Boolean.valueOf(z17));
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        java.util.ArrayList m56388xcaeb60d0 = p0Var.j().m56388xcaeb60d0();
        synchronized (m56388xcaeb60d0) {
            java.util.Iterator it = m56388xcaeb60d0.iterator();
            i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                } else {
                    if (((so2.j5) it.next()).mo2128x1ed62e84() == g0Var.f391654d) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
        }
        f0Var.f391649d = i17;
        if (i17 <= p0Var.f537098w) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p0Var.f537078c, "mega_verify skip, index: %d, maxLVExposeIndex: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(p0Var.f537098w));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p0Var.f537078c, "mega_verify delete, index: %d, maxLVExposeIndex: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(p0Var.f537098w));
            pm0.v.X(new xn2.h(z17, p0Var, f0Var, j5Var, g0Var));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(xn2.p0 r13, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r14) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xn2.p0.c(xn2.p0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void d() {
        if (this.f537100y == null) {
            return;
        }
        pm0.v.X(new xn2.d(this));
    }

    public int e() {
        return j().m56388xcaeb60d0().size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(zn2.a aVar, int i17, int i18, long j17) {
        r45.vx0 vx0Var;
        java.util.HashMap hashMap = this.E;
        if (hashMap.containsKey(java.lang.Long.valueOf(aVar.mo2128x1ed62e84()))) {
            return;
        }
        boolean rj6 = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).rj(aVar.getFeedObject().m59299x6bf53a6c());
        aVar.getFeedObject().m59226x730bcac6();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[10];
        lVarArr[0] = new jz5.l("view_id", "long_video_card");
        lVarArr[1] = new jz5.l("finder_context_id", this.f537077b);
        lVarArr[2] = new jz5.l("comment_scene", 281);
        lVarArr[3] = new jz5.l("feed_id", pm0.v.u(aVar.mo2128x1ed62e84()));
        lVarArr[4] = new jz5.l("card_idex", java.lang.Integer.valueOf((i17 - i18) + 1));
        lVarArr[5] = new jz5.l("refresh_num", java.lang.Integer.valueOf(this.f537085j));
        r45.ru2 m76771x17e42f9f = aVar.getFeedObject().getFeedObject().m76771x17e42f9f();
        lVarArr[6] = new jz5.l("recommend_reason", m76771x17e42f9f != null ? m76771x17e42f9f.m75945x2fec8307(0) : null);
        r45.dm2 m76806xdef68064 = aVar.getFeedObject().getFeedObject().m76806xdef68064();
        lVarArr[7] = new jz5.l("collection_id", pm0.v.u((m76806xdef68064 == null || (vx0Var = (r45.vx0) m76806xdef68064.m75936x14adae67(0)) == null) ? 0L : vx0Var.m75942xfb822ef2(0)));
        lVarArr[8] = new jz5.l("follow_type", java.lang.Integer.valueOf(rj6 ? 1 : 0));
        lVarArr[9] = new jz5.l("session_buffer", aVar.getFeedObject().getFeedObject().m76829x97edf6c0());
        ((cy1.a) rVar).yj("view_exp", null, kz5.c1.k(lVarArr), 1, true);
        java.util.HashSet hashSet = this.D;
        java.util.Iterator it = hashSet.iterator();
        int i19 = 0;
        while (true) {
            if (!it.hasNext()) {
                i19 = -1;
                break;
            }
            java.lang.Object next = it.next();
            if (i19 < 0) {
                kz5.c0.p();
                throw null;
            }
            if ((((java.lang.Number) ((jz5.o) next).f384374d).longValue() == aVar.mo2128x1ed62e84()) == true) {
                break;
            } else {
                i19++;
            }
        }
        if (i19 == -1) {
            hashSet.add(new jz5.o(java.lang.Long.valueOf(aVar.mo2128x1ed62e84()), java.lang.Integer.valueOf(i17), aVar));
            hashMap.put(java.lang.Long.valueOf(aVar.mo2128x1ed62e84()), java.lang.Long.valueOf(j17));
        }
    }

    public final void g() {
        xn2.b bVar = this.f537080e;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = bVar != null ? ((xn2.f1) bVar).m175696x4905e9fa().getLayoutManager() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.C14436x2022d0d5 c14436x2022d0d5 = layoutManager instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.C14436x2022d0d5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.C14436x2022d0d5) layoutManager : null;
        int i17 = -1;
        int w17 = c14436x2022d0d5 != null ? c14436x2022d0d5.w() : -1;
        xn2.b bVar2 = this.f537080e;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager2 = bVar2 != null ? ((xn2.f1) bVar2).m175696x4905e9fa().getLayoutManager() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.C14436x2022d0d5 c14436x2022d0d52 = layoutManager2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.C14436x2022d0d5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.C14436x2022d0d5) layoutManager2 : null;
        int y17 = c14436x2022d0d52 != null ? c14436x2022d0d52.y() : -1;
        this.f537098w = java.lang.Math.max(this.f537098w, y17);
        if (w17 < 0 || y17 < 0 || y17 >= j().m56388xcaeb60d0().size()) {
            return;
        }
        k().c();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Iterator it = j().m56388xcaeb60d0().iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (((so2.j5) it.next()) instanceof zn2.a) {
                i17 = i18;
                break;
            }
            i18++;
        }
        k().f("ViewIdMainFeed", y17 - i17);
        int i19 = y17 + 1;
        while (w17 < i19) {
            so2.j5 j5Var = (so2.j5) j().m56388xcaeb60d0().get(w17);
            if (j5Var instanceof zn2.a) {
                xn2.b bVar3 = this.f537080e;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = bVar3 != null ? ((xn2.f1) bVar3).m175696x4905e9fa().p0(w17) : null;
                if (p07 != null && (p07 instanceof in5.s0)) {
                    in5.s0 s0Var = (in5.s0) p07;
                    boolean globalVisibleRect = s0Var.f3639x46306858.getGlobalVisibleRect(this.F);
                    float width = (s0Var.f3639x46306858.getMeasuredWidth() <= 0 || s0Var.f3639x46306858.getMeasuredHeight() <= 0) ? 0.0f : (r7.width() * r7.height()) / (s0Var.f3639x46306858.getMeasuredWidth() * s0Var.f3639x46306858.getMeasuredHeight());
                    if (globalVisibleRect && width >= ((java.lang.Number) ((jz5.n) this.G).mo141623x754a37bb()).floatValue()) {
                        f((zn2.a) j5Var, w17, i17, currentTimeMillis);
                    }
                }
            }
            w17++;
        }
    }

    public boolean h() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.I7).mo141623x754a37bb()).r()).intValue() == 3;
    }

    public final boolean i() {
        return ((java.lang.Boolean) ((jz5.n) this.f537099x).mo141623x754a37bb()).booleanValue();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.C14438x701c8eca j() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.C14438x701c8eca) ((jz5.n) this.f537082g).mo141623x754a37bb();
    }

    public final ao2.a k() {
        return (ao2.a) ((jz5.n) this.f537087l).mo141623x754a37bb();
    }

    public final r45.qt2 l() {
        return (r45.qt2) ((jz5.n) this.f537081f).mo141623x754a37bb();
    }

    public void m(in5.s0 holder, int i17, java.lang.String playSessionId, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playSessionId, "playSessionId");
        so2.j5 j5Var = (so2.j5) holder.f374658i;
        if (!(j5Var instanceof zn2.a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f537078c, "jumpLongVideoShare fail, feed=" + j5Var);
            return;
        }
        zn2.a aVar = (zn2.a) j5Var;
        o(aVar, i17);
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        n(2, context, holder, aVar.getFeedObject(), i17, playSessionId, z17);
    }

    public final void n(int i17, android.content.Context context, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, int i18, java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f;
        cw2.da videoView;
        ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.f428857u);
        ao2.a k17 = k();
        k17.getClass();
        qg3.w wVar = k17.f94076l;
        if (wVar != null) {
            p3380x6a61f93.p3383xf5152754.C30554x21b38a90.m169893x21b82281(((qg3.x) wVar).m105978x2737f10(), 6, "ViewIdMainFeed");
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) this.f537083h.f305233h).c7(this.f537076a);
        long mo56685x3d7f3f1d = (s0Var == null || (c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) s0Var.p(com.p314xaae8f345.mm.R.id.e_k)) == null || (videoView = c15196x85976f5f.getVideoView()) == null || this.f537084i != c14994x9b99c079.m59251x5db1b11()) ? 0L : videoView.mo56685x3d7f3f1d();
        if (mo56685x3d7f3f1d <= 0) {
            mo56685x3d7f3f1d = vn2.u0.f519920a.j(c14994x9b99c079);
            if (mo56685x3d7f3f1d <= 0) {
                r45.no2 m76812x1c39ba23 = c14994x9b99c079.getFeedObject().m76812x1c39ba23();
                mo56685x3d7f3f1d = m76812x1c39ba23 != null ? m76812x1c39ba23.m75939xb282bd08(0) : 0;
            }
        }
        long j17 = mo56685x3d7f3f1d;
        c03.k.b(context, this.f537077b, c14994x9b99c079, j17, z17, str);
        ((wn2.f) i95.n0.c(wn2.f.class)).Ai(context, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f537078c, "source " + i17 + " jumpToFinderLongVideoShareUI position=" + i18 + " MegaVideoCardFeed:" + c14994x9b99c079 + ",playTime=" + j17);
    }

    public final void o(zn2.a aVar, int i17) {
        r45.vx0 vx0Var;
        java.util.Iterator it = j().m56388xcaeb60d0().iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            } else if (((so2.j5) it.next()) instanceof zn2.a) {
                break;
            } else {
                i18++;
            }
        }
        boolean rj6 = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).rj(aVar.getFeedObject().m59299x6bf53a6c());
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[10];
        lVarArr[0] = new jz5.l("view_id", "long_video_card");
        lVarArr[1] = new jz5.l("finder_context_id", this.f537077b);
        lVarArr[2] = new jz5.l("comment_scene", 281);
        lVarArr[3] = new jz5.l("feed_id", pm0.v.u(aVar.mo2128x1ed62e84()));
        lVarArr[4] = new jz5.l("card_idex", java.lang.Integer.valueOf((i17 - i18) + 1));
        lVarArr[5] = new jz5.l("refresh_num", java.lang.Integer.valueOf(this.f537085j));
        r45.ru2 m76771x17e42f9f = aVar.getFeedObject().getFeedObject().m76771x17e42f9f();
        lVarArr[6] = new jz5.l("recommend_reason", m76771x17e42f9f != null ? m76771x17e42f9f.m75945x2fec8307(0) : null);
        r45.dm2 m76806xdef68064 = aVar.getFeedObject().getFeedObject().m76806xdef68064();
        lVarArr[7] = new jz5.l("collection_id", pm0.v.u((m76806xdef68064 == null || (vx0Var = (r45.vx0) m76806xdef68064.m75936x14adae67(0)) == null) ? 0L : vx0Var.m75942xfb822ef2(0)));
        lVarArr[8] = new jz5.l("follow_type", java.lang.Integer.valueOf(rj6 ? 1 : 0));
        lVarArr[9] = new jz5.l("session_buffer", aVar.getFeedObject().getFeedObject().m76829x97edf6c0());
        ((cy1.a) rVar).yj("view_clk", null, kz5.c1.k(lVarArr), 1, false);
    }

    public final void p() {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        boolean i17 = i();
        java.lang.String str = this.f537078c;
        if (i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "mega_verify start fail as closeDetectionValidity");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "mega_verify start");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f537093r;
        boolean z17 = false;
        if (r2Var != null && r2Var.a()) {
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "mega_verify start fail as job active");
            return;
        }
        p3325xe03a0797.p3326xc267989b.c0 a17 = p3325xe03a0797.p3326xc267989b.v2.a(null, 1, null);
        this.f537093r = a17;
        this.f537094s = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(a17));
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f537093r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r2Var2, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
        this.f537095t = p3325xe03a0797.p3326xc267989b.z0.a(g3Var.mo7096x348d9a((p3325xe03a0797.p3326xc267989b.c0) r2Var2));
        if (this.f537093r == null || (y0Var = this.f537094s) == null || this.f537095t == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "mega_verify start fail as coroutine");
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(y0Var);
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new xn2.n0(this, null), 3, null);
        }
    }
}
