package vw0;

/* loaded from: classes5.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vw0.i0 f522302d;

    public c0(vw0.i0 i0Var) {
        this.f522302d = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/TextStyleView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vw0.d0 m172801x677cf0d8 = this.f522302d.m172801x677cf0d8();
        if (m172801x677cf0d8 != null) {
            m172801x677cf0d8.p0();
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/TextStyleView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
