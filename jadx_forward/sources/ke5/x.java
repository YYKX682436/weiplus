package ke5;

/* loaded from: classes9.dex */
public class x extends ke5.a {

    /* renamed from: i, reason: collision with root package name */
    public int f388671i;

    /* renamed from: j, reason: collision with root package name */
    public volatile long f388672j;

    /* renamed from: k, reason: collision with root package name */
    public volatile long f388673k;

    /* renamed from: l, reason: collision with root package name */
    public volatile long f388674l;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.s7 f388675m;

    /* renamed from: n, reason: collision with root package name */
    public final he5.l f388676n;

    public x(yb5.d dVar, hd5.v vVar) {
        super(dVar, vVar);
        this.f388671i = 0;
        this.f388672j = 0L;
        this.f388673k = 0L;
        this.f388674l = 0L;
        this.f388676n = new ke5.v(this);
        if (te5.s1.f500280a.a()) {
            this.f388675m = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.s7(dVar);
        }
    }

    @Override // ke5.a, hd5.k
    public void c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 c21897x17252689, hd5.q qVar) {
        boolean z17;
        sb5.t tVar;
        boolean z18;
        int i17;
        int i18;
        int i19;
        super.c(c21897x17252689, qVar);
        hd5.n nVar = qVar.f362163b;
        java.util.List list = qVar.f362166e;
        int size = ((java.util.LinkedList) qVar.f362164c).size();
        int i27 = qVar.f362167f;
        int i28 = qVar.f362168g;
        android.os.Bundle bundle = qVar.f362162a;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) list.get(0);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) list.get(list.size() - 1);
        if (f9Var != null) {
            this.f388672j = f9Var.mo78012x3fdd41df();
        }
        if (f9Var2 != null) {
            this.f388673k = f9Var2.mo78012x3fdd41df();
        }
        boolean a17 = te5.s1.f500280a.a();
        hd5.n nVar2 = hd5.n.ACTION_ENTER;
        hd5.n nVar3 = hd5.n.ACTION_UPDATE;
        if (a17 && (nVar3.equals(nVar) || nVar2.equals(nVar))) {
            sb5.x1 n07 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.n7) ((sb5.g0) this.f388574b.f542241c.a(sb5.g0.class))).n0();
            if (n07 != null) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.m7 m7Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.m7) n07;
                synchronized (m7Var.f281015a) {
                    i19 = m7Var.f281017c;
                }
            } else {
                i19 = 0;
            }
            int m79870x9b948425 = c21897x17252689.m79870x9b948425() - i19;
            boolean z19 = n07 != null && ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.m7) n07).f281018d;
            if (m79870x9b948425 > -1 && m79870x9b948425 < c21897x17252689.m79870x9b948425() && i19 > 0 && !z19) {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.m7) n07).f281018d = true;
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) this.f388574b.f542241c.a(sb5.z.class))).V0(m79870x9b948425);
            }
        }
        int ordinal = nVar.ordinal();
        if (ordinal == 0) {
            c21897x17252689.d(false);
            z17 = false;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f7.b(c21897x17252689.m79872xcc101dd9(), (c21897x17252689.m79870x9b948425() - c21897x17252689.m79874x2d2219a2()) + 1, ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) this.f388574b.f542241c.a(sb5.z0.class))).r0() + c21897x17252689.m79077xde699c26(), false, false);
            int m79870x9b9484252 = c21897x17252689.m79870x9b948425() - c21897x17252689.m79874x2d2219a2();
            if (m79870x9b9484252 > 0) {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) this.f388574b.f542241c.a(sb5.z.class))).I0(m79870x9b9484252);
            }
        } else if (ordinal != 1) {
            if (ordinal == 3) {
                z18 = false;
                this.f388574b.N(false);
            } else if (ordinal != 4) {
                z18 = false;
            } else {
                if (bundle == null) {
                    i18 = -1;
                    i17 = -1;
                } else {
                    i17 = -1;
                    i18 = bundle.getInt("MSG_POSITION", -1);
                }
                if (i18 != i17) {
                    int m79870x9b9484253 = c21897x17252689.m79870x9b948425() - (qVar.f362167f - i18);
                    z18 = false;
                    i28 = java.lang.Math.max(0, m79870x9b9484253);
                    qVar.f362168g = i28;
                } else {
                    z18 = false;
                }
                c21897x17252689.m79872xcc101dd9().m75893x3498a0(new ke5.w(this, bundle, i28, c21897x17252689));
            }
            z17 = z18;
        } else {
            c21897x17252689.c(false);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f7.b(c21897x17252689.m79872xcc101dd9(), c21897x17252689.m79874x2d2219a2() + 1, (c21897x17252689.m79872xcc101dd9().m75888x1c4fb41d() - ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) this.f388574b.f542241c.a(sb5.z0.class))).r0()) - c21897x17252689.m79074xd3ae1da8(), false, false);
            z17 = false;
        }
        if (nVar != nVar2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLoader.ChattingServiceNotifyDataPresenter", "[onViewUpdate] mode:%s lastTopMsgCreateTime:%s lastBottomMsgCreateTime:%s loadedCount:%s allCount:%s selection:%s", nVar, java.lang.Long.valueOf(this.f388672j), java.lang.Long.valueOf(this.f388673k), java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28));
            java.lang.String x17 = this.f388574b.x();
            long m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(x17);
            int F2 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).F2(x17, 0L, m07);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLoader.ChattingServiceNotifyDataPresenter", "[isShowTopAll] talker:%s createTime:%s expiredCount:%s", x17, java.lang.Long.valueOf(m07), java.lang.Integer.valueOf(F2));
            if (i27 - F2 <= size) {
                z17 = true;
            }
            c21897x17252689.m79088x648e109b(z17);
            c21897x17252689.m79085xcc8bf2ed(true);
        }
        if ((nVar == nVar2 || nVar == nVar3) && (tVar = (sb5.t) this.f388574b.f542241c.a(sb5.t.class)) != null) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.u3) tVar).q0(nVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e9  */
    @Override // ke5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public he5.t e(hd5.n r17, android.os.Bundle r18, hd5.q r19) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ke5.x.e(hd5.n, android.os.Bundle, hd5.q):he5.t");
    }

    public final he5.t h(java.lang.String str, int i17, int i18, hd5.n nVar) {
        return te5.s1.f500280a.a() ? new he5.n(str, i17, i18, nVar, this.f388675m) : new he5.m(str, i17, i18, nVar, this.f388676n);
    }
}
