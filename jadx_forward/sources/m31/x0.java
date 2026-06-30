package m31;

/* loaded from: classes9.dex */
public final class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m31.q0 f404764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m31.y0 f404765e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f404766f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f404767g;

    public x0(m31.q0 q0Var, m31.y0 y0Var, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        this.f404764d = q0Var;
        this.f404765e = y0Var;
        this.f404766f = i17;
        this.f404767g = k3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$ItemAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        m31.q0 q0Var = this.f404764d;
        ((m31.z0) q0Var).f404775e = !((m31.z0) q0Var).f404775e;
        m31.y0 y0Var = this.f404765e;
        int i17 = this.f404766f;
        y0Var.x(i17, ((m31.z0) q0Var).f404775e, true, (m31.s0) this.f404767g, (m31.q0) y0Var.f404770d.get(i17));
        yj0.a.h(this, "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$ItemAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
