package df2;

/* loaded from: classes3.dex */
public final class jk implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.pk f312019d;

    public jk(df2.pk pkVar) {
        this.f312019d = pkVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.na0 D0;
        r45.pa0 pa0Var;
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1623xc84f4f2f.p1624x373aa5.C14940x2aae97e1 c14940x2aae97e1;
        android.text.Editable text;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController$initView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.pk pkVar = this.f312019d;
        pkVar.d7(pkVar.B);
        ce2.i iVar = pkVar.f312605J;
        if (iVar != null && (D0 = iVar.D0()) != null && (pa0Var = (r45.pa0) D0.m75936x14adae67(1)) != null) {
            android.widget.EditText editText = pkVar.B;
            java.lang.String obj2 = (editText == null || (text = editText.getText()) == null) ? null : text.toString();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("edit custom gift text from:");
            java.lang.String m75945x2fec8307 = pa0Var.m75945x2fec8307(3);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            sb6.append(m75945x2fec8307);
            sb6.append(" to:");
            sb6.append(obj2);
            java.lang.String sb7 = sb6.toString();
            java.lang.String str = pkVar.f312606m;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
            if (pa0Var.m75933x41a8a7f2(0)) {
                pa0Var.set(3, obj2);
                pa0Var.set(5, "");
                pa0Var.set(4, java.lang.Boolean.TRUE);
                pkVar.f7("updateEditCustomText");
                java.util.Iterator it = pkVar.c7().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((android.view.View) obj).getId() == com.p314xaae8f345.mm.R.id.cpj) {
                            break;
                        }
                    }
                }
                android.view.View view2 = (android.view.View) obj;
                if (view2 != null) {
                    java.lang.String m75945x2fec83072 = pa0Var.m75945x2fec8307(3);
                    if (m75945x2fec83072 == null) {
                        m75945x2fec83072 = "";
                    }
                    pkVar.g7(view2, null, m75945x2fec83072);
                }
                java.lang.String m75945x2fec83073 = pa0Var.m75945x2fec8307(7);
                if (m75945x2fec83073 != null && (c14940x2aae97e1 = pkVar.f312612s) != null) {
                    java.lang.String m75945x2fec83074 = pa0Var.m75945x2fec8307(3);
                    if (m75945x2fec83074 == null) {
                        m75945x2fec83074 = "";
                    }
                    c14940x2aae97e1.j(m75945x2fec83073, m75945x2fec83074);
                }
                ce2.i iVar2 = pkVar.f312605J;
                r45.na0 D02 = iVar2 != null ? iVar2.D0() : null;
                boolean Z6 = pkVar.Z6("", pkVar.I, pkVar.f312605J);
                boolean a76 = pkVar.a7(pkVar.I, pkVar.f312605J);
                android.widget.TextView textView = pkVar.f312611r;
                if (textView != null) {
                    textView.setEnabled(a76);
                }
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("onCustomerEditText, componentChange:");
                sb8.append(Z6);
                sb8.append(",customGiftTextChange:");
                sb8.append(a76);
                sb8.append(", new customComponentList:");
                sb8.append(pkVar.b7(D02 != null ? D02.m75941xfb821914(0) : null));
                sb8.append(" customText:");
                sb8.append(D02 != null ? (r45.pa0) D02.m75936x14adae67(1) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb8.toString());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController$initView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
