package kg3;

/* loaded from: classes12.dex */
public final class j implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f389246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f389247e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kg3.n f389248f;

    public j(android.view.View view, android.app.Activity activity, kg3.n nVar) {
        this.f389246d = view;
        this.f389247e = activity;
        this.f389248f = nVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f389246d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        android.app.Activity activity = this.f389247e;
        boolean isFinishing = activity.isFinishing();
        kg3.n nVar = this.f389248f;
        if (isFinishing || activity.isDestroyed()) {
            nVar.getClass();
            return;
        }
        int B = i65.a.B(activity);
        int k17 = i65.a.k(activity);
        nVar.getClass();
        kg3.d dVar = nVar.f389255b;
        if ((B > k17 || !nVar.b(activity)) && !(fp.h.c(24) && activity.isInMultiWindowMode())) {
            if (dVar != null) {
                dVar.h4();
            }
        } else if (dVar != null) {
            dVar.H2();
        }
    }
}
