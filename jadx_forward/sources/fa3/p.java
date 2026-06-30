package fa3;

/* loaded from: classes8.dex */
public final class p implements io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f342309d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f342310e;

    /* renamed from: f, reason: collision with root package name */
    public long f342311f;

    /* renamed from: g, reason: collision with root package name */
    public long f342312g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f342313h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f342314i;

    /* renamed from: m, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f342315m;

    /* renamed from: n, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 f342316n;

    public p(android.content.Context context, int i17, java.util.Map map, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2, io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 registry) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(registry, "registry");
        this.f342310e = "";
        this.f342311f = -1L;
        this.f342312g = -1L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppCameraView", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
        this.f342313h = context;
        this.f342314i = map;
        this.f342315m = c28688xe8dbe4c2;
        this.f342316n = registry;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dp8, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f342309d = (android.view.ViewGroup) inflate;
        a();
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138441xdf757329(this);
        }
    }

    public final void a() {
        java.util.Map map = this.f342314i;
        if (map != null) {
            if (map.containsKey("appId")) {
                this.f342310e = java.lang.String.valueOf(map.get("appId"));
            }
            if (map.containsKey("appUuid")) {
                this.f342311f = java.lang.Long.parseLong(java.lang.String.valueOf(map.get("appUuid")));
            }
            if (map.containsKey("pageId")) {
                this.f342312g = java.lang.Long.parseLong(java.lang.String.valueOf(map.get("pageId")));
            }
        }
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        android.content.Context context = this.f342313h;
        if (context == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContext");
            throw null;
        }
        java.lang.String str = this.f342310e;
        long j17 = this.f342311f;
        long j18 = this.f342312g;
        android.view.ViewGroup viewGroup = this.f342309d;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("view");
            throw null;
        }
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 interfaceC28980x1159d658 = this.f342316n;
        if (interfaceC28980x1159d658 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRegistry");
            throw null;
        }
        java.util.Map map2 = this.f342314i;
        fa3.o oVar = new fa3.o(this);
        com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar = (com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var;
        iVar.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.y0(iVar, false, j17, str, j18, context, viewGroup, interfaceC28980x1159d658, map2, oVar));
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: dispose */
    public void mo31847x63a5261f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppCameraView", "dispose");
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: getView */
    public android.view.View mo31848xfb86a31b() {
        android.view.ViewGroup viewGroup = this.f342309d;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("view");
        throw null;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: onFlutterViewAttached */
    public void mo65795x5e3a4146(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppCameraView", "onFlutterViewAttached");
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: onFlutterViewDetached */
    public void mo65796x7c604f14() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppCameraView", "onFlutterViewDetached");
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: onInputConnectionLocked */
    public void mo65797x6ba43ad3() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppCameraView", "onInputConnectionLocked");
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: onInputConnectionUnlocked */
    public void mo65798x9518646c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppCameraView", "onInputConnectionUnlocked");
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
    /* renamed from: onMethodCall */
    public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff methodCall, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(methodCall, "methodCall");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        java.lang.String str = methodCall.f71610xbfc5d0e1;
        java.util.Map map = (java.util.Map) methodCall.f71609x86ac7956;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "resumeCamera")) {
            a();
            return;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar = (com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var;
        iVar.Ri(this.f342311f, this.f342312g, str, map, new fa3.n(new p3321xbce91901.jvm.p3324x21ffc6bd.c0(), result, this));
    }
}
