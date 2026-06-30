package kk5;

/* loaded from: classes.dex */
public final class x implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f390231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kk5.c0 f390232e;

    public x(kk5.c0 c0Var, yz5.l handler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        this.f390232e = c0Var;
        this.f390231d = handler;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        java.util.List list;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFTSSearchEnd ");
        jz5.f0 f0Var = null;
        sb6.append((vVar == null || (list = vVar.f432693e) == null) ? null : java.lang.Integer.valueOf(list.size()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactCreateChatroomCheckDupUIC", sb6.toString());
        if (vVar != null) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390232e.f390158f, vVar.f432690b)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactCreateChatroomCheckDupUIC", "result code: " + vVar.f432691c);
                if (vVar.f432691c == 0) {
                    java.util.List resultList = vVar.f432693e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resultList, "resultList");
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(resultList, 10));
                    java.util.Iterator it = resultList.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((p13.y) it.next()).f432720e);
                    }
                    this.f390231d.mo146xb9724478(arrayList);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactCreateChatroomCheckDupUIC", "onFTSSearchEnd currentSearchTask is not equal");
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SelectContactCreateChatroomCheckDupUIC", "onFTSSearchEnd ftsResult is null");
        }
    }
}
