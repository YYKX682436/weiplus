package jc3;

/* loaded from: classes7.dex */
public interface i0 {
    static /* synthetic */ void p0(jc3.i0 i0Var, android.app.Activity activity, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: activate");
        }
        if ((i17 & 1) != 0) {
            activity = null;
        }
        i0Var.V(activity);
    }

    void S(jc3.l0 l0Var);

    void V(android.app.Activity activity);

    /* renamed from: deactivate */
    void mo133869x88fbd074();

    void l(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1833x2e06d1.C16422xf998446d c16422xf998446d);

    /* renamed from: pause */
    void mo133870x65825f6();

    /* renamed from: resume */
    void mo133871xc84dc82d();

    void t0(java.lang.String str, yz5.l lVar);
}
