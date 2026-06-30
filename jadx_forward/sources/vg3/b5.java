package vg3;

/* loaded from: classes12.dex */
public abstract class b5 {

    /* renamed from: a, reason: collision with root package name */
    public static final android.util.SparseArray f518182a = new android.util.SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static pq5.d f518183b;

    public static void a(int i17, vg3.x4 x4Var) {
        vg3.f5 f5Var;
        android.util.SparseArray sparseArray = f518182a;
        synchronized (sparseArray) {
            f5Var = (vg3.f5) sparseArray.get(i17);
            if (f5Var == null) {
                f5Var = new vg3.f5(null);
                sparseArray.put(i17, f5Var);
            }
        }
        f5Var.v(x4Var);
    }

    public static void b(int i17, final com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        vg3.f5 f5Var;
        android.util.SparseArray sparseArray = f518182a;
        synchronized (sparseArray) {
            f5Var = (vg3.f5) sparseArray.get(i17);
        }
        if (f5Var != null) {
            f5Var.A(fVar);
        }
        fs.g.c(vg3.t4.class, java.lang.Integer.valueOf(i17), new fs.o() { // from class: vg3.b5$$a
            @Override // fs.o
            public final boolean a(fs.n nVar) {
                ((vg3.t4) nVar).A(com.p314xaae8f345.mm.p2495xc50a8b8b.f.this);
                return false;
            }
        });
    }
}
