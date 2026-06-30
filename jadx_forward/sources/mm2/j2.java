package mm2;

/* loaded from: classes3.dex */
public final class j2 extends mm2.e {
    public static final mm2.v1 F = new mm2.v1(null);
    public static final jz5.g G = jz5.h.b(mm2.u1.f410987d);
    public static final java.util.List H = kz5.c0.i(1, 20002, 20032, 20034, 1000066, 20035, 20013, 20124);
    public static final com.p314xaae8f345.mm.p2621x8fb0427b.u3 I = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_DANMAKU_COMMENT_MODE_NEW_V2_INT_SYNC;

    /* renamed from: J, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2621x8fb0427b.u3 f410693J = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_DANMAKU_SWITCH_GUIDE_BOOLEAN_SYNC;
    public static final java.util.List K = kz5.c0.i(20035, 20013, 20050);
    public static final jz5.g L = jz5.h.b(mm2.t1.f410959d);
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 A;
    public jz5.l B;
    public int C;
    public boolean D;
    public java.lang.Integer E;

    /* renamed from: f, reason: collision with root package name */
    public int f410694f;

    /* renamed from: g, reason: collision with root package name */
    public float f410695g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f410696h;

    /* renamed from: i, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f410697i;

    /* renamed from: m, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f410698m;

    /* renamed from: n, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f410699n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f410700o;

    /* renamed from: p, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f410701p;

    /* renamed from: q, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f410702q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.List f410703r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f410704s;

    /* renamed from: t, reason: collision with root package name */
    public r45.o84 f410705t;

    /* renamed from: u, reason: collision with root package name */
    public mm2.y1 f410706u;

