package dg1;

/* loaded from: classes7.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dg1.g f313799d;

    public a(dg1.g gVar) {
        this.f313799d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f313799d.f313815m == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SameLayer.AppBrandMapPluginHandler", "mSameLayerMapView is null, may be not insert");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandMapPluginHandler", "onSurfaceChange");
            this.f313799d.f313815m.b(this.f313799d.f313814i);
        }
    }
}
