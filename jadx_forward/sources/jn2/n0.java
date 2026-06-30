package jn2;

/* loaded from: classes10.dex */
public final class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.z22 f382185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jn2.r0 f382186e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jn2.p0 f382187f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f382188g;

    public n0(r45.z22 z22Var, jn2.r0 r0Var, jn2.p0 p0Var, int i17) {
        this.f382185d = z22Var;
        this.f382186e = r0Var;
        this.f382187f = p0Var;
        this.f382188g = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongEditPanelAdapter$EditViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.z22 z22Var = this.f382185d;
        java.lang.String str = z22Var.f473162f;
        if (str != null) {
            jn2.r0 r0Var = this.f382186e;
            boolean contains = r0Var.f382212h.contains(str);
            java.util.Set set = r0Var.f382212h;
            if (contains) {
                set.remove(str);
            } else {
                set.add(str);
            }
            this.f382187f.f382196d.setChecked(set.contains(str));
            yz5.p pVar = r0Var.f382213i;
            if (pVar != null) {
                pVar.mo149xb9724478(java.lang.Integer.valueOf(this.f382188g), z22Var);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongEditPanelAdapter$EditViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
