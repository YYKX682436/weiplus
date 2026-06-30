package yj5;

/* loaded from: classes8.dex */
public final class w implements ps5.f {
    public void b(java.lang.String hostRoomId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hostRoomId, "hostRoomId");
        java.util.ArrayList arrayList = yj5.k.f544251h;
        java.util.Iterator it = yj5.k.f544251h.iterator();
        while (it.hasNext()) {
            yj5.j jVar = (yj5.j) ((ps5.e) it.next());
            jVar.getClass();
            yj5.k kVar = jVar.f544250a;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kVar.f280113d.x(), hostRoomId)) {
                java.util.ArrayList arrayList2 = yj5.k.f544251h;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveTipsBarProcessor", "finderLiveTipsNotifier hostRoomId:".concat(hostRoomId));
                pm0.v.X(new yj5.i(kVar));
            }
        }
    }
}
