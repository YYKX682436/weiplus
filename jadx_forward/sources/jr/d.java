package jr;

/* loaded from: classes12.dex */
public final class d extends jr.a {

    /* renamed from: f, reason: collision with root package name */
    public final jr.g f382826f;

    /* renamed from: g, reason: collision with root package name */
    public final jr.i f382827g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f382828h;

    public d(im5.b bVar) {
        super(bVar);
        this.f382826f = new jr.g();
        this.f382827g = new jr.i(bVar);
        this.f382828h = new java.util.LinkedList();
    }

    public static final void a(jr.d dVar, java.util.List list, java.util.List list2) {
        boolean z17;
        dVar.getClass();
        int size = list2.size();
        for (int i17 = 0; i17 < size; i17++) {
            if (list.size() >= 100) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1418L, 25, 1L);
                return;
            }
            jr.p pVar = (jr.p) list2.get(i17);
            if (!list.isEmpty()) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!(!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((jr.p) it.next()).f382849a.mo42933xb5885648(), pVar.f382849a.mo42933xb5885648()))) {
                        z17 = false;
                        break;
                    }
                }
            }
            z17 = true;
            if (z17) {
                pVar.f382850b.f382848d = list.size() + 1;
                list.add(list2.get(i17));
            }
        }
    }
}
