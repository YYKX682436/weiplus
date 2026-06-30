package dm3;

/* loaded from: classes11.dex */
public class o extends al5.a0 {

    /* renamed from: e, reason: collision with root package name */
    public final pj4.j0 f323248e;

    /* renamed from: f, reason: collision with root package name */
    public final pj4.t f323249f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f323250g;

    /* renamed from: h, reason: collision with root package name */
    public b66.n f323251h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1919x34264a.p1920xd6f4cb44.C16660xe738cfd0 f323252i;

    /* renamed from: m, reason: collision with root package name */
    public final qk.g9 f323253m;

    /* renamed from: n, reason: collision with root package name */
    public r45.xs4 f323254n;

    /* renamed from: o, reason: collision with root package name */
    public r45.hf2 f323255o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f323256p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f323257q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f323258r;

    /* renamed from: s, reason: collision with root package name */
    public qk.a9 f323259s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f323260t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.concurrent.Future f323261u;

    /* renamed from: v, reason: collision with root package name */
    public final b66.t f323262v;

    public o(java.lang.String str, android.widget.FrameLayout container, pj4.j0 j0Var, pj4.t tVar, int i17) {
        java.lang.String m75945x2fec8307;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1919x34264a.p1920xd6f4cb44.C16660xe738cfd0 c16660xe738cfd0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        this.f323248e = j0Var;
        this.f323249f = tVar;
        this.f323250g = "MicroMsg.MusicPullDownViewNew" + hashCode();
        this.f323253m = (qk.g9) i95.n0.c(qk.g9.class);
        this.f323256p = "";
        android.content.Context context = container.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1919x34264a.p1920xd6f4cb44.C16660xe738cfd0 c16660xe738cfd02 = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1919x34264a.p1920xd6f4cb44.C16660xe738cfd0(context);
        container.addView(c16660xe738cfd02);
        this.f323252i = c16660xe738cfd02;
        try {
            n();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(m(), " exp: " + e17.getMessage());
        }
        r45.xs4 xs4Var = this.f323254n;
        if (xs4Var == null || (m75945x2fec8307 = xs4Var.m75945x2fec8307(15)) == null) {
            r45.hf2 hf2Var = this.f323255o;
            m75945x2fec8307 = hf2Var != null ? hf2Var.m75945x2fec8307(6) : null;
        }
        if (m75945x2fec8307 != null && (c16660xe738cfd0 = this.f323252i) != null) {
            c16660xe738cfd0.m67277x8f970a37(m75945x2fec8307);
        }
        this.f323262v = new dm3.m(this);
    }

