package ju5;

/* loaded from: classes15.dex */
public class l0 implements zt5.n {
    public l0(ju5.n0 n0Var) {
    }

    @Override // zt5.n
    public void a() {
        zt5.h.f("Soter.TaskInit", "soter: on trigger OOM, using wrapper implement", new java.lang.Object[0]);
        android.content.SharedPreferences c17 = fu5.d.b().c();
        if (c17 != null) {
            android.content.SharedPreferences.Editor edit = c17.edit();
            java.lang.String str = ju5.n0.f383662g;
            edit.putInt(str, c17.getInt(str, 0) + 1);
            edit.commit();
        }
    }

    @Override // zt5.n
    public boolean b() {
        android.content.SharedPreferences c17 = fu5.d.b().c();
        if (c17 != null) {
            int i17 = c17.getInt(ju5.n0.f383662g, 0);
            zt5.h.c("Soter.TaskInit", "soter: is triggered OOM: %d", java.lang.Integer.valueOf(i17));
            if (i17 >= 10) {
                return true;
            }
        }
        return false;
    }

    @Override // zt5.n
    /* renamed from: reset */
    public void mo141431x6761d4f() {
        zt5.h.c("Soter.TaskInit", "soter: SoterDelegate reset", new java.lang.Object[0]);
        android.content.SharedPreferences c17 = fu5.d.b().c();
        if (c17 != null) {
            c17.edit().putInt(ju5.n0.f383662g, 0).apply();
        }
    }
}
