package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes.dex */
public class ca implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f242435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f242436e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f242437f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.da f242438g;

    public ca(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.da daVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, int i17, int i18) {
        this.f242438g = daVar;
        this.f242435d = m1Var;
        this.f242436e = i17;
        this.f242437f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.da daVar = this.f242438g;
        android.app.ProgressDialog progressDialog = daVar.f242471d.f241905e;
        if (progressDialog != null) {
            progressDialog.dismiss();
            daVar.f242471d.f241905e = null;
        }
        daVar.f242471d.f241913p = null;
        if (this.f242435d.mo808xfb85f7b0() == 255) {
            boolean z17 = (this.f242436e == -3 && this.f242437f == 4) ? false : true;
            android.content.Intent intent = new android.content.Intent(daVar.f242471d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17412x566ebe5e.class);
            intent.putExtra("has_pwd", z17);
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17418xdb0644c5 activityC17418xdb0644c5 = daVar.f242471d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC17418xdb0644c5, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsCreateAliasUI$5$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC17418xdb0644c5.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityC17418xdb0644c5, "com/tencent/mm/plugin/setting/ui/setting/SettingsCreateAliasUI$5$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            daVar.f242471d.finish();
        }
    }
}
