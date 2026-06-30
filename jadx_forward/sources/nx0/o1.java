package nx0;

/* loaded from: classes5.dex */
public final class o1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nx0.q1 f422720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f422721e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nx0.r1 f422722f;

    public o1(nx0.q1 q1Var, int i17, nx0.r1 r1Var) {
        this.f422720d = q1Var;
        this.f422721e = i17;
        this.f422722f = r1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/FaceEffectAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f422720d.f422737f.mo149xb9724478(java.lang.Integer.valueOf(this.f422721e), this.f422722f);
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/FaceEffectAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
