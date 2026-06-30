package com.tencent.mm.plugin.finder.drama.drawer;

/* loaded from: classes.dex */
public final class g implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.drama.drawer.j f105236d;

    public g(com.tencent.mm.plugin.finder.drama.drawer.j jVar) {
        this.f105236d = jVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            bd2.b bVar = bd2.b.f19244a;
            com.tencent.mm.plugin.finder.drama.drawer.j jVar = this.f105236d;
            android.app.Activity context = jVar.getContext();
            long j17 = jVar.f105255v;
            r45.qj2 qj2Var = jVar.f105240d;
            bVar.g(context, j17, qj2Var != null ? qj2Var.getLong(0) : 0L);
        }
    }
}
