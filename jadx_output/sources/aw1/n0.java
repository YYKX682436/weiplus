package aw1;

/* loaded from: classes12.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f14613d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f14614e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f14615f;

    /* renamed from: g, reason: collision with root package name */
    public final bw1.k f14616g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f14617h;

    /* renamed from: i, reason: collision with root package name */
    public final long f14618i;

    /* renamed from: m, reason: collision with root package name */
    public final long f14619m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.wcdb.support.CancellationSignal f14620n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f14621o;

    /* renamed from: p, reason: collision with root package name */
    public long f14622p = 0;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f14623q = new java.util.HashMap();

    public n0(java.util.List list, java.util.List list2, java.util.List list3, int[] iArr, long j17, long j18, boolean z17, bw1.k kVar, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        this.f14613d = list;
        this.f14615f = list2;
        this.f14614e = list3;
        this.f14617h = iArr;
        this.f14618i = j17;
        this.f14619m = j18;
        this.f14621o = z17;
        this.f14616g = kVar;
        this.f14620n = cancellationSignal == null ? new com.tencent.wcdb.support.CancellationSignal() : cancellationSignal;
    }

    public static aw1.n0 b(java.util.List list, int[] iArr, long j17, long j18, boolean z17, bw1.k kVar, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        if (list.isEmpty()) {
            return new aw1.n0(null, java.util.Collections.emptyList(), null, iArr, j17, j18, z17, kVar, cancellationSignal);
        }
        java.lang.Object obj = list.get(0);
        if (obj instanceof java.lang.String) {
            return new aw1.n0(list, null, null, iArr, j17, j18, z17, kVar, cancellationSignal);
        }
        if (obj instanceof bw1.l) {
            return new aw1.n0(null, list, null, iArr, j17, j18, z17, kVar, cancellationSignal);
        }
        if (obj instanceof cw1.c) {
            return new aw1.n0(null, null, list, iArr, j17, j18, z17, kVar, cancellationSignal);
        }
        throw new java.lang.AssertionError();
    }

    public final void a(java.util.List list) {
        boolean z17 = l75.d1.f316945a;
        if (l75.d1.f316945a) {
            return;
        }
        l75.k0 s17 = c01.d9.b().s();
        xg3.m0 u17 = c01.d9.b().u();
        long F = s17.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.util.Pair pair = (android.util.Pair) it.next();
            com.tencent.mm.storage.f9 Li = pt0.f0.Li((java.lang.String) pair.first, ((java.lang.Long) pair.second).longValue());
            if (Li.getMsgId() != 0 && !Li.z2()) {
                if (pt0.f0.f358209b1.h()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MsgInfo", "ignore setClean. talker: %s, msgId: %d", Li.Q0(), java.lang.Long.valueOf(Li.getMsgId()));
                } else {
                    Li.c1(Li.f236165J | 1);
                }
                ((com.tencent.mm.storage.g9) u17).lb(((java.lang.Long) pair.second).longValue(), Li, true);
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
                z17 = this.f14621o;
                if (!hasNext) {
                    break loop0;
                }
                ot1.h hVar = (ot1.h) it.next();
                if (hVar != null) {
                    java.lang.String t07 = hVar.t0();
                    java.util.UUID v07 = hVar.v0();
                    if (v07 == null) {
                        long j17 = hVar.field_diskSpace;
                        i17 = i18;
                        if (j17 > 0) {
                            this.f14622p += j17;
                        }
                    } else {
                        i17 = i18;
                        java.util.HashMap hashMap = this.f14623q;
                        aw1.m0 m0Var = (aw1.m0) hashMap.get(v07);
                        if (m0Var == null) {
                            com.tencent.mm.vfs.x1 m17 = com.tencent.mm.vfs.w6.m(t07);
                            if (m17 instanceof com.tencent.mm.vfs.k5) {
                                com.tencent.mm.vfs.k5 k5Var = (com.tencent.mm.vfs.k5) m17;
                                m0Var = new aw1.m0(k5Var.f213234d, k5Var.f213030i);
                                hashMap.put(v07, m0Var);
                            }
                        }
                        if (m0Var == null) {
                            this.f14622p += hVar.field_diskSpace;
                        } else {
                            int i19 = m0Var.f14608c + 1;
                            m0Var.f14608c = i19;
                            if (i19 == m0Var.f14607b) {
                                this.f14622p += m0Var.f14606a;
                            }
                        }
                    }
                    com.tencent.mm.vfs.w6.h(t07);
                    if ((hVar.field_flags & 4611686018427387904L) == 0) {
                        arrayList2.add(hVar);
                    }
                    if (arrayList2.size() >= 8) {
                        mt1.b0.f331191a.n().y0(arrayList2, null);
                        arrayList2.clear();
                    }
                    i18 = i17 + 1;
                    android.util.Pair create = android.util.Pair.create(hVar.field_username, java.lang.Long.valueOf(hVar.field_msgId));
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
            mt1.b0.f331191a.n().y0(arrayList2, null);
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
        com.tencent.mm.vfs.q7.h("image2", false);
        com.tencent.mm.vfs.q7.h("video", false);
        com.tencent.mm.vfs.q7.h("voice2", false);
        java.lang.String str9 = "attachment";
        com.tencent.mm.vfs.q7.h("attachment", false);
        java.lang.String str10 = "Download";
        com.tencent.mm.vfs.q7.h("Download", false);
        java.lang.String str11 = "record";
        com.tencent.mm.vfs.q7.h("record", false);
        java.lang.String str12 = "c2c";
        com.tencent.mm.vfs.q7.h("c2c", false);
        bw1.k kVar = this.f14616g;
        if (kVar != null) {
            kVar.Y4();
        }
        aw1.l0.f14568a.l();
        java.util.List list2 = this.f14613d;
        com.tencent.wcdb.support.CancellationSignal cancellationSignal = this.f14620n;
        if (list2 != null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            int size = list2.size();
            java.util.Iterator it8 = list2.iterator();
            int i17 = 0;
            while (it8.hasNext()) {
                java.lang.String str13 = (java.lang.String) it8.next();
                if (cancellationSignal.isCanceled()) {
                    break;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(str13)) {
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
                    java.util.List S1 = mt1.b0.f331191a.n().S1(str13, this.f14619m, this.f14618i, this.f14617h, false, false, true);
                    int size2 = ((java.util.ArrayList) S1).size();
                    c(S1);
                    com.tencent.mars.xlog.Log.i("MicroMsg.DeleteFileByWxIndex", "%s deleteByName [%s] [%d] cost[%d]", d(), str13, java.lang.Integer.valueOf(size2), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - currentTimeMillis));
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
                kVar.j6(cancellationSignal.isCanceled(), this.f14622p);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.DeleteFileByWxIndex", "%s deleteByUsername cost[%d]", d(), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        } else {
            str = "attachment";
            str2 = "Download";
            str3 = "record";
            str4 = "c2c";
            int[] iArr = this.f14617h;
            java.util.List list3 = this.f14615f;
            if (list3 != null) {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                int size3 = list3.size();
                java.util.Iterator it9 = list3.iterator();
                int i19 = 0;
                while (it9.hasNext()) {
                    bw1.l lVar = (bw1.l) it9.next();
                    if (cancellationSignal.isCanceled()) {
                        break;
                    }
                    if (iArr != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(((java.util.ArrayList) lVar.f24823o).size());
                        java.util.Iterator it10 = ((java.util.ArrayList) lVar.f24823o).iterator();
                        while (it10.hasNext()) {
                            ot1.h hVar = (ot1.h) it10.next();
                            java.util.Iterator it11 = it9;
                            if (ot1.h.w0(iArr, hVar.field_msgSubType)) {
                                arrayList2.add(hVar);
                            }
                            it9 = it11;
                        }
                        it6 = it9;
                        list = arrayList2;
                    } else {
                        it6 = it9;
                        list = lVar.f24823o;
                    }
                    c(list);
                    i19++;
                    if (kVar != null) {
                        kVar.K2(i19, size3);
                    }
                    it9 = it6;
                }
                if (kVar != null) {
                    kVar.j6(cancellationSignal.isCanceled(), this.f14622p);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.DeleteFileByWxIndex", "%s deleteByNewAnalyseItem cost[%d]", d(), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime2));
            } else {
                java.util.List list4 = this.f14614e;
                if (list4 == null) {
                    throw new java.lang.AssertionError();
                }
                boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
                int size4 = list4.size();
                java.util.Iterator it12 = list4.iterator();
                int i27 = 0;
                while (it12.hasNext()) {
                    cw1.c cVar = (cw1.c) it12.next();
                    if (cancellationSignal.isCanceled()) {
                        break;
                    }
                    if (iArr != null) {
                        arrayList = new java.util.ArrayList(cVar.f222839h.size());
                        java.util.Iterator it13 = cVar.f222839h.iterator();
                        while (it13.hasNext()) {
                            ot1.h hVar2 = (ot1.h) it13.next();
                            java.util.Iterator it14 = it12;
                            if (ot1.h.w0(iArr, hVar2.field_msgSubType)) {
                                arrayList.add(hVar2);
                            }
                            it12 = it14;
                        }
                        it = it12;
                    } else {
                        it = it12;
                        arrayList = cVar.f222839h;
                    }
                    c(arrayList);
                    i27++;
                    if (kVar != null) {
                        kVar.K2(i27, size4);
                    }
                    it12 = it;
                }
                if (kVar != null) {
                    kVar.j6(cancellationSignal.isCanceled(), this.f14622p);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.DeleteFileByWxIndex", "%s deleteByGroups cost[%d]", d(), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime3));
            }
        }
        aw1.l0 l0Var = aw1.l0.f14568a;
        com.tencent.mars.xlog.Log.i("MicroMsg.CompressOriginalMediaService", "wakeTaskManually");
        aw1.l0.f14572e = false;
        l0Var.n();
        com.tencent.mm.vfs.q7.h("image2", true);
        com.tencent.mm.vfs.q7.h("video", true);
        com.tencent.mm.vfs.q7.h("voice2", true);
        com.tencent.mm.vfs.q7.h(str, true);
        com.tencent.mm.vfs.q7.h(str2, true);
        com.tencent.mm.vfs.q7.h(str3, true);
        com.tencent.mm.vfs.q7.h(str4, true);
    }
}
