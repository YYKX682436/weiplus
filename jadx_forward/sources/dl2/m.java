package dl2;

/* loaded from: classes3.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.n30 f316773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dl2.f0 f316774e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dl2.q f316775f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dl2.f f316776g;

    public m(r45.n30 n30Var, dl2.f0 f0Var, dl2.q qVar, dl2.f fVar) {
        this.f316773d = n30Var;
        this.f316774e = f0Var;
        this.f316775f = qVar;
        this.f316776g = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView$GiftChooseAdapter$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.n30 n30Var = this.f316773d;
        int m75939xb282bd08 = n30Var.m75939xb282bd08(1) + 1;
        dl2.f0 f0Var = this.f316774e;
        int i17 = f0Var.f316747r;
        dl2.q qVar = this.f316775f;
        if (m75939xb282bd08 <= i17) {
            qVar.f316785e.setText(java.lang.String.valueOf(m75939xb282bd08), android.widget.TextView.BufferType.EDITABLE);
            n30Var.set(1, java.lang.Integer.valueOf(m75939xb282bd08));
            this.f316776g.f316728a = true;
            qVar.f316788h.setChecked(true);
            f0Var.b();
        }
        qVar.f316791n.setAlpha(1.0f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView$GiftChooseAdapter$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
