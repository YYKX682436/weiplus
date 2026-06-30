package gf5;

/* loaded from: classes11.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gf5.n f352936d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(gf5.n nVar) {
        super(0);
        this.f352936d = nVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.List list = this.f352936d.f352944d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (obj instanceof gf5.a0) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (!((gf5.a0) next).f352907b.isEmpty()) {
                arrayList2.add(next);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            gf5.a0 a0Var = (gf5.a0) it6.next();
            arrayList3.add(new gf5.b0(a0Var.f352906a, a0Var.f352907b));
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.Iterator it7 = arrayList3.iterator();
        while (it7.hasNext()) {
            java.lang.Object next2 = it7.next();
            gf5.b0 b0Var = (gf5.b0) next2;
            if (hashSet.add(new jz5.l(b0Var.f352913a, b0Var.f352914b))) {
                arrayList4.add(next2);
            }
        }
        return arrayList4;
    }
}
