package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes.dex */
public class n5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17403xdaca9e1b f242881d;

    public n5(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17403xdaca9e1b activityC17403xdaca9e1b) {
        this.f242881d = activityC17403xdaca9e1b;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17403xdaca9e1b activityC17403xdaca9e1b = this.f242881d;
        if (itemId == 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(activityC17403xdaca9e1b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573826fz0));
            db5.t7.i(activityC17403xdaca9e1b, activityC17403xdaca9e1b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iow), com.p314xaae8f345.mm.R.C30861xcebc809e.f78121x77ac3fa);
            jx3.f.INSTANCE.mo68477x336bdfd8(250L, 32L, 1L, false);
            return;
        }
        if (itemId != 1) {
            return;
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL");
        intent.setFlags(268435456);
        intent.setData(android.net.Uri.parse("tel:" + activityC17403xdaca9e1b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573826fz0)));
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17403xdaca9e1b activityC17403xdaca9e1b2 = this.f242881d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC17403xdaca9e1b2, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutMicroMsgUI$15", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC17403xdaca9e1b2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC17403xdaca9e1b2, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutMicroMsgUI$15", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        jx3.f.INSTANCE.mo68477x336bdfd8(250L, 31L, 1L, false);
    }
}
