package ev4;

/* loaded from: classes8.dex */
public final class a implements io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f338472d;

    /* renamed from: e, reason: collision with root package name */
    public final fv4.i f338473e;

    /* renamed from: f, reason: collision with root package name */
    public final ev4.l f338474f;

    public a(android.content.Context context, int i17, java.util.Map map, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2) {
        this.f338472d = c28688xe8dbe4c2;
        fv4.i iVar = new fv4.i(context, i17, map, c28688xe8dbe4c2);
        this.f338473e = iVar;
        this.f338474f = new ev4.l(iVar);
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138441xdf757329(this);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", "init finish");
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: dispose */
    public void mo31847x63a5261f() {
        tg0.c2 c2Var;
        tg0.h2 h2Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", "dispose");
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = this.f338472d;
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138441xdf757329(null);
        }
        ev4.l lVar = this.f338474f;
        tg0.z1 z1Var = lVar.f338491b;
        if (z1Var != null) {
            ((ev4.k) z1Var).a();
        }
        lVar.f338491b = null;
        fv4.i iVar = this.f338473e;
        boolean z17 = iVar.f348546g;
        ev4.d dVar = iVar.f348545f;
        if (!z17) {
            fv4.i iVar2 = dVar.f338477b;
            if (iVar2 != null && (c2Var = iVar2.f348542c) != null && (h2Var = c2Var.f500586h) != null) {
                ((ch0.h0) h2Var).b("clearSearchResultInFlutter", new org.json.JSONObject());
            }
            tg0.l1 l1Var = (tg0.l1) i95.n0.c(tg0.l1.class);
            if (l1Var != null) {
                tg0.c2 c2Var2 = iVar.f348542c;
                ((yg0.o3) l1Var).hj(c2Var2 != null ? c2Var2.f500589k : 0, false, c2Var2 != null ? c2Var2.f500583e : null, c2Var2 != null ? c2Var2.f500587i : null);
            }
        }
        iVar.f348541b.a();
        dVar.f338477b = null;
        iVar.f348542c = null;
        iVar.f348543d = null;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: getView */
    public android.view.View mo31848xfb86a31b() {
        return this.f338473e.f348541b.b();
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: onFlutterViewAttached */
    public void mo65795x5e3a4146(android.view.View flutterView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flutterView, "flutterView");
        fv4.i iVar = this.f338473e;
        iVar.getClass();
        iVar.f348544e = flutterView;
        iVar.f348541b.h(flutterView);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
    /* renamed from: onMethodCall */
    public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff call, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        fv4.i iVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(call, "call");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        ev4.d dVar = this.f338473e.f348545f;
        if (dVar == null || (iVar = dVar.f338477b) == null) {
            return;
        }
        iVar.f348541b.c(call, result);
    }
}
