package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7;

/* loaded from: classes12.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.performance.diagnostic.DiagnosticSettingsUI f234477d;

    public n(com.tencent.mm.plugin.performance.diagnostic.DiagnosticSettingsUI diagnosticSettingsUI) {
        this.f234477d = diagnosticSettingsUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/performance/diagnostic/DiagnosticSettingsUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (ih.d.d().b("OpenglLeak") != null) {
            yj0.a.h(this, "com/tencent/mm/plugin/performance/diagnostic/DiagnosticSettingsUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        li.d dVar = new li.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p578x30f523.C4700x74d81a92.m41159x9cf0d20b().m41206xc6dcb58(true);
        com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p578x30f523.C4700x74d81a92.m41159x9cf0d20b().m41208x68925183(true);
        dVar.c((android.app.Application) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, new com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.l(this));
        dVar.e();
        ih.d.d().f373003a.add(dVar);
        ni.i iVar = new ni.i(900000L);
        iVar.f418714g = new com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.m(this);
        iVar.a((android.app.Application) this.f234477d.getApplicationContext());
        yj0.a.h(this, "com/tencent/mm/plugin/performance/diagnostic/DiagnosticSettingsUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
