package b53;

/* loaded from: classes8.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.game.luggage.page.x0 f18085a;

    /* renamed from: b, reason: collision with root package name */
    public final b53.c f18086b;

    /* renamed from: c, reason: collision with root package name */
    public tx4.l f18087c;

    public f(com.tencent.mm.plugin.game.luggage.page.x0 x0Var, b53.c cVar) {
        this.f18085a = x0Var;
        this.f18086b = cVar;
        tx4.l lVar = new tx4.l(x0Var.f406610d);
        this.f18087c = lVar;
        lVar.f422694f = new b53.d(this);
        b53.e eVar = new b53.e(this);
        com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuView gameMenuView = lVar.f422696h;
        if (gameMenuView != null) {
            gameMenuView.setGameMenuItemSelectedListener(eVar);
        }
        this.f18087c.c();
    }
}
