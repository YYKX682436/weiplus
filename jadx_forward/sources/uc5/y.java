package uc5;

/* loaded from: classes10.dex */
public final class y extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f508085d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f508086e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f508087f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f508088g;

    /* renamed from: h, reason: collision with root package name */
    public long f508089h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f508090i;

    /* renamed from: m, reason: collision with root package name */
    public long f508091m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f508092n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f508093o;

    /* renamed from: p, reason: collision with root package name */
    public volatile java.util.Map f508094p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f508095q;

    public y(java.lang.String talker, java.util.List typeCollection) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeCollection, "typeCollection");
        this.f508085d = talker;
        this.f508086e = typeCollection;
        this.f508087f = jz5.h.b(uc5.v.f508082d);
        this.f508088g = jz5.h.b(new uc5.w(this));
        this.f508089h = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        this.f508091m = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        this.f508095q = jz5.h.b(new uc5.x(this));
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        dVar.f544684e = true;
        u26.k0 k0Var = new u26.k0();
        if (f(request, dVar)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryDataSource", "DataSource getData, dataList add size = " + dVar.f544682c.size());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryDataSource", "DataSource getData, fillDataResponse failed");
        }
        k0Var.e(dVar);
        return new p3325xe03a0797.p3326xc267989b.p3328x30012e.r(k0Var);
    }

    public final void d(java.util.List msgInfoList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfoList, "msgInfoList");
        java.util.Map map = this.f508094p;
        if (map != null) {
            java.util.Map t17 = kz5.c1.t(map);
            java.util.Iterator it = msgInfoList.iterator();
            boolean z17 = false;
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f9Var.Q0(), this.f508085d)) {
                    java.lang.String str = uc5.q0.a(uc5.q0.f508076a, f9Var.T1(), 0L, 2, null).f508073a;
                    java.lang.Integer num = (java.lang.Integer) ((java.util.LinkedHashMap) t17).get(str);
                    if (num != null) {
                        int intValue = num.intValue() - 1;
                        if (intValue <= 0) {
                            t17.remove(str);
                        } else {
                            t17.put(str, java.lang.Integer.valueOf(intValue));
                        }
                        z17 = true;
                    }
                }
            }
            if (z17) {
                this.f508094p = t17;
            }
        }
    }

    public final p75.m e(java.lang.String str, int i17, int i18) {
        p75.o0 o0Var = new p75.o0(str, i17, i18);
        if (i18 == 0) {
            return o0Var;
        }
        p75.y yVar = (p75.y) new p75.t0(str, java.lang.String.valueOf(i18)).d(new p75.c1(str, java.lang.String.valueOf(0 - i18)));
        yVar.f(o0Var);
        return yVar;
    }

    public final boolean f(ym3.c cVar, ym3.d dVar) {
        android.database.Cursor cursor;
        if (this.f508092n) {
            dVar.f544681b = false;
            return true;
        }
        p75.m r0Var = new p75.r0("talker", this.f508085d);
        long j17 = this.f508091m;
        if (j17 != com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
            r0Var = r0Var.c(new p75.c1("createTime", java.lang.String.valueOf(j17)));
        }
        java.util.Set set = (java.util.Set) ((jz5.n) this.f508095q).mo141623x754a37bb();
        if (set != null) {
            p75.m e17 = e("type", 65535, ((java.lang.Number) kz5.n0.W(set)).intValue());
            java.util.Iterator it = kz5.n0.R(set, 1).iterator();
            while (it.hasNext()) {
                e17 = e17.d(e("type", 65535, ((java.lang.Number) it.next()).intValue()));
            }
            r0Var = r0Var.c(e17);
        }
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f508088g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        p75.i0 i17 = new p75.n0((java.lang.String) mo141623x754a37bb).i();
        i17.f434189c = "MicroMsg.MsgHistoryGalleryDataSource";
        i17.f434190d = r0Var;
        i17.e(new p75.g("createTime", false));
        i17.c(1000, 0);
        p75.l0 a17 = i17.a();
        l75.k0 Q4 = ((jm0.l) ((jz5.n) this.f508087f).mo141623x754a37bb()).Q4();
        if (Q4 != null) {
            cursor = Q4.f(a17.f434169a, a17.f434170b, 2);
        } else {
            cursor = null;
        }
        if (cursor == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgHistoryGalleryDataSource", "DataSource fillDataResponse, cursor is null");
            return false;
        }
        try {
            h(g(cursor, cVar.f544678c, dVar), dVar);
            vz5.b.a(cursor, null);
            return true;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0115 A[LOOP:0: B:2:0x0009->B:30:0x0115, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011a A[EDGE_INSN: B:31:0x011a->B:32:0x011a BREAK  A[LOOP:0: B:2:0x0009->B:30:0x0115], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final uc5.s g(android.database.Cursor r24, int r25, ym3.d r26) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uc5.y.g(android.database.Cursor, int, ym3.d):uc5.s");
    }

    public final void h(uc5.s sVar, ym3.d dVar) {
        int i17 = sVar.f508077a;
        boolean z17 = sVar.f508079c;
        if (i17 == 0 && !z17) {
            this.f508092n = true;
            dVar.f544681b = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryDataSource", "DataSource fillDataResponse, reachTop");
            return;
        }
        long j17 = sVar.f508078b;
        this.f508091m = j17;
        this.f508092n = !z17;
        dVar.f544681b = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryDataSource", "DataSource fillDataResponse, continueFlag = " + dVar.f544681b + ", lastScannedTime = " + j17);
    }

    @Override // ym3.f
    /* renamed from: onCreate */
    public void mo10202x3e5a77bb() {
        this.f508089h = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        this.f508090i = null;
        this.f508091m = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        this.f508092n = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryDataSource", "DataSource onCreate");
    }
}
