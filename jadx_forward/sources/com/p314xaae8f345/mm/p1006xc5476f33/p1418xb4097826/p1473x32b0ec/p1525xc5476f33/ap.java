package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ap extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k1 {
    public static final int N;
    public static final float P;
    public static final float Q;
    public static final float R;
    public static final int S;
    public static final int T;
    public static final int U;
    public static final boolean V;
    public final java.util.Map A;
    public final java.util.Map B;
    public final java.util.Map C;
    public final java.util.Map D;
    public final java.util.LinkedList E;
    public final java.util.concurrent.ConcurrentHashMap F;
    public final java.util.concurrent.ConcurrentHashMap G;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 H;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 I;

    /* renamed from: J, reason: collision with root package name */
    public volatile boolean f193447J;
    public pm2.a K;
    public int L;
    public int M;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f193448p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.o1 f193449q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.ViewGroup f193450r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f193451s;

    /* renamed from: t, reason: collision with root package name */
    public final int f193452t;

    /* renamed from: u, reason: collision with root package name */
    public final int f193453u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.RelativeLayout f193454v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.RelativeLayout f193455w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.RelativeLayout f193456x;

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.RelativeLayout f193457y;

    /* renamed from: z, reason: collision with root package name */
    public final int f193458z;

    static {
        ae2.in inVar = ae2.in.f85221a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.H1).mo141623x754a37bb()).r()).intValue() * 1000;
        N = intValue;
        int i17 = 500 / (intValue + 500);
        P = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        Q = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        R = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
        S = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        T = ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 3.0f);
        U = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561212cf);
        V = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.P0).mo141623x754a37bb()).r()).intValue() == 0 && dk2.ef.f314905a.e() != null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap(android.view.ViewGroup root, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.o1 iGiftQueue, android.view.ViewGroup outerSpaceParent, boolean z17) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iGiftQueue, "iGiftQueue");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outerSpaceParent, "outerSpaceParent");
        this.f193448p = statusMonitor;
        this.f193449q = iGiftQueue;
        this.f193450r = outerSpaceParent;
        this.f193451s = z17;
        ae2.in inVar = ae2.in.f85221a;
        this.f193452t = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.J1).mo141623x754a37bb()).r()).intValue();
        this.f193453u = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.K1).mo141623x754a37bb()).r()).intValue();
        this.E = new java.util.LinkedList();
        this.F = new java.util.concurrent.ConcurrentHashMap();
        this.G = new java.util.concurrent.ConcurrentHashMap();
        this.H = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("FinderLiveGiftQueuePlugin::Timer", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.uo(this), false);
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.f566199f35);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById;
        this.f193454v = relativeLayout;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.f37);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) findViewById2;
        this.f193455w = relativeLayout2;
        android.view.View findViewById3 = root.findViewById(com.p314xaae8f345.mm.R.id.f566200f36);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.RelativeLayout relativeLayout3 = (android.widget.RelativeLayout) findViewById3;
        this.f193456x = relativeLayout3;
        android.view.View inflate = android.view.LayoutInflater.from(root.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.arg, root, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        android.widget.RelativeLayout relativeLayout4 = (android.widget.RelativeLayout) inflate;
        this.f193457y = relativeLayout4;
        java.util.Map synchronizedMap = java.util.Collections.synchronizedMap(new java.util.LinkedHashMap(3));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(synchronizedMap, "synchronizedMap(...)");
        this.A = synchronizedMap;
        synchronizedMap.put(relativeLayout, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn(this, relativeLayout, 0, z17, false, false, false, 0, 120, null));
        synchronizedMap.put(relativeLayout2, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn(this, relativeLayout2, 1, z17, false, false, false, 0, 120, null));
        synchronizedMap.put(relativeLayout3, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn(this, relativeLayout3, 2, z17, true, false, false, 0, 112, null));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn(this, relativeLayout4, 1000, z17, false, false, false, 0, 120, null);
        tnVar.f195989w = true;
        tnVar.f195972f.getAndSet(true);
        tnVar.f195987u = "";
        synchronizedMap.put(relativeLayout4, tnVar);
        this.f193458z = synchronizedMap.size();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap(3);
        this.B = concurrentHashMap;
        concurrentHashMap.put(relativeLayout, z1(this, relativeLayout, false, null, 6, null));
        concurrentHashMap.put(relativeLayout2, z1(this, relativeLayout2, false, null, 6, null));
        concurrentHashMap.put(relativeLayout3, z1(this, relativeLayout3, false, null, 6, null));
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = new java.util.concurrent.ConcurrentHashMap(3);
        this.C = concurrentHashMap2;
        concurrentHashMap2.put(relativeLayout, A1(relativeLayout, false));
        concurrentHashMap2.put(relativeLayout2, A1(relativeLayout2, false));
        concurrentHashMap2.put(relativeLayout3, A1(relativeLayout3, false));
        java.util.Map synchronizedMap2 = java.util.Collections.synchronizedMap(new java.util.LinkedHashMap());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(synchronizedMap2, "synchronizedMap(...)");
        this.D = synchronizedMap2;
        java.util.Iterator it = synchronizedMap.values().iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14323xd3329234 c14323xd3329234 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) it.next()).f195980n.f196130g;
            if (c14323xd3329234 != null) {
                zl2.r4.f555483a.b3(c14323xd3329234);
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ln(this));
        this.I = n3Var;
        n3Var.m77789xc5a5549d(false);
        boolean z18 = V;
        if (z18) {
            android.widget.RelativeLayout relativeLayout5 = this.f193454v;
            if (relativeLayout5 != null) {
                relativeLayout5.setVisibility(8);
            }
            android.widget.RelativeLayout relativeLayout6 = this.f193455w;
            if (relativeLayout6 != null) {
                relativeLayout6.setVisibility(8);
            }
            android.widget.RelativeLayout relativeLayout7 = this.f193456x;
            if (relativeLayout7 != null) {
                relativeLayout7.setVisibility(8);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "ENABLE_TEST:" + z18);
        this.K = pm2.a.f438386f;
        this.M = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0913  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0926  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x096b  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0980  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x08c5  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x08d2  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0856  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x08ef  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x08f4  */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v29, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void V1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap r37, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn r38, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 r39, boolean r40, int r41, java.lang.Object r42) {
        /*
            Method dump skipped, instructions count: 2536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap.V1(com.tencent.mm.plugin.finder.live.plugin.ap, com.tencent.mm.plugin.finder.live.plugin.tn, com.tencent.mm.plugin.finder.live.util.l1, boolean, int, java.lang.Object):void");
    }

    public static /* synthetic */ android.animation.ValueAnimator z1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap apVar, android.view.ViewGroup viewGroup, boolean z17, android.animation.ValueAnimator valueAnimator, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        if ((i17 & 4) != 0) {
            valueAnimator = null;
        }
        return apVar.y1(viewGroup, z17, valueAnimator);
    }

    public final android.animation.ValueAnimator A1(android.view.ViewGroup viewGroup, boolean z17) {
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(viewGroup, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(500L);
        return ofFloat;
    }

    public final void B1(android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) this.A.get(viewGroup);
        if (tnVar != null) {
            tnVar.a();
            tnVar.f195988v.getAndSet(false);
        }
        viewGroup.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ff, code lost:
    
        if (r2 == false) goto L64;
     */
    @Override // qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C0(java.util.LinkedHashMap r20) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap.C0(java.util.LinkedHashMap):void");
    }

    public final void C1(android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) this.A.get(viewGroup);
        if (tnVar != null) {
            tnVar.f195988v.getAndSet(true);
        }
    }

    public final java.util.Map.Entry D1() {
        java.util.List y17 = q26.h0.y(q26.h0.i(kz5.e1.u(this.A), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.co.f193714d));
        if (!y17.isEmpty()) {
            return (java.util.Map.Entry) y17.get(0);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String E1(java.lang.String r6, pm2.a r7) {
        /*
            r5 = this;
            java.lang.Class<mm2.o4> r0 = mm2.o4.class
            androidx.lifecycle.c1 r0 = r5.P0(r0)
            mm2.o4 r0 = (mm2.o4) r0
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData r0 = r0.A
            java.lang.Object r0 = r0.mo3195x754a37bb()
            xh2.c r0 = (xh2.c) r0
            r1 = 0
            if (r0 == 0) goto L3b
            java.util.LinkedList r0 = r0.f536064a
            if (r0 == 0) goto L3b
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r0.next()
            r3 = r2
            xh2.a r3 = (xh2.a) r3
            java.lang.String r3 = r3.b()
            boolean r3 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r3, r6)
            if (r3 == 0) goto L1b
            goto L34
        L33:
            r2 = r1
        L34:
            xh2.a r2 = (xh2.a) r2
            if (r2 == 0) goto L3b
            xh2.i r0 = r2.f536054b
            goto L3c
        L3b:
            r0 = r1
        L3c:
            if (r0 == 0) goto L41
            int r2 = r0.f536086e
            goto L42
        L41:
            r2 = 1
        L42:
            if (r0 == 0) goto L47
            int r3 = r0.f536090i
            goto L48
        L47:
            r3 = 0
        L48:
            r4 = 2
            boolean r3 = pm0.v.z(r3, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            r6 = 64
            r4.append(r6)
            int r7 = r7.ordinal()
            r4.append(r7)
            r4.append(r6)
            r4.append(r2)
            r4.append(r6)
            r4.append(r3)
            r4.append(r6)
            if (r0 == 0) goto L78
            int r6 = r0.f536088g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
        L78:
            r4.append(r1)
            java.lang.String r6 = r4.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap.E1(java.lang.String, pm2.a):java.lang.String");
    }

    public final java.lang.CharSequence F1(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa, android.widget.TextView textView, boolean z17, boolean z18) {
        java.lang.String m76184x8010e5e4;
        zl2.r4 r4Var = zl2.r4.f555483a;
        java.lang.String D0 = zl2.r4.D0(r4Var, c19782x23db1cfa != null ? c19782x23db1cfa.m76197x6c03c64c() : null, c19782x23db1cfa != null ? c19782x23db1cfa.m76184x8010e5e4() : null, false, 4, null);
        if (((mm2.c1) P0(mm2.c1.class)).Z3 && c19782x23db1cfa != null && (m76184x8010e5e4 = c19782x23db1cfa.m76184x8010e5e4()) != null) {
            D0 = m76184x8010e5e4;
        }
        if (((mm2.c1) P0(mm2.c1.class)).R6()) {
            D0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.s(c19782x23db1cfa != null ? c19782x23db1cfa.m76197x6c03c64c() : null, D0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(D0, "makeAnonymousNameIfIsMySelf(...)");
        }
        java.lang.String str = D0;
        if (z18) {
            return str;
        }
        if (z17) {
            return r4Var.c1(str, 4, true);
        }
        int i17 = this.f193452t;
        if (i17 > 0) {
            return r4Var.c1(str, i17, true);
        }
        if (textView == null) {
            return str;
        }
        i95.m c17 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        android.content.Context context = textView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.text.TextPaint paint = textView.getPaint();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(paint, "getPaint(...)");
        return c61.yb.nf((c61.yb) c17, context, paint, str, 0, 8, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    public final void G1(android.view.ViewGroup viewGroup, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 l1Var) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean2;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean3;
        if (viewGroup == null || l1Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) this.A.get(viewGroup);
        if ((tnVar == null || (atomicBoolean3 = tnVar.f195970d) == null || true != atomicBoolean3.get()) ? false : true) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.no(this, viewGroup, l1Var));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) this.A.get(viewGroup);
        if (tnVar2 != null && (atomicBoolean2 = tnVar2.f195970d) != null) {
            atomicBoolean2.getAndSet(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) this.A.get(viewGroup);
        if (tnVar3 != null && (atomicBoolean = tnVar3.f195972f) != null) {
            atomicBoolean.getAndSet(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l1Var.f197129n, "PRECIOUS_GIFT_SCHEDULE_NORMAL") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l1Var.f197129n, "PRECIOUS_GIFT_SCHEDULE_AS_ATTACH_GIFT"));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) this.A.get(viewGroup);
        if (tnVar4 != null) {
            java.lang.String str = l1Var.f197126h;
            if (str == null) {
                str = "";
            }
            tnVar4.f195974h = str;
        }
        df2.wy wyVar = (df2.wy) U0(df2.wy.class);
        if (wyVar != null) {
            wyVar.g7(l1Var);
        }
        tf2.k kVar = (tf2.k) U0(tf2.k.class);
        if (kVar != null) {
            kVar.a7(l1Var);
        }
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.Cdo(viewGroup, this, l1Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    public final void H1(pm2.a aVar, java.util.LinkedHashMap linkedHashMap, java.util.List list) {
        java.lang.Object obj;
        boolean z17;
        boolean z18;
        android.view.ViewGroup viewGroup;
        java.lang.String str;
        boolean z19;
        boolean z27;
        km2.q qVar;
        java.lang.Object obj2;
        java.lang.Object obj3;
        x1();
        boolean z28 = false;
        M1(0);
        java.util.Iterator it = this.F.entrySet().iterator();
        while (it.hasNext()) {
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) ((java.util.Map.Entry) it.next()).getValue();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) this.A.get(viewGroup2);
            java.util.List list2 = ((mm2.o4) P0(mm2.o4.class)).f410857s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "<get-anchorPkMicUserList>(...)");
            synchronized (list2) {
                java.util.Iterator it6 = list2.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it6.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tnVar != null ? tnVar.f195987u : null, ((km2.q) obj2).f390705c)) {
                        break;
                    }
                }
            }
            if (obj2 == null) {
                if (android.text.TextUtils.equals(((mm2.c1) P0(mm2.c1.class)).f410385o, tnVar != null ? tnVar.f195987u : null)) {
                    continue;
                } else {
                    synchronized (list) {
                        java.util.Iterator it7 = list.iterator();
                        while (true) {
                            if (!it7.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            java.lang.Object next = it7.next();
                            if (android.text.TextUtils.equals(((km2.q) next).f390705c, tnVar != null ? tnVar.f195987u : null)) {
                                obj3 = next;
                                break;
                            }
                        }
                    }
                    if (obj3 == null) {
                        U1(viewGroup2);
                        it.remove();
                    }
                }
            }
        }
        boolean a76 = ((mm2.y2) P0(mm2.y2.class)).a7();
        boolean z29 = false;
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            java.lang.CharSequence charSequence = (java.lang.CharSequence) entry.getKey();
            if (!((charSequence == null || charSequence.length() == 0) ? true : z28)) {
                java.util.List list3 = ((mm2.o4) P0(mm2.o4.class)).f410857s;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list3, "<get-anchorPkMicUserList>(...)");
                synchronized (list3) {
                    java.util.Iterator it8 = list3.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            obj = it8.next();
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(entry.getKey(), ((km2.q) obj).f390703a)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                }
                km2.q qVar2 = (km2.q) obj;
                if (qVar2 == null) {
                    synchronized (list) {
                        java.util.Iterator it9 = list.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                qVar = it9.next();
                                if (((java.lang.String) entry.getKey()).equals(((km2.q) qVar).f390703a)) {
                                    break;
                                }
                            } else {
                                qVar = 0;
                                break;
                            }
                        }
                    }
                    qVar2 = qVar;
                }
                java.lang.String E1 = E1((java.lang.String) entry.getKey(), aVar);
                zi2.w wVar = (zi2.w) X0(zi2.w.class);
                sj2.m y17 = wVar != null ? wVar.y1((java.lang.String) entry.getKey()) : null;
                if (y17 != null) {
                    android.view.ViewGroup mo124433x9681e6d = y17.mo124433x9681e6d();
                    if (mo124433x9681e6d != null) {
                        z27 = a76;
                    } else {
                        mo124433x9681e6d = this.f193454v;
                        z29 = true;
                        z27 = z28;
                    }
                    z17 = z29;
                    viewGroup = mo124433x9681e6d;
                    z18 = z27;
                } else {
                    z17 = z29;
                    z18 = a76;
                    viewGroup = null;
                }
                if (this.F.containsKey(E1) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.F.get(E1), viewGroup)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "onNormalMicUserChange: adjustContainerLocation, sdkUserId = " + ((java.lang.String) entry.getKey()) + " isUseCustomMode: " + a76);
                } else {
                    if (qVar2 == null || (str = qVar2.f390705c) == null) {
                        str = ((mm2.c1) P0(mm2.c1.class)).f410385o;
                    }
                    java.lang.String str2 = str;
                    if (y17 != null && viewGroup != null) {
                        java.lang.Object obj4 = this.F.get(E1);
                        android.view.ViewGroup viewGroup3 = obj4 instanceof android.view.ViewGroup ? (android.view.ViewGroup) obj4 : null;
                        if (viewGroup3 != null) {
                            U1(viewGroup3);
                        }
                        android.view.ViewGroup viewGroup4 = viewGroup;
                        z19 = z17;
                        J1(viewGroup, str2, z18, z18, ((android.graphics.Rect) entry.getValue()).width(), y17.mo124432x5dc7fd72());
                        this.F.put(E1, viewGroup4);
                        this.G.put(viewGroup4, y17);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "onNormalMicUserChange: outerSpaceMap add new entry, key = " + ((java.lang.String) entry.getKey()) + ", value = " + viewGroup4 + ", outSpaceWidth:" + ((android.graphics.Rect) entry.getValue()).width() + " isNeedUserDefaultContainer: " + z19);
                        z29 = z19;
                    }
                }
                z19 = z17;
                z29 = z19;
            }
            z28 = false;
        }
        if (z29) {
            C1(this.f193454v);
            this.f193454v.setAlpha(1.0f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:190:0x0356 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0354 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void I1() {
        /*
            Method dump skipped, instructions count: 917
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap.I1():void");
    }

    public final void J1(android.view.ViewGroup viewGroup, java.lang.String str, boolean z17, boolean z18, int i17, android.animation.ValueAnimator valueAnimator) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14323xd3329234 c14323xd3329234;
        if (this.A.size() == this.f193458z) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "registerOuterSpace: disable origin three container");
            java.util.Map.Entry D1 = D1();
            u1(D1 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) D1.getValue() : null);
            B1(this.f193454v);
            B1(this.f193455w);
            B1(this.f193456x);
        }
        java.util.Map map = this.A;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn(this, viewGroup, map.size(), this.f193451s, false, z17, z18, i17, 8, null);
        tnVar.f195990x.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nn(tnVar));
        map.put(viewGroup, tnVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) this.A.get(viewGroup);
        if (tnVar2 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
            tnVar2.f195987u = str;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "registerOuterSpace isCustomMode: " + z18 + " : info:" + this.A.get(viewGroup));
        java.util.Map map2 = this.B;
        android.animation.ValueAnimator y17 = y1(viewGroup, z17, valueAnimator);
        y17.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ko(this, viewGroup, y17, z17));
        ((java.util.concurrent.ConcurrentHashMap) map2).put(viewGroup, y17);
        java.util.Map map3 = this.C;
        android.animation.ValueAnimator A1 = A1(viewGroup, z17);
        A1.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mo(this, viewGroup));
        ((java.util.concurrent.ConcurrentHashMap) map3).put(viewGroup, A1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) this.A.get(viewGroup);
        if (tnVar3 == null || (c14323xd3329234 = tnVar3.f195980n.f196130g) == null) {
            return;
        }
        zl2.r4.f555483a.b3(c14323xd3329234);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        if (((mm2.e0) P0(mm2.e0.class)).P6()) {
            super.K0(8);
            return;
        }
        if (((mm2.j2) P0(mm2.j2.class)).O6(x0())) {
            super.K0(8);
            this.f194860i = i17;
            return;
        }
        ae2.in inVar = ae2.in.f85221a;
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.N5).mo141623x754a37bb()).r()).booleanValue()) {
            i17 = 8;
        }
        super.K0(i17);
        android.content.Context context = this.f446856d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (((pl2.x) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(pl2.x.class)).f438216f) {
            this.f193450r.setVisibility(8);
        } else {
            M1(this.M);
        }
    }

    public final void K1(android.view.ViewGroup viewGroup, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 l1Var) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean2;
        java.util.LinkedHashMap linkedHashMap;
        if (viewGroup == null || l1Var == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "replaceBullet, originSpace BulletShowingInfo=" + this.A.get(viewGroup) + ", giftShowInfo=" + l1Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = viewGroup;
        java.lang.String str = l1Var.f197134s;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) this.A.get(viewGroup);
        if (!str.equals(tnVar != null ? tnVar.f195987u : null)) {
            java.util.Map map = this.A;
            synchronized (map) {
                linkedHashMap = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry : map.entrySet()) {
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) entry.getValue()).f195987u.equals(l1Var.f197134s)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashMap.size());
            java.util.Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add((android.view.ViewGroup) ((java.util.Map.Entry) it.next()).getKey());
            }
            if (arrayList.isEmpty()) {
                return;
            } else {
                h0Var.f391656d = arrayList.get(0);
            }
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h0Var.f391656d, viewGroup)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "replaceBullet, targetSpace BulletShowingInfo=" + this.A.get(h0Var.f391656d));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) this.A.get(viewGroup);
            if (tnVar2 != null) {
                tnVar2.a();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) this.A.get(h0Var.f391656d);
        if (tnVar3 != null) {
            tnVar3.a();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) this.A.get(h0Var.f391656d);
        if (tnVar4 != null && (atomicBoolean2 = tnVar4.f195970d) != null) {
            atomicBoolean2.getAndSet(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) this.A.get(h0Var.f391656d);
        if (tnVar5 != null && (atomicBoolean = tnVar5.f195972f) != null) {
            atomicBoolean.getAndSet(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l1Var.f197129n, "PRECIOUS_GIFT_SCHEDULE_NORMAL") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l1Var.f197129n, "PRECIOUS_GIFT_SCHEDULE_AS_ATTACH_GIFT"));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) this.A.get(h0Var.f391656d);
        if (tnVar6 != null) {
            java.lang.String str2 = l1Var.f197126h;
            if (str2 == null) {
                str2 = "";
            }
            tnVar6.f195974h = str2;
        }
        df2.wy wyVar = (df2.wy) U0(df2.wy.class);
        if (wyVar != null) {
            wyVar.g7(l1Var);
        }
        tf2.k kVar = (tf2.k) U0(tf2.k.class);
        if (kVar != null) {
            kVar.a7(l1Var);
        }
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oo(this, h0Var, viewGroup, l1Var));
    }

    public final long L1(java.lang.String str, boolean z17) {
        long longValue;
        ce2.i e17 = dk2.u7.f315714a.e(str);
        boolean z18 = false;
        if (e17 != null && e17.Y0()) {
            z18 = true;
        }
        if (z18) {
            return 300L;
        }
        long longValue2 = ((java.lang.Number) ae2.in.f85221a.H().r()).longValue();
        java.lang.Boolean bool = (java.lang.Boolean) dk2.u7.f315720g.get(str);
        if (z17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE)) {
            java.lang.Float f17 = (java.lang.Float) dk2.u7.f315726m.get(str);
            java.lang.Long l17 = (java.lang.Long) dk2.u7.f315725l.get(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "safeGetDuration: id:" + str + ",custom value = " + f17 + ", value = " + l17);
            if (f17 != null) {
                longValue = f17.floatValue();
            } else {
                if (l17 != null) {
                    longValue = l17.longValue() / 1000;
                }
                longValue = longValue2;
            }
        } else {
            java.lang.Long l18 = (java.lang.Long) dk2.u7.f315725l.get(str);
            if (l18 != null) {
                longValue = l18.longValue() / 1000;
            }
            longValue = longValue2;
        }
        if (0 != longValue) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "safeGetDuration: id:" + str + ", isCustomGift:" + z17 + ", customGiftReady:" + bool);
            return longValue;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "safeGetDuration: giftFullPagDurationMap id:" + str + ", isCustomGift:" + z17 + ", customGiftReady:" + bool + ", value = " + dk2.u7.f315725l.get(str));
        return longValue2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        super.M0(status, bundle);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.xn.f196645a[status.ordinal()] == 1) {
            if (bundle != null && bundle.getBoolean("isShow")) {
                K0(8);
            } else {
                K0(0);
            }
        }
    }

    public final void M1(int i17) {
        this.M = i17;
        android.content.Context context = this.f446856d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (((pl2.x) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(pl2.x.class)).f438216f) {
            i17 = 8;
        }
        this.f193450r.setVisibility(i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k1
    public void N(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m1 giftType, java.util.List appendList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftType, "giftType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appendList, "appendList");
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ho(this));
        I1();
    }

    public final boolean N1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar, ug2.f fVar) {
        boolean z17 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar2 = tnVar.f195970d.get() ^ true ? tnVar : null;
        if (tnVar2 == null) {
            return false;
        }
        tnVar.f195970d.getAndSet(true);
        if (fVar instanceof ug2.c) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zo(tnVar, (ug2.c) fVar, this));
        } else {
            z17 = false;
        }
        if (z17) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po(this, tnVar));
            tnVar2.f195984r = c01.id.c();
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1) this.f193449q).m(fVar);
        return z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "unMount");
        super.O0();
        this.H.d();
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vo(this));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1) this.f193449q).n(this);
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar : this.A.values()) {
            tnVar.f195990x.removeAllListeners();
            tnVar.a();
        }
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) this.B).entrySet().iterator();
        while (it.hasNext()) {
            ((android.animation.ValueAnimator) ((java.util.Map.Entry) it.next()).getValue()).removeAllListeners();
        }
        java.util.Iterator it6 = ((java.util.concurrent.ConcurrentHashMap) this.C).entrySet().iterator();
        while (it6.hasNext()) {
            ((android.animation.ValueAnimator) ((java.util.Map.Entry) it6.next()).getValue()).removeAllListeners();
        }
        this.f193447J = false;
        this.I.mo50302x6b17ad39(null);
    }

    public final void P1(ug2.f fVar) {
        boolean z17 = fVar instanceof ug2.a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.o1 o1Var = this.f193449q;
        qo0.c cVar = this.f193448p;
        if (z17) {
            android.os.Bundle bundle = new android.os.Bundle();
            ug2.a aVar = (ug2.a) fVar;
            bundle.putByteArray("PARAM_LIVE_GIFT_FUNDING_SUC_MSG", aVar.f509044a.mo14344x5f01b1f6());
            java.lang.Long l17 = aVar.f509045b;
            if (l17 != null) {
                bundle.putLong("PARAM_LIVE_GIFT_FUNDING_ANIM_DURATION", l17.longValue());
            }
            cVar.mo46557x60d69242(qo0.b.V1, bundle);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1) o1Var).m(fVar);
            return;
        }
        if (fVar instanceof ug2.g) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            ug2.g gVar = (ug2.g) fVar;
            bundle2.putByteArray("PARAM_LIVE_GIFT_FUNDING_SUC_MSG", gVar.f509059a.mo14344x5f01b1f6());
            java.lang.Long l18 = gVar.f509060b;
            if (l18 != null) {
                bundle2.putLong("PARAM_LIVE_GIFT_FUNDING_ANIM_DURATION", l18.longValue());
            }
            cVar.mo46557x60d69242(qo0.b.V1, bundle2);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1) o1Var).m(fVar);
        }
    }

    public final void Q1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 l1Var, boolean z17) {
        java.util.ArrayList arrayList;
        java.lang.Object obj;
        java.lang.String str;
        r45.cj1 cj1Var;
        r45.kv1 kv1Var;
        java.util.LinkedList m75941xfb821914;
        r45.cj1 cj1Var2;
        r45.ir1 ir1Var;
        java.util.LinkedList m75941xfb8219142;
        r45.cj1 cj1Var3;
        boolean z18 = false;
        java.lang.Object obj2 = null;
        java.lang.String m75945x2fec8307 = (l1Var == null || (cj1Var3 = l1Var.f197125g) == null) ? null : cj1Var3.m75945x2fec8307(0);
        r45.xv1 xv1Var = l1Var != null ? l1Var.f197136u : null;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l1Var != null ? l1Var.f197129n : null, "PRECIOUS_GIFT_SCHEDULE_AS_ATTACH_GIFT")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "showFullScreenPreciousGift giftId:" + m75945x2fec8307 + " PRECIOUS_GIFT_SCHEDULE_AS_ATTACH_GIFT mode. ignore");
            return;
        }
        java.util.List list = ((mm2.o4) P0(mm2.o4.class)).f410860v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-audienceLinkMicUserList>(...)");
        synchronized (list) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj3 : list) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) obj3).f390722t, java.lang.Boolean.TRUE)) {
                    arrayList.add(obj3);
                }
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((km2.q) obj).f390705c, l1Var != null ? l1Var.f197134s : null)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        boolean z19 = obj != null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showFullScreenPreciousGift giftId:");
        sb6.append(m75945x2fec8307);
        sb6.append(" targetUsername:");
        sb6.append(l1Var != null ? l1Var.f197134s : null);
        sb6.append(" curPkUser:");
        km2.q l76 = ((mm2.o4) P0(mm2.o4.class)).l7();
        sb6.append(l76 != null ? l76.f390705c : null);
        sb6.append(" randomItem:");
        sb6.append((xv1Var == null || (m75941xfb8219142 = xv1Var.m75941xfb821914(1)) == null) ? null : java.lang.Integer.valueOf(m75941xfb8219142.size()));
        sb6.append(" isOtherRoom:");
        sb6.append(z19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", sb6.toString());
        java.util.List list2 = ((mm2.o4) P0(mm2.o4.class)).f410857s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "<get-anchorPkMicUserList>(...)");
        synchronized (list2) {
            java.util.Iterator it6 = list2.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                java.lang.Object next = it6.next();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(l1Var != null ? l1Var.f197134s : null, ((km2.q) next).f390705c)) {
                    obj2 = next;
                    break;
                }
            }
        }
        if (obj2 != null || z19) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("PARAM_LIVE_GIFT_INFO_Id", m75945x2fec8307);
        if (l1Var == null || (str = l1Var.f197126h) == null) {
            str = "";
        }
        bundle.putString("PARAM_LIVE_GIFT_COMBO_ID", str);
        bundle.putInt("PARAM_LIVE_GIFT_GESTURE_ID", (l1Var == null || (cj1Var2 = l1Var.f197125g) == null || (ir1Var = (r45.ir1) cj1Var2.m75936x14adae67(7)) == null) ? 0 : ir1Var.m75939xb282bd08(0));
        bundle.putBoolean("PARAM_LIVE_GIFT_IS_FORCE_REPLACE", z17);
        bundle.putBoolean("PARAM_LIVE_GIFT_IS_FROM_SELF", l1Var != null ? l1Var.f197132q : false);
        if (xv1Var != null && (m75941xfb821914 = xv1Var.m75941xfb821914(1)) != null && (!m75941xfb821914.isEmpty())) {
            z18 = true;
        }
        if (z18) {
            bundle.putByteArray("PARAM_LIVE_GIFT_RANDOM_ITEM", xv1Var.mo14344x5f01b1f6());
        }
        if (l1Var != null && (cj1Var = l1Var.f197125g) != null && (kv1Var = (r45.kv1) cj1Var.m75936x14adae67(3)) != null) {
            bundle.putByteArray("PARAM_LIVE_GIFT_INFO", kv1Var.mo14344x5f01b1f6());
        }
        this.f193448p.mo46557x60d69242(qo0.b.U1, bundle);
    }

    public final void R1(boolean z17) {
        jz5.f0 f0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "stopCurrentPreciousGift");
        java.util.Map.Entry D1 = D1();
        if (D1 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) D1.getValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "stopCurrentPreciousGift isFromBatchSend:" + tnVar.f195976j + ", comboSumCount:" + tnVar.f195975i + ",comboId:" + tnVar.f195974h);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.o1 o1Var = this.f193449q;
            java.lang.String str = tnVar.f195974h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1 j1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1) o1Var;
            if (str == null) {
                j1Var.getClass();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j1Var.f197111k, "addSkipComboId:".concat(str));
                j1Var.f197108h.add(str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j1Var.f197111k, "remove comboId:".concat(str));
                synchronized (j1Var.f197102b) {
                    pm0.v.d0(j1Var.f197101a, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.i1(str));
                }
            }
            T1(D1);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "[stopCurrentPreciousGift] findCurrentShowingPreciousGift = null, forceHideGift = " + z17);
            if (z17) {
                qo0.c.a(this.f193448p, qo0.b.X1, null, 2, null);
            }
        }
    }

    public final void T1(java.util.Map.Entry entry) {
        java.util.Map.Entry D1 = entry == null ? D1() : entry;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "stopPreciousGift entry:" + entry + ", realEntry:" + D1);
        if (D1 != null) {
            qo0.c.a(this.f193448p, qo0.b.X1, null, 2, null);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) D1.getValue()).f195983q = 0L;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) D1.getValue()).f195984r = 0L;
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) D1.getValue()).f195989w) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "checkIfPreciousGiftTimeOver: fake container");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) D1.getValue()).f195970d.getAndSet(false);
                I1();
            } else {
                if (this.f193447J) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "checkIfPreciousGiftTimeOver: preciousGiftBulletOutHandlerProcessing is true, skip");
                    return;
                }
                this.f193447J = true;
                android.os.Message mo50288x733c63a2 = this.I.mo50288x733c63a2();
                mo50288x733c63a2.obj = D1.getKey();
                this.I.mo50311x7ab51103(mo50288x733c63a2, 2000L);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "checkIfPreciousGiftTimeOver: handler msg.obj = " + mo50288x733c63a2.obj);
            }
        }
    }

    public final void U1(android.view.ViewGroup viewGroup) {
        java.util.Map map = this.A;
        if (map.containsKey(viewGroup)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) map.get(viewGroup);
            u1(tnVar);
            if (tnVar != null) {
                tnVar.f195990x.removeAllListeners();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "unregisterOuterSpace: info:" + tnVar);
            map.remove(viewGroup);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.B;
            android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) concurrentHashMap.get(viewGroup);
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
            }
            concurrentHashMap.remove(viewGroup);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) this.C;
            android.animation.ValueAnimator valueAnimator2 = (android.animation.ValueAnimator) concurrentHashMap2.get(viewGroup);
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllListeners();
            }
            concurrentHashMap2.remove(viewGroup);
            this.f193450r.removeView(viewGroup);
            if (map.size() == this.f193458z) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "unregisterOuterSpace: enable origin three container");
                C1(this.f193454v);
                C1(this.f193455w);
                C1(this.f193456x);
                M1(8);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W1(java.lang.String r12, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn r13, int r14, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 r15) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap.W1(java.lang.String, com.tencent.mm.plugin.finder.live.plugin.tn, int, com.tencent.mm.plugin.finder.live.util.l1):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    public final void t1() {
        java.util.Map.Entry entry;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 l1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1 j1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1) this.f193449q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m1 d17 = j1Var.d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "[checkIfGiftForceReplace] nextType:" + d17);
        if (d17 == null || d17.compareTo(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m1.f197155g) > 0 || (entry = (java.util.Map.Entry) q26.h0.l(q26.h0.v(q26.h0.i(kz5.e1.u(this.A), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yn.f196752d), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zn.f196896d))) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "[checkIfGiftForceReplace] entry:" + entry.getValue());
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) entry.getKey();
        synchronized (j1Var.f197102b) {
            l1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1) j1Var.f197101a.pollFirst();
        }
        K1(viewGroup, l1Var);
    }

    public final void u1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar) {
        java.lang.Object obj;
        if (tnVar != null && tnVar.f195970d.get() && tnVar.f195972f.get() && !tnVar.f195989w && tnVar.f195972f.get()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "cloneToFakeContainer: origin info = " + tnVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) this.A.get(this.f193457y);
            if (tnVar2 != null) {
                tnVar2.f195983q = tnVar.f195983q;
                tnVar2.f195984r = tnVar.f195984r;
                tnVar2.f195970d.getAndSet(true);
                if (this.H.e()) {
                    java.util.Iterator mo144672x467c086e = ((kz5.k0) kz5.n0.J(this.A.entrySet())).mo144672x467c086e();
                    while (true) {
                        if (!mo144672x467c086e.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = mo144672x467c086e.next();
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((java.util.Map.Entry) obj).getKey(), this.f193457y)) {
                                break;
                            }
                        }
                    }
                    w1((java.util.Map.Entry) obj);
                }
            }
        }
    }

    public final boolean v1(java.util.Map.Entry entry) {
        if (entry == null || !((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) entry.getValue()).f195970d.get() || ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) entry.getValue()).f195973g || ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) entry.getValue()).f195972f.get()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkIfOuterSpacePreciousGiftForceReplace: entry fail, ");
            sb6.append(entry != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) entry.getValue() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", sb6.toString());
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1) this.f193449q).i(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) entry.getValue()).f195987u);
        if (i17 == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(i17.f197129n, "PRECIOUS_GIFT_SCHEDULE_NONE")) {
            return false;
        }
        K1((android.view.ViewGroup) entry.getKey(), i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1 j1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1) this.f193449q;
        j1Var.getClass();
        synchronized (j1Var.f197102b) {
            j1Var.f197101a.remove(i17);
        }
        return true;
    }

    public final boolean w1(java.util.Map.Entry entry) {
        if (entry == null) {
            entry = D1();
        }
        if (entry == null) {
            return false;
        }
        long c17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) entry.getValue()).f195983q - (c01.id.c() - ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) entry.getValue()).f195984r);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "checkIfPreciousGiftTimeOver: remainingTime=" + c17 + ", entry=" + entry);
        if (c17 > 100) {
            this.H.c(c17, c17);
            return true;
        }
        T1(entry);
        return false;
    }

    public final void x1() {
        java.util.Map map = this.A;
        android.widget.RelativeLayout relativeLayout = this.f193454v;
        if (map.get(relativeLayout) == null) {
            android.widget.RelativeLayout relativeLayout2 = this.f193454v;
            map.put(relativeLayout2, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn(this, relativeLayout2, 0, this.f193451s, false, false, false, 0, 120, null));
            java.util.Map map2 = this.B;
            android.widget.RelativeLayout relativeLayout3 = this.f193454v;
            android.animation.ValueAnimator z17 = z1(this, relativeLayout3, false, null, 6, null);
            z17.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ko(this, relativeLayout, z17, false));
            ((java.util.concurrent.ConcurrentHashMap) map2).put(relativeLayout3, z17);
            java.util.Map map3 = this.C;
            android.animation.ValueAnimator A1 = A1(relativeLayout, false);
            A1.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mo(this, relativeLayout));
            ((java.util.concurrent.ConcurrentHashMap) map3).put(relativeLayout, A1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "checkRecoverContainerOne restart register containerOne");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k1
    public void y() {
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ho(this));
        I1();
    }

    public final android.animation.ValueAnimator y1(android.view.ViewGroup viewGroup, boolean z17, android.animation.ValueAnimator valueAnimator) {
        if (valueAnimator == null) {
            valueAnimator = z17 ? android.animation.ObjectAnimator.ofFloat(viewGroup, "alpha", 0.0f, 1.0f) : android.animation.ObjectAnimator.ofFloat(viewGroup, "translationX", -500.0f, 0.0f);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(valueAnimator, "run(...)");
        }
        int i17 = N;
        valueAnimator.setDuration(i17 + 500);
        if (z17) {
            valueAnimator.setInterpolator(new android.view.animation.DecelerateInterpolator());
            valueAnimator.setEvaluator(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mn(500, i17, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ao(this, viewGroup)));
        } else {
            valueAnimator.setInterpolator(new android.view.animation.DecelerateInterpolator());
            valueAnimator.setEvaluator(new cn2.m(500, i17, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bo(this, viewGroup)));
        }
        return valueAnimator;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "mount");
        super.z0();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1) this.f193449q).l(this);
        java.util.Map map = this.A;
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar : map.values()) {
            tnVar.getClass();
            tnVar.f195990x.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nn(tnVar));
        }
        for (java.util.Map.Entry entry : ((java.util.concurrent.ConcurrentHashMap) this.B).entrySet()) {
            android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) entry.getValue();
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) entry.getKey();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn) map.get(entry.getKey());
            boolean z17 = tnVar2 != null ? tnVar2.f195969c : false;
            if (valueAnimator != null) {
                valueAnimator.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ko(this, viewGroup, valueAnimator, z17));
            }
        }
        for (java.util.Map.Entry entry2 : ((java.util.concurrent.ConcurrentHashMap) this.C).entrySet()) {
            android.animation.ValueAnimator valueAnimator2 = (android.animation.ValueAnimator) entry2.getValue();
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) entry2.getKey();
            if (valueAnimator2 != null) {
                valueAnimator2.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mo(this, viewGroup2));
            }
        }
        pm0.v.w(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fo(this));
        ((je2.t) P0(je2.t.class)).f380797g.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.go(this));
    }

    public /* synthetic */ ap(android.view.ViewGroup viewGroup, qo0.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.o1 o1Var, android.view.ViewGroup viewGroup2, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(viewGroup, cVar, o1Var, viewGroup2, (i17 & 16) != 0 ? false : z17);
    }
}
