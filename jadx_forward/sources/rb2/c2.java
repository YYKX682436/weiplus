package rb2;

/* loaded from: classes10.dex */
public final class c2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rb2.z2 f475129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f475130e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f475131f;

    public c2(rb2.z2 z2Var, so2.y0 y0Var, in5.s0 s0Var) {
        this.f475129d = z2Var;
        this.f475130e = y0Var;
        this.f475131f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$onBindViewHolder$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f475129d.q(this.f475130e, this.f475131f, true);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$onBindViewHolder$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
