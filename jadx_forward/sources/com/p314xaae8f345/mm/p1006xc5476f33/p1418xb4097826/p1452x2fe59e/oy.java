package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class oy extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz f190218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fc2.a f190219e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar, fc2.a aVar) {
        super(0);
        this.f190218d = pzVar;
        this.f190219e = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fc2.a aVar;
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar = this.f190218d;
        java.util.ArrayList m56388xcaeb60d0 = pzVar.C.m56388xcaeb60d0();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = m56388xcaeb60d0.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (next instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                arrayList.add(next);
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            aVar = this.f190219e;
            if (!hasNext) {
                obj = null;
                break;
            }
            obj = it6.next();
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj).mo2128x1ed62e84() == ((fc2.t) aVar).f342525k) {
                break;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj;
        pf5.u uVar = pf5.u.f435469a;
        if (abstractC14490x69736cb52 != null) {
            java.lang.String u17 = pm0.v.u(abstractC14490x69736cb52.getFeedObject().m59251x5db1b11());
            ey2.b1 b1Var = (ey2.b1) uVar.e(c61.l7.class).a(ey2.b1.class);
            java.lang.String[] strArr = {u17};
            b1Var.getClass();
            try {
                c66.q.f121026a.d().m107088x90df30e9(ni0.d.f418740d.in((java.lang.String[]) java.util.Arrays.copyOf(strArr, 1)));
                ((kk.l) ((jz5.n) c66.q.f121034i).mo141623x754a37bb()).m77803xc84af884(strArr[0]);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append("removeLocalBackupFeedWithTidArray success, tidArray = ");
                java.lang.String arrays = java.util.Arrays.toString(strArr);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "toString(...)");
                sb6.append(arrays);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.WCFinderWCDB", sb6.toString());
            } catch (java.lang.Exception unused) {
                java.lang.String arrays2 = java.util.Arrays.toString(strArr);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays2, "toString(...)");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.WCFinderWCDB", "removeLocalBackupFeedWithTidArray fail, tidArray = ".concat(arrays2));
            }
            b1Var.P6();
        }
        fc2.t tVar = (fc2.t) aVar;
        java.lang.String str = pzVar.U;
        int i17 = pzVar.f190295p;
        if (i17 != 4 || hc2.e.a()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13917xbf9dc158 c13917xbf9dc158 = pzVar.C;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13917xbf9dc158 c13917xbf9dc1582 = c13917xbf9dc158 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13917xbf9dc158 ? c13917xbf9dc158 : null;
            if (c13917xbf9dc1582 == null || c13917xbf9dc1582.f189192r < com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.M0().f208148c) {
                long j17 = tVar.f342525k;
                int i18 = tVar.f342520f;
                in5.n0 T0 = pzVar.T0();
                int mo1894x7e414b06 = T0 != null ? T0.mo1894x7e414b06() - T0.a0() : 0;
                boolean z17 = mo1894x7e414b06 > 0 && i18 + 1 == mo1894x7e414b06;
                java.util.Iterator it7 = c13917xbf9dc158.m56388xcaeb60d0().iterator();
                int i19 = 0;
                while (true) {
                    if (!it7.hasNext()) {
                        i19 = -1;
                        break;
                    }
                    if (((so2.j5) it7.next()).mo2128x1ed62e84() == j17) {
                        break;
                    }
                    i19++;
                }
                int i27 = i19;
                if (!z17 || i27 < 0) {
                    abstractC14490x69736cb5 = null;
                } else {
                    ey2.i iVar = (ey2.i) uVar.e(c61.l7.class).a(ey2.i.class);
                    java.util.RandomAccess sourceList = c13917xbf9dc158.m56388xcaeb60d0();
                    iVar.getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceList, "sourceList");
                    abstractC14490x69736cb5 = ((ey2.b1) uVar.e(c61.l7.class).a(ey2.b1.class)).N6(2, hc2.d0.b(i17));
                    if (abstractC14490x69736cb5 != null) {
                        abstractC14490x69736cb5.N1(4);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderBackupFeedListVM", "getBackupFeed tabType:" + i17 + " feed:" + hc2.b0.h(abstractC14490x69736cb5, false, 1, null) + " list:" + hc2.b0.h(abstractC14490x69736cb5, false, 1, null) + '}');
                    if (abstractC14490x69736cb5 != null) {
                        abstractC14490x69736cb5.X0(true);
                        abstractC14490x69736cb5.G1(9);
                        c13917xbf9dc158.m56388xcaeb60d0().add(abstractC14490x69736cb5);
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dw) pzVar.G).mo56051xb0566d03(i27 + 1, 1);
                        c13917xbf9dc158.f189192r++;
                    }
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("checkAutoInsertBackupFeed ");
                sb7.append(hc2.b0.b(tVar.f342529o, i27));
                sb7.append(" isAutoInsert:");
                sb7.append(z17);
                sb7.append(" index:");
                sb7.append(i27);
                sb7.append(" firstVisible:");
                sb7.append(i18);
                sb7.append(" itemCount:");
                sb7.append(mo1894x7e414b06);
                sb7.append(" isAutoLoadingMore:");
                sb7.append(pzVar.B1);
                sb7.append(" backupFeed:");
                sb7.append(abstractC14490x69736cb5 != null ? hc2.b0.h(abstractC14490x69736cb5, false, 1, null) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7.toString());
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "skip checkAutoInsertBackupFeed");
        }
        if (tVar.f342518d == 5) {
            java.util.List list = pzVar.J1;
            r45.lx2 lx2Var = pzVar.K1;
            if (list != null && lx2Var != null) {
                pzVar.f1(list, lx2Var, false);
            }
        }
        return jz5.f0.f384359a;
    }
}
