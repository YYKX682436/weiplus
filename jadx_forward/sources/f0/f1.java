package f0;

/* loaded from: classes14.dex */
public abstract class f1 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f339605a = 2500;

    /* renamed from: b, reason: collision with root package name */
    public static final float f339606b = 1500;

    public static final int a(java.util.List list, boolean z17) {
        f0.b1 b1Var = new f0.b1(z17, list);
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i17 < list.size()) {
            int intValue = ((java.lang.Number) b1Var.mo146xb9724478(java.lang.Integer.valueOf(i17))).intValue();
            if (intValue == -1) {
                i17++;
            } else {
                int i27 = 0;
                while (i17 < list.size() && ((java.lang.Number) b1Var.mo146xb9724478(java.lang.Integer.valueOf(i17))).intValue() == intValue) {
                    i27 = java.lang.Math.max(i27, z17 ? p2.q.b(((f0.q0) ((f0.k) list.get(i17))).f339725g) : (int) (((f0.q0) ((f0.k) list.get(i17))).f339725g >> 32));
                    i17++;
                }
                i18 += i27;
                i19++;
            }
        }
        return i18 / i19;
    }

    public static final f0.k b(f0.r1 r1Var, int i17) {
        java.lang.Object obj;
        java.util.List b17 = r1Var.f().b();
        int size = b17.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size) {
                obj = null;
                break;
            }
            obj = b17.get(i18);
            if (((f0.q0) ((f0.k) obj)).f339721c == i17) {
                break;
            }
            i18++;
        }
        return (f0.k) obj;
    }
}
