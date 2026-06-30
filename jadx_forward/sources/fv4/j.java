package fv4;

/* loaded from: classes8.dex */
public final class j extends fv4.g {

    /* renamed from: b, reason: collision with root package name */
    public final fv4.g f348549b;

    public j(fv4.g realLogic) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(realLogic, "realLogic");
        this.f348549b = realLogic;
    }

    @Override // fv4.g
    public void a() {
        this.f348549b.a();
        this.f348538a = null;
    }

    @Override // fv4.g
    public android.view.View b() {
        return this.f348549b.b();
    }

    @Override // fv4.g
    public void c(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff call, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(call, "call");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        this.f348549b.c(call, result);
    }

    @Override // fv4.g
    public void d(java.lang.String str) {
        this.f348549b.d(str);
    }

    @Override // fv4.g
    public void e(boolean z17) {
        this.f348549b.e(z17);
    }

    @Override // fv4.g
    public void f(fv4.i ctx) {
        fv4.i iVar;
        tg0.c2 c2Var;
        tg0.h2 h2Var;
        fv4.i iVar2;
        tg0.c2 c2Var2;
        tg0.h2 h2Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        this.f348538a = ctx;
        tg0.c2 c2Var3 = ctx.f348542c;
        tg0.f2 f2Var = tg0.g2.f500606e;
        if (c2Var3 != null && c2Var3.f500580b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", "JS ready, will call onUiInit");
            tg0.c1 c1Var = c2Var3.f500588j;
            if (c1Var == null || (iVar2 = this.f348538a) == null || (c2Var2 = iVar2.f348542c) == null || (h2Var2 = c2Var2.f500586h) == null) {
                return;
            }
            ((ch0.h0) h2Var2).c(-1, c1Var);
            return;
        }
        if (!(c2Var3 != null && c2Var3.f500581c)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FTSPlatformWebView", "JS ready, do nothing");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", "JS ready, only notify result");
        tg0.c1 c1Var2 = c2Var3.f500588j;
        if (c1Var2 == null || (iVar = this.f348538a) == null || (c2Var = iVar.f348542c) == null || (h2Var = c2Var.f500586h) == null) {
            return;
        }
        ((ch0.h0) h2Var).a(-1, c1Var2);
    }

    @Override // fv4.g
    public void h(android.view.View flutterView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flutterView, "flutterView");
        this.f348549b.h(flutterView);
    }

    @Override // fv4.g
    public void i() {
        this.f348549b.i();
    }
}
