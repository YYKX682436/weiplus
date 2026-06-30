package f0;

/* loaded from: classes5.dex */
public abstract class r0 {
    public static void a(f0.t0 t0Var, java.lang.Object obj, yz5.l lVar, java.lang.Object obj2, yz5.q content, int i17, java.lang.Object obj3) {
        if (obj3 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i17 & 1) != 0) {
            obj = null;
        }
        if ((i17 & 2) != 0) {
            lVar = null;
        }
        if ((i17 & 4) != 0) {
            obj2 = null;
        }
        f0.z0 z0Var = (f0.z0) t0Var;
        z0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        z0Var.f339814a.a(1, new f0.j(obj != null ? new f0.v0(obj) : null, lVar != null ? new f0.w0(lVar) : z0Var.f339816c, new f0.x0(obj2), u0.j.c(776471267, true, new f0.y0(content))));
        if (lVar != null) {
            z0Var.f339815b = true;
        }
    }

    public static /* synthetic */ void b(f0.t0 t0Var, int i17, yz5.l lVar, yz5.p pVar, yz5.l lVar2, yz5.r rVar, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        yz5.l lVar3 = (i18 & 2) != 0 ? null : lVar;
        yz5.p pVar2 = (i18 & 4) != 0 ? null : pVar;
        if ((i18 & 8) != 0) {
            lVar2 = f0.s0.f339760d;
        }
        ((f0.z0) t0Var).a(i17, lVar3, pVar2, lVar2, rVar);
    }
}
