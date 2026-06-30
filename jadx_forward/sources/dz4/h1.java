package dz4;

/* loaded from: classes5.dex */
public final class h1 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.gb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dz4.k1 f326809a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dz4.q0 f326810b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f326811c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib f326812d;

    public h1(dz4.k1 k1Var, dz4.q0 q0Var, int i17, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib ibVar) {
        this.f326809a = k1Var;
        this.f326810b = q0Var;
        this.f326811c = i17;
        this.f326812d = ibVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.gb
    public void a() {
        dz4.k1 k1Var = this.f326809a;
        java.lang.ref.WeakReference weakReference = ((ez4.u) k1Var.f326850a).f339477c;
        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(k1Var.f326851b, "onClearBtnDown: activity invalid");
        } else {
            k1Var.b(this.f326810b, this.f326811c);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.gb
    public void b(java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        dz4.k1 k1Var = this.f326809a;
        java.lang.ref.WeakReference weakReference = ((ez4.u) k1Var.f326850a).f339477c;
        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(k1Var.f326851b, "onSendMsg: activity invalid");
            return;
        }
        java.lang.String str = k1Var.f326851b;
        k1Var.c(new dz4.g1(this.f326810b, text));
        this.f326812d.n();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.gb
    public void c(boolean z17) {
    }
}
