package t0;

/* loaded from: classes14.dex */
public abstract class c {
    public static final void a(int i17, int i18) {
        if (i17 < 0 || i17 >= i18) {
            throw new java.lang.IndexOutOfBoundsException("index: " + i17 + ", size: " + i18);
        }
    }

    public static final void b(int i17, int i18) {
        if (i17 < 0 || i17 > i18) {
            throw new java.lang.IndexOutOfBoundsException("index: " + i17 + ", size: " + i18);
        }
    }

    public static final void c(int i17, int i18, int i19) {
        if (i17 < 0 || i18 > i19) {
            throw new java.lang.IndexOutOfBoundsException("fromIndex: " + i17 + ", toIndex: " + i18 + ", size: " + i19);
        }
        if (i17 <= i18) {
            return;
        }
        throw new java.lang.IllegalArgumentException("fromIndex: " + i17 + " > toIndex: " + i18);
    }
}
