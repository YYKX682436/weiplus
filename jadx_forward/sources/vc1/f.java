package vc1;

/* loaded from: classes13.dex */
public class f implements o91.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f516495a;

    public f(vc1.p1 p1Var) {
        this.f516495a = p1Var;
    }

    @Override // o91.b
    public void a(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Map.DefaultTencentMapView", "setMapLocMarkerIcon load bitmap is null");
            return;
        }
        vc1.p1 p1Var = this.f516495a;
        vc1.c3 c3Var = p1Var.f516598c0;
        if (c3Var == null || c3Var.m171458x6c59636e() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Map.DefaultTencentMapView", "setMapLocMarkerIcon mapLocationPoint is null");
        } else {
            p1Var.f516598c0.m171458x6c59636e().mo37254x764b6bfb(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4393x93ded50c.m37090x63040d79(bitmap));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "setMapLocMarkerIcon success");
        }
    }
}
