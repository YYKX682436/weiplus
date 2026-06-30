package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes8.dex */
public class ll implements tj5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17458xf546b9e7 f242833d;

    public ll(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17458xf546b9e7 activityC17458xf546b9e7) {
        this.f242833d = activityC17458xf546b9e7;
    }

    @Override // tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsSearchAuthUI", "onEditTextChange search totalText %s", str);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17458xf546b9e7.f242166z;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17458xf546b9e7 activityC17458xf546b9e7 = this.f242833d;
        activityC17458xf546b9e7.W6();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17458xf546b9e7.V6(activityC17458xf546b9e7);
            return;
        }
        android.view.View view = activityC17458xf546b9e7.f242168e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "showSearchBgView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "showSearchBgView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        activityC17458xf546b9e7.f242170g.setVisibility(0);
        activityC17458xf546b9e7.f242172i.setVisibility(8);
        activityC17458xf546b9e7.f242171h.setVisibility(8);
        activityC17458xf546b9e7.f242175o.setVisibility(8);
        ((java.util.ArrayList) activityC17458xf546b9e7.f242173m).clear();
        activityC17458xf546b9e7.m78548x39037dd1();
        java.lang.String string = activityC17458xf546b9e7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572082y8);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(string + " " + str.trim());
        f0Var.c(new android.text.style.ForegroundColorSpan(activityC17458xf546b9e7.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560267fp)), string.length(), f0Var.length(), 33);
        activityC17458xf546b9e7.f242170g.setText(f0Var);
    }

    @Override // tj5.n
    public boolean G0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17458xf546b9e7 activityC17458xf546b9e7 = this.f242833d;
        android.text.Editable text = activityC17458xf546b9e7.f242167d.m80997xdc5215a6().m80966xdb574fcd().getText();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsSearchAuthUI", "search key down text: %s", text.toString());
        activityC17458xf546b9e7.f242170g.setVisibility(8);
        activityC17458xf546b9e7.f242167d.m80997xdc5215a6().m80966xdb574fcd().clearFocus();
        activityC17458xf546b9e7.mo48674x36654fab();
        activityC17458xf546b9e7.m78548x39037dd1();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(text)) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17458xf546b9e7.T6(activityC17458xf546b9e7, text.toString().trim());
        return true;
    }

    @Override // tj5.n
    public void U1(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsSearchAuthUI", "searchView hasFocus %s", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17458xf546b9e7 activityC17458xf546b9e7 = this.f242833d;
        if (z17) {
            activityC17458xf546b9e7.mo26063x7b383410();
        } else {
            activityC17458xf546b9e7.mo48674x36654fab();
        }
    }

    @Override // tj5.n
    public void o3(int i17, tj5.x xVar) {
    }

    @Override // tj5.n
    /* renamed from: onClickClearTextBtn */
    public void mo56570x81f2906b(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsSearchAuthUI", "clear search text");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17458xf546b9e7.f242166z;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17458xf546b9e7 activityC17458xf546b9e7 = this.f242833d;
        activityC17458xf546b9e7.W6();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17458xf546b9e7.V6(activityC17458xf546b9e7);
    }
}
