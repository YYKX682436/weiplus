package e33;

/* loaded from: classes10.dex */
public class h implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e33.b0 f328775d;

    public h(e33.b0 b0Var) {
        this.f328775d = b0Var;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/AlbumAdapter$6", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.f566921hj1);
        if (tag instanceof java.lang.Integer) {
            int intValue = ((java.lang.Integer) tag).intValue();
            e33.b0 b0Var = this.f328775d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 E = b0Var.E(intValue);
            if (E != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.d(b0Var.f328662e, "media info", E.mo63661x9616526c(), null);
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/gallery/ui/AlbumAdapter$6", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
