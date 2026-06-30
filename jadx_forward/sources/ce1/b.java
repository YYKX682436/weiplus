package ce1;

/* loaded from: classes15.dex */
public class b implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f122271d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 f122272e;

    /* renamed from: f, reason: collision with root package name */
    public final int f122273f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f122274g;

    /* renamed from: h, reason: collision with root package name */
    public final org.json.JSONObject f122275h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ce1.c f122276i;

    public b(ce1.c cVar, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, int i17, boolean z17, org.json.JSONObject jSONObject) {
        this.f122276i = cVar;
        this.f122271d = context;
        this.f122272e = d0Var;
        this.f122273f = i17;
        this.f122274g = z17;
        this.f122275h = jSONObject;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        android.os.IInterface aVar;
        android.os.IInterface iInterface = null;
        if (this.f122274g) {
            int i17 = lb.k.f399196d;
            if (iBinder != null) {
                android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.nfc.sdk.service.IHwTransitOpenService");
                aVar = (queryLocalInterface == null || !(queryLocalInterface instanceof lb.l)) ? new lb.j(iBinder) : (lb.l) queryLocalInterface;
                iInterface = aVar;
            }
        } else if (!android.text.TextUtils.isEmpty(ce1.c.f122277h)) {
            int i18 = t75.b.f497851d;
            if (iBinder != null) {
                android.os.IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.tencent.mm.sdk.trafficcard.ITencentSmartcardOpenService");
                aVar = (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof t75.c)) ? new t75.a(iBinder) : (t75.c) queryLocalInterface2;
                iInterface = aVar;
            }
        }
        if (iInterface == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new ce1.a(this, iInterface));
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
    }
}
