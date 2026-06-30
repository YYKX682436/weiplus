package ye5;

/* loaded from: classes9.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rd5.d f542819d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(rd5.d dVar) {
        super(0);
        this.f542819d = dVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.List list;
        we5.s0 s0Var = ((qd5.i) this.f542819d).f443444o;
        if (s0Var == null || (list = s0Var.f526920a) == null) {
            return kz5.p0.f395529d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((rd5.d) it.next()).f475787d.f526833b);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) next;
            if (f9Var.m78014x7b98c171() || f9Var.J2()) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }
}
