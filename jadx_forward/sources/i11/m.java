package i11;

/* loaded from: classes13.dex */
public class m extends i11.s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i11.h f368662b;

    public m(i11.h hVar) {
        this.f368662b = hVar;
    }

    @Override // i11.s
    public void a(boolean z17, double d17, double d18, int i17, double d19, double d27, double d28, java.lang.String str, java.lang.String str2, int i18) {
        i11.h.a(this.f368662b, z17, d17, d18, d28, d27, true);
        if (z17) {
            i11.h hVar = this.f368662b;
            hVar.f368635k = d17;
            hVar.f368636l = d18;
            hVar.f368637m = i17;
            hVar.f368638n = d19;
            hVar.f368639o = d27;
            hVar.f368640p = d28;
            hVar.f368641q = str;
            hVar.f368642r = str2;
            hVar.f368643s = i18;
            hVar.f368632h = java.lang.System.currentTimeMillis();
            hVar.f368633i = true;
            hVar.f368634j = false;
            i11.h.b(hVar, 67592);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationGeo", "onGetLocation fLongitude: %f fLatitude:%f locType:%d %f:spped", java.lang.Double.valueOf(d18), java.lang.Double.valueOf(d17), java.lang.Integer.valueOf(i17), java.lang.Double.valueOf(d19));
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new i11.l(this, z17, d17, d18, i17, d19, d27, d28));
    }

    @Override // com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4219xb9b728ce
    /* renamed from: onStatusUpdate */
    public void mo34914xf54242da(java.lang.String str, int i17, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationGeo", "onStatusUpdate name %s, status %d", str, java.lang.Integer.valueOf(i17));
    }
}
