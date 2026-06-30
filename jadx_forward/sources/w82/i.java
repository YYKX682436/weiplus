package w82;

/* loaded from: classes12.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w82.k f525418d;

    public i(w82.k kVar) {
        this.f525418d = kVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/widget/FavEditFooter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        w82.j jVar = this.f525418d.f525436k;
        if (jVar == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            jVar.b();
            yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
