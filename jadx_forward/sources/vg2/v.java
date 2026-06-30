package vg2;

/* loaded from: classes3.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.a0 f518130d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vg2.w f518131e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f518132f;

    public v(vg2.a0 a0Var, vg2.w wVar, int i17) {
        this.f518130d = a0Var;
        this.f518131e = wVar;
        this.f518132f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/gift/widget/GiftBatchSelectPanelWidget$ItemAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vg2.a0 a0Var = this.f518130d;
        tg2.h hVar = a0Var.f518000c;
        ce2.i iVar = a0Var.f518005h;
        java.lang.String str = iVar != null ? iVar.f67814x2c488eb6 : null;
        if (str == null) {
            str = "";
        }
        tg2.h.d(hVar, str, ((r45.pv1) this.f518131e.f518144d.get(this.f518132f)).m75939xb282bd08(0), null, 4, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/gift/widget/GiftBatchSelectPanelWidget$ItemAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
