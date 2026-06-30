package ls5;

/* loaded from: classes10.dex */
public final class c implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f402652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ls5.d f402653e;

    public c(android.view.View view, ls5.d dVar) {
        this.f402652d = view;
        this.f402653e = dVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.View view = this.f402652d;
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        ls5.d dVar = this.f402653e;
        android.app.Activity c17 = dVar.c(view);
        android.view.View rootView = view.getRootView();
        android.view.ViewGroup.LayoutParams layoutParams = rootView != null ? rootView.getLayoutParams() : null;
        android.view.WindowManager.LayoutParams layoutParams2 = layoutParams instanceof android.view.WindowManager.LayoutParams ? (android.view.WindowManager.LayoutParams) layoutParams : null;
        boolean z17 = (layoutParams2 != null ? layoutParams2.type : 0) > 99;
        if (c17 != null) {
            dVar.a(dVar.d(c17));
        } else if (z17) {
            dVar.a("Window");
        } else {
            dVar.a("Unknown");
        }
    }
}
