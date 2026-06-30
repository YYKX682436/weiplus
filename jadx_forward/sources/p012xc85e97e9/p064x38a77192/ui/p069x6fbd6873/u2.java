package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public abstract class u2 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Class[] f92288a = {java.io.Serializable.class, android.os.Parcelable.class, java.lang.String.class, android.util.SparseArray.class, android.os.Binder.class, android.util.Size.class, android.util.SizeF.class};

    public static final boolean a(java.lang.Object obj) {
        if (!(obj instanceof x0.e0)) {
            java.lang.Class[] clsArr = f92288a;
            for (int i17 = 0; i17 < 7; i17++) {
                if (clsArr[i17].isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
        n0.q4 q4Var = (n0.q4) ((x0.e0) obj);
        n0.r4 r4Var = q4Var.f415221d;
        if (r4Var != n0.w2.f415272a && r4Var != n0.h5.f415062a && r4Var != n0.c4.f415007a) {
            return false;
        }
        java.lang.Object mo128745x754a37bb = q4Var.mo128745x754a37bb();
        if (mo128745x754a37bb == null) {
            return true;
        }
        return a(mo128745x754a37bb);
    }
}
