package sv2;

/* loaded from: classes10.dex */
public final class y extends ov2.e implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 f494908h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f494909i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f494910m;

    /* renamed from: n, reason: collision with root package name */
    public pv2.g f494911n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f494912o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashSet f494913p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f494914q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.u0 f494915r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 draftItem) {
        super("draft_" + draftItem.f66236x88be67a1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftItem, "draftItem");
        this.f494908h = draftItem;
        this.f494909i = "LogPost.MvDraftCgiStage";
        this.f494910m = draftItem.t0();
        this.f494911n = new sv2.c(draftItem, 2);
        this.f494912o = new java.util.concurrent.CountDownLatch(1);
        this.f494913p = new java.util.HashSet();
        this.f494915r = new sv2.x(this);
    }

    @Override // pv2.g
    public int a() {
        return 4;
    }

    @Override // pv2.m
    public void d(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
        gm0.j1.d().q(6649, this.f494915r);
    }

    @Override // pv2.m
    public void e(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
        gm0.j1.d().q(6649, this.f494915r);
    }

    @Override // pv2.m
    public void f(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
        gm0.j1.d().q(6649, this.f494915r);
    }

    @Override // ov2.e
    public pv2.g j() {
        java.util.HashSet hashSet;
        java.lang.Object obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start localId:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f494910m;
        sb6.append(c14994x9b99c079.m59260x51f8f5b0());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f494909i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = this.f494908h;
        if (!(((c61.l7) i95.n0.c(c61.l7.class)).Oj().D0(x80Var.f66236x88be67a1) != null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "start but not exist: " + x80Var.f66236x88be67a1);
            return new sv2.c(x80Var, 1);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "doMvPostScene " + x80Var.f66236x88be67a1);
        boolean m59314x4d5c4d55 = c14994x9b99c079.m59314x4d5c4d55();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(1718L, 23L, 1L);
        if (m59314x4d5c4d55) {
            g0Var.C(1719L, 23L, 1L);
        }
        c14994x9b99c079.m59433x2b7e608b("doMvPostScene");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = c14994x9b99c079.f66946x284ddcb8;
        if (c19783xd9a946b7 != null) {
            c19783xd9a946b7.m76425xd27acffc(7);
        }
        java.lang.String m75945x2fec8307 = c14994x9b99c079.m59277xa8f45ee4().m75945x2fec8307(0);
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            c14994x9b99c079.m59277xa8f45ee4().set(0, "FinderLocal_" + java.lang.System.nanoTime());
        }
        cu2.o.f303963a.b(x80Var);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c14994x9b99c079.getFeedObject().m76802x2dd01666();
        r45.ef2 m76971x25b90ced = m76802x2dd01666 != null ? m76802x2dd01666.m76971x25b90ced() : null;
        if (m76971x25b90ced == null) {
            return new sv2.c(x80Var, 2);
        }
        gm0.j1.d().a(6649, this.f494915r);
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
            hashSet = this.f494913p;
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "start clip cgi, size:" + hashSet.size());
            java.util.Iterator it7 = hashSet.iterator();
            while (it7.hasNext()) {
                gm0.j1.d().g((wv2.p) it7.next());
            }
        } else {
            k();
        }
        this.f494912o.await();
        return this.f494911n;
    }

    public final void k() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = this.f494908h;
        boolean z17 = ((c61.l7) i95.n0.c(c61.l7.class)).Oj().D0(x80Var.f66236x88be67a1) != null;
        java.util.concurrent.CountDownLatch countDownLatch = this.f494912o;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f494909i, "post before doScene cancel because feed is deleted " + x80Var.f66236x88be67a1);
            this.f494911n = new sv2.c(x80Var, 2);
            countDownLatch.countDown();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f494910m;
        boolean m59314x4d5c4d55 = c14994x9b99c079.m59314x4d5c4d55();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(1718L, 23L, 1L);
        if (m59314x4d5c4d55) {
            g0Var.C(1719L, 23L, 1L);
        }
        c14994x9b99c079.m59433x2b7e608b("doMvPostScene");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = c14994x9b99c079.f66946x284ddcb8;
        if (c19783xd9a946b7 != null) {
            c19783xd9a946b7.m76425xd27acffc(4);
        }
        cu2.o.f303963a.b(x80Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var2 = this.f494908h;
        java.lang.String m75945x2fec8307 = c14994x9b99c079.m59277xa8f45ee4().m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        wv2.o oVar = new wv2.o(x80Var2, m75945x2fec8307, null, null, 12, null);
        if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.d1().r()).intValue() == 3) {
            this.f494911n = new sv2.c(x80Var, 2);
            countDownLatch.countDown();
        } else {
            gm0.j1.n().f354821b.a(6649, this);
            gm0.j1.d().h(oVar, 0);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof wv2.o) {
            gm0.j1.n().f354821b.q(6649, this);
            wv2.o oVar = (wv2.o) m1Var;
            java.lang.String str2 = oVar.f531568h;
            java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, str2};
            java.lang.String str3 = this.f494909i;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "errType %d, errCode %d, errMsg %s, clientId %s", objArr);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f494910m;
            if (!str2.equals(c14994x9b99c079.m59277xa8f45ee4().m75945x2fec8307(0))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str3, "not my feed!");
                return;
            }
            c14994x9b99c079.m59432x8c9240d6("doPostSceneEnd");
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f531569i.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderPostDraftResponse");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.pp2) fVar).m75936x14adae67(1);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("svrFinderObj id:");
            sb6.append(c19792x256d2725 != null ? java.lang.Long.valueOf(c19792x256d2725.m76784x5db1b11()) : null);
            sb6.append(", localId:");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = this.f494908h;
            sb6.append(x80Var.f66236x88be67a1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb6.toString());
            cu2.o oVar2 = cu2.o.f303963a;
            java.util.concurrent.CountDownLatch countDownLatch = this.f494912o;
            if (i17 != 0 || i18 != 0 || c19792x256d2725 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e0 e0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e0.f206536a;
                e0Var.f(c14994x9b99c079.m59314x4d5c4d55());
                if (((c61.l7) i95.n0.c(c61.l7.class)).Oj().D0(x80Var.f66236x88be67a1) != null) {
                    if (i17 == 4) {
                        x80Var.f66235x52c1d072 = (x80Var.f66235x52c1d072 | 2) & (-2);
                        oVar2.b(x80Var);
                        e0Var.e(c14994x9b99c079.m59314x4d5c4d55());
                    }
                    if ((x80Var.f66235x52c1d072 & 2) != 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a.P(x80Var.f66236x88be67a1, i17, i18);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b0.f206494a.a(x80Var);
                        mv2.f0 f0Var = mv2.f0.f413094a;
                        pm0.v.X(new mv2.t(x80Var.f66236x88be67a1, false));
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "deleted when scene end.");
                }
                this.f494911n = new sv2.c(x80Var, 2);
                countDownLatch.countDown();
                return;
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = c14994x9b99c079.f66946x284ddcb8;
            if (c19783xd9a946b7 != null) {
                c19783xd9a946b7.m76426x5b7df934(c19783xd9a946b7.m76319x2534fe28() + ((int) g()));
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b72 = c14994x9b99c079.f66946x284ddcb8;
            if (c19783xd9a946b72 != null) {
                hc2.p0.b(c19783xd9a946b72, "postSuccess");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b0.f206494a.a(x80Var);
            oVar2.c(x80Var, c19792x256d2725);
            mv2.f0 f0Var2 = mv2.f0.f413094a;
            pm0.v.X(new mv2.u(x80Var.f66236x88be67a1, c19792x256d2725.m76784x5db1b11(), true));
            if (c14994x9b99c079.m59277xa8f45ee4().m75942xfb822ef2(6) > 0) {
                long a17 = c01.id.a() - c14994x9b99c079.m59277xa8f45ee4().m75942xfb822ef2(6);
                boolean m59314x4d5c4d55 = c14994x9b99c079.m59314x4d5c4d55();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f0 f0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f0.f206548a;
                f0Var3.d(1718L, 11L, 1L, m59314x4d5c4d55);
                f0Var3.d(1718L, 12L, a17, m59314x4d5c4d55);
            }
            this.f494911n = new sv2.b(x80Var);
            countDownLatch.countDown();
        }
    }
}
