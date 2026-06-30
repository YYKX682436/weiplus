package km3;

/* loaded from: classes10.dex */
public final class r implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km3.t f390791d;

    public r(km3.t tVar) {
        this.f390791d = tVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$onItemViewLongClick$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.f566922hj2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tag, "getTag(...)");
        if (tag instanceof java.lang.Integer) {
            int intValue = ((java.lang.Number) tag).intValue();
            km3.t tVar = this.f390791d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 x17 = tVar.x(intValue);
            if (x17 != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.d(tVar.f390793d, "media info", x17.mo63661x9616526c(), null);
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$onItemViewLongClick$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
