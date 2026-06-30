package ic3;

/* loaded from: classes5.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final wj.t0[] f371926a;

    static {
        rz5.a aVar = ic3.b0.f371924a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<E> it = aVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                f371926a = (wj.t0[]) arrayList.toArray(new wj.t0[0]);
                return;
            } else {
                java.lang.Object next = it.next();
                if (((wj.t0) next) != wj.t0.f528041q) {
                    arrayList.add(next);
                }
            }
        }
    }
}
