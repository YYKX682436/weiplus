package kh;

/* loaded from: classes12.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh.d f389288d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(kh.d dVar) {
        super(0);
        this.f389288d = dVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.l lVar;
        kh.d dVar = this.f389288d;
        if (dVar.f476827a.f444868d.f444834t) {
            return kz5.p0.f395529d;
        }
        java.util.Map map = dVar.f476924c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(map, "access$getMTaskJiffiesTrace$p$s-730001956(...)");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) map;
        java.util.ArrayList arrayList = new java.util.ArrayList(concurrentHashMap.size());
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            rh.f fVar = (rh.f) ((java.util.Map.Entry) it.next()).getValue();
            rh.f m17 = dVar.m(fVar.f476908e, fVar.f476907d);
            if (m17 == null) {
                lVar = null;
            } else {
                rh.f fVar2 = (rh.f) new rh.e(m17, fVar, m17).f477019c;
                lVar = new jz5.l(fVar2.f476908e, fVar2.f476910g.f477085a);
            }
            arrayList.add(lVar);
        }
        return kz5.n0.S0(kz5.n0.V(arrayList));
    }
}
