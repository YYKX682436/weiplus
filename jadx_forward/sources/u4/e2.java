package u4;

/* loaded from: classes13.dex */
public abstract class e2 extends u4.h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f506005a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    public static int b(u4.m1 m1Var, int i17) {
        int[] iArr;
        if (m1Var == null || (iArr = (int[]) ((java.util.HashMap) m1Var.f506047a).get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i17];
    }
}
