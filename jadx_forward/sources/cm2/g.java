package cm2;

/* loaded from: classes3.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.of1 f124876d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f124877e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.h f124878f;

    public g(r45.of1 of1Var, int i17, cm2.h hVar) {
        this.f124876d = of1Var;
        this.f124877e = i17;
        this.f124878f = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        yz5.l lVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/convert/FinderLiveSwitchRoleConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.of1 of1Var = this.f124876d;
        if (of1Var.m75939xb282bd08(2) != this.f124877e && (lVar = this.f124878f.f124880e) != null) {
            lVar.mo146xb9724478(java.lang.Integer.valueOf(of1Var.m75939xb282bd08(2)));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/convert/FinderLiveSwitchRoleConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
