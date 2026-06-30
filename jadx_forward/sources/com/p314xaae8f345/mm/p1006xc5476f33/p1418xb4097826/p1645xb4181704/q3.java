package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public class q3 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.g2, im5.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.s3, in5.x, in5.y {
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.h2 F = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.h2(null);
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15148xe5368540 A;
    public boolean B;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d C;
    public android.app.Dialog D;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.m2 E;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f211900d;

    /* renamed from: e, reason: collision with root package name */
    public int f211901e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.p4 f211902f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f211903g;

    /* renamed from: h, reason: collision with root package name */
    public iv2.b f211904h;

    /* renamed from: i, reason: collision with root package name */
    public int f211905i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 f211906m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.j2 f211907n;

    /* renamed from: o, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p2495xc50a8b8b.g f211908o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f211909p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f211910q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f211911r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f211912s;

    /* renamed from: t, reason: collision with root package name */
    public long f211913t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f211914u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f211915v;

    /* renamed from: w, reason: collision with root package name */
    public volatile boolean f211916w;

    /* renamed from: x, reason: collision with root package name */
    public fp0.t f211917x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f211918y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f211919z;

    public q3(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f211900d = context;
        this.f211901e = 58;
        this.f211902f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.p4();
        this.f211903g = new java.util.concurrent.CopyOnWriteArraySet();
        this.f211905i = 2;
        this.f211910q = true;
        this.f211912s = true;
        this.f211916w = true;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.C = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6184xdf3e09db>(a0Var) { // from class: com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter$commentChangeEventListener$1
            {
                this.f39173x3fe91575 = 1991739851;
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6184xdf3e09db r8) {
                /*
                    r7 = this;
                    com.tencent.mm.autogen.events.UniCommentChangeEvent r8 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6184xdf3e09db) r8
                    java.lang.String r0 = "event"
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
                    r0 = 1
                    com.tencent.mm.plugin.finder.uniComments.q3 r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3.this
                    r2 = 0
                    am.oz r3 = r8.f136442g
                    if (r3 == 0) goto L25
                    long r3 = r3.f89118a
                    iv2.b r5 = r1.f211904h
                    if (r5 == 0) goto L1e
                    int r5 = r5.f376663f
                    long r5 = (long) r5
                    int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r3 != 0) goto L25
                    r3 = r0
                    goto L26
                L1e:
                    java.lang.String r8 = "feedObj"
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r8)
                    r8 = 0
                    throw r8
                L25:
                    r3 = r2
                L26:
                    if (r3 != 0) goto L2a
                    r0 = r2
                    goto L55
                L2a:
                    com.tencent.mm.plugin.finder.uniComments.l2 r2 = new com.tencent.mm.plugin.finder.uniComments.l2
                    r2.<init>(r8, r1)
                    java.lang.Thread r8 = java.lang.Thread.currentThread()
                    android.os.Looper r3 = android.os.Looper.getMainLooper()
                    java.lang.Thread r3 = r3.getThread()
                    boolean r8 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r8, r3)
                    if (r8 == 0) goto L45
                    r2.mo152xb9724478()
                    goto L55
                L45:
                    com.tencent.mm.plugin.finder.uniComments.a5 r8 = r1.f211906m
                    if (r8 == 0) goto L55
                    com.tencent.mm.plugin.finder.uniComments.UniCommentDrawer r8 = r8.h()
                    com.tencent.mm.plugin.finder.uniComments.k2 r1 = new com.tencent.mm.plugin.finder.uniComments.k2
                    r1.<init>(r2)
                    r8.post(r1)
                L55:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15149xf5d0b568.mo1xf5bc2045(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.E = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.m2(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        if (((jv2.i) r18.get(r5)).f383756d.J0() != 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 r17, java.util.List r18) {
        /*
            r17.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r18.iterator()
            r2 = 0
            r3 = r2
        Le:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Lc7
            java.lang.Object r4 = r1.next()
            int r5 = r3 + 1
            r6 = 0
            if (r3 < 0) goto Lc3
            jv2.i r4 = (jv2.i) r4
            r0.add(r4)
            jv2.c r7 = r4.f383756d
            long r7 = r7.J0()
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto Lbc
            jv2.c r7 = r4.f383756d
            java.util.LinkedList r7 = r7.A0()
            int r7 = r7.size()
            if (r7 <= 0) goto Lbc
            int r7 = r18.size()
            r8 = 1
            int r7 = r7 - r8
            if (r3 >= r7) goto L58
            r3 = r18
            java.lang.Object r7 = r3.get(r5)
            jv2.i r7 = (jv2.i) r7
            jv2.c r7 = r7.f383756d
            long r11 = r7.J0()
            int r7 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r7 != 0) goto L55
            goto L5a
        L55:
            r10 = r17
            goto Lc0
        L58:
            r3 = r18
        L5a:
            com.tencent.mm.plugin.finder.storage.t70 r7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a
            jz5.g r7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209124a0
            jz5.n r7 = (jz5.n) r7
            java.lang.Object r7 = r7.mo141623x754a37bb()
            lb2.j r7 = (lb2.j) r7
            java.lang.Object r7 = r7.r()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r7 != r8) goto L55
            jv2.c r7 = r4.f383756d
            java.util.LinkedList r7 = r7.A0()
            int r7 = r7.size()
            r9 = r2
        L7d:
            if (r9 >= r7) goto Lb0
            jv2.c r10 = r4.f383756d
            java.util.LinkedList r10 = r10.A0()
            java.lang.Object r10 = r10.remove()
            r12 = r10
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r12 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) r12
            hv2.c r11 = hv2.c.f366820a
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r12)
            r10 = r17
            iv2.b r13 = r10.f211904h
            if (r13 == 0) goto Laa
            int r13 = r13.f376663f
            long r13 = (long) r13
            long r15 = r4.mo2128x1ed62e84()
            jv2.i r11 = r11.b(r12, r13, r15)
            r11.f383763n = r8
            r0.add(r11)
            int r9 = r9 + 1
            goto L7d
        Laa:
            java.lang.String r0 = "feedObj"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r0)
            throw r6
        Lb0:
            r10 = r17
            int r6 = r4.f383762m
            int r6 = r6 - r7
            r4.f383762m = r6
            if (r6 >= 0) goto Lc0
            r4.f383762m = r2
            goto Lc0
        Lbc:
            r10 = r17
            r3 = r18
        Lc0:
            r3 = r5
            goto Le
        Lc3:
            kz5.c0.p()
            throw r6
        Lc7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3.f(com.tencent.mm.plugin.finder.uniComments.q3, java.util.List):java.util.List");
    }

    public static final void g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 q3Var, java.util.List itemList, jv2.i rootComment, boolean z17) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.p4 p4Var = q3Var.f211902f;
        p4Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemList, "itemList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootComment, "rootComment");
        java.util.List c17 = p4Var.c(itemList);
        java.util.ArrayList arrayList = (java.util.ArrayList) c17;
        if (arrayList.size() > 1) {
            kz5.g0.t(c17, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o4());
        }
        int e17 = p4Var.e(rootComment.f383756d.t0(), z17);
        p4Var.f211893a.addAll(e17, c17);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(e17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(arrayList.size());
        int intValue = valueOf.intValue();
        int intValue2 = valueOf2.intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicUni.DrawerPresenter", "insertLevel2CommentsAndNotify, positionInsert:" + intValue + ", itemCount:" + intValue2 + ", level2Comments size:" + itemList.size() + ", down:" + z17 + ", rootCommentId:" + rootComment.mo2128x1ed62e84());
        if (intValue2 < 0 || intValue < 0 || intValue >= p4Var.f() || (i17 = intValue + intValue2) > p4Var.f() || (a5Var = q3Var.f211906m) == null || (m82555x4905e9fa = a5Var.s().m82555x4905e9fa()) == null || (mo7946xf939df19 = m82555x4905e9fa.mo7946xf939df19()) == null) {
            return;
        }
        if (intValue2 > 0) {
            mo7946xf939df19.m8153xd399a4d9(intValue, intValue2);
        }
        if (!z17 || (i18 = intValue - 1) < 0) {
            if (z17 || i17 >= p4Var.f()) {
                return;
            }
            mo7946xf939df19.m8148xed6e4d18(i17, 1);
            return;
        }
        mo7946xf939df19.m8148xed6e4d18(i18, 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var2 = q3Var.f211906m;
        if (a5Var2 != null) {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.r(a5Var2.s(), false, null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.w2.f211975d, 3, null);
        }
    }

    public final void A(boolean z17) {
        this.f211910q = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicUni.DrawerPresenter", "set downContinue " + z17);
    }

    public final void B(boolean z17) {
        this.f211909p = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicUni.DrawerPresenter", "set upContinue " + z17);
    }

    public void E(android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (i17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicUni.DrawerPresenter", "onClickResendComment position:" + i17);
        } else {
            if (this.f211902f.d(i17).f383756d.f67484x29d3a50c != -1 || (a5Var = this.f211906m) == null || (m82555x4905e9fa = a5Var.s().m82555x4905e9fa()) == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m82555x4905e9fa, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniCommentDrawerPresenter", "onClickResendComment", "(Landroid/view/View;I)V", "Undefined", "scrollToPosition", "(I)V");
            m82555x4905e9fa.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m82555x4905e9fa, "com/tencent/mm/plugin/finder/uniComments/UniCommentDrawerPresenter", "onClickResendComment", "(Landroid/view/View;I)V", "Undefined", "scrollToPosition", "(I)V");
        }
    }

    public void R(android.widget.ImageView view, int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        java.lang.Object putIfAbsent;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (i17 < 0) {
            return;
        }
        jv2.i d17 = this.f211902f.d(i17);
        ev2.n nVar = ev2.n.f338454f;
        if (this.f211904h == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
            throw null;
        }
        boolean z17 = !nVar.b(r4.f376663f, d17.f383756d, this.f211905i);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.h2 h2Var = F;
        if (this.f211904h == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
            throw null;
        }
        h2Var.a(null, z17 ? 3L : 4L, 1L);
        if (this.f211900d instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
            int i18 = this.f211905i != 2 ? 3 : 2;
            iv2.b bVar = this.f211904h;
            if (bVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                throw null;
            }
            jv2.c comment = d17.f383756d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment, "comment");
            ev2.t tVar = new ev2.t(bVar, comment, z17, i18, null);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = nVar.f338457c;
            java.lang.Long valueOf = java.lang.Long.valueOf(bVar.a());
            java.lang.Object obj = concurrentHashMap.get(valueOf);
            if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (obj = new java.util.concurrent.ConcurrentHashMap()))) != null) {
                obj = putIfAbsent;
            }
            ((java.util.concurrent.ConcurrentHashMap) obj).put(new ev2.k(comment.t0(), i18), tVar);
            nVar.f338455a.b(new ev2.q(tVar), new ev2.l(nVar, tVar));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var = this.f211906m;
        if (a5Var == null || (m82555x4905e9fa = a5Var.s().m82555x4905e9fa()) == null || (mo7946xf939df19 = m82555x4905e9fa.mo7946xf939df19()) == null) {
            return;
        }
        mo7946xf939df19.m8148xed6e4d18(i17, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (((r0.u0().m76072xefec40f7() & 1) > 0) == true) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int S() {
        /*
            r3 = this;
            com.tencent.mm.plugin.finder.uniComments.p4 r0 = r3.f211902f
            java.util.ArrayList r0 = r0.f211893a
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(r0)
            if (r1 != 0) goto L2d
            java.lang.Object r0 = kz5.n0.Z(r0)
            jv2.i r0 = (jv2.i) r0
            r1 = 0
            if (r0 == 0) goto L29
            jv2.c r0 = r0.f383756d
            if (r0 == 0) goto L29
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r0 = r0.u0()
            int r0 = r0.m76072xefec40f7()
            r2 = 1
            r0 = r0 & r2
            if (r0 <= 0) goto L25
            r0 = r2
            goto L26
        L25:
            r0 = r1
        L26:
            if (r0 != r2) goto L29
            goto L2a
        L29:
            r2 = r1
        L2a:
            if (r2 == 0) goto L2d
            goto L2e
        L2d:
            r1 = -1
        L2e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3.S():int");
    }

    @Override // in5.y
    public boolean c(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (!this.f211915v) {
            if (i17 < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicUni.DrawerPresenter", "onItemLongClick position:" + i17);
            } else {
                jv2.i d17 = this.f211902f.d(i17);
                rl5.r rVar = new rl5.r(this.f211900d);
                iv2.b bVar = this.f211904h;
                if (bVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                    throw null;
                }
                rVar.g(view, 0, 0L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.r4(d17, bVar.f376662e, this.f211905i == 1), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.t4(d17, this.f211901e, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.i3(this)), com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295044d, com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295045e);
            }
        }
        return false;
    }

    public boolean h(jv2.i comment, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment, "comment");
        long J0 = comment.f383756d.J0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.p4 p4Var = this.f211902f;
        boolean z18 = false;
        if (J0 == 0) {
            if (!z17) {
                return false;
            }
            p4Var.getClass();
            if (comment.mo2128x1ed62e84() != 0) {
                java.util.Iterator it = p4Var.f211893a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((jv2.i) it.next()).f383756d.J0() == comment.mo2128x1ed62e84()) {
                        z18 = true;
                        break;
                    }
                }
            }
            return !z18;
        }
        int i17 = -1;
        if (z17) {
            p4Var.getClass();
            java.util.Iterator it6 = p4Var.f211893a.iterator();
            int i18 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                java.lang.Object next = it6.next();
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                jv2.i comment1 = (jv2.i) next;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment1, "comment1");
                if (!(comment1.mo2128x1ed62e84() == comment.mo2128x1ed62e84())) {
                    if (i17 >= 0 && p4Var.g(comment1, comment)) {
                        z18 = true;
                        break;
                    }
                } else {
                    i17 = i18;
                }
                i18 = i19;
            }
            return !z18;
        }
        p4Var.getClass();
        java.util.Iterator it7 = p4Var.f211893a.iterator();
        int i27 = 0;
        while (true) {
            if (!it7.hasNext()) {
                break;
            }
            java.lang.Object next2 = it7.next();
            int i28 = i27 + 1;
            if (i27 < 0) {
                kz5.c0.p();
                throw null;
            }
            jv2.i comment12 = (jv2.i) next2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment12, "comment1");
            if (!(comment12.mo2128x1ed62e84() == comment.mo2128x1ed62e84())) {
                if (p4Var.g(comment12, comment)) {
                    i17 = i27;
                }
                i27 = i28;
            } else if (i17 >= 0 && i17 < i27) {
                z18 = true;
            }
        }
        return !z18;
    }

    public final int i() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("calculateCommentCount ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.p4 p4Var = this.f211902f;
        sb6.append(p4Var.f());
        sb6.append(", ");
        iv2.b bVar = this.f211904h;
        if (bVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
            throw null;
        }
        sb6.append(bVar.f376660c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicUni.DrawerPresenter", sb6.toString());
        int f17 = p4Var.f() + 0;
        iv2.b bVar2 = this.f211904h;
        if (bVar2 != null) {
            return java.lang.Math.max(f17, bVar2.f376660c);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
        throw null;
    }

    public int k() {
        java.util.ArrayList arrayList = this.f211902f.f211893a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList)) {
            return -1;
        }
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            jv2.i iVar = (jv2.i) next;
            if (iVar.f383756d.J0() == 0) {
                if (!((iVar.f383756d.u0().m76072xefec40f7() & 1) > 0)) {
                    return i17;
                }
            }
            i17 = i18;
        }
        return -1;
    }

    @Override // im5.b
    /* renamed from: keep */
    public void mo46316x322b85(im5.a p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        this.f211903g.add(p07);
    }

    public iv2.b m() {
        iv2.b bVar = this.f211904h;
        if (bVar != null) {
            return bVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
        throw null;
    }

    @Override // fs2.a
    /* renamed from: onDetach */
    public void mo979x3f5eee52() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa2;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa3;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa4;
        if (this.f211916w) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicUni.DrawerPresenter", "onDetach: can not detach, because it is not attached");
            return;
        }
        this.f211916w = true;
        this.f211918y = false;
        fp0.t tVar = this.f211917x;
        if (tVar != null) {
            tVar.f();
        }
        this.f211917x = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var = this.f211906m;
        if (((a5Var == null || (m82555x4905e9fa4 = a5Var.s().m82555x4905e9fa()) == null) ? null : m82555x4905e9fa4.getLayoutManager()) instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var2 = this.f211906m;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = (a5Var2 == null || (m82555x4905e9fa3 = a5Var2.s().m82555x4905e9fa()) == null) ? null : m82555x4905e9fa3.getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager).w();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var3 = this.f211906m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15151xe87c41ea l17 = a5Var3 != null ? a5Var3.l() : null;
        if (l17 != null) {
            l17.m61148x710e23e0(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var4 = this.f211906m;
        if (a5Var4 != null && (m82555x4905e9fa2 = a5Var4.s().m82555x4905e9fa()) != null && (mo7946xf939df192 = m82555x4905e9fa2.mo7946xf939df19()) != null) {
            mo7946xf939df192.mo8165x48eac7b3(this.E);
        }
        java.util.Iterator it = this.f211903g.iterator();
        while (it.hasNext()) {
            ((im5.a) it.next()).mo10668x2efc64();
        }
        this.f211903g.clear();
        this.C.mo48814x2efc64();
        iv2.b bVar = this.f211904h;
        if (bVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
            throw null;
        }
        bVar.f376660c = i();
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.b2.f211738a;
        iv2.b bVar2 = this.f211904h;
        if (bVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
            throw null;
        }
        java.util.Map map2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.b2.f211738a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(map2, "access$getCacheItems$cp(...)");
        map2.put(java.lang.Long.valueOf(bVar2.a()), bVar2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onDetach] updateFeedCommentCount feedId=");
        if (this.f211904h == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
            throw null;
        }
        sb6.append(r6.f376663f);
        sb6.append(" commentCount ");
        sb6.append(i());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicUni.DrawerPresenter", sb6.toString());
        if (this.f211911r || !this.f211912s) {
            this.f211902f.f211893a.clear();
        } else {
            if (this.f211913t != 0) {
                java.util.Iterator it6 = this.f211902f.f211893a.iterator();
                int i17 = 0;
                while (it6.hasNext()) {
                    java.lang.Object next = it6.next();
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    jv2.i iVar = (jv2.i) next;
                    if (iVar.mo2128x1ed62e84() == this.f211913t) {
                        iVar.f383761i = false;
                    }
                    i17 = i18;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.p4 p4Var = this.f211902f;
            p4Var.getClass();
            p4Var.f211893a.clear();
        }
        this.f211908o = null;
        B(false);
        A(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 p17 = p();
        if (p17 != null) {
            p17.setText((java.lang.CharSequence) null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 p18 = p();
        if (p18 != null) {
            ((java.util.HashMap) p18.pastedList).clear();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var5 = this.f211906m;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 s17 = a5Var5 != null ? a5Var5.s() : null;
        if (s17 != null) {
            s17.m82693x1501d518(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var6 = this.f211906m;
        if (a5Var6 != null && (m82555x4905e9fa = a5Var6.s().m82555x4905e9fa()) != null && (mo7946xf939df19 = m82555x4905e9fa.mo7946xf939df19()) != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var7 = this.f211906m;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa5 = a5Var7 != null ? a5Var7.s().m82555x4905e9fa() : null;
        if (m82555x4905e9fa5 != null) {
            m82555x4905e9fa5.mo7966xf161ffec(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var8 = this.f211906m;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 s18 = a5Var8 != null ? a5Var8.s() : null;
        if (s18 != null) {
            s18.m82683xb165a19d(null);
        }
        this.f211906m = null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 p() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var = this.f211906m;
        if (a5Var != null) {
            return a5Var.l().m61120xdb574fcd();
        }
        return null;
    }

    public final android.content.res.Resources q() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var = this.f211906m;
        if (a5Var != null) {
            return a5Var.k().getResources();
        }
        return null;
    }

    public jv2.i s(long j17) {
        java.lang.Object obj = null;
        if (j17 == 0) {
            return null;
        }
        java.util.Iterator it = this.f211902f.f211893a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((jv2.i) next).f383756d.t0() == j17) {
                obj = next;
                break;
            }
        }
        return (jv2.i) obj;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (holder.m8185xcdaf1228() == 3 || this.f211915v) {
            return;
        }
        if (i17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicUni.DrawerPresenter", "onItemClick position:" + i17);
            return;
        }
        jv2.i d17 = this.f211902f.d(i17);
        if (d17.f383758f && ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176) holder.p(com.p314xaae8f345.mm.R.id.c6d)).i()) {
            return;
        }
        int i18 = d17.f383756d.f67484x29d3a50c;
        if ((i18 == 1 || i18 == -1) ? false : true) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var = this.f211906m;
            if (a5Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15151xe87c41ea l17 = a5Var.l();
                int i19 = this.f211905i;
                jv2.c commentObj = d17.f383756d;
                boolean z17 = i19 == 2;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentObj, "commentObj");
                if (z17) {
                    java.lang.String str = l17.lastFromName;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" ");
                    android.content.res.Resources resources = l17.getResources();
                    i95.m c17 = i95.n0.c(c61.yb.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    sb6.append(resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572458ba1, l17.i(c61.yb.md((c61.yb) c17, commentObj.L0(), commentObj.D0(), false, 4, null))));
                    l17.f(str, sb6.toString(), commentObj, true);
                } else {
                    l17.f(l17.lastFromName, " " + l17.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572458ba1, l17.i(commentObj.D0())), commentObj, true);
                }
                l17.m61120xdb574fcd().setShowSoftInputOnFocus(true);
                l17.m61120xdb574fcd().requestFocus();
                l17.m(true);
            }
            android.graphics.Rect rect = new android.graphics.Rect();
            view.getGlobalVisibleRect(rect);
            int i27 = rect.bottom;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var2 = this.f211906m;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15148xe5368540 h17 = a5Var2 != null ? a5Var2.h() : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h17);
            h17.getGlobalVisibleRect(rect);
            int i28 = rect.bottom - i27;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var3 = this.f211906m;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15151xe87c41ea l18 = a5Var3 != null ? a5Var3.l() : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l18);
            if (i28 < l18.getHeight()) {
                int height = i28 - l18.getHeight();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var4 = this.f211906m;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82798x4905e9fa = a5Var4 != null ? a5Var4.h().m82798x4905e9fa() : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m82798x4905e9fa);
                m82798x4905e9fa.animate().translationY(height).setDuration(90L).start();
            }
        }
    }

    public void v(jv2.i rootComment, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootComment, "rootComment");
        if (z17) {
            java.util.LinkedList A0 = rootComment.f383756d.A0();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(A0)) {
                java.util.Iterator it = this.f211902f.f211893a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        fp0.t tVar = this.f211917x;
                        if (tVar != null) {
                            tVar.b(new fp0.r(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.v2(A0, this, rootComment), null, 2, null));
                        }
                    } else if (((jv2.i) it.next()).f383756d.t0() == ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) A0.getFirst()).m76058xa6514d24()) {
                        break;
                    }
                }
            }
        }
        fp0.t tVar2 = this.f211917x;
        if (tVar2 != null) {
            tVar2.b(new fp0.r(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.c3(rootComment, this, z17), null, 2, null));
        }
    }

    public final void y(boolean z17) {
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicUni.DrawerPresenter", "refreshData " + z17 + " return for teen mode");
            return;
        }
        fp0.t tVar = this.f211917x;
        if (tVar != null) {
            tVar.b(new fp0.r(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.p3(z17, this), null, 2, null));
        }
    }

    public final void z() {
        if (this.B) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var = this.f211906m;
            android.widget.TextView o17 = a5Var != null ? a5Var.o() : null;
            if (o17 == null) {
                return;
            }
            android.content.res.Resources q17 = q();
            o17.setText(q17 != null ? q17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cyd) : null);
            return;
        }
        if (i() <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var2 = this.f211906m;
            android.widget.TextView o18 = a5Var2 != null ? a5Var2.o() : null;
            if (o18 == null) {
                return;
            }
            android.content.res.Resources q18 = q();
            o18.setText(q18 != null ? q18.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cox) : null);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var3 = this.f211906m;
        android.widget.TextView o19 = a5Var3 != null ? a5Var3.o() : null;
        if (o19 == null) {
            return;
        }
        android.content.res.Resources q19 = q();
        o19.setText(q19 != null ? q19.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cpc, java.lang.String.valueOf(i())) : null);
    }
}
