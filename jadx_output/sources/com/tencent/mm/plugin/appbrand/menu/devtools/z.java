package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes.dex */
public final class z implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.menu.devtools.b0 f85945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f85946e;

    public z(com.tencent.mm.plugin.appbrand.menu.devtools.b0 b0Var, android.content.Context context) {
        this.f85945d = b0Var;
        this.f85946e = context;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, null, null, new com.tencent.mm.plugin.appbrand.menu.devtools.y(menuItem, this.f85945d, this.f85946e, null), 3, null);
    }
}
