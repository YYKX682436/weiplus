package in2;

/* loaded from: classes10.dex */
public final class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.q0 f374406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in2.o0 f374407e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f374408f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.yg f374409g;

    public p0(in2.q0 q0Var, in2.o0 o0Var, int i17, dk2.yg ygVar) {
        this.f374406d = q0Var;
        this.f374407e = o0Var;
        this.f374408f = i17;
        this.f374409g = ygVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongEditAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in2.q0 q0Var = this.f374406d;
        q0Var.getClass();
        dk2.yg ygVar = this.f374409g;
        boolean z17 = !ygVar.f315929d;
        ygVar.f315929d = z17;
        in2.o0 o0Var = this.f374407e;
        o0Var.f374399d.setChecked(z17);
        yz5.q qVar = q0Var.f374415h;
        if (qVar != null) {
            android.view.View itemView = o0Var.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            qVar.mo147xb9724478(itemView, java.lang.Integer.valueOf(this.f374408f), ygVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongEditAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
