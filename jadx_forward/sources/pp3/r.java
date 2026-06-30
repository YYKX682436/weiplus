package pp3;

/* loaded from: classes5.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pp3.u f439028d;

    public r(pp3.u uVar) {
        this.f439028d = uVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/patmsg/ui/PatSuffixSettingDialog$initContentView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pp3.u uVar = this.f439028d;
        android.widget.EditText editText = (android.widget.EditText) uVar.findViewById(com.p314xaae8f345.mm.R.id.kpy);
        if (editText != null) {
            android.text.Editable text = editText.getText();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text, "getText(...)");
            uVar.getClass();
            r45.mo4 mo4Var = new r45.mo4();
            java.lang.String o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o(text.toString());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "escapeStringForUCC(...)");
            int length = o17.length() - 1;
            int i17 = 0;
            boolean z17 = false;
            while (i17 <= length) {
                boolean z18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(o17.charAt(!z17 ? i17 : length), 32) <= 0;
                if (z17) {
                    if (!z18) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z18) {
                    i17++;
                } else {
                    z17 = true;
                }
            }
            mo4Var.f462245d = o17.subSequence(i17, length + 1).toString();
            ((e21.f) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).aj()).b(new xg3.p0(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508, mo4Var));
            android.content.Context context = uVar.f439032f;
            uVar.f439040q = db5.e1.Q(context, "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gy7), false, false, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/patmsg/ui/PatSuffixSettingDialog$initContentView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