    /* renamed from: v, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f410707v;

    /* renamed from: w, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f410708w;

    /* renamed from: x, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f410709x;

    /* renamed from: y, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f410710y;

    /* renamed from: z, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f410711z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f410694f = 2;
        this.f410695g = 0.8f;
        this.f410696h = jz5.h.b(mm2.f2.f410555d);
        u26.u uVar = u26.u.DROP_OLDEST;
        this.f410697i = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.a(0, 1, uVar);
        java.lang.Object m17 = gm0.j1.u().c().m(I, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
        this.f410698m = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(java.lang.Boolean.valueOf(((java.lang.Integer) m17).intValue() == 1));
        this.f410699n = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(java.lang.Boolean.FALSE);
        this.f410700o = jz5.h.b(mm2.i2.f410670d);
        this.f410701p = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.a(0, 1, uVar);
        this.f410702q = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(java.lang.Boolean.TRUE);
        this.f410707v = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.a(0, 1, uVar);
        this.f410708w = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.a(0, 1, uVar);
        this.f410709x = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.a(0, 1, uVar);
        this.f410710y = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.a(0, 1, uVar);
        this.f410711z = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.a(0, 1, uVar);
        this.A = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.a(0, 1, uVar);
        this.C = 3;
    }

    public static void T6(mm2.j2 j2Var, int i17, int i18, java.lang.Object obj) {
        java.util.LinkedList linkedList;
        if ((i18 & 1) != 0) {
            i17 = 8;
        }
        mm2.y1 y1Var = j2Var.f410706u;
        if ((y1Var != null ? y1Var.f411085a : null) == mm2.e2.f410531e && j2Var.Q6().isEmpty()) {
            try {
                int size = ((mm2.x4) j2Var.m147920xbba4bfc0(mm2.x4.class)).f411061f.size();
                java.util.List list = ((mm2.x4) j2Var.m147920xbba4bfc0(mm2.x4.class)).f411061f;
                synchronized (list) {
                    int size2 = list.size() - 1;
                    linkedList = null;
                    if (size2 >= 0) {
                        while (true) {
                            int i19 = size2 - 1;
                            dk2.zf zfVar = (dk2.zf) list.get(size2);
                            mm2.v1 v1Var = F;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(zfVar);
                            if (v1Var.d(zfVar)) {
                                if (linkedList == null) {
                                    linkedList = new java.util.LinkedList();
                                }
                                linkedList.add(zfVar);
                                if (linkedList.size() >= i17) {
                                    break;
                                }
                            }
                            if (i19 < 0) {
                                break;
                            } else {
                                size2 = i19;
                            }
                        }
                    }
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append("LiveDanmaku_step1_3，insertInitCommentList commentSize:");
                sb6.append(size);
                sb6.append(",initSize:");
                sb6.append(i17);
                sb6.append(",final init size:");
                sb6.append(linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveDanmakuSlice", sb6.toString());
                if (linkedList != null && j2Var.Q6().isEmpty() && (!linkedList.isEmpty())) {
                    j2Var.Q6().addAll(linkedList);
                    ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) j2Var.f410697i).e(java.lang.Boolean.TRUE);
                }
            } catch (java.lang.Exception e17) {
                hc2.c.a(e17, "insertInitCommentList");
            }
        }
    }

    public final void N6(dk2.zf msg) {
        jz5.f0 f0Var;
        mm2.e2 e2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        mm2.y1 y1Var = this.f410706u;
        if (y1Var == null || (e2Var = y1Var.f411085a) == null) {
            f0Var = null;
        } else {
            int ordinal = e2Var.ordinal();
            mm2.v1 v1Var = F;
            if (ordinal != 0) {
                if (ordinal == 1) {
                    boolean d17 = v1Var.d(msg);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveDanmakuSlice", "LiveDanmaku_step1:self msg,valid:" + d17 + ",type:" + msg.mo124533xfb85f7b0() + ',' + msg.k() + ':' + msg.j());
                    if (d17) {
                        Q6().add(new mm2.a2(msg, true));
                        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) this.f410697i).e(java.lang.Boolean.TRUE);
                    }
                }
            } else if (R6() && this.f410704s) {
                msg.p();
                if (v1Var.b(msg) != null) {
                    ((java.util.List) ((jz5.n) this.f410700o).mo141623x754a37bb()).add(new mm2.a2(msg, true));
                    ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) this.f410701p).e(java.lang.Boolean.TRUE);
                    c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
                    int a17 = v1Var.a(msg.p());
                    ((b92.d1) zbVar).getClass();
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).Ij(2, a17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveDanmakuSlice", "LiveDanmaku_step1:self msg,type:" + msg.mo124533xfb85f7b0() + ',' + msg.k() + ':' + msg.j());
                }
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MMFinder.LiveDanmakuSlice", "addPostMsg but commentConfig is null!");
        }
    }

    public final boolean O6(boolean z17) {
        if (z17) {
            return (((java.lang.Boolean) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f410699n).mo144003x754a37bb()).booleanValue() && ((java.lang.Boolean) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f410698m).mo144003x754a37bb()).booleanValue()) && !((mm2.c1) m147920xbba4bfc0(mm2.c1.class)).N7();
        }
        return false;
    }

    public final mm2.y1 P6() {
        if (this.f410706u == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveDanmakuSlice", "getCommentConfigInfo is null!");
        }
        return this.f410706u;
    }

    public final java.util.List Q6() {
        return (java.util.List) ((jz5.n) this.f410696h).mo141623x754a37bb();
    }

    public final boolean R6() {
        return !pm0.v.z(((mm2.c1) m147920xbba4bfc0(mm2.c1.class)).Q1, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
    }

    public final int S6() {
        r45.o84 o84Var;
        if (!this.f410704s || (o84Var = this.f410705t) == null) {
            return -1;
        }
        if (o84Var != null) {
            return o84Var.m75939xb282bd08(0);
        }
        return 0;
    }

    public final void U6(java.lang.String source, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        qs5.h[] hVarArr = qs5.h.f447966d;
        boolean z17 = !pm0.v.A(j17, 1);
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = this.f410699n;
        if (z17 != ((java.lang.Boolean) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb()).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveDanmakuSlice", source + " onMsgExtFlagUpdate change " + ((java.lang.Boolean) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb()).booleanValue() + " to " + z17);
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).k(java.lang.Boolean.valueOf(z17));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V6(p3325xe03a0797.p3326xc267989b.p3328x30012e.k r6, boolean r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof mm2.h2
            if (r0 == 0) goto L13
            r0 = r8
            mm2.h2 r0 = (mm2.h2) r0
            int r1 = r0.f410641f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f410641f = r1
            goto L18
        L13:
            mm2.h2 r0 = new mm2.h2
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f410639d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f410641f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 == r3) goto L2e
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L5a
        L32:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L4c
        L36:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            kotlinx.coroutines.flow.j2 r8 = r5.f410699n
            if (r7 == 0) goto L4f
            kotlinx.coroutines.flow.j r7 = p3325xe03a0797.p3326xc267989b.p3328x30012e.l.j(r8, r4)
            r0.f410641f = r4
            kotlinx.coroutines.flow.p0 r7 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.p0) r7
            java.lang.Object r6 = r7.a(r6, r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            jz5.f0 r6 = jz5.f0.f384359a
            return r6
        L4f:
            r0.f410641f = r3
            kotlinx.coroutines.flow.h3 r8 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) r8
            java.lang.Object r6 = r8.a(r6, r0)
            if (r6 != r1) goto L5a
            return r1
        L5a:
            jz5.d r6 = new jz5.d
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.j2.V6(kotlinx.coroutines.flow.k, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void W6(float f17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveDanmakuSlice", "modify danmakuAlphaValue from:" + this.f410695g + " to " + f17);
        this.f410695g = f17;
    }

    public final void X6(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveDanmakuSlice", "set haveEnableCommentDanmaku from :" + this.D + " to " + z17);
        this.D = z17;
    }

    public final void Y6(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveDanmakuSlice", "set curRows from " + this.C + " to " + i17);
        this.C = i17;
    }

    public final void Z6(r45.o84 o84Var) {
        this.f410705t = o84Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("selectedFloatMsg: msg_type=");
        sb6.append(o84Var != null ? java.lang.Integer.valueOf(o84Var.m75939xb282bd08(0)) : null);
        sb6.append(", remain_count=");
        sb6.append(o84Var != null ? java.lang.Integer.valueOf(o84Var.m75939xb282bd08(2)) : null);
        sb6.append(", used_count=");
        sb6.append(o84Var != null ? java.lang.Integer.valueOf(o84Var.m75939xb282bd08(1)) : null);
        sb6.append(", priority=");
        sb6.append(o84Var != null ? java.lang.Integer.valueOf(o84Var.m75939xb282bd08(3)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveDanmakuSlice", sb6.toString());
    }

    public final void a7(jz5.l lVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveDanmakuSlice", "updateLikeMsgCallback " + lVar);
        this.B = lVar;
    }

    public final void b7(java.lang.String source, java.lang.Object updateMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(updateMsg, "updateMsg");
        if (updateMsg instanceof dk2.zf) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(source);
            sb6.append(" syncCommentLikeMsg ");
            dk2.zf zfVar = (dk2.zf) updateMsg;
            sb6.append(zfVar.k());
            sb6.append(':');
            sb6.append(zfVar.j());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveDanmakuSlice", sb6.toString());
        } else if (updateMsg instanceof lm2.i0) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(source);
            sb7.append(" syncBoxLikeMsg ");
            lm2.i0 i0Var = (lm2.i0) updateMsg;
            sb7.append(((lm2.c) i0Var).b());
            sb7.append(':');
            sb7.append(i0Var.j());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveDanmakuSlice", sb7.toString());
        }
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) this.A).e(updateMsg);
    }

    public final void c7(dk2.zf updateMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(updateMsg, "updateMsg");
        java.lang.String f17 = updateMsg.f();
        jz5.l lVar = this.B;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f17, lVar != null ? (java.lang.String) lVar.f384366d : null)) {
            jz5.l lVar2 = this.B;
            boolean z17 = false;
            if (lVar2 != null && ((java.lang.Number) lVar2.f384367e).intValue() == 1) {
                a7(null);
                b7("commentMsg", updateMsg);
                return;
            }
            jz5.l lVar3 = this.B;
            if (lVar3 != null && ((java.lang.Number) lVar3.f384367e).intValue() == 2) {
                z17 = true;
            }
            if (z17) {
                a7(null);
                dk2.cg cgVar = updateMsg instanceof dk2.cg ? (dk2.cg) updateMsg : null;
                if (cgVar != null) {
                    cgVar.c(true);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveDanmakuSlice", "syncLikeMsg for danmaku, " + updateMsg.k() + ':' + updateMsg.j());
            }
        }
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        this.f410706u = null;
        this.f410703r = null;
        this.f410704s = false;
        a7(null);
        X6(false);
    }
}
