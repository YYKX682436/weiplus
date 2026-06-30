package ae;

/* loaded from: classes7.dex */
public class b implements com.tencent.mm.plugin.appbrand.jsruntime.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ae.a f3341a;

    public b(ae.a aVar) {
        this.f3341a = aVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.s
    public void a(java.lang.String str, java.lang.String str2) {
        ae.a aVar = this.f3341a;
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = (com.tencent.luggage.sdk.jsapi.component.service.y) aVar.F();
        com.tencent.mm.plugin.appbrand.jsruntime.t f147808e = yVar == null ? null : yVar.getF147808e();
        if (f147808e == null) {
            return;
        }
        com.tencent.mars.xlog.Log.e("Luggage.AppBrandGameServiceLogicImp", "[WAGameJsException] hy: wxa main context exception %s %s", str, str2);
        com.tencent.mm.plugin.appbrand.jsapi.jf.a(f147808e, "onError", java.lang.String.format("{'message':'%s', 'stack': '%s'}", com.tencent.mm.plugin.appbrand.utils.w2.a(str), com.tencent.mm.plugin.appbrand.utils.w2.a(str2)), 0, 0);
        java.util.List list = (java.util.List) ((java.util.HashMap) pj1.b.f354931a.f354932a).get(com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.NAME);
        if (list != null && list.size() > 0) {
            android.support.v4.media.f.a(list.get(0));
            throw null;
        }
        aVar.K0(str, str2);
    }
}
