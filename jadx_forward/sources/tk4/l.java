package tk4;

/* loaded from: classes11.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a f501526d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.d2 f501527e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tk4.c0 f501528f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a c18711x7115b73a, bw5.d2 d2Var, tk4.c0 c0Var) {
        super(0);
        this.f501526d = c18711x7115b73a;
        this.f501527e = d2Var;
        this.f501528f = c0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a.N;
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a c18711x7115b73a = this.f501526d;
        c18711x7115b73a.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClickView, contentType = ");
        bw5.d2 d2Var = this.f501527e;
        sb6.append(d2Var.f107818i);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = c18711x7115b73a.f256172a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.Map j17 = c18711x7115b73a.j(d2Var);
        ((java.util.HashMap) j17).put("view_id", "tyt_push_bubble");
        ((cy1.a) rVar).yj("view_clk", null, j17, 5, false);
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2573x3652ee.p2574xb446ff0.C20787x6ee24ad0()) == 1;
        int i18 = d2Var.f107818i;
        if (i18 == 1) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6973x5d0a81b7 c6973x5d0a81b7 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6973x5d0a81b7();
            c6973x5d0a81b7.f142835d = c18711x7115b73a.f256186o;
            c6973x5d0a81b7.k();
            if (z17) {
                c18711x7115b73a.g(d2Var, false);
            }
            boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_ting_audio_push_view_jump_square, 0) == 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onClickView, squareEnter = " + z18);
            boolean[] zArr = d2Var.f107820n;
            if (z18) {
                bw5.xa0 xa0Var = new bw5.xa0();
                xa0Var.f116571u = d2Var.v();
                boolean[] zArr2 = xa0Var.S;
                zArr2[15] = true;
                xa0Var.f116561h = zArr[3] ? d2Var.f107815f : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
                zArr2[5] = true;
                bw5.pp0 pp0Var = new bw5.pp0();
                pp0Var.f113318h = xa0Var;
                boolean[] zArr3 = pp0Var.E;
                zArr3[5] = true;
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("onEnterSquareWithRecommendInfo, listSourceContext ");
                sb8.append((zArr3[5] ? pp0Var.f113318h : new bw5.xa0()).b());
                sb8.append(", ");
                bw5.xa0 xa0Var2 = zArr3[5] ? pp0Var.f113318h : new bw5.xa0();
                bw5.n3 n3Var = xa0Var2.S[19] ? xa0Var2.f116575y : new bw5.n3();
                sb8.append(n3Var.f112006g[2] ? n3Var.f112004e : "");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb8.toString());
                ((rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj()).B(bw5.ar0.TingScene_PushBubbleScene, false, pp0Var, "3008");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onEnterSquare, id:" + d2Var.b().c());
                bw5.ar0 ar0Var = bw5.ar0.TingScene_PushBubbleScene;
                bw5.xa0 xa0Var3 = new bw5.xa0();
                xa0Var3.f116571u = d2Var.v();
                boolean[] zArr4 = xa0Var3.S;
                zArr4[15] = true;
                xa0Var3.f116561h = zArr[3] ? d2Var.f107815f : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
                zArr4[5] = true;
                bw5.pp0 pp0Var2 = new bw5.pp0();
                pp0Var2.f113318h = xa0Var3;
                pp0Var2.E[5] = true;
                il4.e eVar = new il4.e(null, 0, 2101, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554427, null);
                eVar.f373649m = java.lang.Boolean.TRUE;
                eVar.f373653q = true;
                qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
                android.content.Context applicationContext = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(applicationContext, "getApplicationContext(...)");
                bw5.o50 b17 = d2Var.b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getCategoryItem(...)");
                qk.f9.d(aj6, applicationContext, b17, null, qk.ja.f445724d, ar0Var, eVar, null, null, "3008", pp0Var2, false, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.p0.f34638x366c91de, null);
            }
        } else if (i18 == 2) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6973x5d0a81b7 c6973x5d0a81b72 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6973x5d0a81b7();
            c6973x5d0a81b72.f142835d = c18711x7115b73a.f256187p;
            c6973x5d0a81b72.k();
            if (z17) {
                c18711x7115b73a.h(d2Var, false);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onEnterSquare, id:" + d2Var.c().m13170xcc16feb8());
            bw5.lp0 lp0Var = new bw5.lp0();
            lp0Var.j(d2Var.c());
            lp0Var.g(d2Var.c().m13170xcc16feb8());
            il4.e eVar2 = new il4.e(null, 0, 0, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554431, null);
            bw5.ar0 ar0Var2 = bw5.ar0.TingScene_UnDefined;
            eVar2.f373639c = 2101;
            qk.f9 aj7 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
            java.lang.Object mo141623x754a37bb = ((jz5.n) c18711x7115b73a.f256191t).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            rk4.k8 k8Var = (rk4.k8) aj7;
            p3325xe03a0797.p3326xc267989b.l.d(k8Var, null, null, new rk4.p7(k8Var, (android.content.Context) mo141623x754a37bb, false, lp0Var, eVar2, null, null), 3, null);
        }
        this.f501528f.a(true);
        return jz5.f0.f384359a;
    }
}
