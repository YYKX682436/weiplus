package nx0;

/* loaded from: classes5.dex */
public final class y2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nx0.a3 f422801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f422802e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nx0.b3 f422803f;

    public y2(nx0.a3 a3Var, int i17, nx0.b3 b3Var) {
        this.f422801d = a3Var;
        this.f422802e = i17;
        this.f422803f = b3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/MakeupAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f422801d.f422601f.mo149xb9724478(java.lang.Integer.valueOf(this.f422802e), this.f422803f);
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/MakeupAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
