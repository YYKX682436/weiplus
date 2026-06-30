package cu2;

/* loaded from: classes2.dex */
public final class t {
    public t(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(java.util.List list, r45.qt2 qt2Var) {
        if (list == null || qt2Var == null) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it.next();
            if (c14994x9b99c079.getFeedObject().m76829x97edf6c0() != null) {
                i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17).rk(c14994x9b99c079.getFeedObject(), qt2Var.m75939xb282bd08(5), null);
            }
        }
        bu2.j jVar = bu2.j.f106067a;
        int m75939xb282bd08 = qt2Var.m75939xb282bd08(5);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            arrayList.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it6.next()).getFeedObject());
        }
        jVar.a(m75939xb282bd08, arrayList);
    }

    public final boolean b(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.f90 Pj = ((c61.l7) i95.n0.c(c61.l7.class)).Pj();
        Pj.getClass();
        bu2.j.f106067a.l(j17);
        for (java.lang.Integer num : bu2.e0.f106033c) {
            bu2.e0.f106031a.e(j17, num.intValue());
        }
        Pj.f208293f.mo70514xb06685ab(dm.i4.f66894xc4fe047c, "id=?", new java.lang.String[]{"" + j17});
        cu2.t tVar = cu2.u.f303974a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedLogic", "delete feed " + j17 + " success true");
        return true;
    }

    public final boolean c(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.f90 Pj = ((c61.l7) i95.n0.c(c61.l7.class)).Pj();
        java.lang.String[] strArr = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.f90.f208289h;
        boolean y07 = Pj.y0(j17, true);
        cu2.t tVar = cu2.u.f303974a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedLogic", "Finder.PostLog delete feed localId " + j17 + " success " + y07);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x040f, code lost:
    
        if (r0 == null) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x052b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 1522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cu2.t.d(com.tencent.mm.plugin.finder.model.BaseFinderFeed, boolean):void");
    }

    public final void e(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, yz5.l lVar) {
        java.lang.String str;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        if (feed.F0()) {
            str = feed.p();
            i17 = 1;
        } else {
            str = "";
            i17 = 0;
        }
        java.lang.String str2 = str;
        int i18 = i17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, false, cu2.s.f303973d);
        Q.show();
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        cq.j1.b((cq.k) c17, xy2.c.e(context), feed.mo2128x1ed62e84(), feed.getFeedObject().m59276x6c285d75(), false, str2, i18, new cu2.q(Q, feed, lVar), new cu2.r(Q, lVar, context), 8, null);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f(long j17) {
        cu2.t tVar = cu2.u.f303974a;
        return ((c61.l7) i95.n0.c(c61.l7.class)).Pj().z0(j17);
    }

    public final java.util.concurrent.ConcurrentHashMap g() {
        return cu2.u.f303977d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0078, code lost:
    
        vz5.b.a(r5, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedStorage", "getLocalSenderFeedBeforeTime2 " + r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x008c, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0062, code lost:
    
        if (r5.moveToFirst() != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0064, code lost:
    
        r2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079();
        r2.mo9015xbf5d97fd(r5);
        r2.getFeedObject();
        r6.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0076, code lost:
    
        if (r5.moveToNext() != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.LinkedList h(java.lang.String r5, int r6, int r7) {
        /*
            r4 = this;
            java.lang.String r0 = "username"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            java.lang.Class<c61.l7> r0 = c61.l7.class
            i95.m r0 = i95.n0.c(r0)
            c61.l7 r0 = (c61.l7) r0
            com.tencent.mm.plugin.finder.storage.f90 r0 = r0.Pj()
            r0.getClass()
            pm0.c r1 = new pm0.c
            java.lang.String r2 = "getLocalSenderFeedBeforeTime"
            r1.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "SELECT * FROM FinderFeedItem   WHERE createTime >= "
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r6 = " AND createTime < "
            r2.append(r6)
            r2.append(r7)
            java.lang.String r6 = " AND username IN ('', '"
            r2.append(r6)
            r2.append(r5)
            java.lang.String r5 = "') ORDER BY createTime DESC"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            l75.k0 r6 = r0.f208293f
            r7 = 0
            r0 = 2
            android.database.Cursor r5 = r6.f(r5, r7, r0)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "getLocalSenderFeedBeforeTime1 "
            r6.<init>(r0)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = "Finder.FinderFeedStorage"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r6)
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            boolean r2 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L8d
            if (r2 == 0) goto L78
        L64:
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = new com.tencent.mm.plugin.finder.storage.FinderItem     // Catch: java.lang.Throwable -> L8d
            r2.<init>()     // Catch: java.lang.Throwable -> L8d
            r2.mo9015xbf5d97fd(r5)     // Catch: java.lang.Throwable -> L8d
            r2.getFeedObject()     // Catch: java.lang.Throwable -> L8d
            r6.add(r2)     // Catch: java.lang.Throwable -> L8d
            boolean r2 = r5.moveToNext()     // Catch: java.lang.Throwable -> L8d
            if (r2 != 0) goto L64
        L78:
            vz5.b.a(r5, r7)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "getLocalSenderFeedBeforeTime2 "
            r5.<init>(r7)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r5)
            return r6
        L8d:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L8f
        L8f:
            r7 = move-exception
            vz5.b.a(r5, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: cu2.t.h(java.lang.String, int, int):java.util.LinkedList");
    }

    public final java.util.concurrent.ConcurrentHashMap i() {
        return cu2.u.f303976c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b3, code lost:
    
        if ((r6 == null || r6.length() == 0) == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List j(java.util.List r17, int r18, r45.qt2 r19) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cu2.t.j(java.util.List, int, r45.qt2):java.util.List");
    }

    public final boolean k(long j17) {
        return ((c61.l7) i95.n0.c(c61.l7.class)).Pj().z0(j17) != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a5, code lost:
    
        if (r4.f208293f.p(dm.i4.f66894xc4fe047c, r5, "id=?", new java.lang.String[]{"" + r0}) > 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0047, code lost:
    
        if (r4.f208293f.p(dm.i4.f66894xc4fe047c, r5, "localId=?", new java.lang.String[]{"" + r2}) > 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x004a, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004b, code lost:
    
        r10 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 r14) {
        /*
            r13 = this;
            java.lang.String r0 = "feedObject"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r14, r0)
            long r0 = r14.f66939xc8a07680
            long r2 = r14.m59260x51f8f5b0()
            java.lang.Class<c61.l7> r4 = c61.l7.class
            i95.m r4 = i95.n0.c(r4)
            c61.l7 r4 = (c61.l7) r4
            com.tencent.mm.plugin.finder.storage.f90 r4 = r4.Pj()
            boolean r5 = r13.k(r2)
            r6 = 1
            java.lang.String r7 = "FinderFeedItem"
            java.lang.String r8 = ""
            java.lang.String r9 = "rowid"
            r10 = 0
            if (r5 == 0) goto L4d
            r4.getClass()
            android.content.ContentValues r5 = r14.mo9763xeb27878e()
            r5.remove(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r8)
            r9.append(r2)
            java.lang.String r8 = r9.toString()
            java.lang.String[] r8 = new java.lang.String[]{r8}
            l75.k0 r4 = r4.f208293f
            java.lang.String r9 = "localId=?"
            int r4 = r4.p(r7, r5, r9, r8)
            if (r4 <= 0) goto L4a
            goto L4b
        L4a:
            r6 = r10
        L4b:
            r10 = r6
            goto La8
        L4d:
            r11 = 0
            int r5 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r5 == 0) goto La8
            r4.getClass()
            if (r5 != 0) goto L86
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r11 = "update svrId "
            r5.<init>(r11)
            r5.append(r0)
            r11 = 32
            r5.append(r11)
            java.lang.String r12 = r14.m59301x3164ae()
            r5.append(r12)
            r5.append(r11)
            boolean r11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            com.tencent.mm.sdk.platformtools.z3 r11 = new com.tencent.mm.sdk.platformtools.z3
            r11.<init>()
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            java.lang.Object[] r11 = new java.lang.Object[r10]
            java.lang.String r12 = "Finder.FinderFeedStorage"
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(r12, r5, r11)
        L86:
            android.content.ContentValues r5 = r14.mo9763xeb27878e()
            r5.remove(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r8)
            r9.append(r0)
            java.lang.String r8 = r9.toString()
            java.lang.String[] r8 = new java.lang.String[]{r8}
            l75.k0 r4 = r4.f208293f
            java.lang.String r9 = "id=?"
            int r4 = r4.p(r7, r5, r9, r8)
            if (r4 <= 0) goto L4a
            goto L4b
        La8:
            if (r10 == 0) goto Laf
            long r4 = r14.m59260x51f8f5b0()
            goto Lb1
        Laf:
            r4 = -1
        Lb1:
            cu2.t r14 = cu2.u.f303974a
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r6 = "replace feedSucc:"
            r14.<init>(r6)
            r14.append(r10)
            java.lang.String r6 = ", rowId:"
            r14.append(r6)
            r14.append(r4)
            java.lang.String r4 = " localId:"
            r14.append(r4)
            r14.append(r2)
            java.lang.String r2 = " id:"
            r14.append(r2)
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            java.lang.String r0 = "Finder.FinderFeedLogic"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r14)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: cu2.t.l(com.tencent.mm.plugin.finder.storage.FinderItem):boolean");
    }

    public final void m(java.util.List list, int i17, java.lang.String username, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        if (z17) {
            int a17 = hc2.d0.a(i17);
            if ((username.length() > 0) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(username, g92.b.f351302e.T0()) && a17 == 1) {
                a17 = 3;
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                so2.j5 j5Var = (so2.j5) it.next();
                if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject = abstractC14490x69736cb5.getFeedObject().getFeedObject();
                    linkedList.add(new bu2.k0(0, feedObject.m76784x5db1b11(), feedObject, i17, abstractC14490x69736cb5.getIsUnReadCacheFeed()));
                }
            }
            bu2.e0.f106031a.a(a17, username, linkedList);
        }
    }

    public final void n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObj, "finderObj");
        java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079> linkedList = new java.util.LinkedList<>();
        linkedList.addAll(finderObj.m59214x2de915fd());
        finderObj.m59353xc44e8971(linkedList);
        l(finderObj);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 o(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderObject, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 o1Var = i17 != 4 ? i17 != 11001 ? i17 != 11003 ? new so2.o1(finderObject) : new bo2.c(finderObject) : new zn2.c(finderObject) : new zn2.a(finderObject);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = finderObject.getFeedObject().m76760x76845fea();
        java.lang.String m76197x6c03c64c = m76760x76845fea != null ? m76760x76845fea.m76197x6c03c64c() : null;
        if (m76197x6c03c64c == null || m76197x6c03c64c.length() == 0) {
            o1Var.a1(new ya2.b2());
        } else {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea2 = finderObject.getFeedObject().m76760x76845fea();
            o1Var.a1(m76760x76845fea2 != null ? ya2.d.h(m76760x76845fea2, null, false, 3, null) : null);
        }
        return o1Var;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        int mediaType = finderObject.getMediaType();
        boolean z17 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 o1Var = mediaType != 1 ? mediaType != 2 ? mediaType != 4 ? mediaType != 15 ? mediaType != 19 ? mediaType != 7 ? mediaType != 8 ? mediaType != 9 ? new so2.o1(finderObject) : new so2.h1(finderObject) : new so2.l1(finderObject) : new so2.s1(finderObject) : new so2.p1(finderObject) : new so2.n1(finderObject) : new so2.u1(finderObject) : new so2.d1(finderObject) : new so2.o1(finderObject);
        if (finderObject.m59338xecb5e178()) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = finderObject.getFeedObject().m76760x76845fea();
            java.lang.String m76197x6c03c64c = m76760x76845fea != null ? m76760x76845fea.m76197x6c03c64c() : null;
            if (m76197x6c03c64c != null && m76197x6c03c64c.length() != 0) {
                z17 = false;
            }
            if (z17) {
                o1Var.a1(new ya2.b2());
                return o1Var;
            }
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea2 = finderObject.getFeedObject().m76760x76845fea();
        o1Var.a1(m76760x76845fea2 != null ? ya2.d.h(m76760x76845fea2, null, false, 3, null) : null);
        return o1Var;
    }
}
