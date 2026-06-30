package n90;

/* loaded from: classes4.dex */
public class n1 implements tg3.b1 {
    @Override // tg3.b1
    public java.lang.String Bb(java.util.Map map, java.lang.String str, android.os.Bundle bundle) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str2 = (java.lang.String) map.get(str + ".separator");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "、";
        }
        int i17 = 0;
        while (true) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str);
            sb7.append(".memberlist.member");
            sb7.append(i17 != 0 ? java.lang.Integer.valueOf(i17) : "");
            java.lang.String sb8 = sb7.toString();
            if (map.get(sb8) == null) {
                return sb6.toString();
            }
            if (i17 != 0) {
                sb6.append(str2);
            }
            java.lang.String str3 = (java.lang.String) map.get(sb8 + ".nickname");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("HandleProfileDigestListener", "hy: can not resolve username or nickname");
            } else {
                sb6.append(str3);
            }
            i17++;
        }
    }
}
