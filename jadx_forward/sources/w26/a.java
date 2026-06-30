package w26;

/* loaded from: classes14.dex */
public abstract class a {
    public static final void a(yz5.p pVar, java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 completion) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(completion, "completion");
        try {
            p3321xbce91901.jvm.p3324x21ffc6bd.m0.e(pVar, 2);
            java.lang.Object mo149xb9724478 = pVar.mo149xb9724478(obj, completion);
            if (mo149xb9724478 != pz5.a.f440719d) {
                completion.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(mo149xb9724478));
            }
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            completion.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6)));
        }
    }

    public static final java.lang.Object b(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.h0 h0Var, java.lang.Object obj, yz5.p pVar) {
        java.lang.Object e0Var;
        java.lang.Object V;
        try {
            p3321xbce91901.jvm.p3324x21ffc6bd.m0.e(pVar, 2);
            e0Var = pVar.mo149xb9724478(obj, h0Var);
        } catch (java.lang.Throwable th6) {
            e0Var = new p3325xe03a0797.p3326xc267989b.e0(th6, false, 2, null);
        }
        pz5.a aVar = pz5.a.f440719d;
        if (e0Var == aVar || (V = h0Var.V(e0Var)) == p3325xe03a0797.p3326xc267989b.d3.f391695b) {
            return aVar;
        }
        if (V instanceof p3325xe03a0797.p3326xc267989b.e0) {
            throw ((p3325xe03a0797.p3326xc267989b.e0) V).f391705a;
        }
        return p3325xe03a0797.p3326xc267989b.d3.a(V);
    }
}
