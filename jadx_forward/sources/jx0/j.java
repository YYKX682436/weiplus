package jx0;

/* loaded from: classes5.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jx0.k f383909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jx0.d f383910e;

    public j(jx0.k kVar, jx0.d dVar) {
        this.f383909d = kVar;
        this.f383910e = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/widgets/MJExportDialog$setCancelClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        jx0.k kVar = this.f383909d;
        if (!kVar.f383916i) {
            kVar.c(true);
            kVar.f383917m = ((hx0.d) this.f383910e).f367146a.c("click");
            boolean z17 = kVar.f383916i;
            boolean z18 = kVar.f383917m;
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/widgets/MJExportDialog$setCancelClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
