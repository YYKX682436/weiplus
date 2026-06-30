package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes.dex */
public final class ol implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.pl f185740d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185741e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f185742f;

    public ol(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.pl plVar, in5.s0 s0Var, int i17) {
        this.f185740d = plVar;
        this.f185741e = s0Var;
        this.f185742f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View itemView = this.f185741e.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        this.f185740d.getClass();
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.Mj(itemView);
        aVar.pk(itemView, "recommend_pos_tag");
        aVar.ik(itemView, 40, 25496);
        aVar.gk(itemView, kz5.b1.e(new jz5.l("view_position", java.lang.Integer.valueOf(this.f185742f))));
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        android.content.Context context = itemView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        zy2.ra Sj = ((c61.p2) ybVar).Sj(context);
        aVar.Ai(itemView, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.nl(Sj != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) Sj).V6() : null));
    }
}
