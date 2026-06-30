package sg0;

/* loaded from: classes8.dex */
public final class x1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sg0.a2 f489390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f489391e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(sg0.a2 a2Var, org.json.JSONObject jSONObject) {
        super(0);
        this.f489390d = a2Var;
        this.f489391e = jSONObject;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e abstractC19224x1fe3df6e;
        sg0.a2 a2Var = this.f489390d;
        kz5.h0.B(a2Var.f489204i, sg0.w1.f489381d);
        java.util.Iterator it = ((java.util.ArrayList) a2Var.f489204i).iterator();
        while (it.hasNext()) {
            sg0.k1 k1Var = (sg0.k1) it.next();
            k1Var.getClass();
            org.json.JSONObject ret = this.f489391e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.ServiceWorkerFeatureService", "onStoreSetData, event->" + ret);
                java.lang.ref.WeakReference weakReference = k1Var.f489271a;
                if (weakReference != null && (abstractC19224x1fe3df6e = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e) weakReference.get()) != null) {
                    av4.y0.f95883a.a(abstractC19224x1fe3df6e, "onLiteAppSetData", ret);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.ServiceWorkerFeatureService", "onStoreSetData exp:" + e17);
            }
        }
        return jz5.f0.f384359a;
    }
}
