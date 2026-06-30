package bg1;

/* loaded from: classes7.dex */
public class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f101405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f101406e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sf.f f101407f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bg1.h f101408g;

    public a(bg1.h hVar, java.lang.String str, yf.i0 i0Var, sf.f fVar) {
        this.f101408g = hVar;
        this.f101405d = str;
        this.f101406e = i0Var;
        this.f101407f = fVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 w0Var) {
        super.e(w0Var);
        bg1.h hVar = this.f101408g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "onPause mIsVoip:%b isVoipPageBackgroundRuntimeForegroundState:%b", java.lang.Boolean.valueOf(hVar.f101425c), java.lang.Boolean.valueOf(hVar.f101426d));
        if (hVar.f101425c && hVar.f101426d) {
            yf.i0 i0Var = this.f101406e;
            if (i0Var.f542895i == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "onPause livePusherPluginHandler.getAdapter() null");
            } else {
                if (h()) {
                    return;
                }
                i0Var.f542895i.f(false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "onPause enterBackground");
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "pushBegin, onReconnected");
        super.f();
        if (this.f101408g.f101427e) {
            fb1.e.f342369e.F3(fb1.d.f342366h, true, this.f101405d);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void g() {
        super.g();
        bg1.h hVar = this.f101408g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "onResume mIsVoip:%b isVoipPageBackgroundRuntimeForegroundState:%b", java.lang.Boolean.valueOf(hVar.f101425c), java.lang.Boolean.valueOf(hVar.f101426d));
        if (hVar.f101425c && hVar.f101426d) {
            yf.i0 i0Var = this.f101406e;
            if (i0Var.f542895i == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "onResume livePusherPluginHandler.getAdapter() null");
            } else {
                if (h()) {
                    return;
                }
                i0Var.f542895i.c();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "onPause enterForeground");
            }
        }
    }

    public final boolean h() {
        bg1.h hVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2;
        sf.f fVar = this.f101407f;
        if (fVar == null || fVar.m() == null || (c11510xdd90c2f2 = (hVar = this.f101408g).f101428f) == null || c11510xdd90c2f2.x0() == null || hVar.f101428f.x0().m52169xfdaa7672() == null || hVar.f101428f.x0().m52169xfdaa7672().mo14682x9dee9c37() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "isLivePusherPageTheCurrentPage sth npe");
            return true;
        }
        int mo50260x9f1221c2 = fVar.m().mo50260x9f1221c2();
        int mo50260x9f1221c22 = hVar.f101428f.x0().m52169xfdaa7672().mo14682x9dee9c37().mo50260x9f1221c2();
        boolean z17 = mo50260x9f1221c2 == mo50260x9f1221c22;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "isLivePusherPageTheCurrentPage livePusherPageId:%d, livePusherPageId:%d", java.lang.Integer.valueOf(mo50260x9f1221c2), java.lang.Integer.valueOf(mo50260x9f1221c22));
        return z17;
    }
}
