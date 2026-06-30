package lx4;

/* loaded from: classes8.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2419x8ff2b28.p2420x373aa5.C19355x505bfc55 f403688d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2419x8ff2b28.p2420x373aa5.C19355x505bfc55 c19355x505bfc55) {
        this.f403688d = c19355x505bfc55;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserSettingDialogView$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2419x8ff2b28.p2420x373aa5.C19355x505bfc55 c19355x505bfc55 = this.f403688d;
        ix4.b bVar = c19355x505bfc55.f265550m;
        if (bVar != null) {
            lx4.a aVar = c19355x505bfc55.f265549i;
            hx4.g gVar = (hx4.g) bVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrowserChooseController", "BrowserSettingDialog onCancelClick");
            if (aVar != null) {
                aVar.setOnDismissListener(new hx4.e(gVar.f367204c));
            }
            if (aVar != null) {
                aVar.dismiss();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserSettingDialogView$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
