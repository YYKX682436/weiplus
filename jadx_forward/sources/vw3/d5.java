package vw3;

/* loaded from: classes15.dex */
public final class d5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerSdkCgiReportUI f522461d;

    public d5(com.tencent.mm.plugin.repairer.ui.RepairerSdkCgiReportUI repairerSdkCgiReportUI) {
        this.f522461d = repairerSdkCgiReportUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerSdkCgiReportUI$setupListeners$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.repairer.ui.RepairerSdkCgiReportUI.r;
        this.f522461d.getClass();
        try {
            java.lang.String i18 = com.p314xaae8f345.mm.vfs.w6.i(com.p314xaae8f345.mm.vfs.q7.c("sdk_data_report"), false);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.h hVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.h.f298139c;
            if (hVar.b(i18)) {
                hVar.a(3);
                hVar.g("onIdKeyReport", vw3.x4.f522713a);
                hVar.h("onKVReport", vw3.y4.f522727a);
                hVar.f(true, vw3.z4.f522740a);
            }
        } catch (java.lang.Exception unused) {
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerSdkCgiReportUI$setupListeners$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
