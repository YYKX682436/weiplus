package d45;

/* loaded from: classes10.dex */
public final class m implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d45.q f307983d;

    public m(d45.q qVar) {
        this.f307983d = qVar;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$onItemViewLongClick$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        java.lang.Object tag = v17.getTag(com.p314xaae8f345.mm.R.id.f566921hj1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tag, "getTag(...)");
        if (tag instanceof java.lang.Integer) {
            int intValue = ((java.lang.Number) tag).intValue();
            d45.q qVar = this.f307983d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 z17 = qVar.z(intValue);
            if (z17 != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.d(qVar.f307987d, "media info", z17.mo63661x9616526c(), null);
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$onItemViewLongClick$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
