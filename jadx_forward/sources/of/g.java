package of;

/* loaded from: classes3.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of.h f426360d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(of.h hVar) {
        super(0);
        this.f426360d = hVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Map map = this.f426360d.f426362b;
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            long j17 = 0;
            for (of.t tVar : (java.util.List) entry.getValue()) {
                j17 += tVar.f426393c - tVar.f426392b;
            }
            arrayList.add(new of.b(str, j17));
        }
        java.util.List<of.b> F0 = kz5.n0.F0(arrayList, new of.f());
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(F0, 10));
        for (of.b bVar : F0) {
            arrayList2.add(new jz5.l(bVar.f426353a, bVar));
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        kz5.c1.o(linkedHashMap, arrayList2);
        return linkedHashMap;
    }
}
