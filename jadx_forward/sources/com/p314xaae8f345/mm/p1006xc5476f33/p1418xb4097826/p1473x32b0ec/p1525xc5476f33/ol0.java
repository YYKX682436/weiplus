package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ol0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pl0 f195298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.z f195299e;

    public ol0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pl0 pl0Var, cm2.z zVar) {
        this.f195298d = pl0Var;
        this.f195299e = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        xu2.u uVar;
        xu2.v vVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveWecomBubble$refreshView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pl0 pl0Var = this.f195298d;
        yz5.l lVar = pl0Var.f195443g;
        cm2.z zVar = this.f195299e;
        if (lVar != null) {
            lVar.mo146xb9724478(zVar);
        }
        gm0.j1.d().a(vb1.e.f77260x366c91de, pl0Var);
        java.lang.String m75945x2fec8307 = zVar.f124942v.m75945x2fec8307(3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pl0Var.f195445i, "click to see wecom : " + m75945x2fec8307);
        if (zl2.q4.f555466a.E()) {
            android.view.ViewGroup viewGroup = pl0Var.f195446m;
            if (viewGroup == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
                throw null;
            }
            db5.t7.m123883x26a183b(viewGroup.getContext(), "contactid:" + m75945x2fec8307, 0).show();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pl0Var.f195445i, "wecomBubble clicke joinLiveTraceBuff = " + ((mm2.c1) pl0Var.f195441e.a(mm2.c1.class)).C1);
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        ab0.b0 b0Var = (ab0.b0) i95.n0.c(ab0.b0.class);
        r45.g05 g05Var = new r45.g05();
        g05Var.f456318e = ((mm2.c1) pl0Var.f195441e.a(mm2.c1.class)).f410385o;
        g05Var.f456317d = 2;
        gk2.e eVar = pl0Var.f195441e;
        g05Var.f456319f = ((mm2.c1) eVar.a(mm2.c1.class)).C1;
        r45.ly1 ly1Var = new r45.ly1();
        ly1Var.set(0, ((mm2.c1) eVar.a(mm2.c1.class)).C1);
        ly1Var.set(1, zVar.f124931t);
        byte[] encode = android.util.Base64.encode(ly1Var.mo14344x5f01b1f6(), 2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encode, "encode(...)");
        g05Var.f456320g = new java.lang.String(encode, r26.c.f450398a);
        ((za0.k) b0Var).getClass();
        d17.g(new l41.e0(m75945x2fec8307, true, g05Var));
        android.content.Context context = pl0Var.f195440d;
        pl0Var.f195447n = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggd), true, 3, null);
        bf2.c cVar = bf2.c.f101131a;
        gk2.e eVar2 = pl0Var.f195441e;
        java.lang.String m75945x2fec83072 = zVar.f124942v.m75945x2fec8307(3);
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        bf2.c.c(cVar, eVar2, 5, 3, m75945x2fec83072, 0, null, 0, 0, null, 0, 1008, null);
        if (((mm2.c1) pl0Var.f195441e.a(mm2.c1.class)).M7()) {
            qo0.c cVar2 = pl0Var.f195442f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = cVar2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) cVar2 : null;
            if (k0Var != null && (uVar = (xu2.u) k0Var.mo57682x2a5e9229(xu2.u.class)) != null && (vVar = uVar.f538765r) != null) {
                vVar.b();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveWecomBubble$refreshView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
