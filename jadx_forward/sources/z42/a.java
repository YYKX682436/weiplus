package z42;

/* loaded from: classes15.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final l75.k0 f551626a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f551627b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f551628c;

    public a(l75.k0 k0Var, java.lang.String str, java.util.List list) {
        this.f551626a = k0Var;
        this.f551627b = str;
        this.f551628c = list;
    }

    public boolean a() {
        boolean z17 = false;
        l75.k0 k0Var = this.f551626a;
        if (k0Var != null) {
            java.lang.String str = this.f551627b;
            if (!u46.l.e(str)) {
                java.lang.String c17 = c(str);
                if (u46.l.e(c17)) {
                    return false;
                }
                java.lang.String str2 = "DROP TABLE IF EXISTS " + c17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EdgeComputingDataDao", "[EdgeComputingDataDao] dropTable tableName : %s", c17);
                g42.i.b("EdgeComputingDataDao", "[EdgeComputingDataDao] dropTable tableName : %s, dropSql : %s", c17, str2);
                if (k0Var != null) {
                    long b17 = k0Var.b();
                    try {
                        try {
                            z17 = k0Var.A(c17, str2);
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EdgeComputingDataDao", "[EdgeComputingDataDao] dropTable throw Exception : " + e17.getMessage());
                        }
                    } finally {
                        k0Var.w(java.lang.Long.valueOf(b17));
                    }
                }
            }
        }
        return z17;
    }

    public final java.lang.String b(java.lang.String str) {
        if (u46.l.e(str)) {
            return null;
        }
        return str + "_ ";
    }

    public final java.lang.String c(java.lang.String str) {
        if (u46.l.e(str)) {
            return null;
        }
        return "ec_data_table_" + str;
    }
}
