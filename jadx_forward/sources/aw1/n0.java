package aw1;

/* loaded from: classes12.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f96146d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f96147e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f96148f;

    /* renamed from: g, reason: collision with root package name */
    public final bw1.k f96149g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f96150h;

    /* renamed from: i, reason: collision with root package name */
    public final long f96151i;

    /* renamed from: m, reason: collision with root package name */
    public final long f96152m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab f96153n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f96154o;

    /* renamed from: p, reason: collision with root package name */
    public long f96155p = 0;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f96156q = new java.util.HashMap();

    public n0(java.util.List list, java.util.List list2, java.util.List list3, int[] iArr, long j17, long j18, boolean z17, bw1.k kVar, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        this.f96146d = list;
        this.f96148f = list2;
        this.f96147e = list3;
        this.f96150h = iArr;
        this.f96151i = j17;
        this.f96152m = j18;
        this.f96154o = z17;
        this.f96149g = kVar;
        this.f96153n = c26987xeef691ab == null ? new com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab() : c26987xeef691ab;
    }

    public static aw1.n0 b(java.util.List list, int[] iArr, long j17, long j18, boolean z17, bw1.k kVar, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        if (list.isEmpty()) {
            return new aw1.n0(null, java.util.Collections.emptyList(), null, iArr, j17, j18, z17, kVar, c26987xeef691ab);
        }
        java.lang.Object obj = list.get(0);
        if (obj instanceof java.lang.String) {
            return new aw1.n0(list, null, null, iArr, j17, j18, z17, kVar, c26987xeef691ab);
        }
        if (obj instanceof bw1.l) {
            return new aw1.n0(null, list, null, iArr, j17, j18, z17, kVar, c26987xeef691ab);
        }
        if (obj instanceof cw1.c) {
            return new aw1.n0(null, null, list, iArr, j17, j18, z17, kVar, c26987xeef691ab);
        }
        throw new java.lang.AssertionError();
    }

    public final void a(java.util.List list) {
        boolean z17 = l75.d1.f398478a;
        if (l75.d1.f398478a) {
            return;
        }
        l75.k0 s17 = c01.d9.b().s();
        xg3.m0 u17 = c01.d9.b().u();
        long F = s17.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.util.Pair pair = (android.util.Pair) it.next();
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li((java.lang.String) pair.first, ((java.lang.Long) pair.second).longValue());
            if (Li.m124847x74d37ac6() != 0 && !Li.z2()) {
                if (pt0.f0.f439742b1.h()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfo", "ignore setClean. talker: %s, msgId: %d", Li.Q0(), java.lang.Long.valueOf(Li.m124847x74d37ac6()));
                } else {
                    Li.c1(Li.f317698J | 1);
                }
                ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) u17).lb(((java.lang.Long) pair.second).longValue(), Li, true);
            }
        }
        s17.w(java.lang.Long.valueOf(F));
    }

    public final void c(java.util.List list) {
        boolean z17;
        int i17;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        loop0: while (true) {
            int i18 = 0;
            while (true) {
                boolean hasNext = it.hasNext();
                z17 = this.f96154o;
                if (!hasNext) {
                    break loop0;
                }
                ot1.h hVar = (ot1.h) it.next();
                if (hVar != null) {
                    java.lang.String t07 = hVar.t0();
                    java.util.UUID v07 = hVar.v0();
                    if (v07 == null) {
                        long j17 = hVar.f68219x9f7e1864;
                        i17 = i18;
                        if (j17 > 0) {
                            this.f96155p += j17;
                        }
                    } else {
                        i17 = i18;
                        java.util.HashMap hashMap = this.f96156q;
                        aw1.m0 m0Var = (aw1.m0) hashMap.get(v07);
                        if (m0Var == null) {
                            com.p314xaae8f345.mm.vfs.x1 m17 = com.p314xaae8f345.mm.vfs.w6.m(t07);
                            if (m17 instanceof com.p314xaae8f345.mm.vfs.k5) {
                                com.p314xaae8f345.mm.vfs.k5 k5Var = (com.p314xaae8f345.mm.vfs.k5) m17;
                                m0Var = new aw1.m0(k5Var.f294767d, k5Var.f294563i);
                                hashMap.put(v07, m0Var);
                            }
                        }
                        if (m0Var == null) {
                            this.f96155p += hVar.f68219x9f7e1864;
                        } else {
                            int i19 = m0Var.f96141c + 1;
                            m0Var.f96141c = i19;
                            if (i19 == m0Var.f96140b) {
                                this.f96155p += m0Var.f96139a;
                            }
                        }
                    }
                    com.p314xaae8f345.mm.vfs.w6.h(t07);
                    if ((hVar.f68220x2918cf02 & 4611686018427387904L) == 0) {
                        arrayList2.add(hVar);
                    }
                    if (arrayList2.size() >= 8) {
                        mt1.b0.f412724a.n().y0(arrayList2, null);
                        arrayList2.clear();
                    }
                    i18 = i17 + 1;
                    android.util.Pair create = android.util.Pair.create(hVar.f68230xdec927b, java.lang.Long.valueOf(hVar.f68223x297eb4f7));
                    if (hashSet.add(create)) {
                        arrayList.add(create);
                    }
                    if (i18 > 128 || arrayList.size() > 32) {
                        break;
                    }
                }
            }
            if (z17) {
                a(arrayList);
            }
            arrayList.clear();
        }
        if (!arrayList2.isEmpty()) {
            mt1.b0.f412724a.n().y0(arrayList2, null);
        }
        if (arrayList.isEmpty() || !z17) {
            return;
        }
        a(arrayList);
    }

    public final java.lang.String d() {
        return hashCode() + "";
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.util.Iterator it;
        java.util.ArrayList arrayList;
        java.util.Iterator it6;
        java.util.List list;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.util.Iterator it7;
        com.p314xaae8f345.mm.vfs.q7.h("image2", false);
        com.p314xaae8f345.mm.vfs.q7.h("video", false);
        com.p314xaae8f345.mm.vfs.q7.h("voice2", false);
        java.lang.String str9 = "attachment";
        com.p314xaae8f345.mm.vfs.q7.h("attachment", false);
        java.lang.String str10 = "Download";
        com.p314xaae8f345.mm.vfs.q7.h("Download", false);
        java.lang.String str11 = "record";
        com.p314xaae8f345.mm.vfs.q7.h("record", false);
        java.lang.String str12 = "c2c";
        com.p314xaae8f345.mm.vfs.q7.h("c2c", false);
        bw1.k kVar = this.f96149g;
        if (kVar != null) {
            kVar.Y4();
        }
        aw1.l0.f96101a.l();
        java.util.List list2 = this.f96146d;
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab = this.f96153n;
        if (list2 != null) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            int size = list2.size();
            java.util.Iterator it8 = list2.iterator();
            int i17 = 0;
            while (it8.hasNext()) {
                java.lang.String str13 = (java.lang.String) it8.next();
                if (c26987xeef691ab.m108008xc9602be3()) {
                    break;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str13)) {
                    str5 = str9;
                    str6 = str10;
                    str7 = str11;
                    str8 = str12;
                    it7 = it8;
                } else {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    str7 = str11;
                    str8 = str12;
                    str5 = str9;
                    str6 = str10;
                    it7 = it8;
                    java.util.List S1 = mt1.b0.f412724a.n().S1(str13, this.f96152m, this.f96151i, this.f96150h, false, false, true);
                    int size2 = ((java.util.ArrayList) S1).size();
                    c(S1);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeleteFileByWxIndex", "%s deleteByName [%s] [%d] cost[%d]", d(), str13, java.lang.Integer.valueOf(size2), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - currentTimeMillis));
                }
                int i18 = i17 + 1;
                if (kVar != null) {
                    kVar.K2(i18, size);
                }
                i17 = i18;
                str11 = str7;
                str12 = str8;
                str9 = str5;
                str10 = str6;
                it8 = it7;
            }
            str = str9;
            str2 = str10;
            str3 = str11;
            str4 = str12;
            if (kVar != null) {
                kVar.j6(c26987xeef691ab.m108008xc9602be3(), this.f96155p);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeleteFileByWxIndex", "%s deleteByUsername cost[%d]", d(), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        } else {
            str = "attachment";
            str2 = "Download";
            str3 = "record";
            str4 = "c2c";
            int[] iArr = this.f96150h;
            java.util.List list3 = this.f96148f;
            if (list3 != null) {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                int size3 = list3.size();
                java.util.Iterator it9 = list3.iterator();
                int i19 = 0;
                while (it9.hasNext()) {
                    bw1.l lVar = (bw1.l) it9.next();
                    if (c26987xeef691ab.m108008xc9602be3()) {
                        break;
                    }
                    if (iArr != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(((java.util.ArrayList) lVar.f106356o).size());
                        java.util.Iterator it10 = ((java.util.ArrayList) lVar.f106356o).iterator();
                        while (it10.hasNext()) {
                            ot1.h hVar = (ot1.h) it10.next();
                            java.util.Iterator it11 = it9;
                            if (ot1.h.w0(iArr, hVar.f68224x169c833e)) {
                                arrayList2.add(hVar);
                            }
                            it9 = it11;
                        }
                        it6 = it9;
                        list = arrayList2;
                    } else {
                        it6 = it9;
                        list = lVar.f106356o;
                    }
                    c(list);
                    i19++;
                    if (kVar != null) {
                        kVar.K2(i19, size3);
                    }
                    it9 = it6;
                }
                if (kVar != null) {
                    kVar.j6(c26987xeef691ab.m108008xc9602be3(), this.f96155p);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeleteFileByWxIndex", "%s deleteByNewAnalyseItem cost[%d]", d(), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime2));
            } else {
                java.util.List list4 = this.f96147e;
                if (list4 == null) {
                    throw new java.lang.AssertionError();
                }
                boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
                int size4 = list4.size();
                java.util.Iterator it12 = list4.iterator();
                int i27 = 0;
                while (it12.hasNext()) {
                    cw1.c cVar = (cw1.c) it12.next();
                    if (c26987xeef691ab.m108008xc9602be3()) {
                        break;
                    }
                    if (iArr != null) {
                        arrayList = new java.util.ArrayList(cVar.f304372h.size());
                        java.util.Iterator it13 = cVar.f304372h.iterator();
                        while (it13.hasNext()) {
                            ot1.h hVar2 = (ot1.h) it13.next();
                            java.util.Iterator it14 = it12;
                            if (ot1.h.w0(iArr, hVar2.f68224x169c833e)) {
                                arrayList.add(hVar2);
                            }
                            it12 = it14;
                        }
                        it = it12;
                    } else {
                        it = it12;
                        arrayList = cVar.f304372h;
                    }
                    c(arrayList);
                    i27++;
                    if (kVar != null) {
                        kVar.K2(i27, size4);
                    }
                    it12 = it;
                }
                if (kVar != null) {
                    kVar.j6(c26987xeef691ab.m108008xc9602be3(), this.f96155p);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeleteFileByWxIndex", "%s deleteByGroups cost[%d]", d(), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime3));
            }
        }
        aw1.l0 l0Var = aw1.l0.f96101a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompressOriginalMediaService", "wakeTaskManually");
        aw1.l0.f96105e = false;
        l0Var.n();
        com.p314xaae8f345.mm.vfs.q7.h("image2", true);
        com.p314xaae8f345.mm.vfs.q7.h("video", true);
        com.p314xaae8f345.mm.vfs.q7.h("voice2", true);
        com.p314xaae8f345.mm.vfs.q7.h(str, true);
        com.p314xaae8f345.mm.vfs.q7.h(str2, true);
        com.p314xaae8f345.mm.vfs.q7.h(str3, true);
        com.p314xaae8f345.mm.vfs.q7.h(str4, true);
    }
}
