package i22;

/* loaded from: classes15.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i22.j0 f369512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f369513e;

    public h0(i22.j0 j0Var, java.util.List list) {
        this.f369512d = j0Var;
        this.f369513e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i22.j0 j0Var = this.f369512d;
        j0Var.f369525o.f369500e.clear();
        j0Var.f369525o.f369500e.addAll(this.f369513e);
        j0Var.f369525o.m8146xced61ae5();
    }
}
