package nr2;

/* loaded from: classes.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nr2.l f420700d;

    public c(nr2.l lVar) {
        this.f420700d = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/paidcollection/FinderCollectionPreviewItemUIC$createView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        nr2.l lVar = this.f420700d;
        android.app.Activity context = lVar.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        nr2.u0 u0Var = (nr2.u0) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(nr2.u0.class);
        if (u0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            u0Var.O6(view, lVar.f420789i);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/paidcollection/FinderCollectionPreviewItemUIC$createView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
