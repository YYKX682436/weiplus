package lx4;

/* loaded from: classes8.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hx4.x f403654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2419x8ff2b28.p2420x373aa5.C19353x4337a0ac f403655e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f403656f;

    public d(hx4.x xVar, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2419x8ff2b28.p2420x373aa5.C19353x4337a0ac c19353x4337a0ac, int i17) {
        this.f403654d = xVar;
        this.f403655e = c19353x4337a0ac;
        this.f403656f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2419x8ff2b28.p2420x373aa5.C19353x4337a0ac c19353x4337a0ac;
        ix4.a aVar;
        android.content.pm.ActivityInfo activityInfo;
        android.content.pm.ActivityInfo activityInfo2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserChooseDialogView$BrowserItemAdapter$updateDisplayIcon$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hx4.x xVar = this.f403654d;
        if (xVar.f367234b != null && (aVar = (c19353x4337a0ac = this.f403655e).f265541n) != null) {
            lx4.a aVar2 = c19353x4337a0ac.f265540m;
            hx4.d dVar = (hx4.d) aVar;
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Integer.valueOf(aVar2 != null ? aVar2.hashCode() : 0);
            android.content.pm.ResolveInfo resolveInfo = xVar.f367234b;
            objArr[1] = (resolveInfo == null || (activityInfo2 = resolveInfo.activityInfo) == null) ? null : activityInfo2.packageName;
            objArr[2] = (resolveInfo == null || (activityInfo = resolveInfo.activityInfo) == null) ? null : activityInfo.name;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrowserChooseController", "BrowserDialog onBrowserItemClick dialog: %s, packageName: %s, targetActivity: %s", objArr);
            hx4.p pVar = dVar.f367198a;
            if (aVar2 != null) {
                aVar2.setOnDismissListener(new hx4.a(pVar));
            }
            if (aVar2 != null) {
                aVar2.dismiss();
            }
            hx4.r.e(((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2419x8ff2b28.ActivityC19352x791af613) pVar.f367215a).mo55332x76847179(), (android.content.Intent) ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2419x8ff2b28.ActivityC19352x791af613) pVar.f367215a).getIntent().getParcelableExtra("targetintent"), xVar.f367234b);
            long j17 = pVar.f367216b;
            int i17 = pVar.f367218d;
            android.content.pm.ResolveInfo resolveInfo2 = xVar.f367234b;
            if (resolveInfo2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.Object[] objArr2 = new java.lang.Object[6];
                objArr2[0] = 2;
                objArr2[1] = java.lang.Integer.valueOf(this.f403656f);
                objArr2[2] = 0;
                android.content.pm.ActivityInfo activityInfo3 = resolveInfo2.activityInfo;
                java.lang.String str = activityInfo3 != null ? activityInfo3.packageName : null;
                if (str == null) {
                    str = "";
                }
                objArr2[3] = str;
                objArr2[4] = java.lang.Integer.valueOf(i17);
                objArr2[5] = java.lang.Long.valueOf(j17);
                g0Var.d(21454, objArr2);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserChooseDialogView$BrowserItemAdapter$updateDisplayIcon$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
