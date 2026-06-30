package ae;

/* loaded from: classes7.dex */
public class m implements yg.a0, yg.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ae.a f84893a;

    public m(ae.a aVar, ae.b bVar) {
        this.f84893a = aVar;
    }

    @Override // yg.a0
    public void a(java.lang.String str, java.lang.String str2, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AppBrandGameServiceLogicImp", "[WAGame][AppBrand] message = [%s] stackTrace = [%s]", str, str2);
        ae.a aVar = this.f84893a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.j0) ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) aVar.F()).getF229341e().h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.j0.class));
        if (i17 == bVar.y0().o()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.jf.a(((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) aVar.F()).getF229341e(), "onError", java.lang.String.format(java.util.Locale.ENGLISH, "{'message':'%s', 'stack': '%s'}", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.w2.a(str), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.w2.a(str2)), 0, 0);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r x07 = bVar.x0(i17);
        if (x07 == null) {
            throw new java.lang.IllegalStateException("j2v8 not follow the pattern");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lf.a(x07, "onError", java.lang.String.format(java.util.Locale.ENGLISH, "{'message':'%s', 'stack': '%s'}", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.w2.a(str), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.w2.a(str2)), 0);
    }

    @Override // yg.y
    public void b(int i17) {
        ae.a aVar = this.f84893a;
        if (((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) aVar.F()).H0() || ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) aVar.F()).mo50262x39e05d35()) {
            java.lang.String N = aVar.N();
            if (android.text.TextUtils.isEmpty(N)) {
                return;
            }
            fe.g a17 = fe.g.a(N);
            com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad w17 = aVar.w();
            a17.getClass();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            a17.f342888c = android.os.SystemClock.elapsedRealtime();
            try {
                a17.f342891f = w17.f130118i;
            } catch (java.lang.NullPointerException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MBNiReporter", e17, "inspector null pointer!", new java.lang.Object[0]);
            }
            yg.h hVar = a17.f342891f;
            if (hVar != null) {
                int c17 = hVar.c();
                hVar.f543598b.put(c17, android.os.SystemClock.elapsedRealtime());
                a17.f342892g = c17;
            }
            ((ku5.t0) ku5.t0.f394148d).g(new fe.a(a17));
            ((ku5.t0) ku5.t0.f394148d).k(new fe.b(a17), 10L);
        }
    }

    @Override // yg.a0
    public void c(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandGameServiceLogicImp", "[WAGame][CONSOLE] output = [%s]", str);
        ae.a aVar = this.f84893a;
        ze.n t37 = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) aVar.F()).t3();
        if (t37 == null || t37.E0() == null || t37.E0().f128829w) {
            aVar.F0().b(str);
        }
    }
}
