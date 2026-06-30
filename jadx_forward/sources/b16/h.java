package b16;

/* loaded from: classes16.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b16.k f98714d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b16.k kVar) {
        super(0);
        this.f98714d = kVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        b16.k kVar = this.f98714d;
        java.util.Collection c17 = ((u06.j) kVar.f98732b).c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) c17).iterator();
        while (it.hasNext()) {
            e16.b bVar = (e16.b) it.next();
            n16.g gVar = ((u06.k) bVar).f505045a;
            if (gVar == null) {
                gVar = x06.p0.f532818b;
            }
            t16.g d17 = kVar.d(bVar);
            jz5.l lVar = d17 != null ? new jz5.l(gVar, d17) : null;
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        return kz5.c1.q(arrayList);
    }
}
