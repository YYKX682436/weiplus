package n3;

/* loaded from: classes5.dex */
public abstract class e3 {
    public static int a(int i17) {
        if (i17 == 1) {
            return 0;
        }
        if (i17 == 2) {
            return 1;
        }
        if (i17 == 4) {
            return 2;
        }
        if (i17 == 8) {
            return 3;
        }
        if (i17 == 16) {
            return 4;
        }
        if (i17 == 32) {
            return 5;
        }
        if (i17 == 64) {
            return 6;
        }
        if (i17 == 128) {
            return 7;
        }
        if (i17 == 256) {
            return 8;
        }
        throw new java.lang.IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i17);
    }
}
