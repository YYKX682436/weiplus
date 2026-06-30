package rk4;

@j95.b(m140513x1e06fd29 = {e70.q.class})
/* loaded from: classes11.dex */
public final class z8 extends i95.w implements qk.g9 {

    /* renamed from: o, reason: collision with root package name */
    public static boolean f478665o;

    /* renamed from: d, reason: collision with root package name */
    public rk4.k8 f478666d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f478667e = jz5.h.b(rk4.s8.f478505d);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f478668f = jz5.h.b(rk4.v8.f478565d);

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f478669g = jz5.h.b(rk4.w8.f478598d);

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f478670h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f478671i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f478672m;

    /* renamed from: n, reason: collision with root package name */
    public final rk4.c4 f478673n;

    public z8() {
        jz5.h.b(rk4.l8.f478366d);
        this.f478670h = jz5.h.a(jz5.i.f384362d, rk4.x8.f478621d);
        this.f478671i = jz5.h.b(rk4.u8.f478546d);
        this.f478672m = jz5.h.b(rk4.t8.f478529d);
        this.f478673n = new rk4.c4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void wi(rk4.z8 z8Var, jm4.m3 m3Var, int i17) {
        z8Var.getClass();
        zk4.l lVar = zk4.l.f555071a;
        jm4.g3 b17 = lVar.b();
        if (b17 == 0) {
            return;
        }
        jm4.f3.a(b17, m3Var, i17, null, 4, null);
        lVar.c(b17);
        if (rk4.k5.a(b17) == qk.ia.f445706i) {
            b66.m.b(b17, null, 1, null);
            return;
        }
        b66.q qVar = (b66.q) b17;
        int f17 = qVar.f();
        if (f17 >= 0) {
            i17 = f17;
        }
        p3380x6a61f93.p3382xf513feca.C30534x21b91836.m169693x21b38426(qVar.m105978x2737f10(), i17);
    }

    public int Ai() {
        zk4.l lVar = zk4.l.f555071a;
        jm4.g3 g3Var = zk4.l.f555073c;
        if (g3Var != null) {
            return (int) ((jm4.h3) g3Var).k();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bw5.nb0 Bi(bw5.v70 r8) {
        /*
            r7 = this;
            java.lang.Class<e42.e0> r0 = e42.e0.class
            i95.m r0 = i95.n0.c(r0)
            e42.e0 r0 = (e42.e0) r0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            e42.c0 r3 = e42.c0.clicfg_ting_finder_music_tail
            h62.d r0 = (h62.d) r0
            int r0 = r0.Ni(r3, r2)
            if (r0 != r2) goto L18
            r0 = r2
            goto L19
        L18:
            r0 = r1
        L19:
            r3 = 0
            if (r0 != 0) goto L1d
            return r3
        L1d:
            if (r8 == 0) goto L8e
            int r0 = r8.f115722e
            if (r0 != r2) goto L8e
            bw5.z90 r0 = r8.j()
            bw5.nb0 r0 = r0.n()
            int r0 = r0.f112131d
            java.lang.String r4 = "getFinderUsername(...)"
            r5 = 2
            if (r0 != r5) goto L55
            bw5.z90 r0 = r8.j()
            bw5.nb0 r0 = r0.n()
            java.lang.String r0 = r0.m12568x93d5ac12()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r4)
            int r0 = r0.length()
            if (r0 <= 0) goto L49
            r0 = r2
            goto L4a
        L49:
            r0 = r1
        L4a:
            if (r0 == 0) goto L55
            bw5.z90 r8 = r8.j()
            bw5.nb0 r8 = r8.n()
            return r8
        L55:
            bw5.z90 r8 = r8.j()
            java.util.LinkedList r8 = r8.B
            java.util.Iterator r8 = r8.iterator()
        L5f:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L8e
            java.lang.Object r0 = r8.next()
            bw5.ob0 r0 = (bw5.ob0) r0
            bw5.nb0 r6 = r0.b()
            java.lang.String r6 = r6.m12568x93d5ac12()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, r4)
            int r6 = r6.length()
            if (r6 <= 0) goto L7e
            r6 = r2
            goto L7f
        L7e:
            r6 = r1
        L7f:
            if (r6 == 0) goto L5f
            bw5.nb0 r6 = r0.b()
            int r6 = r6.f112131d
            if (r6 != r5) goto L5f
            bw5.nb0 r8 = r0.b()
            return r8
        L8e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.z8.Bi(bw5.v70):bw5.nb0");
    }

    public int Di() {
        zk4.l lVar = zk4.l.f555071a;
        jm4.g3 g3Var = zk4.l.f555073c;
        if (g3Var != null) {
            return (int) ((jm4.h3) g3Var).m();
        }
        return 0;
    }

    public int Ni() {
        jm4.z2 z2Var;
        com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 interfaceC26826xca759055;
        jm4.g3 g3Var = zk4.l.f555073c;
        if (g3Var == null || (z2Var = (jm4.z2) p3380x6a61f93.p3381xf512d0a5.C30495x21b91836.m169369x21b488b2(((jm4.h3) g3Var).m105978x2737f10())) == null || (interfaceC26826xca759055 = (jm4.k3) p3380x6a61f93.p3381xf512d0a5.C30411x21b15b29.m168663x21b4ae47(((jm4.a3) z2Var).m105978x2737f10())) == null) {
            return 0;
        }
        return ((b66.c) interfaceC26826xca759055).d();
    }

    public qk.ia Ri() {
        zk4.l lVar = zk4.l.f555071a;
        jm4.g3 g3Var = zk4.l.f555073c;
        return g3Var != null ? rk4.k5.a(g3Var) : qk.ia.f445703f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (r8 != 4) goto L108;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject Ui(bw5.lp0 r8, float r9) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.z8.Ui(bw5.lp0, float):org.json.JSONObject");
    }

    public java.lang.String Vi(int i17) {
        bw5.lp0 uj6;
        zk4.l lVar = zk4.l.f555071a;
        jm4.g3 g3Var = zk4.l.f555073c;
        boolean z17 = false;
        if (g3Var != null && rk4.k5.a(g3Var).h()) {
            z17 = true;
        }
        if (!z17 || (uj6 = uj()) == null) {
            return null;
        }
        return uj6.b();
    }

    public final jm4.i4 Zi() {
        return (jm4.i4) ((jz5.n) this.f478667e).mo141623x754a37bb();
    }

    public qk.f9 aj() {
        if (this.f478666d == null) {
            this.f478666d = new rk4.k8();
        }
        rk4.k8 k8Var = this.f478666d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k8Var);
        return k8Var;
    }

    public android.content.Context bj() {
        android.app.Activity Ui = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Ui();
        if (Ui != null) {
            return Ui;
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return context;
    }

    public jm4.i5 cj() {
        jm4.i5 i5Var;
        synchronized (jm4.i5.class) {
            int i17 = jm4.k5.f381928d;
            i5Var = (jm4.i5) p3380x6a61f93.p3381xf512d0a5.C30405x21b11ba7.m168602x21b0d463();
        }
        return i5Var;
    }

    public boolean fj() {
        zk4.l lVar = zk4.l.f555071a;
        jm4.g3 g3Var = zk4.l.f555073c;
        if (g3Var != null) {
            return rk4.k5.a(g3Var).h();
        }
        return false;
    }

    public float h() {
        jm4.g3 b17 = zk4.l.f555071a.b();
        if (b17 != null) {
            return ((jm4.h3) b17).h();
        }
        return 1.0f;
    }

    public boolean hj() {
        zk4.l lVar = zk4.l.f555071a;
        jm4.g3 g3Var = zk4.l.f555073c;
        return g3Var == null || rk4.k5.a(g3Var) == qk.ia.f445703f;
    }

    public boolean ij() {
        jm4.g3 g3Var = zk4.l.f555073c;
        return g3Var != null && rk4.k5.a(g3Var) == qk.ia.f445706i;
    }

    public boolean mj(java.lang.String str) {
        jm4.g3 g3Var = zk4.l.f555073c;
        if (g3Var != null) {
            if (rk4.k5.a(g3Var) == qk.ia.f445706i) {
                bw5.lp0 b17 = rk4.k5.b(g3Var);
                return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17 != null ? b17.b() : null, str);
            }
        }
        return false;
    }

    public boolean nj() {
        jm4.g3 g3Var = zk4.l.f555073c;
        return g3Var != null && rk4.k5.a(g3Var) == qk.ia.f445704g;
    }

    public boolean oj(java.lang.String id6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        zk4.l lVar = zk4.l.f555071a;
        jm4.g3 g3Var = zk4.l.f555073c;
        if (g3Var == null || !rk4.k5.a(g3Var).h()) {
            return false;
        }
        bw5.lp0 b17 = rk4.k5.b(g3Var);
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17 != null ? b17.b() : null, id6);
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        ((ku5.t0) ku5.t0.f394148d).k(rk4.n8.f478401d, 15000L);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        rk4.k8 k8Var = this.f478666d;
        if (k8Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(k8Var, null, null, new rk4.z7(k8Var, null), 3, null);
        }
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo8845x3e5a77bb(context);
        rk4.k5.e("TingServicesImpl init", null);
        ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
        rk4.k5.e("TingServicesImpl initIlink end", null);
        boolean z17 = bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2573x3652ee.C20767x5285e052()) == 1;
        p3380x6a61f93.p3381xf512d0a5.C30414x21b1610a.m168684x21b1bf55(z17);
        rk4.k5.e("TingServicesImpl init end disableRedDotSyncFrequencyControl:" + z17, null);
        km4.q qVar = new km4.q();
        int i17 = w71.s0.f524981d;
        p3380x6a61f93.p3386xf51b86f1.C30594x21b1b41c.m170116x21b80ec3("ting", qVar);
        synchronized (rk4.z8.class) {
            f478665o = true;
            rk4.k5.e("setInitialized", "MicroMsg.TingServicesImpl");
        }
    }

    public boolean pj() {
        zk4.l lVar = zk4.l.f555071a;
        jm4.g3 g3Var = zk4.l.f555073c;
        if (g3Var != null) {
            b66.m.a(g3Var, null, 1, null);
        }
        return true;
    }

    public void qj(java.lang.String taskId, bw5.lp0 item, il4.e ext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ext, "ext");
        java.util.List c17 = kz5.b0.c(item);
        if (ext.f373639c == 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.TingServicesImpl", "play with fromScene 0", new java.lang.Object[0]);
        }
        pm0.v.X(new rk4.o8(c17, ext, this));
    }

    public void rj(bw5.lp0 lp0Var, java.util.List list, bw5.o50 o50Var, bw5.pp0 pp0Var, il4.e ext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ext, "ext");
        if (ext.f373639c == 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.TingServicesImpl", "playWithCategory with fromScene 0", new java.lang.Object[0]);
        }
        if (lp0Var == null && list == null && o50Var == null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.TingServicesImpl", "playWithCategory with invalid params", new java.lang.Object[0]);
        } else {
            pm0.v.X(new rk4.p8(list, lp0Var, o50Var, pp0Var, ext, this));
        }
    }

    public void sj(java.lang.String listenId, il4.e ext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenId, "listenId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ext, "ext");
        pm0.v.X(new rk4.q8(listenId, ext, this));
    }

    public void tj(bw5.fr0 tingTaskSnapshot, il4.e ext) {
        bw5.lp0 lp0Var;
        bw5.dr0 c17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tingTaskSnapshot, "tingTaskSnapshot");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ext, "ext");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingServicesImpl", "playWithTaskSnapShot");
        boolean[] zArr = tingTaskSnapshot.f109032n;
        bw5.lp0 lp0Var2 = null;
        bw5.lp0 b17 = zArr[3] ? tingTaskSnapshot.b() : null;
        if (b17 == null) {
            if (zArr[1]) {
                bw5.dr0 c18 = tingTaskSnapshot.c();
                if ((c18 != null && c18.f108134m[2]) && (c17 = tingTaskSnapshot.c()) != null) {
                    lp0Var2 = c17.c();
                }
            }
            lp0Var = lp0Var2;
        } else {
            lp0Var = b17;
        }
        il4.l.q(ext, false, null, lp0Var, 4, null);
        if (zArr[1]) {
            pm0.v.X(new rk4.r8(this, tingTaskSnapshot, ext));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingServicesImpl", "playWithTaskSnapShot tapeItem is null");
        }
    }

    public bw5.lp0 uj() {
        zk4.l lVar = zk4.l.f555071a;
        jm4.g3 g3Var = zk4.l.f555073c;
        if (g3Var != null) {
            return rk4.k5.b(g3Var);
        }
        return null;
    }

    public bw5.cr0 vj() {
        jm4.g3 g3Var = zk4.l.f555073c;
        if (g3Var == null) {
            return null;
        }
        bw5.cr0 cr0Var = new bw5.cr0();
        byte[] m169384x21b9f01f = p3380x6a61f93.p3381xf512d0a5.C30495x21b91836.m169384x21b9f01f(((jm4.h3) g3Var).m105978x2737f10());
        if (m169384x21b9f01f.length == 0) {
            rk4.k5.d("playingTapInfo is empty", "TingKt");
            return null;
        }
        try {
            cr0Var.mo11468x92b714fd(m169384x21b9f01f);
            return cr0Var;
        } catch (java.lang.Exception e17) {
            rk4.k5.d(e17.toString(), null);
            return null;
        }
    }

    public boolean wj() {
        zk4.l lVar = zk4.l.f555071a;
        jm4.g3 g3Var = zk4.l.f555073c;
        if (g3Var != null) {
            if (rk4.k5.a(g3Var) == qk.ia.f445706i) {
                b66.m.b(g3Var, null, 1, null);
                lVar.c(g3Var);
                return true;
            }
        }
        return false;
    }

    public boolean xj(long j17) {
        com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 interfaceC26826xca759055 = zk4.l.f555073c;
        if (interfaceC26826xca759055 == null) {
            return false;
        }
        p3380x6a61f93.p3382xf513feca.C30534x21b91836.m169685x21b226bd(((b66.q) interfaceC26826xca759055).m105978x2737f10(), j17);
        return true;
    }

    public void yj(float f17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingServicesImpl", "setPlayRate " + f17);
        com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 b17 = zk4.l.f555071a.b();
        if (b17 != null) {
            p3380x6a61f93.p3382xf513feca.C30534x21b91836.m169700x21b814a1(((b66.q) b17).m105978x2737f10(), f17);
        }
    }

    public boolean zj() {
        zk4.l lVar = zk4.l.f555071a;
        com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 interfaceC26826xca759055 = zk4.l.f555073c;
        if (interfaceC26826xca759055 == null) {
            return false;
        }
        ((b66.q) interfaceC26826xca759055).m9898x360802();
        return true;
    }
}
