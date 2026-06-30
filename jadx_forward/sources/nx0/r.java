package nx0;

/* loaded from: classes5.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nx0.u f422739d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f422740e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nx0.x f422741f;

    public r(nx0.u uVar, int i17, nx0.x xVar) {
        this.f422739d = uVar;
        this.f422740e = i17;
        this.f422741f = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautyAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f422739d.f422768g.mo149xb9724478(java.lang.Integer.valueOf(this.f422740e), this.f422741f);
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautyAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
