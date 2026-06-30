package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.LensFacingUtil */
/* loaded from: classes11.dex */
public class C0252xf2a95aba {
    private C0252xf2a95aba() {
    }

    /* renamed from: getCameraSelectorLensFacing */
    public static int m3480x37bd5d32(int i17) {
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

    /* renamed from: getLensFacingInt */
    public static int m3481x327b82a1(int i17) {
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
