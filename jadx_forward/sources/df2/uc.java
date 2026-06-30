package df2;

/* loaded from: classes3.dex */
public final class uc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ad f313042d;

    public uc(df2.ad adVar) {
        this.f313042d = adVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        pk2.o9 o9Var;
        pk2.j9 j9Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveAnchorHitPromptTipsController$checkTipsLocation$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.s5 s5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.s5) pf5.z.f435481a.a((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.s5.class);
        if (s5Var != null && (o9Var = s5Var.f198927d) != null && (j9Var = o9Var.f437617g) != null) {
            j9Var.a(null, false);
        }
        df2.ad adVar = this.f313042d;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = adVar.f311241n;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        if2.d0 d0Var = adVar.f311240m;
        if (d0Var != null) {
            d0Var.d(8);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveAnchorHitPromptTipsController$checkTipsLocation$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
