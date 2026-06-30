package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes8.dex */
public class ml implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17458xf546b9e7 f242868d;

    public ml(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17458xf546b9e7 activityC17458xf546b9e7) {
        this.f242868d = activityC17458xf546b9e7;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17458xf546b9e7 activityC17458xf546b9e7 = this.f242868d;
        android.text.Editable text = activityC17458xf546b9e7.f242167d.m80997xdc5215a6().m80966xdb574fcd().getText();
        activityC17458xf546b9e7.f242167d.m80997xdc5215a6().m80966xdb574fcd().clearFocus();
        activityC17458xf546b9e7.mo48674x36654fab();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(text)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17458xf546b9e7.T6(activityC17458xf546b9e7, text.toString().trim());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
