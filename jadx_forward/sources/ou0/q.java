package ou0;

/* loaded from: classes.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f430437d;

    public q(yz5.a aVar) {
        this.f430437d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/MovieTitleTipManager$tryAddMovieMovieTitleTip$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f430437d.mo152xb9724478();
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/MovieTitleTipManager$tryAddMovieMovieTitleTip$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
