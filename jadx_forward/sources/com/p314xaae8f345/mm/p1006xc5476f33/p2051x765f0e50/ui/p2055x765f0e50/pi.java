package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public class pi implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17442xea4ad84b f242978d;

    public pi(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17442xea4ad84b activityC17442xea4ad84b) {
        this.f242978d = activityC17442xea4ad84b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsModifyPatSuffixUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17442xea4ad84b activityC17442xea4ad84b = this.f242978d;
        activityC17442xea4ad84b.mo48674x36654fab();
        android.text.Editable text = activityC17442xea4ad84b.f242084f.getText();
        activityC17442xea4ad84b.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsModifyPatSuffixUI", "doModifyPatSuffixScene %s", text);
        r45.mo4 mo4Var = new r45.mo4();
        mo4Var.f462245d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o(text.toString()).trim();
        ((e21.f) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).aj()).b(new xg3.p0(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508, mo4Var));
        activityC17442xea4ad84b.f242087i = db5.e1.Q(activityC17442xea4ad84b.mo55332x76847179(), "", activityC17442xea4ad84b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gy7), false, false, null);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyPatSuffixUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
