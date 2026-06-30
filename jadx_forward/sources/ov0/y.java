package ov0;

/* loaded from: classes5.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ov0.i0 f430692d;

    public y(ov0.i0 i0Var) {
        this.f430692d = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        ov0.t tVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/textedit/TextEditTabPanelUIC$onFirstAttached$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ov0.i0 i0Var = this.f430692d;
        ov0.t tVar2 = (ov0.t) i0Var.f150773i;
        ov0.e m157204x661a2673 = tVar2 != null ? tVar2.m157204x661a2673() : null;
        ov0.e eVar = ov0.e.f430658e;
        if (m157204x661a2673 != eVar && (tVar = (ov0.t) i0Var.f150773i) != null) {
            tVar.R(eVar);
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/textedit/TextEditTabPanelUIC$onFirstAttached$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
