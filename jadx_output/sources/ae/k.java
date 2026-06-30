package ae;

/* loaded from: classes7.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ae.a f3355d;

    public k(ae.a aVar) {
        this.f3355d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.debugger.h1 a17 = com.tencent.mm.plugin.appbrand.debugger.h1.a();
        ae.a aVar = this.f3355d;
        aVar.f3333w = a17.b((com.tencent.luggage.sdk.jsapi.component.service.y) aVar.F());
        com.tencent.luggage.sdk.jsapi.component.service.n1 n1Var = aVar.f3334x;
        if (n1Var != null) {
            n1Var.f47501a = aVar.f3333w;
        }
        aVar.x0(aVar.f3333w);
    }
}
