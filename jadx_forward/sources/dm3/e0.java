package dm3;

/* loaded from: classes11.dex */
public class e0 extends al5.a0 {

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.FrameLayout f323209e;

    /* renamed from: f, reason: collision with root package name */
    public final pj4.t f323210f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f323211g;

    /* renamed from: h, reason: collision with root package name */
    public long f323212h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.wd6 f323213i;

    /* renamed from: m, reason: collision with root package name */
    public b66.n f323214m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f323215n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1919x34264a.p1920xd6f4cb44.C16660xe738cfd0 f323216o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f323217p;

    /* renamed from: q, reason: collision with root package name */
    public qk.a9 f323218q;

    /* renamed from: r, reason: collision with root package name */
    public final b66.t f323219r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f323220s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.concurrent.Future f323221t;

    /* renamed from: u, reason: collision with root package name */
    public int f323222u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f323223v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f323224w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f323225x;

    /* renamed from: y, reason: collision with root package name */
    public final int f323226y;

    public e0(java.lang.String str, android.widget.FrameLayout container, pj4.j0 j0Var, pj4.t tVar) {
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        this.f323209e = container;
        this.f323210f = tVar;
        this.f323211g = "MicroMsg.TingPullDownView";
        r45.wd6 wd6Var = new r45.wd6();
        this.f323213i = wd6Var;
        android.content.Context context = container.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1919x34264a.p1920xd6f4cb44.C16660xe738cfd0 c16660xe738cfd0 = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1919x34264a.p1920xd6f4cb44.C16660xe738cfd0(context);
        container.addView(c16660xe738cfd0);
        this.f323216o = c16660xe738cfd0;
        if (j0Var != null) {
            try {
                str2 = j0Var.f436675g;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(o(), "getOftenRead exp: %s", e17.getMessage());
            }
        } else {
            str2 = null;
        }
        wd6Var.mo11468x92b714fd(android.util.Base64.decode(str2, 2));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o(), "bindMvView " + hashCode());
        this.f323219r = new dm3.b0(this);
        this.f323226y = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void m(dm3.e0 e0Var, jm4.n2 n2Var, b66.n nVar) {
        qk.a9 a9Var = e0Var.f323218q;
        if (a9Var != null) {
            ((ul4.i) a9Var).f510150e = null;
        }
        if (n2Var != 0) {
            p3380x6a61f93.p3382xf513feca.C30532x21b415b4.m169658x21ba6b3a(((b66.i) n2Var).m105978x2737f10(), nVar);
        }
        qk.a9 a9Var2 = e0Var.f323218q;
        if (a9Var2 != null) {
            jm4.h0 h0Var = jm4.h0.f381922f;
            byte[] mo14344x5f01b1f6 = new bw5.vo0().mo14344x5f01b1f6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
            ((ul4.i) a9Var2).e(h0Var, mo14344x5f01b1f6);
        }
        ((b66.q) nVar).j(e0Var.f323219r);
        e0Var.f323214m = null;
    }

