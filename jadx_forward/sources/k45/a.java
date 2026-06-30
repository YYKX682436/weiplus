package k45;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f385637a = new java.util.HashMap();

    public static void a(int i17) {
        java.util.Map map = f385637a;
        int q17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17))) + 1;
        ((java.util.HashMap) map).put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(q17));
    }

    public static java.lang.String b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[a=");
        sb6.append(c01.d9.b() == null ? "0" : "1");
        sb6.append(" ");
        java.lang.String sb7 = sb6.toString();
        if (c01.d9.b() == null) {
            return sb7;
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(sb7);
        sb8.append("c=");
        sb8.append(c01.d9.b().p() == null ? "0" : "1");
        sb8.append(" ");
        java.lang.String sb9 = sb8.toString();
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
        sb10.append(sb9);
        sb10.append("u=");
        sb10.append(gm0.j1.a() ? "1" : "0");
        sb10.append("]");
        return sb10.toString();
    }

    public static void c(java.lang.String str) {
        java.lang.String str2 = str + b();
        java.util.Map map = f385637a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.util.Map.Entry entry : ((java.util.HashMap) map).entrySet()) {
            if (entry != null && entry.getKey() != null && entry.getValue() != null && ((java.lang.Integer) entry.getValue()).intValue() != 0) {
                sb6.append(entry.getKey());
                sb6.append('=');
                sb6.append(entry.getValue());
                sb6.append(',');
            }
        }
        ((java.util.HashMap) map).clear();
        if (sb6.length() > 0) {
            c01.sc.b(10, sb6.toString());
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(str2);
        sb7.append(b());
        try {
            c01.d9.b().p().w(66819, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PostTaskFMessageCardStat", "e:" + e17.getMessage());
        }
    }
}
