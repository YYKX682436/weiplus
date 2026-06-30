package d45;

/* loaded from: classes10.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d45.q f307981d;

    public k(d45.q qVar) {
        this.f307981d = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        d45.d dVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$mOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.f566921hj1);
        int intValue = tag instanceof java.lang.Integer ? ((java.lang.Number) tag).intValue() : -1;
        java.lang.Object tag2 = view.getTag(com.p314xaae8f345.mm.R.id.hju);
        int intValue2 = tag2 instanceof java.lang.Integer ? ((java.lang.Number) tag2).intValue() : -1;
        if (intValue != -1 && intValue2 != -1 && (dVar = this.f307981d.f307997q) != null && dVar != null) {
            dVar.b(intValue, view, intValue2);
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$mOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
