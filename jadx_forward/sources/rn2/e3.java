package rn2;

/* loaded from: classes15.dex */
public final class e3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.n30 f479252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rn2.z2 f479253e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rn2.y2 f479254f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rn2.h3 f479255g;

    public e3(r45.n30 n30Var, rn2.z2 z2Var, rn2.y2 y2Var, rn2.h3 h3Var) {
        this.f479252d = n30Var;
        this.f479253e = z2Var;
        this.f479254f = y2Var;
        this.f479255g = h3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/create/GiftSelectorAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.n30 n30Var = this.f479252d;
        int m75939xb282bd08 = n30Var.m75939xb282bd08(1) + 1;
        rn2.z2 z2Var = this.f479253e;
        z2Var.f479469e.setText(java.lang.String.valueOf(m75939xb282bd08), android.widget.TextView.BufferType.EDITABLE);
        n30Var.set(1, java.lang.Integer.valueOf(m75939xb282bd08));
        this.f479254f.f479459a = true;
        z2Var.f479472h.setChecked(true);
        rn2.h3 h3Var = this.f479255g;
        yz5.a aVar = h3Var.f479292e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        h3Var.m8146xced61ae5();
        z2Var.f479475n.setAlpha(1.0f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/create/GiftSelectorAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
