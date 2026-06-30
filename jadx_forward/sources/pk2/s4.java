package pk2;

/* loaded from: classes3.dex */
public final class s4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.t4 f437767d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 f437768e;

    public s4(pk2.t4 t4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var) {
        this.f437767d = t4Var;
        this.f437768e = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/moreaction/AnchorWhiteListOption$addItem$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pk2.t4 t4Var = this.f437767d;
        t4Var.x(2);
        this.f437768e.h();
        df2.o oVar = (df2.o) t4Var.f445960a.e(df2.o.class);
        if (oVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q50 q50Var = oVar.f312433q;
            if (q50Var == null) {
                q50Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q50(oVar.O6(), oVar.getStore());
                oVar.f312433q = q50Var;
            }
            q50Var.f201034x1 = false;
            q50Var.V(null, false, 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/moreaction/AnchorWhiteListOption$addItem$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
