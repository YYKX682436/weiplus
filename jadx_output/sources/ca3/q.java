package ca3;

/* loaded from: classes13.dex */
public final class q implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.map.LiteAppMapView f39807d;

    public q(com.tencent.mm.plugin.lite.map.LiteAppMapView liteAppMapView) {
        this.f39807d = liteAppMapView;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        if (!z17) {
            return false;
        }
        double d27 = f18;
        if (d27 == 0.0d) {
            if (((double) f17) == 0.0d) {
                return true;
            }
        }
        java.lang.String str = "GPS";
        if (i17 != 0 && i17 == 1) {
            str = "NETWORK";
        }
        this.f39807d.D = new android.location.Location(str);
        android.location.Location location = this.f39807d.D;
        kotlin.jvm.internal.o.d(location);
        location.setLatitude(d27);
        android.location.Location location2 = this.f39807d.D;
        kotlin.jvm.internal.o.d(location2);
        location2.setLongitude(f17);
        android.location.Location location3 = this.f39807d.D;
        kotlin.jvm.internal.o.d(location3);
        location3.setSpeed((float) d17);
        com.tencent.mm.plugin.lite.map.LiteAppMapView liteAppMapView = this.f39807d;
        if (liteAppMapView.f144104h && !liteAppMapView.G) {
            ((ku5.t0) ku5.t0.f312615d).B(new ca3.p(this.f39807d));
        }
        return true;
    }
}
