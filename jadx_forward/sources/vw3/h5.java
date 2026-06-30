package vw3;

/* loaded from: classes3.dex */
public final class h5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerSdkCgiReportUI f522513d;

    public h5(com.tencent.mm.plugin.repairer.ui.RepairerSdkCgiReportUI repairerSdkCgiReportUI) {
        this.f522513d = repairerSdkCgiReportUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerSdkCgiReportUI$setupListeners$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.repairer.ui.RepairerSdkCgiReportUI.U6(this.f522513d, 10, 10);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerSdkCgiReportUI$setupListeners$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
