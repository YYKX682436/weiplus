package vc1;

/* loaded from: classes13.dex */
public class y0 implements o91.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f516752a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26024x5ce381b5 f516753b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f516754c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f516755d;

    public y0(vc1.p1 p1Var, java.lang.String str, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26024x5ce381b5 c26024x5ce381b5, int i17) {
        this.f516755d = p1Var;
        this.f516752a = str;
        this.f516753b = c26024x5ce381b5;
        this.f516754c = i17;
    }

    @Override // o91.c
    public void a(java.io.InputStream inputStream) {
        java.lang.String str = this.f516752a;
        if (inputStream == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Map.DefaultTencentMapView", "addGroundOverlay, openRead failed, url=%s", str);
            return;
        }
        vc1.p1 p1Var = this.f516755d;
        android.graphics.Bitmap i17 = vc1.p1.i(p1Var, inputStream, str, 4000000);
        s46.d.a(inputStream);
        if (i17 == null || i17.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Map.DefaultTencentMapView", "groundOverlay decode bitmap fail");
            return;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e m99335x63040d79 = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26011x93ded50c.m99335x63040d79(i17);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26024x5ce381b5 c26024x5ce381b5 = this.f516753b;
        c26024x5ce381b5.m99445xad38f12f(m99335x63040d79);
        i17.recycle();
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26023x33b6bca9 mo98938x5411a8 = p1Var.f516601e.mo98897xb5885626().mo98938x5411a8(c26024x5ce381b5);
        if (mo98938x5411a8 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Map.DefaultTencentMapView", "addGroundOverlay fail, groundOverlay is null");
            return;
        }
        java.util.HashMap hashMap = p1Var.f516630s0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        int i18 = this.f516754c;
        sb6.append(i18);
        hashMap.put(sb6.toString(), mo98938x5411a8);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "addGroundOverlay success id:%d", java.lang.Integer.valueOf(i18));
    }
}
