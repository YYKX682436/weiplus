package bp4;

/* loaded from: classes8.dex */
public final class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.o0 f104822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f104823e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ro4.e f104824f;

    public n0(bp4.o0 o0Var, int i17, ro4.e eVar) {
        this.f104822d = o0Var;
        this.f104823e = i17;
        this.f104824f = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/MagicPanelAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.p pVar = this.f104822d.f104839e;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Integer.valueOf(this.f104823e), this.f104824f);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/MagicPanelAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
