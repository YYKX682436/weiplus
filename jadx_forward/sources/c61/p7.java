package c61;

@j95.b
/* loaded from: classes5.dex */
public final class p7 extends i95.w implements m40.k0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f120759d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f120760e;

    public p7() {
        m40.j0 j0Var = m40.j0.f404941d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0 ad0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207935a;
        this.f120760e = kz5.c1.k(new jz5.l(j0Var, (lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207954t).mo141623x754a37bb()), new jz5.l(m40.j0.f404942e, (lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207955u).mo141623x754a37bb()), new jz5.l(m40.j0.f404943f, (lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207956v).mo141623x754a37bb()), new jz5.l(m40.j0.f404944g, (lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207951q).mo141623x754a37bb()), new jz5.l(m40.j0.f404945h, (lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207957w).mo141623x754a37bb()), new jz5.l(m40.j0.f404946i, (lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207958x).mo141623x754a37bb()), new jz5.l(m40.j0.f404947m, (lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.P).mo141623x754a37bb()), new jz5.l(m40.j0.f404948n, (lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207952r).mo141623x754a37bb()), new jz5.l(m40.j0.f404949o, (lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207953s).mo141623x754a37bb()));
    }

    public float Ai(float f17) {
        int intValue;
        float f18;
        float f19;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f207973a.K()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70 z70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f209965a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            e42.c0 c0Var = e42.c0.clicfg_finder_entrance_red_dot_occupied_width;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.xi0[] xi0VarArr = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.xi0.f209847d;
            intValue = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f(z70Var, t70Var, "发现页右侧红点安全距离", c0Var, 1, false, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ne0.f208782d, 8, null)).intValue();
        } else {
            intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.Y).mo141623x754a37bb()).r()).intValue();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.xi0[] xi0VarArr2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.xi0.f209847d;
        if (intValue != 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.xi0[] xi0VarArr3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.xi0.f209847d;
            if (intValue != 2) {
                return f17;
            }
            if (!nj()) {
                return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);
            }
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            java.lang.Object systemService = context.getSystemService("window");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            f18 = displayMetrics.density;
            f19 = 32.0f;
        } else {
            if (!nj()) {
                return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
            }
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            android.util.DisplayMetrics displayMetrics2 = new android.util.DisplayMetrics();
            java.lang.Object systemService2 = context2.getSystemService("window");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService2, "null cannot be cast to non-null type android.view.WindowManager");
            android.view.Display defaultDisplay2 = ((android.view.WindowManager) systemService2).getDefaultDisplay();
            if (defaultDisplay2 != null) {
                defaultDisplay2.getMetrics(displayMetrics2);
            }
            f18 = displayMetrics2.density;
            f19 = 24.0f;
        }
        return f18 * f19;
    }

    public jz5.l Bi() {
        p05.v2 v2Var = (p05.v2) ((rh0.x) i95.n0.c(rh0.x.class));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Bi = v2Var.Bi();
        p05.p3 p3Var = p05.p3.f432172a;
        return new jz5.l(java.lang.Float.valueOf(Bi.l("cpu_score")), java.lang.Float.valueOf(v2Var.Bi().l("gpu_score")));
    }

    public int Di() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.F2).mo141623x754a37bb()).r()).intValue();
    }

    public int Ni() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209591za).mo141623x754a37bb()).r()).intValue();
    }

    public int Ri() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209555xa).mo141623x754a37bb()).r()).intValue();
    }

    public int Ui() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0 ad0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207935a;
        java.lang.Integer num = (java.lang.Integer) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.S).mo141623x754a37bb()).r();
        if (num == null || num.intValue() <= 0) {
            return 9;
        }
        return num.intValue();
    }

    public int Vi() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0 ad0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207935a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.R).mo141623x754a37bb()).r()).intValue();
        int Zi = Zi();
        if (intValue > Zi) {
            intValue = Zi;
        }
        if (intValue > 0) {
            return intValue;
        }
        return 9;
    }

    public int Zi() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0 ad0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207935a;
        java.lang.Integer num = (java.lang.Integer) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.Q).mo141623x754a37bb()).r();
        if (num == null || num.intValue() <= 0) {
            return 20;
        }
        return num.intValue();
    }

    public int aj() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.C2();
    }

    public boolean bj() {
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        return cq.l1.b((cq.k) c17);
    }

    public int cj() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FinderFeedCompressPicLevel");
        if (d17 == null || d17.length() == 0) {
            return 90;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(r26.n0.u0(d17).toString(), 0);
    }

    public void fj(java.lang.String str) {
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ni0.k kVar = new ni0.k();
        kVar.f418774a = str;
        kVar.f418775b = 2;
        kVar.f418776c = com.p314xaae8f345.mm.vfs.w6.k(str);
        c66.q qVar = c66.q.f121026a;
        try {
            ((com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae) ((jz5.n) c66.q.f121041p).mo141623x754a37bb()).m107158x7beb81f7(kVar);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.WCFinderWCDB", "insertOrReplaceFinderPostMusicDownloadInfo fail");
        }
    }

    public boolean hj(m40.j0 expType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(expType, "expType");
        lb2.j jVar = (lb2.j) this.f120760e.get(expType);
        return jVar instanceof nb2.a ? ((java.lang.Boolean) ((nb2.a) jVar).r()).booleanValue() : (jVar instanceof ob2.a) && ((java.lang.Number) ((ob2.a) jVar).r()).intValue() == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[LOOP:0: B:4:0x0039->B:21:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean ij(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.Class<cq.k> r0 = cq.k.class
            i95.m r0 = i95.n0.c(r0)
            java.lang.String r1 = "getService(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            cq.k r0 = (cq.k) r0
            c66.q r0 = c66.q.f121026a
            com.tencent.wcdb.orm.Field r0 = ni0.e.f418748c
            com.tencent.wcdb.winq.Expression r8 = r0.eq(r8)
            java.lang.String r0 = "eq(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r8, r0)
            jz5.g r0 = c66.q.f121041p
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.mo141623x754a37bb()
            com.tencent.wcdb.core.Table r0 = (com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae) r0
            java.util.List r8 = r0.m107094xde3eb429(r8)
            java.lang.String r0 = "getAllObjects(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r8, r0)
            boolean r0 = r8.isEmpty()
            r1 = 0
            if (r0 == 0) goto L35
            goto L68
        L35:
            java.util.Iterator r8 = r8.iterator()
        L39:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L68
            java.lang.Object r0 = r8.next()
            ni0.k r0 = (ni0.k) r0
            int r2 = r0.f418775b
            r3 = 2
            r4 = 1
            if (r2 != r3) goto L64
            java.lang.String r2 = r0.f418774a
            long r5 = r0.f418776c
            boolean r0 = com.p314xaae8f345.mm.vfs.w6.j(r2)
            if (r0 == 0) goto L5f
            long r2 = com.p314xaae8f345.mm.vfs.w6.k(r2)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto L5f
            r0 = r4
            goto L60
        L5f:
            r0 = r1
        L60:
            if (r0 == 0) goto L64
            r0 = r4
            goto L65
        L64:
            r0 = r1
        L65:
            if (r0 == 0) goto L39
            r1 = r4
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.p7.ij(java.lang.String):boolean");
    }

    public int mj() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.q2();
    }

    public final boolean nj() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0 aj0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f207973a;
        return ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f209965a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a, "发现页右侧红点安全距离不跟随字体变化_固定dp", e42.c0.clicfg_finder_entrance_occupied_width_not_change_with_dp, 0, false, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.he0.f208423d, 8, null)).intValue() == 1;
    }

    public boolean oj() {
        if (nj()) {
            return false;
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f207973a.K() ? ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f209965a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a, "发现页右侧红点安全距离不跟随字体变化", e42.c0.clicfg_finder_entrance_occupied_width_not_change_with_font, 1, false, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.je0.f208539d, 8, null)).intValue() : ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.Z).mo141623x754a37bb()).r()).intValue()) == 1;
    }

    public void pj(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderConfigFeatureService", "setAutoScrollStatus = " + z17);
        this.f120759d = z17;
    }

    public boolean qj() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_use_daemon_record, 0) == 1;
    }

    public int wi() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0 ad0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207935a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207949o).mo141623x754a37bb()).r()).intValue();
    }
}
