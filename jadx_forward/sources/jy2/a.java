package jy2;

/* loaded from: classes3.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jy2.b f384018d;

    public a(jy2.b bVar) {
        this.f384018d = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/vote/FinderLiveAnchorVoteEntranceWidget$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        jy2.b bVar = this.f384018d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = bVar.f384021f;
        if (lVar.x0()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l.q1(lVar, bVar.f384022g, null, 2, null);
        } else if (((mm2.c1) lVar.S0().a(mm2.c1.class)).f410317b6 != null) {
            qo0.c.a(bVar.f384020e, qo0.b.f446952u2, null, 2, null);
        } else {
            mm2.e1 e1Var = (mm2.e1) lVar.S0().a(mm2.e1.class);
            zl2.r4 r4Var = zl2.r4.f555483a;
            android.content.Context context = bVar.f384019d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            r4Var.k1(context, e1Var.f410521r.m75942xfb822ef2(0), e1Var.f410516m, e1Var.f410525v, ((mm2.c1) lVar.S0().a(mm2.c1.class)).f410385o);
        }
        ll2.e.b(ll2.e.f400666a, bVar.f384025m, false, false, 6, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/vote/FinderLiveAnchorVoteEntranceWidget$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
