package aj5;

/* loaded from: classes.dex */
public final class j implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f86980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aj5.r f86981e;

    public j(aj5.r rVar, yz5.l handler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        this.f86981e = rVar;
        this.f86980d = handler;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        java.util.List list;
        java.util.List list2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFTSSearchEnd ");
        sb6.append((vVar == null || (list2 = vVar.f432693e) == null) ? null : java.lang.Integer.valueOf(list2.size()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactAddressBookRecommendStrictDupUIC", sb6.toString());
        if (vVar != null) {
            aj5.r rVar = this.f86981e;
            if ((p3321xbce91901.jvm.p3324x21ffc6bd.o.b(rVar.f87034h, vVar.f432690b) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(rVar.f87035i, vVar.f432690b)) && vVar.f432691c == 0 && (list = vVar.f432693e) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((p13.y) it.next()).f432720e);
                }
                this.f86980d.mo146xb9724478(arrayList);
            }
        }
    }
}
