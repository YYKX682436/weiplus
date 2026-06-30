package c01;

/* loaded from: classes7.dex */
public class n2 {

    /* renamed from: b, reason: collision with root package name */
    public static volatile c01.n2 f118874b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f118875a = new c01.k2(null);

    public static java.lang.String a(java.lang.String str) {
        return "SessionId@" + str + "#" + java.lang.System.nanoTime();
    }

    public static c01.n2 d() {
        if (f118874b == null) {
            synchronized (c01.n2.class) {
                if (f118874b == null) {
                    f118874b = new c01.n2();
                }
            }
        }
        return f118874b;
    }

    public c01.l2 b(java.lang.String str) {
        c01.m2 m2Var = (c01.m2) ((c01.k2) this.f118875a).get(str);
        if (m2Var != null) {
            return m2Var.f118855a;
        }
        return null;
    }

    public c01.l2 c(java.lang.String str, boolean z17) {
        java.util.Map map = this.f118875a;
        c01.m2 m2Var = (c01.m2) ((c01.k2) map).get(str);
        if (m2Var == null) {
            if (!z17) {
                return null;
            }
            m2Var = new c01.m2();
            ((c01.k2) map).put(str, m2Var);
        }
        return m2Var.f118855a;
    }

    public c01.l2 e(java.lang.String str) {
        c01.m2 m2Var = (c01.m2) ((c01.k2) this.f118875a).remove(str);
        if (m2Var != null) {
            return m2Var.f118855a;
        }
        return null;
    }

    /* renamed from: toString */
    public java.lang.String m13882x9616526c() {
        c01.m2 m2Var;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("DataCenter \nDataStore size : ");
        java.util.Map map = this.f118875a;
        sb6.append(((java.util.concurrent.ConcurrentHashMap) map).size());
        java.util.LinkedHashSet<java.util.Map.Entry> linkedHashSet = new java.util.LinkedHashSet(((java.util.concurrent.ConcurrentHashMap) map).entrySet());
        for (java.util.Map.Entry entry : linkedHashSet) {
            if (entry != null && (m2Var = (c01.m2) entry.getValue()) != null) {
                sb6.append("\nDataStore id : ");
                sb6.append((java.lang.String) entry.getKey());
                sb6.append(", CT : ");
                long j17 = m2Var.f118856b;
                sb6.append(j17);
                sb6.append("ms, TTL : ");
                sb6.append((currentTimeMillis - j17) / 1000);
                sb6.append("s");
            }
        }
        linkedHashSet.clear();
        return sb6.toString();
    }
}
