package u91;

/* loaded from: classes4.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u91.b f507349d;

    public a(u91.b bVar) {
        this.f507349d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DirectGame.AppBrandDirectGameCoverViewContainer", "destroy");
        u91.b bVar = this.f507349d;
        bVar.setVisibility(8);
        android.view.ViewParent parent = bVar.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(bVar);
        }
    }
}
