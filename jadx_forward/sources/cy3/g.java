package cy3;

/* loaded from: classes10.dex */
public interface g {
    static void a(cy3.g gVar, cy3.e status, android.os.Bundle bundle, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: statusChange");
        }
        cy3.d dVar = (cy3.d) gVar;
        dVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int ordinal = status.ordinal();
        p012xc85e97e9.p093xedfae76a.j0 j0Var = dVar.f306300i;
        if (ordinal == 0) {
            j0Var.mo7808x76db6cb1(cy3.e.f306303d);
        } else if (ordinal == 1) {
            j0Var.mo7808x76db6cb1(cy3.e.f306304e);
        } else {
            if (ordinal != 2) {
                return;
            }
            j0Var.mo7808x76db6cb1(cy3.e.f306305f);
        }
    }
}
