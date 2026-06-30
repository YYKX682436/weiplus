package d83;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.m1.class})
/* loaded from: classes15.dex */
public final class u extends i95.w implements e70.z {

    /* renamed from: d, reason: collision with root package name */
    public final int f308562d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final int f308563e = 2;

    /* renamed from: f, reason: collision with root package name */
    public final int f308564f = 3;

    /* renamed from: g, reason: collision with root package name */
    public final int f308565g = 4;

    /* renamed from: h, reason: collision with root package name */
    public final int f308566h = 5;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Object f308567i = new java.lang.Object();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f308568m = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f308569n = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f308570o = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf f308571p;

    public final void Ai(java.util.List list, java.util.Map map, java.util.List list2, java.util.Map map2, e70.t tVar, int i17, long j17, int i18, int i19, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, e70.s sVar) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (tVar != e70.t.f331388d) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                hashMap.put((java.lang.String) it.next(), java.lang.Integer.valueOf(tVar.ordinal()));
            }
        } else if (map2 != null) {
            hashMap.putAll(map2);
        }
        if (sVar != null) {
            sVar.d(list, map, list2, hashMap, tVar, i17, j17, i18, i19, gVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Bi(e70.w r12, e70.s r13) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d83.u.Bi(e70.w, e70.s):void");
    }

    public void Di() {
        d83.e0 e0Var = d83.e0.f308491a;
        e0Var.getClass();
        synchronized (d83.e0.f308493c) {
            if (!d83.e0.f308492b) {
                e0Var.a();
                d83.e0.f308492b = true;
            }
        }
    }

    public final void Ni() {
        synchronized (this.f308567i) {
            com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf c2959x9083e9bf = this.f308571p;
            if (c2959x9083e9bf == null && c2959x9083e9bf == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkFeatureService", "initNetworkManager!");
                com.p314xaae8f345.p342x5fa53e3.C2950xf0971ac1 c2950xf0971ac1 = d83.e0.f308496f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c2950xf0971ac1);
                com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf m22069xfd0c3b5f = c2950xf0971ac1.m22069xfd0c3b5f();
                this.f308571p = m22069xfd0c3b5f;
                if (m22069xfd0c3b5f != null) {
                    m22069xfd0c3b5f.m22150xef84ec1b("ILinkFeatureService.initNetworkManager", new d83.t(this));
                }
            }
        }
    }

    public final java.util.ArrayList Ri(java.util.LinkedList linkedList) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.tq6 tq6Var = (r45.tq6) it.next();
            f83.b bVar = new f83.b();
            int i17 = tq6Var.f468247p;
            bVar.f69720xb554b1ee = i17;
            bVar.f69717x65481d0f = tq6Var.f468238d;
            bVar.f69719xf53faade = tq6Var.f468239e;
            if (i17 >= 0) {
                bVar.f69724x8a60a7a5 = tq6Var.f468240f;
                bVar.f69721xf5421054 = tq6Var.f468241g;
                bVar.f69725x4b6e88aa = tq6Var.f468243i;
                bVar.f69716x4b6e68b9 = tq6Var.f468242h;
                bVar.f69695xac3be4e = tq6Var.f468244m;
                bVar.f69723xf542bf8d = tq6Var.f468248q;
                bVar.f69718x1c0c829f = tq6Var.f468249r;
                bVar.f69722x2d8daf48 = tq6Var.f468250s;
                r45.qk0 qk0Var = tq6Var.f468251t;
                if (qk0Var != null) {
                    bVar.f69709x80b7fe93 = qk0Var.f465602d;
                    bVar.f69710xc1764fdd = qk0Var.f465603e;
                    bVar.f69713x5efdd93e = qk0Var.f465604f;
                    bVar.f69715x5efdf92f = qk0Var.f465605g;
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = qk0Var.f465606h;
                    bVar.f69712x5efdd21f = gVar != null ? gVar.g() : null;
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = qk0Var.f465607i;
                    bVar.f69711xface616d = gVar2 != null ? gVar2.g() : null;
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = qk0Var.f465608m;
                    bVar.f69714x5efdf35a = gVar3 != null ? gVar3.g() : null;
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = qk0Var.f465609n;
                    bVar.f69708x5efdac04 = gVar4 != null ? gVar4.g() : null;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                int size = tq6Var.f468245n.f463989d.size();
                for (int i18 = 0; i18 < size; i18++) {
                    arrayList2.add(kz5.b1.e(new jz5.l(((r45.yq6) tq6Var.f468245n.f463989d.get(i18)).f472841d, ((r45.yq6) tq6Var.f468245n.f463989d.get(i18)).f472842e)));
                }
                bVar.v0(arrayList2);
                r45.xq6 xq6Var = tq6Var.f468246o;
                if (xq6Var != null) {
                    bVar.f69694x9e1e902 = xq6Var.f471875d;
                    bVar.f69696x17f1b99d = xq6Var.f471876e;
                    bVar.f69706x17f9df4b = xq6Var.f471877f;
                    bVar.f69705xd77b94f4 = xq6Var.f471878g;
                    bVar.f69707xd77bb4e5 = xq6Var.f471879h;
                    r45.qk0 qk0Var2 = xq6Var.f471880i;
                    if (qk0Var2 != null) {
                        bVar.f69698x9e9ebfce = qk0Var2.f465602d;
                        bVar.f69699x1f53fb98 = qk0Var2.f465603e;
                        bVar.f69702x3eec84a3 = qk0Var2.f465604f;
                        bVar.f69704x3eeca494 = qk0Var2.f465605g;
                        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = qk0Var2.f465606h;
                        bVar.f69701x3eec7d84 = gVar5 != null ? gVar5.g() : null;
                        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = qk0Var2.f465607i;
                        bVar.f69700x4c5a3568 = gVar6 != null ? gVar6.g() : null;
                        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar7 = qk0Var2.f465608m;
                        bVar.f69703x3eec9ebf = gVar7 != null ? gVar7.g() : null;
                        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar8 = qk0Var2.f465609n;
                        bVar.f69697x3eec5769 = gVar8 != null ? gVar8.g() : null;
                    }
                }
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkFeatureService", "onAccountReleased!");
        super.mo836xb8969aab(context);
        synchronized (this.f308567i) {
            com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf c2959x9083e9bf = this.f308571p;
            if (c2959x9083e9bf != null) {
                c2959x9083e9bf.m22139xd8e82554();
                this.f308571p = null;
            }
        }
        d83.e0 e0Var = d83.e0.f308491a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkInitMgr", "logout: " + d83.e0.f308492b);
        if (d83.e0.f308492b && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkInitMgr", "logout: real logout");
            com.p314xaae8f345.p342x5fa53e3.C2950xf0971ac1 c2950xf0971ac1 = d83.e0.f308496f;
            if (c2950xf0971ac1 != null) {
                c2950xf0971ac1.m22067x6573e312(d83.c0.f308487a);
            }
        }
        synchronized (d83.e0.f308493c) {
            if (d83.e0.f308492b) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkInitMgr", "unInitILink");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(((wx.q) ((wx.c1) i95.n0.c(wx.c1.class))).f531962d, "releaseAffAsync");
                wx.o.f531957a.b();
                ((jp5.o) i95.n0.c(jp5.o.class)).j();
                ((fa0.t) ((fa0.q) i95.n0.c(fa0.q.class))).getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkNativeEngine", "unInit ret:" + com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.f231118c.m120016x973cdf69());
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                    ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).getClass();
                    if (yn1.z0.f545466a.n()) {
                        com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.f.f298923b.n(bw5.he0.MOBILE);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MM.Mig.RoamMigrationService", "[closeCDNConnection] GlobalHolder is not initialized");
                    }
                }
                com.p314xaae8f345.p342x5fa53e3.C2950xf0971ac1 c2950xf0971ac12 = d83.e0.f308496f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c2950xf0971ac12);
                c2950xf0971ac12.m22068xd8e82554();
                d83.e0.f308496f = null;
                com.p314xaae8f345.p342x5fa53e3.C2952xf0b8386c.m22101x9cf0d20b().m22117xcde67f29();
                com.p314xaae8f345.mm.app.w.INSTANCE.p(d83.e0.f308498h);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1782x5fa53e3.p1783xd8ddcc92.a) ((jz5.n) d83.e0.f308497g).mo141623x754a37bb()).b();
                d83.e0.f308492b = false;
            }
        }
        p3325xe03a0797.p3326xc267989b.z0.e(d83.e0.f308494d, null, 1, null);
        d83.e0.f308494d = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
    }

    public final void wi(java.util.List list, java.util.Map map, java.util.Map map2, java.util.List list2, java.util.Map map3, e70.t tVar, int i17, long j17, e70.s sVar) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (tVar != e70.t.f331388d) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                hashMap.put((java.lang.String) it.next(), java.lang.Integer.valueOf(tVar.ordinal()));
            }
        } else if (map3 != null) {
            hashMap.putAll(map3);
        }
        if (sVar != null) {
            sVar.a(list, map, map2, list2, hashMap, tVar, i17, j17);
        }
    }
}
