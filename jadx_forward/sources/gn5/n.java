package gn5;

/* loaded from: classes15.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gn5.o f355214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f355215e;

    public n(gn5.o oVar, android.view.View view) {
        this.f355214d = oVar;
        this.f355215e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gn5.o oVar = this.f355214d;
        com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.C22838xaf7a8190 c22838xaf7a8190 = oVar.f355220h;
        if (c22838xaf7a8190 != null) {
            if (c22838xaf7a8190 != null) {
                c22838xaf7a8190.setVisibility(0);
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.C22838xaf7a8190 c22838xaf7a81902 = oVar.f355220h;
            if (c22838xaf7a81902 != null) {
                c22838xaf7a81902.d(this.f355215e);
            }
            android.view.WindowManager windowManager = oVar.f355219g;
            com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.C22838xaf7a8190 c22838xaf7a81903 = oVar.f355220h;
            windowManager.updateViewLayout(c22838xaf7a81903, c22838xaf7a81903 != null ? c22838xaf7a81903.getF295229n() : null);
        }
    }
}
