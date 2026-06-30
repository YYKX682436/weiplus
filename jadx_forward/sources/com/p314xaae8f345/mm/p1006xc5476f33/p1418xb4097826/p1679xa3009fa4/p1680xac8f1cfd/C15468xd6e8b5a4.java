package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC */
/* loaded from: classes2.dex */
public final class C15468xd6e8b5a4 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements mv2.w0 {

    /* renamed from: d, reason: collision with root package name */
    public int f215140d;

    /* renamed from: e, reason: collision with root package name */
    public so2.a2 f215141e;

    /* renamed from: f, reason: collision with root package name */
    public long f215142f;

    /* renamed from: g, reason: collision with root package name */
    public long f215143g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215144h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215145i;

    /* renamed from: m, reason: collision with root package name */
    public so2.r4 f215146m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.wu f215147n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15470x28cf6b8c f215148o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15469xb011a10a f215149p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC$feedProgressListener$1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC$feedDeleteListener$1] */
    public C15468xd6e8b5a4(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f215144h = new java.util.concurrent.ConcurrentHashMap();
        this.f215145i = new java.util.concurrent.ConcurrentHashMap();
        this.f215146m = so2.r4.f492108e;
        this.f215147n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.wu(this);
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f215148o = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f>(a0Var) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC$feedProgressListener$1
            {
                this.f39173x3fe91575 = 1870727551;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f c5442xd807898f) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f event = c5442xd807898f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15468xd6e8b5a4 c15468xd6e8b5a4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15468xd6e8b5a4.this;
                long j17 = c15468xd6e8b5a4.f215142f;
                if (j17 <= 0) {
                    return true;
                }
                am.ga gaVar = event.f135783g;
                if (gaVar.f88282a != j17 || gaVar.f88283b <= 0) {
                    return true;
                }
                c15468xd6e8b5a4.f215145i.put(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(gaVar.f88283b));
                xm5.d.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.vu(c15468xd6e8b5a4, event));
                return true;
            }
        };
        this.f215149p = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11>(a0Var) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC$feedDeleteListener$1
            {
                this.f39173x3fe91575 = -108499199;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11 c5437xe8b43b11) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11 event = c5437xe8b43b11;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.da daVar = event.f135780g;
                long j17 = daVar.f87971b;
                long j18 = daVar.f87970a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15468xd6e8b5a4 c15468xd6e8b5a4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15468xd6e8b5a4.this;
                if (j17 == c15468xd6e8b5a4.f215142f || j18 == c15468xd6e8b5a4.f215143g) {
                    xm5.d.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.uu(c15468xd6e8b5a4));
                }
                return true;
            }
        };
    }

    public static final void O6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15468xd6e8b5a4 c15468xd6e8b5a4, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, sr2.u uVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5;
        long j17 = 0;
        if (c15468xd6e8b5a4.f215142f <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostRemindUIC", "[checkShowRemind] localId is zero, source:" + uVar);
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        if (c1162x665295de == null) {
            return;
        }
        int w17 = c1162x665295de.w();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = c1163xf1deaba4.p0(w17);
        in5.s0 s0Var = p07 instanceof in5.s0 ? (in5.s0) p07 : null;
        if (s0Var != null && (abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) s0Var.f374658i) != null) {
            j17 = abstractC14490x69736cb5.mo2128x1ed62e84();
        }
        boolean z17 = j17 == c15468xd6e8b5a4.f215142f || j17 == c15468xd6e8b5a4.f215143g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostRemindUIC", "[checkShowRemind] curPosition:" + w17 + " curShowState:" + c15468xd6e8b5a4.f215146m + " curFeedId:" + pm0.v.u(j17) + " localId:" + c15468xd6e8b5a4.f215142f + " source:" + uVar);
        if (z17 && c15468xd6e8b5a4.f215146m == so2.r4.f492107d) {
            c15468xd6e8b5a4.f215146m = so2.r4.f492108e;
            c15468xd6e8b5a4.R6(uVar);
        } else {
            if (z17 || c15468xd6e8b5a4.f215146m != so2.r4.f492108e) {
                return;
            }
            c15468xd6e8b5a4.f215146m = so2.r4.f492107d;
            c15468xd6e8b5a4.R6(uVar);
        }
    }

    public static final void P6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15468xd6e8b5a4 c15468xd6e8b5a4) {
        so2.a2 a2Var = c15468xd6e8b5a4.f215141e;
        so2.u4 u4Var = a2Var != null ? a2Var.f491785i : null;
        if (u4Var != null) {
            u4Var.f492169a = so2.r4.f492108e;
        }
        c15468xd6e8b5a4.S6();
        c15468xd6e8b5a4.f215142f = 0L;
        c15468xd6e8b5a4.f215143g = 0L;
        c15468xd6e8b5a4.f215144h.remove(0L);
        c15468xd6e8b5a4.f215146m = so2.r4.f492108e;
    }

    public final void Q6(long j17, so2.v4 v4Var, long j18) {
        so2.u4 u4Var;
        so2.a2 a2Var = this.f215141e;
        if (a2Var != null && (u4Var = a2Var.f491785i) != null) {
            u4Var.f492170b = j17;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v4Var, "<set-?>");
            u4Var.f492171c = v4Var;
            u4Var.f492173e = j18;
            java.lang.Integer num = (java.lang.Integer) this.f215145i.get(java.lang.Long.valueOf(j17));
            u4Var.f492172d = num == null ? 0 : num.intValue();
        }
        S6();
    }

    public final void R6(sr2.u uVar) {
        so2.u4 u4Var;
        so2.v4 v4Var = (so2.v4) this.f215144h.get(java.lang.Long.valueOf(this.f215142f));
        if (v4Var == null) {
            v4Var = so2.v4.f492204d;
        }
        so2.a2 a2Var = this.f215141e;
        if (a2Var != null && (u4Var = a2Var.f491785i) != null) {
            so2.r4 r4Var = this.f215146m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4Var, "<set-?>");
            u4Var.f492169a = r4Var;
            long j17 = this.f215142f;
            u4Var.f492170b = j17;
            u4Var.f492171c = v4Var;
            java.lang.Integer num = (java.lang.Integer) this.f215145i.get(java.lang.Long.valueOf(j17));
            u4Var.f492172d = num == null ? 0 : num.intValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uVar, "<set-?>");
            u4Var.f492174f = uVar;
        }
        S6();
    }

    public final void S6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 U6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class)).U6(this.f215140d);
        if (U6 == null) {
            return;
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.b(U6).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d1.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostRemindUIC", "[notifyUpdate] result:" + ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d1) a17).Q6());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
        mv2.f0.f413094a.a(this);
        mo48813x58998cd();
        mo48813x58998cd();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostRemindUIC", "[onCreate]");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
        mv2.f0.f413094a.t(this);
        mo48814x2efc64();
        mo48814x2efc64();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostRemindUIC", "[onDestroy]");
    }

    @Override // mv2.w0
    /* renamed from: onPostErr */
    public void mo56114x385435c6(long j17, boolean z17) {
        so2.v4 v4Var = so2.v4.f492208h;
        this.f215144h.put(java.lang.Long.valueOf(j17), v4Var);
        Q6(j17, v4Var, 0L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostRemindUIC", "[onPostEnd] localId:" + j17);
    }

    @Override // mv2.w0
    /* renamed from: onPostFakeOk */
    public void mo56115x10614c10(long j17) {
    }

    @Override // mv2.w0
    /* renamed from: onPostOk */
    public void mo56117x5465d15b(long j17, long j18) {
        this.f215143g = j18;
        so2.v4 v4Var = so2.v4.f492207g;
        this.f215144h.put(java.lang.Long.valueOf(j17), v4Var);
        Q6(j17, v4Var, j18);
        sr2.t tVar = sr2.t.f493251d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0 ad0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207935a;
        pm0.v.V(((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.L).mo141623x754a37bb()).r()).longValue() * 1000, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.tu(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostRemindUIC", "[onPostOk] localId:" + j17 + " svrId:" + pm0.v.u(this.f215143g));
    }

    @Override // mv2.w0
    /* renamed from: onPostStart */
    public void mo55429x74e3dc83(long j17) {
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f215144h;
        so2.v4 v4Var = (so2.v4) concurrentHashMap.get(valueOf);
        if (v4Var == null) {
            v4Var = so2.v4.f492204d;
        }
        if (v4Var == so2.v4.f492204d) {
            this.f215142f = j17;
            concurrentHashMap.put(java.lang.Long.valueOf(j17), so2.v4.f492205e);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostRemindUIC", "[onPostStart] localId:" + j17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC$feedProgressListener$1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC$feedDeleteListener$1] */
    public C15468xd6e8b5a4(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f215144h = new java.util.concurrent.ConcurrentHashMap();
        this.f215145i = new java.util.concurrent.ConcurrentHashMap();
        this.f215146m = so2.r4.f492108e;
        this.f215147n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.wu(this);
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f215148o = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f>(a0Var) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC$feedProgressListener$1
            {
                this.f39173x3fe91575 = 1870727551;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f c5442xd807898f) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f event = c5442xd807898f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15468xd6e8b5a4 c15468xd6e8b5a4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15468xd6e8b5a4.this;
                long j17 = c15468xd6e8b5a4.f215142f;
                if (j17 <= 0) {
                    return true;
                }
                am.ga gaVar = event.f135783g;
                if (gaVar.f88282a != j17 || gaVar.f88283b <= 0) {
                    return true;
                }
                c15468xd6e8b5a4.f215145i.put(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(gaVar.f88283b));
                xm5.d.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.vu(c15468xd6e8b5a4, event));
                return true;
            }
        };
        this.f215149p = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11>(a0Var) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC$feedDeleteListener$1
            {
                this.f39173x3fe91575 = -108499199;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11 c5437xe8b43b11) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11 event = c5437xe8b43b11;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.da daVar = event.f135780g;
                long j17 = daVar.f87971b;
                long j18 = daVar.f87970a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15468xd6e8b5a4 c15468xd6e8b5a4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15468xd6e8b5a4.this;
                if (j17 == c15468xd6e8b5a4.f215142f || j18 == c15468xd6e8b5a4.f215143g) {
                    xm5.d.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.uu(c15468xd6e8b5a4));
                }
                return true;
            }
        };
    }
}
