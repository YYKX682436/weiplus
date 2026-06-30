package x01;

/* loaded from: classes9.dex */
public abstract class b {
    public static java.lang.String a(x01.a aVar) {
        if (aVar == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        java.lang.String str = aVar.f532509e;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append("\n-------------------\n");
        java.lang.String str2 = aVar.f532508d;
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        sb6.append("\n-------------------\n");
        java.lang.String str3 = aVar.f532507c;
        sb6.append(str3 != null ? str3 : "");
        return sb6.toString();
    }

    public static java.lang.String b(x01.a aVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        if (!c01.z1.J(aVar.f532505a)) {
            sb6.append(aVar.f532506b);
            sb6.append(": ");
        }
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f532509e) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f532508d) ? aVar.f532507c : aVar.f532508d : aVar.f532509e);
        return sb6.toString();
    }
}
