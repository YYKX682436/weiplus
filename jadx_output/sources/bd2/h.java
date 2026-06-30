package bd2;

/* loaded from: classes2.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.rw4 f19259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bd2.j f19260e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bd2.i f19261f;

    public h(r45.rw4 rw4Var, bd2.j jVar, bd2.i iVar) {
        this.f19259d = rw4Var;
        this.f19260e = jVar;
        this.f19261f = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/logic/FinderNoInterestedLogic$NotInterestedAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click action, text: ");
        r45.rw4 rw4Var = this.f19259d;
        sb6.append(rw4Var.getString(1));
        sb6.append(", subType: ");
        sb6.append(rw4Var.getInteger(0));
        sb6.append(", extra: ");
        sb6.append(rw4Var.getString(2));
        com.tencent.mars.xlog.Log.i("Finder.NoInterestedLogic", sb6.toString());
        jz5.l[] lVarArr = new jz5.l[6];
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        lVarArr[0] = new jz5.l("finder_context_id", b52.b.b());
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        lVarArr[1] = new jz5.l("finder_tab_context_id", b52.b.c());
        bd2.j jVar = this.f19260e;
        android.content.Context context = jVar.itemView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        lVarArr[2] = new jz5.l("comment_scene", nyVar != null ? java.lang.Integer.valueOf(nyVar.f135380n) : null);
        lVarArr[3] = new jz5.l("click_reason", rw4Var.getString(1));
        bd2.i iVar = this.f19261f;
        lVarArr[4] = new jz5.l("feed_id", pm0.v.u(iVar.f19263e));
        lVarArr[5] = new jz5.l("if_new_plan", "1");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", jVar.itemView, kz5.c1.k(lVarArr), 25496);
        yz5.l lVar = iVar.f19264f;
        if (lVar != null) {
            r45.qw4 qw4Var = new r45.qw4();
            qw4Var.set(0, java.lang.Integer.valueOf(rw4Var.getInteger(0)));
            qw4Var.set(1, rw4Var.getString(2));
            lVar.invoke(qw4Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/logic/FinderNoInterestedLogic$NotInterestedAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
