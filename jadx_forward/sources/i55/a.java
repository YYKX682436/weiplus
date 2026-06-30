package i55;

/* loaded from: classes8.dex */
public final class a implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i55.b f370363d;

    public a(i55.b bVar) {
        this.f370363d = bVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        i55.b.d(this.f370363d, "layoutChangeListener", java.lang.System.currentTimeMillis(), view, false, 8, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRedDotExposureMonitorLogic", "layoutChangeListener viewHC = " + view.hashCode());
    }
}
