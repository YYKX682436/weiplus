package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes7.dex */
public final class v implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.menu.devtools.w f85933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f85934e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f85935f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85936g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ae.r f85937h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ce.g f85938i;

    public v(com.tencent.mm.plugin.appbrand.menu.devtools.w wVar, android.content.Context context, com.tencent.mm.plugin.appbrand.page.n7 n7Var, java.lang.String str, ae.r rVar, ce.g gVar, int i17) {
        this.f85933d = wVar;
        this.f85934e = context;
        this.f85935f = n7Var;
        this.f85936g = str;
        this.f85937h = rVar;
        this.f85938i = gVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.magicbrush.ui.MagicBrushView magicBrushView;
        int itemId = menuItem.getItemId();
        if (itemId == 3) {
            com.tencent.mm.plugin.appbrand.menu.devtools.w.d(this.f85933d, this.f85934e, this.f85935f, 0, this.f85936g);
            return;
        }
        ae.r rVar = this.f85937h;
        ce.g gVar = this.f85938i;
        if (itemId == 4) {
            rVar.s(3);
            com.tencent.magicbrush.ui.MagicBrushView magicBrushView2 = ((ce.o) gVar).f40686g;
            if (magicBrushView2 != null) {
                magicBrushView2.getMagicBrush();
                return;
            }
            return;
        }
        if (itemId != 5) {
            if (itemId == 6 && (magicBrushView = ((ce.o) gVar).f40686g) != null) {
                magicBrushView.getMagicBrush();
                return;
            }
            return;
        }
        rVar.s(2);
        com.tencent.magicbrush.ui.MagicBrushView magicBrushView3 = ((ce.o) gVar).f40686g;
        if (magicBrushView3 != null) {
            magicBrushView3.getMagicBrush();
        }
    }
}
