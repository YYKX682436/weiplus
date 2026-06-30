package fv3;

/* loaded from: classes5.dex */
public interface c {
    static /* synthetic */ void a(fv3.c cVar, fv3.d dVar, android.os.Bundle bundle, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: statusChange");
        }
        if ((i17 & 2) != 0) {
            bundle = null;
        }
        cVar.j(dVar, bundle);
    }

    void j(fv3.d dVar, android.os.Bundle bundle);
}
