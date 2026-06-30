package c01;

/* loaded from: classes12.dex */
public final /* synthetic */ class ua$$a implements java.util.function.Consumer {
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        wj.t0 posId = (wj.t0) obj;
        ((wj.j0) ((xj.i) i95.n0.c(xj.i.class))).getClass();
        kotlin.jvm.internal.o.g(posId, "posId");
        com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", "clearAllAdInfo, posId: " + posId);
        java.util.Set c17 = gk.b.f272408a.c(posId.toString());
        if (c17 != null) {
            java.util.Iterator it = c17.iterator();
            while (it.hasNext()) {
                gk.b.f272408a.h((java.lang.String) it.next());
            }
        }
        gk.b bVar = gk.b.f272408a;
        java.lang.String posId2 = posId.toString();
        kotlin.jvm.internal.o.g(posId2, "posId");
        gk.b.f272409b.remove(bVar.g(posId2));
    }
}
