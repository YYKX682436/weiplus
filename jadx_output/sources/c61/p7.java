package c61;

@j95.b
/* loaded from: classes5.dex */
public final class p7 extends i95.w implements m40.k0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f39226d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f39227e;

    public p7() {
        m40.j0 j0Var = m40.j0.f323408d;
        com.tencent.mm.plugin.finder.storage.ad0 ad0Var = com.tencent.mm.plugin.finder.storage.ad0.f126402a;
        this.f39227e = kz5.c1.k(new jz5.l(j0Var, (lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.f126421t).getValue()), new jz5.l(m40.j0.f323409e, (lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.f126422u).getValue()), new jz5.l(m40.j0.f323410f, (lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.f126423v).getValue()), new jz5.l(m40.j0.f323411g, (lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.f126418q).getValue()), new jz5.l(m40.j0.f323412h, (lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.f126424w).getValue()), new jz5.l(m40.j0.f323413i, (lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.f126425x).getValue()), new jz5.l(m40.j0.f323414m, (lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.P).getValue()), new jz5.l(m40.j0.f323415n, (lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.f126419r).getValue()), new jz5.l(m40.j0.f323416o, (lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.f126420s).getValue()));
    }

    public float Ai(float f17) {
        int intValue;
        float f18;
        float f19;
        if (com.tencent.mm.plugin.finder.storage.aj0.f126440a.K()) {
            com.tencent.mm.plugin.finder.storage.z70 z70Var = com.tencent.mm.plugin.finder.storage.z70.f128432a;
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            e42.c0 c0Var = e42.c0.clicfg_finder_entrance_red_dot_occupied_width;
            com.tencent.mm.plugin.finder.storage.xi0[] xi0VarArr = com.tencent.mm.plugin.finder.storage.xi0.f128314d;
            intValue = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.z70.f(z70Var, t70Var, "发现页右侧红点安全距离", c0Var, 1, false, com.tencent.mm.plugin.finder.storage.ne0.f127249d, 8, null)).intValue();
        } else {
            intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.aj0.Y).getValue()).r()).intValue();
        }
        com.tencent.mm.plugin.finder.storage.xi0[] xi0VarArr2 = com.tencent.mm.plugin.finder.storage.xi0.f128314d;
        if (intValue != 1) {
            com.tencent.mm.plugin.finder.storage.xi0[] xi0VarArr3 = com.tencent.mm.plugin.finder.storage.xi0.f128314d;
            if (intValue != 2) {
                return f17;
            }
            if (!nj()) {
                return com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479714d7);
            }
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            java.lang.Object systemService = context.getSystemService("window");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            f18 = displayMetrics.density;
            f19 = 32.0f;
        } else {
            if (!nj()) {
                return com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479704cz);
            }
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            android.util.DisplayMetrics displayMetrics2 = new android.util.DisplayMetrics();
            java.lang.Object systemService2 = context2.getSystemService("window");
            kotlin.jvm.internal.o.e(systemService2, "null cannot be cast to non-null type android.view.WindowManager");
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
        com.tencent.mm.sdk.platformtools.o4 Bi = v2Var.Bi();
        p05.p3 p3Var = p05.p3.f350639a;
        return new jz5.l(java.lang.Float.valueOf(Bi.l("cpu_score")), java.lang.Float.valueOf(v2Var.Bi().l("gpu_score")));
    }

    public int Di() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.F2).getValue()).r()).intValue();
    }

    public int Ni() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128058za).getValue()).r()).intValue();
    }

    public int Ri() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128022xa).getValue()).r()).intValue();
    }

    public int Ui() {
        com.tencent.mm.plugin.finder.storage.ad0 ad0Var = com.tencent.mm.plugin.finder.storage.ad0.f126402a;
        java.lang.Integer num = (java.lang.Integer) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.S).getValue()).r();
        if (num == null || num.intValue() <= 0) {
            return 9;
        }
        return num.intValue();
    }

    public int Vi() {
        com.tencent.mm.plugin.finder.storage.ad0 ad0Var = com.tencent.mm.plugin.finder.storage.ad0.f126402a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.R).getValue()).r()).intValue();
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
        com.tencent.mm.plugin.finder.storage.ad0 ad0Var = com.tencent.mm.plugin.finder.storage.ad0.f126402a;
        java.lang.Integer num = (java.lang.Integer) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.Q).getValue()).r();
        if (num == null || num.intValue() <= 0) {
            return 20;
        }
        return num.intValue();
    }

    public int aj() {
        return com.tencent.mm.plugin.finder.storage.t70.f127590a.C2();
    }

    public boolean bj() {
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        return cq.l1.b((cq.k) c17);
    }

    public int cj() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FinderFeedCompressPicLevel");
        if (d17 == null || d17.length() == 0) {
            return 90;
        }
        kotlin.jvm.internal.o.d(d17);
        return com.tencent.mm.sdk.platformtools.t8.D1(r26.n0.u0(d17).toString(), 0);
    }

    public void fj(java.lang.String str) {
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ni0.k kVar = new ni0.k();
        kVar.f337241a = str;
        kVar.f337242b = 2;
        kVar.f337243c = com.tencent.mm.vfs.w6.k(str);
        c66.q qVar = c66.q.f39493a;
        try {
            ((com.tencent.wcdb.core.Table) ((jz5.n) c66.q.f39508p).getValue()).insertOrReplaceObject(kVar);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("Finder.WCFinderWCDB", "insertOrReplaceFinderPostMusicDownloadInfo fail");
        }
    }

    public boolean hj(m40.j0 expType) {
        kotlin.jvm.internal.o.g(expType, "expType");
        lb2.j jVar = (lb2.j) this.f39227e.get(expType);
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
            kotlin.jvm.internal.o.f(r0, r1)
            cq.k r0 = (cq.k) r0
            c66.q r0 = c66.q.f39493a
            com.tencent.wcdb.orm.Field r0 = ni0.e.f337215c
            com.tencent.wcdb.winq.Expression r8 = r0.eq(r8)
            java.lang.String r0 = "eq(...)"
            kotlin.jvm.internal.o.f(r8, r0)
            jz5.g r0 = c66.q.f39508p
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.getValue()
            com.tencent.wcdb.core.Table r0 = (com.tencent.wcdb.core.Table) r0
            java.util.List r8 = r0.getAllObjects(r8)
            java.lang.String r0 = "getAllObjects(...)"
            kotlin.jvm.internal.o.f(r8, r0)
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
            int r2 = r0.f337242b
            r3 = 2
            r4 = 1
            if (r2 != r3) goto L64
            java.lang.String r2 = r0.f337241a
            long r5 = r0.f337243c
            boolean r0 = com.tencent.mm.vfs.w6.j(r2)
            if (r0 == 0) goto L5f
            long r2 = com.tencent.mm.vfs.w6.k(r2)
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
        return com.tencent.mm.plugin.finder.storage.t70.f127590a.q2();
    }

    public final boolean nj() {
        com.tencent.mm.plugin.finder.storage.aj0 aj0Var = com.tencent.mm.plugin.finder.storage.aj0.f126440a;
        return ((java.lang.Number) com.tencent.mm.plugin.finder.storage.z70.f(com.tencent.mm.plugin.finder.storage.z70.f128432a, com.tencent.mm.plugin.finder.storage.t70.f127590a, "发现页右侧红点安全距离不跟随字体变化_固定dp", e42.c0.clicfg_finder_entrance_occupied_width_not_change_with_dp, 0, false, com.tencent.mm.plugin.finder.storage.he0.f126890d, 8, null)).intValue() == 1;
    }

    public boolean oj() {
        if (nj()) {
            return false;
        }
        return (com.tencent.mm.plugin.finder.storage.aj0.f126440a.K() ? ((java.lang.Number) com.tencent.mm.plugin.finder.storage.z70.f(com.tencent.mm.plugin.finder.storage.z70.f128432a, com.tencent.mm.plugin.finder.storage.t70.f127590a, "发现页右侧红点安全距离不跟随字体变化", e42.c0.clicfg_finder_entrance_occupied_width_not_change_with_font, 1, false, com.tencent.mm.plugin.finder.storage.je0.f127006d, 8, null)).intValue() : ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.aj0.Z).getValue()).r()).intValue()) == 1;
    }

    public void pj(boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderConfigFeatureService", "setAutoScrollStatus = " + z17);
        this.f39226d = z17;
    }

    public boolean qj() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_use_daemon_record, 0) == 1;
    }

    public int wi() {
        com.tencent.mm.plugin.finder.storage.ad0 ad0Var = com.tencent.mm.plugin.finder.storage.ad0.f126402a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.f126416o).getValue()).r()).intValue();
    }
}
