package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class mj extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 f211059d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 activityC15076x7a6c76b6) {
        super(1);
        this.f211059d = activityC15076x7a6c76b6;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56068x4905e9fa;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa<T> m56388xcaeb60d0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 o17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa it = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 activityC15076x7a6c76b6 = this.f211059d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qm qmVar = activityC15076x7a6c76b6.D;
        if (qmVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        boolean z17 = qmVar.C1;
        if (!z17) {
            java.lang.String str = qmVar.f211282x0;
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "checkAutoRemoveBackupFeed return forenterPullRequestDone");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var2 = qmVar.f187957g;
                if (i0Var2 != null && (m56068x4905e9fa = i0Var2.m56068x4905e9fa()) != null) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = m56068x4905e9fa.mo7946xf939df19();
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
                    if (c22848x6ddd90cf != null) {
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = m56068x4905e9fa.getLayoutManager();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8 = layoutManager instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) layoutManager : null;
                        if (c15415x74224fd8 != null && (abstractC13919x46aff122 = qmVar.f188103t) != null && (m56388xcaeb60d0 = abstractC13919x46aff122.m56388xcaeb60d0()) != 0 && (i0Var = qmVar.f187957g) != null && (o17 = i0Var.o()) != null) {
                            int w17 = c15415x74224fd8.w();
                            int y17 = c15415x74224fd8.y();
                            if (w17 < 0 || w17 != y17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkAutoRemoveBackupFeed  return [" + w17 + ' ' + y17 + ']');
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkAutoRemoveBackupFeed ");
                                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 q07 = m56068x4905e9fa.q0(w17, false);
                                in5.s0 s0Var = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
                                if (s0Var != null) {
                                    java.lang.Object obj2 = s0Var.f374658i;
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj2 : null;
                                    if (abstractC14490x69736cb5 != null) {
                                        java.util.Iterator it6 = m56388xcaeb60d0.iterator();
                                        int i17 = 0;
                                        while (true) {
                                            if (!it6.hasNext()) {
                                                i17 = -1;
                                                break;
                                            }
                                            so2.j5 j5Var = (so2.j5) it6.next();
                                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
                                            if (abstractC14490x69736cb52 != null && abstractC14490x69736cb52.mo2128x1ed62e84() == abstractC14490x69736cb5.mo2128x1ed62e84()) {
                                                break;
                                            }
                                            i17++;
                                        }
                                        int i18 = i17 + 1;
                                        so2.j5 j5Var2 = (i18 < 0 || i18 >= m56388xcaeb60d0.size()) ? null : (so2.j5) m56388xcaeb60d0.get(i18);
                                        if (j5Var2 != null) {
                                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb53 = j5Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var2 : null;
                                            if (!((abstractC14490x69736cb53 == null || abstractC14490x69736cb53.getIsBackupFeed()) ? false : true)) {
                                                int mo1894x7e414b06 = c22848x6ddd90cf.mo1894x7e414b06() - c22848x6ddd90cf.a0();
                                                int a07 = y17 - c22848x6ddd90cf.a0();
                                                boolean z18 = i17 >= 0 && i18 >= 0 && i18 > i17 && a07 >= 0 && a07 != i18;
                                                if (z18) {
                                                    m56388xcaeb60d0.remove(i18);
                                                    o17.mo56053xb9568715(i18, 1);
                                                }
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkAutoRemoveBackupFeed " + hc2.b0.h(abstractC14490x69736cb5, false, 1, null) + " isAutoRemove:" + z18 + " curIndex:" + i17 + " backupIndex:" + i18 + " lastVisibleItem:" + a07 + " itemCount:" + mo1894x7e414b06 + " backupFeed:" + hc2.b0.h(j5Var2, false, 1, null));
                                            }
                                        }
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkAutoRemoveBackupFeed return for " + hc2.b0.h(j5Var2, false, 1, null));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qm qmVar2 = activityC15076x7a6c76b6.D;
            if (qmVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                throw null;
            }
            qmVar2.C1 = true;
        }
        if (it.getPullType() != 2 && (it instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y1)) {
            p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activityC15076x7a6c76b6).a(qt2.u.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y1 y1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y1) it;
            qt2.u.T6((qt2.u) a17, y1Var.f190006c, y1Var.f190004a, 0L, 4, null);
        }
        return jz5.f0.f384359a;
    }
}
