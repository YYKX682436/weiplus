package aw2;

/* loaded from: classes10.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw2.n f96280d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(aw2.n nVar) {
        super(0);
        this.f96280d = nVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        aw2.n nVar = this.f96280d;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = nVar.f96309d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        sr2.o1 o1Var = (sr2.o1) pf5.z.f435481a.a(activity).a(sr2.o1.class);
        if (o1Var.T6() && !o1Var.R6()) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) nVar.f96309d, 1, true);
            k0Var.f293405n = new aw2.j(nVar);
            k0Var.f293414s = new aw2.k(nVar);
            k0Var.v();
        } else {
            rx2.p pVar = nVar.f96312g;
            pVar.f482517e.mo146xb9724478(java.lang.Boolean.TRUE);
            pVar.f482522m = true;
            pVar.f482519g.setVisibility(0);
        }
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207935a.a().r()).booleanValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15281x1c66dc31 c15281x1c66dc31 = nVar.f96316n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c15281x1c66dc31, "<get-extendReadingView>(...)");
            jz5.l[] lVarArr = new jz5.l[3];
            lVarArr[0] = new jz5.l("if_clk_empty", 1);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
            if (c19783xd9a946b7 == null || (str = c19783xd9a946b7.m76327x23a7af9b()) == null) {
                str = "";
            }
            lVarArr[1] = new jz5.l("finder_post_sessionid", str);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b72 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
            lVarArr[2] = new jz5.l("enter_scene", java.lang.Integer.valueOf(c19783xd9a946b72 != null ? c19783xd9a946b72.m76275xbcc8608a() : 0));
            hc2.v0.b(c15281x1c66dc31, "link_or_product", "view_clk", 0, kz5.c1.k(lVarArr), null, 20, null);
        }
        return jz5.f0.f384359a;
    }
}
