package ku1;

/* loaded from: classes15.dex */
public class j implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt1.j f393637d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ku1.l f393638e;

    public j(ku1.l lVar, tt1.j jVar) {
        this.f393638e = lVar;
        this.f393637d = jVar;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/view/CardBaseCodeViewController$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (view.getId() == com.p314xaae8f345.mm.R.id.c0u) {
            ku1.l lVar = this.f393638e;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.d(lVar.f393664b, null, this.f393637d.i0().f466722o, null);
            db5.e1.T(lVar.f393664b, kk.v.a(com.p314xaae8f345.mm.R.C30867xcad56011.f571894st));
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/card/ui/view/CardBaseCodeViewController$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
