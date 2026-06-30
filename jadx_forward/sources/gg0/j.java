package gg0;

/* loaded from: classes12.dex */
public final class j extends kq.n {
    public final jz5.g A;
    public final jz5.g B;

    /* renamed from: t, reason: collision with root package name */
    public final gg0.a f353046t;

    /* renamed from: u, reason: collision with root package name */
    public w21.w0 f353047u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 f353048v;

    /* renamed from: w, reason: collision with root package name */
    public int f353049w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f353050x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f353051y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f353052z;

    public j(gg0.a params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f353046t = params;
        this.f353051y = jz5.h.b(gg0.h.f353044d);
        this.f353052z = jz5.h.b(gg0.i.f353045d);
        this.A = jz5.h.b(gg0.d.f353038d);
        this.B = jz5.h.b(gg0.e.f353039d);
    }

    public final void D() {
        eg0.e eVar = (eg0.e) i95.n0.c(eg0.e.class);
        boolean z17 = this.f392757q;
        gg0.a aVar = this.f353046t;
        if (z17) {
            java.lang.String fileName = aVar.f353021b;
            hg0.k kVar = (hg0.k) eVar;
            kVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
            kVar.f362864d.remove(fileName);
        } else {
            ((hg0.k) eVar).wi(aVar.f353021b);
        }
        fg0.g.f343369h.a().X6(aVar.f353021b);
    }

    public final cv.h1 E() {
        return (cv.h1) ((jz5.n) this.f353051y).mo141623x754a37bb();
    }

    public final cv.i1 G() {
        return (cv.i1) ((jz5.n) this.f353052z).mo141623x754a37bb();
    }

    public final void H(java.lang.String str) {
        ((hg0.k) ((eg0.e) i95.n0.c(eg0.e.class))).Bi(this.f353046t.f353021b, str);
    }

