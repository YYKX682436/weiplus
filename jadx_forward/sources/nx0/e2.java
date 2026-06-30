package nx0;

/* loaded from: classes5.dex */
public final class e2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nx0.g2 f422632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f422633e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nx0.i2 f422634f;

    public e2(nx0.g2 g2Var, int i17, nx0.i2 i2Var) {
        this.f422632d = g2Var;
        this.f422633e = i17;
        this.f422634f = i2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/FilterAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f422632d.f422653f.mo149xb9724478(java.lang.Integer.valueOf(this.f422633e), this.f422634f);
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/FilterAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
