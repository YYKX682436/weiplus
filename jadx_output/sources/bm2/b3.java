package bm2;

/* loaded from: classes3.dex */
public final class b3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.z2 f21789d;

    public b3(bm2.z2 z2Var) {
        this.f21789d = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveFastCommentAdapter$bindComment$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f21789d.f22478d.setText("");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveFastCommentAdapter$bindComment$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
