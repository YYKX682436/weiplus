package m22;

/* loaded from: classes12.dex */
public class j implements m22.y {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f404584a;

    /* renamed from: b, reason: collision with root package name */
    public final int f404585b;

    /* renamed from: c, reason: collision with root package name */
    public final int f404586c;

    public j(android.content.Context context, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f404584a = context;
        this.f404585b = i17;
        this.f404586c = i18;
    }

    @Override // m22.y
    public void a(m22.i item, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (item instanceof m22.l) {
            java.util.LinkedList linkedList2 = ((m22.l) item).f404589b;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247) it.next()).f68396x5bec8145);
            }
            linkedList.addAll(arrayList);
        } else if (item instanceof m22.k) {
            linkedList.add(((m22.k) item).f404587a.f68396x5bec8145);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.l lVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.l(this.f404584a, linkedList);
        p3325xe03a0797.p3326xc267989b.l.d(lVar.f179108d, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.k(lVar, null), 3, null);
    }
}
