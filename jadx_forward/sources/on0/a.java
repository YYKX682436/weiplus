package on0;

/* loaded from: classes3.dex */
public final class a implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f428292d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ on0.b f428293e;

    public a(android.view.View view, on0.b bVar) {
        this.f428292d = view;
        this.f428293e = bVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.View view = this.f428292d;
        android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        if (view.getWidth() > 0 && view.getHeight() > 0) {
            this.f428293e.c(view.getWidth(), view.getHeight());
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiveVisitorScaleManager", "bindAnimateView view: " + view + ", width: " + view.getWidth() + ", height: " + view.getHeight());
    }
}
