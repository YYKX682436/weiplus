package ot;

@j95.b
/* loaded from: classes9.dex */
public final class g extends jm0.o implements pt.g0, pt.m0 {

    /* renamed from: m, reason: collision with root package name */
    public static final jz5.g f429841m;

    static {
        new ot.c(null);
        f429841m = jz5.h.b(ot.b.f429829d);
    }

    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        set.add(zu.d.class);
        set.add(tt.f.class);
        set.add(pu.k.class);
        set.add(pu.f0.class);
        set.add(ut.b.class);
        set.add(ut.d.class);
        set.add(ut.f.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Zi(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r11, r05.k r12, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof ot.d
            if (r0 == 0) goto L13
            r0 = r13
            ot.d r0 = (ot.d) r0
            int r1 = r0.f429834f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f429834f = r1
            goto L18
        L13:
            ot.d r0 = new ot.d
            r0.<init>(r10, r13)
        L18:
            r7 = r0
            java.lang.Object r13 = r7.f429832d
            pz5.a r0 = pz5.a.f440719d
            int r1 = r7.f429834f
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto L65
        L28:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L30:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            r13 = 2
            java.lang.Class[] r13 = new java.lang.Class[r13]
            r1 = 0
            java.lang.Class<du.c> r3 = du.c.class
            r13[r1] = r3
            java.lang.Class<du.a> r1 = du.a.class
            r13[r2] = r1
            java.util.List r13 = kz5.c0.i(r13)
            g75.z r3 = new g75.z
            r3.<init>()
            java.lang.String r1 = "MsgInfo"
            r3.l(r1, r11)
            java.lang.String r11 = "AppMsgObj"
            r3.l(r11, r12)
            g75.k r1 = g75.r.f350924p
            java.lang.String r4 = "SendAppMsg"
            r5 = 0
            r8 = 8
            r9 = 0
            r7.f429834f = r2
            r2 = r13
            java.lang.Object r13 = g75.k.b(r1, r2, r3, r4, r5, r7, r8, r9)
            if (r13 != r0) goto L65
            return r0
        L65:
            g75.x r13 = (g75.x) r13
            g75.z r11 = r13.f350938b
            java.lang.String r12 = "AppMsgResponse"
            java.lang.Object r11 = r11.d(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ot.g.Zi(com.tencent.mm.storage.f9, r05.k, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public int aj() {
        ut.d.f512135f.a();
        return com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.raw.f81320x51ea1ca1 : com.p314xaae8f345.mm.R.raw.f81321xebcdad4b;
    }

    public int bj() {
        ut.d.f512135f.a();
        return com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.raw.f81273xa841889 : com.p314xaae8f345.mm.R.raw.f81274x46732e63;
    }

    public int cj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        ut.b.f512125f.a();
        com.p314xaae8f345.mm.p2621x8fb0427b.i9 b17 = tg3.p1.f500739a.b(msgInfo.Q0(), msgInfo.m124847x74d37ac6());
        if (b17 != null) {
            return b17.f276567o;
        }
        return 0;
    }

    public int fj(boolean z17, java.lang.String str, boolean z18, boolean z19) {
        ut.d.f512135f.a();
        return yu.i.f547296a.b(z17, str, z18, z19);
    }

    public long hj(long j17) {
        java.lang.Object m143895xf1229813;
        int e17 = c01.id.e();
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            long j18 = e17;
            long j19 = j17 - j18;
            int c17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2529x2ff57c.C20156xb256a6eb());
            long j27 = c17 > 0 ? c17 * 3600 : 86400L;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Long.valueOf(j19 < j27 ? j18 + j27 : j17));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMsg.AppMsgFeatureService", "getFileMsgExpiredTime error: " + m143898xd4a2fc34.getMessage());
            long j28 = (long) e17;
            long j29 = 86400 + j28;
            if (j28 >= j17) {
                j17 = j29;
            }
            m143895xf1229813 = java.lang.Long.valueOf(j17);
        }
        return ((java.lang.Number) m143895xf1229813).longValue();
    }

    public int ij(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        int i17 = msgInfo.Z;
        if (i17 != 0) {
            return i17;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.i9 b17 = tg3.p1.f500739a.b(msgInfo.Q0(), msgInfo.m124847x74d37ac6());
        return b17 != null ? b17.f276559d : msgInfo.Z;
    }

    public int mj() {
        ut.d.f512135f.a();
        return com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.raw.f80850x9580dfa1 : com.p314xaae8f345.mm.R.raw.f80851x1b0f4a4b;
    }

    public int nj(java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        ut.d.f512135f.a();
        return yu.i.f547296a.b(false, str, false, f9Var != null && ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).cj(f9Var) == 6);
    }

    public int oj() {
        ut.d.f512135f.a();
        return com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.raw.f81294x8c7647f8 : com.p314xaae8f345.mm.R.raw.f81295x2c6ecd4;
    }

