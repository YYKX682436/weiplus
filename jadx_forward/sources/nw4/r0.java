package nw4;

/* loaded from: classes8.dex */
public class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f422486d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f422487e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f422488f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nw4.n f422489g;

    public r0(nw4.n nVar, java.util.Map map, java.lang.String str, java.lang.String str2) {
        this.f422489g = nVar;
        this.f422486d = map;
        this.f422487e = str;
        this.f422488f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            java.util.Map map = this.f422486d;
            if (map != null && map.size() != 0) {
                for (java.lang.String str : this.f422486d.keySet()) {
                    com.p314xaae8f345.p3210x3857dc.d.g().b(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E(this.f422487e), str + "=" + ((java.lang.String) this.f422486d.get(str)));
                }
                com.p314xaae8f345.p3210x3857dc.d.g().b(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E(this.f422487e), "httponly");
                com.p314xaae8f345.p3210x3857dc.d.g().mo120241x5d03b04();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandler", "cookies:%s", com.p314xaae8f345.p3210x3857dc.d.g().a(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E(this.f422487e)));
            }
            this.f422489g.f422420a.mo14660x738236e6(java.lang.String.format("javascript:(function(){ window.getA8KeyUrl='%s'; })()", this.f422487e), null);
            this.f422489g.f422420a.mo14660x738236e6("javascript:(function(){ window.isWeixinCached=true; })()", null);
            nw4.n nVar = this.f422489g;
            if (nVar.f422428i) {
                nVar.f422420a.mo14660x738236e6(this.f422488f, null);
                this.f422489g.M = null;
                this.f422489g.N = 0;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "onGetA8KeyUrl fail, ex = %s", e17.getMessage());
        }
    }
}
