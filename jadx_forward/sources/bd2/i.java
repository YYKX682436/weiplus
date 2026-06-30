package bd2;

/* loaded from: classes2.dex */
public final class i extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f100795d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public long f100796e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f100797f;

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f100795d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        bd2.j holder = (bd2.j) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f100795d.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        r45.rw4 rw4Var = (r45.rw4) obj;
        ((android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f568811o45)).setText(rw4Var.m75945x2fec8307(1));
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(holder.f3639x46306858, "notinterest_reason");
        jz5.l[] lVarArr = new jz5.l[5];
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        lVarArr[0] = new jz5.l("finder_context_id", b52.b.b());
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        lVarArr[1] = new jz5.l("finder_tab_context_id", b52.b.c());
        android.content.Context context = holder.f3639x46306858.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        lVarArr[2] = new jz5.l("comment_scene", nyVar != null ? java.lang.Integer.valueOf(nyVar.f216913n) : null);
        lVarArr[3] = new jz5.l("feed_id", pm0.v.u(this.f100796e));
        lVarArr[4] = new jz5.l("if_new_plan", "1");
        aVar.Cj("view_exp", holder.f3639x46306858, kz5.c1.k(lVarArr), 25496);
        holder.f3639x46306858.setOnClickListener(new bd2.h(rw4Var, holder, this));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dhs, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new bd2.j(inflate);
    }
}
