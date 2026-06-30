package qo0;

/* loaded from: classes3.dex */
public interface c {
    static /* synthetic */ void a(qo0.c cVar, qo0.b bVar, android.os.Bundle bundle, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: statusChange");
        }
        if ((i17 & 2) != 0) {
            bundle = null;
        }
        cVar.mo46557x60d69242(bVar, bundle);
    }

    /* renamed from: getLiveRole */
    int mo11219xd0598cf8();

    /* renamed from: isLiving */
    default boolean mo57482xe6773473() {
        return true;
    }

    /* renamed from: registerPlugin */
    void mo46553xddc5c3b6(qo0.a aVar);

    /* renamed from: statusChange */
    void mo46557x60d69242(qo0.b bVar, android.os.Bundle bundle);
}
