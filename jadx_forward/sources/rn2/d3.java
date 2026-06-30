package rn2;

/* loaded from: classes15.dex */
public final class d3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.z2 f479224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.n30 f479225e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rn2.h3 f479226f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rn2.y2 f479227g;

    public d3(rn2.z2 z2Var, r45.n30 n30Var, rn2.h3 h3Var, rn2.y2 y2Var) {
        this.f479224d = z2Var;
        this.f479225e = n30Var;
        this.f479226f = h3Var;
        this.f479227g = y2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/create/GiftSelectorAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rn2.z2 z2Var = this.f479224d;
        if (z2Var.f479472h.isChecked()) {
            r45.n30 n30Var = this.f479225e;
            if (n30Var.m75939xb282bd08(1) <= 0) {
                n30Var.set(1, 1);
                z2Var.f479469e.setText("1", android.widget.TextView.BufferType.EDITABLE);
            }
        }
        rn2.h3 h3Var = this.f479226f;
        java.util.LinkedList x17 = h3Var.x();
        if ((x17 instanceof java.util.Collection) && x17.isEmpty()) {
            i17 = 0;
        } else {
            java.util.Iterator it = x17.iterator();
            i17 = 0;
            while (it.hasNext()) {
                if (((rn2.y2) it.next()).f479459a && (i17 = i17 + 1) < 0) {
                    kz5.c0.o();
                    throw null;
                }
            }
        }
        int i18 = ((rn2.y2) kz5.n0.X(h3Var.x())).f479460b;
        boolean z17 = i17 >= i18;
        android.widget.CheckBox checkBox = z2Var.f479472h;
        this.f479227g.f479459a = !z17 && checkBox.isChecked();
        if (z17 && checkBox.isChecked()) {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573176lj4, java.lang.String.valueOf(i18));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            db5.t7.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, string);
        }
        yz5.a aVar = h3Var.f479292e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        h3Var.m8146xced61ae5();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/create/GiftSelectorAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
