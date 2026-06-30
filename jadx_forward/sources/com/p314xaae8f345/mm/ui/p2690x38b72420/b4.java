package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes9.dex */
public final class b4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ co.a f288152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f288153e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f288154f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f288155g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f288156h;

    public b4(co.a aVar, boolean z17, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        this.f288152d = aVar;
        this.f288153e = z17;
        this.f288154f = i17;
        this.f288155g = f9Var;
        this.f288156h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6625x1842a3d4 c6625x1842a3d4 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6625x1842a3d4();
        c6625x1842a3d4.f139769d = 1L;
        co.a aVar = this.f288152d;
        int i18 = 1;
        c6625x1842a3d4.f139770e = c6625x1842a3d4.b("ChatName", aVar.m75945x2fec8307(aVar.f125235d + 1), true);
        if (aVar instanceof ld5.b) {
            c6625x1842a3d4.f139771f = 2L;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            ld5.b bVar = (ld5.b) aVar;
            java.util.LinkedList k17 = bVar.k();
            if (k17 != null) {
                java.util.Iterator it = k17.iterator();
                while (it.hasNext()) {
                    arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.p2690x38b72420.c4.a(pt0.f0.f439742b1.n(bVar.m75945x2fec8307(bVar.f125235d + 1), ((java.lang.Number) it.next()).longValue()))));
                }
            }
            c6625x1842a3d4.p(kz5.n0.g0(arrayList, ";", null, null, 0, null, null, 62, null));
            c6625x1842a3d4.f139772g = arrayList.size();
        } else if (aVar instanceof ld5.a) {
            c6625x1842a3d4.f139771f = 3L;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            ld5.a aVar2 = (ld5.a) aVar;
            java.util.LinkedList j17 = aVar2.j();
            if (j17 != null) {
                java.util.Iterator it6 = j17.iterator();
                while (it6.hasNext()) {
                    arrayList2.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.p2690x38b72420.c4.a(pt0.f0.f439742b1.n(aVar2.m75945x2fec8307(aVar2.f125235d + 1), ((java.lang.Number) it6.next()).longValue()))));
                }
            }
            c6625x1842a3d4.p(kz5.n0.g0(arrayList2, ";", null, null, 0, null, null, 62, null));
            c6625x1842a3d4.f139772g = arrayList2.size();
        } else {
            c6625x1842a3d4.f139771f = 1L;
            if (this.f288153e) {
                c6625x1842a3d4.f139771f = 2L;
            }
            c6625x1842a3d4.f139772g = 1L;
            int i19 = this.f288154f;
            if (i19 > 0) {
                c6625x1842a3d4.p(java.lang.String.valueOf(i19));
            } else {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f288155g;
                if (f9Var == null || f9Var.m124847x74d37ac6() <= 0) {
                    if (!(aVar instanceof ne5.a)) {
                        i18 = 2;
                        if (!(aVar instanceof jd5.a)) {
                            if (aVar instanceof jd5.c) {
                                i18 = 3;
                            } else {
                                if (!(aVar instanceof ec5.a)) {
                                    if (!(aVar instanceof nb5.b)) {
                                        if (aVar instanceof id5.a) {
                                            i18 = 6;
                                        } else {
                                            if (!(aVar instanceof se5.a)) {
                                                if (!(aVar instanceof fc5.i)) {
                                                    if (!(aVar instanceof fc5.f)) {
                                                        if (!(aVar instanceof dc5.a)) {
                                                            if (aVar instanceof lb5.a) {
                                                                com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5 z5Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class);
                                                                java.lang.String j18 = ((lb5.a) aVar).j();
                                                                com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb Ni = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) z5Var).Ni(j18 != null ? j18 : "");
                                                                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b1) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.d6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.d6.class))).getClass();
                                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(com.p314xaae8f345.mm.p2614xca6eae71.g.b(), "getInstance(...)");
                                                                i18 = n22.m.e(Ni);
                                                            } else if (aVar instanceof vd5.a) {
                                                                i18 = 19;
                                                            } else if (aVar instanceof pb5.a) {
                                                                i18 = 20;
                                                            } else {
                                                                v05.b bVar2 = new v05.b();
                                                                java.lang.String str = this.f288156h;
                                                                if (str == null) {
                                                                    str = "";
                                                                }
                                                                bVar2.m126729xdc93280d(str, "");
                                                                int m75939xb282bd08 = bVar2.m75939xb282bd08(bVar2.f449898d + 6);
                                                                if (m75939xb282bd08 != 2) {
                                                                    if (m75939xb282bd08 != 24) {
                                                                        if (m75939xb282bd08 != 33 && m75939xb282bd08 != 36) {
                                                                            if (m75939xb282bd08 != 51) {
                                                                                if (m75939xb282bd08 != 63) {
                                                                                    if (m75939xb282bd08 != 130) {
                                                                                        if (m75939xb282bd08 != 5) {
                                                                                            if (m75939xb282bd08 != 6) {
                                                                                                i17 = -1;
                                                                                                i18 = i17;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        i18 = 13;
                                                    }
                                                    i18 = 12;
                                                }
                                                i18 = 8;
                                            }
                                            i17 = 7;
                                            i18 = i17;
                                        }
                                    }
                                    i18 = 5;
                                }
                                i18 = 4;
                            }
                        }
                    }
                    c6625x1842a3d4.p(java.lang.String.valueOf(i18));
                } else {
                    c6625x1842a3d4.p(java.lang.String.valueOf(com.p314xaae8f345.mm.ui.p2690x38b72420.c4.a(f9Var)));
                }
            }
        }
        c6625x1842a3d4.o();
        c6625x1842a3d4.k();
    }
}
