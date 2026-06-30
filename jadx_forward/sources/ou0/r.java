package ou0;

/* loaded from: classes5.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f430438d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ou0.s f430439e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4187xe514cceb f430440f;

    public r(yz5.a aVar, ou0.s sVar, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4187xe514cceb c4187xe514cceb) {
        this.f430438d = aVar;
        this.f430439e = sVar;
        this.f430440f = c4187xe514cceb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/MovieTitleTipManager$tryAddMovieMovieTitleTip$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f430438d.mo152xb9724478();
        this.f430439e.a(true, this.f430440f);
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/MovieTitleTipManager$tryAddMovieMovieTitleTip$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
