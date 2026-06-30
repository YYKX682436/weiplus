package uv0;

/* loaded from: classes5.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uv0.u f512874d;

    public n(uv0.u uVar) {
        this.f512874d = uVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterPanel$initListeners$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        uv0.u filterPanel = this.f512874d;
        uv0.i iVar = filterPanel.U;
        if (iVar != null) {
            vv0.k filterInfo = filterPanel.f512884J;
            uv0.h hVar = (uv0.h) iVar;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filterPanel, "filterPanel");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filterInfo, "filterInfo");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(hVar.f512866a);
            i0Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.lkp);
            i0Var.f(com.p314xaae8f345.mm.R.C30867xcad56011.lkq);
            i0Var.f293354b.E = new uv0.g(filterPanel, hVar, filterInfo);
            i0Var.e(com.p314xaae8f345.mm.R.C30867xcad56011.apj);
            i0Var.h();
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterPanel$initListeners$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
