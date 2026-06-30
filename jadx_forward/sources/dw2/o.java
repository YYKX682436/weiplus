package dw2;

/* loaded from: classes2.dex */
public class o implements dw2.b0 {

    /* renamed from: t, reason: collision with root package name */
    public static final dw2.c f325667t = new dw2.c(null);

    /* renamed from: u, reason: collision with root package name */
    public static final java.util.Set f325668u = kz5.o1.c(2003);

    /* renamed from: c, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f325671c;

    /* renamed from: e, reason: collision with root package name */
    public dw2.a0 f325673e;

    /* renamed from: o, reason: collision with root package name */
    public int f325683o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f325684p;

    /* renamed from: r, reason: collision with root package name */
    public int f325686r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f325687s;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f325669a = "FinderFeedSelectorAdapter" + hashCode();

    /* renamed from: b, reason: collision with root package name */
    public final int f325670b = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDisplayMetrics().heightPixels;

    /* renamed from: d, reason: collision with root package name */
    public int f325672d = -1;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Rect f325674f = new android.graphics.Rect();

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p0 f325675g = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p0(false, 0, null, null, null, 0, 0, null, null, 511, null);

    /* renamed from: h, reason: collision with root package name */
    public int f325676h = 1;

    /* renamed from: i, reason: collision with root package name */
    public long f325677i = -1;

    /* renamed from: j, reason: collision with root package name */
    public final kz2.c f325678j = new kz2.c(this.f325669a);

    /* renamed from: k, reason: collision with root package name */
    public boolean f325679k = true;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f325680l = jz5.h.b(dw2.j.f325660d);

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f325681m = jz5.h.b(dw2.k.f325661d);

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f325682n = jz5.h.b(dw2.l.f325662d);

    /* renamed from: q, reason: collision with root package name */
    public int f325685q = -1;

