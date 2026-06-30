package sr2;

/* loaded from: classes.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.o f493115d;

    public i(sr2.o oVar) {
        this.f493115d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/post/FinderPostAdCommentApplyUIC$initCommentApplyDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sr2.o oVar = this.f493115d;
        if (oVar.f493183g == null) {
            oVar.f493183g = db5.e1.Q(oVar.m80379x76847179(), "", oVar.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, false, sr2.g.f493099d);
            pm0.v.T(new db2.k(oVar.f493180d).l(), new sr2.h(oVar));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/post/FinderPostAdCommentApplyUIC$initCommentApplyDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
