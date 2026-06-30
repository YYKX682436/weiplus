package vw0;

/* loaded from: classes5.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vw0.i0 f522300d;

    public b0(vw0.i0 i0Var) {
        this.f522300d = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/TextStyleView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vw0.d0 m172801x677cf0d8 = this.f522300d.m172801x677cf0d8();
        if (m172801x677cf0d8 != null) {
            m172801x677cf0d8.l5();
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/TextStyleView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