    public o() {
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
        zl2.r4 r4Var = zl2.r4.f555483a;
        this.f325687s = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85451x3).mo141623x754a37bb()).r()).intValue() == 0;
    }

    public static void f(dw2.o oVar, java.util.Set set, boolean z17, java.lang.String str, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkSelectedInternal");
        }
        if ((i17 & 1) != 0) {
            so2.h3 h3Var = so2.h3.f491925d;
            set = so2.h3.f491927f;
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        if ((i17 & 4) != 0) {
            str = "";
        }
        oVar.e(set, z17, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i17, boolean z17) {
        java.lang.Object obj;
        uc2.d f212753o;
        uc2.d f212753o2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p0 j17 = j(i17, null);
        if (j17 == null || j17.f183976f != 9) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f325669a, "lxltest111 autoPlayOrPauseDragFeed:" + i17 + " play:" + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 k17 = k(f325667t.a(j17.f183977g, this.f325676h));
        in5.s0 s0Var = j17.f183978h;
        if (s0Var != null) {
            java.util.Iterator it = kz5.c0.i(s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.e_k), s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.tbm)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((cw2.v9) obj) != null) {
                        break;
                    }
                }
            }
            cw2.v9 v9Var = (cw2.v9) obj;
            if (v9Var != null) {
                if (!z17) {
                    cw2.v9.j(v9Var, false, 1, null);
                    return;
                } else {
                    v9Var.mo61320x764d819b(true);
                    v9Var.m(s0Var.m8183xf806b362(), null, k17);
                    return;
                }
            }
            if (((android.view.ViewGroup) s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f566387fq1)) != null) {
                java.lang.Object obj2 = s0Var.f374658i;
                so2.h1 h1Var = obj2 instanceof so2.h1 ? (so2.h1) obj2 : null;
                if (h1Var == null) {
                    return;
                }
                if (!z17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15316x68272fd9 c15316x68272fd9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15316x68272fd9) s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f566402fs3);
                    if (c15316x68272fd9 == null || (f212753o = c15316x68272fd9.getF212753o()) == null) {
                        return;
                    }
                    uc2.d.K2(f212753o, s0Var, false, false, 4, null);
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15316x68272fd9 c15316x68272fd92 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15316x68272fd9) s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f566402fs3);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15316x68272fd9 c15316x68272fd93 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15316x68272fd9) s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f566402fs3);
                if (c15316x68272fd93 == null || (f212753o2 = c15316x68272fd93.getF212753o()) == null) {
                    return;
                }
                uc2.d.E5(f212753o2, s0Var, c15316x68272fd92 != null ? c15316x68272fd92.m61652x7f02fdf3() : null, h1Var, false, false, 24, null);
            }
        }
    }

    public final dw2.d b(dw2.d feedList, so2.j5 feed, in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedList, "feedList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (this.f325687s) {
            if (f325668u.contains(java.lang.Integer.valueOf(feed.h()))) {
                feedList.f325649c.add(new dw2.d(feed, holder));
            }
        }
        return feedList;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0216  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.String r23, int r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 1160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dw2.o.c(java.lang.String, int, boolean):void");
    }

    public void d(boolean z17) {
        f(this, null, z17, "checkSelected", 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0399 A[LOOP:2: B:44:0x014c->B:53:0x0399, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03b6 A[EDGE_INSN: B:54:0x03b6->B:55:0x03b6 BREAK  A[LOOP:2: B:44:0x014c->B:53:0x0399], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(java.util.Set r39, boolean r40, java.lang.String r41) {
        /*
            Method dump skipped, instructions count: 1202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dw2.o.e(java.util.Set, boolean, java.lang.String):void");
    }

    public final void g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p0 feed) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        int i17 = feed.f183977g;
        int i18 = this.f325685q;
        if (i17 == i18 || i18 < 0) {
            return;
        }
        a(i18, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:242:0x01cb, code lost:
    
        if (r7.d(java.lang.Integer.valueOf(r5.f337094c)) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0645, code lost:
    
        if (r2 == false) goto L251;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x06a6  */
    /* JADX WARN: Type inference failed for: r10v10, types: [r45.qt2] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40, types: [com.tencent.mm.plugin.finder.viewmodel.component.ny] */
    /* JADX WARN: Type inference failed for: r2v69, types: [c61.l7] */
    /* JADX WARN: Type inference failed for: r2v92 */
    /* JADX WARN: Type inference failed for: r5v33, types: [ml2.d, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.util.List r28, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p0 r29) {
        /*
            Method dump skipped, instructions count: 1778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dw2.o.h(java.util.List, com.tencent.mm.plugin.finder.assist.p0):void");
    }

    public final void i(java.util.List source, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p0 feed) {
        dw2.a0 a0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        kz2.c cVar = this.f325678j;
        cVar.c("onFeedUnSelected begin");
        if (m(feed, "dispatchOnFeedUnSelected") && (a0Var = this.f325673e) != null) {
            in5.s0 s0Var = feed.f183978h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s0Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoAutoPlayManager", "onFeedUnSelected position:" + feed.f183977g);
            cw2.v9 L0 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1653x55cdf963.C15205x28f20815) a0Var).L0(s0Var);
            if (L0 != null) {
                L0.mo61326x26d5cbcc(false);
            }
        }
        cVar.c("onFeedUnSelected end");
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p0 j(int i17, in5.s0 s0Var) {
        in5.s0 s0Var2;
        jz5.f0 f0Var;
        java.util.LinkedList<r45.mb4> m59135x7efe73ec;
        r45.mb4 mb4Var;
        if (s0Var == null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f325671c;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 q07 = c1163xf1deaba4 != null ? c1163xf1deaba4.q0(i17, false) : null;
            s0Var2 = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
        } else {
            s0Var2 = s0Var;
        }
        if (s0Var2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f325669a, "handleOnPageSelected return for holder:" + s0Var2 + " position:" + i17);
            return null;
        }
        java.lang.Object obj = s0Var2.f374658i;
        so2.j5 j5Var = obj instanceof so2.j5 ? (so2.j5) obj : null;
        if (j5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f325669a, "handleOnPageSelected return for item:" + j5Var + " position:" + i17);
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 o17 = o(j5Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p0 p0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p0(false, 0L, null, null, null, 0, 0, null, null, 511, null);
        p0Var.f183976f = j5Var.h();
        p0Var.f183977g = i17;
        p0Var.f183978h = s0Var2;
        p0Var.f183972b = j5Var.mo2128x1ed62e84();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
        p0Var.f183973c = abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.w() : null;
        p0Var.f183975e = o17;
        p0Var.f183979i = j5Var;
        android.view.View p17 = s0Var2.p(com.p314xaae8f345.mm.R.id.f566402fs3);
        java.util.LinkedList<r45.mb4> m59135x7efe73ec2 = o17 != null ? o17.m59135x7efe73ec() : null;
        if (p17 == null || m59135x7efe73ec2 == null) {
            f0Var = null;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15229x2dc379 abstractC15229x2dc379 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15229x2dc379) p17;
            if (abstractC15229x2dc379.getFocusPosition() >= 0 && abstractC15229x2dc379.getFocusPosition() < m59135x7efe73ec2.size()) {
                r45.mb4 mb4Var2 = (r45.mb4) kz5.n0.a0(m59135x7efe73ec2, abstractC15229x2dc379.getFocusPosition());
                java.lang.String m75945x2fec8307 = mb4Var2 != null ? mb4Var2.m75945x2fec8307(9) : null;
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                p0Var.f183974d = m75945x2fec8307;
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            java.lang.String m75945x2fec83072 = (o17 == null || (m59135x7efe73ec = o17.m59135x7efe73ec()) == null || (mb4Var = (r45.mb4) kz5.n0.a0(m59135x7efe73ec, 0)) == null) ? null : mb4Var.m75945x2fec8307(9);
            p0Var.f183974d = m75945x2fec83072 != null ? m75945x2fec83072 : "";
        }
        return p0Var;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 k(int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f325671c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1163xf1deaba4);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7946xf939df19, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerAdapter<*>");
        java.lang.Object a07 = kz5.n0.a0(((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19).m82898xfb7e5820(), i17);
        if (a07 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) a07;
        }
        return null;
    }

    public boolean l(long j17) {
        java.lang.Object obj;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f325671c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1163xf1deaba4);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7946xf939df19, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerAdapter<*>");
        java.util.Iterator it = ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19).m82898xfb7e5820().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((in5.c) obj).mo2128x1ed62e84() == j17) {
                break;
            }
        }
        return obj != null;
    }

    public final boolean m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p0 p0Var, java.lang.String invokeSource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeSource, "invokeSource");
        if (p0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f325669a, invokeSource + " checkFeedValid return for feed:" + p0Var);
            return false;
        }
        boolean z17 = p0Var.f183971a;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f325669a, invokeSource + " checkFeedValid return for isValid:" + z17);
            return false;
        }
        if (p0Var.f183977g < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f325669a, invokeSource + " checkFeedValid return for position:" + p0Var.f183977g);
            return false;
        }
        if (p0Var.f183972b == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f325669a, invokeSource + " checkFeedValid return for feedId:" + p0Var.f183972b);
            return false;
        }
        if (p0Var.f183978h != null) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f325669a, invokeSource + " checkFeedValid return for holder:" + p0Var.f183978h);
        return false;
    }

    public final void n(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        if (this.f325677i == j17) {
            return;
        }
        android.content.Context context = recyclerView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        fc2.o Z6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).Z6(this.f325672d);
        if (Z6 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f325669a, "publishFocusView: targetFeedId = " + j17 + ", lastFocusFeedId = " + this.f325677i);
            fc2.a c17 = Z6.c(recyclerView, 6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.event.base.ScrollEvent");
            this.f325677i = ((fc2.t) c17).f342525k;
            recyclerView.post(new dw2.n(Z6, c17));
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 o(so2.j5 feed) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        if (feed instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88.f36135x233c02ec.a((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) feed);
        }
        if (!(feed instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys)) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys ysVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys) feed;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88();
        c14989xf862ae88.m59160xc19565b(ysVar.mo2128x1ed62e84());
        c14989xf862ae88.m59171xdb5612fc(ysVar.h());
        c14989xf862ae88.m59179x350affc2(ysVar.f192727f);
        return c14989xf862ae88;
    }
}
