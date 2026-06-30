package vc1;

/* loaded from: classes13.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vc1.q2 f516726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o91.d f516727e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f516728f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a f516729g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f516730h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f516731i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f516732m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f516733n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f516734o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f516735p;

    public x(vc1.p1 p1Var, vc1.q2 q2Var, o91.d dVar, java.lang.String str, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a, android.widget.ImageView imageView, android.widget.FrameLayout frameLayout, boolean z17, float f17, float f18) {
        this.f516735p = p1Var;
        this.f516726d = q2Var;
        this.f516727e = dVar;
        this.f516728f = str;
        this.f516729g = interfaceC4409x88f1805a;
        this.f516730h = imageView;
        this.f516731i = frameLayout;
        this.f516732m = z17;
        this.f516733n = f17;
        this.f516734o = f18;
    }

    @Override // java.lang.Runnable
    public void run() {
        vc1.q2 q2Var = this.f516726d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "iconPath is %s", q2Var.f516667e);
        o91.d dVar = this.f516727e;
        if (dVar == null) {
            this.f516735p.T(this.f516728f, this.f516729g, this.f516730h, this.f516731i, this.f516732m);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Map.DefaultTencentMapView", "iconPath is null or imageLoader is null");
        } else {
            java.lang.String str = q2Var.f516667e;
            ((qd.b) dVar).c(str, null, new vc1.w(this, str));
        }
    }
}
