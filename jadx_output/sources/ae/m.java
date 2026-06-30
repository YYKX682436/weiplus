package ae;

/* loaded from: classes7.dex */
public class m implements yg.a0, yg.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ae.a f3360a;

    public m(ae.a aVar, ae.b bVar) {
        this.f3360a = aVar;
    }

    @Override // yg.a0
    public void a(java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mars.xlog.Log.e("Luggage.AppBrandGameServiceLogicImp", "[WAGame][AppBrand] message = [%s] stackTrace = [%s]", str, str2);
        ae.a aVar = this.f3360a;
        com.tencent.mm.plugin.appbrand.jsruntime.b bVar = (com.tencent.mm.plugin.appbrand.jsruntime.b) ((com.tencent.mm.plugin.appbrand.jsruntime.j0) ((com.tencent.luggage.sdk.jsapi.component.service.y) aVar.F()).getF147808e().h0(com.tencent.mm.plugin.appbrand.jsruntime.j0.class));
        if (i17 == bVar.y0().o()) {
            com.tencent.mm.plugin.appbrand.jsapi.jf.a(((com.tencent.luggage.sdk.jsapi.component.service.y) aVar.F()).getF147808e(), "onError", java.lang.String.format(java.util.Locale.ENGLISH, "{'message':'%s', 'stack': '%s'}", com.tencent.mm.plugin.appbrand.utils.w2.a(str), com.tencent.mm.plugin.appbrand.utils.w2.a(str2)), 0, 0);
            return;
        }
        com.tencent.mm.plugin.appbrand.jsruntime.r x07 = bVar.x0(i17);
        if (x07 == null) {
            throw new java.lang.IllegalStateException("j2v8 not follow the pattern");
        }
        com.tencent.mm.plugin.appbrand.jsapi.lf.a(x07, "onError", java.lang.String.format(java.util.Locale.ENGLISH, "{'message':'%s', 'stack': '%s'}", com.tencent.mm.plugin.appbrand.utils.w2.a(str), com.tencent.mm.plugin.appbrand.utils.w2.a(str2)), 0);
    }

    @Override // yg.y
    public void b(int i17) {
        ae.a aVar = this.f3360a;
        if (((com.tencent.luggage.sdk.jsapi.component.service.y) aVar.F()).H0() || ((com.tencent.luggage.sdk.jsapi.component.service.y) aVar.F()).isRunning()) {
            java.lang.String N = aVar.N();
            if (android.text.TextUtils.isEmpty(N)) {
                return;
            }
            fe.g a17 = fe.g.a(N);
            com.tencent.magicbrush.MagicBrush w17 = aVar.w();
            a17.getClass();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            a17.f261355c = android.os.SystemClock.elapsedRealtime();
            try {
                a17.f261358f = w17.f48585i;
            } catch (java.lang.NullPointerException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MBNiReporter", e17, "inspector null pointer!", new java.lang.Object[0]);
            }
            yg.h hVar = a17.f261358f;
            if (hVar != null) {
                int c17 = hVar.c();
                hVar.f462065b.put(c17, android.os.SystemClock.elapsedRealtime());
                a17.f261359g = c17;
            }
            ((ku5.t0) ku5.t0.f312615d).g(new fe.a(a17));
            ((ku5.t0) ku5.t0.f312615d).k(new fe.b(a17), 10L);
        }
    }

    @Override // yg.a0
    public void c(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandGameServiceLogicImp", "[WAGame][CONSOLE] output = [%s]", str);
        ae.a aVar = this.f3360a;
        ze.n t37 = ((com.tencent.luggage.sdk.jsapi.component.service.y) aVar.F()).t3();
        if (t37 == null || t37.E0() == null || t37.E0().f47296w) {
            aVar.F0().b(str);
        }
    }
}
