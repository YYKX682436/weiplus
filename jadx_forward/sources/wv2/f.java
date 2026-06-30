package wv2;

/* loaded from: classes10.dex */
public final class f extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f531538h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f531539i;

    /* renamed from: m, reason: collision with root package name */
    public pv2.g f531540m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f531541n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashSet f531542o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f531543p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.u0 f531544q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderObj) {
        super(java.lang.String.valueOf(finderObj.m59260x51f8f5b0()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObj, "finderObj");
        this.f531538h = finderObj;
        this.f531539i = "LogPost.MvPostCgiStage";
        this.f531540m = new wv2.n(finderObj, 2);
        this.f531541n = new java.util.concurrent.CountDownLatch(1);
        this.f531542o = new java.util.HashSet();
        this.f531544q = new wv2.e(this);
    }

    @Override // pv2.g
    public int a() {
        return 4;
    }

    @Override // pv2.m
    public void d(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
        gm0.j1.d().q(6649, this.f531544q);
    }

    @Override // pv2.m
    public void e(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
        gm0.j1.d().q(6649, this.f531544q);
    }

    @Override // pv2.m
    public void f(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
        gm0.j1.d().q(6649, this.f531544q);
    }

    @Override // ov2.e
    public pv2.g j() {
        java.util.HashSet hashSet;
        java.lang.Object obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start localId:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f531538h;
        sb6.append(c14994x9b99c079.m59260x51f8f5b0());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f531539i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        cu2.t tVar = cu2.u.f303974a;
        if (!tVar.k(c14994x9b99c079.m59260x51f8f5b0())) {
            return new wv2.n(c14994x9b99c079, 1);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "doMvPostScene " + c14994x9b99c079.m59260x51f8f5b0());
        boolean m59314x4d5c4d55 = c14994x9b99c079.m59314x4d5c4d55();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(1253L, 23L, 1L);
        if (m59314x4d5c4d55) {
            g0Var.C(1523L, 23L, 1L);
        }
        c14994x9b99c079.m59433x2b7e608b("doMvPostScene");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = c14994x9b99c079.f66946x284ddcb8;
        if (c19783xd9a946b7 != null) {
            c19783xd9a946b7.m76425xd27acffc(7);
        }
        tVar.n(c14994x9b99c079);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c14994x9b99c079.getFeedObject().m76802x2dd01666();
        r45.ef2 m76971x25b90ced = m76802x2dd01666 != null ? m76802x2dd01666.m76971x25b90ced() : null;
        if (m76971x25b90ced == null) {
            return new wv2.n(c14994x9b99c079, 2);
        }
        gm0.j1.d().a(6649, this.f531544q);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (m76971x25b90ced.m75939xb282bd08(6) == 1) {
            java.util.LinkedList m75941xfb821914 = m76971x25b90ced.m75941xfb821914(5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getOrdered_track_list_flex_clip(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : m75941xfb821914) {
                if (((r45.jf2) obj2).m75942xfb822ef2(2) == 0) {
                    arrayList.add(obj2);
                }
            }
            linkedList.addAll(arrayList);
        } else {
            java.util.LinkedList m75941xfb8219142 = m76971x25b90ced.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getOrderedTrackList(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj3 : m75941xfb8219142) {
                if (((r45.jf2) obj3).m75942xfb822ef2(2) == 0) {
                    arrayList2.add(obj3);
                }
            }
            linkedList.addAll(arrayList2);
        }
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashSet = this.f531542o;
            if (!hasNext) {
                break;
            }
            r45.jf2 jf2Var = (r45.jf2) it.next();
            java.util.Iterator<T> it6 = c14994x9b99c079.m59214x2de915fd().iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it6.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) obj).m59276x6c285d75(), jf2Var.m75945x2fec8307(3))) {
                    break;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0792 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) obj;
            if (c14994x9b99c0792 != null) {
                hashSet.add(new wv2.p(c14994x9b99c0792, jf2Var, null, 4, null));
            }
        }
        if (!hashSet.isEmpty()) {
            java.util.Iterator it7 = hashSet.iterator();
            while (it7.hasNext()) {
                gm0.j1.d().g((wv2.p) it7.next());
            }
        } else {
            k();
        }
        this.f531541n.await();
        return this.f531540m;
    }

    public final void k() {
        cu2.t tVar = cu2.u.f303974a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f531538h;
        boolean k17 = tVar.k(c14994x9b99c079.m59260x51f8f5b0());
        java.util.concurrent.CountDownLatch countDownLatch = this.f531541n;
        if (!k17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f531539i, "post before doScene cancel because feed is deleted");
            this.f531540m = new wv2.n(c14994x9b99c079, 2);
            countDownLatch.countDown();
            return;
        }
        boolean m59314x4d5c4d55 = c14994x9b99c079.m59314x4d5c4d55();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(1253L, 23L, 1L);
        if (m59314x4d5c4d55) {
            g0Var.C(1523L, 23L, 1L);
        }
        c14994x9b99c079.m59433x2b7e608b("doMvPostScene");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = c14994x9b99c079.f66946x284ddcb8;
        if (c19783xd9a946b7 != null) {
            c19783xd9a946b7.m76425xd27acffc(4);
        }
        tVar.n(c14994x9b99c079);
        if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.d1().r()).intValue() != 3) {
            new db2.p2(this.f531538h, null, false, 6, null).l().K(new wv2.d(this));
        } else {
            this.f531540m = new wv2.n(c14994x9b99c079, 2);
            countDownLatch.countDown();
        }
    }
}
