package rp0;

/* loaded from: classes7.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rp0.e f479869d;

    public a(rp0.e eVar) {
        this.f479869d = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rp0.e eVar = this.f479869d;
        jc3.j0 j0Var = ((mc3.f) eVar.f479874a).f407168q;
        if (j0Var != null) {
            ((rc3.w0) j0Var).m162152x65825f6();
        }
        eVar.f479880g = null;
    }
}
