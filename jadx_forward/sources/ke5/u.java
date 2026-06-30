package ke5;

/* loaded from: classes9.dex */
public class u extends ke5.a {

    /* renamed from: i, reason: collision with root package name */
    public volatile long f388661i;

    /* renamed from: j, reason: collision with root package name */
    public volatile long f388662j;

    /* renamed from: k, reason: collision with root package name */
    public volatile long f388663k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f388664l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f388665m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(yb5.d chattingContext, hd5.r loader) {
        super(chattingContext, loader);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingContext, "chattingContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loader, "loader");
        java.lang.String x17 = chattingContext.x();
        this.f388664l = x17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLoader.ChattingSearchDataPresenter", "[ChattingSearchDataPresenter] talker:%s", x17);
    }

    @Override // ke5.a, ke5.f0
    public void a(hd5.n action, boolean z17, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        if (bundle == null && action == hd5.n.ACTION_ENTER) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingLoader.ChattingSearchDataPresenter", "[onLoad] sourceArgs is null!");
        } else {
            super.a(action, z17, bundle);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0107, code lost:
    
        if (r2.booleanValue() != false) goto L35;
     */
    @Override // ke5.a, hd5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 r12, hd5.q r13) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ke5.u.c(com.tencent.mm.ui.chatting.view.MMChattingListView, hd5.q):void");
    }

    @Override // ke5.a
    public he5.t e(hd5.n action, android.os.Bundle bundle, hd5.q qVar) {
        int i17;
        int i18;
        long v37;
        hd5.q qVar2;
        int i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        int ordinal = action.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                long v38 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).v3(this.f388664l, this.f388662j, 48);
                int max = java.lang.Math.max(0, ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).F2(this.f388664l, this.f388662j, v38) - 1);
                this.f388662j = v38;
                i17 = max;
            } else if (ordinal != 2) {
                if (ordinal == 3 || ordinal == 4) {
                    if (bundle == null || qVar == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingLoader.ChattingSearchDataPresenter", "[handleEnter] sourceArgs is null!");
                    } else {
                        long j17 = bundle.getLong("MSG_ID");
                        java.lang.String string = bundle.getString("MSG_TALKER");
                        this.f388665m = bundle.getBoolean("IS_LOAD_ALL", false);
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(string, j17);
                        if (n17.m124847x74d37ac6() != j17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingLoader.ChattingSearchDataPresenter", "get msg info by id %d error", java.lang.Long.valueOf(j17));
                        } else {
                            if (!android.text.TextUtils.equals(string, this.f388664l)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingLoader.ChattingSearchDataPresenter", "talker is not same[%s -> %s]", string, this.f388664l);
                            }
                            long mo78012x3fdd41df = n17.mo78012x3fdd41df();
                            if (mo78012x3fdd41df < this.f388661i || mo78012x3fdd41df > this.f388662j) {
                                this.f388661i = mo78012x3fdd41df;
                                this.f388663k = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().m5(this.f388664l);
                                if (this.f388665m) {
                                    v37 = this.f388663k;
                                } else {
                                    v37 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).v3(this.f388664l, mo78012x3fdd41df, 48);
                                }
                                this.f388662j = v37;
                                if (((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).F2(this.f388664l, this.f388661i, this.f388662j) < 48) {
                                    this.f388661i = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).v9(this.f388664l, this.f388661i, 48);
                                    i19 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).F2(this.f388664l, this.f388661i, mo78012x3fdd41df);
                                    qVar2 = qVar;
                                } else {
                                    qVar2 = qVar;
                                    i19 = 1;
                                }
                            } else {
                                qVar2 = qVar;
                                i19 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).F2(this.f388664l, this.f388661i, mo78012x3fdd41df);
                            }
                            qVar2.f362169h = j17;
                            qVar2.f362168g = (i19 - 1) + this.f388574b.m();
                        }
                    }
                }
                i18 = 0;
                i17 = 0;
            } else {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 q57 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(this.f388664l);
                if (q57 == null) {
                    i17 = 0;
                } else {
                    this.f388663k = q57.mo78012x3fdd41df();
                    int max2 = java.lang.Math.max(0, ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).F2(this.f388664l, this.f388662j, this.f388663k) - 1);
                    if (this.f388665m || max2 <= 480) {
                        this.f388662j = this.f388663k;
                    } else if (q57.A0() == 1 && this.f388663k != q57.mo78012x3fdd41df()) {
                        this.f388663k = q57.mo78012x3fdd41df();
                        this.f388661i = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).v9(this.f388664l, this.f388661i, 48);
                        this.f388662j = this.f388663k;
                    }
                    i17 = max2;
                }
            }
            i18 = 0;
        } else {
            long v96 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).v9(this.f388664l, this.f388661i, 48);
            int max3 = java.lang.Math.max(0, ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).F2(this.f388664l, v96, this.f388661i) - 1);
            this.f388661i = v96;
            i17 = 0;
            i18 = max3;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLoader.ChattingSearchDataPresenter", "mode[%s] query topCreateTime[%d] downCreateTime[%d], lastCreateTime[%d], topInc[%d], bottomInc[%d]", action, java.lang.Long.valueOf(this.f388661i), java.lang.Long.valueOf(this.f388662j), java.lang.Long.valueOf(this.f388663k), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        java.lang.String mTalkerUserName = this.f388575c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mTalkerUserName, "mTalkerUserName");
        return new he5.k(mTalkerUserName, this.f388661i, this.f388662j);
    }

    public boolean h() {
        return this.f388662j >= this.f388663k;
    }

    public boolean i() {
        long w37 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().w3(this.f388664l);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLoader.ChattingSearchDataPresenter", "[isShowTopAll] firstMsgCreateTime:%s lastTopMsgCreateTime:%s", java.lang.Long.valueOf(w37), java.lang.Long.valueOf(this.f388661i));
        return this.f388661i <= w37;
    }
}
