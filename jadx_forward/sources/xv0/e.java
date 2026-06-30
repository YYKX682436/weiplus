package xv0;

/* loaded from: classes5.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xv0.g f538914d;

    public e(xv0.g gVar) {
        this.f538914d = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/subpanels/color/ColorAdjPanel$setupViews$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.a m176030x2c77c188 = this.f538914d.m176030x2c77c188();
        if (m176030x2c77c188 != null) {
            m176030x2c77c188.mo152xb9724478();
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/subpanels/color/ColorAdjPanel$setupViews$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
