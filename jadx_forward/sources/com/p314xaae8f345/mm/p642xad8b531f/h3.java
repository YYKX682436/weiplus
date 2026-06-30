package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes11.dex */
public class h3 {

    /* renamed from: q, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p642xad8b531f.h3 f144912q = new com.p314xaae8f345.mm.p642xad8b531f.h3();

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.j3 f144913a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f144914b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f144915c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.s2 f144916d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p642xad8b531f.g3 f144917e;

    /* renamed from: f, reason: collision with root package name */
    public int f144918f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f144919g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashSet f144920h;

    /* renamed from: i, reason: collision with root package name */
    public long f144921i;

    /* renamed from: j, reason: collision with root package name */
    public long f144922j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f144923k;

    /* renamed from: l, reason: collision with root package name */
    public long f144924l;

    /* renamed from: m, reason: collision with root package name */
    public final int f144925m;

    /* renamed from: n, reason: collision with root package name */
    public final int f144926n;

    /* renamed from: o, reason: collision with root package name */
    public final int f144927o;

    /* renamed from: p, reason: collision with root package name */
    public final int f144928p;

    public h3() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f144914b = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5994x3969543f>(a0Var) { // from class: com.tencent.mm.booter.StayTimeReport$1
            {
                this.f39173x3fe91575 = 1245546543;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5994x3969543f c5994x3969543f) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5994x3969543f c5994x3969543f2 = c5994x3969543f;
                if (!(c5994x3969543f2 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5994x3969543f)) {
                    return false;
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = c5994x3969543f2.f136289g.f89276a;
                com.p314xaae8f345.mm.p642xad8b531f.h3 h3Var = com.p314xaae8f345.mm.p642xad8b531f.h3.this;
                if (h3Var.f144917e == null) {
                    return false;
                }
                java.util.HashSet hashSet = h3Var.f144919g;
                if (hashSet.contains(java.lang.Long.valueOf(f9Var.m124847x74d37ac6())) || !h3Var.f144917e.f144897a.equals(f9Var.Q0())) {
                    return false;
                }
                hashSet.add(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
                h3Var.f144917e.f144907k++;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StayTimeReport", "sendMsg msgType:%d, SendCnt:%d", java.lang.Integer.valueOf(f9Var.mo78013xfb85f7b0()), java.lang.Integer.valueOf(h3Var.f144917e.f144907k));
                return false;
            }
        };
        this.f144915c = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5879xb1f5f7c>(a0Var) { // from class: com.tencent.mm.booter.StayTimeReport$2
            {
                this.f39173x3fe91575 = 468947820;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5879xb1f5f7c c5879xb1f5f7c) {
                java.lang.String str;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5879xb1f5f7c c5879xb1f5f7c2 = c5879xb1f5f7c;
                if (!(c5879xb1f5f7c2 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5879xb1f5f7c)) {
                    return false;
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = c5879xb1f5f7c2.f136187g.f89742a;
                com.p314xaae8f345.mm.p642xad8b531f.h3 h3Var = com.p314xaae8f345.mm.p642xad8b531f.h3.this;
                if (h3Var.f144917e == null) {
                    return false;
                }
                java.util.HashSet hashSet = h3Var.f144920h;
                if (hashSet.contains(java.lang.Long.valueOf(f9Var.I0())) || (str = h3Var.f144917e.f144897a) == null || !str.equals(f9Var.Q0())) {
                    return false;
                }
                hashSet.add(java.lang.Long.valueOf(f9Var.I0()));
                h3Var.f144917e.f144906j++;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StayTimeReport", "receiveMsg msgType:%d, recvCnt:%d", java.lang.Integer.valueOf(f9Var.mo78013xfb85f7b0()), java.lang.Integer.valueOf(h3Var.f144917e.f144906j));
                return false;
            }
        };
        this.f144916d = new com.p314xaae8f345.mm.p642xad8b531f.f3(this);
        this.f144918f = 0;
        this.f144919g = new java.util.HashSet();
        this.f144920h = new java.util.HashSet();
        this.f144924l = -1L;
        this.f144925m = 20;
        this.f144926n = 24;
        this.f144927o = 30;
        this.f144928p = 10800;
        try {
            this.f144913a = new com.p314xaae8f345.mm.p2621x8fb0427b.j3(com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a + "staytime.cfg");
        } catch (java.lang.OutOfMemoryError e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.StayTimeReport", e17, "", new java.lang.Object[0]);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str = com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a;
            sb6.append(str);
            sb6.append("staytime.cfg");
            com.p314xaae8f345.mm.vfs.w6.h(sb6.toString());
            this.f144913a = new com.p314xaae8f345.mm.p2621x8fb0427b.j3(str + "staytime.cfg");
        }
    }

    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.p642xad8b531f.g3 g3Var;
        this.f144914b.mo48814x2efc64();
        this.f144915c.mo48814x2efc64();
        this.f144916d.m43072x2efc64();
        this.f144920h.clear();
        this.f144919g.clear();
        boolean z17 = true;
        if (str == null || (g3Var = this.f144917e) == null) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = str;
            objArr[1] = java.lang.Boolean.valueOf(this.f144917e == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StayTimeReport", "exitChattingUI chatUser or reprotingItem is null, chatUser:%s, reportingItem is null:%b", objArr);
            return;
        }
        if (!str.equals(g3Var.f144897a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StayTimeReport", "exitChattingUI no startedUI: %s, start:", str, this.f144917e.f144897a);
            return;
        }
        com.p314xaae8f345.mm.p642xad8b531f.g3 g3Var2 = this.f144917e;
        long j17 = g3Var2.f144899c;
        long j18 = this.f144921i;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        g3Var2.f144899c = j17 + ((android.os.SystemClock.elapsedRealtime() - j18) / 1000);
        com.p314xaae8f345.mm.p2621x8fb0427b.j3 j3Var = this.f144913a;
        j3Var.f(5, ((java.lang.String) j3Var.b(5, "")) + this.f144917e.m43381x9616526c());
        if (this.f144917e == null) {
            return;
        }
        long d17 = j3Var.d(4, 0L);
        int c17 = j3Var.c(6, 0) + 1;
        j3Var.g(6, c17);
        com.p314xaae8f345.mm.p642xad8b531f.g3 g3Var3 = this.f144917e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StayTimeReport", "exitChattingUI, chatUser:%s, type:%d, stayTime:%d, stayWebTime:%d, chattingReportCnt:%d", g3Var3.f144897a, java.lang.Integer.valueOf(g3Var3.f144898b), java.lang.Long.valueOf(this.f144917e.f144899c), java.lang.Integer.valueOf(this.f144917e.f144904h), java.lang.Integer.valueOf(c17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StayTimeReport", "exitChattingUI goBackHistoryStatus:%d, recnCnt:%d, sendCnt:%d", java.lang.Integer.valueOf(this.f144917e.f144905i), java.lang.Integer.valueOf(this.f144917e.f144906j), java.lang.Integer.valueOf(this.f144917e.f144907k));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(d17) <= this.f144928p && c17 <= this.f144927o) {
            z17 = false;
        }
        if (z17) {
            java.lang.String str2 = ((java.lang.String) j3Var.b(5, "")) + "," + d17 + "," + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StayTimeReport", "report （13062） %d: %s", 13062, str2);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(13062, str2);
            j3Var.g(6, 0);
            j3Var.f(5, "");
        }
    }
}
