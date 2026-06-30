package pn0;

/* loaded from: classes14.dex */
public class d implements android.view.SurfaceHolder.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn0.e f438482d;

    public d(pn0.e eVar) {
        this.f438482d = eVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
        android.view.Surface surface = surfaceHolder.getSurface();
        pn0.e eVar = this.f438482d;
        eVar.f438484m = surface;
        eVar.u(i18, i19);
        eVar.f438477h = true;
        eVar.f438478i = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar.f438483l, "surfaceChanged " + surfaceHolder.getSurface() + " format = " + i17 + " width = " + i18 + " height = " + i19);
        eVar.f438479j.Gg(eVar);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f438482d.f438483l, "surfaceCreated " + surfaceHolder.getSurface());
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        pn0.e eVar = this.f438482d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar.f438483l, "surfaceDestroyed = " + surfaceHolder.getSurface());
        eVar.f438478i = true;
        eVar.f438479j.O2(eVar);
    }
}
