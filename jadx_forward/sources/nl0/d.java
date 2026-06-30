package nl0;

/* loaded from: classes13.dex */
public class d extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f419695e;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f419696d;

    static {
        p75.n0 n0Var = dm.u6.D;
        f419695e = new java.lang.String[]{l75.n0.m145250x3fdc6f77(dm.u6.f321857p1, "KeyNodeInfo"), "ALTER TABLE KeyNodeInfo ADD COLUMN predict_type int"};
    }

    public d(l75.k0 k0Var) {
        super(k0Var, dm.u6.f321857p1, "KeyNodeInfo", f419695e);
        this.f419696d = k0Var;
    }

    public dm.u6 y0(java.lang.String str, java.lang.String str2) {
        android.database.Cursor B = this.f419696d.B("select * from KeyNodeInfo where type = '" + str + "' and id = '" + str2 + "'", null);
        try {
            if (!B.moveToFirst()) {
                B.close();
                return null;
            }
            dm.u6 u6Var = new dm.u6();
            u6Var.mo9015xbf5d97fd(B);
            B.close();
            return u6Var;
        } catch (java.lang.Throwable th6) {
            if (B != null) {
                B.close();
            }
            throw th6;
        }
    }

    public boolean z0(dm.u6 u6Var) {
        if (u6Var == null) {
            return false;
        }
        android.content.ContentValues mo9763xeb27878e = u6Var.mo9763xeb27878e();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("type=? and id='");
        sb6.append(u6Var.f68574xc8a07680);
        sb6.append("'");
        return this.f419696d.p("KeyNodeInfo", mo9763xeb27878e, sb6.toString(), new java.lang.String[]{java.lang.String.valueOf(u6Var.f68588x2262335f)}) > 0;
    }
}
