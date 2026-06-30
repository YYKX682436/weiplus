package vw3;

/* loaded from: classes.dex */
public final class c6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f522445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerTestConfigUI f522446e;

    public c6(android.widget.EditText editText, com.tencent.mm.plugin.repairer.ui.RepairerTestConfigUI repairerTestConfigUI) {
        this.f522445d = editText;
        this.f522446e = repairerTestConfigUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerTestConfigUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        x51.o1.f533592l = java.lang.Integer.parseInt(this.f522445d.getText().toString());
        dp.a.m125853x26a183b((android.content.Context) this.f522446e, com.p314xaae8f345.mm.R.C30867xcad56011.f572013w9, 0).show();
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerTestConfigUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
