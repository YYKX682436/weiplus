package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class o0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.d, im5.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.p0, in5.x, in5.y {
    public fp0.t A;
    public boolean B;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15144x165092d1 C;
    public java.lang.String D;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d E;
    public android.app.Dialog F;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.j G;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f211855d;

    /* renamed from: e, reason: collision with root package name */
    public jv2.d f211856e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f211857f;

    /* renamed from: g, reason: collision with root package name */
    public int f211858g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o1 f211859h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f211860i;

    /* renamed from: m, reason: collision with root package name */
    public iv2.a f211861m;

    /* renamed from: n, reason: collision with root package name */
    public int f211862n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 f211863o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.g f211864p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.c f211865q;

    /* renamed from: r, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p2495xc50a8b8b.g f211866r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f211867s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f211868t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f211869u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f211870v;

    /* renamed from: w, reason: collision with root package name */
    public long f211871w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f211872x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f211873y;

    /* renamed from: z, reason: collision with root package name */
    public volatile boolean f211874z;

    public o0(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f211855d = context;
        this.f211858g = 58;
        this.f211859h = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o1();
        this.f211860i = new java.util.concurrent.CopyOnWriteArraySet();
        this.f211862n = 2;
        this.f211868t = true;
        this.f211870v = true;
        this.f211874z = true;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.E = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6184xdf3e09db>(a0Var) { // from class: com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawerPresenter$commentChangeEventListener$1
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
                    com.tencent.mm.plugin.finder.uniComments.o0 r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0.this
                    r2 = 0
                    am.oz r3 = r8.f136442g
                    if (r3 == 0) goto L25
                    long r3 = r3.f89118a
                    iv2.a r5 = r1.f211861m
                    if (r5 == 0) goto L1e
                    int r5 = r5.f376656f
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
                    com.tencent.mm.plugin.finder.uniComments.i r2 = new com.tencent.mm.plugin.finder.uniComments.i
                    r2.<init>(r8, r1)
                    java.lang.Thread r8 = java.lang.Thread.currentThread()
                    android.os.Looper r3 = android.os.Looper.getMainLooper()
                    java.lang.Thread r3 = r3.getThread()
                    boolean r8 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r8, r3)
                    if (r8 == 0) goto L45
                    r2.mo152xb9724478()
                    goto L55
                L45:
                    com.tencent.mm.plugin.finder.uniComments.a2 r8 = r1.f211863o
                    if (r8 == 0) goto L55
                    com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawer r8 = r8.e()
                    com.tencent.mm.plugin.finder.uniComments.h r1 = new com.tencent.mm.plugin.finder.uniComments.h
                    r1.<init>(r2)
                    r8.post(r1)
                L55:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15145x69850e39.mo1xf5bc2045(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.G = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.j(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        if (((jv2.d) r18.get(r5)).f383740d.A0() != 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 r17, java.util.List r18) {
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
            jv2.d r4 = (jv2.d) r4
            r0.add(r4)
            jv2.a r7 = r4.f383740d
            long r7 = r7.A0()
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto Lbc
            jv2.a r7 = r4.f383740d
            java.util.LinkedList r7 = r7.w0()
            int r7 = r7.size()
            if (r7 <= 0) goto Lbc
            int r7 = r18.size()
            r8 = 1
            int r7 = r7 - r8
            if (r3 >= r7) goto L58
            r3 = r18
            java.lang.Object r7 = r3.get(r5)
            jv2.d r7 = (jv2.d) r7
            jv2.a r7 = r7.f383740d
            long r11 = r7.A0()
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
            jv2.a r7 = r4.f383740d
            java.util.LinkedList r7 = r7.w0()
            int r7 = r7.size()
            r9 = r2
        L7d:
            if (r9 >= r7) goto Lb0
            jv2.a r10 = r4.f383740d
            java.util.LinkedList r10 = r10.w0()
            java.lang.Object r10 = r10.remove()
            r12 = r10
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r12 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) r12
            hv2.b r11 = hv2.b.f366819a
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r12)
            r10 = r17
            iv2.a r13 = r10.f211861m
            if (r13 == 0) goto Laa
            int r13 = r13.f376656f
            long r13 = (long) r13
            long r15 = r4.mo2128x1ed62e84()
            jv2.d r11 = r11.b(r12, r13, r15)
            r11.f383748o = r8
            r0.add(r11)
            int r9 = r9 + 1
            goto L7d
        Laa:
            java.lang.String r0 = "feedObj"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r0)
            throw r6
        Lb0:
            r10 = r17
            int r6 = r4.f383747n
            int r6 = r6 - r7
            r4.f383747n = r6
            if (r6 >= 0) goto Lc0
            r4.f383747n = r2
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0.a(com.tencent.mm.plugin.finder.uniComments.o0, java.util.List):java.util.List");
    }

    public static final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 o0Var, java.util.List itemList, jv2.d rootComment, boolean z17) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o1 o1Var = o0Var.f211859h;
        o1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemList, "itemList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootComment, "rootComment");
        java.util.List c17 = o1Var.c(itemList);
        int d17 = o1Var.d(rootComment.f383740d.t0(), z17);
        o1Var.f211875a.addAll(d17, c17);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(d17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(((java.util.ArrayList) c17).size());
        int intValue = valueOf.intValue();
        int intValue2 = valueOf2.intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", "insertLevel2CommentsAndNotify, positionInsert:" + intValue + ", itemCount:" + intValue2 + ", level2Comments size:" + itemList.size() + ", down:" + z17 + ", rootCommentId:" + rootComment.mo2128x1ed62e84());
        if (intValue2 < 0 || intValue < 0 || intValue >= o1Var.e() || (i17 = intValue + intValue2) > o1Var.e() || (a2Var = o0Var.f211863o) == null || (m82555x4905e9fa = a2Var.k().m82555x4905e9fa()) == null || (mo7946xf939df19 = m82555x4905e9fa.mo7946xf939df19()) == null) {
            return;
        }
        if (intValue2 > 0) {
            mo7946xf939df19.m8153xd399a4d9(intValue, intValue2);
        }
        if (!z17 || (i18 = intValue - 1) < 0) {
            if (z17 || i17 >= o1Var.e()) {
                return;
            }
            mo7946xf939df19.m8148xed6e4d18(i17, 1);
            return;
        }
        mo7946xf939df19.m8148xed6e4d18(i18, 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var2 = o0Var.f211863o;
        if (a2Var2 != null) {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.r(a2Var2.k(), false, null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.t.f211940d, 3, null);
        }
    }

    @Override // in5.y
    public boolean c(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (this.f211873y) {
            return false;
        }
        if (i17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", "onItemLongClick position:" + i17);
            return false;
        }
        java.lang.Object obj = this.f211859h.f211875a.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        jv2.d dVar = (jv2.d) obj;
        rl5.r rVar = new rl5.r(this.f211855d);
        iv2.a aVar = this.f211861m;
        if (aVar != null) {
            rVar.g(view, 0, 0L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.p1(dVar, aVar.f376652b, this.f211862n == 1), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.r1(dVar, this.f211858g, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.e0(this)), com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295044d, com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295045e);
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
        throw null;
    }

    public boolean d(jv2.d comment, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment, "comment");
        long A0 = comment.f383740d.A0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o1 o1Var = this.f211859h;
        boolean z18 = false;
        if (A0 == 0) {
            if (!z17) {
                return false;
            }
            o1Var.getClass();
            if (comment.mo2128x1ed62e84() != 0) {
                java.util.Iterator it = o1Var.f211875a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((jv2.d) it.next()).f383740d.A0() == comment.mo2128x1ed62e84()) {
                        z18 = true;
                        break;
                    }
                }
            }
            return !z18;
        }
        int i17 = -1;
        if (z17) {
            o1Var.getClass();
            java.util.Iterator it6 = o1Var.f211875a.iterator();
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
                jv2.d comment1 = (jv2.d) next;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment1, "comment1");
                if (!(comment1.mo2128x1ed62e84() == comment.mo2128x1ed62e84())) {
                    if (i17 >= 0 && o1Var.f(comment1, comment)) {
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
        o1Var.getClass();
        java.util.Iterator it7 = o1Var.f211875a.iterator();
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
            jv2.d comment12 = (jv2.d) next2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment12, "comment1");
            if (!(comment12.mo2128x1ed62e84() == comment.mo2128x1ed62e84())) {
                if (o1Var.f(comment12, comment)) {
                    i17 = i27;
                }
                i27 = i28;
            } else if (i17 >= 0 && i17 < i27) {
                z18 = true;
            }
        }
        return !z18;
    }

    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf e(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawerPresenter$getAdapter$adapter$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                if (type == 1) {
                    return new gv2.k(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0.this, false);
                }
                if (type == 2) {
                    return new gv2.w(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0.this);
                }
                hc2.l.a("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", type);
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
            }
        }, this.f211859h.f211875a, false);
        c22848x6ddd90cf.mo8164xbbdced85(false);
        c22848x6ddd90cf.f374638o = this;
        c22848x6ddd90cf.f374637n = this;
        return c22848x6ddd90cf;
    }

    public final int f() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("calculateCommentCount ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o1 o1Var = this.f211859h;
        sb6.append(o1Var.e());
        sb6.append(", ");
        iv2.a aVar = this.f211861m;
        if (aVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
            throw null;
        }
        sb6.append(aVar.f376654d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", sb6.toString());
        int e17 = o1Var.e() + 0;
        iv2.a aVar2 = this.f211861m;
        if (aVar2 != null) {
            return java.lang.Math.max(e17, aVar2.f376654d);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
        throw null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 g() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var = this.f211863o;
        if (a2Var != null) {
            return a2Var.f().m61024xdb574fcd();
        }
        return null;
    }

    public jv2.d h(long j17) {
        java.lang.Object obj = null;
        if (j17 == 0) {
            return null;
        }
        java.util.Iterator it = this.f211859h.f211875a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((jv2.d) next).f383740d.t0() == j17) {
                obj = next;
                break;
            }
        }
        return (jv2.d) obj;
    }

    public void i(jv2.d rootComment, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootComment, "rootComment");
        if (z17) {
            java.util.LinkedList w07 = rootComment.f383740d.w0();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(w07)) {
                java.util.Iterator it = this.f211859h.f211875a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        fp0.t tVar = this.A;
                        if (tVar != null) {
                            tVar.b(new fp0.r(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.s(w07, this, rootComment), null, 2, null));
                        }
                    } else if (((jv2.d) it.next()).f383740d.t0() == ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) w07.getFirst()).m76058xa6514d24()) {
                        break;
                    }
                }
            }
        }
        fp0.t tVar2 = this.A;
        if (tVar2 != null) {
            tVar2.b(new fp0.r(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.z(rootComment, this, z17), null, 2, null));
        }
    }

    public void j() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa2;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa3;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa4;
        if (this.f211874z) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", "onDetach: can not detach, because it is not attached");
            return;
        }
        this.f211874z = true;
        this.B = false;
        fp0.t tVar = this.A;
        if (tVar != null) {
            tVar.f();
        }
        this.A = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var = this.f211863o;
        if (((a2Var == null || (m82555x4905e9fa4 = a2Var.k().m82555x4905e9fa()) == null) ? null : m82555x4905e9fa4.getLayoutManager()) instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var2 = this.f211863o;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = (a2Var2 == null || (m82555x4905e9fa3 = a2Var2.k().m82555x4905e9fa()) == null) ? null : m82555x4905e9fa3.getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager).w();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var3 = this.f211863o;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b f17 = a2Var3 != null ? a2Var3.f() : null;
        if (f17 != null) {
            f17.m61053x710e23e0(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var4 = this.f211863o;
        if (a2Var4 != null && (m82555x4905e9fa2 = a2Var4.k().m82555x4905e9fa()) != null && (mo7946xf939df192 = m82555x4905e9fa2.mo7946xf939df19()) != null) {
            mo7946xf939df192.mo8165x48eac7b3(this.G);
        }
        java.util.Iterator it = this.f211860i.iterator();
        while (it.hasNext()) {
            ((im5.a) it.next()).mo10668x2efc64();
        }
        this.f211860i.clear();
        this.E.mo48814x2efc64();
        iv2.a aVar = this.f211861m;
        if (aVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
            throw null;
        }
        aVar.f376654d = f();
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a.f211697a;
        iv2.a aVar2 = this.f211861m;
        if (aVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
            throw null;
        }
        java.util.Map map2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a.f211697a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(map2, "access$getCacheItems$cp(...)");
        map2.put(java.lang.Long.valueOf(aVar2.a()), aVar2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onDetach] updateFeedCommentCount feedId=");
        if (this.f211861m == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
            throw null;
        }
        sb6.append(r6.f376656f);
        sb6.append(" commentCount ");
        sb6.append(f());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.c cVar = this.f211865q;
        if (cVar != null) {
            int f18 = f();
            java.util.ArrayList data = this.f211859h.f211875a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
            zy2.y5 y5Var = ((c61.z6) cVar).f120976a;
            if (y5Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.l5 l5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.l5) y5Var;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCommentTransparentActivity", "onClose: commentCount:" + f18);
                ai4.m0 m0Var = ai4.m0.f86706a;
                mj4.h t17 = m0Var.G().t(l5Var.f255580a);
                if (t17 != null) {
                    mj4.j jVar = new mj4.j((mj4.k) t17);
                    jVar.f408599b.put("field_CommentCount", java.lang.Integer.valueOf(f18));
                    m0Var.G().s(jVar.a());
                }
                l5Var.f255581b.finish();
            }
        }
        if (this.f211869u || !this.f211870v) {
            this.f211859h.f211875a.clear();
        } else {
            if (this.f211871w != 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(this.f211859h.f211875a)) {
                java.util.Iterator it6 = this.f211859h.f211875a.iterator();
                int i17 = 0;
                while (it6.hasNext()) {
                    java.lang.Object next = it6.next();
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    jv2.d dVar = (jv2.d) next;
                    if (dVar.mo2128x1ed62e84() == this.f211871w) {
                        dVar.f383746m = false;
                    }
                    i17 = i18;
                }
            }
            this.f211859h.f211875a.clear();
        }
        this.f211866r = null;
        m(false);
        l(true);
        if (!this.f211857f) {
            o();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 g17 = g();
        this.D = java.lang.String.valueOf(g17 != null ? g17.getText() : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 g18 = g();
        if (g18 != null) {
            g18.setText((java.lang.CharSequence) null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15144x165092d1 c15144x165092d1 = this.C;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b footer = c15144x165092d1 != null ? c15144x165092d1.getFooter() : null;
        if (footer != null) {
            footer.m61075x6435bedc(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 g19 = g();
        if (g19 != null) {
            ((java.util.HashMap) g19.pastedList).clear();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var5 = this.f211863o;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 k17 = a2Var5 != null ? a2Var5.k() : null;
        if (k17 != null) {
            k17.m82693x1501d518(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var6 = this.f211863o;
        if (a2Var6 != null && (m82555x4905e9fa = a2Var6.k().m82555x4905e9fa()) != null && (mo7946xf939df19 = m82555x4905e9fa.mo7946xf939df19()) != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var7 = this.f211863o;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa5 = a2Var7 != null ? a2Var7.k().m82555x4905e9fa() : null;
        if (m82555x4905e9fa5 != null) {
            m82555x4905e9fa5.mo7966xf161ffec(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var8 = this.f211863o;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 k18 = a2Var8 != null ? a2Var8.k() : null;
        if (k18 != null) {
            k18.m82683xb165a19d(null);
        }
        this.f211863o = null;
    }

    public final void k(boolean z17) {
        fp0.t tVar = this.A;
        if (tVar != null) {
            tVar.b(new fp0.r(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.l0(z17, this), null, 2, null));
        }
    }

    @Override // im5.b
    /* renamed from: keep */
    public void mo46316x322b85(im5.a p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        this.f211860i.add(p07);
    }

    public final void l(boolean z17) {
        this.f211868t = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", "set downContinue " + z17);
    }

    public final void m(boolean z17) {
        this.f211867s = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", "set upContinue " + z17);
    }

    public void n() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82839x4905e9fa;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o1 o1Var;
        java.util.ArrayList arrayList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", "startHideVkb: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var = this.f211863o;
        if (a2Var != null && (m82839x4905e9fa = a2Var.e().m82839x4905e9fa()) != null && (o1Var = this.f211859h) != null && (arrayList = o1Var.f211875a) != null) {
            if (arrayList.size() >= 1) {
                ((jv2.d) arrayList.get(arrayList.size() - 1)).f383741e = false;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = m82839x4905e9fa.mo7946xf939df19();
                if (mo7946xf939df19 != null) {
                    mo7946xf939df19.m8147xed6e4d18(arrayList.size() - 1);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((jv2.d) it.next()).f383742f = false;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = m82839x4905e9fa.mo7946xf939df19();
            if (mo7946xf939df192 != null) {
                mo7946xf939df192.m8146xced61ae5();
            }
        }
        o();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var2 = this.f211863o;
        if (a2Var2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b f17 = a2Var2.f();
            java.lang.String b17 = hc2.t.b(this.f211855d, this.f211862n);
            iv2.a aVar = this.f211861m;
            if (aVar != null) {
                f17.h(b17, aVar.f376655e, null);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                throw null;
            }
        }
    }

    public final void o() {
        android.text.Editable text;
        java.lang.String obj;
        android.text.Editable text2;
        java.lang.String obj2;
        if (!this.f211857f) {
            jv2.d dVar = this.f211856e;
            if (dVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 g17 = g();
                if (g17 != null && (text2 = g17.getText()) != null && (obj2 = text2.toString()) != null) {
                    iu2.a aVar = iu2.a.f376516a;
                    jv2.a commentObj = dVar.f383740d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentObj, "commentObj");
                    aVar.b(aVar.a(commentObj), obj2);
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 g18 = g();
                if (g18 == null || (text = g18.getText()) == null || (obj = text.toString()) == null) {
                    java.lang.String str = this.D;
                    if (str != null) {
                        iu2.a aVar2 = iu2.a.f376516a;
                        iv2.a aVar3 = this.f211861m;
                        if (aVar3 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                            throw null;
                        }
                        aVar2.b(aVar3.f376651a, str);
                    }
                } else {
                    iu2.a aVar4 = iu2.a.f376516a;
                    iv2.a aVar5 = this.f211861m;
                    if (aVar5 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                        throw null;
                    }
                    aVar4.b(aVar5.f376651a, obj);
                }
            }
            if (this.f211856e != null) {
                this.f211856e = null;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 g19 = g();
                if (g19 != null) {
                    g19.setText((java.lang.CharSequence) null);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15144x165092d1 c15144x165092d1 = this.C;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b footer = c15144x165092d1 != null ? c15144x165092d1.getFooter() : null;
                if (footer != null) {
                    footer.m61075x6435bedc(false);
                }
            }
        }
        this.f211857f = false;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82839x4905e9fa;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.d dVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82839x4905e9fa2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b footer;
        jv2.d dVar2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 g17;
        android.text.Editable text;
        java.lang.String obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b footer2;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (holder.m8185xcdaf1228() == 3 || this.f211873y) {
            return;
        }
        if (i17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", "onItemClick position:" + i17);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15144x165092d1 c15144x165092d1 = this.C;
        boolean z17 = false;
        if (((c15144x165092d1 == null || (footer2 = c15144x165092d1.getFooter()) == null || footer2.getFooterMode() != 2) ? false : true) && (dVar2 = this.f211856e) != null && (g17 = g()) != null && (text = g17.getText()) != null && (obj = text.toString()) != null) {
            iu2.a aVar = iu2.a.f376516a;
            jv2.a commentObj = dVar2.f383740d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentObj, "commentObj");
            aVar.b(aVar.a(commentObj), obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 g18 = g();
            if (g18 != null) {
                g18.setText((java.lang.CharSequence) null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15144x165092d1 c15144x165092d12 = this.C;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b footer3 = c15144x165092d12 != null ? c15144x165092d12.getFooter() : null;
            if (footer3 != null) {
                footer3.m61075x6435bedc(false);
            }
            this.f211857f = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o1 o1Var = this.f211859h;
        java.lang.Object obj2 = o1Var.f211875a.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
        jv2.d dVar3 = (jv2.d) obj2;
        this.f211856e = dVar3;
        if (dVar3.f383743g && ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176) holder.p(com.p314xaae8f345.mm.R.id.c6d)).i()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15144x165092d1 c15144x165092d13 = this.C;
        if (c15144x165092d13 != null && (footer = c15144x165092d13.getFooter()) != null) {
            if (footer.getFooterMode() != 0) {
                android.content.Context context = footer.getContext();
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
                if (abstractActivityC21394xb3d2c0cf != null) {
                    abstractActivityC21394xb3d2c0cf.mo48674x36654fab();
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", "onItemClick: state:" + dVar3.f383740d.f67484x29d3a50c);
        int i18 = dVar3.f383740d.f67484x29d3a50c;
        if ((i18 == 1 || i18 == -1) ? false : true) {
            iv2.a aVar2 = this.f211861m;
            if (aVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                throw null;
            }
            if (aVar2.f376653c) {
                android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                db5.t7.m(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jwi));
                hu2.a aVar3 = hu2.a.f366614a;
                iv2.a aVar4 = this.f211861m;
                if (aVar4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                    throw null;
                }
                aVar3.a(aVar4.f376652b, aVar4.f376651a, aVar4.f376653c);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var2 = this.f211863o;
                if (a2Var2 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b f17 = a2Var2.f();
                    int i19 = this.f211862n;
                    jv2.a commentObj2 = dVar3.f383740d;
                    boolean z18 = i19 == 2;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentObj2, "commentObj");
                    if (z18) {
                        java.lang.String str = f17.lastFromName;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" ");
                        android.content.res.Resources resources = f17.getResources();
                        i95.m c17 = i95.n0.c(c61.yb.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                        sb6.append(resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572458ba1, f17.i(c61.yb.md((c61.yb) c17, commentObj2.D0(), commentObj2.y0(), false, 4, null))));
                        f17.f(str, sb6.toString(), commentObj2, true);
                    } else {
                        f17.f(f17.lastFromName, " " + f17.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572458ba1, f17.i(commentObj2.y0())), commentObj2, true);
                    }
                    f17.m61024xdb574fcd().setShowSoftInputOnFocus(true);
                    f17.m61024xdb574fcd().requestFocus();
                    java.lang.String key = iu2.a.f376516a.a(commentObj2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCommentDraftCache", "getDraft() called with: key = ".concat(key));
                    java.lang.String str2 = (java.lang.String) iu2.a.f376517b.get(key);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                        f17.m61024xdb574fcd().setText(str2);
                        f17.m61024xdb574fcd().mo81549xf579a34a(str2 != null ? str2.length() : 0);
                        f17.isUseDraft = true;
                        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).ij(f17.getContext(), 19L, "", f17.mFeedUserName);
                    }
                    f17.m(true);
                }
            }
            boolean z19 = dVar3.h() == 2;
            iv2.a aVar5 = this.f211861m;
            if (aVar5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                throw null;
            }
            java.util.ArrayList arrayList = o1Var.f211875a;
            if (!aVar5.f376653c && (a2Var = this.f211863o) != null && (m82839x4905e9fa2 = a2Var.e().m82839x4905e9fa()) != null && arrayList != null) {
                if (z19) {
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        jv2.d dVar4 = (jv2.d) it.next();
                        long A0 = dVar3.f383740d.A0();
                        if (dVar4.f383740d.A0() == A0 || dVar4.f383740d.t0() == A0) {
                            dVar4.f383742f = false;
                        } else {
                            dVar4.f383742f = true;
                        }
                    }
                } else {
                    java.util.Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        jv2.d dVar5 = (jv2.d) it6.next();
                        long t07 = dVar3.f383740d.t0();
                        if (dVar5.f383740d.A0() == t07 || dVar5.f383740d.t0() == t07) {
                            dVar5.f383742f = false;
                        } else {
                            dVar5.f383742f = true;
                        }
                    }
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = m82839x4905e9fa2.mo7946xf939df19();
                if (mo7946xf939df19 != null) {
                    mo7946xf939df19.m8146xced61ae5();
                }
            }
            boolean z27 = dVar3.h() == 2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var3 = this.f211863o;
            if (a2Var3 != null && (dVar = a2Var3.f211700d) != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0) dVar).d(dVar3, true)) {
                z17 = true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var4 = this.f211863o;
            if (a2Var4 == null || (m82839x4905e9fa = a2Var4.e().m82839x4905e9fa()) == null) {
                return;
            }
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.dz_);
            if (findViewById == null) {
                findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.dza);
            }
            iv2.a aVar6 = this.f211861m;
            if (aVar6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                throw null;
            }
            if (!aVar6.f376653c && arrayList != null && arrayList.size() >= 1) {
                ((jv2.d) arrayList.get(arrayList.size() - 1)).f383741e = true;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = m82839x4905e9fa.mo7946xf939df19();
                if (mo7946xf939df192 != null) {
                    mo7946xf939df192.m8147xed6e4d18(arrayList.size() - 1);
                }
            }
            if (findViewById != null) {
                m82839x4905e9fa.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.n0(findViewById, this, z27, z17, m82839x4905e9fa));
            }
        }
    }
}
