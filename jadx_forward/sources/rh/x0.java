package rh;

/* loaded from: classes12.dex */
public class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f477079a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f477080b;

    public x0(java.util.List list) {
        this.f477079a = list;
        this.f477080b = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f477080b.add(new int[((int[]) it.next()).length]);
        }
    }

    public boolean a(wh.n1 n1Var) {
        java.util.List list = this.f477079a;
        if (list.size() != n1Var.g()) {
            return false;
        }
        for (int i17 = 0; i17 < list.size(); i17++) {
            if (((int[]) list.get(i17)).length != n1Var.i(n1Var.f(i17))) {
                return false;
            }
        }
        return true;
    }
}
