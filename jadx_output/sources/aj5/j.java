package aj5;

/* loaded from: classes.dex */
public final class j implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f5447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aj5.r f5448e;

    public j(aj5.r rVar, yz5.l handler) {
        kotlin.jvm.internal.o.g(handler, "handler");
        this.f5448e = rVar;
        this.f5447d = handler;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        java.util.List list;
        java.util.List list2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFTSSearchEnd ");
        sb6.append((vVar == null || (list2 = vVar.f351160e) == null) ? null : java.lang.Integer.valueOf(list2.size()));
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactAddressBookRecommendStrictDupUIC", sb6.toString());
        if (vVar != null) {
            aj5.r rVar = this.f5448e;
            if ((kotlin.jvm.internal.o.b(rVar.f5501h, vVar.f351157b) || kotlin.jvm.internal.o.b(rVar.f5502i, vVar.f351157b)) && vVar.f351158c == 0 && (list = vVar.f351160e) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((p13.y) it.next()).f351187e);
                }
                this.f5447d.invoke(arrayList);
            }
        }
    }
}
