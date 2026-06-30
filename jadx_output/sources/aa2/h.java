package aa2;

/* loaded from: classes2.dex */
public final class h implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aa2.j f2502d;

    public h(aa2.j jVar) {
        this.f2502d = jVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        if (menuItem.getItemId() == 10001) {
            aa2.j jVar = this.f2502d;
            r45.e21 e21Var = jVar.f2505d;
            if (e21Var == null) {
                com.tencent.mars.xlog.Log.i("FinderActivityShareHandler", "closeActivity invalid eventInfo null");
                return;
            }
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) e21Var.getCustom(1);
            if (finderContact == null || (str = finderContact.getUsername()) == null) {
                str = "";
            }
            androidx.appcompat.app.AppCompatActivity activity = jVar.f434158a;
            kotlin.jvm.internal.o.g(activity, "activity");
            db2.g2 g2Var = new db2.g2(1, java.lang.Long.valueOf(e21Var.getLong(0)), str, null, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
            g2Var.t(activity, activity.getResources().getString(com.tencent.mm.R.string.f9y), 500L);
            pq5.g l17 = g2Var.l();
            if (activity instanceof com.tencent.mm.ui.MMActivity) {
                l17.f((com.tencent.mm.ui.MMActivity) activity);
            }
            pm0.v.T(l17, new aa2.c(jVar));
        }
    }
}