    @Override // al5.a0
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m(), "beforeJumpDetail: " + this.f323258r);
        this.f323258r = false;
    }

    @Override // al5.a0
    public void c() {
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    @Override // al5.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g() {
        /*
            r4 = this;
            r0 = 0
            r4.f87395d = r0
            r4.f323260t = r0
            java.util.concurrent.Future r1 = r4.f323261u
            r2 = 0
            if (r1 == 0) goto L13
            boolean r0 = r1.cancel(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L14
        L13:
            r0 = r2
        L14:
            b66.n r1 = r4.f323251h
            if (r1 == 0) goto L1f
            b66.q r1 = (b66.q) r1
            java.lang.String r1 = r1.d()
            goto L20
        L1f:
            r1 = r2
        L20:
            if (r1 == 0) goto L5a
            qk.g9 r1 = r4.f323253m
            rk4.z8 r1 = (rk4.z8) r1
            r1.getClass()
            jm4.g3 r1 = zk4.l.f555073c
            if (r1 == 0) goto L34
            b66.q r1 = (b66.q) r1
            java.lang.String r1 = r1.d()
            goto L35
        L34:
            r1 = r2
        L35:
            b66.n r3 = r4.f323251h
            if (r3 == 0) goto L40
            b66.q r3 = (b66.q) r3
            java.lang.String r3 = r3.d()
            goto L41
        L40:
            r3 = r2
        L41:
            boolean r1 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r1, r3)
            if (r1 != 0) goto L5a
            java.lang.String r1 = r4.m()
            java.lang.String r3 = "onPostClose stop current task"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r3)
            b66.n r1 = r4.f323251h
            if (r1 == 0) goto L63
            b66.q r1 = (b66.q) r1
            r1.m9898x360802()
            goto L63
        L5a:
            java.lang.String r1 = r4.m()
            java.lang.String r3 = "onPostClose task not change"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r3)
        L63:
            b66.n r1 = r4.f323251h
            if (r1 == 0) goto L6e
            b66.t r3 = r4.f323262v
            b66.q r1 = (b66.q) r1
            r1.j(r3)
        L6e:
            r4.f323251h = r2
            java.lang.String r1 = r4.m()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onPostClose cancelRet: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dm3.o.g():void");
    }

    @Override // bm5.s0
    /* renamed from: getTag */
    public java.lang.String mo10824xb5887064() {
        return "MusicPullDownViewNew";
    }

    @Override // al5.a0
    public void h() {
        java.lang.String str;
        b66.n nVar;
        this.f87395d = true;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1919x34264a.p1920xd6f4cb44.C16660xe738cfd0 c16660xe738cfd0 = this.f323252i;
        if (c16660xe738cfd0 != null) {
            c16660xe738cfd0.a();
        }
        ((rk4.z8) this.f323253m).nj();
        this.f323257q = true;
        r45.hf2 hf2Var = this.f323255o;
        if (hf2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(m(), "musicShareObject is  null ");
            return;
        }
        bw5.lp0 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.oa0.f208835a.b(hf2Var, dm3.k.b(this.f323248e, hf2Var), this.f323254n);
        if (this.f323251h != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m(), "onPostOpenInner do not createPlayer");
            return;
        }
        b66.g o17 = o();
        b66.n nVar2 = null;
        if (o17 != null && (nVar = (b66.n) p3380x6a61f93.p3382xf513feca.C30532x21b415b4.m169641x21b18192(((b66.i) o17).m105978x2737f10())) != null) {
            if (nVar instanceof jm4.g3) {
                ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).getClass();
                ul4.i iVar = new ul4.i(bw5.eq0.StandAlone, null, new com.p314xaae8f345.p3118xeeebfacc.C26845xac206036(nVar));
                this.f323259s = iVar;
                p3380x6a61f93.p3381xf512d0a5.C30495x21b91836.m169358x21b278b5(((jm4.h3) ((jm4.g3) nVar)).m105978x2737f10(), iVar);
            }
            nVar2 = nVar;
        }
        if (nVar2 != null) {
            bw5.hq0 hq0Var = new bw5.hq0();
            hq0Var.f109859d = true;
            hq0Var.f109863h[1] = true;
            byte[] mo14344x5f01b1f6 = hq0Var.mo14344x5f01b1f6();
            long m105978x2737f10 = ((b66.q) nVar2).m105978x2737f10();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f6);
            p3380x6a61f93.p3382xf513feca.C30534x21b91836.m169692x21b33293(m105978x2737f10, mo14344x5f01b1f6);
        }
        this.f323251h = nVar2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m(), "onPostOpenInner createPlayer");
        bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
        il4.e eVar = new il4.e(null, 0, 2001, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554427, null);
        pj4.t tVar = this.f323249f;
        if (tVar != null && (str = tVar.f436825h) != null) {
            eVar.f373655s.f373665d.put("textstatus", str);
        }
        il4.l.q(eVar, false, null, b17, 4, null);
        if (nVar2 != null) {
            ((b66.q) nVar2).a(this.f323262v);
        }
        int i17 = jm4.m3.f381931e;
        bw5.lp0[] item = (bw5.lp0[]) kz5.b0.c(b17).toArray(new bw5.lp0[0]);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 interfaceC26826xca759055 = (jm4.k3) p3380x6a61f93.p3381xf512d0a5.C30437x21b323b2.m168944x21b0a451(jm4.r5.a(item));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(interfaceC26826xca759055, "null cannot be cast to non-null type com.tencent.mm.plugin.ting.ur.PlayTaskService");
        ((b66.c) interfaceC26826xca759055).e(2001);
        if (nVar2 != null) {
            p3380x6a61f93.p3382xf513feca.C30534x21b91836.m169714x21ba27fe(((b66.q) nVar2).m105978x2737f10(), interfaceC26826xca759055, 0);
        }
    }

    @Override // al5.a0
    public void i() {
        this.f323257q = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m(), "onPreClose needShowFloatBallWhenClose: " + this.f323258r);
        if (this.f323258r) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p765xa4f4bf5f.C10691x3b04d9e9) ((xe0.g0) i95.n0.c(xe0.g0.class))).getClass();
            bk4.d1.f102985a.a(true);
        }
    }

    @Override // al5.a0
    public void j() {
        this.f323258r = ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).wi();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m(), "onPreOpen hasTingFloatBallBefore: " + this.f323258r);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p765xa4f4bf5f.C10691x3b04d9e9) ((xe0.g0) i95.n0.c(xe0.g0.class))).getClass();
        bk4.d1.f102985a.a(false);
    }

    @Override // al5.a0
    public void k(float f17) {
    }

    public java.lang.String m() {
        return this.f323250g;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048 A[Catch: all -> 0x00d4, Exception -> 0x00d6, TryCatch #1 {Exception -> 0x00d6, blocks: (B:7:0x001a, B:9:0x0023, B:11:0x003c, B:16:0x0048, B:18:0x004c, B:19:0x0052, B:20:0x0065, B:22:0x0074, B:23:0x007c, B:25:0x0082, B:26:0x0089, B:28:0x008f, B:29:0x0097, B:31:0x009d, B:32:0x00a3, B:38:0x0057, B:40:0x005b), top: B:6:0x001a, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074 A[Catch: all -> 0x00d4, Exception -> 0x00d6, TryCatch #1 {Exception -> 0x00d6, blocks: (B:7:0x001a, B:9:0x0023, B:11:0x003c, B:16:0x0048, B:18:0x004c, B:19:0x0052, B:20:0x0065, B:22:0x0074, B:23:0x007c, B:25:0x0082, B:26:0x0089, B:28:0x008f, B:29:0x0097, B:31:0x009d, B:32:0x00a3, B:38:0x0057, B:40:0x005b), top: B:6:0x001a, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082 A[Catch: all -> 0x00d4, Exception -> 0x00d6, TryCatch #1 {Exception -> 0x00d6, blocks: (B:7:0x001a, B:9:0x0023, B:11:0x003c, B:16:0x0048, B:18:0x004c, B:19:0x0052, B:20:0x0065, B:22:0x0074, B:23:0x007c, B:25:0x0082, B:26:0x0089, B:28:0x008f, B:29:0x0097, B:31:0x009d, B:32:0x00a3, B:38:0x0057, B:40:0x005b), top: B:6:0x001a, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f A[Catch: all -> 0x00d4, Exception -> 0x00d6, TryCatch #1 {Exception -> 0x00d6, blocks: (B:7:0x001a, B:9:0x0023, B:11:0x003c, B:16:0x0048, B:18:0x004c, B:19:0x0052, B:20:0x0065, B:22:0x0074, B:23:0x007c, B:25:0x0082, B:26:0x0089, B:28:0x008f, B:29:0x0097, B:31:0x009d, B:32:0x00a3, B:38:0x0057, B:40:0x005b), top: B:6:0x001a, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d A[Catch: all -> 0x00d4, Exception -> 0x00d6, TryCatch #1 {Exception -> 0x00d6, blocks: (B:7:0x001a, B:9:0x0023, B:11:0x003c, B:16:0x0048, B:18:0x004c, B:19:0x0052, B:20:0x0065, B:22:0x0074, B:23:0x007c, B:25:0x0082, B:26:0x0089, B:28:0x008f, B:29:0x0097, B:31:0x009d, B:32:0x00a3, B:38:0x0057, B:40:0x005b), top: B:6:0x001a, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0057 A[Catch: all -> 0x00d4, Exception -> 0x00d6, TryCatch #1 {Exception -> 0x00d6, blocks: (B:7:0x001a, B:9:0x0023, B:11:0x003c, B:16:0x0048, B:18:0x004c, B:19:0x0052, B:20:0x0065, B:22:0x0074, B:23:0x007c, B:25:0x0082, B:26:0x0089, B:28:0x008f, B:29:0x0097, B:31:0x009d, B:32:0x00a3, B:38:0x0057, B:40:0x005b), top: B:6:0x001a, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dm3.o.n():void");
    }

    public final jm4.n2 o() {
        jm4.u2 a17 = jm4.w2.f381968d.a();
        if (a17 == null) {
            return null;
        }
        return ((jm4.w2) a17).a(bw5.eq0.TingMusic);
    }
}
