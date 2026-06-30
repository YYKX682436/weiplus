package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class yy implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.az f196775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.x f196776e;

    public yy(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.az azVar, cm2.x xVar) {
        this.f196775d = azVar;
        this.f196776e = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        xu2.u uVar;
        xu2.v vVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveMpArticleBubble$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.az azVar = this.f196775d;
        java.lang.String str = azVar.f193484i;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click to mp article,url:");
        cm2.x xVar = this.f196776e;
        sb6.append(xVar.f124940v.m75945x2fec8307(3));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        yz5.l lVar = azVar.f193482g;
        if (lVar != null) {
            lVar.mo146xb9724478(xVar);
        }
        bf2.c cVar = bf2.c.f101131a;
        gk2.e eVar = azVar.f193480e;
        java.lang.String m75945x2fec8307 = xVar.f124940v.m75945x2fec8307(3);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        bf2.c.c(cVar, eVar, 5, 2, m75945x2fec8307, 0, null, 0, 0, null, 0, 1008, null);
        if (((mm2.c1) azVar.f193480e.a(mm2.c1.class)).M7()) {
            qo0.c cVar2 = azVar.f193481f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = cVar2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) cVar2 : null;
            if (k0Var != null && (uVar = (xu2.u) k0Var.mo57682x2a5e9229(xu2.u.class)) != null && (vVar = uVar.f538765r) != null) {
                vVar.b();
            }
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = azVar.f193487o;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = azVar.f193486n;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (xVar.f124921g) {
            azVar.f193487o = p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vy(azVar, null), 3, null);
            mm2.e1 e1Var = (mm2.e1) azVar.f193480e.a(mm2.e1.class);
            new ke2.v(e1Var.f410516m, e1Var.f410521r.m75942xfb822ef2(0), 2, xy2.c.e(azVar.f193479d), ((mm2.e1) azVar.f193480e.a(mm2.e1.class)).f410518o, xVar.f124920f, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(xVar.f124940v.mo14344x5f01b1f6()), null, null, null, 512, null).l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.xy(azVar, xVar));
        } else {
            java.lang.String m75945x2fec83072 = xVar.f124940v.m75945x2fec8307(3);
            if (m75945x2fec83072 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.az.a(azVar, m75945x2fec83072);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMpArticleBubble$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
