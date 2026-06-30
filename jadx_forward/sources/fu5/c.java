package fu5;

/* loaded from: classes15.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f348443a = new java.util.HashMap();

    public static boolean a(java.lang.Class cls, zt5.k kVar) {
        if (kVar.a()) {
            return false;
        }
        java.util.HashMap hashMap = f348443a;
        fu5.b bVar = (fu5.b) hashMap.get(cls);
        if (bVar == null) {
            bVar = new fu5.b(null);
            bVar.f348441b = kVar.f557138a;
            bVar.f348442c = kVar.f557139b;
            bVar.f348440a = 1;
            hashMap.put(cls, bVar);
        } else if (kVar.f557138a == bVar.f348441b && kVar.f557139b.equals(bVar.f348442c)) {
            int i17 = bVar.f348440a + 1;
            bVar.f348440a = i17;
            if (i17 >= 2) {
                return true;
            }
        } else {
            bVar.f348441b = kVar.f557138a;
            bVar.f348442c = kVar.f557139b;
            bVar.f348440a = 1;
        }
        zt5.h.a("Soter.RemoveASKStrategy", "error counter: %s", java.lang.Integer.valueOf(bVar.f348440a));
        return false;
    }
}
