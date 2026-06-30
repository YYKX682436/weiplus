package bd2;

/* loaded from: classes2.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.rw4 f100792d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bd2.j f100793e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bd2.i f100794f;

    public h(r45.rw4 rw4Var, bd2.j jVar, bd2.i iVar) {
        this.f100792d = rw4Var;
        this.f100793e = jVar;
        this.f100794f = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/logic/FinderNoInterestedLogic$NotInterestedAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click action, text: ");
        r45.rw4 rw4Var = this.f100792d;
        sb6.append(rw4Var.m75945x2fec8307(1));
        sb6.append(", subType: ");
        sb6.append(rw4Var.m75939xb282bd08(0));
        sb6.append(", extra: ");
        sb6.append(rw4Var.m75945x2fec8307(2));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NoInterestedLogic", sb6.toString());
        jz5.l[] lVarArr = new jz5.l[6];
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        lVarArr[0] = new jz5.l("finder_context_id", b52.b.b());
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        lVarArr[1] = new jz5.l("finder_tab_context_id", b52.b.c());
        bd2.j jVar = this.f100793e;
        android.content.Context context = jVar.f3639x46306858.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        lVarArr[2] = new jz5.l("comment_scene", nyVar != null ? java.lang.Integer.valueOf(nyVar.f216913n) : null);
        lVarArr[3] = new jz5.l("click_reason", rw4Var.m75945x2fec8307(1));
        bd2.i iVar = this.f100794f;
        lVarArr[4] = new jz5.l("feed_id", pm0.v.u(iVar.f100796e));
        lVarArr[5] = new jz5.l("if_new_plan", "1");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", jVar.f3639x46306858, kz5.c1.k(lVarArr), 25496);
        yz5.l lVar = iVar.f100797f;
        if (lVar != null) {
            r45.qw4 qw4Var = new r45.qw4();
            qw4Var.set(0, java.lang.Integer.valueOf(rw4Var.m75939xb282bd08(0)));
            qw4Var.set(1, rw4Var.m75945x2fec8307(2));
            lVar.mo146xb9724478(qw4Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/logic/FinderNoInterestedLogic$NotInterestedAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
