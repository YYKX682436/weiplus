package com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui;

/* loaded from: classes11.dex */
public class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.ActivityC19503x99c967c5 f269538d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.ActivityC19503x99c967c5 activityC19503x99c967c5) {
        this.f269538d = activityC19503x99c967c5;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webwx/ui/ExtDeviceWXLoginUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.ActivityC19503x99c967c5 activityC19503x99c967c5 = this.f269538d;
        if (activityC19503x99c967c5.A.isChecked()) {
            activityC19503x99c967c5.A.setChecked(!r9.isChecked());
        } else {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC19503x99c967c5.mo55332x76847179();
            java.lang.String str = activityC19503x99c967c5.f269496f;
            java.lang.String string = activityC19503x99c967c5.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l7p);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str != null) {
                string = str;
            }
            db5.e1.A(mo55332x76847179, string, activityC19503x99c967c5.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l7r), activityC19503x99c967c5.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l7q), activityC19503x99c967c5.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.d(this), new com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.e(this));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webwx/ui/ExtDeviceWXLoginUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
