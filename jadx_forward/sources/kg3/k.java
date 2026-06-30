package kg3;

/* loaded from: classes12.dex */
public final class k implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f389249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f389250e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kg3.n f389251f;

    public k(android.view.View view, android.app.Activity activity, kg3.n nVar) {
        this.f389249d = view;
        this.f389250e = activity;
        this.f389251f = nVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f389249d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        android.app.Activity activity = this.f389250e;
        boolean isFinishing = activity.isFinishing();
        kg3.n nVar = this.f389251f;
        if (isFinishing || activity.isDestroyed()) {
            nVar.getClass();
            return;
        }
        nVar.getClass();
        kg3.d dVar = nVar.f389255b;
        if (dVar != null) {
            dVar.H2();
        }
    }
}
