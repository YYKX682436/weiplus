package c01;

/* renamed from: c01.ua$$a */
/* loaded from: classes12.dex */
public final /* synthetic */ class C1365x69d61d5 implements java.util.function.Consumer {
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        wj.t0 posId = (wj.t0) obj;
        ((wj.j0) ((xj.i) i95.n0.c(xj.i.class))).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(posId, "posId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdCommonFeatureService", "clearAllAdInfo, posId: " + posId);
        java.util.Set c17 = gk.b.f353941a.c(posId.toString());
        if (c17 != null) {
            java.util.Iterator it = c17.iterator();
            while (it.hasNext()) {
                gk.b.f353941a.h((java.lang.String) it.next());
            }
        }
        gk.b bVar = gk.b.f353941a;
        java.lang.String posId2 = posId.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(posId2, "posId");
        gk.b.f353942b.remove(bVar.g(posId2));
    }
}
