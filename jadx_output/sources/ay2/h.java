package ay2;

/* loaded from: classes5.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ay2.i f15238d;

    public h(ay2.i iVar) {
        this.f15238d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/teens/FinderTeensGuideBtmDialog$initView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ay2.i iVar = this.f15238d;
        iVar.getClass();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USREINFO_FINDER_TEENS_GUIDE_DONT_REMIND_ME_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        ay2.a[] aVarArr = ay2.a.f15231d;
        iVar.b(3);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/teens/FinderTeensGuideBtmDialog$initView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
