package com.tencent.mm.plugin.finder.drama.detail;

/* loaded from: classes.dex */
public final class g implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.drama.detail.i f105146d;

    public g(com.tencent.mm.plugin.finder.drama.detail.i iVar) {
        this.f105146d = iVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            bd2.b bVar = bd2.b.f19244a;
            com.tencent.mm.plugin.finder.drama.detail.i iVar = this.f105146d;
            android.app.Activity context = iVar.getContext();
            long j17 = iVar.f105162u;
            r45.qj2 qj2Var = iVar.f105148d;
            bVar.g(context, j17, qj2Var != null ? qj2Var.getLong(0) : 0L);
        }
    }
}
