package qh2;

/* loaded from: classes10.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qh2.d f444967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lj2.x0 f444968e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lj2.v0 f444969f;

    public a(qh2.d dVar, lj2.x0 x0Var, lj2.v0 v0Var) {
        this.f444967d = dVar;
        this.f444968e = x0Var;
        this.f444969f = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/ktv/widget/KTVSingMicAnchorCoverWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qh2.d dVar = this.f444967d;
        boolean G = dVar.G();
        lj2.x0 x0Var = this.f444968e;
        if (G || x0Var.V()) {
            zh2.b m17 = x0Var.m();
            if (m17 != null) {
                ((ch2.o2) m17).z7(4);
            }
            lf2.a aVar = (lf2.a) this.f444969f.o(lf2.a.class);
            if (aVar != null) {
                aVar.Z6(2, 4);
            }
        } else {
            dVar.X();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/ktv/widget/KTVSingMicAnchorCoverWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
