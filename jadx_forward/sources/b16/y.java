package b16;

/* loaded from: classes16.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b16.e0 f98795d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(b16.e0 e0Var) {
        super(0);
        this.f98795d = e0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Collection c17 = ((u06.x) this.f98795d.f98685o).c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : c17) {
            if (((u06.d0) ((e16.n) obj)).f505028a.isEnumConstant()) {
                arrayList.add(obj);
            }
        }
        int d17 = kz5.b1.d(kz5.d0.q(arrayList, 10));
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            linkedHashMap.put(((u06.f0) ((e16.n) next)).d(), next);
        }
        return linkedHashMap;
    }
}
