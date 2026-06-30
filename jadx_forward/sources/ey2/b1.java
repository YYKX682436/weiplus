package ey2;

/* loaded from: classes2.dex */
public final class b1 extends pf5.o0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Set f338858f = kz5.z.D0(new java.lang.Integer[]{-561, -562, -563, -564, -1203, -1204, -1205, -1208, -2026, -3001, 30001});

    /* renamed from: e, reason: collision with root package name */
    public boolean f338859e;

    public b1() {
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50297x7c4d7ca2(new ey2.w0(this), com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 N6(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5[] O6 = O6(i17, i18, 1);
        if (O6 != null) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) kz5.z.O(O6);
        }
        return null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5[] O6(int i17, int i18, int i19) {
        c66.q qVar = c66.q.f121026a;
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 and = ni0.d.f418741e.eq(i18).and(ni0.d.f418743g.gt(c01.id.e()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(and, "and(...)");
        if (i17 == 0 || i17 == 1) {
            and = and.and(ni0.d.f418745i.m108239xad384d8a(128));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(and, "and(...)");
        }
        try {
            java.util.List<T> m107096xde3eb429 = qVar.d().m107096xde3eb429(and, ni0.d.f418739c.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc), i19);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m107096xde3eb429, "getAllObjects(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m107096xde3eb429, 10));
            java.util.Iterator it = m107096xde3eb429.iterator();
            while (it.hasNext()) {
                arrayList.add(((ni0.j) it.next()).f418768b);
            }
            java.util.ArrayList b17 = qVar.b(arrayList, (kk.l) ((jz5.n) c66.q.f121034i).mo141623x754a37bb(), new c66.n(m107096xde3eb429));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("getLocalFeeds sucess, pullType:");
            sb6.append(i17);
            sb6.append(", scene:");
            sb6.append(i18);
            sb6.append(" count:");
            sb6.append(b17.size());
            sb6.append(" tidArray:");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(b17, 10));
            java.util.Iterator it6 = b17.iterator();
            while (it6.hasNext()) {
                arrayList2.add(pm0.v.u(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) it6.next()).getFeedObject().getFeedObject().m76784x5db1b11()));
            }
            sb6.append(arrayList2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.WCFinderWCDB", sb6.toString());
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5[]) b17.toArray(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5[0]);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.WCFinderWCDB", "getLocalFeeds fail, pullType:" + i17 + ", scene:" + i18 + "}, e:" + e17.getMessage());
            return null;
        }
    }

    public final void P6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (t70Var.M0().f208147b > 0 || t70Var.M0().f208148c > 0) {
            r45.oq2 Q6 = Q6();
            int e17 = c01.id.e();
            boolean z17 = false;
            if (e17 < Q6.m75939xb282bd08(0) + Q6.m75939xb282bd08(1)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLocalFeedProvider", "currentTimestamp:" + e17 + " < lastRequestTimestamp:" + Q6 + ".last_request_timestamp requestInterval:" + Q6.m75939xb282bd08(1) + ' ');
                return;
            }
            int max = java.lang.Math.max(1, t70Var.M0().f208149d);
            int b17 = hc2.d0.b(4);
            c66.q qVar = c66.q.f121026a;
            com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 and = ni0.d.f418741e.eq(b17).and(ni0.d.f418743g.gt(c01.id.e()));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(and, "and(...)");
            com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 and2 = and.and(ni0.d.f418745i.m108239xad384d8a(128));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(and2, "and(...)");
            try {
                com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 m107277x754a37bb = qVar.d().m107277x754a37bb(com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76.all().m108258x5a7510f(), and2);
                java.lang.Integer valueOf = m107277x754a37bb != null ? java.lang.Integer.valueOf(m107277x754a37bb.m106360xb58848b9()) : null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.WCFinderWCDB", "hasEnoughValidLocalFeeds sucess, pullType=0, scene=" + b17 + ", required_count=" + max + ", localCount=" + valueOf);
                if ((valueOf != null ? valueOf.intValue() : 0) > max) {
                    z17 = true;
                }
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.WCFinderWCDB", "hasEnoughValidLocalFeeds fail, pullType=0, scene=" + b17 + ", required_count=" + max);
            }
            if (z17 || this.f338859e) {
                return;
            }
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c), null, null, new ey2.a1(this, 4, 0, Q6, null), 3, null);
        }
    }

    public final r45.oq2 Q6() {
        r45.oq2 oq2Var = new r45.oq2();
        java.lang.String v17 = gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LOCALBACKUP_PREFETCH_DISASTER_INFO_STRING, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v17);
        if (v17.length() > 0) {
            oq2Var.mo11468x92b714fd(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(v17));
        }
        return oq2Var;
    }

    public final void R6(java.util.List feedList, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedList, "feedList");
        if (feedList.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = feedList.iterator();
        while (true) {
            boolean z17 = false;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) next;
            if (!hc2.o0.F(abstractC14490x69736cb5.getFeedObject().getFeedObject()) && !hc2.o0.E(abstractC14490x69736cb5.getFeedObject().getFeedObject(), false, 1, null)) {
                z17 = true;
            }
            if (z17) {
                arrayList.add(next);
            }
        }
        c66.q qVar = c66.q.f121026a;
        qVar.d().m107088x90df30e9(ni0.d.f418741e.eq(i17).and(ni0.d.f418744h.eq(i18)));
        if (arrayList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.WCFinderWCDB", "delete local backup cache with scene:" + i17 + ", source:" + i18);
            return;
        }
        if (arrayList.size() > 100) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.WCFinderWCDB", "insert backup feeds count = " + arrayList.size());
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) it6.next();
            ni0.i iVar = new ni0.i();
            iVar.f418764a = pm0.v.u(abstractC14490x69736cb52.getFeedObject().getFeedObject().m76784x5db1b11());
            iVar.f418765b = abstractC14490x69736cb52.getFeedObject().getFeedObject().mo14344x5f01b1f6();
            iVar.f418766c = c01.id.e();
            arrayList2.add(iVar);
        }
        qVar.e(arrayList2);
        int e17 = c01.id.e() + c66.q.f121027b;
        long c17 = ((i18 * 10000000000L) + (c01.id.c() % 10000000000L)) * 100;
        e06.k g17 = kz5.c0.g(arrayList);
        e06.i iVar2 = new e06.i(g17.f327743e, 0, -g17.f327744f);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(iVar2, 10));
        kz5.x0 it7 = iVar2.iterator();
        while (((e06.j) it7).f327747f) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb53 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) arrayList.get(it7.b());
            ni0.j jVar = new ni0.j();
            long j17 = 1 + c17;
            jVar.f418767a = c17;
            jVar.f418768b = pm0.v.u(abstractC14490x69736cb53.getFeedObject().getFeedObject().m76784x5db1b11());
            jVar.f418769c = i17;
            jVar.f418770d = abstractC14490x69736cb53.getFeedObject().getFromType();
            jVar.f418772f = i18;
            jVar.f418773g = abstractC14490x69736cb53.getFeedObject().getFeedObject().m76781xf5e32151();
            jVar.f418771e = abstractC14490x69736cb53.getFeedObject().getUnreadExpiredTime() != 0 ? abstractC14490x69736cb53.getFeedObject().getUnreadExpiredTime() : e17;
            arrayList3.add(jVar);
            c17 = j17;
        }
        try {
            qVar.d().m107160x184bd5c(arrayList3);
            java.util.Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb54 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) it8.next();
                c66.q qVar2 = c66.q.f121026a;
                ((kk.l) ((jz5.n) c66.q.f121034i).mo141623x754a37bb()).put(pm0.v.u(abstractC14490x69736cb54.getFeedObject().getFeedObject().m76784x5db1b11()), abstractC14490x69736cb54);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.WCFinderWCDB", "update local backup cache success, scene:" + i17 + ", source:" + i18 + ", array:" + arrayList3);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.WCFinderWCDB", "update local backup cache fail, scene:" + i17 + ", source:" + i18 + ", array:" + arrayList3 + ", e:" + e18.getMessage());
        }
    }
}
