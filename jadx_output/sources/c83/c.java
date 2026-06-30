package c83;

/* loaded from: classes11.dex */
public abstract class c {
    public static boolean a(java.lang.String str) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && str.length() == 10) {
            try {
                int intValue = java.lang.Integer.decode(str).intValue() & 255;
                return intValue >= 0 && intValue <= 31;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Tinker.TinkerUtils", e17, "checkAplhVersion failed.", new java.lang.Object[0]);
            }
        }
        return false;
    }
}
