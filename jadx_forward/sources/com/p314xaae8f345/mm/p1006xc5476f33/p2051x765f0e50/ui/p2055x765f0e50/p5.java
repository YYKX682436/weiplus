package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes.dex */
public class p5 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17403xdaca9e1b f242957d;

    public p5(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17403xdaca9e1b activityC17403xdaca9e1b) {
        this.f242957d = activityC17403xdaca9e1b;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsAboutMicroMsgUI$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17403xdaca9e1b activityC17403xdaca9e1b = this.f242957d;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(activityC17403xdaca9e1b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cu_));
        db5.t7.i(activityC17403xdaca9e1b, activityC17403xdaca9e1b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iow), com.p314xaae8f345.mm.R.C30861xcebc809e.f78121x77ac3fa);
        yj0.a.i(true, this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutMicroMsgUI$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
