package dr4;

/* loaded from: classes14.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.c0 f324274d;

    public t(dr4.c0 c0Var) {
        this.f324274d = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dr4.c0 c0Var = this.f324274d;
        yz5.l lVar = c0Var.f324142l;
        if (lVar != null) {
            lVar.mo146xb9724478(c0Var);
        }
    }
}
