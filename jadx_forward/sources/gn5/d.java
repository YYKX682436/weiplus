package gn5;

/* loaded from: classes15.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gn5.e f355199d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f355200e;

    public d(gn5.e eVar, android.view.View view) {
        this.f355199d = eVar;
        this.f355200e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gn5.e eVar = this.f355199d;
        com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.C22838xaf7a8190 c22838xaf7a8190 = eVar.f355205h;
        if (c22838xaf7a8190 != null) {
            if (c22838xaf7a8190 != null) {
                c22838xaf7a8190.setVisibility(0);
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.C22838xaf7a8190 c22838xaf7a81902 = eVar.f355205h;
            if (c22838xaf7a81902 != null) {
                c22838xaf7a81902.d(this.f355200e);
            }
            android.view.WindowManager windowManager = eVar.f355204g;
            com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.C22838xaf7a8190 c22838xaf7a81903 = eVar.f355205h;
            windowManager.updateViewLayout(c22838xaf7a81903, c22838xaf7a81903 != null ? c22838xaf7a81903.getF295229n() : null);
        }
    }
}
