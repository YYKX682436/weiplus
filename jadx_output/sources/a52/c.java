package a52;

/* loaded from: classes15.dex */
public class c implements f52.e {
    public void a(r45.b2 b2Var, r45.b2 b2Var2) {
        r45.bn6 bn6Var;
        if (b2Var == null) {
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = b2Var.f370434d.f370900d;
        objArr[1] = b2Var2 == null ? "NULL" : b2Var2.f370434d.f370900d;
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellhoundService", "Stack, onPopWithSlience: %s, %s", objArr);
        t52.a aVar = t52.a.f415709a;
        r45.bn6 bn6Var2 = b2Var.f370434d;
        aVar.c(bn6Var2.f370900d, bn6Var2.f370902f, t52.h.f415716f);
        v52.c.g().j(null, b2Var, 2, b2Var2);
        e62.q.a().d(3, b2Var.f370434d.f370900d, null);
        e42.j0 j0Var = a52.f.f1587d;
        if (j0Var == null || (bn6Var = b2Var.f370434d) == null) {
            return;
        }
        j0Var.f(bn6Var.f370901e);
    }

    public void b(r45.b2 b2Var, r45.b2 b2Var2) {
        if (b2Var == null) {
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        r45.bn6 bn6Var = b2Var.f370434d;
        objArr[0] = bn6Var.f370900d;
        objArr[1] = java.lang.Long.valueOf(bn6Var.f370902f);
        objArr[2] = b2Var2 == null ? "NULL" : b2Var2.f370434d.f370900d;
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellhoundService", "onPushStackAsync: %s, %s, %s", objArr);
        v52.c.g().j(null, b2Var, 0, b2Var2);
        e42.j0 j0Var = a52.f.f1587d;
        if (j0Var == null || b2Var.f370434d == null) {
            return;
        }
        j0Var.n(null);
    }
}
