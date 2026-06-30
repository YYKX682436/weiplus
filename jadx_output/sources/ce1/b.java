package ce1;

/* loaded from: classes15.dex */
public class b implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f40738d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.d0 f40739e;

    /* renamed from: f, reason: collision with root package name */
    public final int f40740f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f40741g;

    /* renamed from: h, reason: collision with root package name */
    public final org.json.JSONObject f40742h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ce1.c f40743i;

    public b(ce1.c cVar, android.content.Context context, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17, boolean z17, org.json.JSONObject jSONObject) {
        this.f40743i = cVar;
        this.f40738d = context;
        this.f40739e = d0Var;
        this.f40740f = i17;
        this.f40741g = z17;
        this.f40742h = jSONObject;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        android.os.IInterface aVar;
        android.os.IInterface iInterface = null;
        if (this.f40741g) {
            int i17 = lb.k.f317663d;
            if (iBinder != null) {
                android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.nfc.sdk.service.IHwTransitOpenService");
                aVar = (queryLocalInterface == null || !(queryLocalInterface instanceof lb.l)) ? new lb.j(iBinder) : (lb.l) queryLocalInterface;
                iInterface = aVar;
            }
        } else if (!android.text.TextUtils.isEmpty(ce1.c.f40744h)) {
            int i18 = t75.b.f416318d;
            if (iBinder != null) {
                android.os.IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.tencent.mm.sdk.trafficcard.ITencentSmartcardOpenService");
                aVar = (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof t75.c)) ? new t75.a(iBinder) : (t75.c) queryLocalInterface2;
                iInterface = aVar;
            }
        }
        if (iInterface == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new ce1.a(this, iInterface));
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
    }
}
