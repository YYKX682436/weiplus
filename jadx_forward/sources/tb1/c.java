package tb1;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f498423a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f498424b = true;

    /* renamed from: c, reason: collision with root package name */
    public boolean f498425c = false;

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f498426d = new android.util.SparseArray();

    public c(tb1.a aVar) {
    }

    public int[] a() {
        android.util.SparseArray sparseArray = this.f498426d;
        if (sparseArray == null || sparseArray.size() == 0) {
            return new int[0];
        }
        int[] iArr = new int[sparseArray.size()];
        for (int i17 = 0; i17 < sparseArray.size(); i17++) {
            iArr[i17] = sparseArray.keyAt(i17);
        }
        return iArr;
    }

    public boolean b(int i17, boolean z17) {
        android.util.SparseArray sparseArray = this.f498426d;
        if (sparseArray.indexOfKey(i17) < 0) {
            return false;
        }
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) sparseArray.get(i17);
        if (weakReference != null) {
            tb1.a0 a0Var = (tb1.a0) weakReference.get();
            if (a0Var != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610) a0Var).i();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraMrg", "release a recycled camera instance");
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraMrg", "release client fail, weak reference not exist");
        }
        if (!z17) {
            return true;
        }
        sparseArray.remove(i17);
        return true;
    }
}
