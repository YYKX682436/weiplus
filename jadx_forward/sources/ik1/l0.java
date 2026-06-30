package ik1;

/* loaded from: classes7.dex */
public abstract class l0 {
    public static java.lang.String a(android.content.Context context, java.lang.String str, ik1.k0 k0Var) {
        java.lang.String str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Luggage.UserAgentUtil, appendUserAgent fail, context is null, stack = ");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        boolean z18 = false;
        iz5.a.g(sb6.toString(), context != null);
        if (k0Var != null) {
            if (str == null) {
                str2 = k0Var.mo49172xf7e870be();
            } else {
                str2 = str + k0Var.mo49172xf7e870be();
            }
            str = str2 + k0Var.mo32090x14f51cd8();
        }
        java.lang.String str3 = (str + " NetType/" + com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40061x1de3608b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) + " Language/" + com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(str3);
        sb7.append(" ABI/");
        java.lang.String[] strArr = android.os.Build.SUPPORTED_64_BIT_ABIS;
        int length = strArr.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                break;
            }
            if ("arm64-v8a".equalsIgnoreCase(strArr[i17])) {
                z18 = true;
                break;
            }
            i17++;
        }
        sb7.append(z18 ? "arm64" : "arm32");
        java.lang.String sb8 = sb7.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.UserAgentUtil", "appendUserAgent, uaStr = " + sb8);
        return sb8.replace('\n', ' ');
    }
}
