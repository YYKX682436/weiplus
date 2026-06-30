package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public abstract class u2 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Class[] f10755a = {java.io.Serializable.class, android.os.Parcelable.class, java.lang.String.class, android.util.SparseArray.class, android.os.Binder.class, android.util.Size.class, android.util.SizeF.class};

    public static final boolean a(java.lang.Object obj) {
        if (!(obj instanceof x0.e0)) {
            java.lang.Class[] clsArr = f10755a;
            for (int i17 = 0; i17 < 7; i17++) {
                if (clsArr[i17].isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
        n0.q4 q4Var = (n0.q4) ((x0.e0) obj);
        n0.r4 r4Var = q4Var.f333688d;
        if (r4Var != n0.w2.f333739a && r4Var != n0.h5.f333529a && r4Var != n0.c4.f333474a) {
            return false;
        }
        java.lang.Object value = q4Var.getValue();
        if (value == null) {
            return true;
        }
        return a(value);
    }
}
