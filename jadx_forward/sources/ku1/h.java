package ku1;

/* loaded from: classes15.dex */
public class h implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku1.i f393622d;

    public h(ku1.i iVar) {
        this.f393622d = iVar;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/view/CardBaseCodeView$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (view.getId() == com.p314xaae8f345.mm.R.id.c0u) {
            ku1.i iVar = this.f393622d;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.d(iVar.f393626b, null, iVar.f393628d.i0().f466722o, null);
            db5.e1.T(iVar.f393626b, ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) iVar.f393665a).h(com.p314xaae8f345.mm.R.C30867xcad56011.f571894st));
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/card/ui/view/CardBaseCodeView$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
