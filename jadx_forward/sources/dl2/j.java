package dl2;

/* loaded from: classes3.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dl2.f0 f316762d;

    public j(dl2.f0 f0Var) {
        this.f316762d = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dl2.f0 f0Var = this.f316762d;
        if (f0Var.f316740k.f316754b > f0Var.f316741l) {
            db5.t7.m(f0Var.f316730a.getContext(), f0Var.f316730a.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dif, ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).Zi(f0Var.f316741l)));
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (f0Var.f316752w > f0Var.f316742m) {
            db5.t7.m(f0Var.f316730a.getContext(), f0Var.f316730a.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dij, java.lang.Long.valueOf(f0Var.f316742m)));
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        f0Var.a(false);
        yz5.l lVar = f0Var.f316738i;
        if (lVar != null) {
            lVar.mo146xb9724478(f0Var.f316740k);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f0Var.f316731b, "chosenData = " + f0Var.f316740k);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