    public void pj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17) {
        if ((f9Var != null ? bm5.w.a(f9Var) : null) == bm5.v.f104280m) {
            ((zs3.z) ((mc0.k) i95.n0.c(mc0.k.class))).cj(f9Var, z17);
        }
        if ((f9Var != null ? bm5.w.a(f9Var) : null) == bm5.v.f104278h) {
            ((d40.q) ((e40.w) i95.n0.c(e40.w.class))).ij(f9Var, z17);
        }
        if (f9Var != null) {
            if (!pt0.f0.f439742b1.c(bm5.w.a(f9Var))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsg.AppMsgFeatureService", "c2c path is close");
                return;
            }
            java.lang.String mj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).mj(f9Var, f9Var.z0(), false);
            if (com.p314xaae8f345.mm.vfs.w6.j(mj6)) {
                bm5.f0 f0Var = bm5.f0.f104097i;
                java.lang.String a17 = bm5.d0.a(f9Var, f0Var, false, true, 2, null);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, mj6)) {
                    return;
                }
                boolean x17 = com.p314xaae8f345.mm.vfs.w6.x(mj6, a17, true);
                com.p314xaae8f345.mm.vfs.w6.h(mj6);
                zz.b bj6 = ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(a17, f9Var.mo78013xfb85f7b0(), null, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsg.AppMsgFeatureService", "appMsgCheckDup:%s ret:%s hitCache:%s copyResult:%s replaceResult:%s", a17, java.lang.Integer.valueOf(bj6.f559224a), java.lang.Boolean.valueOf(bj6.f559225b), java.lang.Boolean.valueOf(bj6.f559227d), java.lang.Long.valueOf(bj6.f559228e));
                bm5.c0.f104083a.c(bm5.z.f(bm5.y.f104289i.a(f9Var, f0Var)), true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsg.AppMsgFeatureService", "move old appmsg thumb to c2c file success: " + x17 + ", src[" + mj6 + "] -> dst[" + a17 + "], talker: " + f9Var.Q0() + ", localId: " + f9Var.m124847x74d37ac6() + ", svrId: " + f9Var.I0());
            }
        }
    }

    public boolean qj(int i17, java.lang.String toUser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        if (kz5.z.D0(new java.lang.Integer[]{33, 36, 44, 48}).contains(java.lang.Integer.valueOf(i17))) {
            return j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20528xa9a1d2b2()) == 1 || com.p314xaae8f345.mm.p2621x8fb0427b.z3.J3(toUser);
        }
        return false;
    }

    public boolean rj(int i17, java.lang.String toUser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        return i17 == 53 && (com.p314xaae8f345.mm.p2621x8fb0427b.z3.J3(toUser) || j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20537xfe97564a()) == 1);
    }

    public boolean sj(int i17, java.lang.String toUser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        if (kz5.z.D0(new java.lang.Integer[]{5, 101}).contains(java.lang.Integer.valueOf(i17))) {
            return com.p314xaae8f345.mm.p2621x8fb0427b.z3.J3(toUser) || j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20539xe3f53123()) == 1;
        }
        return false;
    }

    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j tj(qi3.b0 task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        if (!(task instanceof ru.j)) {
            throw new java.lang.UnsupportedOperationException("sendAsync only support BaseSendAppMsgTask Type");
        }
        if (task instanceof ut.q0) {
            pu.f0 a17 = pu.f0.f439833m.a();
            ut.q0 q0Var = (ut.q0) task;
            p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 0, null, 7, null);
            q0Var.f445211g = b17;
            v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b) ((jz5.n) a17.f439838i).mo141623x754a37bb(), null, new pu.b0(q0Var, a17, null), 1, null);
            return b17;
        }
        pu.k a18 = pu.k.f439853i.a();
        ru.j jVar = (ru.j) task;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b18 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 0, null, 7, null);
        jVar.f445211g = b18;
        v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b) ((jz5.n) a18.f439857h).mo141623x754a37bb(), null, new pu.i(jVar, a18, null), 1, null);
        return b18;
    }

    public void uj(qi3.b0 task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        if (!(task instanceof qi3.c)) {
            throw new java.lang.UnsupportedOperationException("sendSync only support BaseSendMsgTask Type");
        }
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j tj6 = tj(task);
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a != null) {
            v65.i.b(c20976x6ba6452a, null, new ot.f(tj6, null), 1, null);
        }
    }

    public void vj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        if (!pt0.f0.f439742b1.g()) {
            msgInfo.Z = i17;
            msgInfo.f317711r = true;
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.i9 a17 = tg3.p1.f500739a.a(msgInfo);
        a17.f276559d = i17;
        tg3.q1.a(a17, msgInfo);
        msgInfo.Z = 0;
        msgInfo.f317711r = true;
    }
}
