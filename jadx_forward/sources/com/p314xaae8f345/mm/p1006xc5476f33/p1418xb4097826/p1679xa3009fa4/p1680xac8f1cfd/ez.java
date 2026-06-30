package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes.dex */
public final class ez implements db5.r4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iz f215840a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so2.j0 f215841b;

    public ez(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iz izVar, so2.j0 j0Var) {
        this.f215840a = izVar;
        this.f215841b = j0Var;
    }

    @Override // db5.r4
    public final void a(android.view.View view, int i17, android.view.MenuItem menuItem) {
        java.lang.String str;
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            str = "collection_card_nointerest";
        } else if (itemId != 2) {
            return;
        } else {
            str = "close_continue_watch";
        }
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, str);
        aVar.ik(view, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.f0.f34795x366c91de, 25496);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = this.f215840a.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("finder_context_id", V6 != null ? V6.m75945x2fec8307(1) : null);
        lVarArr[1] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.m75939xb282bd08(5)) : null);
        r45.vx0 vx0Var = (r45.vx0) this.f215841b.f491971d.m75936x14adae67(0);
        lVarArr[2] = new jz5.l("collection_id", pm0.v.u(vx0Var != null ? vx0Var.m75942xfb822ef2(0) : 0L));
        aVar.gk(view, kz5.c1.k(lVarArr));
    }
}
