package e2;

/* loaded from: classes13.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f327986a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Object[] f327987b = new java.lang.Object[0];

    public static final int a(int[] iArr, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iArr, "<this>");
        int i19 = i17 - 1;
        int i27 = 0;
        while (i27 <= i19) {
            int i28 = (i27 + i19) >>> 1;
            int i29 = iArr[i28];
            if (i29 < i18) {
                i27 = i28 + 1;
            } else {
                if (i29 <= i18) {
                    return i28;
                }
                i19 = i28 - 1;
            }
        }
        return ~i27;
    }
}