    public final boolean I(w21.w0 w0Var, int i17, boolean z17) {
        int i18 = w0Var.f524024h;
        w0Var.f524023g = i17;
        w0Var.f524027k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        w0Var.f524017a = 272;
        if (i17 > i18) {
            w0Var.f524024h = i17;
            w0Var.f524022f = i17;
            w0Var.f524017a = 272 | 32 | 8;
        }
        if (z17) {
            w0Var.f524025i = 99;
            w0Var.f524038v = 0;
            w0Var.f524017a = w0Var.f524017a | 64 | 1048576;
            this.f353046t.f353028i.put("is_last_chunk", 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceDownloadTask", "updateVoiceInfoAfterCgiChunk[" + w0Var.f524018b + "] complete, newSize:" + i17 + " total:" + w0Var.f524024h);
        }
        try {
            ((bv.p0) G()).Ui(w0Var.f524018b, w0Var);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceDownloadTask", "updateVoiceInfoAfterCgiChunk[" + w0Var.f524018b + "] failed: " + e17);
            return false;
        }
    }

    @Override // w65.g, w65.m
    public void f1() {
        super.f1();
        w21.w0 w0Var = this.f353047u;
        if (w0Var != null) {
            qi3.c0 c0Var = new qi3.c0();
            long j17 = w0Var.f524029m;
            java.lang.String str = w0Var.f524019c;
            if (str == null) {
                str = w0Var.f524040x;
            }
            if (str == null) {
                str = "";
            }
            c0Var.f445212a = new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(j17, str);
            c0Var.f445213b = this.f392752i;
            c0Var.f445214c = this.f392755o;
            jm.m mVar = (jm.m) ((qi3.w) ((jz5.n) this.B).mo141623x754a37bb());
            mVar.getClass();
            v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) mVar.f381771m).mo141623x754a37bb(), null, new jm.k(c0Var, mVar, null), 1, null);
        }
    }

    @Override // w65.m
    public java.lang.String id() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        java.lang.String str2 = this.f353046t.f353021b;
        if (!(!r26.n0.N(str2))) {
            str2 = null;
        }
        return str2 == null ? this.f524888d : str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x026b, code lost:
    
        if ((!(r0.length == 0)) != false) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // kq.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r29) {
        /*
            Method dump skipped, instructions count: 1227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gg0.j.n(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kq.n
    public java.lang.String o() {
        tg3.u0 u0Var = (tg3.u0) ((jz5.n) this.A).mo141623x754a37bb();
        gg0.a aVar = this.f353046t;
        return ((k90.b) u0Var).vj(new bm5.y(aVar.f353022c, aVar.f353023d, aVar.f353024e, aVar.f353025f, aVar.f353021b, bm5.v.f104282o, bm5.f0.f104106u), aVar.f353021b, true);
    }

    @Override // kq.n
    public void p() {
        gg0.a aVar = this.f353046t;
        java.lang.String concat = o().concat("_cdn");
        try {
            pt0.e0 e0Var = pt0.f0.f439742b1;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k(aVar.f353022c, aVar.f353023d);
            if (k17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceDownloadTask", "onDownloadCancel[" + aVar.f353021b + "] msgInfo is null");
                return;
            }
            cv.h1 E = E();
            java.lang.String str = aVar.f353021b;
            ((bv.p0) E).getClass();
            w21.x0.e(k17, str);
            e0Var.b(aVar.f353022c, aVar.f353023d);
            if (com.p314xaae8f345.mm.vfs.w6.j(concat)) {
                com.p314xaae8f345.mm.vfs.w6.h(concat);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceDownloadTask", "onDownloadCancel[" + aVar.f353021b + "] post procedure error: " + e17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00da A[Catch: Exception -> 0x016f, TryCatch #0 {Exception -> 0x016f, blocks: (B:5:0x0092, B:7:0x00a5, B:9:0x00c8, B:11:0x00cd, B:17:0x00da, B:19:0x00e6, B:20:0x00eb, B:23:0x00f6, B:26:0x0103, B:32:0x013d, B:34:0x0156), top: B:4:0x0092 }] */
    @Override // kq.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r() {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gg0.j.r():void");
    }

    @Override // kq.n
    public void s() {
        w21.w0 w0Var;
        ((hg0.k) ((eg0.e) i95.n0.c(eg0.e.class))).wi(this.f353046t.f353021b);
        try {
            w0Var = this.f353047u;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceDownloadTask", "onDownloadSuccess: update msg failed, msgId:" + this.f353046t.f353023d + " talker:" + this.f353046t.f353022c + ": " + e17);
        }
        if (w0Var == null) {
            return;
        }
        pt0.e0 e0Var = pt0.f0.f439742b1;
        gg0.a aVar = this.f353046t;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k(aVar.f353022c, aVar.f353023d);
        if (k17 != null) {
            k17.r1(3);
            java.lang.String str = w0Var.f524030n;
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            k17.d1(w21.u0.c(str, java.lang.Math.max(w0Var.f524028l, 0), false));
            k17.l1(k17.F & (-8193));
            java.lang.String Q0 = k17.Q0();
            if (Q0 != null) {
                str2 = Q0;
            }
            e0Var.s(str2, k17.m124847x74d37ac6(), k17);
        }
        try {
            gg0.a aVar2 = this.f353046t;
            yz5.p pVar = aVar2.f353029j;
            if (pVar != null) {
                pVar.mo149xb9724478(aVar2.f353022c, java.lang.Long.valueOf(aVar2.f353023d));
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceDownloadTask", "onDownloadSuccess: onSuccess callback error: " + e18);
        }
        ((ku5.t0) ku5.t0.f394148d).B(new gg0.g(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0164  */
    @Override // kq.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r22) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gg0.j.t(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kq.n
    public void u() {
        gg0.a aVar = this.f353046t;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f353048v;
        if (f9Var != null) {
            this.f353048v = null;
            try {
                cv.h1 E = E();
                java.lang.String fileName = aVar.f353021b;
                ((bv.p0) E).getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
                java.util.HashMap hashMap = w21.x0.f524044a;
                w21.p0.Di().m0(bm5.y.a(f9Var, bm5.f0.f104106u), fileName);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceDownloadTask", "releaseHeldResources[" + aVar.f353021b + "] cleanFileOperator error: " + e17);
            }
        }
        D();
    }

    @Override // kq.n
    public void w(com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var, boolean z17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p947xba6de98f.m1 m1Var;
        gg0.a aVar = this.f353046t;
        java.util.Map map = aVar.f353028i;
        long j17 = this.f392756p;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        map.put("duration", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j17));
        if (n1Var == null || (m1Var = n1Var.f152636a) == null || (str = m1Var.name()) == null) {
            str = "";
        }
        map.put("cdn_status", str);
        map.put("is_ok", java.lang.Integer.valueOf(z17 ? 1 : 0));
        if (z17) {
            return;
        }
        java.util.Map map2 = aVar.f353028i;
        map2.put("is_cdn", 0);
        map2.put("is_cgi", 1);
        hg0.k kVar = (hg0.k) ((eg0.e) i95.n0.c(eg0.e.class));
        kVar.getClass();
        java.lang.String fileName = aVar.f353021b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        kVar.f362864d.computeIfPresent(fileName, hg0.i.f362858a);
        com.p314xaae8f345.mm.p947xba6de98f.m1 m1Var2 = n1Var != null ? n1Var.f152636a : null;
        kVar.Bi(fileName, (m1Var2 == null ? -1 : gg0.b.f353031a[m1Var2.ordinal()]) == 1 ? "cdn_cancel_fallback" : "cdn_error_fallback");
    }

    @Override // kq.n
    public boolean y() {
        gg0.a aVar = this.f353046t;
        try {
            cv.h1 E = E();
            java.lang.String str = aVar.f353021b;
            ((bv.p0) E).getClass();
            w21.w0 j17 = w21.x0.j(str);
            if (j17 == null) {
                return false;
            }
            j17.f524025i = 5;
            j17.f524023g = 0;
            j17.f524017a = 80;
            ((bv.p0) G()).Ui(aVar.f353021b, j17);
            this.f353047u = null;
            this.f353049w = 0;
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceDownloadTask", "resetForRetry[" + aVar.f353021b + "] error: " + e17);
            return false;
        }
    }

    @Override // w65.m
    public void z() {
        D();
    }

    @Override // w65.m
    public java.lang.Class z1() {
        return this.f353046t.f353020a;
    }
}
