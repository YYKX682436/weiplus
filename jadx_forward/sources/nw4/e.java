package nw4;

/* loaded from: classes.dex */
public interface e {
    default void a(nw4.y2 y2Var, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("retCode", -1);
        hashMap.put("err_code", -1);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            e(y2Var.f422546c, y2Var.f422552i + ":fail", hashMap);
            return;
        }
        e(y2Var.f422546c, y2Var.f422552i + ":fail " + str, hashMap);
    }

    void e(java.lang.String str, java.lang.String str2, java.util.Map map);
}
