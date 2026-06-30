package be1;

/* loaded from: classes7.dex */
public class t implements be1.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f19506a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f19507b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f19508c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ be1.z f19509d;

    public t(be1.z zVar, java.util.Map map, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f19509d = zVar;
        this.f19506a = map;
        this.f19507b = lVar;
        this.f19508c = i17;
    }

    @Override // be1.v
    public void a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetNetworkType", "onGetSignalStrength, dbm: " + i17);
        java.util.Map map = this.f19506a;
        if (Integer.MAX_VALUE != i17) {
            map.put("signalStrength", java.lang.Integer.valueOf(i17));
        }
        this.f19507b.a(this.f19508c, this.f19509d.p("ok", map));
    }
}
