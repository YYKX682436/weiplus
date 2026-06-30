package vc1;

/* loaded from: classes13.dex */
public class z0 implements o91.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f516759a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26023x33b6bca9 f516760b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f516761c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f516762d;

    public z0(vc1.p1 p1Var, java.lang.String str, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26023x33b6bca9 interfaceC26023x33b6bca9, int i17) {
        this.f516762d = p1Var;
        this.f516759a = str;
        this.f516760b = interfaceC26023x33b6bca9;
        this.f516761c = i17;
    }

    @Override // o91.c
    public void a(java.io.InputStream inputStream) {
        java.lang.String str = this.f516759a;
        if (inputStream == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Map.DefaultTencentMapView", "updateGroundOverlay, openRead failed, url=%s", str);
            return;
        }
        android.graphics.Bitmap i17 = vc1.p1.i(this.f516762d, inputStream, str, 4000000);
        s46.d.a(inputStream);
        if (i17 == null || i17.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Map.DefaultTencentMapView", "updateGroundOverlay decode bitmap fail");
            return;
        }
        this.f516760b.mo36863x5854831(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26011x93ded50c.m99335x63040d79(i17));
        i17.recycle();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "updateGroundOverlay success id:%d", java.lang.Integer.valueOf(this.f516761c));
    }
}
