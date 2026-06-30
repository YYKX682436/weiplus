package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes14.dex */
public final class rv extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx f217369d;

    public rv(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx sxVar) {
        this.f217369d = sxVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f217369d.S6().size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        x91.c cVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sv holder = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sv) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx sxVar = this.f217369d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.tv tvVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.tv) kz5.n0.a0(sxVar.S6(), i17);
        if (tvVar != null) {
            x91.h hVar = tvVar.f217594a;
            holder.f217454d.setText((hVar == null || (cVar = hVar.f534180a) == null) ? null : cVar.f534172g);
            holder.f217455e.setVisibility(8);
            holder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qv(sxVar, tvVar));
            android.app.Activity context = sxVar.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(holder.f3639x46306858, "projection_choice");
            aVar.ik(holder.f3639x46306858, 40, 25496);
            android.view.View view = holder.f3639x46306858;
            jz5.l[] lVarArr = new jz5.l[2];
            lVarArr[0] = new jz5.l("feed_id", pm0.v.u(sxVar.f217476y));
            lVarArr[1] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.m75939xb282bd08(5)) : null);
            aVar.gk(view, kz5.c1.k(lVarArr));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup view, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        android.view.View inflate = android.view.View.inflate(view.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.b7t, null);
        inflate.setBackground(view.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a1f));
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sv(this.f217369d, inflate);
    }
}
