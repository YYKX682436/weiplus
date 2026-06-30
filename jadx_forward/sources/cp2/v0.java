package cp2;

/* loaded from: classes2.dex */
public abstract class v0 implements cp2.c {
    public final boolean A;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14503xa82df17c B;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14504xcf6c120c C;
    public final so2.s D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f302460d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.qt2 f302461e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f302462f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f302463g;

    /* renamed from: h, reason: collision with root package name */
    public int f302464h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f302465i;

    /* renamed from: m, reason: collision with root package name */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f302466m;

    /* renamed from: n, reason: collision with root package name */
    public r45.dd2 f302467n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f302468o;

    /* renamed from: p, reason: collision with root package name */
    public cp2.d f302469p;

    /* renamed from: q, reason: collision with root package name */
    public final ey2.c3 f302470q;

    /* renamed from: r, reason: collision with root package name */
    public qq2.b f302471r;

    /* renamed from: s, reason: collision with root package name */
    public zo2.e f302472s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f302473t;

    /* renamed from: u, reason: collision with root package name */
    public gp2.l0 f302474u;

    /* renamed from: v, reason: collision with root package name */
    public r45.ha2 f302475v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc f302476w;

    /* renamed from: x, reason: collision with root package name */
    public final ym5.q1 f302477x;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14505x6b968c11 f302478y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f302479z;

