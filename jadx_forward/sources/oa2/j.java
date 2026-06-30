package oa2;

/* loaded from: classes2.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oa2.w f425353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.r03 f425354e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(oa2.w wVar, r45.r03 r03Var) {
        super(0);
        this.f425353d = wVar;
        this.f425354e = r03Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.rz6 rz6Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        oa2.w wVar = this.f425353d;
        android.app.Activity context = wVar.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        java.lang.String stringExtra = wVar.m158354x19263085().getIntent().getStringExtra("key_finder_user_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        boolean z17 = stringExtra.length() == 0;
        java.lang.String str = null;
        r45.r03 r03Var = this.f425354e;
        if (z17) {
            r45.r23 r23Var = (r45.r23) r03Var.m75936x14adae67(23);
            stringExtra = (r23Var == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) r23Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa.m76197x6c03c64c();
        }
        jz5.l[] lVarArr = new jz5.l[5];
        r45.r23 r23Var2 = (r45.r23) r03Var.m75936x14adae67(23);
        if (r23Var2 != null && (rz6Var = (r45.rz6) r23Var2.m75936x14adae67(1)) != null) {
            str = rz6Var.f466853d;
        }
        lVarArr[0] = new jz5.l("templateid", str);
        lVarArr[1] = new jz5.l("finder_tab_context_id", V6.m75945x2fec8307(2));
        lVarArr[2] = new jz5.l("finder_context_id", V6.m75945x2fec8307(1));
        lVarArr[3] = new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.m75939xb282bd08(5)));
        lVarArr[4] = new jz5.l("finder_username", stringExtra);
        return kz5.c1.k(lVarArr);
    }
}
