package h63;

/* loaded from: classes7.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f360742e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f360743f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h63.v0 f360744g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f360745h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h63.l1 f360746i;

    public b0(java.lang.String str, int i17, android.content.Context context, h63.v0 v0Var, int i18, h63.l1 l1Var) {
        this.f360741d = str;
        this.f360742e = i17;
        this.f360743f = context;
        this.f360744g = v0Var;
        this.f360745h = i18;
        this.f360746i = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveAppbrandProcessService", "zbql:exitGameLive from js or menu");
        if (((p60.u) i95.n0.c(p60.u.class)).Bi(this.f360741d, this.f360742e).booleanValue()) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(this.f360743f, 1, false);
            android.content.Context context = this.f360743f;
            h63.v0 v0Var = this.f360744g;
            java.lang.String str = this.f360741d;
            int i17 = this.f360745h;
            h63.l1 l1Var = this.f360746i;
            k0Var.X1 = true;
            k0Var.f293405n = new h63.y(context);
            k0Var.f293414s = new h63.z(v0Var, str, context, i17, l1Var);
            k0Var.C = new h63.a0(l1Var);
            k0Var.v();
        }
    }
}
