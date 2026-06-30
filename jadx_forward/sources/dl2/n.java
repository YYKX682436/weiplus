package dl2;

/* loaded from: classes3.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.n30 f316777d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dl2.f0 f316778e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dl2.q f316779f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dl2.f f316780g;

    public n(r45.n30 n30Var, dl2.f0 f0Var, dl2.q qVar, dl2.f fVar) {
        this.f316777d = n30Var;
        this.f316778e = f0Var;
        this.f316779f = qVar;
        this.f316780g = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView$GiftChooseAdapter$onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.n30 n30Var = this.f316777d;
        int m75939xb282bd08 = n30Var.m75939xb282bd08(1) - 1;
        dl2.f0 f0Var = this.f316778e;
        f0Var.getClass();
        dl2.q qVar = this.f316779f;
        if (m75939xb282bd08 >= 0) {
            qVar.f316785e.setText(java.lang.String.valueOf(m75939xb282bd08), android.widget.TextView.BufferType.EDITABLE);
            n30Var.set(1, java.lang.Integer.valueOf(m75939xb282bd08));
            f0Var.getClass();
            if (m75939xb282bd08 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f0Var.f316731b, "giftCountMinus click to 0");
                qVar.f316788h.setChecked(false);
                this.f316780g.f316728a = false;
            }
        }
        int m75939xb282bd082 = n30Var.m75939xb282bd08(1);
        f0Var.getClass();
        if (m75939xb282bd082 == 0) {
            qVar.f316791n.setAlpha(0.3f);
        } else {
            qVar.f316791n.setAlpha(1.0f);
        }
        f0Var.b();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView$GiftChooseAdapter$onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
