package cm2;

/* loaded from: classes3.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.of1 f43343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f43344e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.h f43345f;

    public g(r45.of1 of1Var, int i17, cm2.h hVar) {
        this.f43343d = of1Var;
        this.f43344e = i17;
        this.f43345f = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        yz5.l lVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/convert/FinderLiveSwitchRoleConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.of1 of1Var = this.f43343d;
        if (of1Var.getInteger(2) != this.f43344e && (lVar = this.f43345f.f43347e) != null) {
            lVar.invoke(java.lang.Integer.valueOf(of1Var.getInteger(2)));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/convert/FinderLiveSwitchRoleConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
