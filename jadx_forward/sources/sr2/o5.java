package sr2;

/* loaded from: classes5.dex */
public final class o5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.p5 f493198d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.r03 f493199e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f493200f;

    public o5(sr2.p5 p5Var, r45.r03 r03Var, int i17) {
        this.f493198d = p5Var;
        this.f493199e = r03Var;
        this.f493200f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/post/PostTopicUIC$RvAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f493198d.f493208e.mo149xb9724478(this.f493199e.m75945x2fec8307(0), java.lang.Integer.valueOf(this.f493200f + 1));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/post/PostTopicUIC$RvAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
