package f92;

/* loaded from: classes10.dex */
public final class i implements l92.b, com.p314xaae8f345.mm.app.t2, l92.c {

    /* renamed from: d, reason: collision with root package name */
    public long f341783d;

    @Override // l92.c
    public void a(java.lang.String newDefaultUsername, java.lang.String rawDefaultUsername) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newDefaultUsername, "newDefaultUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawDefaultUsername, "rawDefaultUsername");
    }

    public final void b(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountLogicHandler", "[doFinderInit] source=" + source + " lastFinderInitTime=" + this.f341783d);
        this.f341783d = java.lang.System.currentTimeMillis();
        p3325xe03a0797.p3326xc267989b.l.d(((c61.l7) i95.n0.c(c61.l7.class)).U, null, null, new f92.g(source, this, null), 3, null);
        qx.a.f448775c = true;
    }

    public void c(m92.b account, java.lang.String source) {
        java.util.LinkedList linkedList;
        m92.b b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(account, "account");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("FINDER_RE_INIT", source)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountLogicHandler", "[onDeleted] Source from reInit return");
            return;
        }
        java.lang.String str = account.f68723xdec927b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.f205634r.m77803xc84af884(str);
        ya2.g gVar = ya2.h.f542017a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            ya2.c a17 = gVar.a();
            a17.getClass();
            a17.f541992a.remove(str);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().k0(str);
            java.lang.String str2 = "DELETE FROM FinderContact WHERE username = " + d95.b0.O(str);
            ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.o80 Jj = ((c61.l7) i95.n0.c(c61.l7.class)).Jj();
            if ((Jj != null ? Jj.m145253xb158737d("FinderContact", str2) : false) && Jj != null) {
                Jj.mo142179xf35bbb4("FinderContact", 5, Jj);
            }
        }
        bu2.e0.f106035e.a(1).f106026c.m75941xfb821914(0).clear();
        so2.i4 i4Var = new so2.i4();
        i4Var.f69192xdec927b = str;
        i4Var.f69191x2262335f = 1;
        if (!((c61.l7) i95.n0.c(c61.l7.class)).Vj().mo880xb970c2b9(i4Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.AccountLogicHandler", "insert DeletingInfo failure. finderUsername=" + str + " source=" + source);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.dj0 pk6 = ((c61.l7) i95.n0.c(c61.l7.class)).pk();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t80 Kj = ((c61.l7) i95.n0.c(c61.l7.class)).Kj();
        pk6.getClass();
        if ((str.length() == 0) || (b17 = g92.b.f351302e.b1(str, true)) == null) {
            linkedList = null;
        } else {
            linkedList = new java.util.LinkedList();
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            p75.n0 n0Var = dm.b5.f317384s;
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            java.util.LinkedList linkedList4 = new java.util.LinkedList();
            p75.d dVar = dm.b5.f317385t;
            java.lang.String field_finder_version_username_history = b17.f68700xd6cccd66;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_finder_version_username_history, "field_finder_version_username_history");
            p75.m0 l17 = dVar.l(r26.n0.f0(field_finder_version_username_history, new java.lang.String[]{";"}, false, 0, 6, null));
            p75.i0 g17 = dm.b5.f317384s.g(linkedList2);
            g17.f434190d = l17;
            g17.f434192f = linkedList3;
            g17.f434193g = linkedList4;
            p75.l0 a18 = g17.a();
            java.util.List k17 = a18.k(pk6.f208191d, qb2.x1.class);
            if (true ^ ((java.util.ArrayList) k17).isEmpty()) {
                linkedList.addAll(k17);
            }
            java.lang.String name = java.lang.Thread.currentThread().getName();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "getName(...)");
            java.lang.String sql = a18.m157942x9616526c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sql, "sql");
            new qb2.r("FinderSessionInfoStorage.getSessionInfoBySenderUserName", r26.i0.u(sql, ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[deleteMyLocalAccountData] finderUsername=");
        sb6.append(str);
        sb6.append(" sessionInfoList.size:");
        sb6.append(linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountLogicHandler", sb6.toString());
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                java.lang.String field_sessionId = ((qb2.x1) it.next()).f65984xbed8694c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
                qb2.t D0 = Kj.D0(field_sessionId);
                boolean mo60485xc9e4dcd4 = Kj.mo60485xc9e4dcd4(D0.f72763xa3c65b86, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountLogicHandler", "[deleteMyLocalAccountData] finderUsername=" + str + " delete conv begin[" + mo60485xc9e4dcd4 + "]... " + D0.F1 + ' ' + D0.f65866xbed8694c);
                if (mo60485xc9e4dcd4) {
                    c01.w9.h(D0.f65866xbed8694c, new f92.h(str, D0));
                }
                java.lang.String field_sessionId2 = D0.f65866xbed8694c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId2, "field_sessionId");
                pk6.y0(field_sessionId2, false);
                pk6.mo142179xf35bbb4(D0.f65866xbed8694c, 6, D0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountLogicHandler", "[deleteMyLocalAccountData] finderUsername=" + str + " delete conv end... " + D0.F1 + ' ' + D0.f65866xbed8694c);
            }
        }
        ((c61.l7) i95.n0.c(c61.l7.class)).Vj().mo9951xb06685ab(i4Var, dm.i4.f66875xa013b0d5);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.e1) ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().S()).d(str, zy2.y8.H);
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
        if (!pr2.a.f439482a.a() || java.lang.System.currentTimeMillis() - this.f341783d < 86400000) {
            return;
        }
        b("onAppForeground");
    }
}
