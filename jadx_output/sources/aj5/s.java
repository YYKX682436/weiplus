package aj5;

/* loaded from: classes.dex */
public final class s implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f5510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aj5.a0 f5511e;

    public s(aj5.a0 a0Var, yz5.l handler) {
        kotlin.jvm.internal.o.g(handler, "handler");
        this.f5511e = a0Var;
        this.f5510d = handler;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        java.util.List list;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFTSSearchEnd ");
        sb6.append((vVar == null || (list = vVar.f351160e) == null) ? null : java.lang.Integer.valueOf(list.size()));
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactRecommendUIC", sb6.toString());
        if (vVar != null) {
            aj5.a0 a0Var = this.f5511e;
            if ((kotlin.jvm.internal.o.b(a0Var.f5384f, vVar.f351157b) || kotlin.jvm.internal.o.b(a0Var.f5385g, vVar.f351157b)) && vVar.f351158c == 0) {
                java.util.List resultList = vVar.f351160e;
                kotlin.jvm.internal.o.f(resultList, "resultList");
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(resultList, 10));
                java.util.Iterator it = resultList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((p13.y) it.next()).f351187e);
                }
                this.f5510d.invoke(arrayList);
            }
        }
    }
}
