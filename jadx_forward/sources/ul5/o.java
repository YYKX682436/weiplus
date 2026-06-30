package ul5;

/* loaded from: classes15.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ul5.x f510170d;

    public o(ul5.x xVar) {
        this.f510170d = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        ul5.x xVar = this.f510170d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/pulldown/NestScrollBounceSettingDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            java.lang.Object mo141623x754a37bb = ((jz5.n) xVar.f510183n).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            ul5.y.f510193d = (int) java.lang.Float.parseFloat(((android.widget.EditText) mo141623x754a37bb).getText().toString());
            java.lang.Object mo141623x754a37bb2 = ((jz5.n) xVar.f510184o).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
            ul5.y.f510194e = (int) java.lang.Float.parseFloat(((android.widget.EditText) mo141623x754a37bb2).getText().toString());
            java.lang.Object mo141623x754a37bb3 = ((jz5.n) xVar.f510186q).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
            ul5.y.f510192c = (int) java.lang.Float.parseFloat(((android.widget.EditText) mo141623x754a37bb3).getText().toString());
            java.lang.Object mo141623x754a37bb4 = ((jz5.n) xVar.f510185p).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb4, "getValue(...)");
            ul5.y.f510191b = (int) java.lang.Float.parseFloat(((android.widget.EditText) mo141623x754a37bb4).getText().toString());
            java.lang.Object mo141623x754a37bb5 = ((jz5.n) xVar.f510187r).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb5, "getValue(...)");
            ul5.y.f510190a = java.lang.Float.parseFloat(((android.widget.EditText) mo141623x754a37bb5).getText().toString());
        } catch (java.lang.Throwable unused) {
        }
        xVar.dismiss();
        yj0.a.h(this, "com/tencent/mm/ui/widget/pulldown/NestScrollBounceSettingDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
