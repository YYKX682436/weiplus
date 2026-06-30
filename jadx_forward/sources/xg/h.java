package xg;

/* loaded from: classes7.dex */
public class h implements android.location.LocationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p484x3169fe9e.C4207x94a2927e f535886a;

    public h(com.p314xaae8f345.p484x3169fe9e.C4207x94a2927e c4207x94a2927e) {
        this.f535886a = c4207x94a2927e;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(android.location.Location location) {
        long j17;
        java.lang.String unused;
        java.lang.String unused2;
        com.p314xaae8f345.p484x3169fe9e.C4207x94a2927e c4207x94a2927e = this.f535886a;
        unused = c4207x94a2927e.TAG;
        int i17 = location.getProvider().equals("network") ? 1 : location.getProvider().equals("gps") ? 0 : -1;
        com.p314xaae8f345.p484x3169fe9e.C4207x94a2927e c4207x94a2927e2 = this.f535886a;
        j17 = c4207x94a2927e2.f16182x622dc53;
        c4207x94a2927e2.m34727xda6a6374(j17, location.getLatitude(), location.getLongitude(), location.getAccuracy(), location.getTime(), location.getElapsedRealtimeNanos(), location.getBearing(), location.getSpeed(), i17);
        unused2 = c4207x94a2927e.TAG;
        location.toString();
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(java.lang.String str) {
        java.lang.String unused;
        unused = this.f535886a.TAG;
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(java.lang.String str) {
        java.lang.String unused;
        unused = this.f535886a.TAG;
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(java.lang.String str, int i17, android.os.Bundle bundle) {
        java.lang.String unused;
        unused = this.f535886a.TAG;
    }
}
