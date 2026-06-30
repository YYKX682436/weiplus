package a52;

/* loaded from: classes15.dex */
public class c implements f52.e {
    public void a(r45.b2 b2Var, r45.b2 b2Var2) {
        r45.bn6 bn6Var;
        if (b2Var == null) {
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = b2Var.f451967d.f452433d;
        objArr[1] = b2Var2 == null ? "NULL" : b2Var2.f451967d.f452433d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellhoundService", "Stack, onPopWithSlience: %s, %s", objArr);
        t52.a aVar = t52.a.f497242a;
        r45.bn6 bn6Var2 = b2Var.f451967d;
        aVar.c(bn6Var2.f452433d, bn6Var2.f452435f, t52.h.f497249f);
        v52.c.g().j(null, b2Var, 2, b2Var2);
        e62.q.a().d(3, b2Var.f451967d.f452433d, null);
        e42.j0 j0Var = a52.f.f83120d;
        if (j0Var == null || (bn6Var = b2Var.f451967d) == null) {
            return;
        }
        j0Var.f(bn6Var.f452434e);
    }

    public void b(r45.b2 b2Var, r45.b2 b2Var2) {
        if (b2Var == null) {
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        r45.bn6 bn6Var = b2Var.f451967d;
        objArr[0] = bn6Var.f452433d;
        objArr[1] = java.lang.Long.valueOf(bn6Var.f452435f);
        objArr[2] = b2Var2 == null ? "NULL" : b2Var2.f451967d.f452433d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellhoundService", "onPushStackAsync: %s, %s, %s", objArr);
        v52.c.g().j(null, b2Var, 0, b2Var2);
        e42.j0 j0Var = a52.f.f83120d;
        if (j0Var == null || b2Var.f451967d == null) {
            return;
        }
        j0Var.n(null);
    }
}
