package be1;

/* loaded from: classes7.dex */
public class t implements be1.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f101039a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f101040b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f101041c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ be1.z f101042d;

    public t(be1.z zVar, java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f101042d = zVar;
        this.f101039a = map;
        this.f101040b = lVar;
        this.f101041c = i17;
    }

    @Override // be1.v
    public void a(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetNetworkType", "onGetSignalStrength, dbm: " + i17);
        java.util.Map map = this.f101039a;
        if (Integer.MAX_VALUE != i17) {
            map.put("signalStrength", java.lang.Integer.valueOf(i17));
        }
        this.f101040b.a(this.f101041c, this.f101042d.p("ok", map));
    }
}
