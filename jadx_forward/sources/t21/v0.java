package t21;

/* loaded from: classes12.dex */
public class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f496510a;

    /* renamed from: b, reason: collision with root package name */
    public final long f496511b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f496512c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f496513d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f496514e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f496515f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f496516g;

    /* renamed from: h, reason: collision with root package name */
    public dn.o f496517h;

    /* renamed from: i, reason: collision with root package name */
    public long f496518i;

    /* renamed from: j, reason: collision with root package name */
    public long f496519j;

    /* renamed from: k, reason: collision with root package name */
    public long f496520k;

    /* renamed from: l, reason: collision with root package name */
    public int f496521l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f496522m;

    /* renamed from: n, reason: collision with root package name */
    public long f496523n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f496524o;

    /* renamed from: p, reason: collision with root package name */
    public f65.s f496525p;

    /* renamed from: r, reason: collision with root package name */
    public t21.u0 f496527r;

    /* renamed from: q, reason: collision with root package name */
    public int f496526q = 0;

    /* renamed from: s, reason: collision with root package name */
    public final dn.k f496528s = new t21.s0(this);

    /* renamed from: t, reason: collision with root package name */
    public final dn.l f496529t = new t21.t0(this);

    public v0(long j17, java.lang.String str) {
        this.f496510a = false;
        this.f496511b = j17;
        this.f496512c = str;
        this.f496510a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            Method dump skipped, instructions count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.v0.a():boolean");
    }

    public int b(t21.u0 u0Var) {
        this.f496527r = u0Var;
        try {
            if (a()) {
                return 0;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetScenePreloadVideoFake", e17, "", new java.lang.Object[0]);
        }
        this.f496527r = null;
        return -1;
    }

    public java.lang.String c() {
        if (!this.f496510a) {
            return this.f496513d;
        }
        return this.f496511b + "";
    }

    public final void d(java.lang.String str, dn.h hVar) {
        int i17;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f496518i);
        stringBuffer.append(",");
        stringBuffer.append(this.f496519j);
        stringBuffer.append(",");
        stringBuffer.append(this.f496520k);
        stringBuffer.append(",");
        stringBuffer.append(this.f496522m);
        stringBuffer.append(",");
        stringBuffer.append(this.f496521l);
        stringBuffer.append(",");
        try {
            i17 = (int) ((this.f496520k / 1024) / (this.f496519j - this.f496518i));
        } catch (java.lang.Exception unused) {
            i17 = 0;
        }
        stringBuffer.append(i17);
        stringBuffer.append(",0,");
        stringBuffer.append(str);
        stringBuffer.append(",");
        stringBuffer.append(this.f496517h.J1);
        stringBuffer.append(",");
        stringBuffer.append(this.f496517h.I1);
        stringBuffer.append(",");
        stringBuffer.append(this.f496517h.K1);
        stringBuffer.append(",");
        stringBuffer.append(this.f496517h.f69591xf9dbbe9c);
        stringBuffer.append(",");
        stringBuffer.append(this.f496517h.M1);
        stringBuffer.append(",");
        stringBuffer.append(fo4.c.a(this.f496517h.Q1));
        stringBuffer.append(hVar.f323301c);
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.SNSVideoProfile sNSVideoProfile = hVar.f323312n;
        stringBuffer.append(sNSVideoProfile != null ? sNSVideoProfile.f18090xf13441d2 : 0);
        new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6815x9275f7d5(stringBuffer.toString()).k();
    }

    public void e() {
        int i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetScenePreloadVideoFake", "%d stop preload video[%s]", java.lang.Integer.valueOf(hashCode()), this.f496514e);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f496514e)) {
            dn.h hVar = new dn.h();
            sx.e0 e0Var = (sx.e0) i95.n0.c(sx.e0.class);
            java.lang.String str = this.f496514e;
            ((rx.l) e0Var).getClass();
            com.p314xaae8f345.mm.p947xba6de98f.h2 fj6 = com.p314xaae8f345.mm.p947xba6de98f.s1.fj();
            dn.m mVar = (dn.m) ((java.util.concurrent.ConcurrentHashMap) fj6.f152528s).remove(str);
            if (mVar != null) {
                i17 = com.p314xaae8f345.mm.p947xba6de98f.s1.cj().x(str, hVar);
                jx3.f.INSTANCE.d(10769, -10002, java.lang.Integer.valueOf(mVar.f69592xf1ebe47b), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - mVar.f69615x1bb3b54a));
            } else {
                i17 = 0;
            }
            ((java.util.HashMap) fj6.f152527r).remove(str);
            ((java.util.HashMap) fj6.f152529t).remove(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnTransportService", "summersafecdn cdntra cancelRecvTask mediaid:%s mapremove:%s engine ret:%d", str, mVar, java.lang.Integer.valueOf(i17));
            this.f496519j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            this.f496520k = g(this.f496515f, (int) hVar.f69548xe026fea1, false);
            d(hVar.a(), hVar);
        }
        this.f496527r = null;
    }

    public final void f(java.lang.String str, int i17, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetScenePreloadVideoFake", "%d update finish video [%s] [%d] [%s]", java.lang.Integer.valueOf(hashCode()), str, java.lang.Integer.valueOf(i17), str2);
        if (t21.d3.h(str) != null) {
            t21.d3.N(str, i17);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                return;
            }
            java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f104104s, str, false);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || i17 <= 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rj6) || !com.p314xaae8f345.mm.vfs.w6.j(rj6)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetScenePreloadVideoFake", "insert media duplication but args is error.[%d, %s, %s]", java.lang.Integer.valueOf(i17), str2, rj6);
            } else {
                ((com.p314xaae8f345.mm.p2621x8fb0427b.w8) ((g90.o0) ((h90.b0) i95.n0.c(h90.b0.class))).wi()).i(str2, i17, rj6);
            }
        }
    }

    public final int g(java.lang.String str, int i17, boolean z17) {
        t21.v2 h17 = t21.d3.h(str);
        if (h17 == null) {
            return i17;
        }
        int i18 = h17.I;
        if (z17) {
            h17.I = i17;
        } else {
            h17.I = i18 + i17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetScenePreloadVideoFake", "update video info[%s] preload[%d %d %d] isFinish[%b] ", str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(h17.I), java.lang.Boolean.valueOf(z17));
        h17.f496546k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        h17.U = 1025;
        t21.d3.Q(h17);
        if (z17) {
            i17 -= i18;
        }
        if (i17 < 0) {
            return 0;
        }
        return i17;
    }

    public v0(dn.o oVar, java.lang.String str) {
        this.f496510a = false;
        this.f496517h = oVar;
        this.f496513d = str;
        this.f496510a = false;
    }
}
