package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class ew extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz f184826e;

    /* renamed from: f, reason: collision with root package name */
    public final int f184827f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f184828g;

    /* renamed from: h, reason: collision with root package name */
    public r45.qt2 f184829h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f184830i;

    /* renamed from: m, reason: collision with root package name */
    public final fp0.t f184831m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f184832n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.w0 f184833o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f184834p;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.Rect f184835q;

    /* renamed from: r, reason: collision with root package name */
    public final android.graphics.Rect f184836r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.dw f184837s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.C13705x51bf1443 f184838t;

    /* renamed from: u, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f184839u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f184840v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.fv f184841w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f184842x;

    /* JADX WARN: Type inference failed for: r10v11, types: [com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$lifecycleObserver$1] */
    public ew(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz contract, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contract, "contract");
        this.f184826e = contract;
        this.f184827f = i17;
        this.f184828g = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bw.f184538d);
        this.f184830i = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.mv.f185582d);
        fp0.t tVar = new fp0.t("StreamCardFeedLoader");
        tVar.e();
        this.f184831m = tVar;
        this.f184833o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.w0(0L, 1, null);
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        for (int i18 = 0; i18 < 4; i18++) {
            arrayList.add(new r45.mb4());
        }
        this.f184834p = arrayList;
        this.f184835q = new android.graphics.Rect();
        this.f184836r = new android.graphics.Rect();
        this.f184837s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.dw(this);
        this.f184838t = new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$lifecycleObserver$1
            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_PAUSE)
            /* renamed from: onPause */
            public final void m55619xb01dfb57() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.fv fvVar;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys ysVar;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ew ewVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ew.this;
                android.view.View view = ewVar.f184840v;
                if (view == null || !com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ew.n(ewVar, view) || (ysVar = (fvVar = ewVar.f184841w).f184956a) == null) {
                    return;
                }
                long currentTimeMillis = java.lang.System.currentTimeMillis() - fvVar.f184958c;
                int indexOf = ewVar.f184826e.C.m56388xcaeb60d0().indexOf(ysVar);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x4 x4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x4.f206968a;
                java.lang.String m75945x2fec8307 = ysVar.f192725d.m75945x2fec8307(1);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                java.lang.String str = m75945x2fec8307;
                r45.qt2 qt2Var = ewVar.f184829h;
                if (qt2Var != null) {
                    x4Var.a(str, ysVar, indexOf, currentTimeMillis, qt2Var);
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contextObj");
                    throw null;
                }
            }

            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
            /* renamed from: onResume */
            public final void m55620x57429eec() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ew ewVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ew.this;
                android.view.View view = ewVar.f184840v;
                if (view == null || !com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ew.n(ewVar, view)) {
                    return;
                }
                ewVar.f184841w.f184958c = java.lang.System.currentTimeMillis();
            }
        };
        this.f184841w = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.fv(null, 0L, 0L, 0L, -1);
    }

    public static final boolean n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ew ewVar, android.view.View view) {
        android.graphics.Rect rect = ewVar.f184835q;
        view.getHitRect(rect);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = ewVar.f184839u;
        android.graphics.Rect rect2 = ewVar.f184836r;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.getLocalVisibleRect(rect2);
        }
        int i17 = rect.top;
        if (i17 < 0) {
            rect.top = 0;
        } else {
            int i18 = rect2.bottom;
            if (i17 > i18) {
                rect.top = i18;
            }
        }
        int i19 = rect.bottom;
        if (i19 < 0) {
            rect.bottom = 0;
        } else {
            int i27 = rect2.bottom;
            if (i19 > i27) {
                rect.bottom = i27;
            }
        }
        return view.getHeight() > 0 && rect.height() > 0 && rect.height() >= view.getHeight() / 6;
    }

    public static final void o(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ew ewVar, android.content.Context context, int i17, in5.s0 s0Var) {
        ewVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys ysVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys) s0Var.f374658i;
        java.util.LinkedList linkedList = ysVar.f192727f;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            return;
        }
        int indexOf = ewVar.f184826e.C.m56388xcaeb60d0().indexOf(ysVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x4 x4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x4.f206968a;
        java.lang.String m75945x2fec8307 = ysVar.f192725d.m75945x2fec8307(1);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        long m75942xfb822ef2 = ysVar.f192725d.m75942xfb822ef2(14);
        long mo2128x1ed62e84 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) linkedList.get(0)).mo2128x1ed62e84();
        r45.qt2 qt2Var = ewVar.f184829h;
        if (qt2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contextObj");
            throw null;
        }
        x4Var.b(m75945x2fec8307, m75942xfb822ef2, i17, mo2128x1ed62e84, qt2Var, indexOf);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStreamCardAlbumConvert", "[jumpRelatedTimelineUI] parentIndex=" + indexOf + " cardBuffer=" + ysVar.f192725d.m75934xbce7f2f(6));
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) linkedList.get(0)).mo2128x1ed62e84() == 0) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("TITLE_WORDING", ysVar.f192725d.m75945x2fec8307(1));
        intent.putExtra("CARD_ID", ysVar.f192725d.m75942xfb822ef2(14));
        intent.putExtra("GET_REL_SCENE", ysVar.f192725d.m75939xb282bd08(9));
        intent.putExtra("STREAM_CARD", ysVar.f192725d.mo14344x5f01b1f6());
        intent.putExtra("COMMENT_SCENE", 51);
        hc2.e0.b(intent, 0, new java.util.LinkedList(linkedList), ysVar.f192725d.m75934xbce7f2f(6), null);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).Ni(context, intent);
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569377n;
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        this.f184839u = recyclerView;
        android.content.Context context = recyclerView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        this.f184829h = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).W6(this.f184827f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.dw dwVar = this.f184837s;
        recyclerView.V0(dwVar);
        recyclerView.i(dwVar);
        android.content.Context context2 = recyclerView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4 = ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2).mo273xed6858b4();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.C13705x51bf1443 c13705x51bf1443 = this.f184838t;
        mo273xed6858b4.c(c13705x51bf1443);
        android.content.Context context3 = recyclerView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context3).mo273xed6858b4().a(c13705x51bf1443);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f568116lr1);
        linearLayout.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.pv(linearLayout));
        linearLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rv(this, holder, i17));
        holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f568319mh2).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.sv(holder));
        holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f565086b72).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.tv(holder));
        com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f565086b72)).getPaint(), 0.8f);
        com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.lqz)).getPaint(), 0.8f);
        holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f568316mh0).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.uv(holder, this));
        holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f565088b74).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.vv(holder, this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15284x9cdf7710 c15284x9cdf7710 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15284x9cdf7710) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f565883dz4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.wv wvVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.wv(holder, this, this.f184834p);
        wvVar.f503999c = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.xv(holder, this);
        c15284x9cdf7710.mo62058x6cab2c8d(wvVar);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
    }

    @Override // in5.r
    public void j(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        super.j(recyclerView);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStreamCardAlbumConvert", "[onDetachedFromRecyclerView] ret=" + this.f184833o.a() + " report unReadItem");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa c13924x37151faa = this.f184833o.f189598c;
        if (c13924x37151faa != null) {
            int i17 = this.f184827f;
            java.lang.Iterable<so2.j5> m56409x97891cf7 = c13924x37151faa.m56409x97891cf7();
            if (m56409x97891cf7 == null) {
                m56409x97891cf7 = new java.util.LinkedList();
            }
            r45.qt2 qt2Var = this.f184829h;
            if (qt2Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contextObj");
                throw null;
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (so2.j5 j5Var : m56409x97891cf7) {
                if (!bu2.j.f106067a.i(i17, j5Var.mo2128x1ed62e84())) {
                    r45.e13 e13Var = new r45.e13();
                    e13Var.set(0, java.lang.Long.valueOf(j5Var.mo2128x1ed62e84()));
                    boolean z17 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = z17 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
                    e13Var.set(4, abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.w() : null);
                    if (z17) {
                        e13Var.set(1, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject().m59276x6c285d75());
                    }
                    e13Var.set(3, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(e13Var.m75942xfb822ef2(0), e13Var.m75945x2fec8307(4), qt2Var.m75939xb282bd08(5)));
                    e13Var.set(2, 4);
                    linkedList.add(e13Var);
                }
            }
            if (!linkedList.isEmpty()) {
                new db2.f(linkedList, qt2Var).l();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$fetchContent$loader$1, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher] */
    public final void p(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys ysVar, final r45.vd6 vd6Var, yz5.l lVar) {
        r45.z91 z91Var;
        r45.ni6 ni6Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[fetchContent] isRefresh=");
        sb6.append(z17);
        sb6.append(" hasCache=");
        sb6.append(this.f184833o.f189598c != null);
        sb6.append(" card request id=");
        r45.xw2 xw2Var = (r45.xw2) ysVar.f192725d.m75936x14adae67(22);
        sb6.append(pm0.v.u((xw2Var == null || (z91Var = (r45.z91) xw2Var.m75936x14adae67(2)) == null || (ni6Var = (r45.ni6) z91Var.m75936x14adae67(20)) == null) ? 0L : ni6Var.m75942xfb822ef2(0)));
        sb6.append(fb2.l.a(ysVar.f192725d));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStreamCardAlbumConvert", sb6.toString());
        final r45.qt2 qt2Var = this.f184829h;
        if (qt2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contextObj");
            throw null;
        }
        ?? r76 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13860x3630fe09(qt2Var) { // from class: com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$fetchContent$loader$1
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13860x3630fe09, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
            /* renamed from: createDataFetch */
            public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0 mo55585x919c3b94() {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.lv(this, r45.vd6.this);
            }
        };
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13922x2e8bf6c7.m56397xe61f0140(r76, new ym5.w(), false, 2, null);
        this.f184831m.b(new fp0.r(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kv(z17, ysVar, r76, this, vd6Var, lVar), null, 2, null));
    }

    public final r45.vd6 q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys ysVar) {
        r45.vd6 vd6Var = new r45.vd6();
        vd6Var.set(2, new r45.yw6());
        vd6Var.set(1, new r45.oi());
        vd6Var.set(3, new r45.q25());
        vd6Var.set(0, java.lang.Long.valueOf(ysVar.mo2128x1ed62e84()));
        vd6Var.set(8, ysVar.f192725d.m75945x2fec8307(15));
        vd6Var.set(10, java.lang.Integer.valueOf(hc2.d0.b(this.f184827f)));
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        vd6Var.set(5, xy2.c.e(context));
        vd6Var.set(11, java.lang.Long.valueOf(ysVar.f192728g));
        vd6Var.set(6, java.lang.Long.valueOf(c01.id.c()));
        vd6Var.set(13, 11);
        return vd6Var;
    }

    @Override // in5.r
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void h(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys item, int i17, int i18, boolean z17, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStreamCardAlbumConvert", "[onBindViewHolder] isHotPatch=" + z17 + " pos=" + i17 + " item=" + fb2.l.a(item.f192725d) + " rvFeedList isEmpty=" + item.f192727f.isEmpty());
        this.f184840v = holder.f3639x46306858;
        long mo2128x1ed62e84 = item.mo2128x1ed62e84();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.fv fvVar = this.f184841w;
        fvVar.f184957b = mo2128x1ed62e84;
        fvVar.f184959d = i17;
        fvVar.f184956a = item;
        item.f192729h = i17;
        jz5.f0 f0Var = null;
        if (!z17 && item.f192727f.isEmpty()) {
            r45.xw2 xw2Var = (r45.xw2) item.f192725d.m75936x14adae67(20);
            if (xw2Var != null && xw2Var.m75939xb282bd08(0) == 1) {
                p(false, item, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.nv(this, holder, i17, i18, z17, list));
            }
        } else if (!item.f192727f.isEmpty()) {
            java.util.ArrayList arrayList = this.f184834p;
            arrayList.clear();
            java.util.LinkedList linkedList = item.f192727f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) it.next()).getFeedObject().m59264x7efe73ec().getFirst());
            }
            arrayList.addAll(arrayList2.subList(0, java.lang.Math.min(4, item.f192727f.size())));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15284x9cdf7710 c15284x9cdf7710 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15284x9cdf7710) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f565883dz4);
            c15284x9cdf7710.f212604i = true;
            c15284x9cdf7710.isInLayout();
            c15284x9cdf7710.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.q9(c15284x9cdf7710));
            c15284x9cdf7710.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ov(this));
            s(item, q(item));
        }
        ((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.obc)).b(item.f192725d.m75945x2fec8307(1));
        ((android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.nq_)).setText(item.f192725d.m75945x2fec8307(13));
        java.lang.String m75945x2fec8307 = item.f192725d.m75945x2fec8307(21);
        if (m75945x2fec8307 != null) {
            android.view.View findViewById = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f568116lr1);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/feed/FinderStreamCardFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/feed/FinderStreamCardFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.lqz)).setText(m75945x2fec8307);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            android.view.View findViewById2 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f568116lr1);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/feed/FinderStreamCardFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/feed/FinderStreamCardFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void s(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys ysVar, r45.vd6 vd6Var) {
        r45.z91 z91Var;
        r45.ni6 ni6Var;
        if (((java.lang.Boolean) ((jz5.n) this.f184830i).mo141623x754a37bb()).booleanValue()) {
            java.lang.String m75945x2fec8307 = ysVar.f192725d.m75945x2fec8307(21);
            if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                return;
            }
            if (this.f184833o.f189598c != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderStreamCardAlbumConvert", "has cache never use. just return.");
                return;
            }
            if (this.f184842x) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderStreamCardAlbumConvert", "isPreloadContenting. just return.");
                return;
            }
            this.f184842x = true;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[preloadContent] now title=");
            sb6.append(ysVar.f192725d.m75945x2fec8307(1));
            sb6.append(" stats=");
            long j17 = 0;
            sb6.append(pm0.v.u(vd6Var != null ? vd6Var.m75942xfb822ef2(0) : 0L));
            sb6.append(" card request id=");
            r45.xw2 xw2Var = (r45.xw2) ysVar.f192725d.m75936x14adae67(22);
            if (xw2Var != null && (z91Var = (r45.z91) xw2Var.m75936x14adae67(2)) != null && (ni6Var = (r45.ni6) z91Var.m75936x14adae67(20)) != null) {
                j17 = ni6Var.m75942xfb822ef2(0);
            }
            sb6.append(pm0.v.u(j17));
            sb6.append(' ');
            sb6.append(fb2.l.a(ysVar.f192725d));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStreamCardAlbumConvert", sb6.toString());
            this.f184831m.b(new fp0.r(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.aw(this, ysVar, vd6Var), null, 2, null));
        }
    }
}
