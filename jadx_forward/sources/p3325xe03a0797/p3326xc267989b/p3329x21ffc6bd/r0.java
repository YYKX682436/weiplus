package p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd;

/* loaded from: classes14.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 f392056a = new p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0("NO_THREAD_ELEMENTS");

    public static final void a(oz5.l lVar, java.lang.Object obj) {
        if (obj == f392056a) {
            return;
        }
        if (!(obj instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.u0)) {
            java.lang.Object mo7093x300c01 = lVar.mo7093x300c01(null, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.p0.f392048d);
            if (mo7093x300c01 == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            }
            ((p3325xe03a0797.p3326xc267989b.v0) ((p3325xe03a0797.p3326xc267989b.u3) mo7093x300c01)).D(lVar, obj);
            return;
        }
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.u0 u0Var = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.u0) obj;
        p3325xe03a0797.p3326xc267989b.u3[] u3VarArr = u0Var.f392064c;
        int length = u3VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i17 = length - 1;
            p3325xe03a0797.p3326xc267989b.u3 u3Var = u3VarArr[length];
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u3Var);
            ((p3325xe03a0797.p3326xc267989b.v0) u3Var).D(lVar, u0Var.f392063b[length]);
            if (i17 < 0) {
                return;
            } else {
                length = i17;
            }
        }
    }

    public static final java.lang.Object b(oz5.l lVar) {
        java.lang.Object mo7093x300c01 = lVar.mo7093x300c01(0, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.o0.f392045d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7093x300c01);
        return mo7093x300c01;
    }

    public static final java.lang.Object c(oz5.l lVar, java.lang.Object obj) {
        if (obj == null) {
            obj = b(lVar);
        }
        return obj == 0 ? f392056a : obj instanceof java.lang.Integer ? lVar.mo7093x300c01(new p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.u0(lVar, ((java.lang.Number) obj).intValue()), p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.q0.f392052d) : ((p3325xe03a0797.p3326xc267989b.v0) ((p3325xe03a0797.p3326xc267989b.u3) obj)).F(lVar);
    }
}
