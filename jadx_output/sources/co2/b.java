package co2;

/* loaded from: classes2.dex */
public final class b implements in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ co2.k f43783d;

    public b(co2.k kVar) {
        this.f43783d = kVar;
    }

    @Override // in5.y
    public boolean c(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        java.lang.String str;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        vn2.u0 u0Var = vn2.u0.f438387a;
        co2.k kVar = this.f43783d;
        java.lang.String tag = kVar.f43792d;
        androidx.appcompat.app.AppCompatActivity context = kVar.getActivity();
        r45.qt2 qt2Var = (r45.qt2) ((jz5.n) kVar.f43793e).getValue();
        co2.i iVar = (co2.i) ((jz5.n) kVar.f43797i).getValue();
        com.tencent.mm.plugin.finder.megavideo.topstory.seelaterflow.SeeLaterLoader loader = kVar.O6();
        java.lang.Object obj = holder.f293125i;
        kotlin.jvm.internal.o.f(obj, "getAssociatedObject(...)");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj;
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(loader, "loader");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) context, 1, false);
        k0Var.f211872n = new vn2.z(context);
        k0Var.f211881s = new vn2.f0(loader, baseFinderFeed, tag, qt2Var, context, iVar);
        k0Var.v();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("view_id", "remove_watch_later_card");
        if (qt2Var == null || (str = qt2Var.getString(1)) == null) {
            str = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", str);
        lVarArr[2] = new jz5.l("comment_scene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)) : "");
        lVarArr[3] = new jz5.l("feed_id", pm0.v.u(baseFinderFeed.getItemId()));
        ((cy1.a) rVar).yj("view_exp", null, kz5.c1.k(lVarArr), 1, true);
        return true;
    }
}
