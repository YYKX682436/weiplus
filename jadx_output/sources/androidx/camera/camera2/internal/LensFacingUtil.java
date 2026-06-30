package androidx.camera.camera2.internal;

/* loaded from: classes11.dex */
public class LensFacingUtil {
    private LensFacingUtil() {
    }

    public static int getCameraSelectorLensFacing(int i17) {
        if (i17 == 0) {
            return 0;
        }
        if (i17 == 1) {
            return 1;
        }
        if (i17 == 2) {
            return 2;
        }
        throw new java.lang.IllegalArgumentException("The given lens facing integer: " + i17 + " can not be recognized.");
    }

    public static int getLensFacingInt(int i17) {
        if (i17 == 0) {
            return 0;
        }
        if (i17 == 1) {
            return 1;
        }
        if (i17 == 2) {
            return 2;
        }
        throw new java.lang.IllegalArgumentException("The given lens facing: " + i17 + " can not be recognized.");
    }
}
