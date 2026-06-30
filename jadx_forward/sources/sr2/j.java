package sr2;

/* loaded from: classes.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.o f493125d;

    public j(sr2.o oVar) {
        this.f493125d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/post/FinderPostAdCommentApplyUIC$initCommentApplyDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_AD_COMMENT_APPLY_DIALOG_SHOW_COUNT_INT_SYNC;
        sr2.o oVar = this.f493125d;
        c17.x(u3Var, java.lang.Integer.valueOf(oVar.f493182f));
        y9.i iVar = oVar.f493184h;
        if (iVar != null) {
            iVar.hide();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/post/FinderPostAdCommentApplyUIC$initCommentApplyDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
