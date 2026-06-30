package bd2;

/* loaded from: classes2.dex */
public final class i extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f19262d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public long f19263e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f19264f;

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f19262d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        bd2.j holder = (bd2.j) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f19262d.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        r45.rw4 rw4Var = (r45.rw4) obj;
        ((android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.f487278o45)).setText(rw4Var.getString(1));
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(holder.itemView, "notinterest_reason");
        jz5.l[] lVarArr = new jz5.l[5];
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        lVarArr[0] = new jz5.l("finder_context_id", b52.b.b());
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        lVarArr[1] = new jz5.l("finder_tab_context_id", b52.b.c());
        android.content.Context context = holder.itemView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        lVarArr[2] = new jz5.l("comment_scene", nyVar != null ? java.lang.Integer.valueOf(nyVar.f135380n) : null);
        lVarArr[3] = new jz5.l("feed_id", pm0.v.u(this.f19263e));
        lVarArr[4] = new jz5.l("if_new_plan", "1");
        aVar.Cj("view_exp", holder.itemView, kz5.c1.k(lVarArr), 25496);
        holder.itemView.setOnClickListener(new bd2.h(rw4Var, holder, this));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.dhs, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.d(inflate);
        return new bd2.j(inflate);
    }
}
