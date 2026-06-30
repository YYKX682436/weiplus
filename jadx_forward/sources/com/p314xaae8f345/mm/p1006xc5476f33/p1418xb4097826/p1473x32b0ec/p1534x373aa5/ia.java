package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class ia extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f197918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ka f197919e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f197920f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ka kaVar, int i17) {
        super(2, interfaceC29045xdcb5ca57);
        this.f197918d = hVar;
        this.f197919e = kaVar;
        this.f197920f = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ia(this.f197918d, interfaceC29045xdcb5ca57, this.f197919e, this.f197920f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ia iaVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ia) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        iaVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object w2Var;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.lg1 lg1Var = (r45.lg1) ((xg2.i) this.f197918d).f535926b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ka kaVar = this.f197919e;
        java.lang.String str = kaVar.H;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[requestData] resp = ");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(lg1Var);
        sb6.append(pm0.b0.g(lg1Var));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        java.util.LinkedList m75941xfb821914 = lg1Var.m75941xfb821914(1);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75941xfb821914);
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            int i17 = this.f197920f;
            if (!hasNext) {
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ga(kaVar, i17, kaVar.U));
                if (kaVar.Y == null) {
                    bm2.c6 c6Var = kaVar.Q;
                    if (c6Var != null) {
                        java.util.LinkedList linkedList2 = c6Var.f103354h;
                        linkedList2.clear();
                        linkedList2.addAll(linkedList);
                        c6Var.m8146xced61ae5();
                    }
                } else {
                    bm2.c6 c6Var2 = kaVar.Q;
                    if (c6Var2 != null) {
                        java.util.LinkedList linkedList3 = c6Var2.f103354h;
                        int size = linkedList3.size();
                        linkedList3.addAll(linkedList);
                        c6Var2.m8153xd399a4d9(size, linkedList.size());
                    }
                }
                if (lg1Var.m75939xb282bd08(3) > 0) {
                    com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = kaVar.X;
                    if (c22851x22587864 != null) {
                        c22851x22587864.e(true);
                    }
                } else {
                    com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x225878642 = kaVar.X;
                    if (c22851x225878642 != null) {
                        c22851x225878642.f();
                    }
                }
                kaVar.Y = lg1Var.m75934xbce7f2f(2);
                return jz5.f0.f384359a;
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = (com.p314xaae8f345.mm.p2495xc50a8b8b.g) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gVar);
            if (i17 == 4) {
                r45.k92 k92Var = new r45.k92();
                try {
                    k92Var.mo11468x92b714fd(gVar.g());
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                }
                w2Var = new el2.w2(i17, k92Var);
            } else if (i17 != 7) {
                if (i17 != 15 && i17 != 999) {
                    switch (i17) {
                        case 18:
                            break;
                        case 19:
                            r45.qy1 qy1Var = new r45.qy1();
                            try {
                                qy1Var.mo11468x92b714fd(gVar.g());
                            } catch (java.lang.Exception e18) {
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e18);
                            }
                            w2Var = new el2.a3(qy1Var);
                            break;
                        case 20:
                            r45.do2 do2Var = new r45.do2();
                            try {
                                do2Var.mo11468x92b714fd(gVar.g());
                            } catch (java.lang.Exception e19) {
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e19);
                            }
                            w2Var = new el2.y2(do2Var);
                            break;
                        default:
                            w2Var = null;
                            break;
                    }
                }
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
                try {
                    c19786x6a1e2862.mo11468x92b714fd(gVar.g());
                } catch (java.lang.Exception e27) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e27);
                }
                w2Var = new el2.x2(i17, c19786x6a1e2862);
            } else {
                r45.e52 e52Var = new r45.e52();
                try {
                    e52Var.mo11468x92b714fd(gVar.g());
                } catch (java.lang.Exception e28) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e28);
                }
                java.util.LinkedList m75941xfb8219142 = e52Var.m75941xfb821914(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getInfos(...)");
                r45.wd5 wd5Var = (r45.wd5) kz5.n0.Z(m75941xfb8219142);
                if (wd5Var != null) {
                    w2Var = new el2.z2(7, wd5Var);
                }
                w2Var = null;
            }
            if (w2Var != null) {
                linkedList.add(w2Var);
            }
        }
    }
}
