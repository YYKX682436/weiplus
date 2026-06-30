package rb2;

/* loaded from: classes10.dex */
public final class t2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rb2.z2 f475305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f475306e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f475307f;

    public t2(rb2.z2 z2Var, android.widget.TextView textView, in5.s0 s0Var) {
        this.f475305d = z2Var;
        this.f475306e = textView;
        this.f475307f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshPostState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter nPresenter = this.f475305d.f475219e;
        android.widget.TextView commentFailTV = this.f475306e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(commentFailTV, "$commentFailTV");
        nPresenter.E(commentFailTV, this.f475307f.m8183xf806b362());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshPostState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
