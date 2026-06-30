package oy1;

/* loaded from: classes13.dex */
public final class c0 implements qy1.n {

    /* renamed from: a, reason: collision with root package name */
    public final int f431379a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f431380b;

    /* renamed from: c, reason: collision with root package name */
    public long f431381c;

    /* renamed from: d, reason: collision with root package name */
    public int f431382d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f431383e = new java.util.LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f431384f = new java.util.LinkedHashSet();

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f431385g;

    /* renamed from: h, reason: collision with root package name */
    public final py1.b f431386h;

    /* renamed from: i, reason: collision with root package name */
    public final qy1.b0 f431387i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f431388j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f431389k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f431390l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f431391m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f431392n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f431393o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Map f431394p;

    /* renamed from: q, reason: collision with root package name */
    public long f431395q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f431396r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.u0 f431397s;

    /* JADX WARN: Can't wrap try/catch for region: R(12:8|(2:9|10)|(10:12|d6|17|18|19|20|(5:22|10e|27|28|29)|37|38|29)|46|18|19|20|(0)|37|38|29|6) */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010c A[Catch: Exception -> 0x0118, TryCatch #2 {Exception -> 0x0118, blocks: (B:20:0x0100, B:22:0x010c, B:23:0x010e, B:26:0x0113, B:32:0x0116, B:33:0x0117, B:25:0x010f), top: B:19:0x0100, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c0(int r11) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oy1.c0.<init>(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(oy1.c0 r19, java.lang.String r20, r45.uc4 r21) {
        /*
            Method dump skipped, instructions count: 1270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oy1.c0.b(oy1.c0, java.lang.String, r45.uc4):void");
    }

    public static final void c(oy1.c0 c0Var, java.util.List list) {
        c0Var.getClass();
        java.lang.Long valueOf = java.lang.Long.valueOf(c0Var.f431395q);
        int i17 = c0Var.f431379a;
        ny1.k kVar = new ny1.k(i17, valueOf);
        kVar.f422948b = "LiteAppCustomReportCgiEvent";
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.uc4 uc4Var = (r45.uc4) it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(uc4Var.f468752f, "default")) {
                qy1.g gVar = qy1.g.f449258a;
                java.lang.String d17 = gVar.d(i17, uc4Var);
                long j17 = gVar.j();
                uc4Var.f468754h = j17;
                r45.pq5 pq5Var = uc4Var.f468751e;
                if (pq5Var != null) {
                    pq5Var.f464850h = gVar.f(d17 == null ? "" : d17, j17);
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkMsgAndSave ");
                sb6.append(d17);
                sb6.append(' ');
                r45.pq5 pq5Var2 = uc4Var.f468751e;
                sb6.append(pq5Var2 != null ? pq5Var2.f464850h : null);
                sb6.append(" add!");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c0Var.f431380b, sb6.toString());
                if (d17 == null) {
                    d17 = "";
                }
                c0Var.l("SDKCgiWaitReportMap", d17, uc4Var);
                kVar.a(uc4Var);
            }
        }
        c0Var.m(kVar, "custom collect event");
    }

    public static final void d(oy1.c0 c0Var, ny1.k kVar, boolean z17, boolean z18, boolean z19) {
        jz5.f0 f0Var;
        c0Var.getClass();
        java.lang.String str = kVar.f422948b;
        int i17 = c0Var.f431379a;
        java.lang.String str2 = c0Var.f431380b;
        if (z18) {
            long j17 = kVar.f422952f;
            int i18 = kVar.f422953g;
            if (j17 != c0Var.f431381c || i18 != c0Var.f431382d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "UpdateBatchInfo oldBatchAggregateMs = " + c0Var.f431381c + "oldBatchAggregateCount = " + c0Var.f431382d + "newBatchAggregateMs = " + j17 + " newBatchAggregateCount = " + i18);
                c0Var.f431381c = j17;
                c0Var.f431382d = i18;
            }
            if (kVar.f422956j != c0Var.f431395q) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "UpdateBatchInfo configVersion : " + c0Var.f431395q + " --> " + kVar.f422956j);
                c0Var.f431395q = kVar.f422956j;
                qy1.g gVar = qy1.g.f449258a;
                r45.rv rvVar = new r45.rv();
                rvVar.f466754d = kVar.f422956j;
                rvVar.f466755e = java.lang.System.currentTimeMillis();
                java.util.Map map = c0Var.f431392n;
                ((java.util.LinkedHashMap) map).clear();
                java.util.LinkedList<r45.oq5> itemConfs = kVar.f422955i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemConfs, "itemConfs");
                if (!itemConfs.isEmpty()) {
                    for (r45.oq5 oq5Var : itemConfs) {
                        java.lang.String b17 = qy1.g.f449258a.b(i17, oq5Var.f463984e, oq5Var.f463985f, java.lang.String.valueOf(oq5Var.f463983d));
                        if (b17 != null) {
                            oy1.w wVar = new oy1.w();
                            wVar.f431462a = oq5Var.f463986g;
                            wVar.f431464c = oq5Var.f463987h;
                            wVar.f431463b = oq5Var.f463988i;
                            map.put(b17, wVar);
                            java.util.LinkedList linkedList = rvVar.f466756f;
                            r45.a14 a14Var = new r45.a14();
                            a14Var.f451175e = oq5Var.f463986g;
                            a14Var.f451176f = oq5Var.f463987h;
                            a14Var.f451177g = oq5Var.f463988i;
                            a14Var.f451174d = b17;
                            linkedList.add(a14Var);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "add config = " + oq5Var.f463984e + ' ' + oq5Var.f463985f + ' ' + oq5Var.f463983d + ' ' + oq5Var.f463986g + ' ' + oq5Var.f463987h + ' ' + oq5Var.f463988i);
                        }
                    }
                }
                gVar.n(i17, rvVar);
            }
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "")) {
            return;
        }
        java.util.concurrent.ConcurrentLinkedQueue itemDataList = kVar.f422949c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemDataList, "itemDataList");
        java.util.Iterator it = itemDataList.iterator();
        java.lang.Integer valueOf = it.hasNext() ? java.lang.Integer.valueOf(((r45.pq5) it.next()).f464851i) : null;
        if (valueOf == null) {
            throw new java.util.NoSuchElementException("No element of the collection was transformed to a non-null value.");
        }
        int intValue = valueOf.intValue();
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = kVar.f422950d;
        if (concurrentLinkedQueue != null) {
            java.util.Iterator it6 = concurrentLinkedQueue.iterator();
            while (it6.hasNext()) {
                java.lang.Long l17 = (java.lang.Long) it6.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
                java.lang.String q17 = b52.b.q(l17.longValue());
                qy1.b0 b0Var = c0Var.f431387i;
                r45.uc4 b18 = b0Var.b("SDKCgiWaitReportMap", q17);
                if (b18 != null) {
                    if (!z17) {
                        b18.f468752f = "send_err";
                        b18.f468751e.f464851i = intValue;
                        b18.f468756m = intValue == 0 ? 0L : java.lang.System.currentTimeMillis();
                        b18.f468755i = qy1.g.f449258a.k(intValue);
                        b18.f468757n = kVar.f422954h;
                        b0Var.f("SDKCgiAbnormalReportMap", b18);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "send err retry cnt = " + intValue);
                    }
                    if (z19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, kVar.f422948b + ' ' + b18.f468751e.f464850h + " remove end!");
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b18.f468751e.f464850h, c0Var.f431390l)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "tryHeartbeat end");
                            oy1.p pVar = oy1.p.f431444a;
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                                if (pVar.b() == 2 || pVar.b() == 3) {
                                    oy1.l lVar = oy1.p.f431447d;
                                    if (lVar != null) {
                                        lVar.b();
                                    }
                                } else {
                                    oy1.q0.f431452d.b();
                                    oy1.l lVar2 = oy1.p.f431448e;
                                    if (lVar2 != null) {
                                        lVar2.b();
                                    }
                                }
                            }
                            c0Var.f431390l = null;
                        }
                    }
                    if (z17 && !z19) {
                        b18.f468752f = "send_err";
                        b18.f468757n = kVar.f422954h;
                        qy1.g gVar2 = qy1.g.f449258a;
                        ((ku5.t0) ku5.t0.f394148d).h(new qy1.f(i17, b18), "MicroMsg.MMKvUtils");
                    }
                    f0Var = jz5.f0.f384359a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "get And remove for kWaitingQueueMMkvMapId err cur business id = " + i17);
                }
            }
        }
        c0Var.h();
    }

    public final void e(r45.uc4 uc4Var) {
        if (uc4Var == null) {
            return;
        }
        qy1.g gVar = qy1.g.f449258a;
        int i17 = this.f431379a;
        java.lang.String d17 = gVar.d(i17, uc4Var);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f431380b, "cur businessId is " + i17 + ", curReportKey err!");
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 i18 = i();
        android.os.Message mo50288x733c63a2 = i().mo50288x733c63a2();
        mo50288x733c63a2.what = 1000;
        mo50288x733c63a2.obj = nm5.j.c(d17, uc4Var);
        i18.mo50308x2936bf5f(mo50288x733c63a2);
    }

    public final void f(java.lang.String str, r45.uc4 localItemData) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "")) {
            return;
        }
        qy1.b0 b0Var = this.f431387i;
        ny1.k c17 = b0Var.c(str);
        int i17 = this.f431379a;
        if (c17 == null) {
            long j17 = localItemData.f468758o;
            if (j17 == 0) {
                jz5.l lVar = (jz5.l) oy1.m.f431427j.get(java.lang.Integer.valueOf(i17));
                j17 = lVar != null ? ((java.lang.Number) lVar.f384367e).longValue() : 60000L;
            }
            p(str.hashCode(), str, j17);
        }
        long j18 = this.f431395q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localItemData, "localItemData");
        ny1.k c18 = b0Var.c(str);
        if (c18 == null) {
            c18 = new ny1.k(b0Var.f449235a, str, localItemData, false, java.lang.Long.valueOf(j18));
            b0Var.d().put(str, c18);
        } else {
            c18.a(localItemData);
        }
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = c18.f422949c;
        int size = concurrentLinkedQueue != null ? concurrentLinkedQueue.size() : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f431380b, "cur [" + str + "], itemDataList size = " + size);
        oy1.m mVar = oy1.m.f431418a;
        jz5.l lVar2 = (jz5.l) oy1.m.f431427j.get(java.lang.Integer.valueOf(i17));
        if (size >= (lVar2 != null ? ((java.lang.Number) lVar2.f384366d).intValue() : 10)) {
            i().mo50303x856b99f0(str.hashCode());
            ny1.k c19 = b0Var.c(str);
            if (c19 != null) {
                m(c19, "Size_out");
                this.f431386h.b(null, py1.c.f440584n, null);
                b0Var.d().remove(str);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        r9 = r10.f468751e;
        r11 = qy1.g.f449258a;
        r12 = r11.d(r2, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        if (r12 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
    
        r12 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        r9.f464850h = r11.f(r12, r10.f468754h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r17.f431380b, "dispatchHistoryMMkv " + r10.f468751e.f464846d.f463136e + ' ' + r10.f468751e.f464847e + ' ' + r10.f468751e.f464850h + " add!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.lang.String r18, boolean r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f431379a
            java.lang.String r3 = "SDKCgiReportHistoryMap"
            boolean r4 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r1, r3)
            if (r4 != 0) goto Lda
            qy1.g r4 = qy1.g.f449258a     // Catch: java.lang.Exception -> Lda
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> Lda
            com.tencent.mm.sdk.platformtools.o4 r1 = r4.g(r1, r5)     // Catch: java.lang.Exception -> Lda
            if (r1 == 0) goto Lda
            java.lang.String[] r4 = r1.b()     // Catch: java.lang.Exception -> Lda
            if (r4 == 0) goto Lda
            int r5 = r4.length     // Catch: java.lang.Exception -> Lda
            r6 = 0
            r7 = r6
        L23:
            if (r7 >= r5) goto Lda
            r8 = r4[r7]     // Catch: java.lang.Exception -> Lda
            byte[] r9 = r1.j(r8)     // Catch: java.lang.Exception -> Lda
            if (r9 == 0) goto Ld3
            r45.uc4 r10 = new r45.uc4     // Catch: java.lang.Exception -> Lda
            r10.<init>()     // Catch: java.lang.Exception -> Lda
            r10.mo11468x92b714fd(r9)     // Catch: java.lang.Exception -> Lda
            java.lang.String r9 = "history"
            r10.f468752f = r9     // Catch: java.lang.Exception -> Lda
            long r11 = r10.f468754h     // Catch: java.lang.Exception -> Lda
            r13 = 0
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 > 0) goto L49
            qy1.g r9 = qy1.g.f449258a     // Catch: java.lang.Exception -> Lda
            long r11 = r9.j()     // Catch: java.lang.Exception -> Lda
            r10.f468754h = r11     // Catch: java.lang.Exception -> Lda
        L49:
            long r11 = r10.f468753g     // Catch: java.lang.Exception -> Lda
            boolean r9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a     // Catch: java.lang.Exception -> Lda
            long r13 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Lda
            long r13 = r13 - r11
            r11 = 1
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            r11 = 1
            if (r9 > 0) goto L62
            r15 = 259200000(0xf731400, double:1.280618154E-315)
            int r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r9 >= 0) goto L62
            r9 = r11
            goto L63
        L62:
            r9 = r6
        L63:
            if (r9 == 0) goto Ld3
            r45.pq5 r9 = r10.f468751e     // Catch: java.lang.Exception -> Lda
            java.lang.String r9 = r9.f464850h     // Catch: java.lang.Exception -> Lda
            if (r9 == 0) goto L73
            int r9 = r9.length()     // Catch: java.lang.Exception -> Lda
            if (r9 != 0) goto L72
            goto L73
        L72:
            r11 = r6
        L73:
            if (r11 == 0) goto Lc0
            r45.pq5 r9 = r10.f468751e     // Catch: java.lang.Exception -> Lda
            qy1.g r11 = qy1.g.f449258a     // Catch: java.lang.Exception -> Lda
            java.lang.String r12 = r11.d(r2, r10)     // Catch: java.lang.Exception -> Lda
            if (r12 != 0) goto L81
            java.lang.String r12 = ""
        L81:
            long r13 = r10.f468754h     // Catch: java.lang.Exception -> Lda
            java.lang.String r11 = r11.f(r12, r13)     // Catch: java.lang.Exception -> Lda
            r9.f464850h = r11     // Catch: java.lang.Exception -> Lda
            java.lang.String r9 = r0.f431380b     // Catch: java.lang.Exception -> Lda
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lda
            r11.<init>()     // Catch: java.lang.Exception -> Lda
            java.lang.String r12 = "dispatchHistoryMMkv "
            r11.append(r12)     // Catch: java.lang.Exception -> Lda
            r45.pq5 r12 = r10.f468751e     // Catch: java.lang.Exception -> Lda
            r45.nq5 r12 = r12.f464846d     // Catch: java.lang.Exception -> Lda
            java.lang.String r12 = r12.f463136e     // Catch: java.lang.Exception -> Lda
            r11.append(r12)     // Catch: java.lang.Exception -> Lda
            r12 = 32
            r11.append(r12)     // Catch: java.lang.Exception -> Lda
            r45.pq5 r13 = r10.f468751e     // Catch: java.lang.Exception -> Lda
            java.lang.String r13 = r13.f464847e     // Catch: java.lang.Exception -> Lda
            r11.append(r13)     // Catch: java.lang.Exception -> Lda
            r11.append(r12)     // Catch: java.lang.Exception -> Lda
            r45.pq5 r12 = r10.f468751e     // Catch: java.lang.Exception -> Lda
            java.lang.String r12 = r12.f464850h     // Catch: java.lang.Exception -> Lda
            r11.append(r12)     // Catch: java.lang.Exception -> Lda
            java.lang.String r12 = " add!"
            r11.append(r12)     // Catch: java.lang.Exception -> Lda
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Exception -> Lda
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r9, r11)     // Catch: java.lang.Exception -> Lda
        Lc0:
            if (r19 == 0) goto Lce
            r0.e(r10)     // Catch: java.lang.Exception -> Lda
            py1.b r9 = r0.f431386h     // Catch: java.lang.Exception -> Lda
            py1.c r10 = py1.c.f440593w     // Catch: java.lang.Exception -> Lda
            r11 = 0
            r9.b(r11, r10, r11)     // Catch: java.lang.Exception -> Lda
            goto Ld3
        Lce:
            qy1.b0 r9 = r0.f431387i     // Catch: java.lang.Exception -> Lda
            r9.f(r3, r10)     // Catch: java.lang.Exception -> Lda
        Ld3:
            r1.remove(r8)     // Catch: java.lang.Exception -> Lda
            int r7 = r7 + 1
            goto L23
        Lda:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oy1.c0.g(java.lang.String, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x01e0 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oy1.c0.h():void");
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 i() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) this.f431396r.mo141623x754a37bb();
    }

    public final void j(boolean z17) {
        i().mo50303x856b99f0(1005);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str = this.f431380b;
        if (z17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 i17 = i();
            android.os.Message mo50288x733c63a2 = i().mo50288x733c63a2();
            mo50288x733c63a2.what = 1006;
            i17.mo50308x2936bf5f(mo50288x733c63a2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[onAppIn]");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[onAppOut]");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 i18 = i();
        android.os.Message mo50288x733c63a22 = i().mo50288x733c63a2();
        mo50288x733c63a22.what = 1005;
        mo50288x733c63a22.obj = java.lang.Long.valueOf(currentTimeMillis);
        i18.mo50311x7ab51103(mo50288x733c63a22, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
    }

    public final void k(java.lang.String str) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        qy1.b0 b0Var = this.f431387i;
        b0Var.getClass();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.putAll(b0Var.d());
        int i17 = 0;
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            java.lang.String str2 = (java.lang.String) entry.getKey();
            m((ny1.k) entry.getValue(), "Clean_out");
            this.f431386h.b(null, py1.c.f440583m, null);
            i().mo50303x856b99f0(str2.hashCode());
            i17++;
        }
        b0Var.d().clear();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f431380b, "checkToReportAllCollectMap  eventId = " + str + ", count = " + i17 + ", cost = " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    public final boolean l(java.lang.String str, java.lang.String str2, r45.uc4 uc4Var) {
        qy1.g gVar = qy1.g.f449258a;
        boolean z17 = qy1.g.f449259b.get();
        if (z17) {
            this.f431390l = null;
        } else if (this.f431390l == null) {
            this.f431390l = uc4Var.f468751e.f464850h;
        } else {
            uc4Var.f468752f = "send_err";
            str = "SDKCgiAbnormalReportMap";
        }
        boolean f17 = this.f431387i.f(str, uc4Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f431380b, "checkAndSend mmkv = " + str + " reportKey = " + str2 + ", isBatch = " + uc4Var.f468750d + ", writeFlag = " + f17 + " network " + z17);
        return f17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("SDKCgiWaitReportMap", str);
    }

    public final void m(ny1.k kVar, java.lang.String logTrace) {
        ny1.a aVar;
        java.util.concurrent.ConcurrentLinkedQueue itemDataList = kVar.f422949c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemDataList, "itemDataList");
        r45.pq5 pq5Var = (r45.pq5) kz5.n0.Y(itemDataList);
        int i17 = pq5Var != null ? pq5Var.f464851i : 0;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = oy1.m.f431426i;
        int i18 = this.f431379a;
        if (concurrentHashMap.containsKey(java.lang.Integer.valueOf(i18))) {
            aVar = (ny1.a) concurrentHashMap.get(java.lang.Integer.valueOf(i18));
        } else {
            ny1.a aVar2 = new ny1.a(i18, 10072, "/cgi-bin/micromsg-bin/findersdkreport", 0);
            concurrentHashMap.put(java.lang.Integer.valueOf(i18), aVar2);
            aVar = aVar2;
        }
        java.lang.String str = this.f431380b;
        if (aVar != null) {
            ny1.j jVar = new ny1.j(aVar, kVar);
            int i19 = jVar.f422942e.f422929b;
            jz5.g gVar = this.f431388j;
            if (!((java.util.Set) ((jz5.n) gVar).mo141623x754a37bb()).contains(java.lang.Integer.valueOf(i19))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "add scene end = " + i19 + ",  already = " + ((java.util.Set) ((jz5.n) gVar).mo141623x754a37bb()) + ' ');
                gm0.j1.d().a(i19, this.f431397s);
                ((java.util.Set) ((jz5.n) gVar).mo141623x754a37bb()).add(java.lang.Integer.valueOf(i19));
            }
            long k17 = qy1.g.f449258a.k(i17);
            qy1.b0 b0Var = this.f431387i;
            b0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(logTrace, "logTrace");
            if (oy1.m.f431429l == null) {
                oy1.m.f431429l = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_data_report_sdk_cgi_send_pending_collect, false));
            }
            java.lang.Boolean bool = oy1.m.f431429l;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            p3325xe03a0797.p3326xc267989b.y0 y0Var = b0Var.f449248n;
            if (booleanValue) {
                p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new qy1.a0(k17, b0Var, jVar, logTrace, null), 3, null);
            } else {
                p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new qy1.w(k17, b0Var, jVar, logTrace, null), 3, null);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "businessId = " + i18 + ", reportKey = " + kVar.f422948b + " logTrace = " + logTrace);
    }

    public final void n(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, boolean z17, int i17) {
        ny1.j jVar = m1Var instanceof ny1.j ? (ny1.j) m1Var : null;
        if (jVar != null) {
            jVar.f422943f.f422954h = i17;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 i18 = i();
            android.os.Message mo50288x733c63a2 = i().mo50288x733c63a2();
            mo50288x733c63a2.what = 1002;
            ny1.k kVar = ((ny1.j) m1Var).f422943f;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            mo50288x733c63a2.obj = nm5.j.e(kVar, valueOf, bool, bool);
            i18.mo50308x2936bf5f(mo50288x733c63a2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f431380b, "sendFail and retry end! isCgiEnd = " + z17);
        }
    }

    public final void o(java.lang.String str) {
        ny1.k kVar = new ny1.k(this.f431379a, java.lang.Long.valueOf(this.f431395q));
        kVar.f422948b = "all_force_collect";
        qy1.b0 b0Var = this.f431387i;
        b0Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(b0Var.e());
        b0Var.e().clear();
        b0Var.f449240f = 0;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            kVar.a((r45.uc4) it.next());
        }
        m(kVar, str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f431380b, "sendForceCollectList logTrace = " + str + ", itemSize = " + kVar.f422949c.size());
    }

    public final void p(int i17, java.lang.String str, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f431380b, "startTimerToDelayReport key = " + i17 + " key hashCode = " + java.lang.Integer.hashCode(i17));
        i().mo50303x856b99f0(i17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 i18 = i();
        android.os.Message mo50288x733c63a2 = i().mo50288x733c63a2();
        mo50288x733c63a2.what = i17;
        if (str != null) {
            mo50288x733c63a2.obj = str;
        }
        i18.mo50311x7ab51103(mo50288x733c63a2, j17);
    }
}
