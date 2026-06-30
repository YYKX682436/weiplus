package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public class wg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17437x244fdb47 f243239d;

    public wg(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17437x244fdb47 activityC17437x244fdb47) {
        this.f243239d = activityC17437x244fdb47;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17437x244fdb47 activityC17437x244fdb47 = this.f243239d;
        android.text.Editable text = activityC17437x244fdb47.f242054f.getText();
        activityC17437x244fdb47.getClass();
        if (text.length() >= 6 && text.length() <= 20) {
            activityC17437x244fdb47.mo48674x36654fab();
            activityC17437x244fdb47.a7("");
            java.lang.String obj = activityC17437x244fdb47.f242054f.getText().toString();
            activityC17437x244fdb47.getClass();
            activityC17437x244fdb47.f242061p = new v61.j0(obj);
            activityC17437x244fdb47.f242060o = db5.e1.Q(activityC17437x244fdb47.mo55332x76847179(), "", activityC17437x244fdb47.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572085yb), false, true, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.zg(activityC17437x244fdb47));
            gm0.j1.d().g(activityC17437x244fdb47.f242061p);
        } else {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6746x43f2e743 c6746x43f2e743 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6746x43f2e743();
            c6746x43f2e743.p(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17413x56438321.f241849r);
            c6746x43f2e743.f140772e = 4L;
            c6746x43f2e743.f140773f = 5L;
            c6746x43f2e743.k();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
