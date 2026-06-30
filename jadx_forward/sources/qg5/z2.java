package qg5;

@j95.b
/* loaded from: classes5.dex */
public final class z2 extends jm0.o implements ct.j3 {

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f444804m = jz5.h.b(qg5.x2.f444786d);

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f444805n = jz5.h.b(qg5.r2.f444687d);

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f444806o = jz5.h.b(qg5.y2.f444800d);

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f444807p = jz5.h.b(qg5.q2.f444673d);

    /* renamed from: q, reason: collision with root package name */
    public boolean f444808q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f444809r;

    /* renamed from: s, reason: collision with root package name */
    public xj.m f444810s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.zp f444811t;

    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        set.add(sy.g.class);
        set.add(qg5.u3.class);
        set.add(qg5.q4.class);
        set.add(qg5.n5.class);
    }

    public final xj.i Zi() {
        return (xj.i) ((jz5.n) this.f444807p).mo141623x754a37bb();
    }

    public final ct.q2 aj() {
        return (ct.q2) ((jz5.n) this.f444805n).mo141623x754a37bb();
    }

    public boolean bj() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableC2CFileAISummary", 0) == 1;
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c c10750x9556b48c = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0(), qg5.p2.class);
        if (c10750x9556b48c != null) {
            return c10750x9556b48c.f149933d;
        }
        return false;
    }

    public void cj() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.zp zpVar = this.f444811t;
        xj.m mVar = null;
        if (zpVar != null && !zpVar.f281936d) {
            xj.m mVar2 = zpVar.f281934b;
            if (mVar2 == null) {
                mVar2 = zpVar.f281933a;
            }
            if (mVar2 != null) {
                zpVar.f281936d = true;
                if (zpVar.f281934b == null) {
                    zpVar.f281934b = mVar2;
                    ((wj.j0) ((xj.i) ((jz5.n) zpVar.f281937e).mo141623x754a37bb())).mj(mVar2.f536286a, wj.w0.f528074d, null);
                }
                ((wj.j0) ((xj.i) ((jz5.n) zpVar.f281937e).mo141623x754a37bb())).mj(mVar2.f536286a, wj.w0.f528075e, null);
            }
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.zp zpVar2 = this.f444811t;
        if (zpVar2 != null && (mVar = zpVar2.f281934b) == null) {
            mVar = zpVar2.f281933a;
        }
        this.f444810s = mVar;
    }

    public void fj(android.content.Context uiCtx, java.util.List msgList, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, yz5.a onLaunchSuccess) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiCtx, "uiCtx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onLaunchSuccess, "onLaunchSuccess");
        xj.m mVar = this.f444810s;
        this.f444810s = null;
        if (mVar == null) {
            ((wj.j0) Zi()).Vi(wj.t0.f528040J, 2000L, new qg5.u2(this, uiCtx, msgList, z3Var, z17, onLaunchSuccess));
        } else {
            if (!jm0.g.class.isAssignableFrom(qg5.q4.class)) {
                throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
            }
            p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(getViewModel(), new jm0.e(this)).a(qg5.q4.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            ((qg5.q4) ((jm0.g) a17)).W6(uiCtx, msgList, z3Var, z17, mVar, onLaunchSuccess);
        }
    }

    public void hj(android.content.Context uiCtx, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiCtx, "uiCtx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.String str = this.f444809r;
        if (!jm0.g.class.isAssignableFrom(qg5.n5.class)) {
            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(getViewModel(), new jm0.e(this)).a(qg5.n5.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        qg5.n5 n5Var = (qg5.n5) ((jm0.g) a17);
        n5Var.W6(uiCtx, new qg5.d5(n5Var, uiCtx, z3Var, msg, str));
    }

    public void ij(android.content.Context uiCtx, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiCtx, "uiCtx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.String str = this.f444809r;
        if (!jm0.g.class.isAssignableFrom(qg5.n5.class)) {
            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(getViewModel(), new jm0.e(this)).a(qg5.n5.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        qg5.n5 n5Var = (qg5.n5) ((jm0.g) a17);
        n5Var.W6(uiCtx, new qg5.e5(n5Var, uiCtx, z3Var, msg, str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f1, code lost:
    
        if (r9 >= 0) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mj(android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qg5.z2.mj(android.content.Context, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b3, code lost:
    
        if (r4 != r3.longValue()) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d1, code lost:
    
        if ((r9 != null && (r26.n0.N(r9) ^ true)) != false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean nj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qg5.z2.nj(com.tencent.mm.storage.f9, boolean):boolean");
    }

    public boolean oj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 message, boolean z17) {
        java.lang.String m75945x2fec8307;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        if (!(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20077x5570a691()) == 1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoChatRecordsFeatureService", "RepairerConfigYuanBaoSummaryEntrance is negative");
            return false;
        }
        if (!bj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoChatRecordsFeatureService", "isMainlandHkMoUser is negative");
            return false;
        }
        l15.c cVar = new l15.c();
        cVar.m126743xf78a7eb8(true);
        java.lang.String U1 = message.U1();
        if (U1 == null) {
            U1 = "";
        }
        cVar.m126728xdc93280d(U1);
        v05.b k17 = cVar.k();
        if (k17 == null || (m75945x2fec8307 = k17.m75945x2fec8307(k17.f449898d + 9)) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoChatRecordsFeatureService", "targetUrl is null");
            return false;
        }
        if (!((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(m75945x2fec8307)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoChatRecordsFeatureService", "isMpArticle is negative");
            return false;
        }
        if (((wj.j0) Zi()).Ui(wj.t0.L) != null) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoChatRecordsFeatureService", "adInfo is null");
        return false;
    }
}
