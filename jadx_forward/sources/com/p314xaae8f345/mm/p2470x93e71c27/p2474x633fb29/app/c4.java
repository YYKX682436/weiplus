package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes9.dex */
public class c4 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, pt.n0 {
    public final dn.k A;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f270362d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f270363e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 f270364f;

    /* renamed from: g, reason: collision with root package name */
    public final long f270365g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f270366h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f270367i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f270368m;

    /* renamed from: n, reason: collision with root package name */
    public final int f270369n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a f270370o;

    /* renamed from: p, reason: collision with root package name */
    public long f270371p;

    /* renamed from: q, reason: collision with root package name */
    public long f270372q;

    /* renamed from: r, reason: collision with root package name */
    public long f270373r;

    /* renamed from: s, reason: collision with root package name */
    public long f270374s;

    /* renamed from: t, reason: collision with root package name */
    public long f270375t;

    /* renamed from: u, reason: collision with root package name */
    public long f270376u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f270377v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6274x15294930 f270378w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6275x73c70a4d f270379x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5166x9fda1052 f270380y;

    /* renamed from: z, reason: collision with root package name */
    public long f270381z;

    public c4(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3) {
        this.f270364f = null;
        this.f270365g = 0L;
        this.f270366h = "";
        this.f270369n = 0;
        this.f270371p = 0L;
        this.f270372q = 0L;
        this.f270373r = 0L;
        this.f270374s = 0L;
        this.f270375t = 0L;
        this.f270376u = 0L;
        this.f270377v = "";
        this.f270381z = 0L;
        this.A = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.b4(this);
        this.f270365g = j17;
        this.f270366h = str;
        this.f270367i = str2;
        this.f270368m = str3;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.py5();
        lVar.f152198b = new r45.qy5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/sendappmsg";
        lVar.f152200d = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508;
        lVar.f152201e = 107;
        lVar.f152202f = 1000000107;
        this.f270362d = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendAppMsg", "summersafecdn NetSceneSendAppMsg msgid[%d], sessionid[%s], signature[%s], stack[%s]", java.lang.Long.valueOf(j17), str2, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(str3), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        ((java.util.concurrent.ConcurrentHashMap) com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Ni().f270603e).put(java.lang.Integer.valueOf(hashCode()), new java.lang.Object());
    }

    public final void H(int i17) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f270371p;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("send_result_ret_code", java.lang.Integer.valueOf(i17));
        hashMap.put("prepare_cost", java.lang.Long.valueOf(this.f270372q));
        hashMap.put("send_cgi_cost", java.lang.Long.valueOf(this.f270375t));
        long j17 = this.f270376u;
        if (j17 > 0) {
            hashMap.put("cdn_upload_cost", java.lang.Long.valueOf(j17));
        }
        hashMap.put("send_total_cost", java.lang.Long.valueOf(currentTimeMillis));
        hashMap.put("inner_version", 36);
        hashMap.put("send_msg_local_id", java.lang.Long.valueOf(this.f270365g));
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f270364f;
        hashMap.put("send_msg_type", java.lang.Integer.valueOf(f9Var != null ? ot0.u.a(f9Var) : 0));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).sj(32784, hashMap, 10);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("legacy_send_app_msg", hashMap, 32784);
    }

    @Override // pt.n0
    public long a() {
        return this.f270365g;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x039d  */
    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s r33, com.p314xaae8f345.mm.p944x882e457a.u0 r34) {
        /*
            Method dump skipped, instructions count: 1774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c4.mo807x6c193ac1(com.tencent.mm.network.s, com.tencent.mm.modelbase.u0):int");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getDispatchInterceptRet */
    public int mo47996x4facbe8f(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, com.p314xaae8f345.mm.p971x6de15a2e.l0 l0Var) {
        return w11.c1.a(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(this.f270365g, this.f270366h), this) ? org.p3343x72743996.net.InterfaceC29524x4f65168b.f74071xb0bfc305 : super.mo47996x4facbe8f(sVar, v0Var, l0Var);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x018c, code lost:
    
        if (r0 != 130) goto L68;
     */
    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo804x5f9cdc6f(int r22, int r23, int r24, java.lang.String r25, com.p314xaae8f345.mm.p971x6de15a2e.v0 r26, byte[] r27) {
        /*
            Method dump skipped, instructions count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c4.mo804x5f9cdc6f(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }

    public c4(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, int i17, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a aVar) {
        this(str, j17, str2, str3);
        this.f270369n = i17;
        this.f270370o = aVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendAppMsg", "NetSceneSendAppMsg directShare[%d]", java.lang.Integer.valueOf(i17));
        if (aVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendAppMsg", "NetSceneSendAppMsg tokenValid[%d], pkgName[%s]", java.lang.Integer.valueOf(aVar.f270323a), aVar.f270324b);
        }
    }
}
