package i11;

/* loaded from: classes13.dex */
public class o extends i11.t {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i11.h f368671b;

    public o(i11.h hVar) {
        this.f368671b = hVar;
    }

    @Override // i11.t
    public void a(boolean z17, double d17, double d18, int i17, double d19, double d27, double d28, java.lang.String str, java.lang.String str2, int i18) {
        i11.h.a(this.f368671b, z17, d17, d18, d28, d27, false);
        if (z17) {
            i11.h hVar = this.f368671b;
            hVar.f368635k = d17;
            hVar.f368636l = d18;
            hVar.f368637m = i17;
            hVar.f368638n = d19;
            hVar.f368639o = d27;
            hVar.f368640p = d28;
            hVar.f368641q = str;
            hVar.f368642r = str2;
            hVar.f368643s = i18;
            hVar.f368634j = true;
            hVar.f368633i = false;
            hVar.f368632h = java.lang.System.currentTimeMillis();
            final i11.h hVar2 = this.f368671b;
            hVar2.f368646v = d17;
            hVar2.f368647w = d18;
            hVar2.f368648x = i17;
            hVar2.f368649y = d19;
            hVar2.f368650z = d27;
            hVar2.A = d28;
            hVar2.f368645u = java.lang.System.currentTimeMillis();
            hVar2.f368644t = true;
            ku5.u0 u0Var = ku5.t0.f394148d;
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: i11.h$$a
                @Override // java.lang.Runnable
                public final void run() {
                    i11.h hVar3 = i11.h.this;
                    long j17 = hVar3.f368645u;
                    if (j17 - hVar3.B > 1000) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = hVar3.E;
                        o4Var.B("wgs84_cache_time", j17);
                        o4Var.y("wgs84_latitude", hVar3.f368646v);
                        o4Var.y("wgs84_longitude", hVar3.f368647w);
                        hVar3.B = hVar3.f368645u;
                    }
                }
            };
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.t(runnable, 1000L, "SaveWgs84MMKVCacheTag");
            i11.h.b(this.f368671b, 67591);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationGeo", "onGetLocationWgs84 fLongitude: %f fLatitude:%f locType:%d %f:spped", java.lang.Double.valueOf(d18), java.lang.Double.valueOf(d17), java.lang.Integer.valueOf(i17), java.lang.Double.valueOf(d19));
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50297x7c4d7ca2(new i11.n(this, z17, d17, d18, i17, d19, d27, d28), 200L);
    }
}
