package nx0;

/* loaded from: classes5.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nx0.u f422751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f422752e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nx0.x f422753f;

    public s(nx0.u uVar, int i17, nx0.x xVar) {
        this.f422751d = uVar;
        this.f422752e = i17;
        this.f422753f = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautyAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f422751d.f422768g.mo149xb9724478(java.lang.Integer.valueOf(this.f422752e), this.f422753f);
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautyAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
