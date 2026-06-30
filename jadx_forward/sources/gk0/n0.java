package gk0;

/* loaded from: classes9.dex */
public interface n0 extends i95.m {
    public static final gk0.m0 K0 = gk0.m0.f353975a;

    static /* synthetic */ g75.z x6(gk0.n0 n0Var, java.lang.String str, gk0.k kVar, android.widget.ImageView imageView, java.lang.String str2, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCommonPipelineState");
        }
        if ((i17 & 4) != 0) {
            imageView = null;
        }
        if ((i17 & 8) != 0) {
            str2 = "";
        }
        return ((h83.g) n0Var).Ui(str, kVar, imageView, str2);
    }
}
