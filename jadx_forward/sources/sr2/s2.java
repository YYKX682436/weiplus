package sr2;

/* loaded from: classes8.dex */
public final class s2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f493244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sr2.y2 f493245e;

    public s2(android.widget.CheckBox checkBox, sr2.y2 y2Var) {
        this.f493244d = checkBox;
        this.f493245e = y2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/post/PostLocationUIC$showGroupPurchaseSharePlanDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean isChecked = this.f493244d.isChecked();
        sr2.y2 y2Var = this.f493245e;
        if (isChecked) {
            y2Var.O6();
        } else {
            java.lang.String string = y2Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572804dd0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            ex2.a aVar = new ex2.a(string, 0, false, new sr2.o2(y2Var));
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(y2Var.m80379x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570359b93, (android.view.ViewGroup) null, false);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.mhz);
            if (textView != null) {
                com.p314xaae8f345.mm.ui.fk.a(textView);
            }
            com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc c23001x9d3a0bdc = (com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) inflate.findViewById(com.p314xaae8f345.mm.R.id.mic);
            if (c23001x9d3a0bdc != null) {
                java.lang.CharSequence a17 = c23001x9d3a0bdc.a();
                android.text.SpannableString spannableString = new android.text.SpannableString(a17);
                spannableString.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yl(a17.toString(), y2Var.m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c), y2Var.m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e), false, false, new sr2.m2(y2Var)), 0, a17.length(), 17);
                c23001x9d3a0bdc.b(spannableString);
            }
            android.view.View inflate2 = com.p314xaae8f345.mm.ui.id.b(y2Var.m80379x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ba8, (android.view.ViewGroup) null, false);
            android.widget.TextView textView2 = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.qxi);
            if (textView2 != null) {
                textView2.setText(y2Var.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571906t6));
            }
            if (textView2 != null) {
                com.p314xaae8f345.mm.ui.fk.a(textView2);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 d17 = ex2.e.f338737a.d(y2Var.m80379x76847179(), inflate, aVar, inflate2);
            android.widget.Button button = d17.f293605x;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(button, "getBtnSingle(...)");
            com.p314xaae8f345.mm.ui.fk.a(button);
            textView2.setOnClickListener(new sr2.n2(d17));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/post/PostLocationUIC$showGroupPurchaseSharePlanDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
