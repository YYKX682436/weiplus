package ke5;

/* loaded from: classes9.dex */
public class d0 extends ke5.a {

    /* renamed from: i, reason: collision with root package name */
    public int f388605i;

    /* renamed from: j, reason: collision with root package name */
    public volatile long f388606j;

    /* renamed from: k, reason: collision with root package name */
    public volatile long f388607k;

    /* renamed from: l, reason: collision with root package name */
    public volatile long f388608l;

    /* renamed from: m, reason: collision with root package name */
    public final he5.q f388609m;

    public d0(yb5.d dVar, hd5.v vVar) {
        super(dVar, vVar);
        this.f388605i = 0;
        this.f388606j = 0L;
        this.f388607k = 0L;
        this.f388608l = 0L;
        this.f388609m = new ke5.b0(this);
    }

    @Override // ke5.a, hd5.k
    public void c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 c21897x17252689, hd5.q qVar) {
        sb5.t tVar;
        super.c(c21897x17252689, qVar);
        hd5.n nVar = qVar.f362163b;
        java.util.List list = qVar.f362166e;
        int size = ((java.util.LinkedList) qVar.f362164c).size();
        int i17 = qVar.f362167f;
        int i18 = qVar.f362168g;
        android.os.Bundle bundle = qVar.f362162a;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) list.get(0);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) list.get(list.size() - 1);
        if (f9Var != null) {
            this.f388606j = f9Var.mo78012x3fdd41df();
        }
        if (f9Var2 != null) {
            this.f388607k = f9Var2.mo78012x3fdd41df();
        }
        int ordinal = nVar.ordinal();
        if (ordinal == 0) {
            c21897x17252689.d(false);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f7.b(c21897x17252689.m79872xcc101dd9(), (c21897x17252689.m79870x9b948425() - c21897x17252689.m79874x2d2219a2()) + 1, ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) this.f388574b.f542241c.a(sb5.z0.class))).r0() + c21897x17252689.m79077xde699c26(), false, false);
            int m79870x9b948425 = c21897x17252689.m79870x9b948425() - c21897x17252689.m79874x2d2219a2();
            if (m79870x9b948425 > 0) {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) this.f388574b.f542241c.a(sb5.z.class))).I0(m79870x9b948425);
            }
        } else if (ordinal == 1) {
            c21897x17252689.c(false);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f7.b(c21897x17252689.m79872xcc101dd9(), c21897x17252689.m79874x2d2219a2() + 1, (c21897x17252689.m79872xcc101dd9().m75888x1c4fb41d() - ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) this.f388574b.f542241c.a(sb5.z0.class))).r0()) - c21897x17252689.m79074xd3ae1da8(), false, false);
        } else if (ordinal == 3) {
            this.f388574b.N(false);
        } else if (ordinal == 4) {
            int i19 = bundle == null ? -1 : bundle.getInt("MSG_POSITION", -1);
            if (i19 != -1) {
                int max = java.lang.Math.max(0, c21897x17252689.m79870x9b948425() - (qVar.f362167f - i19));
                qVar.f362168g = max;
                i18 = max;
            }
            c21897x17252689.m79872xcc101dd9().m75893x3498a0(new ke5.c0(this, bundle, i18, c21897x17252689));
        }
        hd5.n nVar2 = hd5.n.ACTION_ENTER;
        if (nVar != nVar2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLoader.ChattingServiceNotifyDataPresenter", "[onViewUpdate] mode:%s lastTopMsgCreateTime:%s lastBottomMsgCreateTime:%s loadedCount:%s allCount:%s selection:%s", nVar, java.lang.Long.valueOf(this.f388606j), java.lang.Long.valueOf(this.f388607k), java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            java.lang.String x17 = this.f388574b.x();
            long m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(x17);
            int F2 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).F2(x17, 0L, m07);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLoader.ChattingServiceNotifyDataPresenter", "[isShowTopAll] talker:%s createTime:%s expiredCount:%s", x17, java.lang.Long.valueOf(m07), java.lang.Integer.valueOf(F2));
            c21897x17252689.m79088x648e109b(i17 - F2 <= size);
            c21897x17252689.m79085xcc8bf2ed(true);
        }
        if ((nVar == nVar2 || nVar == hd5.n.ACTION_UPDATE) && (tVar = (sb5.t) this.f388574b.f542241c.a(sb5.t.class)) != null) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.u3) tVar).q0(nVar);
        }
    }

    @Override // ke5.a
    public he5.t e(hd5.n nVar, android.os.Bundle bundle, hd5.q qVar) {
        he5.t rVar;
        he5.t tVar;
        hd5.q qVar2;
        int i17;
        int j76 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).j7(this.f388575c);
        int ordinal = nVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                int i18 = j76 - this.f388605i;
                tVar = new he5.r(this.f388575c, (i18 > 0 ? i18 : 0) + this.f388576d, j76, nVar, this.f388609m);
            } else if (ordinal != 3) {
                tVar = null;
                if (ordinal == 4) {
                    if (bundle == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingLoader.ChattingServiceNotifyDataPresenter", "null == sourceArgs!");
                        return null;
                    }
                    if (bundle.getInt("SCENE", 0) == 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLoader.ChattingServiceNotifyDataPresenter", "[handlePositionForSearch]");
                        java.lang.String str = this.f388575c;
                        long j17 = bundle.getLong("MSG_ID");
                        java.lang.String string = bundle.getString("MSG_TALKER");
                        if (android.text.TextUtils.isEmpty(string)) {
                            string = str;
                        }
                        boolean z17 = bundle.getBoolean("IS_LOAD_ALL", false);
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(string, j17);
                        if (Li.m124847x74d37ac6() != j17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingLoader.ChattingServiceNotifyDataPresenter", "get msg info by id %d error", java.lang.Long.valueOf(j17));
                            rVar = new he5.k(str, this.f388606j, this.f388607k);
                        } else {
                            if (!android.text.TextUtils.equals(string, str)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingLoader.ChattingServiceNotifyDataPresenter", "talker is not same[%s -> %s]", string, str);
                            }
                            long mo78012x3fdd41df = Li.mo78012x3fdd41df();
                            if (mo78012x3fdd41df < this.f388606j || mo78012x3fdd41df > this.f388607k) {
                                this.f388606j = mo78012x3fdd41df;
                                this.f388608l = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().m5(str);
                                if (z17) {
                                    this.f388607k = this.f388608l;
                                } else {
                                    this.f388607k = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).v3(str, mo78012x3fdd41df, 48);
                                }
                                if (((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).F2(str, this.f388606j, this.f388607k) < 48) {
                                    this.f388606j = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).v9(str, this.f388606j, 48);
                                    r6 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).F2(str, this.f388606j, mo78012x3fdd41df);
                                }
                                qVar2 = qVar;
                                i17 = r6;
                            } else {
                                i17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).F2(str, this.f388606j, mo78012x3fdd41df);
                                qVar2 = qVar;
                            }
                            qVar2.f362168g = i17;
                            rVar = new he5.k(str, this.f388606j, this.f388607k);
                        }
                    } else if (bundle.getInt("SCENE", 0) == 2) {
                        he5.q qVar3 = this.f388609m;
                        hd5.n nVar2 = hd5.n.ACTION_POSITION;
                        int i19 = bundle.getInt("MSG_POSITION");
                        int i27 = j76 - i19;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLoader.ChattingServiceNotifyDataPresenter", "[handlePositionForTongue] totalCount:%s position:%s count:%s", java.lang.Integer.valueOf(j76), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
                        rVar = new he5.r(this.f388575c, i27, j76, nVar2, qVar3);
                    }
                }
            } else {
                rVar = new he5.r(this.f388575c, 16, j76, nVar, this.f388609m);
            }
            this.f388605i = j76;
            return tVar;
        }
        rVar = new he5.r(this.f388575c, this.f388576d + 48, j76, nVar, this.f388609m);
        tVar = rVar;
        this.f388605i = j76;
        return tVar;
    }
}
