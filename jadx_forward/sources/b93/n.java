package b93;

/* loaded from: classes.dex */
public abstract class n {
    public static void a(long j17, long j18, long j19, long j27, long j28) {
        ((ku5.t0) ku5.t0.f394148d).g(new b93.m(j17, j18, j19, j27, j28));
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return str;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return str2 + "\u0000";
        }
        if (str.endsWith("\u0000")) {
            str = str.replace("\u0000", "");
        }
        java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(str.split(","));
        if (P1 != null && P1.contains(str2)) {
            return str.concat("\u0000");
        }
        return str + "," + str2 + "\u0000";
    }

    public static java.lang.String c(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return str;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return "";
        }
        if (str.endsWith("\u0000")) {
            str = str.replace("\u0000", "");
        }
        java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(str.split(","));
        if (!P1.contains(str2)) {
            return str;
        }
        P1.remove(str2);
        return d(P1);
    }

    public static java.lang.String d(java.util.List list) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (list != null && list.size() > 0) {
            int size = list.size();
            for (int i17 = 0; i17 < size; i17++) {
                sb6.append((java.lang.String) list.get(i17));
                if (i17 < size - 1) {
                    sb6.append(",");
                }
            }
            sb6.append("\u0000");
        }
        return sb6.toString();
    }
}
