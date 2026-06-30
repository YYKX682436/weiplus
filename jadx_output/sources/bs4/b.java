package bs4;

/* loaded from: classes9.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static long f24005a;

    public static void a(java.lang.String str, int i17, int i18) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - f24005a > 1000) {
            f24005a = currentTimeMillis;
            com.tencent.mm.modelbase.m1 m1Var = null;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                if (str.startsWith("sns_aa_")) {
                    m1Var = new bs4.e(str, i17, i18);
                } else if (str.startsWith("sns_tf_")) {
                    m1Var = new bs4.h(str, i17, i18);
                } else if (str.startsWith("sns_ff_")) {
                    m1Var = new bs4.g(str, i17, i18);
                } else if (str.startsWith("sns_")) {
                    m1Var = new bs4.f(str, i17, i18);
                } else if (str.startsWith("ts_")) {
                    m1Var = new bs4.j(str, i17, i18);
                } else if (str.startsWith("up_")) {
                    m1Var = new bs4.k(str, i17, i18);
                } else if (str.startsWith("seb_ff_")) {
                    m1Var = new bs4.d(str, i17, i18);
                } else if (str.startsWith("tax_")) {
                    m1Var = new bs4.i(str, i17, i18);
                } else if (str.startsWith("dc_")) {
                    m1Var = new bs4.c(str, i17, i18);
                }
            }
            if (m1Var != null) {
                gm0.j1.i();
                gm0.j1.n().f273288b.g(m1Var);
            }
        }
    }
}
