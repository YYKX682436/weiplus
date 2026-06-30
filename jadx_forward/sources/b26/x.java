package b26;

/* loaded from: classes16.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b26.y f99069d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b26.y yVar) {
        super(0);
        this.f99069d = yVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Set keySet = ((java.util.LinkedHashMap) this.f99069d.f99076p.f99061d).keySet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : keySet) {
            n16.b bVar = (n16.b) obj;
            if ((bVar.k() || b26.m.f98999c.contains(bVar)) ? false : true) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((n16.b) it.next()).j());
        }
        return arrayList2;
    }
}
