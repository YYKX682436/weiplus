package ds2;

/* loaded from: classes2.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f324441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ds2.b0 f324442e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f324443f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f324444g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f324445h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(java.util.LinkedList linkedList, ds2.b0 b0Var, java.util.List list, java.util.LinkedList linkedList2, java.util.LinkedList linkedList3) {
        super(0);
        this.f324441d = linkedList;
        this.f324442e = b0Var;
        this.f324443f = list;
        this.f324444g = linkedList2;
        this.f324445h = linkedList3;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList linkedList;
        ds2.b0 b0Var;
        java.util.Iterator it = this.f324441d.iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
        while (true) {
            boolean hasNext = it.hasNext();
            boolean z17 = false;
            linkedList = this.f324444g;
            b0Var = this.f324442e;
            if (!hasNext) {
                break;
            }
            java.lang.Object next = it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
            cs2.p pVar = (cs2.p) next;
            cs2.p pVar2 = (cs2.p) b0Var.f324388c.get(pVar.f303625i2);
            if (pVar2 != null) {
                if (pVar.f323338x == pVar2.f323338x && pVar.V1 == pVar2.V1 && pVar.f69610x4f5245a8 == pVar2.f69610x4f5245a8 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(pVar.k(), pVar2.k())) {
                    z17 = true;
                }
                if (z17) {
                    it.remove();
                } else {
                    linkedList.add(pVar2.f303625i2);
                }
            }
        }
        for (java.util.Map.Entry entry : b0Var.f324388c.entrySet()) {
            if (!this.f324443f.contains(entry.getValue())) {
                linkedList.add(((cs2.p) entry.getValue()).f303625i2);
            }
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            cs2.p a17 = b0Var.a((java.lang.String) it6.next(), false, "mergePreload");
            if (a17 != null) {
                this.f324445h.addFirst(a17);
            }
        }
        return jz5.f0.f384359a;
    }
}
