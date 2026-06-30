package iv0;

/* loaded from: classes4.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iv0.w f376606d;

    public l(iv0.w wVar) {
        this.f376606d = wVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/canvas/CanvasPanelUIC$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        iv0.w wVar = this.f376606d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) wVar.m80379x76847179(), 1, false);
        k0Var.f293405n = iv0.j.f376604d;
        k0Var.f293414s = new iv0.k(wVar);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/canvas/CanvasPanelUIC$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
