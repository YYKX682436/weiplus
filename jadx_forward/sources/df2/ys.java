package df2;

/* loaded from: classes10.dex */
public final class ys implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f313425d;

    public ys(df2.lt ltVar) {
        this.f313425d = ltVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.bm1 bm1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LivePromoteBannerController$showFestivalSnsHalf$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.lt ltVar = this.f313425d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var = ltVar.S;
        if (e3Var != null) {
            e3Var.h();
        }
        df2.lt.c7(ltVar, 2);
        in5.c cVar = ltVar.f312243r;
        java.lang.String str = null;
        dk2.h hVar = cVar instanceof dk2.h ? (dk2.h) cVar : null;
        if (hVar != null && (bm1Var = hVar.f315078h) != null) {
            str = bm1Var.m75945x2fec8307(0);
        }
        ltVar.t7(ltVar.k7(str, 7));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LivePromoteBannerController$showFestivalSnsHalf$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
