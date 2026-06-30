package dz4;

/* loaded from: classes12.dex */
public final class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f326704d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dz4.d2 f326705e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dz4.g2 f326706f;

    public b2(android.app.Dialog dialog, dz4.d2 d2Var, dz4.g2 g2Var) {
        this.f326704d = dialog;
        this.f326705e = d2Var;
        this.f326706f = g2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f326704d.dismiss();
        this.f326705e.j(this.f326706f.f326787a);
    }
}
