package dz4;

/* loaded from: classes12.dex */
public final class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f326760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dz4.f2 f326761e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dz4.g2 f326762f;

    public e2(android.app.Dialog dialog, dz4.f2 f2Var, dz4.g2 g2Var) {
        this.f326760d = dialog;
        this.f326761e = f2Var;
        this.f326762f = g2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f326760d.dismiss();
        this.f326761e.j(this.f326762f.f326787a);
    }
}