    /* JADX WARN: Type inference failed for: r10v4, types: [com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$finderNearbyDataUpdateEventListener$1] */
    /* JADX WARN: Type inference failed for: r10v5, types: [com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$finderNearbyRefreshEventListener$1] */
    /* JADX WARN: Type inference failed for: r9v6, types: [com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$uninterestEventListener$1] */
    public v0(final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, r45.qt2 contextObj, java.lang.String by_pass, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(by_pass, "by_pass");
        this.f302460d = activity;
        this.f302461e = contextObj;
        this.f302462f = by_pass;
        this.f302463g = str;
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(ey2.c3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        this.f302470q = (ey2.c3) a17;
        this.f302477x = new cp2.u0(this);
        this.f302478y = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5502x94939ae6>(activity) { // from class: com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$uninterestEventListener$1
            {
                this.f39173x3fe91575 = -1131845930;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5502x94939ae6 c5502x94939ae6) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5502x94939ae6 event = c5502x94939ae6;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                long j17 = event.f135834g.f88203a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc = cp2.v0.this.f302476w;
                if (c14500x958689dc != null) {
                    c14500x958689dc.mo56120xc84af884(j17, true);
                }
                return true;
            }
        };
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "#init");
        this.A = true;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.B = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5511xb88a5c22>(a0Var) { // from class: com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$finderNearbyDataUpdateEventListener$1
            {
                this.f39173x3fe91575 = -528472046;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5511xb88a5c22 c5511xb88a5c22) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0 merger;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5511xb88a5c22 event = c5511xb88a5c22;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                cp2.v0 v0Var = cp2.v0.this;
                if (!v0Var.E) {
                    return true;
                }
                am.oc ocVar = event.f135842g;
                if (ocVar.f89055c == null) {
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", " receive FinderNearbyDataUpdateEvent");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc = v0Var.f302476w;
                if (c14500x958689dc == null || (merger = c14500x958689dc.getMerger()) == null) {
                    return true;
                }
                java.lang.Object obj = ocVar.f89055c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.internal.IResponse<com.tencent.mm.plugin.finder.model.RVFeed>");
                merger.mo56444x985fac74((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa) obj, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.t0(ocVar.f89053a, ocVar.f89054b), new cp2.i0(v0Var));
                return true;
            }
        };
        this.C = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5512x74981384>(a0Var) { // from class: com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$finderNearbyRefreshEventListener$1
            {
                this.f39173x3fe91575 = -1196995180;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5512x74981384 c5512x74981384) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5512x74981384 event = c5512x74981384;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" receive FinderNearbyRefreshEvent objectId = ");
                am.pc pcVar = event.f135843g;
                sb6.append(pcVar.f89145a);
                sb6.append(" , ");
                cp2.v0 v0Var = cp2.v0.this;
                sb6.append(v0Var.E);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", sb6.toString());
                if (!v0Var.E) {
                    return true;
                }
                v0Var.P(16, pcVar.f89145a, v0Var.f302473t);
                return true;
            }
        };
        this.D = new so2.s(null, 0, 0, null, 15, null);
        this.F = true;
        this.H = true;
    }

    public final void A() {
        ((cp2.q1) z()).j().postDelayed(new cp2.j0(this), 200L);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void B(boolean r13) {
        /*
            r12 = this;
            cp2.d r0 = r12.z()
            cp2.q1 r0 = (cp2.q1) r0
            com.tencent.mm.view.recyclerview.WxRecyclerView r0 = r0.g()
            if (r0 != 0) goto Ld
            return
        Ld:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r0.getLayoutManager()
            boolean r2 = r1 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1
            r9 = 0
            if (r2 == 0) goto L22
            r2 = 2
            int[] r2 = new int[r2]
            androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) r1
            r1.u(r2)
            r1 = r2[r9]
        L20:
            r10 = r1
            goto L2e
        L22:
            boolean r2 = r1 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de
            if (r2 == 0) goto L2d
            androidx.recyclerview.widget.LinearLayoutManager r1 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) r1
            int r1 = r1.w()
            goto L20
        L2d:
            r10 = r9
        L2e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[onActionbarClick] position="
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r2 = " isDouble="
            r1.append(r2)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Finder.TimelineLbsPresenter"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
            if (r13 == 0) goto Le1
            r13 = 12
            if (r10 > r13) goto L92
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.ThreadLocal r1 = zj0.c.f554818a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r11.add(r1)
            java.util.Collections.reverse(r11)
            java.lang.Object[] r2 = r11.toArray()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter"
            java.lang.String r4 = "onActionbarClick"
            java.lang.String r5 = "(Z)V"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "smoothScrollToPosition"
            java.lang.String r8 = "(I)V"
            r1 = r0
            yj0.a.d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r11.get(r9)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.c1(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter"
            java.lang.String r3 = "onActionbarClick"
            java.lang.String r4 = "(Z)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "smoothScrollToPosition"
            java.lang.String r7 = "(I)V"
            r1 = r0
            yj0.a.f(r1, r2, r3, r4, r5, r6, r7)
            goto Ld4
        L92:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.ThreadLocal r1 = zj0.c.f554818a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r11.add(r1)
            java.util.Collections.reverse(r11)
            java.lang.Object[] r2 = r11.toArray()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter"
            java.lang.String r4 = "onActionbarClick"
            java.lang.String r5 = "(Z)V"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "scrollToPosition"
            java.lang.String r8 = "(I)V"
            r1 = r0
            yj0.a.d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r11.get(r9)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.a1(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter"
            java.lang.String r3 = "onActionbarClick"
            java.lang.String r4 = "(Z)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "scrollToPosition"
            java.lang.String r7 = "(I)V"
            r1 = r0
            yj0.a.f(r1, r2, r3, r4, r5, r6, r7)
        Ld4:
            if (r10 > r13) goto Ldc
            r0 = 20
            r12.c(r0, r9)
            goto Le1
        Ldc:
            r0 = 100
            r12.c(r0, r9)
        Le1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cp2.v0.B(boolean):void");
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$createFeedLoader$1, com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader] */
    public void C(cp2.d callback, boolean z17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        int i17;
        java.util.LinkedList m75941xfb821914;
        android.view.View view;
        android.widget.TextView textView;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "onAttach targetPageForceRefreshFlag:" + z17 + " targetTabPageLastBuffer:" + gVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        c0Var.f391645d = this.f302470q.Q6(v());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createFeedLoader canTimelineRefresh=");
        sb6.append(c0Var.f391645d);
        sb6.append(" memoryCacheFlag:");
        sb6.append(v());
        sb6.append(" tabId: ");
        r45.dd2 dd2Var = this.f302467n;
        sb6.append(dd2Var != null ? java.lang.Integer.valueOf(dd2Var.m75939xb282bd08(0)) : null);
        sb6.append(" tabName: ");
        r45.dd2 dd2Var2 = this.f302467n;
        sb6.append(dd2Var2 != null ? dd2Var2.m75945x2fec8307(1) : null);
        sb6.append("  commentScene: ");
        sb6.append(mo122374x8fadefe3());
        sb6.append(" contextScene: ");
        r45.qt2 qt2Var = this.f302461e;
        sb6.append(qt2Var.m75939xb282bd08(5));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", sb6.toString());
        final r45.qt2 qt2Var2 = this.f302461e;
        final int mo122374x8fadefe3 = mo122374x8fadefe3();
        final int y17 = y();
        final int s17 = s();
        final java.lang.String str = this.f302462f;
        final java.lang.String str2 = this.f302463g;
        final cp2.c0 c0Var2 = new cp2.c0(this);
        ?? r142 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc(qt2Var2, mo122374x8fadefe3, y17, s17, str, str2, c0Var2) { // from class: com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$createFeedLoader$1
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0
            /* renamed from: onFetchDone */
            public void mo55587xb461ee3d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response) {
                r45.ha2 ha2Var;
                java.util.LinkedList m75941xfb8219142;
                r45.dd2 dd2Var3;
                java.util.LinkedList m75941xfb8219143;
                r45.dd2 dd2Var4;
                java.util.LinkedList m75941xfb8219144;
                r45.dd2 dd2Var5;
                java.util.LinkedList m75941xfb8219145;
                r45.dd2 dd2Var6;
                gp2.l0 l0Var;
                r45.s92 s92Var;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14501x9975155 c14501x9975155;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
                r45.fd1 fd1Var = cp2.b.f302308x;
                cp2.v0 v0Var = cp2.v0.this;
                if (fd1Var != null && (s92Var = (r45.s92) fd1Var.m75936x14adae67(11)) != null) {
                    int m75939xb282bd08 = s92Var.m75939xb282bd08(0);
                    v0Var.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "adjustSquareStyle styleInfo: " + m75939xb282bd08);
                    if (m75939xb282bd08 == 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14501x9975155 c14501x99751552 = ((cp2.q1) v0Var.z()).f302430v;
                        if (c14501x99751552 != null) {
                            c14501x99751552.m58367xb154fcd1(1.7777778f);
                        }
                    } else if (m75939xb282bd08 == 1 && (c14501x9975155 = ((cp2.q1) v0Var.z()).f302430v) != null) {
                        c14501x9975155.m58367xb154fcd1(1.3333334f);
                    }
                    cp2.d z18 = v0Var.z();
                    int m75939xb282bd082 = s92Var.m75939xb282bd08(1);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveViewCallback", "setBottomExtraInfo: bottomExtraInfo=" + m75939xb282bd082);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14501x9975155 c14501x99751553 = ((cp2.q1) z18).f302430v;
                    if (c14501x99751553 != null) {
                        c14501x99751553.m58368xfb021631(m75939xb282bd082);
                    }
                }
                r45.fd1 fd1Var2 = cp2.b.f302308x;
                if (fd1Var2 != null && (l0Var = v0Var.f302474u) != null) {
                    l0Var.H(fd1Var2.m75939xb282bd08(14));
                }
                java.lang.String f204960d = getF204960d();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onfetchDone tabInfo: ");
                r45.dd2 dd2Var7 = v0Var.f302467n;
                sb7.append(dd2Var7 != null ? java.lang.Integer.valueOf(dd2Var7.m75939xb282bd08(0)) : null);
                sb7.append(' ');
                r45.dd2 dd2Var8 = v0Var.f302467n;
                sb7.append(dd2Var8 != null ? dd2Var8.m75945x2fec8307(1) : null);
                sb7.append(" subTab: ");
                r45.dd2 dd2Var9 = v0Var.f302467n;
                sb7.append((dd2Var9 == null || (m75941xfb8219145 = dd2Var9.m75941xfb821914(6)) == null || (dd2Var6 = (r45.dd2) kz5.n0.Z(m75941xfb8219145)) == null) ? null : java.lang.Integer.valueOf(dd2Var6.m75939xb282bd08(0)));
                sb7.append(" : ");
                r45.dd2 dd2Var10 = v0Var.f302467n;
                sb7.append((dd2Var10 == null || (m75941xfb8219144 = dd2Var10.m75941xfb821914(6)) == null || (dd2Var5 = (r45.dd2) kz5.n0.Z(m75941xfb8219144)) == null) ? null : dd2Var5.m75945x2fec8307(1));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f204960d, sb7.toString());
                boolean z19 = response instanceof cp2.m;
                cp2.m mVar = z19 ? (cp2.m) response : null;
                java.lang.Object request = mVar != null ? mVar.getRequest() : null;
                cp2.l lVar = request instanceof cp2.l ? (cp2.l) request : null;
                if (lVar != null) {
                    java.lang.String f204960d2 = getF204960d();
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder(" response request tabInfo: ");
                    r45.dd2 dd2Var11 = v0Var.f302467n;
                    sb8.append(dd2Var11 != null ? java.lang.Integer.valueOf(dd2Var11.hashCode()) : null);
                    sb8.append(' ');
                    r45.dd2 dd2Var12 = lVar.f302368b;
                    sb8.append(dd2Var12 != null ? java.lang.Integer.valueOf(dd2Var12.hashCode()) : null);
                    sb8.append(" tabInfo: ");
                    sb8.append(dd2Var12 != null ? java.lang.Integer.valueOf(dd2Var12.m75939xb282bd08(0)) : null);
                    sb8.append(' ');
                    sb8.append(dd2Var12 != null ? dd2Var12.m75945x2fec8307(1) : null);
                    sb8.append(" subTab: ");
                    sb8.append((dd2Var12 == null || (m75941xfb8219143 = dd2Var12.m75941xfb821914(6)) == null || (dd2Var4 = (r45.dd2) kz5.n0.Z(m75941xfb8219143)) == null) ? null : java.lang.Integer.valueOf(dd2Var4.m75939xb282bd08(0)));
                    sb8.append(' ');
                    sb8.append((dd2Var12 == null || (m75941xfb8219142 = dd2Var12.m75941xfb821914(6)) == null || (dd2Var3 = (r45.dd2) kz5.n0.Z(m75941xfb8219142)) == null) ? null : dd2Var3.m75945x2fec8307(1));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f204960d2, sb8.toString());
                }
                super.mo55587xb461ee3d(response);
                int refreshInterval = response.getRefreshInterval();
                if (refreshInterval > 0) {
                    zl2.r4.f555483a.I0().putInt("finder_live_watch_count_down_refresh_interval", refreshInterval);
                }
                cp2.m mVar2 = z19 ? (cp2.m) response : null;
                if (mVar2 != null && (ha2Var = mVar2.f302381a) != null) {
                    v0Var.f302475v = ha2Var;
                    v0Var.m(ha2Var);
                }
                v0Var.f302473t = response.getLastBuffer();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc = v0Var.f302476w;
                if (c14500x958689dc != null && c14500x958689dc.m56364x565743a9(response)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "handleRecomResponse lastResponseBuffer " + v0Var.f302473t);
                    sq2.g gVar2 = (sq2.g) ((ys5.f) i95.n0.c(ys5.f.class));
                    if (gVar2.f492884f) {
                        gVar2.f492882d = response;
                        c92.g gVar3 = c92.g.f121271a;
                        boolean z27 = ((java.lang.Number) kb2.c.f387760b.r()).intValue() == 1;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyRefreshServiceImp", "saveResponse " + gVar2.f492882d + " isEnableAnimReplace: " + z27);
                        if (!z27) {
                            gVar2.Di();
                        }
                    }
                }
                if (1 == response.getPullType() || response.getPullType() == 0) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5471xc77af86e c5471xc77af86e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5471xc77af86e();
                    c5471xc77af86e.f135809g.f88285a = true;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "handleFluentSwitch intercept exit");
                    c5471xc77af86e.e();
                }
            }
        };
        r142.m56375x868b9334(new cp2.g0(c0Var, this, r142));
        r142.f203001i = new cp2.h0(this, r142);
        this.f302476w = r142;
        this.f302468o = gVar;
        this.f302465i = z17;
        pf5.u uVar = pf5.u.f435469a;
        if (z17) {
            p012xc85e97e9.p093xedfae76a.c1 a17 = uVar.e(c61.l7.class).a(ey2.c3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            int v17 = v();
            ey2.x2 O6 = ((ey2.c3) uVar.e(c61.l7.class).a(ey2.c3.class)).O6(v17);
            O6.f339106f = ey2.z2.f339132e;
            O6.f339105e = 0L;
            O6.f339109i = 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PreloadCacheManager", "resetFirstPage memoryCacheFlag:" + v17);
        }
        this.f302469p = callback;
        cp2.d z18 = z();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc = this.f302476w;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c14500x958689dc);
        java.util.ArrayList data = c14500x958689dc.m56388xcaeb60d0();
        cp2.q1 q1Var = (cp2.q1) z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        cp2.u1 u1Var = q1Var.f302429u;
        u1Var.getClass();
        u1Var.f302458f = data;
        jz5.g gVar2 = q1Var.f302424p;
        jz5.g gVar3 = q1Var.f302425q;
        jz5.g gVar4 = q1Var.f302423o;
        boolean z19 = q1Var.f302419h;
        android.view.View view2 = q1Var.f302418g;
        if (z19) {
            q1Var.l().setBackgroundColor(view2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560045u));
            ((android.view.View) ((jz5.n) gVar4).mo141623x754a37bb()).setBackgroundColor(view2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560045u));
            q1Var.g().setBackgroundDrawable(view2.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a8w));
            ((android.widget.TextView) ((jz5.n) gVar3).mo141623x754a37bb()).setTextColor(view2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77647x5878209d));
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) gVar2).mo141623x754a37bb()).m82040x7541828(view2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77647x5878209d));
            on5.c m82923x19404fcc = q1Var.l().m82923x19404fcc();
            if (m82923x19404fcc != null && (view = m82923x19404fcc.getView()) != null && (textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ili)) != null) {
                textView.setTextColor(view2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b));
            }
            i17 = 5;
        } else {
            i17 = 5;
            if (q1Var.a().m75939xb282bd08(5) == 112) {
                q1Var.l().setBackgroundColor(view2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77698x3cb0744));
                ((android.view.View) ((jz5.n) gVar4).mo141623x754a37bb()).setBackgroundColor(view2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77698x3cb0744));
            } else {
                q1Var.l().setBackgroundColor(view2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77660x7595c307));
                ((android.view.View) ((jz5.n) gVar4).mo141623x754a37bb()).setBackgroundColor(view2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77660x7595c307));
                ((android.widget.TextView) ((jz5.n) gVar3).mo141623x754a37bb()).setTextColor(view2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77645xad7ef2c));
                ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) gVar2).mo141623x754a37bb()).m82040x7541828(view2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77645xad7ef2c));
            }
        }
        q1Var.l().m82945xba09cf09(new cp2.i1(q1Var));
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 g17 = q1Var.g();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15416x1f1f78b7 c15416x1f1f78b7 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15416x1f1f78b7() { // from class: com.tencent.mm.plugin.finder.nearby.live.NearbyLiveViewCallback$initRecyclerView$1
            @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
            /* renamed from: supportsPredictiveItemAnimations */
            public boolean mo7924x9f0306c5() {
                return false;
            }
        };
        boolean z27 = true;
        c15416x1f1f78b7.m8091xc21abdf5(true);
        g17.mo7967x900dcbe1(c15416x1f1f78b7);
        q1Var.g().N(new cp2.w0(q1Var.a().m75939xb282bd08(i17)));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 m7949x5701d990 = q1Var.g().m7949x5701d990();
        if (m7949x5701d990 != null) {
            m7949x5701d990.f93704f = 0L;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14501x9975155 c14501x9975155 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14501x9975155(q1Var.f302415d, q1Var.f302417f, q1Var.f302419h, q1Var.a().m75939xb282bd08(i17) == 112, q1Var.a().m75939xb282bd08(i17));
        q1Var.f302430v = c14501x9975155;
        cp2.c1 c1Var = new cp2.c1(data, c14501x9975155);
        q1Var.f302428t = c1Var;
        c1Var.f374638o = new cp2.d1(data, q1Var);
        c1Var.f374637n = new cp2.f1(data, q1Var);
        q1Var.g().mo7960x6cab2c8d(q1Var.f302428t);
        q1Var.g().m7963x830bc99d(true);
        q1Var.g().m7965x440a0e9(8);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 g18 = q1Var.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(g18, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        g18.m82903x154839fc(((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209349m1).mo141623x754a37bb()).r()).intValue());
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 g19 = q1Var.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g19, "<get-recyclerView>(...)");
        in5.o.b(g19, new cp2.g1(q1Var), cp2.h1.f302349d);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("initSubTabView tab:");
        r45.dd2 dd2Var3 = q1Var.f302420i;
        sb7.append(dd2Var3 != null ? dd2Var3.m75945x2fec8307(1) : null);
        sb7.append(" subTabCount:");
        sb7.append((dd2Var3 == null || (m75941xfb821914 = dd2Var3.m75941xfb821914(6)) == null) ? null : java.lang.Integer.valueOf(m75941xfb821914.size()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveViewCallback", sb7.toString());
        if (dd2Var3 != null) {
            q1Var.o().mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(q1Var.o().getContext(), 0, false));
            q1Var.o().mo7960x6cab2c8d(new cp2.z0(q1Var, dd2Var3));
            if (z19) {
                q1Var.o().setBackgroundColor(q1Var.o().getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560045u));
            }
            if (dd2Var3.m75941xfb821914(6).isEmpty() || ((java.lang.Number) ae2.in.U3.r()).intValue() != 1) {
                q1Var.o().setVisibility(8);
            } else {
                q1Var.o().setVisibility(0);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc2 = this.f302476w;
        if (c14500x958689dc2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13922x2e8bf6c7.m56397xe61f0140(c14500x958689dc2, this.f302477x, false, 2, null);
        }
        sq2.g gVar5 = (sq2.g) ((ys5.f) i95.n0.c(ys5.f.class));
        gVar5.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyRefreshServiceImp", "markEventRegister isRegister: true");
        gVar5.f492884f = true;
        mo48813x58998cd();
        mo48813x58998cd();
        mo48813x58998cd();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 g27 = ((cp2.q1) z()).g();
        if (g27 != null) {
            g27.i(new cp2.k0(this));
            rq2.p.f480392b = java.lang.String.valueOf(qt2Var.m75939xb282bd08(i17));
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f302460d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc3 = this.f302476w;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c14500x958689dc3);
            java.util.List m56388xcaeb60d0 = c14500x958689dc3.m56388xcaeb60d0();
            if (((java.lang.Number) yo2.e.f545675f.r()).intValue() != 1) {
                r45.dd2 dd2Var4 = this.f302467n;
                z27 = dd2Var4 != null ? dd2Var4.m75933x41a8a7f2(i17) : false;
            }
            boolean z28 = z27;
            r45.dd2 dd2Var5 = this.f302467n;
            gp2.l0 l0Var = new gp2.l0(abstractActivityC21394xb3d2c0cf, g27, m56388xcaeb60d0, z28, dd2Var5 != null ? dd2Var5.m75939xb282bd08(0) : 0, false, false, false, null, mn0.d0.f411248n, 7, java.lang.String.valueOf(mo122374x8fadefe3()), 0, false, null, null, 61920, null);
            l0Var.G = new cp2.l0(l0Var, this);
            this.f302474u = l0Var;
            l0Var.e(null);
            ((gp2.v0) uVar.e(wo2.k.class).a(gp2.v0.class)).N6(this.f302460d);
        }
        if (((cp2.q1) z()).g() != null && this.f302476w != null) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 g28 = ((cp2.q1) z()).g();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g28);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc4 = this.f302476w;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c14500x958689dc4);
            this.f302471r = new qq2.b(g28, c14500x958689dc4, this.f302467n, mo122374x8fadefe3());
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 g29 = ((cp2.q1) z()).g();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g29);
            this.f302472s = new zo2.e(g29, 2);
        }
        h();
    }

    public void D() {
        r45.dd2 dd2Var;
        if (this.f302476w == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.NearbyLivePresenter", "storeMemoryCache return for feedLoader:" + this.f302476w);
            return;
        }
        this.f302470q.f338869h.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc = this.f302476w;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c14500x958689dc);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys ysVar = c14500x958689dc.f203014y;
        zo2.e eVar = this.f302472s;
        int i17 = eVar != null ? eVar.f556383b : 0;
        int i18 = eVar != null ? eVar.f556384c : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc2 = this.f302476w;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c14500x958689dc2);
        int size = c14500x958689dc2.m56388xcaeb60d0().size();
        int v17 = v();
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f302466m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd c14521x246f2bd = componentCallbacksC1101xa17d4670 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd) componentCallbacksC1101xa17d4670 : null;
        int m75939xb282bd08 = (c14521x246f2bd == null || (dd2Var = c14521x246f2bd.f203053t) == null) ? 0 : dd2Var.m75939xb282bd08(0);
        java.lang.String str = " lastBuffer:";
        boolean z17 = this.A;
        if (!z17 || ysVar == null) {
            if (size > 0) {
                ey2.c3 c3Var = this.f302470q;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc3 = this.f302476w;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c14500x958689dc3);
                ey2.c3.S6(c3Var, v17, i17, i18, c14500x958689dc3.m56388xcaeb60d0(), null, this.f302473t, false, m75939xb282bd08, this.f302475v, 80, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "[onFinishing] memoryCacheFlag:" + v17 + " enableFoldFollowData:" + z17 + " position:" + i17 + " offset:" + i18 + " size:" + size + " lastBuffer:" + this.f302473t);
                return;
            }
            return;
        }
        int i19 = ysVar.f192729h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc4 = this.f302476w;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c14500x958689dc4);
        java.util.ArrayList arrayList = new java.util.ArrayList(c14500x958689dc4.m56388xcaeb60d0());
        java.util.Iterator it = arrayList.iterator();
        int i27 = 0;
        while (true) {
            if (!it.hasNext()) {
                i27 = -1;
                break;
            }
            so2.j5 j5Var = (so2.j5) it.next();
            if ((j5Var instanceof so2.h4) && ((so2.h4) j5Var).f491934e > i19) {
                break;
            } else {
                i27++;
            }
        }
        java.util.LinkedList linkedList = new java.util.LinkedList(arrayList.subList(0, i19));
        java.util.LinkedList linkedList2 = (i27 == -1 || i27 >= arrayList.size()) ? new java.util.LinkedList() : new java.util.LinkedList(arrayList.subList(i27, arrayList.size()));
        java.util.LinkedList linkedList3 = (i19 == -1 || i27 == -1 || i27 >= arrayList.size() || i27 <= i19) ? (i19 == -1 || i27 != -1 || i19 >= arrayList.size()) ? new java.util.LinkedList() : new java.util.LinkedList(arrayList.subList(i19, arrayList.size())) : new java.util.LinkedList(arrayList.subList(i19, i27));
        ysVar.f192727f = new java.util.LinkedList();
        java.util.Iterator it6 = linkedList3.iterator();
        while (it6.hasNext()) {
            java.util.Iterator it7 = it6;
            so2.j5 j5Var2 = (so2.j5) it6.next();
            java.lang.String str2 = str;
            if (j5Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                ysVar.f192727f.add(j5Var2);
            }
            it6 = it7;
            str = str2;
        }
        java.lang.String str3 = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "onFinishing moreFollowCardIndex:" + i19 + " moreRecommendDividerIndex:" + i27 + " beforeFollowDataListStr:" + hc2.o0.p(linkedList) + " followDataListStr:" + hc2.o0.p(linkedList3) + " recommendDataListStr:" + hc2.o0.p(linkedList2) + " dataListStr:" + hc2.o0.p(arrayList));
        arrayList.clear();
        arrayList.addAll(linkedList);
        arrayList.add(ysVar);
        arrayList.addAll(linkedList2);
        ey2.c3.S6(this.f302470q, v17, 0, 0, arrayList, null, this.f302473t, false, m75939xb282bd08, this.f302475v, 80, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "[onFinishing] memoryCacheFlag:" + v17 + " enableFoldFollowData:" + z17 + " position:0 offset:0 size:" + size + str3 + this.f302473t);
    }

    public void F() {
        this.G = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "onStart memoryCacheFlag:" + v());
        if (!this.H) {
            i();
        }
        gp2.l0 l0Var = this.f302474u;
        if (l0Var != null && !l0Var.f355793s) {
            f(this.H, "onStart");
        }
        this.H = false;
    }

    public void G() {
        this.G = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "onStop memoryCacheFlag:" + v());
        gp2.l0 l0Var = this.f302474u;
        if (l0Var != null) {
            l0Var.m();
        }
        gp2.l0 l0Var2 = this.f302474u;
        if (l0Var2 != null) {
            c50.m0.c(l0Var2, null, 1, null);
        }
        h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void I() {
        boolean Di;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "onUserVisibleFocused memoryCacheFlag:" + v());
        this.E = true;
        tq2.c.f502753i.a(v()).f502756b = java.lang.System.currentTimeMillis();
        if (this.F) {
            if (dp2.a.f323716a.a("requestFirstPage", this.f302467n, mo122374x8fadefe3())) {
                r45.dd2 dd2Var = this.f302467n;
                if ((dd2Var != null && dd2Var.m75939xb282bd08(0) == 88889) != false) {
                    if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(d85.g0.LOCAION, d85.f0.f308697o, new cp2.n0(this))) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "checkTryRequestFirstPageAgain return for permission:" + this.I);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc = this.f302476w;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c14500x958689dc);
                c14500x958689dc.d(v(), q(), this.f302467n);
            } else {
                ym5.s3 s3Var = new ym5.s3(0);
                s3Var.f545050b = -2;
                g(s3Var);
                r45.dd2 dd2Var2 = this.f302467n;
                if ((dd2Var2 != null && dd2Var2.m75939xb282bd08(0) == 88889) != false) {
                    java.lang.Object l17 = gm0.j1.u().c().l(274436, "");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(l17, "null cannot be cast to non-null type kotlin.String");
                    if (u11.c.f((java.lang.String) l17)) {
                        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f302460d;
                        Di = j35.u.d(abstractActivityC21394xb3d2c0cf, "android.permission.ACCESS_FINE_LOCATION", true);
                        if (!Di) {
                            if (gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, false)) {
                                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                                j35.u.i(abstractActivityC21394xb3d2c0cf, "android.permission.ACCESS_FINE_LOCATION", com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53180x5a1baf5);
                            } else {
                                js.s0 s0Var = (js.s0) i95.n0.c(js.s0.class);
                                java.lang.String string = abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573932gh2, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d());
                                ((is.h) s0Var).getClass();
                                c71.b.c(abstractActivityC21394xb3d2c0cf, string, 30764, true);
                            }
                        }
                    } else {
                        Di = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(this.f302460d, new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53180x5a1baf5, null, null);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "requestLocationPermission checkLocation:" + Di);
                }
            }
        }
        if (!this.F) {
            i();
        }
        gp2.l0 l0Var = this.f302474u;
        if (l0Var != null) {
            l0Var.J(true);
        }
        nq2.d dVar = nq2.d.f420513a;
        r45.dd2 dd2Var3 = this.f302467n;
        r45.qt2 contextObj = this.f302461e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onEnterLiveSquareTabPage tab:[");
        jz5.f0 f0Var = null;
        r6 = null;
        r45.dd2 dd2Var4 = null;
        sb6.append(dd2Var3 != null ? java.lang.Integer.valueOf(dd2Var3.m75939xb282bd08(0)) : null);
        sb6.append(", ");
        sb6.append(dd2Var3 != null ? dd2Var3.m75945x2fec8307(1) : null);
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPreloadManager", sb6.toString());
        if (dVar.b()) {
            if (dd2Var3 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPreloadManager", "onEnterLiveSquareTabPage startPreload preTab:" + dd2Var3.m75933x41a8a7f2(4) + " nextTab:" + dd2Var3.m75933x41a8a7f2(3));
                boolean m75933x41a8a7f2 = dd2Var3.m75933x41a8a7f2(3);
                java.util.LinkedList linkedList = nq2.d.f420516d;
                if (m75933x41a8a7f2) {
                    int size = linkedList.size();
                    int i17 = -1;
                    for (int i18 = 0; i18 < size; i18++) {
                        if (dd2Var3.m75939xb282bd08(0) == ((r45.dd2) linkedList.get(i18)).m75939xb282bd08(0)) {
                            i17 = i18;
                        }
                    }
                    int i19 = i17 + 1;
                    dVar.i(contextObj, (i19 < 0 || i19 >= linkedList.size()) ? null : (r45.dd2) linkedList.get(i19), 14, "preloadNextTab");
                }
                if (dd2Var3.m75933x41a8a7f2(4)) {
                    int size2 = linkedList.size();
                    int i27 = -1;
                    for (int i28 = 0; i28 < size2; i28++) {
                        if (dd2Var3.m75939xb282bd08(0) == ((r45.dd2) linkedList.get(i28)).m75939xb282bd08(0)) {
                            i27 = i28;
                        }
                    }
                    int i29 = i27 - 1;
                    if (i29 >= 0 && i29 < linkedList.size()) {
                        dd2Var4 = (r45.dd2) linkedList.get(i29);
                    }
                    dVar.i(contextObj, dd2Var4, 15, "preloadPreTab");
                }
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyPreloadManager", "onEnterLiveSquareTabPage return for null");
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyPreloadManager", "onEnterLiveSquareTabPage return for enableNearbyLivePagesPreload:" + dVar.b());
        }
        f(this.F, "onUserVisibleFocused");
        this.F = false;
    }

    public void M() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "onUserVisibleUnFocused memoryCacheFlag:" + v());
        this.E = false;
        gp2.l0 l0Var = this.f302474u;
        if (l0Var != null) {
            l0Var.J(false);
        }
        gp2.l0 l0Var2 = this.f302474u;
        if (l0Var2 != null) {
            l0Var2.m();
        }
        gp2.l0 l0Var3 = this.f302474u;
        if (l0Var3 != null) {
            c50.m0.c(l0Var3, null, 1, null);
        }
    }

    public final void P(int i17, long j17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        java.lang.String str;
        rq2.s sVar = rq2.s.f480412a;
        int y17 = y();
        r45.dd2 dd2Var = this.f302467n;
        if (dd2Var == null || (str = dd2Var.m75945x2fec8307(1)) == null) {
            str = "";
        }
        sVar.d(i17, y17, str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc = this.f302476w;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c14500x958689dc);
        c14500x958689dc.e(this.f302467n, i17, gVar, this.f302465i, j17);
    }

    public final void Q() {
        r45.dd2 dd2Var = this.f302467n;
        if (dd2Var != null && dd2Var.m75939xb282bd08(0) == 88889) {
            if (!((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, d85.f0.f308697o)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "business switch close");
                A();
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "requestRefresh");
        P(this.f302464h, 0L, this.f302468o);
        this.f302464h = 1;
        this.f302465i = false;
        this.f302468o = null;
        qq2.b bVar = this.f302471r;
        if (bVar != null) {
            bVar.f447472j = true;
        }
    }

    public final void V() {
        cp2.o0 o0Var = new cp2.o0(this);
        cp2.s0 s0Var = new cp2.s0(this);
        cp2.t0 t0Var = new cp2.t0(this);
        ey2.k0 k0Var = (ey2.k0) ((ya2.o1) pf5.u.f435469a.e(zy2.b6.class).c(ya2.o1.class));
        if (!k0Var.N6()) {
            o0Var.mo152xb9724478();
        } else if (c01.id.a() - k0Var.Q6() < 300000) {
            t0Var.mo152xb9724478();
        } else {
            s0Var.mo152xb9724478();
        }
    }

    public void c(long j17, boolean z17) {
        tq2.d.f502763a.c("startFetchLives");
        com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 j18 = ((cp2.q1) z()).j();
        j18.postDelayed(new cp2.y(j18), j17);
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f302466m;
        if (componentCallbacksC1101xa17d4670 == null || componentCallbacksC1101xa17d4670.m7453x12a9d210() == null) {
            return;
        }
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702 = this.f302466m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(componentCallbacksC1101xa17d46702);
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7453x12a9d210 = componentCallbacksC1101xa17d46702.m7453x12a9d210();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m7453x12a9d210);
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07) pf5.z.f435481a.b(m7453x12a9d210).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07.class)).Q6() != 0) {
            rq2.s.f480412a.c(false, false);
        }
    }

    public final void f(boolean z17, java.lang.String str) {
        if (z17 && this.f302470q.Q6(v())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.NearbyLivePresenter", "checkAutoPlay " + str + " return for checkCache:" + z17 + " memoryCacheFlag:" + v());
            return;
        }
        if (!this.G) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "checkAutoPlay " + str + " return for isOnResume:" + this.G + " memoryCacheFlag:" + v());
            return;
        }
        if (!this.E) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "checkAutoPlay " + str + " return for isOnUserVisibleFocused:" + this.E + " memoryCacheFlag:" + v());
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "checkAutoPlay " + str + " memoryCacheFlag:" + v());
        gp2.l0 l0Var = this.f302474u;
        if (l0Var != null) {
            l0Var.g();
        }
    }

    public final void g(ym5.s3 s3Var) {
        pm0.v.X(new cp2.a0(s3Var, this));
    }

    public final void h() {
        boolean z17;
        if (dp2.a.f323716a.a("checkOnPauseDataIsEmpty", this.f302467n, mo122374x8fadefe3())) {
            if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, d85.f0.f308697o)) {
                z17 = true;
                this.I = z17;
            }
        }
        z17 = false;
        this.I = z17;
    }

    public final void i() {
        if (!this.G) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "shouldTryRequestFirstPageAgain return for isOnResume:" + this.G + " memoryCacheFlag:" + v());
            return;
        }
        if (!this.E) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "shouldTryRequestFirstPageAgain return for isOnUserVisibleFocused:" + this.E + " memoryCacheFlag:" + v());
            return;
        }
        if (this.I) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "shouldTryRequestFirstPageAgain return for lastOnPauseHasPermission:" + this.I);
            return;
        }
        if (!dp2.a.f323716a.a("requestFirstPage", this.f302467n, mo122374x8fadefe3())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "shouldTryRequestFirstPageAgain return for canLoadNearbyCityFeeds.");
            return;
        }
        r45.dd2 dd2Var = this.f302467n;
        if (dd2Var != null && dd2Var.m75939xb282bd08(0) == 88889) {
            if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(d85.g0.LOCAION, d85.f0.f308697o, new cp2.b0(this))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "checkTryRequestFirstPageAgain return for permission:" + this.I);
                return;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("shouldTryRequestFirstPageAgain requestInit tab:");
        r45.dd2 dd2Var2 = this.f302467n;
        sb6.append(dd2Var2 != null ? java.lang.Integer.valueOf(dd2Var2.m75939xb282bd08(0)) : null);
        sb6.append('-');
        r45.dd2 dd2Var3 = this.f302467n;
        sb6.append(dd2Var3 != null ? dd2Var3.m75945x2fec8307(1) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", sb6.toString());
        g(null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc = this.f302476w;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c14500x958689dc);
        c14500x958689dc.d(v(), q(), this.f302467n);
    }

    public final void m(r45.ha2 ha2Var) {
        if (ha2Var != null) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f302460d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            sp2.x3 x3Var = (sp2.x3) pf5.z.f435481a.a(activity).a(sp2.x3.class);
            x3Var.Z6(ha2Var);
            x3Var.X6();
        }
    }

    @Override // fs2.a
    /* renamed from: onDetach */
    public void mo979x3f5eee52() {
        sq2.g gVar = (sq2.g) ((ys5.f) i95.n0.c(ys5.f.class));
        gVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyRefreshServiceImp", "markEventRegister isRegister: false");
        gVar.f492884f = false;
        mo48814x2efc64();
        mo48814x2efc64();
        mo48814x2efc64();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc = this.f302476w;
        if (c14500x958689dc != null) {
            c14500x958689dc.m56401x31d4943c(this.f302477x);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc2 = this.f302476w;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c14500x958689dc2);
        if (c14500x958689dc2.m56388xcaeb60d0().size() > 0) {
            ((ey2.c3) pf5.u.f435469a.e(c61.l7.class).a(ey2.c3.class)).R6(v());
        }
        gp2.l0 l0Var = this.f302474u;
        if (l0Var != null) {
            l0Var.o();
        }
    }

    /* renamed from: onRefresh */
    public void m122379x905893fc() {
        r45.dd2 dd2Var = this.f302467n;
        boolean z17 = false;
        if (dd2Var != null && dd2Var.m75939xb282bd08(0) == 88889) {
            z17 = true;
        }
        if (!z17) {
            Q();
            return;
        }
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(d85.g0.LOCAION, d85.f0.f308697o, new cp2.m0(this))) {
            return;
        }
        V();
    }

    @Override // cp2.c
    /* renamed from: onRefreshEnd */
    public void mo122375xb3ee2b3f(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        tq2.d.f502763a.b("onRefreshEnd");
        tq2.c a17 = tq2.c.f502753i.a(v());
        a17.f502762h = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyTimeConsumingHelper-" + a17.f502755a, "onVisible->onRefreshEnd:" + (a17.f502762h - a17.f502756b) + " \nonAttach->startFetch:" + (a17.f502757c - a17.f502756b) + " \nstartFetch->startCgi:" + (a17.f502758d - a17.f502757c) + " \nstartCgi->onCgiBack:" + (a17.f502759e - a17.f502758d) + " \nonCgiBack->onFetchDone:" + (a17.f502760f - a17.f502759e) + " \nonFetchDone->onViewUpdate:" + (a17.f502761g - a17.f502760f) + " \nonViewUpdate->onRefreshEnd:" + (a17.f502762h - a17.f502761g));
        a17.f502756b = 0L;
        a17.f502757c = 0L;
        a17.f502758d = 0L;
        a17.f502759e = 0L;
        a17.f502760f = 0L;
        a17.f502761g = 0L;
        a17.f502762h = 0L;
        if (reason.f545056h <= 0) {
            ((cp2.q1) z()).j().k();
        }
        if (reason.f545054f) {
            ((cp2.q1) z()).j().E(false);
        }
        g(reason);
        p("onRefreshEnd");
        qq2.b bVar = this.f302471r;
        if (bVar != null) {
            bVar.f447472j = false;
        }
        if (bVar != null) {
            bVar.a(reason.f545054f);
        }
        f(false, "onRefreshEnd");
    }

    public final void p(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "disposeRedDot from " + str);
        boolean z17 = true;
        if (c92.g.f121271a.b()) {
            r45.dd2 dd2Var = this.f302467n;
            if (dd2Var != null && dd2Var.m75939xb282bd08(0) == 88889) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "disposeRedDot from " + str + " return for 同城直播.");
                return;
            }
        }
        int mo122374x8fadefe3 = mo122374x8fadefe3();
        if (mo122374x8fadefe3 != 9500001 && mo122374x8fadefe3 != 9500002 && mo122374x8fadefe3 != 9500004 && mo122374x8fadefe3 != 9500003) {
            z17 = false;
        }
        if (!z17) {
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("NearbyLiveTab");
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().q0("NearbyLiveTab", str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "disposeRedDot from " + str + " return for in operation game.");
        }
    }

    public int q() {
        r45.dd2 dd2Var = this.f302467n;
        if (dd2Var == null) {
            return mo122374x8fadefe3() + s() + 1005000;
        }
        return dd2Var.m75939xb282bd08(0) + 1005000 + mo122374x8fadefe3();
    }

    public abstract int s();

    public int v() {
        r45.dd2 dd2Var = this.f302467n;
        if (dd2Var == null) {
            return mo122374x8fadefe3() + s() + 1005000;
        }
        return dd2Var.m75939xb282bd08(0) + 1005000 + mo122374x8fadefe3();
    }

    public abstract int y();

    public final cp2.d z() {
        cp2.d dVar = this.f302469p;
        if (dVar != null) {
            return dVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
        throw null;
    }
}
