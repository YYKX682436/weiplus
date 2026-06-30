package b16;

/* loaded from: classes16.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b16.k f17181d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b16.k kVar) {
        super(0);
        this.f17181d = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        b16.k kVar = this.f17181d;
        java.util.Collection c17 = ((u06.j) kVar.f17199b).c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) c17).iterator();
        while (it.hasNext()) {
            e16.b bVar = (e16.b) it.next();
            n16.g gVar = ((u06.k) bVar).f423512a;
            if (gVar == null) {
                gVar = x06.p0.f451285b;
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
