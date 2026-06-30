package hn0;

/* loaded from: classes3.dex */
public interface i {
    static /* synthetic */ void a(hn0.i iVar, int i17, android.os.Bundle bundle, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: callback");
        }
        if ((i18 & 2) != 0) {
            bundle = null;
        }
        iVar.mo57125xf5bc2045(i17, bundle);
    }

    default void b(int i17, r45.fa4 fa4Var) {
    }

    /* renamed from: callback */
    void mo57125xf5bc2045(int i17, android.os.Bundle bundle);
}
