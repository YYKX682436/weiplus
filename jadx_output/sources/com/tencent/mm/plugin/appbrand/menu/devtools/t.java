package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes7.dex */
public final class t implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.menu.devtools.w f85924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f85925e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f85926f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85927g;

    public t(com.tencent.mm.plugin.appbrand.menu.devtools.w wVar, android.content.Context context, com.tencent.mm.plugin.appbrand.page.n7 n7Var, java.lang.String str) {
        this.f85924d = wVar;
        this.f85925e = context;
        this.f85926f = n7Var;
        this.f85927g = str;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.appbrand.menu.devtools.w.d(this.f85924d, this.f85925e, this.f85926f, itemId != 0 ? itemId != 1 ? itemId != 2 ? 0 : 3 : 2 : 1, this.f85927g);
    }
}
