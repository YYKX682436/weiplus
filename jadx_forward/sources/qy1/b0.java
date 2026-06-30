package qy1;

/* loaded from: classes13.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f449235a;

    /* renamed from: b, reason: collision with root package name */
    public final qy1.n f449236b;

    /* renamed from: c, reason: collision with root package name */
    public final py1.b f449237c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f449238d;

    /* renamed from: e, reason: collision with root package name */
    public int f449239e;

    /* renamed from: f, reason: collision with root package name */
    public int f449240f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f449241g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f449242h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Object f449243i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f449244j;

    /* renamed from: k, reason: collision with root package name */
    public final u26.w f449245k;

    /* renamed from: l, reason: collision with root package name */
    public final qy1.m f449246l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f449247m;

    /* renamed from: n, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f449248n;

    /* renamed from: o, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f449249o;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bf, code lost:
    
        if (r8 == null) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b0(int r8, qy1.n r9, py1.b r10) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qy1.b0.<init>(int, qy1.n, py1.b):void");
    }

    public static final java.lang.Object a(qy1.b0 b0Var, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ny1.k kVar;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue;
        java.lang.Long l17;
        b0Var.getClass();
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        qy1.o oVar = new qy1.o(rVar);
        ny1.j jVar = m1Var instanceof ny1.j ? (ny1.j) m1Var : null;
        if (jVar != null && (kVar = jVar.f422943f) != null && (concurrentLinkedQueue = kVar.f422950d) != null && (l17 = (java.lang.Long) kz5.n0.Y(concurrentLinkedQueue)) != null) {
            qy1.n nVar = b0Var.f449236b;
            long longValue = l17.longValue();
            oy1.c0 c0Var = (oy1.c0) nVar;
            c0Var.getClass();
            synchronized (c0Var.f431391m) {
                if (!c0Var.f431391m.containsKey(java.lang.Long.valueOf(longValue))) {
                    c0Var.f431391m.put(java.lang.Long.valueOf(longValue), oVar);
                }
            }
        }
        if (!gm0.j1.d().h(m1Var, 0)) {
            oy1.c0 c0Var2 = (oy1.c0) b0Var.f449236b;
            c0Var2.getClass();
            c0Var2.n(m1Var, false, 1003);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CgiStorageHelper", "doScene err!");
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    public final r45.uc4 b(java.lang.String mmkvkey, java.lang.String str) {
        r45.uc4 uc4Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mmkvkey, "mmkvkey");
        synchronized (this.f449243i) {
            jz5.l i17 = qy1.g.f449258a.i(mmkvkey, this.f449235a, str, oy1.m.f431418a.b() == 0);
            uc4Var = null;
            if (i17 != null) {
                r45.uc4 uc4Var2 = (r45.uc4) i17.f384366d;
                int intValue = ((java.lang.Number) i17.f384367e).intValue();
                if (uc4Var2 != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(uc4Var2.f468752f, "history")) {
                    this.f449237c.b(java.lang.Long.valueOf(uc4Var2.f468754h), py1.c.f440581h, null);
                }
                this.f449238d.addAndGet(-intValue);
                uc4Var = uc4Var2;
            }
        }
        return uc4Var;
    }

    public final ny1.k c(java.lang.String reportKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportKey, "reportKey");
        return (ny1.k) d().get(reportKey);
    }

    public final java.util.Map d() {
        return (java.util.Map) ((jz5.n) this.f449241g).mo141623x754a37bb();
    }

    public final java.util.List e() {
        return (java.util.List) ((jz5.n) this.f449242h).mo141623x754a37bb();
    }

    public final boolean f(java.lang.String mmkvkey, r45.uc4 dataInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mmkvkey, "mmkvkey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataInfo, "dataInfo");
        synchronized (this.f449243i) {
            if (this.f449238d.get() >= 200) {
                g(dataInfo);
                return false;
            }
            if (!h(mmkvkey, dataInfo)) {
                return false;
            }
            this.f449238d.incrementAndGet();
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mmkvkey, "SDKCgiReportHistoryMap")) {
                this.f449237c.b(java.lang.Long.valueOf(dataInfo.f468754h), py1.c.f440577d, new jz5.l(dataInfo, java.lang.Integer.valueOf((int) qy1.g.f449258a.h(mmkvkey, this.f449235a))));
            }
            return true;
        }
    }

    public final boolean g(r45.uc4 dataInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataInfo, "dataInfo");
        dataInfo.f468752f = "db";
        qy1.c cVar = qy1.c.f449250a;
        if (qy1.c.f449253d == null) {
            cVar.c();
        }
        qy1.d dVar = qy1.c.f449253d;
        boolean z17 = false;
        if (dVar != null) {
            long j17 = dataInfo.f468754h;
            qy1.e eVar = new qy1.e();
            eVar.f68638x63ed9c06 = dataInfo.mo14344x5f01b1f6();
            eVar.f68639x95cc68a8 = j17;
            eVar.f68636x1e9b0d60 = this.f449235a;
            eVar.f68640x2c459686 = dataInfo.f468753g;
            eVar.f68637x7ea831eb = dataInfo.f468758o;
            l75.k0 k0Var = dVar.f449256d;
            long b17 = k0Var.b();
            try {
                try {
                    long l17 = k0Var.l("CgiReportLocalItemDataCache", "localItemReportId", eVar.mo9763xeb27878e());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiLocalDataStorage", "new item insert rowId = " + l17 + ", localId = " + j17 + ", info = " + eVar);
                    if (l17 > -1) {
                        z17 = true;
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CgiLocalDataStorage", "addNewItem err,  err info = " + e17);
                }
            } finally {
                k0Var.w(java.lang.Long.valueOf(b17));
            }
        }
        if (z17) {
            this.f449239e++;
            this.f449237c.b(java.lang.Long.valueOf(dataInfo.f468754h), py1.c.f440578e, new jz5.l(dataInfo, java.lang.Integer.valueOf(this.f449239e)));
        }
        return z17;
    }

    public final boolean h(java.lang.String mmkvKey, r45.uc4 uc4Var) {
        r45.nq5 nq5Var;
        qy1.g gVar = qy1.g.f449258a;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f449235a);
        java.lang.String q17 = b52.b.q(uc4Var.f468754h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(q17, "long2UnsignedString(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mmkvKey, "mmkvKey");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 g17 = gVar.g(mmkvKey, valueOf);
            if (g17 == null) {
                return false;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mmkvKey : ");
            sb6.append(mmkvKey);
            sb6.append(" writeKey : ");
            sb6.append(q17);
            sb6.append("  writeToMMkv data : ");
            r45.pq5 pq5Var = uc4Var.f468751e;
            sb6.append((pq5Var == null || (nq5Var = pq5Var.f464846d) == null) ? null : nq5Var.f463136e);
            sb6.append('_');
            r45.pq5 pq5Var2 = uc4Var.f468751e;
            sb6.append(pq5Var2 != null ? pq5Var2.f464847e : null);
            sb6.append(" cost : ");
            sb6.append(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMKvUtils", sb6.toString());
            return g17.H(q17, uc4Var.mo14344x5f01b1f6());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMKvUtils", " mmkvKey : " + mmkvKey + " writeKey : " + q17 + "  writeToMMkv err! " + e17.getMessage());
            return false;
        }
    }
}
