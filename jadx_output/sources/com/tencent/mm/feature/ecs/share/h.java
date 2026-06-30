package com.tencent.mm.feature.ecs.share;

/* loaded from: classes.dex */
public final class h implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.share.a f65985d;

    public h(com.tencent.mm.feature.ecs.share.a aVar) {
        this.f65985d = aVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem != null) {
            int itemId = menuItem.getItemId();
            t00.e1 e1Var = (t00.e1) this.f65985d;
            e1Var.a(itemId, null);
            c00.n3 n3Var = e1Var.f414277b;
            if (n3Var != null) {
                n3Var.b(null);
            }
        }
    }
}
