package km4;

/* loaded from: classes11.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final km4.l f390829a = new km4.l();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f390830b = new java.lang.Object();

    public static final void c(yz5.l lVar, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC24972xf15f2364 enumC24972xf15f2364) {
        synchronized (f390830b) {
            if (c0Var.f391645d) {
                return;
            }
            c0Var.f391645d = true;
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24973x3635af2e(java.lang.Long.valueOf(enumC24972xf15f2364.ordinal())))));
            d(h0Var);
        }
    }

    public static final void d(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        android.app.ProgressDialog progressDialog = (android.app.ProgressDialog) h0Var.f391656d;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        h0Var.f391656d = null;
    }

    public final void a(int i17, java.lang.String str) {
        ((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).Bi("AdOpen", i17, str);
    }

    public final void b(bw5.q80 adSchemeInfo, long j17, yz5.l callback, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adSchemeInfo, "adSchemeInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        bw5.c80 c80Var = adSchemeInfo.f113530g[1] ? adSchemeInfo.f113527d : new bw5.c80();
        java.lang.String str = c80Var.f107506i[1] ? c80Var.f107501d : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingAdHelper", "openAD appId:" + str + ", scene:" + j17);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        if (str == null || r26.n0.N(str)) {
            c(callback, c0Var, h0Var, com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC24972xf15f2364.f44771x3ffc7f3);
            return;
        }
        a(1, null);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).Bi("", str, -1, false);
        int i17 = 0;
        h0Var.f391656d = db5.e1.Q(context, j65.q.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), j65.q.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new km4.j(callback, c0Var, h0Var));
        ku5.u0 u0Var = ku5.t0.f394148d;
        km4.k kVar = new km4.k(h0Var, callback, c0Var);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(kVar, 30000L, false);
        l81.b1 b1Var = new l81.b1();
        b1Var.f398547b = str;
        b1Var.f398565k = (int) j17;
        if (bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2573x3652ee.C20774x606fce91()) == 0) {
            i17 = 2;
        }
        b1Var.f398549c = i17;
        b1Var.f398570o = new km4.i(callback, c0Var, h0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        km4.g gVar = new km4.g(c0Var2, context, b1Var, h0Var2, c0Var, currentTimeMillis, h0Var, callback, str);
        h0Var2.f391656d = gVar;
        ((xc1.t) ((ft.q4) i95.n0.c(ft.q4.class))).wi(str, gVar);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).ij(b1Var, new km4.h(callback, c0Var, h0Var));
    }
}
