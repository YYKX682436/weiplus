package dg2;

/* loaded from: classes2.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f313832d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dg2.m f313833e;

    public i(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, dg2.m mVar) {
        this.f313832d = c0Var;
        this.f313833e = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/convert/view/LiveQuestBottomSheet$show$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f313832d.f391645d = true;
        dg2.m mVar = this.f313833e;
        yz5.l lVar = mVar.f313844f;
        if (lVar != null) {
            lVar.mo146xb9724478(mVar.a().f313822e);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = mVar.f313846h;
        if (k0Var != null) {
            k0Var.u();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/convert/view/LiveQuestBottomSheet$show$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
