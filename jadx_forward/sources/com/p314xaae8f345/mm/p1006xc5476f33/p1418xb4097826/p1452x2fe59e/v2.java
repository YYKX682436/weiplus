package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class v2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5457xd6bc6fd1 f192396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 f192397e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5457xd6bc6fd1 c5457xd6bc6fd1, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var) {
        super(0);
        this.f192396d = c5457xd6bc6fd1;
        this.f192397e = a7Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int e17;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa2;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192;
        java.lang.Boolean bool;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa3;
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5457xd6bc6fd1 c5457xd6bc6fd1 = this.f192396d;
        am.ta taVar = c5457xd6bc6fd1.f135796g;
        int i17 = taVar.f89528c;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wj0.S;
        boolean z17 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var = this.f192397e;
        if (i17 == i18) {
            int h17 = a7Var.f187743g.h();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p2 p2Var = a7Var.f187750p;
            if (p2Var != null) {
                dm.w3 w3Var = c5457xd6bc6fd1.f135796g.f89529d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(w3Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.storage.LocalFinderCommentObject");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0) w3Var;
                long Y0 = yj0Var.Y0();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var2 = p2Var.f190228b;
                if (Y0 == 0 || a7Var2.f187743g.e(yj0Var.Y0()) != -1) {
                    int a17 = a7Var2.f187743g.a(new so2.y0(yj0Var));
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df193 = p2Var.f190227a.mo7946xf939df19();
                    if (mo7946xf939df193 != null) {
                        mo7946xf939df193.m8146xced61ae5();
                    }
                    if (yj0Var.Y0() != 0) {
                        yw2.a0 a0Var = a7Var2.f187749o;
                        if (a0Var != null) {
                            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.r(a0Var.s(), false, null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.o2.f190149d, 3, null);
                        }
                        yw2.a0 a0Var2 = a7Var2.f187749o;
                        if (a0Var2 != null && (m82555x4905e9fa3 = a0Var2.s().m82555x4905e9fa()) != null) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                            arrayList.add(java.lang.Integer.valueOf(a17));
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(m82555x4905e9fa3, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$DiffDataChangeHelper", "onInsertChange", "(Lcom/tencent/mm/plugin/finder/storage/LocalFinderCommentObject;)Z", "Undefined", "scrollToPosition", "(I)V");
                            m82555x4905e9fa3.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(m82555x4905e9fa3, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$DiffDataChangeHelper", "onInsertChange", "(Lcom/tencent/mm/plugin/finder/storage/LocalFinderCommentObject;)Z", "Undefined", "scrollToPosition", "(I)V");
                        }
                    }
                } else {
                    z17 = false;
                }
                bool = java.lang.Boolean.valueOf(z17);
            } else {
                bool = null;
            }
            int h18 = a7Var.f187743g.h();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = a7Var.f187745i;
            if (c14994x9b99c079 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                throw null;
            }
            c14994x9b99c079.m59355xc51b2372(c14994x9b99c079.m59216x8ed22866() + (h18 - h17));
            bu2.j jVar = bu2.j.f106067a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0792 = a7Var.f187745i;
            if (c14994x9b99c0792 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                throw null;
            }
            jVar.n(c14994x9b99c0792, bu2.i.f106057e);
            bool2 = bool;
        } else if (i17 == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wj0.R) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p2 p2Var2 = a7Var.f187750p;
            if (p2Var2 != null) {
                dm.w3 w3Var2 = taVar.f89529d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(w3Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.storage.LocalFinderCommentObject");
                bool2 = java.lang.Boolean.valueOf(p2Var2.b((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0) w3Var2, 1));
            }
            bool2 = null;
        } else if (i17 == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wj0.Y) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p2 p2Var3 = a7Var.f187750p;
            if (p2Var3 != null) {
                dm.w3 w3Var3 = taVar.f89529d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(w3Var3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.storage.LocalFinderCommentObject");
                bool2 = java.lang.Boolean.valueOf(p2Var3.b((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0) w3Var3, 6));
            }
            bool2 = null;
        } else if (i17 == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wj0.U) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p2 p2Var4 = a7Var.f187750p;
            if (p2Var4 != null) {
                long j17 = taVar.f89527b;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var3 = p2Var4.f190228b;
                int e18 = a7Var3.f187743g.e(j17);
                if (e18 != -1) {
                    java.lang.Object obj = a7Var3.f187743g.f190002d.get(e18);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var2 = ((so2.y0) obj).f492236d;
                    yj0Var2.l1(yj0Var2.z0() & (-257));
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df194 = p2Var4.f190227a.mo7946xf939df19();
                    if (mo7946xf939df194 != null) {
                        mo7946xf939df194.m8148xed6e4d18(e18, 1);
                    }
                } else {
                    z17 = false;
                }
                bool2 = java.lang.Boolean.valueOf(z17);
            }
            bool2 = null;
        } else if (i17 == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wj0.T) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p2 p2Var5 = a7Var.f187750p;
            if (p2Var5 != null) {
                long j18 = taVar.f89527b;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var4 = p2Var5.f190228b;
                java.util.ArrayList arrayList2 = a7Var4.f187743g.f190002d;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator it = arrayList2.iterator();
                so2.y0 y0Var = null;
                int i19 = 0;
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    int i27 = i19 + 1;
                    if (i19 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    so2.y0 y0Var2 = (so2.y0) next;
                    if (y0Var2.f492236d.t0() == j18) {
                        y0Var = y0Var2;
                    }
                    if (y0Var2.f492236d.Y0() == j18) {
                        arrayList3.add(next);
                    }
                    i19 = i27;
                }
                java.util.List V0 = kz5.n0.V0(arrayList3);
                if (y0Var != null) {
                    ((java.util.ArrayList) V0).add(0, y0Var);
                }
                arrayList2.removeAll(V0);
                if (!((java.util.ArrayList) V0).isEmpty()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y yVar = a7Var4.f187743g;
                    java.util.Iterator it6 = yVar.f190002d.iterator();
                    while (it6.hasNext()) {
                        so2.y0 y0Var3 = (so2.y0) it6.next();
                        if (hc2.c0.c(y0Var3.f492236d.z0())) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var3 = y0Var3.f492236d;
                            yj0Var3.l1(yj0Var3.z0() & (-257));
                        }
                    }
                    if (y0Var != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var4 = y0Var.f492236d;
                        yj0Var4.l1(yj0Var4.z0() | 256);
                        yVar.b(V0, true, false);
                    }
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df195 = p2Var5.f190227a.mo7946xf939df19();
                    if (mo7946xf939df195 != null) {
                        mo7946xf939df195.m8146xced61ae5();
                    }
                }
                bool2 = java.lang.Boolean.FALSE;
            }
            bool2 = null;
        } else if (i17 == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wj0.W) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p2 p2Var6 = a7Var.f187750p;
            if (p2Var6 != null) {
                dm.w3 w3Var4 = taVar.f89529d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(w3Var4, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.storage.LocalFinderCommentObject");
                bool2 = java.lang.Boolean.valueOf(p2Var6.b((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0) w3Var4, 4));
            }
            bool2 = null;
        } else if (i17 == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wj0.X) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p2 p2Var7 = a7Var.f187750p;
            if (p2Var7 != null) {
                dm.w3 w3Var5 = taVar.f89529d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(w3Var5, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.storage.LocalFinderCommentObject");
                bool2 = java.lang.Boolean.valueOf(p2Var7.b((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0) w3Var5, 5));
            }
            bool2 = null;
        } else if (i17 == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wj0.V) {
            so2.y0 y0Var4 = a7Var.G1;
            if (y0Var4 != null) {
                if (taVar.f89527b == y0Var4.f492236d.t0()) {
                    pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.u2(a7Var, y0Var4));
                }
                a7Var.G1 = null;
            }
        } else if (i17 == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wj0.Z) {
            int e19 = a7Var.f187743g.e(taVar.f89527b);
            if (e19 != -1) {
                java.lang.Object obj2 = a7Var.f187743g.f190002d.get(e19);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                so2.y0 y0Var5 = (so2.y0) obj2;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0793 = a7Var.f187745i;
                if (c14994x9b99c0793 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                    throw null;
                }
                if (hc2.o0.H(c14994x9b99c0793.getFeedObject())) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var5 = y0Var5.f492236d;
                    yj0Var5.l1(yj0Var5.z0() | 1);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 u07 = y0Var5.f492236d.u0();
                    r45.dc dcVar = new r45.dc();
                    dcVar.set(0, java.lang.Long.valueOf(c01.id.a() / 1000));
                    u07.m76105x37f04d2(dcVar);
                }
                yw2.a0 a0Var3 = a7Var.f187749o;
                if (a0Var3 != null && (m82555x4905e9fa2 = a0Var3.s().m82555x4905e9fa()) != null && (mo7946xf939df192 = m82555x4905e9fa2.mo7946xf939df19()) != null) {
                    mo7946xf939df192.m8147xed6e4d18(e19);
                }
            }
        } else if (i17 == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wj0.f209792p0 && (e17 = a7Var.f187743g.e(taVar.f89527b)) != -1) {
            java.lang.Object obj3 = a7Var.f187743g.f190002d.get(e17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
            so2.y0 y0Var6 = (so2.y0) obj3;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0794 = a7Var.f187745i;
            if (c14994x9b99c0794 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                throw null;
            }
            if (hc2.o0.H(c14994x9b99c0794.getFeedObject())) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var6 = y0Var6.f492236d;
                yj0Var6.l1(yj0Var6.z0() & (-2));
            }
            yw2.a0 a0Var4 = a7Var.f187749o;
            if (a0Var4 != null && (m82555x4905e9fa = a0Var4.s().m82555x4905e9fa()) != null && (mo7946xf939df19 = m82555x4905e9fa.mo7946xf939df19()) != null) {
                mo7946xf939df19.m8147xed6e4d18(e17);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DrawerPresenter", "[onNotifyChange] " + c5457xd6bc6fd1 + " result=" + bool2);
        return jz5.f0.f384359a;
    }
}
