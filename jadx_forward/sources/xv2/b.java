package xv2;

/* loaded from: classes10.dex */
public final class b extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f538927h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f538928i;

    /* renamed from: m, reason: collision with root package name */
    public pv2.g f538929m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1646xce040e01.p1647x7817babe.p1651x898d3be2.C15166x9adf15f7 f538930n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f538931o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.tencent.mm.plugin.finder.upload.postlogic.newlifestage.NewLifeMediaProcessStage$feedDeleteListener$1] */
    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderObj) {
        super(java.lang.String.valueOf(finderObj.m59260x51f8f5b0()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObj, "finderObj");
        this.f538927h = finderObj;
        this.f538929m = new tv2.x(finderObj, 2);
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f538930n = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11>(a0Var) { // from class: com.tencent.mm.plugin.finder.upload.postlogic.newlifestage.NewLifeMediaProcessStage$feedDeleteListener$1
            {
                this.f39173x3fe91575 = -108499199;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11 c5437xe8b43b11) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11 event = c5437xe8b43b11;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                xv2.b bVar = xv2.b.this;
                long j17 = event.f135780g.f87971b;
                if (j17 != 0 && j17 == bVar.f538927h.m59260x51f8f5b0()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewLife.LogPost.NewLifeMediaProcessStage", "feedDeleteListener localId:" + event.f135780g.f87971b);
                    if (!cu2.u.f303974a.k(bVar.f538927h.m59260x51f8f5b0())) {
                        bVar.f538928i = true;
                        java.util.List list = bVar.f538931o;
                        if (list != null) {
                            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                            while (it.hasNext()) {
                                wu5.c cVar = (wu5.c) it.next();
                                if (!cVar.isDone()) {
                                    cVar.cancel(false);
                                }
                            }
                        }
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = bVar.f538927h.f66946x284ddcb8;
                        if (c19783xd9a946b7 != null) {
                            c19783xd9a946b7.m76447x75f6f6ad(200);
                        }
                    }
                }
                return false;
            }
        };
    }

    @Override // pv2.g
    public int a() {
        return 2;
    }

    @Override // pv2.m
    public void d(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
        boolean m59314x4d5c4d55 = this.f538927h.m59314x4d5c4d55();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(1253L, 20L, 1L);
        if (m59314x4d5c4d55) {
            if ((1253 == 1253 ? 1523L : 0L) > 0) {
                g0Var.C(1253 == 1253 ? 1523L : 0L, 20L, 1L);
            }
        }
    }

    @Override // pv2.m
    public void e(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
    }

    @Override // pv2.m
    public void f(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
        boolean m59314x4d5c4d55 = this.f538927h.m59314x4d5c4d55();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(1253L, 20L, 1L);
        if (m59314x4d5c4d55) {
            if ((1253 == 1253 ? 1523L : 0L) > 0) {
                g0Var.C(1253 == 1253 ? 1523L : 0L, 20L, 1L);
            }
        }
    }

    @Override // ov2.e
    public pv2.g j() {
        java.lang.Object m143895xf1229813;
        r45.q23 m76980xaa7f977e;
        r45.ko6 ko6Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start localId:");
        sb6.append(this.f538927h.m59260x51f8f5b0());
        sb6.append(" checkSum:");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = this.f538927h.getFeedObject().m76802x2dd01666();
        sb6.append((m76802x2dd01666 == null || (m76980xaa7f977e = m76802x2dd01666.m76980xaa7f977e()) == null || (ko6Var = m76980xaa7f977e.f465134w) == null) ? null : ko6Var.f460417i);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewLife.LogPost.NewLifeMediaProcessStage", sb6.toString());
        mo48813x58998cd();
        this.f538927h.m59433x2b7e608b("mediaProcess");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = this.f538927h.f66946x284ddcb8;
        if (c19783xd9a946b7 != null) {
            c19783xd9a946b7.m76425xd27acffc(2);
        }
        if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.d1().r()).intValue() == 1) {
            tv2.x xVar = new tv2.x(this.f538927h, 2);
            mo48814x2efc64();
            this.f538929m = xVar;
            return xVar;
        }
        int i17 = (int) (45 * 1.0f);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("feed ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f538927h;
        sb7.append(c14994x9b99c079.m59260x51f8f5b0());
        sb7.append(" updateProgress  1.0, ");
        sb7.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewLife.LogPost.NewLifeMediaProcessStage", sb7.toString());
        if (c14994x9b99c079.m59277xa8f45ee4().m75939xb282bd08(4) < i17) {
            c14994x9b99c079.m59277xa8f45ee4().set(4, java.lang.Integer.valueOf(i17));
            cu2.u.f303974a.l(c14994x9b99c079);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f c5442xd807898f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f();
        long m59260x51f8f5b0 = c14994x9b99c079.m59260x51f8f5b0();
        am.ga gaVar = c5442xd807898f.f135783g;
        gaVar.f88282a = m59260x51f8f5b0;
        gaVar.f88283b = c14994x9b99c079.m59277xa8f45ee4().m75939xb282bd08(4);
        c5442xd807898f.e();
        if (this.f538927h.getMediaType() == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderObj = this.f538927h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObj, "finderObj");
            int i18 = 0;
            if (finderObj.getMediaType() == 2 && finderObj.m59322x4b694432()) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                java.util.LinkedList<r45.mb4> m59264x7efe73ec = this.f538927h.m59264x7efe73ec();
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m59264x7efe73ec, 10));
                java.util.Iterator<T> it = m59264x7efe73ec.iterator();
                while (it.hasNext()) {
                    arrayList.add(new xv2.a(this.f538927h, (r45.mb4) it.next()));
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    java.lang.Object next = it6.next();
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewLife.LogPost.NewLifeMediaProcessStage", "[finderpost]:dealWxamCompress ThreadPool.INSTANCE.execute:" + i18);
                    arrayList2.add(((ku5.t0) ku5.t0.f394148d).h((xv2.a) next, "NewLife.LogPost.NewLifeMediaProcessStage_" + (i18 % 3)));
                    i18 = i19;
                }
                this.f538931o = arrayList2;
                java.util.Iterator it7 = arrayList2.iterator();
                while (it7.hasNext()) {
                    wu5.c cVar = (wu5.c) it7.next();
                    try {
                        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(cVar.get());
                    } catch (java.lang.Throwable th6) {
                        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                    }
                    p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813);
                }
                this.f538931o = null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewLife.LogPost.NewLifeMediaProcessStage", "[finderpost]:dealWxamCompress all success! cost:[" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " ms]");
            }
        }
        if (this.f538928i) {
            tv2.x xVar2 = new tv2.x(this.f538927h, 1);
            mo48814x2efc64();
            this.f538929m = xVar2;
        } else {
            xv2.j jVar = new xv2.j(this.f538927h);
            mo48814x2efc64();
            this.f538929m = jVar;
        }
        return this.f538929m;
    }
}
