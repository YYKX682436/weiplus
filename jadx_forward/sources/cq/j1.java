package cq;

/* loaded from: classes2.dex */
public abstract class j1 {
    public static final void a(cq.k kVar, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, java.util.List objectList, long j17, boolean z17, r45.qt2 qt2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectList, "objectList");
        java.util.Iterator it = objectList.iterator();
        while (true) {
            int i17 = 0;
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it.next();
            bu2.j jVar = bu2.j.f106067a;
            if (v0Var != null) {
                i17 = v0Var.mo13822xfb85f7b0();
            }
            jVar.n(c14994x9b99c079, new bu2.h(i17, j17));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("request: ");
        sb6.append(j17);
        sb6.append(", allowSimpleResult: ");
        sb6.append(z17);
        sb6.append(", switch: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        sb6.append(((java.lang.Boolean) t70Var.j1().r()).booleanValue());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneFinderFeedBase", sb6.toString());
        t70Var.j1().l();
        java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079> arrayList = new java.util.ArrayList();
        java.util.Iterator it6 = objectList.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            r45.dm2 m76806xdef68064 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) next).getFeedObject().m76806xdef68064();
            if (m76806xdef68064 != null && m76806xdef68064.m75939xb282bd08(40) == 1) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0792 : arrayList) {
            r45.rv0 rv0Var = new r45.rv0();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedCgi", "getBatchFeed: ".concat(pm0.v.u(c14994x9b99c0792.m59251x5db1b11())));
            rv0Var.set(0, java.lang.Long.valueOf(c14994x9b99c0792.m59251x5db1b11()));
            arrayList2.add(rv0Var);
        }
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.j1().r()).booleanValue() && z17 && (!arrayList2.isEmpty())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneFinderFeedBase", "listSize: " + arrayList2.size());
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.addAll(arrayList2);
            new az2.a(linkedList, qt2Var, 5).l().K(new cq.l(v0Var, j17));
        }
    }

    public static void b(cq.k kVar, java.lang.String username, long j17, java.lang.String objectNonceId, boolean z17, java.lang.String str, int i17, yz5.l lVar, yz5.l lVar2, int i18, java.lang.Object obj) {
        boolean z18 = (i18 & 8) != 0 ? false : z17;
        java.lang.String clientId = (i18 & 16) != 0 ? "" : str;
        int i19 = (i18 & 32) != 0 ? 0 : i17;
        yz5.l lVar3 = (i18 & 64) != 0 ? null : lVar;
        yz5.l lVar4 = (i18 & 128) == 0 ? lVar2 : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectNonceId, "objectNonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clientId, "clientId");
        pm0.v.T(new bq.q(username, j17, objectNonceId, z18, clientId, i19).l(), new cq.o(lVar3, lVar4, j17));
    }

    public static final void c(cq.k kVar, android.content.Context context, r45.qt2 qt2Var, long j17, java.lang.String str, java.lang.String objectNonceId, java.lang.String content, long j18, int i17, int i18, long j19, long j27, int i19, long j28, yz5.l lVar, yz5.l lVar2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectNonceId, "objectNonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        pq5.g q17 = new cb2.a(qt2Var, j17, str, objectNonceId, content, j18, i17, i18, j19, j27, i19, j28).l().q(new cq.t(lVar, lVar2));
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            q17.f(abstractActivityC21394xb3d2c0cf);
        }
    }

    public static final void d(cq.k kVar, r45.qt2 qt2Var, java.lang.String finderUsername, r45.xw4 item, yz5.l lVar, yz5.l lVar2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        pm0.v.T(new bq.k(qt2Var, finderUsername, item).l(), new cq.v(lVar, lVar2));
    }

    public static final void e(cq.k kVar, java.lang.String userName, long j17, r45.qt2 qt2Var, long j18, long j19, com.p314xaae8f345.mm.p2495xc50a8b8b.g lastBuffer, int i17, long j27, yz5.l lVar, yz5.l lVar2, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lastBuffer, "lastBuffer");
        pm0.v.T(new bq.p(userName, j17, qt2Var, j18, j19, lastBuffer, i17, j27, aVar).l(), new cq.z(lVar, lVar2));
    }

    public static final void f(cq.k kVar, r45.qt2 qt2Var, int i17, java.util.List extStats, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extStats, "extStats");
        new bq.t(qt2Var, i17, extStats, str).l();
    }

    public static void g(cq.k kVar, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feed, long j17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.qt2 qt2Var, int i17, java.util.LinkedList linkedList, java.lang.String clientUdfKv, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, yz5.l lVar, yz5.l lVar2, int i18, java.lang.Object obj) {
        long j18 = (i18 & 4) != 0 ? 0L : j17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = (i18 & 8) != 0 ? null : gVar;
        r45.qt2 qt2Var2 = (i18 & 16) != 0 ? null : qt2Var;
        int i19 = (i18 & 32) != 0 ? 0 : i17;
        java.util.LinkedList linkedList2 = (i18 & 64) != 0 ? null : linkedList;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = (i18 & 256) != 0 ? null : gVar2;
        yz5.l lVar3 = (i18 & 512) != 0 ? null : lVar;
        yz5.l lVar4 = (i18 & 1024) != 0 ? null : lVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clientUdfKv, "clientUdfKv");
        pq5.g q17 = new bq.d0(feed, j18, gVar3, qt2Var2, i19, linkedList2, clientUdfKv, gVar4).l().q(new cq.e0(lVar3, lVar4));
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            q17.f(abstractActivityC21394xb3d2c0cf);
        }
    }

    public static void h(cq.k kVar, int i17, int i18, java.lang.String username, java.lang.Boolean bool, yz5.q qVar, yz5.l lVar, int i19, java.lang.Object obj) {
        if ((i19 & 8) != 0) {
            bool = null;
        }
        if ((i19 & 16) != 0) {
            qVar = null;
        }
        if ((i19 & 32) != 0) {
            lVar = null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        bq.q0 q0Var = new bq.q0(i17, i18, username, bool);
        pm0.v.T(q0Var.l(), new cq.h0(qVar, q0Var, lVar));
    }

    public static final void i(cq.k kVar, java.lang.String userName, int i17, long j17, long j18, r45.qt2 contextObj, yz5.l lVar, yz5.l lVar2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        new bq.j1(userName, i17, j17, j18, contextObj).l().q(new cq.k0(lVar, lVar2));
    }

    public static final void j(cq.k kVar, java.lang.String filePath, int i17, java.lang.String str, int i18, p012xc85e97e9.p093xedfae76a.y yVar, yz5.q qVar, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        boolean z17 = true;
        if (filePath.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("requestFinderUploadHeadImg", "filePath is null");
            if (lVar != null) {
                lVar.mo146xb9724478(null);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("requestFinderUploadHeadImg", "filePath " + filePath + " and size: " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(com.p314xaae8f345.mm.vfs.w6.k(filePath)) + " total:" + com.p314xaae8f345.mm.vfs.w6.k(filePath));
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        f0Var.f391649d = 20;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            ((ku5.t0) ku5.t0.f394148d).q(new cq.t0(filePath, i17, lVar, yVar, f0Var, qVar));
        } else {
            l(filePath, i17, lVar, yVar, f0Var, qVar, str, i18, 0);
        }
    }

    public static final void l(java.lang.String str, int i17, yz5.l lVar, p012xc85e97e9.p093xedfae76a.y yVar, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, yz5.q qVar, java.lang.String str2, int i18, int i19) {
        ((ku5.t0) ku5.t0.f394148d).q(new cq.w0(str, i19, i17, str2, i18, lVar, yVar, f0Var, qVar));
    }

    public static void m(cq.k kVar, java.lang.String userName, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, int i17, yz5.l lVar, yz5.l lVar2, int i18, java.lang.Object obj) {
        java.lang.String eventName = (i18 & 2) != 0 ? "" : str;
        java.lang.String eventDesc = (i18 & 4) != 0 ? "" : str2;
        java.lang.String coverUrl = (i18 & 8) == 0 ? str3 : "";
        long j18 = (i18 & 16) != 0 ? 0L : j17;
        int i19 = (i18 & 32) != 0 ? 0 : i17;
        yz5.l lVar3 = (i18 & 64) != 0 ? null : lVar;
        yz5.l lVar4 = (i18 & 128) == 0 ? lVar2 : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventName, "eventName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventDesc, "eventDesc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverUrl, "coverUrl");
        pm0.v.T(new bq.h1(userName, eventName, eventDesc, coverUrl, j18, i19).l(), new cq.e1(lVar3, lVar4));
    }

    public static bq.z1 n(cq.k kVar, java.lang.String reqUsername, long j17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i17, r45.qt2 qt2Var, int i18, long j18, boolean z17, java.lang.String str, long j19, java.lang.Integer num, java.lang.Long l17, java.lang.String str2, boolean z18, boolean z19, java.lang.Long l18, boolean z27, r45.a34 a34Var, r45.y13 y13Var, p012xc85e97e9.p093xedfae76a.y yVar, java.lang.String str3, yz5.p pVar, yz5.p pVar2, int i19, java.lang.Object obj) {
        long j27 = (i19 & 2) != 0 ? 0L : j17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = (i19 & 4) != 0 ? null : gVar;
        int i27 = (i19 & 8) != 0 ? 0 : i17;
        int i28 = (i19 & 32) != 0 ? 0 : i18;
        long j28 = (i19 & 64) != 0 ? 0L : j18;
        boolean z28 = (i19 & 128) != 0 ? false : z17;
        java.lang.String bizUsername = (i19 & 256) != 0 ? "" : str;
        long j29 = (i19 & 512) != 0 ? 0L : j19;
        java.lang.Integer num2 = (i19 & 1024) != 0 ? 0 : num;
        java.lang.Long l19 = (i19 & 2048) != 0 ? 0L : l17;
        java.lang.String liveNoticeId = (i19 & 4096) != 0 ? "" : str2;
        boolean z29 = (i19 & 8192) != 0 ? false : z18;
        boolean z37 = (i19 & 16384) != 0 ? false : z19;
        java.lang.Long l27 = (32768 & i19) != 0 ? 0L : l18;
        boolean z38 = (65536 & i19) != 0 ? false : z27;
        r45.a34 a34Var2 = (131072 & i19) != 0 ? null : a34Var;
        r45.y13 y13Var2 = (262144 & i19) != 0 ? null : y13Var;
        p012xc85e97e9.p093xedfae76a.y yVar2 = (524288 & i19) != 0 ? null : yVar;
        java.lang.String str4 = (1048576 & i19) != 0 ? null : str3;
        yz5.p pVar3 = (2097152 & i19) != 0 ? null : pVar;
        yz5.p pVar4 = (i19 & 4194304) != 0 ? null : pVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqUsername, "reqUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveNoticeId, "liveNoticeId");
        bq.z1 z1Var = new bq.z1(reqUsername, j27, gVar2, i27, qt2Var, i28, j28, z28, bizUsername, j29, num2, l19, liveNoticeId, z29, z37, l27, z38, a34Var2, y13Var2, str4);
        pq5.g l28 = z1Var.l();
        if (yVar2 != null) {
            l28.I(yVar2);
        }
        pm0.v.T(l28, new cq.i1(pVar3, z1Var, pVar4));
        return z1Var;
    }
}
