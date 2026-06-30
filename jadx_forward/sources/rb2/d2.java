package rb2;

/* loaded from: classes10.dex */
public final class d2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rb2.z2 f475143d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f475144e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f475145f;

    public d2(rb2.z2 z2Var, so2.y0 y0Var, in5.s0 s0Var) {
        this.f475143d = z2Var;
        this.f475144e = y0Var;
        this.f475145f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$onBindViewHolder$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f475143d.q(this.f475144e, this.f475145f, false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$onBindViewHolder$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
