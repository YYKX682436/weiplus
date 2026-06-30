package bg2;

/* loaded from: classes3.dex */
public final class x0 extends tc2.c implements tc2.h, cg2.l, uc2.b {
    public final double A;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f102146e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.FrameLayout f102147f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f102148g;

    /* renamed from: h, reason: collision with root package name */
    public cg2.k f102149h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f102150i;

    /* renamed from: m, reason: collision with root package name */
    public we2.p f102151m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f102152n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f102153o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f102154p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f102155q;

    /* renamed from: r, reason: collision with root package name */
    public int f102156r;

    /* renamed from: s, reason: collision with root package name */
    public final int f102157s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Integer f102158t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f102159u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f102160v;

    /* renamed from: w, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f102161w;

    /* renamed from: x, reason: collision with root package name */
    public long f102162x;

    /* renamed from: y, reason: collision with root package name */
    public final double f102163y;

    /* renamed from: z, reason: collision with root package name */
    public final double f102164z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(tc2.g store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f102146e = "LiveConvertDanmakuController";
        this.f102157s = 3;
        this.f102159u = java.util.Collections.synchronizedList(new java.util.LinkedList());
        this.f102160v = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f102163y = 2.57309942E-4d;
        this.f102164z = 0.00140350877d;
        this.A = 0.286549708d;
    }

