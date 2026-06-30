package rv0;

/* loaded from: classes5.dex */
public final class f7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.j7 f481540d;

    public f7(rv0.j7 j7Var) {
        this.f481540d = j7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/SpeedEditingPanel$setupViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.a m163174x2c77c188 = this.f481540d.m163174x2c77c188();
        if (m163174x2c77c188 != null) {
            m163174x2c77c188.mo152xb9724478();
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/SpeedEditingPanel$setupViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
