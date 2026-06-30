package c62;

/* loaded from: classes15.dex */
public abstract class d {
    public static r45.n33 a() {
        byte[] a17 = c52.c.a("mmkv_key_hell_floatS");
        if (a17 != null && a17.length > 0) {
            r45.n33 n33Var = new r45.n33();
            try {
                n33Var.parseFrom(a17);
                return n33Var;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.FloatSessionDao", e17, "FloatSessionDao._read: %s", e17.getMessage());
            }
        }
        return null;
    }

    public static void b(r45.n33 n33Var) {
        if (n33Var == null) {
            return;
        }
        try {
            c52.c.d("mmkv_key_hell_floatS", n33Var.toByteArray());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.FloatSessionDao", e17, "FloatSessionDao._writeBack: %s", e17.getMessage());
        }
    }

    public static android.util.Pair c() {
        r45.n33 a17 = a();
        if (a17 == null) {
            return null;
        }
        return android.util.Pair.create(java.lang.Integer.valueOf(a17.f381044f), java.lang.Integer.valueOf(a17.f381045g));
    }

    public static void d(int i17, int i18) {
        r45.n33 a17 = a();
        if (a17 == null) {
            a17 = new r45.n33();
        }
        if (i17 != -1) {
            a17.f381044f = i17;
        }
        if (i18 != -1) {
            a17.f381045g = i18;
        }
        b(a17);
    }
}