    @Override // al5.a0
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o(), "beforeJumpDetail");
        ((ku5.t0) ku5.t0.f394148d).B(new dm3.y(this));
    }

    @Override // al5.a0
    public void c() {
        b();
    }

    @Override // al5.a0
    public long d() {
        return this.f323226y;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // al5.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g() {
        /*
            r9 = this;
            r0 = 0
            r9.f87395d = r0
            java.lang.String r1 = r9.o()
            java.lang.String r2 = "Ting.onPostClose"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2)
            r9.f323220s = r0
            java.util.concurrent.Future r1 = r9.f323221t
            r2 = 0
            if (r1 == 0) goto L1c
            boolean r1 = r1.cancel(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L1d
        L1c:
            r1 = r2
        L1d:
            boolean r3 = iq.b.y()
            r4 = 1
            if (r3 != 0) goto L33
            android.widget.FrameLayout r3 = r9.f323209e
            android.content.Context r3 = r3.getContext()
            boolean r3 = iq.b.F(r3, r0)
            if (r3 == 0) goto L31
            goto L33
        L31:
            r3 = r0
            goto L34
        L33:
            r3 = r4
        L34:
            long r5 = r9.f323212h
            long r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(r5)
            r7 = 5
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L41
            r0 = r4
        L41:
            b66.n r4 = r9.f323214m
            if (r4 == 0) goto L88
            b66.q r4 = (b66.q) r4
            java.lang.String r4 = r4.d()
            if (r4 == 0) goto L88
            jm4.n2 r4 = r9.q()
            if (r4 == 0) goto L62
            jm4.p2 r4 = (jm4.p2) r4
            jm4.g3 r4 = r4.f()
            if (r4 == 0) goto L62
            b66.q r4 = (b66.q) r4
            java.lang.String r4 = r4.d()
            goto L63
        L62:
            r4 = r2
        L63:
            b66.n r5 = r9.f323214m
            if (r5 == 0) goto L6e
            b66.q r5 = (b66.q) r5
            java.lang.String r5 = r5.d()
            goto L6f
        L6e:
            r5 = r2
        L6f:
            boolean r4 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4, r5)
            if (r4 != 0) goto L88
            java.lang.String r4 = r9.o()
            java.lang.String r5 = "onPostClose stop current task"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r5)
            b66.n r4 = r9.f323214m
            if (r4 == 0) goto L91
            b66.q r4 = (b66.q) r4
            r4.m9898x360802()
            goto L91
        L88:
            java.lang.String r4 = r9.o()
            java.lang.String r5 = "onPostClose task not change"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r5)
        L91:
            b66.n r4 = r9.f323214m
            if (r4 == 0) goto L9c
            b66.t r5 = r9.f323219r
            b66.q r4 = (b66.q) r4
            r4.j(r5)
        L9c:
            r9.f323214m = r2
            java.lang.String r2 = r9.o()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "onPostClose@"
            r4.<init>(r5)
            int r5 = r9.hashCode()
            r4.append(r5)
            r5 = 32
            r4.append(r5)
            r4.append(r3)
            r4.append(r5)
            boolean r3 = r9.f323224w
            r4.append(r3)
            r4.append(r5)
            r4.append(r0)
            r4.append(r5)
            boolean r0 = r9.f323223v
            r4.append(r0)
            java.lang.String r0 = " 0 "
            r4.append(r0)
            int r0 = r9.f323222u
            r4.append(r0)
            java.lang.String r0 = ", cancelRet: "
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = r4.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            com.tencent.mm.plugin.mv.ui.open.text_status.TingMusicLyricsView r0 = r9.f323216o
            if (r0 == 0) goto Lee
            r0.b()
        Lee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dm3.e0.g():void");
    }

    @Override // bm5.s0
    /* renamed from: getTag */
    public java.lang.String mo10824xb5887064() {
        return "TingPullDownView";
    }

    @Override // al5.a0
    public void h() {
        bw5.v70 d17;
        boolean z17 = true;
        this.f87395d = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o(), "Ting.onPostOpen");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1919x34264a.p1920xd6f4cb44.C16660xe738cfd0 c16660xe738cfd0 = this.f323216o;
        if (c16660xe738cfd0 != null) {
            c16660xe738cfd0.a();
        }
        this.f323223v = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).nj();
        this.f323225x = true;
        boolean z18 = false;
        this.f323224w = false;
        r45.wd6 wd6Var = this.f323213i;
        java.lang.String str = wd6Var.f470611d;
        if (str != null && !r26.n0.N(str)) {
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(o(), "onPostOpenInner listen_id is null or blank");
            return;
        }
        if (this.f323223v) {
            qk.g9 g9Var = (qk.g9) i95.n0.c(qk.g9.class);
            java.lang.String listen_id = wd6Var.f470611d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(listen_id, "listen_id");
            ((rk4.z8) g9Var).getClass();
            jm4.g3 g3Var = zk4.l.f555073c;
            if (g3Var != null && rk4.k5.a(g3Var).h()) {
                bw5.lp0 b17 = rk4.k5.b(g3Var);
                z18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b((b17 == null || (d17 = b17.d()) == null) ? null : d17.m13170xcc16feb8(), listen_id);
            }
            this.f323224w = z18;
            if (z18) {
                s();
                b66.g q17 = q();
                b66.n a17 = q17 != null ? ((b66.i) q17).a() : null;
                this.f323214m = a17;
                if (a17 != null) {
                    ((b66.q) a17).a(this.f323219r);
                }
            } else {
                r();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                n(str);
            }
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            n(str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o(), "onPostOpen@" + hashCode() + ' ' + this.f323224w + "  " + this.f323223v);
        this.f323212h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
    }

    @Override // al5.a0
    public void i() {
        this.f323225x = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o(), "Ting.onPreClose needShowFloatBallWhenClose: " + this.f323217p);
        if (this.f323217p || p()) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p765xa4f4bf5f.C10691x3b04d9e9) ((xe0.g0) i95.n0.c(xe0.g0.class))).getClass();
            bk4.d1.f102985a.a(true);
            this.f323217p = false;
        }
    }

    @Override // al5.a0
    public void j() {
        boolean wi6 = ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).wi();
        this.f323217p = wi6;
        if (wi6) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p765xa4f4bf5f.C10691x3b04d9e9) ((xe0.g0) i95.n0.c(xe0.g0.class))).Vi(true);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o(), "Ting.onPreOpen hasTingFloatBallBefore: " + wi6);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p765xa4f4bf5f.C10691x3b04d9e9) ((xe0.g0) i95.n0.c(xe0.g0.class))).getClass();
        bk4.d1.f102985a.a(false);
    }

    @Override // al5.a0
    public void k(float f17) {
    }

    public final void n(java.lang.String listenId) {
        java.lang.String str;
        b66.n nVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenId, "listenId");
        if (this.f323214m != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o(), "doPlay do not createPlayer");
            return;
        }
        b66.g q17 = q();
        b66.n nVar2 = null;
        if (q17 != null && (nVar = (b66.n) p3380x6a61f93.p3382xf513feca.C30532x21b415b4.m169641x21b18192(((b66.i) q17).m105978x2737f10())) != null) {
            if (nVar instanceof jm4.g3) {
                ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).getClass();
                ul4.i iVar = new ul4.i(bw5.eq0.StandAlone, null, new com.p314xaae8f345.p3118xeeebfacc.C26845xac206036(nVar));
                this.f323218q = iVar;
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
        this.f323214m = nVar2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o(), "doPlay createPlayer");
        s();
        bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
        il4.e eVar = new il4.e(null, 0, 2001, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554427, null);
        il4.f fVar = eVar.f373655s;
        fVar.f373668g = listenId;
        pj4.t tVar = this.f323210f;
        if (tVar != null && (str = tVar.f436825h) != null) {
            fVar.f373665d.put("textstatus", str);
        }
        il4.l.q(eVar, false, null, null, 12, null);
        if (nVar2 != null) {
            ((b66.q) nVar2).a(this.f323219r);
        }
        int i17 = jm4.m3.f381931e;
        com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 interfaceC26826xca759055 = (jm4.k3) p3380x6a61f93.p3381xf512d0a5.C30437x21b323b2.m168976x21b902b8(new java.lang.String[]{listenId});
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(interfaceC26826xca759055, "null cannot be cast to non-null type com.tencent.mm.plugin.ting.ur.PlayTaskService");
        ((b66.c) interfaceC26826xca759055).e(2001);
        if (nVar2 != null) {
            p3380x6a61f93.p3382xf513feca.C30534x21b91836.m169714x21ba27fe(((b66.q) nVar2).m105978x2737f10(), interfaceC26826xca759055, 0);
        }
    }

    public java.lang.String o() {
        return this.f323211g;
    }

    @Override // al5.a0, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o(), "onDestroy@" + hashCode());
    }

    public final boolean p() {
        java.lang.String str = this.f323213i.f470611d;
        if (str == null || r26.n0.N(str)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        return p3380x6a61f93.p3382xf513feca.C30526x21b2a946.m169584x21b4b96a(str, null);
    }

    public final jm4.n2 q() {
        if (p()) {
            jm4.u2 a17 = jm4.w2.f381968d.a();
            if (a17 == null) {
                return null;
            }
            return ((jm4.w2) a17).a(bw5.eq0.BizAudio);
        }
        jm4.u2 a18 = jm4.w2.f381968d.a();
        if (a18 == null) {
            return null;
        }
        return ((jm4.w2) a18).a(bw5.eq0.TingMusic);
    }

    public void r() {
        this.f323222u = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Di();
        ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).uj();
        ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Ni();
    }

    public final void s() {
        dm3.c0 c0Var = new dm3.c0(new java.lang.ref.WeakReference(this));
        if (this.f323215n) {
            return;
        }
        r45.wd6 wd6Var = this.f323213i;
        java.lang.String str = wd6Var.f470611d;
        if (str == null || r26.n0.N(str)) {
            return;
        }
        this.f323215n = true;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        bw5.l70 l70Var = new bw5.l70();
        bw5.k70 k70Var = new bw5.k70();
        k70Var.f110805d = wd6Var.f470611d;
        boolean[] zArr = k70Var.f110812n;
        zArr[1] = true;
        k70Var.f110809h = true;
        zArr[11] = true;
        k70Var.f110806e = 1;
        zArr[2] = true;
        l70Var.f111207d.add(k70Var);
        l70Var.f111209f[3] = true;
        byte[] mo14344x5f01b1f6 = l70Var.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
        lVar.f152197a = new qk.s9(mo14344x5f01b1f6);
        lVar.f152198b = new qk.t9();
        lVar.f152199c = "/cgi-bin/mmlistenappsvr/articlegettext";
        lVar.f152200d = 5950;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o(), "getMMListenItem callback listenId = " + wd6Var.f470611d);
        com.p314xaae8f345.mm.p944x882e457a.z2.d(a17, new dm3.z(this, c0Var), false);
    }
}
