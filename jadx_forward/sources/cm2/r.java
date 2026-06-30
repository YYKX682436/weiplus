package cm2;

/* loaded from: classes3.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.fr1 f124912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f124913e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.p f124914f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cm2.s f124915g;

    public r(r45.fr1 fr1Var, in5.s0 s0Var, cm2.p pVar, cm2.s sVar) {
        this.f124912d = fr1Var;
        this.f124913e = s0Var;
        this.f124914f = pVar;
        this.f124915g = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.fr1 fr1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var2;
        r45.h41 h41Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/convert/GameTogetherVisitorTeamConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.fr1 fr1Var2 = this.f124912d;
        java.lang.Integer valueOf = fr1Var2 != null ? java.lang.Integer.valueOf(fr1Var2.m75939xb282bd08(0)) : null;
        boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
        cm2.p pVar = this.f124914f;
        cm2.s sVar = this.f124915g;
        if (mo168058x74219ae7) {
            android.content.Context context = this.f124913e.f374654e;
            db5.t7.g(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e4w));
        } else if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 2)) {
            r45.fr1 fr1Var3 = pVar.f124910h;
            if (fr1Var3 != null) {
                r45.xq1 xq1Var = ((mm2.c1) sVar.f124916e.P0(mm2.c1.class)).C2;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ai0 ai0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ai0) sVar.f124916e.X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ai0.class);
                if (ai0Var != null && (m10Var2 = ai0Var.f193424s) != null) {
                    m10Var2.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u00(m10Var2, valueOf.intValue(), fr1Var3, xq1Var, null));
                }
                qo0.c.a(sVar.f124917f, qo0.b.D2, null, 2, null);
            }
        } else if (((valueOf != null && valueOf.intValue() == 3) || (valueOf != null && valueOf.intValue() == 4)) && (fr1Var = pVar.f124910h) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ai0 ai0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ai0) sVar.f124916e.X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ai0.class);
            if (ai0Var2 != null && (m10Var = ai0Var2.f193424s) != null) {
                m10Var.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v00(m10Var, fr1Var));
            }
            qo0.c.a(sVar.f124917f, qo0.b.D2, null, 2, null);
        }
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.E;
        cl0.g gVar = new cl0.g();
        gVar.o("type", 33);
        java.lang.String gVar2 = gVar.toString();
        cl0.g gVar3 = new cl0.g();
        gVar3.h("click_id", java.util.UUID.randomUUID().toString());
        zl2.r4 r4Var = zl2.r4.f555483a;
        r45.a83 a83Var = ((mm2.c1) sVar.f124916e.P0(mm2.c1.class)).f410361j6;
        gVar3.o("game_type", r4Var.j3(a83Var != null ? a83Var.m75939xb282bd08(2) : 0));
        r45.fr1 fr1Var4 = pVar.f124910h;
        gVar3.h("appid", (fr1Var4 == null || (h41Var = (r45.h41) fr1Var4.m75936x14adae67(21)) == null) ? null : h41Var.m75945x2fec8307(0));
        ml2.r0.hj(r0Var, b4Var, gVar2, 0L, null, null, gVar3.toString(), null, null, 220, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/convert/GameTogetherVisitorTeamConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
