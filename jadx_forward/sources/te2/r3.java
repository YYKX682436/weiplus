package te2;

/* loaded from: classes10.dex */
public final class r3 implements te2.n3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f499904d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f499905e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f499906f;

    /* renamed from: g, reason: collision with root package name */
    public te2.o3 f499907g;

    /* renamed from: h, reason: collision with root package name */
    public r45.p73 f499908h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f499909i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f499910m;

    public r3(android.view.View viewRoot, android.content.Context context, gk2.e liveData, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l plugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewRoot, "viewRoot");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        this.f499904d = viewRoot;
        this.f499905e = context;
        this.f499906f = plugin;
    }

    public final boolean c() {
        r45.q73 q73Var;
        r45.t73 t73Var;
        r45.p73 p73Var = this.f499908h;
        if (p73Var != null && (q73Var = (r45.q73) p73Var.m75936x14adae67(3)) != null) {
            int m75939xb282bd08 = q73Var.m75939xb282bd08(0);
            int i17 = qs5.j.f447968a;
            if (!(m75939xb282bd08 == 1)) {
                q73Var = null;
            }
            if (q73Var != null && (t73Var = (r45.t73) q73Var.m75936x14adae67(1)) != null) {
                java.lang.String m75945x2fec8307 = t73Var.m75945x2fec8307(0);
                if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                    java.lang.String m75945x2fec83072 = t73Var.m75945x2fec8307(0);
                    if (m75945x2fec83072 == null) {
                        m75945x2fec83072 = "";
                    }
                    java.lang.String m75945x2fec83073 = t73Var.m75945x2fec8307(1);
                    if (m75945x2fec83073 == null) {
                        m75945x2fec83073 = "";
                    }
                    int m75939xb282bd082 = t73Var.m75939xb282bd08(2);
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = t73Var.m75934xbce7f2f(3);
                    android.content.Context context = this.f499905e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameWelfareTaskMiniAppHelper", "#preRenderMiniApp appId=" + m75945x2fec83072 + " path=" + m75945x2fec83073 + " version=" + m75939xb282bd082 + " extraData=" + m75934xbce7f2f);
                    l81.b1 b1Var = new l81.b1();
                    b1Var.f398547b = m75945x2fec83072;
                    b1Var.f398555f = m75945x2fec83073;
                    b1Var.f398549c = m75939xb282bd082;
                    b1Var.f398561i = new te2.nc(m75934xbce7f2f);
                    b1Var.H = k91.z3.TRANSPARENT;
                    k91.y3 y3Var = k91.y3.DISABLED;
                    b1Var.S = y3Var;
                    b1Var.T = y3Var;
                    b1Var.U = true;
                    b1Var.f398557g = true;
                    b1Var.f398565k = 1205;
                    b1Var.I = "";
                    b1Var.K = true;
                    b1Var.f398571p = new te2.oc(null);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).ij(b1Var, new te2.pc());
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGameWelfareTaskBubblePresenter", "#preloadMiniApp appid is null, preload return");
            }
        }
        return false;
    }

    public final void f() {
        te2.o3 o3Var = this.f499907g;
        if (o3Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14319xdc54373f c14319xdc54373f = ((te2.t3) o3Var).f499963g;
            if (c14319xdc54373f != null) {
                c14319xdc54373f.setVisibility(8);
            }
            if (c14319xdc54373f != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGameWelfareTaskProgressView", "#reset");
                c14319xdc54373f.a();
                p3325xe03a0797.p3326xc267989b.r2 r2Var = c14319xdc54373f.f197456e;
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                }
                ((java.util.ArrayList) c14319xdc54373f.f197463o).clear();
                c14319xdc54373f.f197464p = null;
                c14319xdc54373f.f197458g.removeAllViews();
                c14319xdc54373f.f197465q = null;
                p3325xe03a0797.p3326xc267989b.r2 r2Var2 = c14319xdc54373f.f197457f;
                if (r2Var2 != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00de, code lost:
    
        if ((((p3325xe03a0797.p3326xc267989b.a) r3).a() ^ true) != false) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(r45.p73 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: te2.r3.g(r45.p73, boolean):void");
    }

    @Override // fs2.a
    /* renamed from: onAttach */
    public void mo56536x3b13c504(java.lang.Object obj) {
        te2.o3 callback = (te2.o3) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f499907g = callback;
        ((te2.t3) callback).f499964h = new te2.q3(this);
    }

    @Override // fs2.a
    /* renamed from: onDetach */
    public void mo979x3f5eee52() {
        f();
        this.f499909i = false;
    }
}
