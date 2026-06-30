package mm2;

/* loaded from: classes3.dex */
public final class b5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.e5 f410298d;

    public b5(mm2.e5 e5Var) {
        this.f410298d = e5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mm2.e5 e5Var = this.f410298d;
        synchronized (e5Var) {
            e5Var.f410539m.clear();
        }
    }
}
