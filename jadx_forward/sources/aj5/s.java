package aj5;

/* loaded from: classes.dex */
public final class s implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f87043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aj5.a0 f87044e;

    public s(aj5.a0 a0Var, yz5.l handler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        this.f87044e = a0Var;
        this.f87043d = handler;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        java.util.List list;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFTSSearchEnd ");
        sb6.append((vVar == null || (list = vVar.f432693e) == null) ? null : java.lang.Integer.valueOf(list.size()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactRecommendUIC", sb6.toString());
        if (vVar != null) {
            aj5.a0 a0Var = this.f87044e;
            if ((p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a0Var.f86917f, vVar.f432690b) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a0Var.f86918g, vVar.f432690b)) && vVar.f432691c == 0) {
                java.util.List resultList = vVar.f432693e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resultList, "resultList");
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(resultList, 10));
                java.util.Iterator it = resultList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((p13.y) it.next()).f432720e);
                }
                this.f87043d.mo146xb9724478(arrayList);
            }
        }
    }
}
