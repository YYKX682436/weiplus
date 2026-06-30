package gf;

/* loaded from: classes7.dex */
public final class b implements com.p314xaae8f345.p2936x80def495.jni.InterfaceC25590x8820556a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 f352554a;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 f0Var) {
        this.f352554a = f0Var;
    }

    @Override // com.p314xaae8f345.p2936x80def495.jni.InterfaceC25590x8820556a
    /* renamed from: checkAndPost */
    public final void mo95901xc8fb3cef(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 f0Var = this.f352554a;
        if (f0Var.g()) {
            runnable.run();
        } else {
            f0Var.mo51545x3498a0(runnable);
        }
    }
}
