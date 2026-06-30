package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06;

/* loaded from: classes10.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.ActivityC16662x5873ebce f232484d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.ActivityC16662x5873ebce activityC16662x5873ebce) {
        this.f232484d = activityC16662x5873ebce;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/shake/MusicMainUINew$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.ActivityC16662x5873ebce activityC16662x5873ebce = this.f232484d;
        r45.hf2 a17 = activityC16662x5873ebce.E.a(activityC16662x5873ebce.mo55332x76847179());
        r45.xs4 xs4Var = new r45.xs4();
        java.util.ArrayList arrayList2 = (java.util.ArrayList) activityC16662x5873ebce.f232443p;
        if (arrayList2.size() > 0) {
            fm3.u uVar = ((lm3.e) arrayList2.get(0)).f401015d;
            fm3.t tVar = fm3.u.A;
            if (tVar.d(uVar) != null) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 d17 = tVar.d(uVar);
                xs4Var.set(0, java.lang.String.valueOf(d17.m76784x5db1b11()));
                xs4Var.set(1, d17.m76803x6c285d75());
                if (d17.m76802x2dd01666() != null && d17.m76802x2dd01666().m76962x74cd162e() != null && d17.m76802x2dd01666().m76962x74cd162e().size() > 0) {
                    xs4Var.set(2, d17.m76802x2dd01666().m76962x74cd162e().getFirst().m76623xd93f812f() + d17.m76802x2dd01666().m76962x74cd162e().getFirst().m76624x4c9b7dca());
                }
                xs4Var.set(3, d17.m76760x76845fea() != null ? d17.m76760x76845fea().m76184x8010e5e4() : "");
            }
        }
        b21.r rVar = activityC16662x5873ebce.f232440m;
        xs4Var.set(4, a17.m75945x2fec8307(1));
        xs4Var.set(5, a17.m75945x2fec8307(7));
        xs4Var.set(7, a17.m75945x2fec8307(9));
        xs4Var.set(8, java.lang.Long.valueOf(a17.m75942xfb822ef2(11)));
        xs4Var.set(9, a17.m75945x2fec8307(13));
        xs4Var.set(10, java.lang.Integer.valueOf(a17.m75939xb282bd08(14)));
        xs4Var.set(6, a17.m75945x2fec8307(12));
        xs4Var.set(12, ((r45.if2) a17.m75936x14adae67(17)) != null ? ((r45.if2) a17.m75936x14adae67(17)).m75945x2fec8307(0) : "");
        if (!android.text.TextUtils.isEmpty(a17.m75945x2fec8307(18)) || rVar == null) {
            xs4Var.set(11, a17.m75945x2fec8307(18));
        } else {
            xs4Var.set(11, rVar.P);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.d0 d0Var = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.d0.f232473a;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.d0.f232474b.f141854q = 0L;
        d0Var.a(255);
        ((ja0.o0) ((ka0.r0) i95.n0.c(ka0.r0.class))).wi(rVar, a17, activityC16662x5873ebce.mo55332x76847179(), xs4Var);
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/shake/MusicMainUINew$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
