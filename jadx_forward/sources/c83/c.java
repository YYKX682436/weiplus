package c83;

/* loaded from: classes11.dex */
public abstract class c {
    public static boolean a(java.lang.String str) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && str.length() == 10) {
            try {
                int intValue = java.lang.Integer.decode(str).intValue() & 255;
                return intValue >= 0 && intValue <= 31;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Tinker.TinkerUtils", e17, "checkAplhVersion failed.", new java.lang.Object[0]);
            }
        }
        return false;
    }
}
