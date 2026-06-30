package rb2;

/* loaded from: classes10.dex */
public final class s2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rb2.z2 f475289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f475290e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f475291f;

    public s2(rb2.z2 z2Var, in5.s0 s0Var, so2.y0 y0Var) {
        this.f475289d = z2Var;
        this.f475290e = s0Var;
        this.f475291f = y0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshMoreIv$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter nPresenter = this.f475289d.f475219e;
        android.view.View itemView = this.f475290e.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        nPresenter.u(itemView, this.f475291f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshMoreIv$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