    @Override // tc2.h
    public void H0(r45.r71 resp) {
        java.util.ArrayList<r45.ch1> arrayList;
        java.util.ArrayList<r45.t12> arrayList2;
        java.lang.String str;
        cg2.k kVar;
        cg2.p bulletManager;
        java.lang.String m75945x2fec8307;
        int[] iArr;
        int[] iArr2;
        cg2.k kVar2;
        cg2.p bulletManager2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        if (this.f102152n) {
            r45.nn0 nn0Var = (r45.nn0) resp.m75936x14adae67(48);
            if (nn0Var != null) {
                c7(java.lang.Boolean.valueOf(nn0Var.m75933x41a8a7f2(0)), java.lang.Boolean.valueOf(nn0Var.m75933x41a8a7f2(1)));
                r45.qx3 qx3Var = (r45.qx3) nn0Var.m75936x14adae67(3);
                if (qx3Var != null && (kVar2 = this.f102149h) != null && (bulletManager2 = kVar2.getBulletManager()) != null) {
                    bulletManager2.f122653h = qx3Var;
                    cg2.w wVar = bulletManager2.f122652g;
                    if (wVar != null) {
                        long m75939xb282bd08 = qx3Var.m75939xb282bd08(0);
                        long m75939xb282bd082 = qx3Var.m75939xb282bd08(1);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveFeedCenterDanmakuRender", "[updateAnimateDuration] " + m75939xb282bd08 + ", " + m75939xb282bd082);
                        wVar.f122676b = m75939xb282bd08;
                        wVar.f122677c = m75939xb282bd082;
                    }
                }
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList m75941xfb821914 = resp.m75941xfb821914(14);
            if (m75941xfb821914 != null) {
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : m75941xfb821914) {
                    r45.ch1 ch1Var = (r45.ch1) obj;
                    we2.p pVar = this.f102151m;
                    if (pVar == null || (iArr2 = pVar.f()) == null) {
                        iArr2 = new int[0];
                    }
                    if (kz5.z.F(iArr2, ch1Var.m75939xb282bd08(1))) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            if (!(arrayList != null && (arrayList.isEmpty() ^ true))) {
                arrayList = null;
            }
            if (arrayList != null) {
                for (r45.ch1 ch1Var2 : arrayList) {
                    we2.p pVar2 = this.f102151m;
                    if (pVar2 != null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ch1Var2);
                        dk2.zf b17 = pVar2.b(ch1Var2);
                        if (b17 != null) {
                            if (!Y6(b17)) {
                                b17 = null;
                            }
                            if (b17 != null) {
                                linkedList.add(b17);
                            }
                        }
                    }
                }
            }
            java.util.LinkedList m75941xfb8219142 = resp.m75941xfb821914(14);
            if (m75941xfb8219142 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.m0.a(m75941xfb8219142).removeAll(linkedList);
            }
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.LinkedList m75941xfb8219143 = resp.m75941xfb821914(2);
            if (m75941xfb8219143 != null) {
                arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : m75941xfb8219143) {
                    r45.t12 t12Var = (r45.t12) obj2;
                    we2.p pVar3 = this.f102151m;
                    if (pVar3 == null || (iArr = pVar3.f()) == null) {
                        iArr = new int[0];
                    }
                    if (kz5.z.F(iArr, t12Var.m75939xb282bd08(3))) {
                        arrayList2.add(obj2);
                    }
                }
            } else {
                arrayList2 = null;
            }
            if (!(arrayList2 != null && (arrayList2.isEmpty() ^ true))) {
                arrayList2 = null;
            }
            if (arrayList2 != null) {
                for (r45.t12 t12Var2 : arrayList2) {
                    we2.p pVar4 = this.f102151m;
                    if (pVar4 != null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t12Var2);
                        dk2.zf c17 = pVar4.c(t12Var2);
                        if (c17 != null) {
                            if (!Y6(c17)) {
                                c17 = null;
                            }
                            if (c17 != null) {
                                linkedList2.add(c17);
                            }
                        }
                    }
                }
            }
            java.util.LinkedList m75941xfb8219144 = resp.m75941xfb821914(2);
            if (m75941xfb8219144 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.m0.a(m75941xfb8219144).removeAll(linkedList2);
            }
            java.util.LinkedList m75941xfb8219145 = resp.m75941xfb821914(14);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219145, "getApp_msg_list(...)");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj3 : m75941xfb8219145) {
                if (((r45.ch1) obj3).m75939xb282bd08(1) == 20082) {
                    arrayList3.add(obj3);
                }
            }
            java.util.Iterator it = arrayList3.iterator();
            r45.ai1 ai1Var = null;
            while (true) {
                boolean hasNext = it.hasNext();
                str = this.f102146e;
                if (!hasNext) {
                    break;
                }
                r45.ch1 ch1Var3 = (r45.ch1) it.next();
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ch1Var3.m75934xbce7f2f(4);
                if (m75934xbce7f2f != null && (m75945x2fec8307 = ch1Var3.m75945x2fec8307(2)) != null) {
                    r45.ai1 ai1Var2 = new r45.ai1();
                    ai1Var2.mo11468x92b714fd(m75934xbce7f2f.g());
                    if ((ai1Var != null ? ai1Var.m75939xb282bd08(0) : 0) < ai1Var2.m75939xb282bd08(0)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "received hot word app msg: " + ai1Var2.m75945x2fec8307(1) + ", clientMsgId:" + m75945x2fec8307);
                        ai1Var = ai1Var2;
                    }
                }
            }
            if (ai1Var != null && (kVar = this.f102149h) != null && (bulletManager = kVar.getBulletManager()) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveBulletManager", "addHotWordDanmaku " + ai1Var);
                wp.a f57 = bulletManager.a().f5(-2147483646, ai1Var);
                f57.f529868f = c01.id.c();
                f57.f529881s = true;
                f57.w(new zp.h(bulletManager.f122653h != null ? r10.m75939xb282bd08(2) : 4000));
                bulletManager.a().f520385d.k1(kz5.b0.c(f57), false, false);
            }
            linkedList.addAll(linkedList2);
            kz5.g0.t(linkedList, new bg2.v0());
            if ((linkedList.isEmpty() ^ true ? linkedList : null) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[dealWithMsgList] size = " + linkedList.size() + ", isHistoryMsg = " + resp.m75939xb282bd08(22));
                this.f102160v.addAll(linkedList);
                if (this.f102161w == null || (!((p3325xe03a0797.p3326xc267989b.a) r14).a())) {
                    p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f102161w;
                    if (r2Var != null) {
                        p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                    }
                    p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f498674d.f498680g;
                    this.f102161w = y0Var != null ? p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new bg2.w0(this, null), 3, null) : null;
                }
            }
        }
    }

    @Override // tc2.c
    public void Q6() {
        r45.kz3 kz3Var;
        r45.ah6 ah6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 m59240x7c94657b;
        r45.kr0 d17;
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f498674d.f498681h;
        if (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || (m59240x7c94657b = feedObject.m59240x7c94657b()) == null || (d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.d(m59240x7c94657b)) == null || (m75941xfb821914 = d17.m75941xfb821914(12)) == null) {
            kz3Var = null;
        } else {
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((r45.kz3) obj).m75939xb282bd08(0) == 22) {
                        break;
                    }
                }
            }
            kz3Var = (r45.kz3) obj;
        }
        this.f102158t = (kz3Var == null || (ah6Var = (r45.ah6) kz3Var.m75936x14adae67(13)) == null) ? null : java.lang.Integer.valueOf(ah6Var.m75939xb282bd08(2));
        boolean booleanValue = ((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.G7).mo141623x754a37bb()).r()).booleanValue();
        boolean z17 = kz3Var != null || booleanValue;
        java.lang.Object r17 = ((lb2.j) ((jz5.n) ae2.in.V7).mo141623x754a37bb()).r();
        java.lang.Integer num = (java.lang.Integer) (((java.lang.Number) r17).intValue() > 0 ? r17 : null);
        if (num != null) {
            this.f102158t = java.lang.Integer.valueOf(num.intValue() * 1000);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("svr = ");
        sb6.append(kz3Var != null);
        sb6.append(", local = ");
        sb6.append(booleanValue);
        sb6.append(", rowCount=");
        sb6.append(this.f102157s);
        sb6.append(", danmakuDuration=");
        sb6.append(this.f102158t);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f102146e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        this.f102152n = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[isExptOn] = " + this.f102152n);
        if (this.f102152n && this.f102154p && this.f102153o) {
            a7();
        }
    }

    @Override // tc2.c
    public void U6() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        r45.nw1 m59258xd0557130;
        android.content.Context context;
        zy2.ra Sj;
        b7();
        if (this.f102152n) {
            tc2.g gVar = this.f498674d;
            in5.s0 s0Var = gVar.f498682i;
            r45.qt2 V6 = (s0Var == null || (context = s0Var.f374654e) == null || (Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context)) == null) ? null : ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) Sj).V6();
            in5.s0 s0Var2 = gVar.f498682i;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 r0Var = s0Var2 != null ? (so2.j5) s0Var2.f374658i : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = r0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) r0Var : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3 v3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3.f184154a;
            ml2.u1 u1Var = ml2.u1.f409578f3;
            jz5.l[] lVarArr = new jz5.l[2];
            if (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || (m59258xd0557130 = feedObject.m59258xd0557130()) == null || (str = java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)).toString()) == null) {
                str = "";
            }
            lVarArr[0] = new jz5.l("liveid", str);
            lVarArr[1] = new jz5.l("barrage_count", java.lang.String.valueOf(this.f102156r));
            v3Var.c(V6, u1Var, kz5.c1.i(lVarArr));
        }
        this.f102152n = false;
        this.f102156r = 0;
    }

    @Override // tc2.c
    public void X6() {
        this.f102159u.clear();
    }

    public final boolean Y6(dk2.zf zfVar) {
        java.lang.Object obj;
        java.util.List exposedMsgIdList = this.f102159u;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(exposedMsgIdList, "exposedMsgIdList");
        synchronized (exposedMsgIdList) {
            java.util.Iterator it = exposedMsgIdList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(zfVar.v(), (java.lang.String) obj)) {
                    break;
                }
            }
        }
        if (obj != null) {
            return false;
        }
        int mo124533xfb85f7b0 = zfVar.mo124533xfb85f7b0();
        if (mo124533xfb85f7b0 != 1) {
            return mo124533xfb85f7b0 == 20013 || mo124533xfb85f7b0 == 20113;
        }
        java.lang.String j17 = zfVar.j();
        int length = j17 != null ? j17.length() : 0;
        return 1 <= length && length < 21;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r1 == null) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Z6(dk2.zf r18) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.x0.Z6(dk2.zf):void");
    }

    public final void a7() {
        cg2.p bulletManager;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        cg2.k c14213xf761cd01;
        if (this.f102155q) {
            return;
        }
        this.f102155q = true;
        if (this.f102149h != null) {
            return;
        }
        tc2.g gVar = this.f498674d;
        in5.s0 s0Var = gVar.f498682i;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = null;
        if (s0Var != null) {
            android.widget.FrameLayout frameLayout = this.f102148g;
            if (frameLayout == null) {
                frameLayout = (android.widget.FrameLayout) s0Var.p(com.p314xaae8f345.mm.R.id.uah);
            }
            this.f102147f = frameLayout;
            this.f102150i = new android.view.View(s0Var.f374654e);
            android.widget.FrameLayout frameLayout2 = this.f102147f;
            if (frameLayout2 != null) {
                frameLayout2.removeAllViews();
            }
            int i17 = cg2.j.f122642a;
            android.view.View itemView = s0Var.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            if (cg2.j.f122642a == 1) {
                android.content.Context context = itemView.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                c14213xf761cd01 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1493x38b81db3.p1495x55b6590f.C14212x6310f49b(context);
            } else {
                android.content.Context context2 = itemView.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                c14213xf761cd01 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1493x38b81db3.p1495x55b6590f.C14213xf761cd01(context2);
            }
            this.f102149h = c14213xf761cd01;
            android.widget.FrameLayout frameLayout3 = this.f102147f;
            if (frameLayout3 != null) {
                frameLayout3.addView(this.f102150i, new android.widget.FrameLayout.LayoutParams(-1, 1));
            }
            android.widget.FrameLayout frameLayout4 = this.f102147f;
            if (frameLayout4 != null) {
                frameLayout4.addView(c14213xf761cd01.mo14785xfb86a31b(), new android.widget.FrameLayout.LayoutParams(-1, -1));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = gVar.f498681h;
            so2.h1 h1Var = abstractC14490x69736cb5 instanceof so2.h1 ? (so2.h1) abstractC14490x69736cb5 : null;
            if (h1Var != null) {
                c14213xf761cd01.e(h1Var);
            }
            cg2.p bulletManager2 = c14213xf761cd01.getBulletManager();
            bg2.p0 p0Var = new bg2.p0(this);
            bulletManager2.getClass();
            cg2.c0 c0Var = bulletManager2.f122651f;
            if (c0Var != null) {
                c0Var.f122628c = p0Var;
            }
            c14213xf761cd01.getBulletManager().f122650e = new bg2.s0(this, s0Var);
            c14213xf761cd01.mo14786x3b13c504();
            c14213xf761cd01.getBulletManager().d(this.f102157s, this.f102148g == null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = gVar.f498681h;
        if (abstractC14490x69736cb52 != null && (feedObject = abstractC14490x69736cb52.getFeedObject()) != null) {
            c19792x256d2725 = feedObject.m59240x7c94657b();
        }
        we2.p pVar = new we2.p();
        pVar.g(new bg2.t0(c19792x256d2725, this));
        this.f102151m = pVar;
        cg2.k kVar = this.f102149h;
        if (kVar == null || (bulletManager = kVar.getBulletManager()) == null) {
            return;
        }
        we2.p pVar2 = this.f102151m;
        bulletManager.f122654i = pVar2;
        cg2.c0 c0Var2 = bulletManager.f122651f;
        if (c0Var2 != null) {
            c0Var2.f122627b = pVar2;
        }
    }

    public final void b7() {
        if (this.f102155q) {
            this.f102155q = false;
            cg2.k kVar = this.f102149h;
            if (kVar != null) {
                kVar.mo14787x3f5eee52();
            }
            this.f102149h = null;
            android.widget.FrameLayout frameLayout = this.f102147f;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f102161w;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            this.f102161w = null;
        }
    }

    public final void c7(java.lang.Boolean bool, java.lang.Boolean bool2) {
        boolean booleanValue;
        boolean booleanValue2;
        if (this.f102152n) {
            java.lang.String str = this.f102146e;
            if (bool != null && this.f102154p != (booleanValue2 = bool.booleanValue())) {
                this.f102154p = booleanValue2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[updateDanmakuConfig] user: " + booleanValue2);
            }
            if (bool2 != null && this.f102153o != (booleanValue = bool2.booleanValue())) {
                this.f102153o = booleanValue;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[updateDanmakuConfig] sys: " + booleanValue);
            }
            tc2.g gVar = this.f498674d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = gVar.f498681h;
            if (abstractC14490x69736cb5 != null) {
                abstractC14490x69736cb5.S1(this.f102152n && this.f102153o);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = gVar.f498681h;
            if (abstractC14490x69736cb52 != null) {
                abstractC14490x69736cb52.d2(this.f102154p);
            }
            if (this.f102152n && this.f102153o && this.f102154p) {
                a7();
            } else {
                b7();
            }
        }
    }
}
