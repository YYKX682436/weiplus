package mm2;

/* loaded from: classes3.dex */
public final class e0 extends mm2.e {

    /* renamed from: v, reason: collision with root package name */
    public static int f410498v;

    /* renamed from: f, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f410499f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f410500g;

    /* renamed from: h, reason: collision with root package name */
    public final im5.c f410501h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f410502i;

    /* renamed from: m, reason: collision with root package name */
    public p012xc85e97e9.p093xedfae76a.j0 f410503m;

    /* renamed from: n, reason: collision with root package name */
    public long f410504n;

    /* renamed from: o, reason: collision with root package name */
    public int f410505o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f410506p;

    /* renamed from: q, reason: collision with root package name */
    public long f410507q;

    /* renamed from: r, reason: collision with root package name */
    public int f410508r;

    /* renamed from: s, reason: collision with root package name */
    public lm2.h0 f410509s;

    /* renamed from: t, reason: collision with root package name */
    public r45.qt2 f410510t;

    /* renamed from: u, reason: collision with root package name */
    public lm2.g f410511u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f410499f = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(java.lang.Boolean.FALSE);
        this.f410501h = new im5.c();
        this.f410502i = true;
        this.f410503m = new p012xc85e97e9.p093xedfae76a.j0();
        this.f410505o = -1;
        this.f410506p = true;
    }

    public final void N6(r45.qm1 box) {
        lm2.j0 c17;
        r45.qn qnVar;
        lm2.j0 j0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(box, "box");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o0 o0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o0.f183953a;
        o0Var.c("Finder.LiveBoxSlice", "LiveBoxSlice enterBox: " + box.m75945x2fec8307(1));
        java.lang.String m75945x2fec8307 = box.m75945x2fec8307(1);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        boolean z17 = false;
        if (m75945x2fec8307.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.LiveBoxSlice", "enterBox but boxId isEmpty");
            return;
        }
        r45.qm1 qm1Var = (r45.qm1) this.f410503m.mo3195x754a37bb();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(qm1Var != null ? qm1Var.m75945x2fec8307(1) : null, m75945x2fec8307)) {
            return;
        }
        lm2.h0 h0Var = this.f410509s;
        if (h0Var != null) {
            long c18 = c01.id.c();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) h0Var.f400929c.mo3195x754a37bb();
            if (concurrentHashMap != null && concurrentHashMap.containsKey(m75945x2fec8307)) {
                z17 = true;
            }
            if (z17) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) h0Var.f400929c.mo3195x754a37bb();
                if (concurrentHashMap2 != null && (j0Var = (lm2.j0) concurrentHashMap2.get(m75945x2fec8307)) != null) {
                    j0Var.f400943c = c18;
                    j0Var.f400944d.f465638h = c18;
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.BoxDataStore", "enterBox without prepare");
            }
        }
        lm2.h0 h0Var2 = this.f410509s;
        if (h0Var2 != null && (c17 = h0Var2.c()) != null && (qnVar = c17.f400944d) != null) {
            o0Var.c("Finder.LiveBoxSlice", "LiveBoxSlice startPollingMsg, boxContext hashCode:" + qnVar.hashCode() + ", logInfo: " + o0Var.b(qnVar));
            lm2.h0 h0Var3 = this.f410509s;
            if (h0Var3 != null) {
                r45.qt2 qt2Var = this.f410510t;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxDataStore", "startPollingMsg, boxId:" + box.m75945x2fec8307(1) + ", boxContext " + o0Var.b(qnVar) + ", " + qnVar.f465635e);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxDataStore", "stopPollingMsg");
                km2.m0 m0Var = h0Var3.f400933g;
                if (m0Var != null) {
                    p3325xe03a0797.p3326xc267989b.r2 r2Var = m0Var.f390679d;
                    if (r2Var != null) {
                        p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                    }
                    m0Var.f390679d = null;
                }
                km2.m0 m0Var2 = new km2.m0(new lm2.s(h0Var3, box, qnVar, qt2Var), p3325xe03a0797.p3326xc267989b.q1.f392103c, 1000L);
                h0Var3.f400933g = m0Var2;
                m0Var2.f390679d = p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(m0Var2.f390677b), null, null, new km2.l0(m0Var2, null), 3, null);
            }
        }
        this.f410503m.mo523x53d8522f(box);
        this.f410504n = c01.id.c();
    }

    public final void O6() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LiveBoxSlice exitBox: ");
        r45.qm1 qm1Var = (r45.qm1) this.f410503m.mo3195x754a37bb();
        sb6.append(qm1Var != null ? qm1Var.m75945x2fec8307(1) : null);
        java.lang.String str = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "str");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveBoxSlice", "mainFlowLog ".concat(str));
        if (this.f410503m.mo3195x754a37bb() == null) {
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("LiveBoxSlice stopPollingMsg: ");
        r45.qm1 qm1Var2 = (r45.qm1) this.f410503m.mo3195x754a37bb();
        sb7.append(qm1Var2 != null ? qm1Var2.m75945x2fec8307(1) : null);
        java.lang.String str2 = sb7.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "str");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveBoxSlice", "mainFlowLog ".concat(str2));
        lm2.h0 h0Var = this.f410509s;
        if (h0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxDataStore", "stopPollingMsg");
            km2.m0 m0Var = h0Var.f400933g;
            if (m0Var != null) {
                p3325xe03a0797.p3326xc267989b.r2 r2Var = m0Var.f390679d;
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                }
                m0Var.f390679d = null;
            }
        }
        this.f410503m.mo523x53d8522f(null);
        this.f410504n = 0L;
    }

    public final boolean P6() {
        r45.qm1 qm1Var = (r45.qm1) this.f410503m.mo3195x754a37bb();
        if (qm1Var == null) {
            return false;
        }
        int m75939xb282bd08 = qm1Var.m75939xb282bd08(0);
        int i17 = qs5.v.f448005a;
        return m75939xb282bd08 == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q6(r45.qt2 r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof mm2.z
            if (r0 == 0) goto L13
            r0 = r8
            mm2.z r0 = (mm2.z) r0
            int r1 = r0.f411130g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411130g = r1
            goto L18
        L13:
            mm2.z r0 = new mm2.z
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f411128e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f411130g
            jz5.f0 r3 = jz5.f0.f384359a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r7 = r0.f411127d
            mm2.e0 r7 = (mm2.e0) r7
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L89
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r2 = "LiveBoxSlice initData, hasInit:"
            r8.<init>(r2)
            boolean r2 = r6.f410500g
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r2 = "str"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r2)
            java.lang.String r2 = "mainFlowLog "
            java.lang.String r8 = r2.concat(r8)
            java.lang.String r2 = "Finder.LiveBoxSlice"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r8)
            r6.f410510t = r7
            boolean r7 = r6.f410500g
            if (r7 != 0) goto La2
            r6.f410500g = r4
            lm2.n r7 = lm2.n.f400960a
            java.lang.Class<mm2.e1> r7 = mm2.e1.class
            androidx.lifecycle.c1 r7 = r6.m147920xbba4bfc0(r7)
            mm2.e1 r7 = (mm2.e1) r7
            r45.nw1 r7 = r7.f410521r
            r8 = 0
            long r7 = r7.m75942xfb822ef2(r8)
            r0.f411127d = r6
            r0.f411130g = r4
            lm2.k r2 = new lm2.k
            r4 = 0
            java.lang.String r5 = "initData"
            r2.<init>(r5, r7, r4)
            java.lang.Object r7 = p3325xe03a0797.p3326xc267989b.z0.f(r2, r0)
            if (r7 != r1) goto L84
            goto L85
        L84:
            r7 = r3
        L85:
            if (r7 != r1) goto L88
            return r1
        L88:
            r7 = r6
        L89:
            lm2.g r8 = new lm2.g
            r8.<init>()
            r7.f410511u = r8
            lm2.h0 r8 = new lm2.h0
            lm2.g r0 = r7.f410511u
            if (r0 != 0) goto L9b
            lm2.g r0 = new lm2.g
            r0.<init>()
        L9b:
            gk2.e r1 = r7.f410496d
            r8.<init>(r1, r0)
            r7.f410509s = r8
        La2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.e0.Q6(r45.qt2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void R6(java.lang.String tag, r45.ch1 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.String str = "postLikeMsg, seq:" + msg.m75942xfb822ef2(12);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "str");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "localLikeLog ".concat(str));
        lm2.h0 h0Var = this.f410509s;
        if (!(h0Var != null ? h0Var.h(msg) : false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "update failed, don't request cgi");
            return;
        }
        db2.q2 q2Var = new db2.q2(msg, this.f410496d, this.f410510t);
        r45.kv0 kv0Var = (r45.kv0) q2Var.f309659u.m75936x14adae67(1);
        if (kv0Var != null) {
            kv0Var.set(6, 1);
        }
        pq5.g l17 = q2Var.l();
        l17.f(this.f410501h);
        l17.K(new mm2.a0(tag, this, msg));
    }

    public final void S6(java.lang.String boxId, r45.ch1 msg) {
        lm2.c cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(boxId, "boxId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        lm2.h0 h0Var = this.f410509s;
        if (h0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxDataStore", "insertLocal " + msg.m75945x2fec8307(2));
            cVar = lm2.h0.f400925i.b(msg);
            if (cVar != null) {
                cVar.f400904d = true;
                pm0.v.X(new lm2.c0(h0Var, boxId, cVar));
            }
        } else {
            cVar = null;
        }
        db2.q2 q2Var = new db2.q2(msg, this.f410496d, this.f410510t);
        r45.kv0 kv0Var = (r45.kv0) q2Var.f309659u.m75936x14adae67(1);
        if (kv0Var != null) {
            kv0Var.set(6, 1);
        }
        pq5.g l17 = q2Var.l();
        l17.f(this.f410501h);
        l17.K(new mm2.c0(cVar, this));
    }

    public final java.lang.Object T6(java.lang.String str, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        return p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, new mm2.d0(str, this, z17, null), interfaceC29045xdcb5ca57);
    }

    public final void U6(boolean z17) {
        if (z17 != this.f410506p) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveBoxSlice", "reachLastVisibleComment from " + this.f410506p + " to " + z17 + '!');
        }
        this.f410506p = z17;
    }

    public final void V6(int i17) {
        if (i17 != this.f410508r) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveBoxSlice", "unReadAtMeMsgPos from " + this.f410508r + " to " + i17);
        }
        this.f410508r = i17;
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        super.mo528x82b764cd();
        this.f410501h.mo10668x2efc64();
        this.f410503m = new p012xc85e97e9.p093xedfae76a.j0();
        lm2.h0 h0Var = this.f410509s;
        if (h0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxDataStore", "release");
            h0Var.f400929c = new p012xc85e97e9.p093xedfae76a.j0(new java.util.concurrent.ConcurrentHashMap());
            h0Var.f400930d.clear();
            h0Var.f400931e = new p012xc85e97e9.p093xedfae76a.j0(new java.util.concurrent.ConcurrentHashMap());
            km2.m0 m0Var = h0Var.f400933g;
            if (m0Var != null) {
                p3325xe03a0797.p3326xc267989b.r2 r2Var = m0Var.f390679d;
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                }
                m0Var.f390679d = null;
            }
            h0Var.f400933g = null;
            km2.m0 m0Var2 = h0Var.f400934h;
            if (m0Var2 != null) {
                p3325xe03a0797.p3326xc267989b.r2 r2Var2 = m0Var2.f390679d;
                if (r2Var2 != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
                }
                m0Var2.f390679d = null;
            }
            h0Var.f400934h = null;
        }
        this.f410509s = null;
        this.f410511u = null;
        this.f410505o = -1;
        U6(true);
        this.f410500g = false;
        this.f410507q = 0L;
        V6(0);
        this.f410504n = 0L;
    }
}
