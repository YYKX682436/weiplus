package lx4;

/* loaded from: classes8.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2419x8ff2b28.p2420x373aa5.C19353x4337a0ac f403668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f403669e;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2419x8ff2b28.p2420x373aa5.C19353x4337a0ac c19353x4337a0ac, android.view.View view) {
        this.f403668d = c19353x4337a0ac;
        this.f403669e = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserChooseDialogView$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2419x8ff2b28.p2420x373aa5.C19353x4337a0ac c19353x4337a0ac = this.f403668d;
        ix4.a aVar = c19353x4337a0ac.f265541n;
        if (aVar != null) {
            lx4.a aVar2 = c19353x4337a0ac.f265540m;
            hx4.d dVar = (hx4.d) aVar;
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Integer.valueOf(aVar2 != null ? aVar2.hashCode() : 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrowserChooseController", "BrowserDialog onMoreClick dialog: %s", objArr);
            hx4.p pVar = dVar.f367198a;
            if (aVar2 != null) {
                aVar2.setOnDismissListener(new hx4.c(pVar));
            }
            if (aVar2 != null) {
                aVar2.dismiss();
            }
            hx4.s.a(pVar.f367216b, 3, pVar.f367218d);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserChooseDialogView$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
