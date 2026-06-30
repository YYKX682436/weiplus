package sg0;

/* loaded from: classes.dex */
public final class o1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f489299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e f489300e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e abstractC19224x1fe3df6e) {
        super(0);
        this.f489299d = jSONObject;
        this.f489300e = abstractC19224x1fe3df6e;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCallLiteAppConnectEvent, event->");
        org.json.JSONObject jSONObject = this.f489299d;
        sb6.append(jSONObject);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.ServiceWorkerFeatureService", sb6.toString());
        av4.y0 y0Var = av4.y0.f95883a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e it = this.f489300e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "$it");
        y0Var.a(it, "onCallLiteAppConnectEvent", jSONObject);
        return jz5.f0.f384359a;
    }
}
