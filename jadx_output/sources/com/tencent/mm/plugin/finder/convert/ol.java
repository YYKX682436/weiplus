package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class ol implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.pl f104207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104208e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f104209f;

    public ol(com.tencent.mm.plugin.finder.convert.pl plVar, in5.s0 s0Var, int i17) {
        this.f104207d = plVar;
        this.f104208e = s0Var;
        this.f104209f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View itemView = this.f104208e.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        this.f104207d.getClass();
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.Mj(itemView);
        aVar.pk(itemView, "recommend_pos_tag");
        aVar.ik(itemView, 40, 25496);
        aVar.gk(itemView, kz5.b1.e(new jz5.l("view_position", java.lang.Integer.valueOf(this.f104209f))));
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        android.content.Context context = itemView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        zy2.ra Sj = ((c61.p2) ybVar).Sj(context);
        aVar.Ai(itemView, new com.tencent.mm.plugin.finder.convert.nl(Sj != null ? ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj).V6() : null));
    }
}
