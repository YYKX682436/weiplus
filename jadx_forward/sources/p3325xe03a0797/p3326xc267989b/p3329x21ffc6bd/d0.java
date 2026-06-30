package p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd;

/* loaded from: classes14.dex */
public abstract class d0 {
    public static final p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.v0 a(yz5.l lVar, java.lang.Object obj, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.v0 v0Var) {
        try {
            lVar.mo146xb9724478(obj);
        } catch (java.lang.Throwable th6) {
            if (v0Var == null || v0Var.getCause() == th6) {
                return new p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.v0("Exception in undelivered element handler for " + obj, th6);
            }
            jz5.a.a(v0Var, th6);
        }
        return v0Var;
    }
}
