package in5;

/* loaded from: classes10.dex */
public final class a extends p012xc85e97e9.p103xe821e364.p104xd1075a44.y2 {

    /* renamed from: c, reason: collision with root package name */
    public final int f374533c;

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f374534d = new android.util.SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f374535e = new java.util.LinkedList();

    public a(int i17) {
        this.f374533c = i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.y2
    public void a() {
        super.a();
        android.util.SparseArray sparseArray = this.f374534d;
        int size = sparseArray.size();
        for (int i17 = 0; i17 < size; i17++) {
            sparseArray.keyAt(i17);
            ((in5.b) sparseArray.valueAt(i17)).f374542a.clear();
        }
        this.f374535e.clear();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.y2
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 b(int i17) {
        in5.b bVar = (in5.b) this.f374534d.get(i17);
        if (bVar == null) {
            return null;
        }
        java.util.LinkedList linkedList = bVar.f374542a;
        if (!(!linkedList.isEmpty())) {
            return null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) linkedList.removeLast();
        this.f374535e.remove(k3Var);
        return k3Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.y2
    public void d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 scrap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scrap, "scrap");
        int m8185xcdaf1228 = scrap.m8185xcdaf1228();
        android.util.SparseArray sparseArray = this.f374534d;
        in5.b bVar = (in5.b) sparseArray.get(m8185xcdaf1228);
        if (bVar == null) {
            bVar = new in5.b();
            sparseArray.put(m8185xcdaf1228, bVar);
        }
        bVar.f374542a.add(scrap);
        java.util.LinkedList linkedList = this.f374535e;
        linkedList.add(scrap);
        if (linkedList.size() > this.f374533c) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) linkedList.removeFirst();
            ((in5.b) sparseArray.get(k3Var.m8185xcdaf1228())).f374542a.remove(k3Var);
        }
    }
}
