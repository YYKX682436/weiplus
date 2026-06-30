package aw2;

/* loaded from: classes10.dex */
public final class k implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw2.n f14766d;

    public k(aw2.n nVar) {
        this.f14766d = nVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        aw2.n nVar = this.f14766d;
        if (itemId != 4) {
            if (itemId != 5) {
                return;
            }
            rx2.p pVar = nVar.f14779g;
            pVar.f400984e.invoke(java.lang.Boolean.TRUE);
            pVar.f400989m = true;
            pVar.f400986g.setVisibility(0);
            return;
        }
        com.tencent.mm.ui.MMActivity activity = nVar.f14776d;
        kotlin.jvm.internal.o.g(activity, "activity");
        aw2.a aVar = ((sr2.o1) pf5.z.f353948a.a(activity).a(sr2.o1.class)).f411655f;
        if (aVar != null) {
            aVar.f14720g.d();
        }
    }
}
