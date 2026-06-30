package ut2;

/* loaded from: classes3.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.p f512427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.i0 f512428e;

    public h(ut2.p pVar, cm2.i0 i0Var) {
        this.f512427d = pVar;
        this.f512428e = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/FinderLiveBulkBuyViewHolder$bindPromoteBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ut2.p pVar = this.f512427d;
        pVar.getClass();
        cm2.i0 i0Var = this.f512428e;
        r45.hw0 hw0Var = i0Var.f124887v;
        int i17 = hw0Var.m75939xb282bd08(14) == 1 ? 2 : 1;
        android.content.Context context = pVar.f3639x46306858.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.ra.class))).V6();
        gk2.e eVar = pVar.f512560e;
        long m75942xfb822ef2 = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
        long j17 = ((mm2.e1) eVar.a(mm2.e1.class)).f410516m;
        java.lang.String str = ((mm2.e1) eVar.a(mm2.e1.class)).f410517n;
        android.content.Context context2 = pVar.f3639x46306858.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        new ek2.e2(m75942xfb822ef2, j17, str, xy2.c.e(context2), hw0Var.m75942xfb822ef2(0), 3, i17, 0, V6, 3, new ut2.o(hw0Var, i17, pVar, i0Var)).l();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveBulkBuyViewHolder$bindPromoteBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
