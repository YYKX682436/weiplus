package t2;

/* loaded from: classes12.dex */
public abstract class s {
    public static final java.lang.Object a(wa.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        try {
            if (aVar.isDone()) {
                return t2.j.e(aVar);
            }
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
            aVar.mo606x162a7075(new t2.u(aVar, rVar), t2.q.INSTANCE);
            rVar.m(new t2.r(aVar));
            java.lang.Object j17 = rVar.j();
            pz5.a aVar2 = pz5.a.f440719d;
            return j17;
        } catch (java.util.concurrent.ExecutionException e17) {
            java.lang.Throwable cause = e17.getCause();
            if (cause != null) {
                throw cause;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.n();
            throw null;
        }
    }
}
