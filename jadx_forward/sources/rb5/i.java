package rb5;

/* loaded from: classes11.dex */
public class i implements android.view.View.OnApplyWindowInsetsListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rb5.j f475404d;

    public i(rb5.j jVar) {
        this.f475404d = jVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        if (windowInsets == null) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChattingCompat", "OnApplyWindowInsetsListener %s", windowInsets);
        windowInsets.consumeSystemWindowInsets();
        rb5.j jVar = this.f475404d;
        rb5.l lVar = jVar.f475408g;
        windowInsets.getSystemWindowInsetTop();
        android.graphics.Rect rect = new android.graphics.Rect(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        lVar.getClass();
        com.p314xaae8f345.mm.ui.C21374x812c2fd3.FitSystemWindowLayoutView fitSystemWindowLayoutView = jVar.f475406e;
        fitSystemWindowLayoutView.m78431x6229eb06(jVar.f475407f);
        fitSystemWindowLayoutView.fitSystemWindows(rect);
        return windowInsets;
    }
}
