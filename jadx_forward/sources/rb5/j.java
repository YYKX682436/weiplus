package rb5;

/* loaded from: classes11.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int[] f475405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21374x812c2fd3.FitSystemWindowLayoutView f475406e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f475407f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rb5.l f475408g;

    public j(rb5.l lVar, int[] iArr, com.p314xaae8f345.mm.ui.C21374x812c2fd3.FitSystemWindowLayoutView fitSystemWindowLayoutView, android.view.ViewGroup viewGroup) {
        this.f475408g = lVar;
        this.f475405d = iArr;
        this.f475406e = fitSystemWindowLayoutView;
        this.f475407f = viewGroup;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View j17 = this.f475408g.f475414e.j();
        int[] iArr = this.f475405d;
        j17.getLocationInWindow(iArr);
        int i17 = iArr[1];
        com.p314xaae8f345.mm.ui.C21374x812c2fd3.FitSystemWindowLayoutView fitSystemWindowLayoutView = this.f475406e;
        if (i17 <= 0) {
            fitSystemWindowLayoutView.setOnApplyWindowInsetsListener(new rb5.i(this));
            return;
        }
        android.graphics.Rect rect = new android.graphics.Rect(0, i17, 0, 0);
        fitSystemWindowLayoutView.m78431x6229eb06(this.f475407f);
        fitSystemWindowLayoutView.fitSystemWindows(rect);
    }
}
